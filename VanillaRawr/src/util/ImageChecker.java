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
    String[] tmp = DatabaseConnecter.getAllIcons();
    for (String s : tmp) {
      images.put(s, false);
      //imageStrings = tmp;
    }
  }
  
  /**
   * The Main-Method to run the Check.
   * @param args  Unused.
   * @since 1.0
   */
  public static void main(String[] args) {
    getImages();
    Set<String> keys = images.keySet();
    int i = 0;
    for (String s : keys) {
      if (images.get(s) == false) {
        String tmp = s.toLowerCase();
        try {
          new ImageIcon(ImageChecker.class.getResource("/resources/" + tmp + ".jpg"));
          i++;
          images.put(s, true);
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
