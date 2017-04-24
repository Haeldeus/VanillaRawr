package db.randomBoni.weapons.ranged;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class Wands {
	
	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		15282, 5215, 15281, 15279, 15283, 5216, 15280
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
		fillEmberWand();
		fillGlowstarRod();
		fillIvoryWand();
		fillLunarWand();
		fillUmbralWand();
		fillWizardsHand();
/*		System.out.println(list.get(0));
		System.out.println("-------------");
		System.out.println(list.get(1));
		System.out.println("-------------");
		System.out.println(list.get(2));
		System.out.println("-------------");
		System.out.println(list.get(3));
		System.out.println("-------------");
		System.out.println(list.get(4));
		System.out.println("-------------");
		System.out.println(list.get(5));
		System.out.println("-------------");
		System.out.println(list.get(6));
		System.out.println("-------------"); */
	}
	
	private static void fillWizardsHand() {
		int id = 15280;
		MultiBonus wizardsHand = new MultiBonus("Wizard's Hand", id);
		wizardsHand.addToList(wizardsHand.createTree(" of Arcane Wrath", wizardsHand.createSubTree(Stat.ArcaneSpellDamage, 10, 10), null, 3.6));
		wizardsHand.addToList(wizardsHand.createTree(" of Fiery Wrath", wizardsHand.createSubTree(Stat.FireSpellDamage, 10, 10), null, 3.9));
		wizardsHand.addToList(wizardsHand.createTree(" of Frozen Wrath", wizardsHand.createSubTree(Stat.FrostSpellDamage, 10, 10), null, 3.1));
		wizardsHand.addToList(wizardsHand.createTree(" of Healing", wizardsHand.createSubTree(Stat.SpellPower, 8, 15), null, 4.3));
		wizardsHand.addToList(wizardsHand.createTree(" of Intellect", wizardsHand.createSubTree(Stat.Intellect, 7, 7), null, 3.9));
		wizardsHand.addToList(wizardsHand.createTree(" of Shadow Wrath", wizardsHand.createSubTree(Stat.ShadowSpellDamage, 10, 10), null, 1.4));
		wizardsHand.addToList(wizardsHand.createTree(" of Spirit", wizardsHand.createSubTree(Stat.Spirit, 7, 7), null, 5.6));
		wizardsHand.addToList(wizardsHand.createTree(" of Stamina", wizardsHand.createSubTree(Stat.Stamina, 7, 7), null, 4.5));
		
		wizardsHand.addToList(wizardsHand.createTree(" of the Boar", wizardsHand.createSubTree(Stat.Spirit, 4, 5), wizardsHand.createSubTree(Stat.Strength, 4, 5), 12.4));
		wizardsHand.addToList(wizardsHand.createTree("of the Eagle", wizardsHand.createSubTree(Stat.Agility, 4, 5), wizardsHand.createSubTree(Stat.Stamina, 4, 5), 6.3));
		wizardsHand.addToList(wizardsHand.createTree(" of the Falcon", wizardsHand.createSubTree(Stat.Agility, 4, 5), wizardsHand.createSubTree(Stat.Intellect, 4, 5), 10.6));
		wizardsHand.addToList(wizardsHand.createTree(" of the Gorilla", wizardsHand.createSubTree(Stat.Intellect, 4, 5), wizardsHand.createSubTree(Stat.Strength, 4, 5), 10.8));
		wizardsHand.addToList(wizardsHand.createTree(" of the Owl", wizardsHand.createSubTree(Stat.Intellect, 4, 5), wizardsHand.createSubTree(Stat.Spirit, 4, 5), 7.9));
		wizardsHand.addToList(wizardsHand.createTree(" of the Whale", wizardsHand.createSubTree(Stat.Spirit, 4, 5), wizardsHand.createSubTree(Stat.Stamina, 4, 5), 9.2));
		wizardsHand.addToList(wizardsHand.createTree(" of the Wolf", wizardsHand.createSubTree(Stat.Agility, 4, 5), wizardsHand.createSubTree(Stat.Spirit, 4, 5), 12.5));
		list.add(wizardsHand);
	}

	private static void fillUmbralWand() {
		int id = 5216;
		MultiBonus umbralWand = new MultiBonus("Umbral Wand", id);
		umbralWand.addToList(umbralWand.createTree(" of Arcane Wrath", umbralWand.createSubTree(Stat.ArcaneSpellDamage, 9, 9), null, 4.1));
		umbralWand.addToList(umbralWand.createTree(" of Fiery Wrath", umbralWand.createSubTree(Stat.FireSpellDamage, 9, 9), null, 4.3));
		umbralWand.addToList(umbralWand.createTree(" of Frozen Wrath", umbralWand.createSubTree(Stat.FrostSpellDamage, 9, 14), null, 3.4));
		umbralWand.addToList(umbralWand.createTree(" of Healing", umbralWand.createSubTree(Stat.SpellPower, 7, 7), null, 3.9));
		umbralWand.addToList(umbralWand.createTree(" of Intellect", umbralWand.createSubTree(Stat.Intellect, 6, 6), null, 3.6));
		umbralWand.addToList(umbralWand.createTree(" of Shadow Wrath", umbralWand.createSubTree(Stat.ShadowSpellDamage, 9, 9), null, 1.3));
		umbralWand.addToList(umbralWand.createTree(" of Spirit", umbralWand.createSubTree(Stat.Spirit, 6, 6), null, 5.3));
		umbralWand.addToList(umbralWand.createTree(" of Stamina", umbralWand.createSubTree(Stat.Stamina, 6, 6), null, 4.4));
		
		umbralWand.addToList(umbralWand.createTree(" of the Boar", umbralWand.createSubTree(Stat.Spirit, 3, 4), umbralWand.createSubTree(Stat.Strength, 3, 4), 13.5));
		umbralWand.addToList(umbralWand.createTree("of the Eagle", umbralWand.createSubTree(Stat.Agility, 3, 4), umbralWand.createSubTree(Stat.Stamina, 3, 4), 6.0));
		umbralWand.addToList(umbralWand.createTree(" of the Falcon", umbralWand.createSubTree(Stat.Agility, 3, 4), umbralWand.createSubTree(Stat.Intellect, 3, 4), 10.3));
		umbralWand.addToList(umbralWand.createTree(" of the Gorilla", umbralWand.createSubTree(Stat.Intellect, 3, 4), umbralWand.createSubTree(Stat.Strength, 3, 4), 10.6));
		umbralWand.addToList(umbralWand.createTree(" of the Owl", umbralWand.createSubTree(Stat.Intellect, 3, 4), umbralWand.createSubTree(Stat.Spirit, 3, 4), 7.4));
		umbralWand.addToList(umbralWand.createTree(" of the Whale", umbralWand.createSubTree(Stat.Spirit, 3, 4), umbralWand.createSubTree(Stat.Stamina, 3, 4), 9.0));
		umbralWand.addToList(umbralWand.createTree(" of the Wolf", umbralWand.createSubTree(Stat.Agility, 3, 4), umbralWand.createSubTree(Stat.Spirit, 3, 4), 13.0));
		list.add(umbralWand);
	}

	private static void fillLunarWand() {
		int id = 15283;
		MultiBonus lunarWand = new MultiBonus("Lunar Wand", id);
		lunarWand.addToList(lunarWand.createTree(" of Arcane Wrath", lunarWand.createSubTree(Stat.ArcaneSpellDamage, 13, 13), null, 3.0));
		lunarWand.addToList(lunarWand.createTree(" of Fiery Wrath", lunarWand.createSubTree(Stat.FireSpellDamage, 13, 13), null, 4.4));
		lunarWand.addToList(lunarWand.createTree(" of Frozen Wrath", lunarWand.createSubTree(Stat.FrostSpellDamage, 13, 13), null, 3.3));
		lunarWand.addToList(lunarWand.createTree(" of Healing", lunarWand.createSubTree(Stat.SpellPower, 11, 11), null, 5.2));
		lunarWand.addToList(lunarWand.createTree(" of Intellect", lunarWand.createSubTree(Stat.Intellect, 9, 9), null, 5.3));
		lunarWand.addToList(lunarWand.createTree(" of Shadow Wrath", lunarWand.createSubTree(Stat.ShadowSpellDamage, 13, 13), null, 3.2));
		lunarWand.addToList(lunarWand.createTree(" of Spirit", lunarWand.createSubTree(Stat.Spirit, 9, 9), null, 4.5));
		lunarWand.addToList(lunarWand.createTree(" of Stamina", lunarWand.createSubTree(Stat.Stamina, 9, 9), null, 6.1));
		
		lunarWand.addToList(lunarWand.createTree(" of the Boar", lunarWand.createSubTree(Stat.Spirit, 5, 6), lunarWand.createSubTree(Stat.Strength, 5, 6), 9.1));
		lunarWand.addToList(lunarWand.createTree("of the Eagle", lunarWand.createSubTree(Stat.Agility, 5, 6), lunarWand.createSubTree(Stat.Stamina, 5, 6), 10.8));
		lunarWand.addToList(lunarWand.createTree(" of the Falcon", lunarWand.createSubTree(Stat.Agility, 5, 6), lunarWand.createSubTree(Stat.Intellect, 5, 6), 9.0));
		lunarWand.addToList(lunarWand.createTree(" of the Gorilla", lunarWand.createSubTree(Stat.Intellect, 5, 6), lunarWand.createSubTree(Stat.Strength, 5, 6), 8.9));
		lunarWand.addToList(lunarWand.createTree(" of the Owl", lunarWand.createSubTree(Stat.Intellect, 5, 6), lunarWand.createSubTree(Stat.Spirit, 5, 6), 9.0));
		lunarWand.addToList(lunarWand.createTree(" of the Whale", lunarWand.createSubTree(Stat.Spirit, 5, 6), lunarWand.createSubTree(Stat.Stamina, 5, 6), 9.3));
		lunarWand.addToList(lunarWand.createTree(" of the Wolf", lunarWand.createSubTree(Stat.Agility, 5, 6), lunarWand.createSubTree(Stat.Spirit, 5, 6), 9.0));
		list.add(lunarWand);
	}

	private static void fillIvoryWand() {
		int id = 15279;
		MultiBonus ivoryWand = new MultiBonus("Ivory Wand", id);
		ivoryWand.addToList(ivoryWand.createTree(" of Arcane Wrath", ivoryWand.createSubTree(Stat.ArcaneSpellDamage, 9, 10), null, 3.6));
		ivoryWand.addToList(ivoryWand.createTree(" of Fiery Wrath", ivoryWand.createSubTree(Stat.FireSpellDamage, 9, 10), null, 4.2));
		ivoryWand.addToList(ivoryWand.createTree(" of Frozen Wrath", ivoryWand.createSubTree(Stat.FrostSpellDamage, 9, 10), null, 2.9));
		ivoryWand.addToList(ivoryWand.createTree(" of Healing", ivoryWand.createSubTree(Stat.SpellPower, 7, 14), null, 4.3));
		ivoryWand.addToList(ivoryWand.createTree(" of Intellect", ivoryWand.createSubTree(Stat.Intellect, 6, 7), null, 4.0));
		ivoryWand.addToList(ivoryWand.createTree(" of Shadow Wrath", ivoryWand.createSubTree(Stat.ShadowSpellDamage, 9, 10), null, 1.5));
		ivoryWand.addToList(ivoryWand.createTree(" of Spirit", ivoryWand.createSubTree(Stat.Spirit, 6, 7), null, 5.3));
		ivoryWand.addToList(ivoryWand.createTree(" of Stamina", ivoryWand.createSubTree(Stat.Stamina, 6, 7), null, 4.6));
		
		ivoryWand.addToList(ivoryWand.createTree(" of the Boar", ivoryWand.createSubTree(Stat.Spirit, 4, 5), ivoryWand.createSubTree(Stat.Strength, 4, 5), 12.3));
		ivoryWand.addToList(ivoryWand.createTree("of the Eagle", ivoryWand.createSubTree(Stat.Agility, 4, 5), ivoryWand.createSubTree(Stat.Stamina, 4, 5), 6.3));
		ivoryWand.addToList(ivoryWand.createTree(" of the Falcon", ivoryWand.createSubTree(Stat.Agility, 4, 5), ivoryWand.createSubTree(Stat.Intellect, 4, 5), 10.5));
		ivoryWand.addToList(ivoryWand.createTree(" of the Gorilla", ivoryWand.createSubTree(Stat.Intellect, 4, 5), ivoryWand.createSubTree(Stat.Strength, 4, 5), 11.2));
		ivoryWand.addToList(ivoryWand.createTree(" of the Owl", ivoryWand.createSubTree(Stat.Intellect, 4, 5), ivoryWand.createSubTree(Stat.Spirit, 4, 5), 7.8));
		ivoryWand.addToList(ivoryWand.createTree(" of the Whale", ivoryWand.createSubTree(Stat.Spirit, 4, 5), ivoryWand.createSubTree(Stat.Stamina, 4, 5), 9.4));
		ivoryWand.addToList(ivoryWand.createTree(" of the Wolf", ivoryWand.createSubTree(Stat.Agility, 4, 5), ivoryWand.createSubTree(Stat.Spirit, 4, 5), 12.1));
		list.add(ivoryWand);
	}

	private static void fillGlowstarRod() {
		int id = 15281;
		MultiBonus glowstarRod = new MultiBonus("Glowstar Rod", id);
		glowstarRod.addToList(glowstarRod.createTree(" of Arcane Wrath", glowstarRod.createSubTree(Stat.ArcaneSpellDamage, 10, 11), null, 3.2));
		glowstarRod.addToList(glowstarRod.createTree(" of Fiery Wrath", glowstarRod.createSubTree(Stat.FireSpellDamage, 10, 20), null, 4.3));
		glowstarRod.addToList(glowstarRod.createTree(" of Frozen Wrath", glowstarRod.createSubTree(Stat.FrostSpellDamage, 10, 11), null, 2.9));
		glowstarRod.addToList(glowstarRod.createTree(" of Healing", glowstarRod.createSubTree(Stat.SpellPower, 8, 16), null, 5.2));
		glowstarRod.addToList(glowstarRod.createTree(" of Intellect", glowstarRod.createSubTree(Stat.Intellect, 7, 8), null, 5.2));
		glowstarRod.addToList(glowstarRod.createTree(" of Shadow Wrath", glowstarRod.createSubTree(Stat.ShadowSpellDamage, 10, 11), null, 2.2));
		glowstarRod.addToList(glowstarRod.createTree(" of Spirit", glowstarRod.createSubTree(Stat.Spirit, 7, 8), null, 5.0));
		glowstarRod.addToList(glowstarRod.createTree(" of Stamina", glowstarRod.createSubTree(Stat.Stamina, 7, 8), null, 5.0));
		
		glowstarRod.addToList(glowstarRod.createTree(" of the Boar", glowstarRod.createSubTree(Stat.Spirit, 4, 5), glowstarRod.createSubTree(Stat.Strength, 4, 5), 10.3));
		glowstarRod.addToList(glowstarRod.createTree("of the Eagle", glowstarRod.createSubTree(Stat.Agility, 4, 5), glowstarRod.createSubTree(Stat.Stamina, 4, 5), 8.3));
		glowstarRod.addToList(glowstarRod.createTree(" of the Falcon", glowstarRod.createSubTree(Stat.Agility, 4, 5), glowstarRod.createSubTree(Stat.Intellect, 4, 5), 9.9));
		glowstarRod.addToList(glowstarRod.createTree(" of the Gorilla", glowstarRod.createSubTree(Stat.Intellect, 4, 5), glowstarRod.createSubTree(Stat.Strength, 4, 5), 10.3));
		glowstarRod.addToList(glowstarRod.createTree(" of the Owl", glowstarRod.createSubTree(Stat.Intellect, 4, 5), glowstarRod.createSubTree(Stat.Spirit, 4, 5), 9.0));
		glowstarRod.addToList(glowstarRod.createTree(" of the Whale", glowstarRod.createSubTree(Stat.Spirit, 4, 5), glowstarRod.createSubTree(Stat.Stamina, 4, 5), 9.4));
		glowstarRod.addToList(glowstarRod.createTree(" of the Wolf", glowstarRod.createSubTree(Stat.Agility, 4, 5), glowstarRod.createSubTree(Stat.Spirit, 4, 5), 10.1));
		list.add(glowstarRod);
	}

	private static void fillEmberWand() {
		int id = 5215;
		MultiBonus emberWand = new MultiBonus("Ember Wand", id);
		emberWand.addToList(emberWand.createTree(" of Arcane Wrath", emberWand.createSubTree(Stat.ArcaneSpellDamage, 7, 7), null, 3.9));
		emberWand.addToList(emberWand.createTree(" of Fiery Wrath", emberWand.createSubTree(Stat.FireSpellDamage, 7, 7), null, 4.1));
		emberWand.addToList(emberWand.createTree(" of Frozen Wrath", emberWand.createSubTree(Stat.FrostSpellDamage, 7, 7), null, 3.3));
		emberWand.addToList(emberWand.createTree(" of Healing", emberWand.createSubTree(Stat.SpellPower, 6, 6), null, 4.2));
		emberWand.addToList(emberWand.createTree(" of Intellect", emberWand.createSubTree(Stat.Intellect, 5, 5), null, 3.8));
		emberWand.addToList(emberWand.createTree(" of Shadow Wrath", emberWand.createSubTree(Stat.ShadowSpellDamage, 7, 7), null, 1.3));
		emberWand.addToList(emberWand.createTree(" of Spirit", emberWand.createSubTree(Stat.Spirit, 5, 5), null, 5.7));
		emberWand.addToList(emberWand.createTree(" of Stamina", emberWand.createSubTree(Stat.Stamina, 5, 5), null, 4.4));
		
		emberWand.addToList(emberWand.createTree(" of the Boar", emberWand.createSubTree(Stat.Spirit, 3, 4), emberWand.createSubTree(Stat.Strength, 3, 4), 13.0));
		emberWand.addToList(emberWand.createTree("of the Eagle", emberWand.createSubTree(Stat.Agility, 3, 4), emberWand.createSubTree(Stat.Stamina, 3, 4), 6.2));
		emberWand.addToList(emberWand.createTree(" of the Falcon", emberWand.createSubTree(Stat.Agility, 3, 4), emberWand.createSubTree(Stat.Intellect, 3, 4), 10.1));
		emberWand.addToList(emberWand.createTree(" of the Gorilla", emberWand.createSubTree(Stat.Intellect, 3, 4), emberWand.createSubTree(Stat.Strength, 3, 4), 10.7));
		emberWand.addToList(emberWand.createTree(" of the Owl", emberWand.createSubTree(Stat.Intellect, 3, 4), emberWand.createSubTree(Stat.Spirit, 3, 4), 7.3));
		emberWand.addToList(emberWand.createTree(" of the Whale", emberWand.createSubTree(Stat.Spirit, 3, 4), emberWand.createSubTree(Stat.Stamina, 3, 4), 8.8));
		emberWand.addToList(emberWand.createTree(" of the Wolf", emberWand.createSubTree(Stat.Agility, 3, 4), emberWand.createSubTree(Stat.Spirit, 3, 4), 13.1));
		list.add(emberWand);
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
		dragonFinger.addToList(dragonFinger.createTree(" of the Wolf", dragonFinger.createSubTree(Stat.Agility, 5, 5), dragonFinger.createSubTree(Stat.Spirit, 5, 5), 9.5));
		list.add(dragonFinger);
	}
}
