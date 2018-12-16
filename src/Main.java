import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Name: Brian Withrow Description: Main class used for testing and execution of the project. Date:
 * 9/29/2018
 */

public class Main {

  public static void main(String[] args) throws IOException {

    //Here I am creating Widgets for testing. Reccomended by Professor for test code.
    //Widget w1 = new Widget("Widget ");
    //System.out.println(w1.toString());

    //Tests for step 6's driver class step.
    //w1.play();
    //w1.stop();
    //w1.next();
    //w1.previous();

    //I am going to use the Monitor to test the Screen class (Step 10).
    //It looks as if I'm going to put in some general data so there are no errors.
    //Gets are functional, so is toString.
    //Monitor Sceptre = new Monitor();
    //System.out.println(Sceptre.getRefreshRate());
    //System.out.println(Sceptre.getResolution());
    //System.out.println(Sceptre.getResponseTime());
    //System.out.println(Sceptre.toString());

    //Testing for step 12, creating a movie player to test out our steps.
    //MoviePlayer carDVD = new MoviePlayer("Honda Movie Player");
    //carDVD.play();
    //carDVD.next();
    //System.out.println(carDVD.toString());
    //Of note, screen and monitor are null because we only added fields with no values.

    //For Step 13, I am showcasing the functionality that any object implementing multimediacontrol
    //Will be able to use its methods.
    //UniversalRemote controller = new UniversalRemote();
    //controller.play();
    //controller.next();
    //controller.stop();
    //controller.previous();
    //Look Ma, no errors!

    //This helps me make sure that all of my enums are correctly set up!
    //for (ItemType it : ItemType.values()){
    //    System.out.println(it + " " + it.code);
    //}

    //At this point I will be creating the test demonstration for
    //part 15 of the collection and sort.
    //Widget w2 = new Widget("Toy ");
    //Widget w3 = new Widget("Microphone ");
    //Widget w4 = new Widget("Headphones ");

    //Product.nameSort();
    // Output: Headphones, Microphone, Toy, Widget.

    // Write one line of code to create an ArrayList of products
    ArrayList products = new ArrayList();
    // Write one line of code to call testCollection and assign the result to the ArrayList
    products = testCollection();
    // Write one line of code to sort the ArrayList
    Collections.sort(products);
    // Call the print method on the ArrayList
    print(products);

    EmployeeInfo steveJobs = new EmployeeInfo();
    ProcessFiles filer = new ProcessFiles(products);
    ProcessFiles filerEmployee = new ProcessFiles(steveJobs);
  }

  // Step 15
  // Complete the header for the testCollection method here

  public static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList products = new ArrayList();
    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Step 16
  // Create print method here.
  public static <Generic> void print(ArrayList<Generic> display) {
    for (Generic product : display) {
      System.out.println(product);
    }
    //System.out.println(display);
  }

  //For step 13, I am forced to create a class to show how Multimedia's
  //methods are forced into the class, and will be free to use when implemented.
  class UniversalRemote implements MultimediaControl {

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void previous() {

    }

    @Override
    public void next() {

    }
  }
}