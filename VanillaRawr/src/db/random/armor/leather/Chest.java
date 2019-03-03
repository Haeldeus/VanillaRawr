package db.random.armor.leather;

import java.util.ArrayList;

import util.MultiBonus;

public class Chest {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    10264, 9854, 9782, 6552, 7527, 9950, 15130, 6603, 15311, 15144, 15195, 15304, 9757, 
    15356, 9887, 15164, 7407, 15390, 15018, 10151, 10220, 15159, 15346, 15433, 6268, 15170, 
    15179, 15010, 15381, 7477, 10070, 15118, 15128, 9835, 6584, 7439, 9809, 15442, 10182, 
    9924, 15359, 10105, 8211, 15376, 15337
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
    System.out.println(list.size() + "/" + ids.length);
  }
    
  public static void main(String[] args) {
    fill();
  }
}
