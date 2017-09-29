package db.random.armor.mail;

import java.util.ArrayList;

import util.MultiBonus;

public class Hands {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    20659, 15605, 9839, 6595, 15491, 15612, 9930, 7489, 7541, 10196, 6577, 10232, 15635, 
    9813, 3474, 15509, 15625, 15662, 15644, 9900, 7457, 10080, 15672, 15570, 10268, 15653, 
    10161, 10121, 15502, 7421, 15560, 9787, 9868, 15527, 6547, 15581, 15520, 15595, 15548, 
    15682, 9960, 15538
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
