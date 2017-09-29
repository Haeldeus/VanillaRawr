package db.random.armor.other;

import java.util.ArrayList;

import util.MultiBonus;

public class Shield {

  private static int[] ids = {
    13254, 15604, 9858, 9843, 9778, 6559, 6599, 14954, 15494, 15618, 9918, 14912, 9764, 7495, 
    7536, 10195, 15133, 6572, 10366, 6598, 9935, 10365, 10363, 14982, 15307, 7496, 15633, 
    9816, 15145, 14973, 7537, 15298, 15512, 15621, 9753, 15352, 10204, 15887, 14964, 10367, 
    15667, 7108, 7330, 15648, 14916, 9899, 7465, 14930, 10078, 15014, 15675, 15569, 10271, 
    15657, 10158, 10362, 15504, 9974, 15342, 7331, 15563, 9790, 9873, 10093, 15113, 15123, 
    14902, 9830, 6571, 7463, 15530, 6560, 15584, 15522, 15592, 9804, 10364, 15552, 15367, 
    15687, 15486, 14947, 9958, 15543, 15332
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
