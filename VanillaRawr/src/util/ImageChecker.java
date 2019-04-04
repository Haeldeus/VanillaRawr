package util;

import java.util.HashMap;
import java.util.Set;

import javax.swing.ImageIcon;

/**
 * A Class, that is used to check, if all Images for Items are available.
 * @author Haeldeus
 * @version 1.0
 */
public class ImageChecker {

  /**
   * The {@link HashMap}, that is used to check the Availability of Images. If a String is 
   * connected to a Boolean with the Value of {@code false}, it is not available and an error 
   * will be printed into the Console.
   */
  private static HashMap<String, Boolean> images = new HashMap<String, Boolean>();
  //private static String[] imageStrings;
  
  /**
   * Gets all Images from {@link DatabaseConnecter} and adds them to {@link #images}.
   * @since 1.0
   */
  private static void getImages() {
    String[] tmp = DatabaseConnecter.getAllIcons(); //Gets all ImageNames from the DB
    for (String s : tmp) {
      images.put(s, false);   //As long as the Image wasn't checked, we assume it's not available.
      //imageStrings = tmp;
    }
  }
  
  /**
   * The Main-Method to run the Check.
   * @param args  Unused.
   * @since 1.0
   */
  public static void main(String[] args) {
    getImages();    //Gets all ImageNames from the Database
    //The KeySet eliminates all duplicates in the HashMap and returns a consistent Set.
    Set<String> keys = images.keySet();
    int i = 0;  //Just a counter to check how many Images are still missing.
    for (String key : keys) { //Checks every Image in the HashMap
      if (images.get(key) == false) { //It's false, if it wasn't checked before.
        String tmp = key.toLowerCase(); //The images are stored in lower case Filenames.
        try {
          //If a new Icon can be created, the File exists
          new ImageIcon(ImageChecker.class.getResource("/resources/" + tmp + ".jpg"));
          //The Line before would have thrown an Exception if the File was missing, so we raise 
          //the counter.
          i++;  
          //The File exists, so we can put the Value on true, so it doesn't get checked again.
          images.put(key, true);
        } catch (Exception e) {
          System.out.println(tmp + " is missing");
          System.out.println(i + "/" + keys.size());
          return;
        }
      }
    }
    System.out.println("All Images are available");
  }
}
