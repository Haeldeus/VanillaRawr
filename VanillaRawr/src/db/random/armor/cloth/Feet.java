package db.random.armor.cloth;

import java.util.ArrayList;

import util.MultiBonus;

public class Feet {
  
  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!
  
  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    18295, 9936, 14114, 20652, 14290, 14259, 14299, 14174, 14310, 9845, 10095, 14238, 9820, 
    10058, 7354, 10211, 14236, 14329, 14269, 14218, 7522, 9767, 10137, 9792, 14250, 10247, 
    10179, 14285, 14159, 14195, 7472, 14319, 14129, 9907, 6612, 6562, 9876, 14196, 7434, 
    14214, 14176, 6537
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
