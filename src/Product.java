/**
 * Name: Brian Withrow
 * Description: Product abstract class to be used for storing values describing our product.
 * Date: 9/29/2018 (UPDATED 11/2/2018)
 */

import java.lang.reflect.Type;
import java.util.Date;

//Create an abstract type called Product that will implement the Item Interface.
abstract class Product implements Item {

    //Product will have the following fields.
    private int serialNumber;
    private String manufacturer;
    private Date manufacturedOn;
    private String name;

    //Add an integer class variable called currentProductionNumber. This will store the next number to be
    //assigned to serialNumber.
    //Fixed by Vanselow's request to begin at 1
    static int currentProductionNumber = 1;

    //A method setProductionNumber that would have one integer parameter
    public void setProductionNumber(int setter) {
        serialNumber = setter;
    }

    //A method setName that would have one String parameter
    public void setName(String setter) {
        name = setter;
    }

    //A method getName that would return a String
    public String getName() {
        return name;
    }

    //A method getManufactureDate that would return a Date
    public Date getManufactureDate() {
        return manufacturedOn;
    }

    //A method getSerialNumber that would return an int
    public int getSerialNumber() {
        return serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public static void nameSort(){
        
    }
    //constructor that sets the fields
    public Product(String productName) {
        manufacturer = "OraclProduction";
        serialNumber = currentProductionNumber;
        currentProductionNumber++;
        name = productName;
        //New date fixed by Vanselow's request
        manufacturedOn = new Date();
    }

    //tostring method that will return:

    public String toString() {
        return "Manufacturer : " + manufacturer + "\nSerial Number: " +
                serialNumber + "\nDate: " + manufacturedOn + "\nName: " + name;
    }
}