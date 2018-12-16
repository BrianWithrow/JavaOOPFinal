/**
 * Name: Brian Withrow Description: Class to create files and directories with Employee and Products
 * info. Date: 12/14/2018
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class ProcessFiles {

  //Three fields Oracle wants to provide for the class:
  private Path path;
  private Path path2;
  private Path path3;

  /**
   * Item created that accepts an arraylist to start processing files.
   *
   * @param products takes in the array
   * @throws IOException throws an out of bound exception.
   */
  public ProcessFiles(ArrayList<Product> products) throws IOException {
    createDirectory();
    writeFile(products);

  }

  //The item created that will accept employee information.
  public ProcessFiles(EmployeeInfo employee) throws IOException {
    createDirectory();
    writeFile(employee);
  }

  //Method to create a directory so that we can store a result of a "test" for our products.
  private void createDirectory() {
    //This creation will only work the first time, or if the directory is changed/moved.
    File directory = new File("c://LineTests");
    path = Paths.get(directory.getPath());
    boolean directoryMade = false;

    //Attempts to make the directory, catches exceptions.
    try {
      directoryMade = directory.mkdir();
    } catch (SecurityException se) {
      System.out.println("Error while creating directory in Java:" + se);
    }

    //If the flag was created, it'll let you know!
    if (directoryMade) {
      System.out.println("Directory created successfully.");
    } else { //Otherwise, it lets you know we already have the directory.
      System.out.println("Directory \"C://LineTests\" already exists.");
    }
  }


  /*For both of the following methods, a file and directory will be made if they do not
  Already exits. The directory will be created at the root of the C drive and be named LineTests(p)
  The file itself is going to be named TestResults.txt(p2) and will be created with that directory.
  The p3 field will be used to store the resolved path combining path 1 and 2!
  Method to Write a file! This one accepts the employee info.*/

  /**
   * Writes a file by using a created directory to add a text file/edit it.
   * @param emp Employee info to write in
   * @throws IOException Throws out of bounds exception
   */
  public void writeFile(EmployeeInfo emp) throws IOException {
    boolean directoryMade = false;
    File writeEmployeeText = new File("c://LineTests/TestResults.txt");
    final FileWriter fW = new FileWriter(writeEmployeeText, true);
    path2 = Paths.get("TestResults.txt");
    path3 = path.resolve(path2);

    try {
      directoryMade = writeEmployeeText.createNewFile();
    } catch (IOException ioe) {
      System.out.println("Problem with creating your file." + ioe);
    }
    //Getting here means the file gets created!
    System.out.println("Your information has been saved to: " + writeEmployeeText.getPath());

    //For quality of life, Im going to make it space out the toStrings properly.
    String updatedToString = emp.toString().replaceAll("\n", System.lineSeparator());
    fW.write(updatedToString);
    fW.write(System.lineSeparator());
    fW.write(System.lineSeparator());
    fW.close();
  }

  //Another method to write a file, but accepting the Arraylist.

  /**
   * Writes a file by using a created directory to add a text file/edit it.
   * @param products product array info to write in
   * @throws IOException Throws out of bounds exception
   */
  public void writeFile(ArrayList<Product> products) throws IOException {
    boolean directoryMade = false;
    File writeProductText = new File("c://LineTests/TestResults.txt");
    final FileWriter fW = new FileWriter(writeProductText, true);
    path2 = Paths.get("TestResults.txt");
    path3 = path.resolve(path2);

    try {
      directoryMade = writeProductText.createNewFile();
    } catch (IOException ioe) {
      System.out.println("Problem with creating your file." + ioe);
    }

    //Similarly I'm going to make the toString space here as well.
    String updatedToString = products.toString().replaceAll("\n", System.lineSeparator());
    //Getting here means the file gets created!
    System.out.println("Your information has been saved to: " + writeProductText.getPath());

    fW.write(updatedToString);
    fW.write(System.lineSeparator());
    fW.write(System.lineSeparator());
    fW.close();
  }
}
