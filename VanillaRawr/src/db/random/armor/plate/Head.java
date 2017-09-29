package db.random.armor.plate;

import java.util.ArrayList;

import util.MultiBonus;

public class Head {

  private static int[] ids = {
    12952, 14952, 14907, 10379, 9969, 10279, 14979, 9290, 14969, 10090, 10241, 14935, 14961, 
    10388, 14919, 14925, 10207, 10132, 14899, 10168, 14944
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
