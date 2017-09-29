package db.random.armor.plate;

import java.util.ArrayList;

import util.MultiBonus;

public class Shoulder {

  private static int[] ids = {
    20683, 14955, 14909, 10383, 9971, 10281, 14981, 9292, 14971, 10092, 10245, 14937, 14963, 
    10390, 14921, 14929, 10209, 10134, 14901, 10170, 14946
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
