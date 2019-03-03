package db.random.armor.plate;

import java.util.ArrayList;

import util.MultiBonus;

public class Legs {

  private static int[] ids = {
    20671, 14953, 14908, 10382, 9970, 10280, 14980, 9291, 14970, 10091, 10244, 14936, 14962, 
    10389, 14920, 14928, 10208, 10133, 14900, 10169, 14945
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
    System.out.println("Plate Legs: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  public static void main(String[] args) {
    fill();
  }
}
