package db.random.armor.other.misc;

import java.util.ArrayList;

import util.MultiBonus;

public class Ring {

  private static int[] ids = {
    11118, 9461, 18684, 10795, 11934, 12926, 862, 11968, 11971, 11974, 12014, 11996, 11972, 
    11985, 11983, 11993, 11984, 11994, 11945, 12013, 12010, 12011, 10298, 12005, 11997, 
    11973, 11987, 11995, 11969, 11978, 11998, 12016, 11981, 11999, 12002, 12012, 12006, 
    20692, 12004, 12001, 11980, 11979, 12007, 12017, 11965, 11991, 11976, 12008, 11990, 
    11977, 11970, 12015, 11988, 11986, 11975, 12009, 11989, 11992, 11982, 11967
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
