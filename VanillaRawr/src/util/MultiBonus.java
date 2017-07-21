package util;

import db.stats.Stat;
import java.util.ArrayList;

/**
 * This Class provides Methods to support Items, that have variable Boni.
 * @author Haeldeus
 * @version 1.0
 */
public class MultiBonus {

  /** The name of this Item. */
  private final String name;
  
  /** The id of this Item. */
  private final int id;
  
  /**
   * All possible Boni, this Item can provide.
   * They are saved as an {@link ArrayList} of {@link Tree}s. 
   */
  private ArrayList<Tree> boni;
  
  /** The Stat, this Item might provide as default bonus for all possible Boni. */
  private Stat defaultBonus;
  
  /** The amount of the default Bonus, this Item adds. */
  private int amountBonus;
  
  /**
   * Creates a new MultiBonus with the given name for the Item with the given ID.
   * @param name  The Name of the MultiBonus.
   * @param id  The ID of the Item, this MultiBonus is part of.
   * @since 1.0
   */
  public MultiBonus(String name, int id) {
    this.name = name;
    this.id = id;
    boni = new ArrayList<Tree>();
  }
  
  /**
   * Adds the given Stat as default Bonus for this Item.
   * @param stat  The {@link Stat}, this Item gives as default Bonus.
   * @param amount  The amount of Bonus, this Item gives as default.
   * @since 1.0
   */
  public void addDefaultBonus(Stat stat, int amount) {
    //TODO implement default bonus
    defaultBonus = stat;
    amountBonus = amount;
  }

  //Methods for creating single-Bonus Trees
  
  /**
   * Creates a {@link Tree} of Agility for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createAgilityTree(int lower, int upper, double chance) {
    addToList(createTree(" of Agility", createSubTree(Stat.Agility, lower, upper), null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Arcane Wrath for this Item with the given Stat-borders and the 
   * chance, this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createArcaneWrathTree(int lower, int upper, double chance) {
    addToList(createTree(" of Arcane Wrath", createSubTree(Stat.ArcaneSpellDamage, lower, upper), 
        null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Arcane Resistance for this Item with the given Stat-borders and the 
   * chance, this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createArcaneResistanceTree(int lower, int upper, double chance) {
    addToList(createTree(" of Arcane Resistance", createSubTree(Stat.ArcaneResist, lower, upper), 
        null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Fiery Wrath for this Item with the given Stat-borders and the 
   * chance, this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createFieryWrathTree(int lower, int upper, double chance) {
    addToList(createTree(" of Fiery Wrath", createSubTree(Stat.FireSpellDamage, lower, upper), 
        null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Fire Resistance for this Item with the given Stat-borders and the 
   * chance, this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createFireResistanceTree(int lower, int upper, double chance) {
    addToList(createTree(" of Fire Resistance", createSubTree(Stat.FireResist, lower, upper), 
        null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Frost Resistance for this Item with the given Stat-borders and the 
   * chance, this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createFrostResistanceTree(int lower, int upper, double chance) {
    addToList(createTree(" of Frost Resistance", createSubTree(Stat.FrostResist, lower, upper), 
        null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Frozen Wrath for this Item with the given Stat-borders and the 
   * chance, this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createFrozenWrathTree(int lower, int upper, double chance) {
    addToList(createTree(" of Frozen Wrath", createSubTree(Stat.FrostSpellDamage, lower, upper), 
        null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Healing for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createHealingTree(int lower, int upper, double chance) {
    addToList(createTree(" of Healing", createSubTree(Stat.SpellPower, lower, upper), 
        null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Holy Wrath for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createHolyWrathTree(int lower, int upper, double chance) {
    addToList(createTree(" of Holy Wrath", createSubTree(Stat.HolySpellDamage, lower, upper), 
        null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Intellect for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createIntellectTree(int lower, int upper, double chance) {
    addToList(createTree(" of Intellect", createSubTree(Stat.Intellect, lower, upper), 
        null, chance));
  }

  /**
   * Creates a {@link Tree} of Marksmanship for this Item with the given Stat-borders and the 
   * chance, this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createMarksmanshipTree(int lower, int upper, double chance) {
    addToList(createTree(" of Marksmanship", createSubTree(Stat.RangedAttackPower, lower, upper), 
        null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Nature Resistance for this Item with the given Stat-borders and the 
   * chance, this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createNatureResistanceTree(int lower, int upper, double chance) {
    addToList(createTree(" of Nature Resistance", createSubTree(Stat.NatureResist, lower, upper), 
        null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Nature's Wrath for this Item with the given Stat-borders and the 
   * chance, this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createNaturesWrathTree(int lower, int upper, double chance) {
    addToList(createTree(" of Nature's Wrath", createSubTree(Stat.NatureSpellDamage, lower, upper), 
        null, chance));
  }

  /**
   * Creates a {@link Tree} of Power for this Item with the given Stat-borders and the chance, this 
   * Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createPowerTree(int lower, int upper, double chance) {
    addToList(createTree(" of Power", createSubTree(Stat.AttackPower, lower, upper), null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Shadow Resistance for this Item with the given Stat-borders and the 
   * chance, this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createShadowResistanceTree(int lower, int upper, double chance) {
    addToList(createTree(" of Shadow Resistance", createSubTree(Stat.ShadowResist, lower, upper), 
        null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Shadow Wrath for this Item with the given Stat-borders and the 
   * chance, this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createShadowWrathTree(int lower, int upper, double chance) {
    addToList(createTree(" of Shadow Wrath", createSubTree(Stat.ShadowSpellDamage, lower, upper), 
        null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Spirit for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createSpiritTree(int lower, int upper, double chance) {
    addToList(createTree(" of Spirit", createSubTree(Stat.Spirit, lower, upper), null, chance));
  }

  /**
   * Creates a {@link Tree} of Stamina for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createStaminaTree(int lower, int upper, double chance) {
    addToList(createTree(" of Stamina", createSubTree(Stat.Stamina, lower, upper), null, chance));
  }
  
  /**
   * Creates a {@link Tree} of Strength for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createStrengthTree(int lower, int upper, double chance) {
    addToList(createTree(" of Strength", createSubTree(Stat.Strength, lower, upper), null, chance));
  }
  
  //Methods for creating double-Bonus Trees
  
  /**
   * Creates a {@link Tree} of the Bear for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createBearTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Bear", createSubTree(Stat.Stamina, lower, upper), 
        createSubTree(Stat.Strength, lower, upper), chance));
  }
  
  /**
   * Creates a {@link Tree} of the Boar for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createBoarTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Boar", createSubTree(Stat.Spirit, lower, upper), 
        createSubTree(Stat.Strength, lower, upper), chance));
  }
  
  /**
   * Creates a {@link Tree} of the Eagle for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createEagleTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Eagle", createSubTree(Stat.Intellect, lower, upper), 
        createSubTree(Stat.Stamina, lower, upper), chance));
  }
  
  /**
   * Creates a {@link Tree} of the Falcon for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createFalconTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Falcon", createSubTree(Stat.Agility, lower, upper), 
        createSubTree(Stat.Intellect, lower, upper), chance));
  }
  
  /**
   * Creates a {@link Tree} of the Gorilla for this Item with the given Stat-borders and the 
   * chance, this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createGorillaTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Gorillla", createSubTree(Stat.Intellect, lower, upper), 
        createSubTree(Stat.Strength, lower, upper), chance));
  }
  
  /**
   * Creates a {@link Tree} of the Monkey for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createMonkeyTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Monkey", createSubTree(Stat.Agility, lower, upper), 
        createSubTree(Stat.Stamina, lower, upper), chance));
  }
  
  /**
   * Creates a {@link Tree} of the Owl for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createOwlTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Owl", createSubTree(Stat.Intellect, lower, upper), 
        createSubTree(Stat.Spirit, lower, upper), chance));
  }
  
  /**
   * Creates a {@link Tree} of the Tiger for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createTigerTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Tiger", createSubTree(Stat.Agility, lower, upper), 
        createSubTree(Stat.Strength, lower, upper), chance));
  }
  
  public void createTigerTreeDiff(int lowerF, int upperF, int lowerS, int upperS, double chance) {
    addToList(createTree(" of the Tiger", createSubTree(Stat.Agility, lowerF, upperF), 
        createSubTree(Stat.Strength, lowerS, upperS), chance));
  }
  
  /**
   * Creates a {@link Tree} of the Whale for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createWhaleTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Whale", createSubTree(Stat.Spirit, lower, upper), 
        createSubTree(Stat.Stamina, lower, upper), chance));
  }
  
  /**
   * Creates a {@link Tree} of the Wolf for this Item with the given Stat-borders and the chance, 
   * this Item comes with this Bonus.
   * @param lower The lower border for this Tree.
   * @param upper The upper border for this Tree.
   * @param chance The chance, that the Item has this Bonus.
   * @since 1.0
   */
  public void createWolfTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Wolf", createSubTree(Stat.Agility, lower, upper), 
        createSubTree(Stat.Spirit, lower, upper), chance));
  }
  
  //Special Trees
  
  /**
   * Adds a Restoration-Tree to the List of Boni.
   * @param stamina  The amount of Stamina, this Tree adds.
   * @param spellPower  The amount of SpellPower, this Tree adds.
   * @param mpFive  The amount of Mana per Five Seconds, this Tree adds.
   * @param chance  The chance, that the Item drops with this Tree as Stats.
   * @since 1.0
   */
  public void createRestorationTree(int stamina, int spellPower, int mpFive, double chance) {
    addToList(createTripleTree(" of Restoration", createSubTree(Stat.Stamina, 
        stamina, stamina), createSubTree(Stat.SpellPower, spellPower, spellPower), 
        createSubTree(Stat.ManaPerFive, mpFive, mpFive), chance));
  }
  
  /**
   * Adds a Sorcery-Tree to the List of Boni.
   * @param stamina  The amount of Stamina, this Tree adds.
   * @param intellect  The amount of Intellect, this Tree adds.
   * @param spellPower  The amount of SpellPower, this Tree adds.
   * @param chance  The chance, that the Item drops with this Tree as Stats.
   * @since 1.0
   */
  public void createSorceryTree(int stamina, int intellect, int spellPower, double chance) {
    addToList(createTripleTree(" of Sorcery", createSubTree(Stat.Stamina, 
        stamina, stamina), createSubTree(Stat.Intellect, intellect, intellect), 
        createSubTree(Stat.SpellPower, spellPower, spellPower), chance));
  }
  
  private SubTree createSubTree(Stat attribute, int lower, int upper) {
    return new SubTree(name, attribute, lower, upper);
  }
  
  private Tree createTree(String modName, SubTree left, SubTree right, double dropChance) {
    return new Tree(modName, left, null, right, defaultBonus, amountBonus, dropChance);
  }
  
  private Tree createTripleTree(String modName, SubTree left, SubTree middle, 
      SubTree right, double dropChance) {
    return new Tree(modName, left, middle, right, defaultBonus, amountBonus, dropChance);
  }
  
  private void addToList(Tree mod) {
    boni.add(mod);
  }
  
  public ArrayList<Tree> getBoni() {
    return boni;
  }
  
  public String getName() {
    return name;
  }
  

  public int getId() {
    return id;
  }
  
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    String res = getName() + " - " + getId() + ":" + System.lineSeparator();
    ArrayList<Tree> boni = getBoni();
    double chance = 0.0;
    for (int i = 0; i < boni.size(); i++) {
      Tree t = boni.get(i);
      db.stats.Stat defaultBonus = t.getDefaultBonus();
      int amount = t.getDefaultAmount();
      SubTree left = t.getLeft();
      SubTree middle = null;
      SubTree right = null;
      if (t.getMiddle() != null) {
        middle = t.getMiddle();
      }
      if (t.getRight() != null) {
        right = t.getRight();
      }
      if (left.getLower() != left.getUpper()) {
        if (defaultBonus == null) {
          res = res.concat(name + t.getName() + ": +(" + left.getLower() + "-" + left.getUpper() 
              + ") " + left.getAttribute());
        } else {
          res = res.concat(name + t.getName() + ": +" + amount + " " + defaultBonus + ", +(" 
            + left.getLower() + "-" + left.getUpper() + ") " + left.getAttribute());
        }
      } else {
        if (defaultBonus == null) {
          res = res.concat(name + t.getName() + ": +" + left.getLower() + " " 
              + left.getAttribute()); 
        } else {
          res = res.concat(name + t.getName() + ": +" + amount + " " 
              + defaultBonus + ", +" + left.getLower() + " " + left.getAttribute()); 
        }
      }
      if (middle != null) {
        if (middle.getLower() != middle.getUpper()) {
          res = res.concat(", +(" + middle.getLower() + "-" + middle.getUpper() + ") " 
                + middle.getAttribute());
        } else {
          res = res.concat(", +" + middle.getLower() + " " + middle.getAttribute());
        }
      }
      if (right != null) {
        if (right.getLower() != right.getUpper()) {
          res = res.concat(", +(" + right.getLower() + "-" + right.getUpper() + ") " 
              + right.getAttribute());
        } else {
          res = res.concat(", +" + right.getLower() + " " + right.getAttribute());
        }
      }
      res = res.concat(" - " + t.getDropChance() + "%");
      if (i != boni.size() - 1) {
        res = res.concat(System.lineSeparator());
      }
      chance += t.getDropChance();
    }
    res = res.concat(System.lineSeparator() + "DropChance for all boni of \"" + getName() 
        + "\" is: " + chance);
    return res;
  }
}