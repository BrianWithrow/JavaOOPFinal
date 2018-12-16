/**
 * Name: Brian Withrow
 * Description: Class to describe the details of the Screen.
 * Date: 11/2/2018
 */

public class Screen implements ScreenSpec {

  //values for the Screen classs
  private String resolution;
  private int refreshRate;
  private int responseTime;

  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

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
    return "Resolution : " + resolution
        + "\nRefresh rate : " + refreshRate
        + "\nResponse time : " + responseTime;
  }
}
