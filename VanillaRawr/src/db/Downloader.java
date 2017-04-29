package db;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class Downloader {

	private static void getPages(int[] ids) {
		URL url;
	    InputStream is = null;
	    BufferedReader br;
	    String line;
	    int counter = 0;
	    
	    for (int id : ids) {
	    	if (counter % 100 == 0)
	    		System.out.println(counter);
	    	
	    	try {
	    		Thread.sleep(100);
	    	} catch (Exception e) {e.printStackTrace();}
		    try {
		        url = new URL("http://db.vanillagaming.org/?item=" + id);
		        is = url.openStream();  // throws an IOException
		        br = new BufferedReader(new InputStreamReader(is));
	        	String path = "C:" + File.separator + "Users" + File.separator + "Frederic" + File.separator + "Desktop" + File.separator + "Items" + File.separator + id + ".html";
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
		            if (is != null) is.close();
		        } catch (IOException ioe) {
		            // nothing to see here
		        }
		    }
		    counter++;
	    }
	}
	
	public static void main(String[] args) {
		int[] ids = util.DatabaseConnecter.getAllIDs();
		getPages(ids);
	}
	
}
