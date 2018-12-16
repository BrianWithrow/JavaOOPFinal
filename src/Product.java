/**
 * Name: Brian Withrow Description: Product abstract class to be used for storing values describing
 * our product. Date: 9/29/2018 (UPDATED 11/2/2018)
 */

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;


//Create an abstract type called Product that will implement the Item Interface.
abstract class Product implements Item, Comparable<Product> {

  //Product will have the following fields.
  private int serialNumber;
  private String manufacturer;
  private Date manufacturedOn;
  private String name;

  //In step 14 I'm asked to make a collection for all items,
  // I decided I would like to add an Arraylist.
  static List items = new ArrayList();

  //Add an integer class variable called currentProductionNumber.
  // This will store the next number to be
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

  //In step 15 we are asked to create a sort that works for all devices made in the project.
  //This is all best to do within Product, as all my other classes are children of it.
  public static void nameSort() {
    Collections.sort(items);
    //For testing purposes I created a print.
    //System.out.println(items);
  }

  public static void print() {
    System.out.println(items);
  }

  //constructor that sets the fields
  public Product(String productName) {
    manufacturer = "OracleProduction";
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    name = productName;
    //New date fixed by Vanselow's request
    manufacturedOn = new Date();
    items.add(productName);
  }

  //tostring method that will return:

  public String toString() {
    return "Manufacturer : " + manufacturer + "\nSerial Number : "
        + serialNumber + "\nDate : " + manufacturedOn + "\nName : " + name;
  }

  public int compareTo(Product prod1) {
    return this.name.compareTo(prod1.name);
  }
}