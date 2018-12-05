/**
 * Name: Brian Withrow
 * Description: Class worked with Vanselow to create an employee acct.
 * Date: 11/2/2018
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {
    //All my variables set up here, including a scanner for the whole class *P19
    StringBuilder name = new StringBuilder();
    String code;
    String deptId;
    Pattern p = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");
    Scanner scanner = new Scanner(System.in);

    //This code triggers setting the name and employee code, both private methods.
    public EmployeeInfo() {
        setName();
        setDeptId();
    }

    //Getters and setters, generic.
    public StringBuilder getName(){
       return name;
    }
    public String getCode(){
        return code;
    }

    //This setter is important because it will call the employee code creator.
    private void setName(){
        String nameString = inputName();
        //Stringbuilder accepts a string as a parameter
        name = new StringBuilder(nameString);
        createEmployeeCode(name);
    }

    //This creator takes the employees name and creates a code based on first initial and last name.
    //Otherwise, guest.
    private void createEmployeeCode(StringBuilder name){
        if (checkName(name)) {
            code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
        }
        else{
            code = "guest";
        }
    }

    //Prompts user for a name, returns it.
    private String inputName(){
        System.out.println("Please enter your first and last name: ");
        String nameString = scanner.nextLine();
        return nameString;
    }

    //Checks to make sure there is a space in the name, otherwise alerting the call that
    //The input is not considered a name, as it doesnt have a space.
    private boolean checkName(StringBuilder name){
        if (name.indexOf(" ") != -1){   // This checks if there is an existance of " " in the string.
            return true;
        }
        else{
            return false;
        }
    }

    //Generic getter.
    public String getDeptId() {
        return deptId;
    }

    //Setter that will check to make sure a valid id is given (4 letters starting capital, two numbers)
    //If validID is false, auto generates None01 as the id.
    public void setDeptId() {
        String temp;
        temp = scanner.nextLine();
        if (validId(temp)){
            this.deptId = temp;
        }
        else{
            this.deptId = "None01";
        }
    }

    //Gets the ID, checks to make sure it's valid just incase.
    private String getId(){
        if (validId(this.deptId)) {
            return deptId;
        }
        else
        {
            return "None01";
        }
    }

    //Valid ID checker, making sure the input matches my regex up in the variables.
    private boolean validId(String id) {
        Matcher m = p.matcher(id);
       if (m.matches()){
           return true;
       }
       else{
           return false;
       }
    }

    //Generic tostring.
    public String toString() {
        return "Code: " + code
                + "\n Dept Id: " + deptId;
    }

    //Reverse string method to "encrypt" our id.
    //Not very safe if you ask me.
    public String reverseString(String id){
        String temp = "";
        for (int i = id.length(); i > 0; i--){
            temp = temp + id.charAt(i-1);
        }
        return id;
    }
}
