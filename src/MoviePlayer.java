/**
 * Name: Brian Withrow Description: A class that extends Product, implements Multimedia Control.
 * It's a movie player! Something that's going to play movies. Date: 11/2/2018
 */

public class MoviePlayer extends Product implements MultimediaControl {

  //Fields for our movieplayer, a monitorType and screen.
  private Screen screen;
  private MonitorType monitor;

  /**
   * Constructor for my movie player. Will create the object.
   * @param productName The name of our movie player.
   * @param screen The screen that our movie player has.
   * @param monitor The monitortype refers to LED or LCD.
   */
  public MoviePlayer(String productName, Screen screen, MonitorType monitor) {
    super(productName);
    this.screen = screen;
    this.monitor = monitor;
  }

  //Functionality the same as the audioplayer! Changed for movie,
  // but will change when input to repl.it
  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Going to previous Movie");
  }

  @Override
  public void next() {
    System.out.println("Going to next Movie");
  }

  //toString, standard with super tostring included.
  @Override
  public String toString() {
    return super.toString() + "\nScreen : "
        + screen
        + "\nMonitor Type : " + monitor;
  }
}
