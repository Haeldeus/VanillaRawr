package db.random.armor.cloth;

import java.util.ArrayList;

import util.MultiBonus;

public class Head {
  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    22225, 10504, 9940, 14293, 14263, 14307, 14312, 9849, 10097, 14246, 10289, 10061, 7357, 
    10219, 14228, 14332, 14271, 14220, 7520, 10139, 14252, 10250, 10175, 14281, 14189, 7470, 
    14322, 9915, 10288, 9878, 14200, 7432, 14208, 14178, 
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
    System.out.println("Cloth Head: " + list.size() + "/" + ids.length);
  }
	    
  public static void main(String[] args) {
    fill();
  }
}
