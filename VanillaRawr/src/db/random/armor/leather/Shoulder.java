package db.random.armor.leather;

import java.util.ArrayList;

import util.MultiBonus;

public class Shoulder {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    20689, 10783, 10263, 9863, 7532, 9955, 15140, 7415, 15150, 15693, 15357, 9894, 15169, 
    7408, 15395, 10153, 10228, 15158, 15345, 15432, 15177, 15187, 15386, 7482, 9389, 10075, 
    15116, 15127, 9834, 7445, 9807, 15441, 10189, 9923, 15368, 10113, 8210, 15375, 15338 
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
