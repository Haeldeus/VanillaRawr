package db.random.armor.other.misc;

import java.util.ArrayList;

import util.MultiBonus;

public class Offhand {

  private static int[] ids = {
    10796, 9944, 15971, 15985, 15987, 15969, 15982, 15986, 15912, 15918, 15939, 15980, 15932, 
    15935, 15936, 7609, 15940, 15979, 15989, 15983, 15978, 7557, 9769, 15941, 9800, 15981, 
    15942, 15938, 15970, 15984, 15974, 15975, 7555, 15988, 15972, 9914, 15934, 7558, 15933, 
    9882, 15976, 7556, 15977, 15973, 7554 
  };
  
  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  public static ArrayList<MultiBonus> getList() {
    if (list == null) {
      fill();
    }
    return list;
  }
    
  public static int[] getIDs() {
    return ids;
  }
    
  private static void fill() {
    list = new ArrayList<MultiBonus>();
    //  System.out.println(list.get(list.size() - 1));
    System.out.println("Offhands: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  public static void main(String[] args) {
    fill();
  }
}
