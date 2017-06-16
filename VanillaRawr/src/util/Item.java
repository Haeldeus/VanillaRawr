package util;

import db.stats.Stat;
import java.util.HashMap;

public abstract class Item {
  
  private String name;
  private int id;
  private String icon;
  private boolean bop;
  private boolean setItem;
  private HashMap<Stat, Integer> stats;
  
  /**
   * Creates a new Item with the given attributes.
   * @param name  The Name of the Item.
   * @param id  The ID of the Item.
   * @param icon  The Icon, this Item is using as a String-Declarer.
   * @param bop  Determines, if this Item is bound on Pickup.
   * @param setItem  Determines, if this Item is part of a Set.
   * @param stats  The Stats, this Item provides as a HashMap.
   * @see HashMap
   * @since 1.0
   */
  public Item(String name, int id, String icon, boolean bop, boolean setItem, 
      HashMap<Stat, Integer> stats) {
    this.name = name;
    this.id = id;
    this.icon = icon;
    this.bop = bop;
    this.setItem = setItem;
    this.stats = stats;
  }
  
  public String getName() {
    return name;
  }
  
  public int getId() {
    return id;
  }
  
  public String getIcon() {
    return icon;
  }
  
  public boolean getBop() {
    return bop;
  }
  
  public boolean getSetItem() {
    return setItem;
  }
  
  public HashMap<Stat, Integer> getStats() {
    return stats;
  }
}
