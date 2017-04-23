package db.randomBoni.weapons.ranged;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class Wands {

	private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!
	
	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		/*Done*/
		/*ToDo*/15282, 5215, 15281, 15279, 15283, 5216, 15280
	};
	
	public static ArrayList<MultiBonus> getList() {
		if (list == null)
			fill();
		return list;
	}
	
	public static int[] getIDs() {
		return ids;
	}
	
	private static void fill() {
		list = new ArrayList<MultiBonus>();
		fillDragonFinger();
	}
	
	private static void fillDragonFinger() {
		int id = 15282;
		MultiBonus dragonFinger = new MultiBonus("Dragon Finger", id);
		dragonFinger.addToList(dragonFinger.createTree(" of Arcane Wrath", dragonFinger.createSubTree(Stat.ArcaneSpellDamage, 11, 11), null, 3.0));
		dragonFinger.addToList(dragonFinger.createTree(" of Fiery Wrath", dragonFinger.createSubTree(Stat.FireSpellDamage, 11, 21), null, 4.0));
		dragonFinger.addToList(dragonFinger.createTree(" of Frozen Wrath", dragonFinger.createSubTree(Stat.FrostSpellDamage, 11, 11), null, 3.2));
		dragonFinger.addToList(dragonFinger.createTree(" of Healing", dragonFinger.createSubTree(Stat.SpellPower, 9, 9), null, 5.4));
		dragonFinger.addToList(dragonFinger.createTree(" of Intellect", dragonFinger.createSubTree(Stat.Intellect, 8, 8), null, 5.0));
		dragonFinger.addToList(dragonFinger.createTree(" of Shadow Wrath", dragonFinger.createSubTree(Stat.ShadowSpellDamage, 11, 11), null, 2.1));
		dragonFinger.addToList(dragonFinger.createTree(" of Spirit", dragonFinger.createSubTree(Stat.Spirit, 8, 8), null, 5.2));
		dragonFinger.addToList(dragonFinger.createTree(" of Stamina", dragonFinger.createSubTree(Stat.Stamina, 8, 8), null, 5.1));
		
		dragonFinger.addToList(dragonFinger.createTree(" of the Boar", dragonFinger.createSubTree(Stat.Spirit, 5, 5), dragonFinger.createSubTree(Stat.Strength, 5, 5), 9.4));
		dragonFinger.addToList(dragonFinger.createTree("of the Eagle", dragonFinger.createSubTree(Stat.Agility, 5, 5), dragonFinger.createSubTree(Stat.Stamina, 5, 5), 9.4));
		dragonFinger.addToList(dragonFinger.createTree(" of the Falcon", dragonFinger.createSubTree(Stat.Agility, 5, 5), dragonFinger.createSubTree(Stat.Intellect, 5, 5), 9.7));
		dragonFinger.addToList(dragonFinger.createTree(" of the Gorilla", dragonFinger.createSubTree(Stat.Intellect, 5, 5), dragonFinger.createSubTree(Stat.Strength, 5, 5), 9.5));
		dragonFinger.addToList(dragonFinger.createTree(" of the Owl", dragonFinger.createSubTree(Stat.Intellect, 5, 5), dragonFinger.createSubTree(Stat.Spirit, 5, 5), 9.5));
		dragonFinger.addToList(dragonFinger.createTree(" of the Whale", dragonFinger.createSubTree(Stat.Spirit, 5, 5), dragonFinger.createSubTree(Stat.Stamina, 5, 5), 9.8));
	}

	public static void main(String[] args) {
		fill();
	}
}
