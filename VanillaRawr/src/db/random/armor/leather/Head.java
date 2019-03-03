package db.random.armor.leather;

import java.util.ArrayList;

import util.MultiBonus;

public class Head {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    12960, 10261, 9859, 7529, 9953, 15134, 15146, 15193, 15353, 9889, 15167, 7413, 15391, 
    10150, 10226, 15156, 15339, 15430, 15175, 15185, 15384, 7479, 10073, 15129, 10406, 7441, 
    15439, 10187, 9921, 15363, 10111, 8214, 15373
  };
  
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
    System.out.println("Leather Heads: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  public static void main(String[] args) {
    fill();
  }
}
