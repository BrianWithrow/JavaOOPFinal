/**
 * Name: Brian Withrow
 * Description: Item Interface to be implemented by the rest of the proj.
 * Date: 9/29/2018
 */

import java.util.Date;


public interface Item{

    //A constant called manufacturer that will set to OracleProduction
    public String manufacturer = "Oracle Production";

    //A method setProductionNumber that would have one integer parameter
    void setProductionNumber(int Setter);

    //A method setName that would have one String parameter
    void setName(String Setter);

    //A method getName that would return a String
    public String getName();

    //A method getManufactureDate that would return a Date
    public Date getManufactureDate();

    //A method getSerialNumber that would return an int
    public int getSerialNumber();



}