package db.random.armor.plate;

import java.util.ArrayList;

import util.MultiBonus;

public class Wrist {

  private static int[] ids = {
    20687, 11767, 14956, 14910, 10377, 9972, 10282, 14983, 9285, 14974, 10094, 10239, 14938, 
    14965, 10391, 14914, 14923, 10202, 10127, 14903, 10171, 14941
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
