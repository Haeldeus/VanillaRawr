package db.random.armor.mail;

import java.util.ArrayList;

import util.MultiBonus;

public class Waist {

  private static int[] ids = {
    13387, 20670, 15606, 9840, 6594, 15492, 15613, 9931, 7494, 7546, 10197, 6576, 10233, 
    15636, 9814, 15510, 15619, 15663, 15641, 9901, 7462, 10081, 15673, 15571, 10269, 15654, 
    10154, 10122, 15497, 7422, 15554, 9788, 9869, 15528, 6548, 15575, 15515, 15598, 15549, 
    15683, 9961, 15539
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
    System.out.println("Mail Waists: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  public static void main(String[] args) {
    fill();
  }
}
