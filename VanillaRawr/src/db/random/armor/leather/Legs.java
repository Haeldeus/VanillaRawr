package db.random.armor.leather;

import java.util.ArrayList;

import util.MultiBonus;

public class Legs {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    20665, 10262, 9862, 10785, 9781, 6553, 7528, 9954, 15139, 6607, 15312, 15151, 15194, 
    15303, 9756, 15358, 9893, 15168, 7414, 15394, 15017, 10152, 10227, 15157, 15344, 15431, 
    6269, 15176, 15186, 15009, 15385, 7478, 10074, 15117, 15126, 9833, 6587, 7440, 9808, 
    15440, 10188, 9922, 15366, 10112, 8212, 15374, 15336
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
