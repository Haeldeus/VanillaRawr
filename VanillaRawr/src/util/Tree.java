package util;

import db.stats.Stat;

/**
 * A Tree, that defines a possible Combination of Stats, an Item may have as well as well as the 
 * Dropchance of this Item. <br/>The possible Stats will be saved in {@link SubTree}s.
 * @author Haeldeus
 * @version 1.0
 */
public class Tree {
  /**
   * The Name of the Tree.
   */
  private String name;
  
  /**
   * The {@link SubTree}, that defines the left Stat of this Tree.
   */
  private SubTree left;
  
  /**
   * The {@link SubTree}, that defines the possible middle Stat of this Tree. This might be null, 
   * in case the Tree has only two or three Mods.
   */
  private SubTree middle;
  
  /**
   * The {@link SubTree}, that defines the possible right Stat of this Tree. This might be null, in 
   * case the Tree has only one Mod.
   */
  private SubTree right;
  
  /**
   * The chance, the Item drops with this Tree as mod.
   */
  private double dropChance;
  
  /**
   * A possible default Bonus, every Tree adds, despite what his children define.
   */
  private Stat defaultBonus;
  
  /**
   * The amount, the possible default Bonus adds.
   */
  private int defaultAmount;
  
  /**
   * Creates a new Tree of the given Name with the given SubTrees lefts and right and the chance to 
   * drop dropChance.
   * @param name  The Name of the Tree.
   * @param left  The {@link SubTree}, that is the left Child of this Tree.
   * @param middle The {@link SubTree}, that is the middle Child of this Tree.
   * @param right  The {@link SubTree}, that is the right Child of this Tree.
   * @param dropChance  The Chance, that the Item drops with this MultiBonus.
   * @since 1.0
   */
  public Tree(String name, SubTree left, SubTree middle, SubTree right, double dropChance) {
    this(name, left, middle, right, null, 0, dropChance);
  }
  
  /**
   * Creates a new Tree of the given Name with the given SubTrees lefts and right and the chance to 
   * drop dropChance.
   * @param name  The Name of the Tree.
   * @param left  The {@link SubTree}, that is the left Child of this Tree.
   * @param middle The {@link SubTree}, that is the middle Child of this Tree.
   * @param right  The {@link SubTree}, that is the right Child of this Tree.
   * @param defaultBonus  The {@link Stat}, that is given as default for this Item.
   * @param amount  The amount of Bonus, the default Bonus for this Item gives.
   * @param dropChance  The Chance, that the Item drops with this MultiBonus.
   * @since 1.0
   */
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
  
  /**
   * Returns the left {@link SubTree} of this Tree.
   * @return {@link #left}.
   * @since 1.0
   */
  public SubTree getLeft() {
    return left;
  }
  
  /**
   * Returns the middle {@link SubTree} of this Tree. <br/>
   * Might be {@code null}, if this Tree only has 1 or 2 Mods.
   * @return {@link #middle}.
   * @since 1.0
   */
  public SubTree getMiddle() {
    return middle;
  }
  
  /**
   * Returns the chance, the Item drops with this Mod.
   * @return {@link #dropChance}.
   * @since 1.0
   */
  public double getDropChance() {
    return dropChance;
  }
  
  /**
   * Returns the name of this Tree.
   * @return {@link #name}.
   * @since 1.0
   */
  public String getName() {
    return name;
  }
  
  /**
   * Returns the right child of this Tree. <br/>
   * Might be {@code null}, if this Tree has only 1 Mod.
   * @return {@link #right}.
   * @since 1.0
   */
  public SubTree getRight() {
    return right;
  }
  
  /**
   * Returns the possible Stat, this Tree adds on default. <br/>
   * Might be {@code null}, if the Item has no default Bonus.
   * @return {@link #defaultBonus}.
   * @since 1.0
   * @see Stat
   */
  public Stat getDefaultBonus() {
    return defaultBonus;
  }
  
  /**
   * Returns the amount, the possible {@link #defaultBonus} adds. <br/>
   * Might be {@code null}, if the Item has no default Bonus.
   * @return {@link #defaultAmount}.
   * @since 1.0
   */
  public int getDefaultAmount() {
    return defaultAmount;
  }
}