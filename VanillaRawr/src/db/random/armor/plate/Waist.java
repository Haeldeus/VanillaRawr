package db.random.armor.plate;

import java.util.ArrayList;

import util.MultiBonus;

public class Waist {

  private static int[] ids = {
    18529, 20673, 10788, 14950, 14906, 10381, 9968, 10278, 14977, 9288, 14968, 10088, 10243, 
    14934, 14960, 10387, 14918, 14927, 10206, 10130, 14898, 10166, 14943
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
    System.out.println("Plate Waists: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  public static void main(String[] args) {
    fill();
  }
}
