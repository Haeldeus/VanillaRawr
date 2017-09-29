package db.random.armor.leather;

import java.util.ArrayList;

import util.MultiBonus;

public class Feet {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    20658, 10257, 9856, 9776, 6557, 7531, 9948, 15131, 6601, 15305, 15142, 15189, 15350, 
    9885, 15162, 7409, 15389, 15012, 10146, 10222, 15152, 15341, 15426, 15171, 15181, 15379, 
    7481, 10068, 15111, 15121, 9828, 6582, 7444, 9802, 15435, 10183, 9917, 15362, 10106, 
    8213, 15370, 15330
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
