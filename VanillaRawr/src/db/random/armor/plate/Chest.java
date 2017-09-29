package db.random.armor.plate;

import java.util.ArrayList;

import util.MultiBonus;

public class Chest {

  private static int[] ids = {
    14948, 14904, 10378, 9966, 10275, 14975, 9286, 14966, 10086, 10240, 14931, 14958, 10384, 
    14915, 14924, 10203, 10128, 14895, 10164, 14939
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
