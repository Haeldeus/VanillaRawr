package db.random.armor.leather;

import java.util.ArrayList;

import util.MultiBonus;

public class Wrist {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    20681, 11764, 10800, 9455, 9428, 10256, 9857, 9777, 6556, 7534, 9949, 15132, 6602, 15306, 
    15143, 15188, 15351, 9886, 15163, 7410, 15387, 10147, 10223, 15160, 15348, 15425, 15172, 
    15182, 15380, 7484, 10069, 15112, 15122, 9829, 6583, 7447, 9803, 15436, 10184, 9925, 
    15360, 10107, 15377, 15331
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
    System.out.println("Leather Wrists: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  public static void main(String[] args) {
    fill();
  }
}
