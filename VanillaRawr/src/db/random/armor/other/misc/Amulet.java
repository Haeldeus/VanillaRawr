package db.random.armor.other.misc;

import java.util.ArrayList;

import util.MultiBonus;

public class Amulet {

  private static int[] ids = {
    12044, 12028, 12019, 12043, 11946, 12040, 10299, 12036, 12029, 12022, 12030, 12046, 
    12031, 12034, 12042, 12035, 12032, 12048, 12026, 12025, 12047, 12045, 12023, 12020, 
    12039, 12024, 12027
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
