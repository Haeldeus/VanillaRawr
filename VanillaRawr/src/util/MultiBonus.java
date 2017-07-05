package util;

import db.stats.Stat;
import java.util.ArrayList;

public class MultiBonus {

  private final String name;
  private final int id;
  private ArrayList<Tree> boni;
  private Stat defaultBonus;
  private int amountBonus;
  
  /**
   * Creates a new MultiBonus with the given name for the Item with the given ID.
   * @param name  The Name of the MultiBonus.
   * @param id  The ID of the Item, this MultiBonus is part of.
   */
  public MultiBonus(String name, int id) {
    this.name = name;
    this.id = id;
    boni = new ArrayList<Tree>();
  }
  
  public void addDefaultBonus(Stat stat, int amount) {
    //TODO implement default bonus
	defaultBonus = stat;
	amountBonus = amount;
  }
  
  //Methods for creating single-Bonus Trees
  public void createAgilityTree(int lower, int upper, double chance) {
    addToList(createTree(" of Agility", createSubTree(Stat.Agility, lower, upper), null, chance));
  }
  
  public void createArcaneWrathTree(int lower, int upper, double chance) {
    addToList(createTree(" of Arcane Wrath", createSubTree(Stat.ArcaneSpellDamage, lower, upper), 
        null, chance));
  }
  
  public void createArcaneResistanceTree(int lower, int upper, double chance) {
    addToList(createTree(" of Arcane Resistance", createSubTree(Stat.ArcaneResist, lower, upper), 
        null, chance));
  }
  
  public void createFieryWrathTree(int lower, int upper, double chance) {
    addToList(createTree(" of Fiery Wrath", createSubTree(Stat.FireSpellDamage, lower, upper), 
        null, chance));
  }
  
  public void createFireResistanceTree(int lower, int upper, double chance) {
    addToList(createTree(" of Fire Resistance", createSubTree(Stat.FireResist, lower, upper), 
        null, chance));
  }
  
  public void createFrostResistanceTree(int lower, int upper, double chance) {
    addToList(createTree(" of Frost Resistance", createSubTree(Stat.FrostResist, lower, upper), 
        null, chance));
  }
  
  public void createFrozenWrathTree(int lower, int upper, double chance) {
    addToList(createTree(" of Frozen Wrath", createSubTree(Stat.FrostSpellDamage, lower, upper), 
        null, chance));
  }
  
  public void createHealingTree(int lower, int upper, double chance) {
    addToList(createTree(" of Healing", createSubTree(Stat.SpellPower, lower, upper), 
        null, chance));
  }
  
  public void createHolyWrathTree(int lower, int upper, double chance) {
    addToList(createTree(" of Holy Wrath", createSubTree(Stat.HolySpellDamage, lower, upper), 
        null, chance));
  }
  
  public void createIntellectTree(int lower, int upper, double chance) {
    addToList(createTree(" of Intellect", createSubTree(Stat.Intellect, lower, upper), 
        null, chance));
  }

  public void createMarksmanshipTree(int lower, int upper, double chance) {
    addToList(createTree(" of Marksmanship", createSubTree(Stat.RangedAttackPower, lower, upper), 
        null, chance));
  }
  
  public void createNatureResistanceTree(int lower, int upper, double chance) {
    addToList(createTree(" of Nature Resistance", createSubTree(Stat.NatureResist, lower, upper), 
        null, chance));
  }
  
  public void createNaturesWrathTree(int lower, int upper, double chance) {
    addToList(createTree(" of Nature's Wrath", createSubTree(Stat.NatureSpellDamage, lower, upper), 
        null, chance));
  }

  public void createPowerTree(int lower, int upper, double chance) {
    addToList(createTree(" of Power", createSubTree(Stat.AttackPower, lower, upper), null, chance));
  }
  
  public void createShadowResistanceTree(int lower, int upper, double chance) {
    addToList(createTree(" of Shadow Resistance", createSubTree(Stat.ShadowResist, lower, upper), 
        null, chance));
  }
  
  public void createShadowWrathTree(int lower, int upper, double chance) {
    addToList(createTree(" of Shadow Wrath", createSubTree(Stat.ShadowSpellDamage, lower, upper), 
        null, chance));
  }
  
  public void createSpiritTree(int lower, int upper, double chance) {
    addToList(createTree(" of Spirit", createSubTree(Stat.Spirit, lower, upper), null, chance));
  }

  public void createStaminaTree(int lower, int upper, double chance) {
    addToList(createTree(" of Stamina", createSubTree(Stat.Stamina, lower, upper), null, chance));
  }
  
  public void createStrengthTree(int lower, int upper, double chance) {
    addToList(createTree(" of Strength", createSubTree(Stat.Strength, lower, upper), null, chance));
  }
  
  //Methods for creating double-Bonus Trees
  public void createBearTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Bear", createSubTree(Stat.Stamina, lower, upper), 
        createSubTree(Stat.Strength, lower, upper), chance));
  }
  
  public void createBoarTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Boar", createSubTree(Stat.Spirit, lower, upper), 
        createSubTree(Stat.Strength, lower, upper), chance));
  }
  
  public void createEagleTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Eagle", createSubTree(Stat.Intellect, lower, upper), 
        createSubTree(Stat.Stamina, lower, upper), chance));
  }
  
  public void createFalconTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Falcon", createSubTree(Stat.Agility, lower, upper), 
        createSubTree(Stat.Intellect, lower, upper), chance));
  }
  
  public void createGorillaTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Gorillla", createSubTree(Stat.Intellect, lower, upper), 
        createSubTree(Stat.Strength, lower, upper), chance));
  }
  
  public void createMonkeyTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Monkey", createSubTree(Stat.Agility, lower, upper), 
        createSubTree(Stat.Stamina, lower, upper), chance));
  }
  
  public void createOwlTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Owl", createSubTree(Stat.Intellect, lower, upper), 
        createSubTree(Stat.Spirit, lower, upper), chance));
  }
  
  public void createTigerTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Tiger", createSubTree(Stat.Agility, lower, upper), 
        createSubTree(Stat.Strength, lower, upper), chance));
  }
  
  /**
   * @see db.random.weapons.melee.OneHandAxes#fillZulianHacker()
   */
  public void createTigerTreeDiff(int lowerF, int upperF, int lowerS, int upperS, double chance) {
    addToList(createTree(" of the Tiger", createSubTree(Stat.Agility, lowerF, upperF), 
        createSubTree(Stat.Strength, lowerS, upperS), chance));
  }
  
  public void createWhaleTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Whale", createSubTree(Stat.Spirit, lower, upper), 
        createSubTree(Stat.Stamina, lower, upper), chance));
  }
  
  public void createWolfTree(int lower, int upper, double chance) {
    addToList(createTree(" of the Wolf", createSubTree(Stat.Agility, lower, upper), 
        createSubTree(Stat.Spirit, lower, upper), chance));
  }
  
  //Special Trees
  public void createRestorationTree(int stamina, int spellPower, int mpFive, double chance) {
	  addToList(createTripleTree(" of Restoration", createSubTree(Stat.Stamina, 
			  stamina, stamina), createSubTree(Stat.SpellPower, spellPower, spellPower), 
			  createSubTree(Stat.ManaPerFive, mpFive, mpFive), chance));
  }
  
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
  
  private Tree createTripleTree(String modName, SubTree left, SubTree middle, SubTree right, double dropChance) {
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
          res = res.concat(name + t.getName() + ": +" + left.getLower() + " " + left.getAttribute()); 
    	} else {
    		res = res.concat(name + t.getName() + ": +" + amount + " " + defaultBonus + ", +" + left.getLower() + " " + left.getAttribute()); 
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