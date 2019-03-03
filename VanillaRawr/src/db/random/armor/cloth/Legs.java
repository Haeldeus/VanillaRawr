package db.random.armor.cloth;

import java.util.ArrayList;

import util.MultiBonus;

public class Legs {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    20674, 9942, 14119, 14295, 14090, 14264, 14305, 14171, 14315, 9851, 10101, 14242, 6267, 
    9825, 10064, 7368, 10217, 14233, 14334, 14274, 14224, 7519, 9772, 10141, 9797, 14257, 
    10252, 10177, 14097, 14283, 14165, 14193, 7469, 14324, 14125, 9911, 6616, 6568, 9747, 
    9883, 14203, 7431, 14207, 14183, 6540, 
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
    System.out.println("Cloth Legs: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  public static void main(String[] args) {
    fill();
  }
}
