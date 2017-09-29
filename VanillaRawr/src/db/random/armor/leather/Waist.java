package db.random.armor.leather;

import java.util.ArrayList;

import util.MultiBonus;

public class Waist {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    20667, 10259, 9855, 9775, 6558, 7535, 9947, 15136, 6600, 15308, 15148, 15191, 15349, 
    9891, 15161, 7406, 15388, 15011, 10145, 10221, 15154, 15347, 15428, 15178, 15180, 15378, 
    7485, 10067, 15110, 15120, 9827, 6581, 7448, 9801, 15434, 10190, 9916, 15361, 10109, 
    15369, 15329
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
