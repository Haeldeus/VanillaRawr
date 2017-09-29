package db.random.armor.plate;

import java.util.ArrayList;

import util.MultiBonus;

public class Hands {

  private static int[] ids = {
    9410, 9640, 20653, 14949, 14905, 10380, 9967, 10277, 14976, 9287, 14967, 10087, 10242, 
    14933, 14959, 10386, 14917, 14926, 10205, 10129, 14897, 10165, 14942
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
