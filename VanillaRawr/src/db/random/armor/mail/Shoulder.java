package db.random.armor.mail;

import java.util.ArrayList;

import util.MultiBonus;

public class Shoulder {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    20680, 15608, 9842, 6597, 15617, 9934, 7491, 7543, 10200, 10237, 15638, 9817, 15513, 
    15628, 15666, 15647, 9904, 7459, 10085, 15677, 15574, 10274, 15656, 10163, 10125, 7424, 
    15562, 9872, 15531, 15583, 15523, 15597, 15553, 15686, 9965, 15542
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
