package db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * A Class to resize the Info from the HTML-Pages to a format, that is useful for a Parser.
 * @author Haeldeus
 * @version 1.0
 */
public class ItemResizer {
  /**
   * A Tokenizer, that is used to search the HTML-Document for a Statement, after which 
   * the useful Info starts.
   */
  private String tokenizer = "<table><tr><td><table><tr><td>";
  
  /**
   * Resizes the Files of the given ID's to a more readable and smaller File.
   * @param ids The ID's of all Items, that will be resized.
   * @since 1.0
   */
  public void resize(int[] ids) {
    int counter = 0;
    for (int id : ids) {
      String path = "C:" + File.separator + "Users" + File.separator + "Frederic" + File.separator
          + "Desktop" + File.separator + "Items" + File.separator + id + ".html";
      
      String writePath = "C:" + File.separator + "Users" + File.separator + "Frederic" 
          + File.separator + "Desktop" + File.separator + "Items" + File.separator + "Shortened" 
          + File.separator + id + ".txt";

      try {
        File f = new File(path);
        BufferedReader br;
        br = new BufferedReader(new FileReader(f));
        
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
          if (line.contains(tokenizer)) {
            sb.append(line);
            sb.append(System.lineSeparator());
          }
          line = br.readLine();
        }
        String tmp = sb.toString();
        tmp = tmp.trim();
        
        int startIndex = tmp.indexOf("<");
        int endIndex = tmp.indexOf(">");
        while (startIndex != -1) {
          String toBeReplaced = tmp.substring(startIndex, endIndex + 1);
          tmp = tmp.replace(toBeReplaced, " ");
          startIndex = tmp.indexOf("<");
          endIndex = tmp.indexOf(">");
        }
        
        PrintWriter writer = new PrintWriter(writePath, "UTF-8");
        writer.println(tmp);
        writer.close();
        
        br.close();
      } catch (FileNotFoundException fnfe) {
        fnfe.printStackTrace();
      } catch (IOException ioe) {
        ioe.printStackTrace();
      }
      counter++;
      if (counter % 100 == 0) {
        System.out.println(counter + "/" + ids.length);
      }
    }
  }
  
  /**
   * The Main-Method to execute {@link #resize(int[])}.
   * @param args Unused.
   * @since 1.0
   */
  public static void main(String[] args) {
    int[] ids = util.DatabaseConnecter.getAllIDs();
    ItemResizer ir = new ItemResizer();
    ir.resize(ids);
  }
}
