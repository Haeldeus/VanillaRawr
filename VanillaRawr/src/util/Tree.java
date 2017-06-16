package util;

public class Tree {
  private String name;
  private SubTree left;
  private SubTree right;
  private double dropChance;
  
  /**
   * Creates a new Tree of the given Name with the given SubTrees lefts and right and the chance to 
   * drop dropChance.
   * @param name  The Name of the Tree.
   * @param left  The {@link SubTree}, that is the left Child of this Tree.
   * @param right  The {@link SubTree}, that is the right Child of this Tree.
   * @param dropChance  The Chance, that the Item drops with this MultiBonus.
   * @since 1.0
   */
  public Tree(String name, SubTree left, SubTree right, double dropChance) {
    this.name = name;
    this.left = left;
    this.right = right;
    this.dropChance = dropChance;
  }
  
  public SubTree getLeft() {
    return left;
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
}