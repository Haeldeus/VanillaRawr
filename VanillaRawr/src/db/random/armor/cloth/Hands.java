package db.random.armor.cloth;

import java.util.ArrayList;

import util.MultiBonus;

public class Hands {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
      10787, 9939, 14117, 20655, 14294, 14262, 14302, 14168, 14314, 9848, 10099, 14241, 9823, 
      10062, 7366, 10214, 14231, 14333, 14272, 14222, 7521, 9771, 10140, 9795, 14253, 10251, 
      10176, 14282, 14162, 14191, 7471, 14323, 9390, 14124, 9910, 6615, 6565, 9880, 14199, 
      7433, 14211, 14181, 6541, 
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
    System.out.println("Cloth Hands: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
  
  public static void main(String[] args) {
    fill();
  }
}
