package util;

import db.stats.Stat;

public class Tree {
  private String name;
  private SubTree left;
  private SubTree middle;
  private SubTree right;
  private double dropChance;
  private Stat defaultBonus;
  private int defaultAmount;
  
  /**
   * Creates a new Tree of the given Name with the given SubTrees lefts and right and the chance to 
   * drop dropChance.
   * @param name  The Name of the Tree.
   * @param left  The {@link SubTree}, that is the left Child of this Tree.
   * @param right  The {@link SubTree}, that is the right Child of this Tree.
   * @param middle The {@link SubTree}, that is the middle Child of this Tree.
   * @param dropChance  The Chance, that the Item drops with this MultiBonus.
   * @since 1.0
   */
  public Tree(String name, SubTree left, SubTree middle, SubTree right, double dropChance) {
	this(name, left, middle, right, null, 0, dropChance);
  }
  
  public Tree(String name, SubTree left, SubTree middle, SubTree right, Stat defaultBonus, 
        int amount, double dropChance) {
    this.name = name;
    this.left = left;
    this.middle = middle;
    this.right = right;
    this.defaultBonus = defaultBonus;
    this.defaultAmount = amount;
    this.dropChance = dropChance;
  }
  
  public SubTree getLeft() {
    return left;
  }
  
  public SubTree getMiddle() {
	  return middle;
  }
  
  public double getDropChance() {
    return dropChance;
  }
  
  public String getName() {
    return name;
  }
  
  public SubTree getRight() {
    return right;
  }
  
  public Stat getDefaultBonus() {
	  return defaultBonus;
  }
  
  public int getDefaultAmount() {
	  return defaultAmount;
  }
}