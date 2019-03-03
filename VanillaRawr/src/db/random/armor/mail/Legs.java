package db.random.armor.mail;

import java.util.ArrayList;

import util.MultiBonus;

public class Legs {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    20668, 15607, 9841, 6596, 15493, 15616, 9933, 9763, 7487, 7539, 15477, 10199, 6578, 
    10236, 15637, 9815, 15511, 15627, 15665, 6337, 15646, 9903, 7455, 10084, 15676, 15573, 
    10273, 15655, 10162, 10124, 15503, 7423, 15561, 9789, 9871, 15529, 6546, 15582, 15521, 
    15596, 15551, 15685, 15485, 9964, 15541
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
    System.out.println("Mail Legs: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  public static void main(String[] args) {
    fill();
  }
}
