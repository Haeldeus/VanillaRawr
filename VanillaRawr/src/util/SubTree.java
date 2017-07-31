package util;

import db.stats.Stat;

public class SubTree {
  private Stat attribute;
  private int lower;
  private int upper;
    
  /**
   * Creates a SubTree of the given Attribute with the given lower and upper borders.
   * @param name  The Name of the Item (to check for possible Errors at the Item).
   * @param attribute  The attribute.
   * @param lower  The lower border of possible Stats.
   * @param upper  The upper border of possible Stats.
   */
  public SubTree(String name, Stat attribute, int lower, int upper) {
    String[] nameArray = {"Acrobatic Staff", "Diviner Long Staff", 
        "Magus Long Staff", "Spiritchaser Staff", "Thaumaturgist Staff", 
        "Sequoia Branch", "Stoneclutter Claymore", "Tusker Sword", "Blasthorn Bow", 
        "Quillfire Bow",};
    this.attribute = attribute;
    this.lower = lower;
    this.upper = upper;
    if (lower > upper) {
      System.err.println("Lower is greater than upper at an Instance of: \"" + name 
          + "\". Stat is " + this.attribute + ". Creation of Database has stopped.");
      System.exit(0);
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
    
  public Stat getAttribute() {
    return attribute;
  }
    
  public int getLower() {
    return lower;
  }
    
  public int getUpper() {
    return upper;
  }
}