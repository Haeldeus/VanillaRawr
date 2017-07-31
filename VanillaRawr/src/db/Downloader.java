package db;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * A Class to download the Database Pages from 
 * <a href="db.vanillagaming.org/">Vanillagaming.org</a>, that contains Informations about the 
 * needed Items.
 * @author Haeldeus
 * @since 1.0
 */
public class Downloader {

  /**
   * Downloads all Pages, that are about Items, that this Database needs.
   * @param ids The ID's of all Items, or the Items to be downloaded.
   * @since 1.0
   */
  private static void getPages(int[] ids) {
    URL url;
    InputStream is = null;
    BufferedReader br;
    String line;
    int counter = 0;
    for (int id : ids) {
      if (counter % 100 == 0) {
        System.out.println(counter);
      }
      try {
        Thread.sleep(100);
      } catch (Exception e) {
        e.printStackTrace();
      }
      try {
        url = new URL("http://db.vanillagaming.org/?item=" + id);
        is = url.openStream();  // throws an IOException
        br = new BufferedReader(new InputStreamReader(is));
        String path = "C:" + File.separator + "Users" + File.separator + "Frederic" + File.separator
            + "Desktop" + File.separator + "Items" + File.separator + id + ".html";
        
        PrintWriter writer = new PrintWriter(path, "UTF-8");
        while ((line = br.readLine()) != null) {
          writer.println(line);
        }
        writer.close();
      } catch (MalformedURLException mue) {
        mue.printStackTrace();
      } catch (IOException ioe) {
        ioe.printStackTrace();
      } finally {
        try {
          if (is != null) {
            is.close();
          }
        } catch (IOException ioe) {
          // nothing to see here
        }
      }
      counter++;
    }
  }
  
  /**
   * The Main-Method to execute {@link #getPages(int[])}.
   * @param args Unused.
   * @since 1.0
   */
  public static void main(String[] args) {
    int[] ids = util.DatabaseConnecter.getAllIDs();
    getPages(ids);
  }
}
