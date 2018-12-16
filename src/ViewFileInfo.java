import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Name: Brian Withrow Description: Driver class to test out my Process Files class, and read the
 * text file. Date: 12/15/2018
 */

public class ViewFileInfo {

  /**
   * Driver to test out our ProcessFiles functionality only.
   * @param args Mandatory args.
   */
  public static void main(String[] args) {

    try {
      File textFile = new File("c://LineTests/TestResults.txt");
      BufferedReader textReader = new BufferedReader(new FileReader(textFile));

      String textConvert;
      //Nifty trick from: https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
      //To convert the text, we read each line, and print until we run out of text file to read.
      while ((textConvert = textReader.readLine()) != null) {
        System.out.println(textConvert);
      }
    } catch (FileNotFoundException e) {
      System.out.println("Problem with creating your file: " + e);
    } catch (IOException e) {
      System.out.println("Problem with reading your file: " + e);
    }
  }
}
