import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Name: Brian Withrow Description: Main class used for testing and execution of the project. Date:
 * 9/29/2018
 */

public class Main {

  // I made a products list global to be shared throughout my main for convenience.
  private static ArrayList products = new ArrayList();

  public static void main(String[] args) throws IOException {
    //For user input, we bring back handy scanner!
    Scanner scan = new Scanner(System.in);
    boolean userContinues = true;
    String choice;

    /**
     * All of the following left-in code is my non-testing samples.
     * Commented out blocks are my tests for early functionality.
     */

    // Write one line of code to call testCollection and assign the result to the ArrayList
    //products = testCollection();
    // Write one line of code to sort the ArrayList
    //Collections.sort(products);
    // Call the print method on the ArrayList
    //print(products);

    //The following code runs to greet my users.
    System.out.println("Hello, and welcome to Brian's Product Factory!"
        + "\nHere you can add product(s) to a list, press enter if you understand.");
    scan.nextLine();

    /**
     * This block of code here is to indicate the importance of the while loop.
     * This while loop is going to contain my user-interface ideas for presenting my project.
     * The user will be prompted to enter the correct number to move forward!
     */
    while (userContinues) {
      System.out.println("Press the corresponding action to take."
          + "\n1 Add a product"
          + "\n2 Print products list"
          + "\n3 How many things do I have?"
          + "\n4 I would like to quit.");

      choice = scan.next();

      //Goes to add product function.
      if (choice.equals("1")) {
        addProducts();
      } else if (choice.equals("2")) { //Prints your whole collection.
        if (products.isEmpty()) {
          System.out.println("Your list appears to be empty!");
        } else {
          print(products);
        }
      } else if (choice.equals("3")) { //Checks how many things you have.
        howMany();
      } else if (choice.equals("4")) { //Quits if you don't want to do anything anymore.
        userContinues = false;
      } else { //Incase the input is bad. Will change later.
        System.out.println("Sorry, we dont recognize that answer."
            + "\nPlease try again, only pressing enter after the one number.");
      }
    }

    System.out.println("Thank you for visiting Brian's Product Factory!");
    /*EmployeeInfo steveJobs = new EmployeeInfo();
    ProcessFiles filer = new ProcessFiles(products);
    ProcessFiles filerEmployee = new ProcessFiles(steveJobs);*/

    /*Tests for step 6's driver class step.
    w1.play();
    w1.stop();
    w1.next();
    w1.previous();
    Testing for step 12, creating a movie player to test out our steps.
    MoviePlayer carDVD = new MoviePlayer("Honda Movie Player");
    carDVD.play();
    carDVD.next();
    System.out.println(carDVD.toString());
    Of note, screen and monitor are null because we only added fields with no values.
    For Step 13, I am showcasing the functionality that any object implementing multimediacontrol
    Will be able to use its methods.
    UniversalRemote controller = new UniversalRemote();
    controller.play();
    controller.next();
    controller.stop();
    controller.previous();
    Look Ma, no errors!
    At this point I will be creating the test demonstration for
    part 15 of the collection and sort.
    Widget w2 = new Widget("Toy ");
    Widget w3 = new Widget("Microphone ");
    Widget w4 = new Widget("Headphones ");*/
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

  public static void addProducts() {
    //For user input, we bring back handy scanner!
    Scanner scan = new Scanner(System.in);
    boolean userContinues = true;
    String choice;
    String productName;
    String audioType;
    String screenResolution;
    int screenRefreshRate = 0;
    int screenResponseTime = 0;
    boolean badInput = true;
    int inputMultiple = 0;

    System.out.println("What product would you like to add to the cart?");

    while (userContinues) {
      System.out.println("1 Audio Player"
          + "\n2 Monitor"
          + "\n3 Movie Player"
          + "\n4 Quit"
          + "\n5 Display list ");
      choice = scan.next();

      //Creates an Audio Player.
      if (choice.equals("1")) {
        System.out.println("Create:"
            + "\n1 Generic"
            + "\n2 Specialized");
        choice = scan.next();
        if (choice.equals("1")) {
          System.out.println("How many?");
          inputMultiple = scan.nextInt();
          if (inputMultiple > 0) {
            for (; inputMultiple > 0; inputMultiple--) {
              AudioPlayer a = new AudioPlayer("mp3", "mp3");
              products.add(a);
            }
            System.out.println("Products added.");
          } else if (inputMultiple < 0) {      //Incase the input is bad. Will change later.
            System.out.println("Sorry, we dont recognize that answer."
                + "\nPlease try again, only pressing enter after the one number.");
          }
        } else if (choice.equals("2")) {
          System.out.println("Please input your product name.");
          productName = scan.next();
          System.out.println("Please input the Audio Specification.");
          audioType = scan.next();
          AudioPlayer a = new AudioPlayer(productName, audioType);
          System.out.println("Product added.");
        } else {
          System.out.println("Sorry, we dont recognize that answer."
              + "\nPlease try again, only pressing enter after the one number.");
        }
      } else if (choice.equals("2")) { //Creates a Monitor.
        System.out.println("Create:"
            + "\n1 Generic"
            + "\n2 Specialized");
        choice = scan
            .next(); // The choice lets you input a generic monitor, or one with your input.
        if (choice.equals("1")) {
          System.out.println("How many?");
          inputMultiple = scan.nextInt();
          if (inputMultiple > 0) {
            for (; inputMultiple > 0; inputMultiple--) {
              Screen monitor = new Screen("1366x768", 40, 22);
              products.add(monitor);
            }
            System.out.println("Products added.");
          } else if (inputMultiple < 0) {      //Incase the input is bad. Will change later.
            System.out.println("Sorry, we dont recognize that answer."
                + "\nPlease try again, only pressing enter after the one number.");
          }
        } else if (choice.equals("2")) {
          System.out.println("Please input your monitor's resolution.");
          screenResolution = scan.next();
          System.out.println("Please input the monitor's Refresh Rate (Only a number).");
          screenRefreshRate = scan.nextInt();
          System.out.println("Please input your monitor's Response Time (Only a number).");
          screenResponseTime = scan.nextInt();
          Screen monitor = new Screen(screenResolution, screenRefreshRate, screenResponseTime);
          products.add(monitor);
          System.out.println("Product added.");
        } else {
          System.out.println("Sorry, we dont recognize that answer."
              + "\nPlease try again, only pressing enter after the one number.");
        }
      } else if (choice.equals("3")) { //Creates a Movie Player
        System.out.println("Create:"
            + "\n1 Generic"
            + "\n2 Specialized");
        choice = scan.next();
        if (choice.equals("1")) {
          System.out.println("How many?");
          inputMultiple = scan.nextInt();
          if (inputMultiple > 0) {
            for (; inputMultiple > 0; inputMultiple--) {
              MoviePlayer m = new MoviePlayer("Player", new Screen("1366x768", 40, 22),
                  MonitorType.LED);
              products.add(m);
            }
            System.out.println("Products added.");
          } else if (inputMultiple < 0) {      //Incase the input is bad. Will change later.
            System.out.println("Sorry, we dont recognize that answer."
                + "\nPlease try again, only pressing enter after the one number.");
          }
        } else if (choice.equals("2")) {
          System.out.println("Please input your product name.");
          productName = scan.next();
          System.out.println("Please input your monitor's resolution.");
          screenResolution = scan.next();
          System.out.println("Please input the monitor's Refresh Rate (Only a number).");
          screenRefreshRate = scan.nextInt();
          System.out.println("Please input your monitor's Response Time (Only a number).");
          screenResponseTime = scan.nextInt();
          MoviePlayer m = new MoviePlayer("Player",
              new Screen(screenResolution, screenRefreshRate, screenResponseTime),
              MonitorType.LED);
          products.add(m);
          System.out.println("Product added.");
        } else {
          System.out.println("Sorry, we dont recognize that answer."
              + "\nPlease try again, only pressing enter after the one number.");
        }
      } else if (choice.equals("4")) {      //Ends the loop.
        userContinues = false;
      } else if (choice.equals("5")) {      //Program requires multiple places to check your list.
        print(products);
      } else {      //Incase the input is bad. Will change later.
        System.out.println("Sorry, we dont recognize that answer."
            + "\nPlease try again, only pressing enter after the one number.");
      }
    }
  }

  //This method is going to be a better way to be
  // called to find out how many Objects are in our list.
  public static void howMany() {
    Scanner scan = new Scanner(System.in);
    boolean userContinues = true;
    String choice;
    int objectCounter = 0;
    int audioCounter = 0;
    int monitorCounter = 0;
    int movieCounter = 0;

    if (!products.isEmpty()) {
      //Our handy counting for loop operates before the choices!
      for (Object a : products) {
        objectCounter++;
        if (a instanceof AudioPlayer) {
          audioCounter++;
        } else if (a instanceof Screen) {
          monitorCounter++;
        } else if (a instanceof MoviePlayer) {
          movieCounter++;
        } else {
          System.out.println("Non-Product in list?");
        }
      }

      while (userContinues) {
        System.out.println("What would you like to know?"
            + "\n1 How many objects in my list"
            + "\n2 How many Audio Players"
            + "\n3 How many Monitors"
            + "\n4 How many Movie Players"
            + "\n5 Display List"
            + "\n6 Quit");
        choice = scan.next();

        if (choice.equals("1")) {
          System.out.println("There are " + objectCounter + " things in your list.");
        } else if (choice.equals("2")) {
          System.out.println("There are " + audioCounter + " Audio Players in your list.");
        } else if (choice.equals("3")) {
          System.out.println("There are " + monitorCounter + " Screens in your list.");
        } else if (choice.equals("4")) {
          System.out.println("There are " + movieCounter + " Movie Players in your list.");
        } else if (choice.equals("5")) {
          print(products);
        } else if (choice.equals("6")) {
          userContinues = false;
        } else {      //Incase the input is bad. Will change later.
          System.out.println("Sorry, we dont recognize that answer."
              + "\nPlease try again, only pressing enter after the one number.");
        }
      }
    } else {
      System.out
          .println("Your list is empty, please add some products before using this function.");
    }
  }
}