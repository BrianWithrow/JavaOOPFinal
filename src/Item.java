/**
 * Name: Brian Withrow Description: Item Interface to be implemented by the rest of the proj. Date:
 * 9/29/2018
 */

import java.util.Date;


public interface Item {

  //A constant called manufacturer that will set to OracleProduction
  String manufacturer = "Oracle Production";

  //A method setProductionNumber that would have one integer parameter
  void setProductionNumber(int setter);

  //A method setName that would have one String parameter
  void setName(String setter);

  //A method getName that would return a String
  String getName();

  //A method getManufactureDate that would return a Date
  Date getManufactureDate();

  //A method getSerialNumber that would return an int
  int getSerialNumber();


}