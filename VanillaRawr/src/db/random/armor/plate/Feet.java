package db.random.armor.plate;

import java.util.ArrayList;

import util.MultiBonus;

public class Feet {

  private static int[] ids = {
    20039, 20662, 14951, 14911, 10376, 9973, 10276, 14978, 9289, 14972, 10089, 10238, 14932, 
    14957, 10385, 14913, 14922, 10201, 9387, 10131, 14896, 10167, 14940
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
    System.out.println(list.size() + "/" + ids.length);
  }
    
  public static void main(String[] args) {
    fill();
  }
}
