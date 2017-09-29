package db.random.armor.mail;

import java.util.ArrayList;

import util.MultiBonus;

public class Feet {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    20656, 15599, 10786, 10409, 6590, 15489, 15614, 9926, 7490, 7542, 10192, 6573, 10234, 
    15630, 9810, 15506, 15626, 15658, 15642, 9895, 7458, 10082, 15674, 15565, 10270, 15694, 
    10155, 10119, 15498, 7417, 15555, 9784, 9864, 15525, 6551, 15576, 15516, 15589, 15544, 
    15678, 9962, 15534
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
