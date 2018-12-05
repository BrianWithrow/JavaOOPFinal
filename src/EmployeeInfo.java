/**
 * Name: Brian Withrow
 * Description: Class worked with Vanselow to create an employee acct.
 * Date: 11/2/2018
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {
    StringBuilder name = new StringBuilder();
    String code;
    String deptId;
    Pattern p = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");
    Scanner scanner = new Scanner(System.in);

    //This code triggers setting the name and employee code, both private methods.
    public EmployeeInfo() {
        setName();
    }

    //
    public StringBuilder getName(){
       return name;
    }

    public String getCode(){
        return code;
    }

    private void setName(){
        String nameString = inputName();
        //Stringbuilder accepts a string as a parameter
        name = new StringBuilder(nameString);
        createEmployeeCode(name);
    }

    private void createEmployeeCode(StringBuilder name){
        if (checkName(name)) {
            code = name.charAt(0) + name.substring(name.indexOf(" "));
        }
        else{
            code = "guest";
        }
    }

    private String inputName(){
        System.out.println("Please enter your first and last name: ");
        String nameString = scanner.nextLine();
        return nameString;
    }

    private boolean checkName(StringBuilder name){
        if (name.indexOf(" ") != -1){   // This checks if there is an existance of " " in the string.
            return true;
        }
        else{
            return false;
        }
    }

    public String getDeptId() {
        return deptId;
    }

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

    private String getId(){
        if (validId(this.deptId)) {
            return deptId;
        }
        else
        {
            return "None01";
        }
    }

    private boolean validId(String id) {
        //Martin suggested using Matcher for the check, wicked easy.
        Matcher matcher = p.matcher(this.deptId);
        return matcher.matches();
    }

    public String toString() {
        return "Code: " + code
                + "\n Dept Id: " + deptId;
    }
}
