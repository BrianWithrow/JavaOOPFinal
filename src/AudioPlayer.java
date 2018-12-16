/**
 * Name: Brian Withrow Description: Class to capture the details of an audio player. Date:
 * 11/2/2018
 */

public class AudioPlayer extends Product implements MultimediaControl {

  //Two fields for the class to have.
  private String audioSpecification;
  private ItemType mediaType = ItemType.AUDIO;

  //Constructor that takes in parameters and calls its parent constructor with super.
  public AudioPlayer(String productName, String audioSpecification) {
    super(productName);
    this.audioSpecification = audioSpecification;
  }

  //Rather than have actual code, the methods will respond with prints to let us know it is working.
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
    System.out.println("Going to previous song");
  }

  @Override
  public void next() {
    System.out.println("Going to next song");
  }

  //A toString that provides the superclass tostring, and also rows for audio spec and type.
  @Override
  public String toString() {
    return super.toString()
        + "\nAudio Spec : " + audioSpecification
        + "\nType : " + mediaType;
  }
}
