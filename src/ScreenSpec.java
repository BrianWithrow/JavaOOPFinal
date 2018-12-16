/**
 * Name: Brian Withrow Description: Interface to be utilized by Screen, will force the methods into
 * the Screen class when implemented. Date: 11/2/2018
 */

public interface ScreenSpec {

  //Methods to be implemented
  String getResolution();

  int getRefreshRate();

  int getResponseTime();
}
