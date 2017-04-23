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
	
	public SubTree createSubTree(Stat attribute, int lower, int upper) {
		return new SubTree(name, attribute, lower, upper);
	}
	
	public Tree createTree(String modName, SubTree left, SubTree right, double dropChance) {
		return new Tree(modName, left, right, dropChance);
	}
	
	public void addToList(Tree mod) {
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
		String[] nameArray = {"Grunt Axe", "Acrobatic Staff", "Diviner Long Staff", 
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
