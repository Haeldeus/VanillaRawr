package util;

import db.stats.Stat;
import java.util.HashMap;

/**
 * An abstract Class to define an Item. 
 * @author Haeldeus
 * @version 1.0
 */
public abstract class Item {
  
  /**
   * The name of the Item.
   */
  private String name;
  
  /**
   * The unique ID of this Item.
   */
  private int id;
  
  /**
   * The icon, that this Item uses.
   */
  private String icon;
  
  /**
   * The boolean value, if the Item is bound on pickup.
   */
  private boolean bop;
  
  /**
   * The boolean value, if this Item is part of a set.
   */
  private boolean setItem;
  
  /**
   * The {@link Stat}s, this Item provides when used.
   */
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
  
  /**
   * Returns the name of the Item.
   * @return The name of the Item as a String.
   * @since 1.0
   */
  public String getName() {
    return name;
  }
  
  /**
   * Returns The ID of the Item.
   * @return The ID of the Item as an Integer.
   * @since 1.0 
   */
  public int getId() {
    return id;
  }
  
  /**
   * Returns the Icon of the Item.
   * @return The Icon of the Item as a String, that can be used to find this Icon inside the 
   *     {@code \resources\}-Folder.
   * @since 1.0
   */
  public String getIcon() {
    return icon;
  }
  
  /**
   * Returns, if the Item is bound on pickup.
   * @return {@code true}, if this Item is bound when picked up, {@code false} else.
   * @since 1.0
   */
  public boolean isBop() {
    return bop;
  }
  
  /**
   * Returns, if the Item is part of a Set.
   * @return {@code true}, if this Item is part of a Set, {@code false} else.
   * @since 1.0
   */
  public boolean isSetItem() {
    return setItem;
  }
  
  /**
   * Returns the Stats, this Item provides when used.
   * @return The Stats, this Item provides as a {@link HashMap} of {@link Stat}s and Integer.
   * @since 1.0
   */
  public HashMap<Stat, Integer> getStats() {
    return stats;
  }
}
