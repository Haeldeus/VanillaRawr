package db.random.armor.other;

import java.util.ArrayList;

import util.MultiBonus;

public class Cloak {

  private static int[] ids = {
    13386, 18382, 9938, 10258, 15603, 14292, 9860, 9838, 9779, 6593, 14261, 14300, 15611, 
    9929, 14167, 7533, 7492, 14313, 7544, 9951, 9847, 10098, 10194, 15135, 14239, 6675, 6604, 
    9822, 10060, 7356, 10212, 14229, 10231, 14331, 15309, 15632, 9812, 14270, 14219, 15147, 
    7524, 15190, 9770, 15508, 15624, 15354, 10138, 9890, 15661, 15165, 7411, 15643, 9794, 
    15392, 9898, 7460, 10079, 14251, 15671, 15568, 10249, 10267, 15652, 10159, 10148, 10174, 
    10224, 15153, 14280, 10120, 15501, 14161, 15340, 15427, 7419, 15559, 15173, 15183, 15382, 
    9786, 14188, 7483, 7474, 9867, 14321, 10071, 15114, 14123, 15124, 9908, 6614, 9831, 6585, 
    7446, 15526, 6564, 9877, 15579, 15519, 15594, 9805, 15437, 10185, 15547, 14198, 9919, 
    15364, 15681, 7436, 14210, 10108, 9959, 14179, 15537, 8215, 6542, 15371, 15333, 
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
    System.out.println("Cloaks: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  public static void main(String[] args) {
    fill();
  }
}
