/**
 * Name: Brian Withrow
 * Description: Class worked with Vanselow to create an employee acct.
 * Date: 11/2/2018
 */

import java.util.Scanner;

public class EmployeeInfo {
    StringBuilder name = new StringBuilder();
    String code;

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
        Scanner scanner = new Scanner(System.in);
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
}
