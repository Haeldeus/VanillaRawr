package db.random.armor.leather;

import java.util.ArrayList;

import util.MultiBonus;

public class Hands {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    10777, 13258, 20661, 10260, 9861, 9780, 6554, 7530, 9952, 15137, 6605, 15310, 15149, 
    15192, 15355, 9892, 15166, 7412, 15393, 15016, 10149, 10225, 15155, 15343, 15429, 15174, 
    15184, 15383, 7480, 10072, 15115, 15125, 9832, 6586, 7443, 9806, 15438, 10186, 9920, 
    15365, 10110, 15372, 15334
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
