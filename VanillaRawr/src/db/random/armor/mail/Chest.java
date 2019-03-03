package db.random.armor.mail;

import java.util.ArrayList;

import util.MultiBonus;

public class Chest {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    10784, 15601, 9836, 6592, 15488, 15609, 9928, 9765, 7486, 7538, 15479, 10193, 6580, 
    10230, 15631, 9818, 15514, 15622, 15660, 6336, 15640, 9897, 7454, 10077, 15669, 15567, 
    10266, 15650, 10157, 10118, 15500, 7418, 15557, 9783, 9866, 15524, 6545, 15578, 15518, 
    15591, 15546, 15680, 15487, 9957, 15536, 
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
    System.out.println("Mail Chests: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  public static void main(String[] args) {
    fill();
  }
}
