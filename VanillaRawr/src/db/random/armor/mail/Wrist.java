package db.random.armor.mail;

import java.util.ArrayList;

import util.MultiBonus;

public class Wrist {

  private static int[] ids = {
    20684, 9409, 11765, 15600, 9837, 6591, 15495, 15610, 9927, 7493, 7545, 10191, 6574, 
    10229, 15629, 9811, 15507, 15620, 15659, 15639, 9896, 7461, 10076, 15668, 15566, 10265, 
    15649, 10156, 10126, 15499, 7416, 15556, 9785, 9865, 9388, 15532, 6550, 15577, 15517, 
    15590, 15545, 15679, 9956, 15535
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
