package db.random.armor.mail;

import java.util.ArrayList;

import util.MultiBonus;

public class Head {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    12953, 18319, 15602, 10408, 15615, 9932, 7488, 7540, 10198, 10235, 15634, 15623, 15664, 
    15645, 9902, 7456, 10083, 15670, 15572, 10272, 15651, 10160, 10123, 7420, 15558, 9870, 
    15533, 15580, 15593, 15550, 15684, 9963, 15540
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
