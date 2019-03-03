package db.random.armor.cloth;

import java.util.ArrayList;

import util.MultiBonus;

public class Shoulder {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    20686, 9941, 14296, 14266, 14298, 14316, 9850, 10100, 14243, 9824, 10063, 7367, 10210, 
    14232, 14335, 14273, 14223, 7523, 10287, 10142, 9796, 14247, 10253, 10172, 14278, 14186, 
    7473, 14325, 9912, 6617, 9881, 14201, 7435, 14212, 14182, 
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
    System.out.println("Cloth Shoulder: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  public static void main(String[] args) {
    fill();
  }
}
