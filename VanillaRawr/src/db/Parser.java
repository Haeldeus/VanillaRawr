package db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import util.DatabaseConnecter;

public class Parser {
  
  String path;
  String pathToSave;
  
  public Parser(String path, String pathToSave) {
    this.path = path;
    this.pathToSave = pathToSave;
  }
  
  public void parse() {
//    int[] ids = DatabaseConnecter.getAllIDs();
    int [] ids = {25, 13314, 19019};
    for (int id : ids) {
      try {
        ArrayList<String> tokens = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader(path + File.separator + id + ".txt"));
        String text = br.readLine();
        text = text.trim();
        System.out.println(text);
        int index = 0;
        while (index != -1) {
          index = text.indexOf("  ");
          String firstText = "";
          if (index != -1) {
            firstText = text.substring(0, index);
            text = text.substring(index);
            text = text.trim();
          } else {
            firstText = text;
          }
          tokens.add(firstText);
        }
        System.out.println(tokens.size());
        br.close();
      } catch (FileNotFoundException e) {
        System.err.println("There was an Error in finding the ID " + id 
            + ". Possible Solutions: a) " + "Is the given path correct? (" + path 
            + "). b) Check, if this is a valid ID. " + "c) Rerun Downloader and ItemResizer.");
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void main(String[] args) {
    String writePath = "C:" + File.separator + "Users" + File.separator + "Frederic" 
        + File.separator + "Desktop" + File.separator + "Items" + File.separator + "Shortened";
    Parser p = new Parser(writePath,"");
    p.parse();
  }
}
