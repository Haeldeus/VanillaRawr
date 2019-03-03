package util;

import db.stats.Stat;

/**
 * A Class, which Objects represent a Range of Stats, that an Item might occur with. This isn't 
 * complete, as there might be other SubTrees for a single Item, so this is just a part of the 
 * MultiBonus for the Item.
 * @author Haeldeus
 * @version 1.0
 */
public class SubTree {
  
  /**
   * The {@link Stat}, this SubTree represents.
   */
  private Stat attribute;
  
  /**
   * The lower limit for this Stat.
   */
  private int lower;
  
  /**
   * The upper limit for this Stat.
   */
  private int upper;
    
  /**
   * Creates a SubTree of the given Attribute with the given lower and upper borders.
   * @param name  The Name of the Item (to check for possible Errors at the Item).
   * @param attribute  The attribute.
   * @param lower  The lower border of possible Stats.
   * @param upper  The upper border of possible Stats.
   * @since 1.0
   */
  public SubTree(String name, Stat attribute, int lower, int upper) {
    /*
     * These are Items, that have confirmed high Ranges for their Stats. These are ignored 
     * in the Check for unexpected high ranges of random boni, that is done when creating a new 
     * SubTree.
     */
    String[] nameArray = {"Acrobatic Staff", "Diviner Long Staff", 
        "Magus Long Staff", "Spiritchaser Staff", "Thaumaturgist Staff", 
        "Sequoia Branch", "Stoneclutter Claymore", "Tusker Sword", "Blasthorn Bow", 
        "Quillfire Bow",};
    this.attribute = attribute;
    this.lower = lower;
    this.upper = upper;
    if (lower > upper) {  //This is the case, if there was a typo or something similar
      System.err.println("Lower is greater than upper at an Instance of: \"" + name 
          + "\". Stat is " + this.attribute + ". Creation of Database has stopped.");
      System.exit(0);
    //Unexpected high Range, so the Admin (Me) should check, if this is correct
    } else if ((upper - lower) > 10) {
      boolean print = true;
      for (String s : nameArray) {
        if (name.equals(s)) {
          print = false;
        }
      }
      if (print) {
        System.err.println("Lower is a lot lower than upper at an Instance of: \"" 
            + name + "\". Stat is " + this.attribute + ". You might want to check this.");
      }
    }
  }
  
  /**
   * Returns the {@link Stat}, this SubTree represents.
   * @return {@link #attribute}
   * @since 1.0
   */
  public Stat getAttribute() {
    return attribute;
  }
  
  /**
   * Returns the lower limit of this SubTree.
   * @return {@link #lower}
   * @since 1.0
   */
  public int getLower() {
    return lower;
  }
  
  /**
   * Returns the upper limit of this SubTree.
   * @return {@link #upper}
   * @since 1.0
   */
  public int getUpper() {
    return upper;
  }
}