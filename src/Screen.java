/**
 * Name: Brian Withrow
 * Description: Class to describe the details of the Screen
 * Date: 11/2/2018
 */

public class Screen implements ScreenSpec {
    //values for the Screen classs
    String resolution = "Good";
    int refreshRate = 2;
    int responseTime = 2;


    //getters to access the values of the Screen class.
    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshRate;
    }

    @Override
    public int getResponseTime() {
        return responseTime;
    }

    @Override
    public String toString() {
        return "Resolution: " + resolution +
                "\nRefresh Rate: " + refreshRate +
                "\nResponse Time: " + responseTime;
    }
}
