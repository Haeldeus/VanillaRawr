package util;

import java.util.ArrayList;

import db.stats.Stat;

public class MultiBonus {

	private final String name;
	private final int id;
	private ArrayList<Tree> boni; 
	
	public MultiBonus(String name, int id) {
		this.name = name;
		this.id = id;
		boni = new ArrayList<Tree>();
	}
	
	public void addDefaultBonus(Stat stat, int amount) {
		//TODO implement default bonus
	}
	
	//Methods for creating single-Bonus Trees
	public void createAgilityTree(int lower, int upper, double chance) {
		addToList(createTree(" of Agility", createSubTree(Stat.Agility, lower, upper), null, chance));
	}
	
	public void createArcaneWrathTree(int lower, int upper, double chance) {
		addToList(createTree(" of Arcane Wrath", createSubTree(Stat.ArcaneSpellDamage, lower, upper), null, chance));
	}
	
	public void createArcaneResistanceTree(int lower, int upper, double chance) {
		addToList(createTree(" of Arcane Resistance", createSubTree(Stat.ArcaneResist, lower, upper), null, chance));
	}
	
	public void createFieryWrathTree(int lower, int upper, double chance) {
		addToList(createTree(" of Fiery Wrath", createSubTree(Stat.FireSpellDamage, lower, upper), null, chance));
	}
	
	public void createFireResistanceTree(int lower, int upper, double chance) {
		addToList(createTree(" of Fire Resistance", createSubTree(Stat.FireResist, lower, upper), null, chance));
	}
	
	public void createFrostResistanceTree(int lower, int upper, double chance) {
		addToList(createTree(" of Frost Resistance", createSubTree(Stat.FrostResist, lower, upper), null, chance));
	}
	
	public void createFrozenWrathTree(int lower, int upper, double chance) {
		addToList(createTree(" of Frozen Wrath", createSubTree(Stat.FrostSpellDamage, lower, upper), null, chance));
	}
	
	public void createHealingTree(int lower, int upper, double chance) {
		addToList(createTree(" of Healing", createSubTree(Stat.SpellPower, lower, upper), null, chance));
	}
	
	public void createHolyWrathTree(int lower, int upper, double chance) {
		addToList(createTree(" of Holy Wrath", createSubTree(Stat.HolySpellDamage, lower, upper), null, chance));
	}
	
	public void createIntellectTree(int lower, int upper, double chance) {
		addToList(createTree(" of Intellect", createSubTree(Stat.Intellect, lower, upper), null, chance));
	}

	public void createNatureResistanceTree(int lower, int upper, double chance) {
		addToList(createTree(" of Nature Resistance", createSubTree(Stat.NatureResist, lower, upper), null, chance));
	}
	
	public void createNaturesWrathTree(int lower, int upper, double chance) {
		addToList(createTree(" of Nature's Wrath", createSubTree(Stat.NatureSpellDamage, lower, upper), null, chance));
	}

	public void createPowerTree(int lower, int upper, double chance) {
		addToList(createTree(" of Power", createSubTree(Stat.AttackPower, lower, upper), null, chance));
	}
	
	public void createShadowResistanceTree(int lower, int upper, double chance) {
		addToList(createTree(" of Shadow Resistance", createSubTree(Stat.ShadowResist, lower, upper), null, chance));
	}
	
	public void createShadowWrathTree(int lower, int upper, double chance) {
		addToList(createTree(" of Shadow Wrath", createSubTree(Stat.ShadowSpellDamage, lower, upper), null, chance));
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
		addToList(createTree(" of the Bear", createSubTree(Stat.Stamina, lower, upper), createSubTree(Stat.Strength, lower, upper), chance));
	}
	
	public void createBoarTree(int lower, int upper, double chance) {
		addToList(createTree(" of the Boar", createSubTree(Stat.Spirit, lower, upper), createSubTree(Stat.Strength, lower, upper), chance));
	}
	
	public void createEagleTree(int lower, int upper, double chance) {
		addToList(createTree(" of the Eagle", createSubTree(Stat.Intellect, lower, upper), createSubTree(Stat.Stamina, lower, upper), chance));
	}
	
	public void createMonkeyTree(int lower, int upper, double chance) {
		addToList(createTree(" of the Monkey", createSubTree(Stat.Agility, lower, upper), createSubTree(Stat.Stamina, lower, upper), chance));
	}
	
	public void createOwlTree(int lower, int upper, double chance) {
		addToList(createTree(" of the Owl", createSubTree(Stat.Intellect, lower, upper), createSubTree(Stat.Spirit, lower, upper), chance));
	}
	
	public void createTigerTree(int lower, int upper, double chance) {
		addToList(createTree(" of the Tiger", createSubTree(Stat.Agility, lower, upper), createSubTree(Stat.Strength, lower, upper), chance));
	}
	
	/**
	 * @see db.randomBoni.weapons.melee.OneHandAxes#fillZulianHacker()
	 */
	public void createTigerTreeDifferent(int lowerF, int upperF, int lowerS, int upperS, double chance) {
		addToList(createTree(" of the Tiger", createSubTree(Stat.Agility, lowerF, upperF), createSubTree(Stat.Strength, lowerS, upperS), chance));
	}
	
	public void createWhaleTree(int lower, int upper, double chance) {
		addToList(createTree(" of the Whale", createSubTree(Stat.Spirit, lower, upper), createSubTree(Stat.Stamina, lower, upper), chance));
	}
	
	public void createWolfTree(int lower, int upper, double chance) {
		addToList(createTree(" of the Wolf", createSubTree(Stat.Agility, lower, upper), createSubTree(Stat.Spirit, lower, upper), chance));
	}
	
	private SubTree createSubTree(Stat attribute, int lower, int upper) {
		return new SubTree(name, attribute, lower, upper);
	}
	
	private Tree createTree(String modName, SubTree left, SubTree right, double dropChance) {
		return new Tree(modName, left, right, dropChance);
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
	
	public String toString() {
		String res = getName() + " - " + getId() + ":" + System.lineSeparator();
		ArrayList<Tree> boni = getBoni();
		double chance = 0.0;
		for (int i = 0; i < boni.size(); i++) {
			Tree t = boni.get(i);
			SubTree left = t.getLeft();
			SubTree right = null;
			if (t.getRight() != null)
				right = t.getRight();
			if (left.getLower() != left.getUpper())
				res = res.concat(name + t.getName() + ": +(" + left.getLower() + "-" + left.getUpper() + ") " + left.getAttribute());
			else
				res = res.concat(name + t.getName() + ": +" + left.getLower() + " " + left.getAttribute()); 
			if (right != null)
				if (right.getLower() != right.getUpper())
					res = res.concat(", +(" + right.getLower() + "-" + right.getUpper() + ") " + right.getAttribute());
				else
					res = res.concat(", +" + right.getLower() + " " + right.getAttribute());
			res = res.concat(" - " + t.getDropChance() + "%");
			if (i != boni.size()-1)
				res = res.concat(System.lineSeparator());
			chance += t.getDropChance();
		}
		res = res.concat(System.lineSeparator() + "DropChance for all boni of \"" + getName() + "\" is: " + chance);
		return res;
	}
}

class Tree {
	private String name;
	private SubTree left, right;
	private double dropChance;
	
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

class SubTree {
	private Stat attribute;
	private int lower, upper;
	
	public SubTree(String name, Stat attribute, int lower, int upper) {
		String[] nameArray = {"Acrobatic Staff", "Diviner Long Staff", 
				"Magus Long Staff", "Spiritchaser Staff", "Thaumaturgist Staff", 
				"Sequoia Branch", "Stoneclutter Claymore", "Tusker Sword", "Blasthorn Bow", 
				"Quillfire Bow",};
		this.attribute = attribute;
		this.lower = lower;
		this.upper = upper;
		if (lower > upper) {
			System.err.println("Lower is greater than upper at an Instance of: \"" + name + "\". Stat is " + this.attribute + ". Creation of Database has stopped.");
			System.exit(0);
		}
		else if ((upper - lower) > 10) {
			boolean print = true;
			for (String s : nameArray)
				if (name.equals(s))
					print = false;
			if (print)
				System.err.println("Lower is a lot lower than upper at an Instance of: \"" + name + "\". Stat is " + this.attribute + ". You might want to check this.");
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
