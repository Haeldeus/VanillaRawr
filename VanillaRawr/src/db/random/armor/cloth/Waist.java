package db.random.armor.cloth;

import java.util.ArrayList;

import util.MultiBonus;

public class Waist {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    9945, 14113, 20664, 14289, 14258, 14304, 14173, 14309, 9853, 10103, 14245, 10404, 10066, 
    7370, 10216, 14235, 14337, 14276, 14217, 7526, 9766, 10144, 9799, 14255, 10255, 10180, 
    14286, 14164, 14194, 7476, 14327, 14131, 9906, 6611, 6570, 9875, 14205, 7438, 14209, 
    14185, 6539, 
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
    System.out.println("Cloth Waist: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  public static void main(String[] args) {
    fill();
  }
}
