/**
 * Name: Brian Withrow
 * Description: An enum to be used for storing additional types for implementation.
 * Date: 9/29/2018
 */

public enum ItemType {
    //All items will have a pre-set type. Curently there are 4 types.
    //Create an enum called ItemType that will store the following information.
    AUDIO("AU"),
    VISUAL("VI"),
    AUDIOMOBILE("AM"),
    VISUALMOBILE("VM");

    public final String code;
    ItemType(String parameter){
        this.code = parameter;
    }
}