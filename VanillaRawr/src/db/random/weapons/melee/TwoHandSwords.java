package db.random.weapons.melee;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class TwoHandSwords {

	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		8199, 15253, 3206, 15254, 15258, 3196, 1625, 15255, 15248, 15250, 15251, 15256, 4567, 
		15249, 15257, 3192, 3197, 8178, 15252
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
		fillBattlefieldDestroyer();
		fillBeheadingBlade();
		fillCavalierTwoHander();
		fillDarkEspadon();
		fillDivineWarblade();
		fillEdgedBastardSword();
		fillExquisiteFlamberge();
		fillGallantFlamberge();
		fillGleamingClaymore();
		fillGlimmeringFlamberge();
		fillHeadstrikerSword();
		fillMassacreSword();
		fillMercSword();
		fillPolishedZweihander();
		fillShinBlade();
		fillShortBastardSword();
		fillStoneclutterClaymore();
		fillTrainingSword();
		fillTuskerSword();
/*		System.out.println(list.get(0));
		System.out.println("------------");
		System.out.println(list.get(1));
		System.out.println("------------");
		System.out.println(list.get(2));
		System.out.println("------------");
		System.out.println(list.get(3));
		System.out.println("------------");
		System.out.println(list.get(4));
		System.out.println("------------");
		System.out.println(list.get(5));
		System.out.println("------------");
		System.out.println(list.get(6));
		System.out.println("------------");
		System.out.println(list.get(7));
		System.out.println("------------");
		System.out.println(list.get(8));
		System.out.println("------------");
		System.out.println(list.get(9));
		System.out.println("------------");
		System.out.println(list.get(10));
		System.out.println("------------");
		System.out.println(list.get(11));
		System.out.println("------------");
		System.out.println(list.get(12));
		System.out.println("------------");
		System.out.println(list.get(13));
		System.out.println("------------");
		System.out.println(list.get(14));
		System.out.println("------------");
		System.out.println(list.get(15));
		System.out.println("------------");
		System.out.println(list.get(16));
		System.out.println("------------");
		System.out.println(list.get(17));
		System.out.println("------------");
		System.out.println(list.get(18));
		System.out.println("------------"); */
	}
	
	private static void fillTuskerSword() {
		int id = 15252;
		MultiBonus tuskerSword = new MultiBonus("Tusker Sword", id);
		tuskerSword.addToList(tuskerSword.createTree(" of Agility", tuskerSword.createSubTree(Stat.Agility, 21, 22), null, 4.6));
		tuskerSword.addToList(tuskerSword.createTree(" of Power", tuskerSword.createSubTree(Stat.AttackPower, 24, 44), null, 2.5));
		tuskerSword.addToList(tuskerSword.createTree(" of Stamina", tuskerSword.createSubTree(Stat.Stamina, 21, 22), null, 6.4));
		tuskerSword.addToList(tuskerSword.createTree(" of Strength", tuskerSword.createSubTree(Stat.Strength, 21, 22), null, 6.7));
		
		tuskerSword.addToList(tuskerSword.createTree(" of the Bear", tuskerSword.createSubTree(Stat.Stamina, 13, 14), tuskerSword.createSubTree(Stat.Strength, 13, 14), 11.6));
		tuskerSword.addToList(tuskerSword.createTree(" of the Boar", tuskerSword.createSubTree(Stat.Spirit, 13, 14), tuskerSword.createSubTree(Stat.Strength, 13, 14), 12.3));
		tuskerSword.addToList(tuskerSword.createTree(" of the Eagle", tuskerSword.createSubTree(Stat.Intellect, 13, 14), tuskerSword.createSubTree(Stat.Stamina, 13, 14), 11.7));
		tuskerSword.addToList(tuskerSword.createTree(" of the Monkey", tuskerSword.createSubTree(Stat.Agility, 13, 14), tuskerSword.createSubTree(Stat.Stamina, 13, 14), 9.4));
		tuskerSword.addToList(tuskerSword.createTree(" of the Tiger", tuskerSword.createSubTree(Stat.Agility, 13, 14), tuskerSword.createSubTree(Stat.Strength, 13, 14), 11.3));
		tuskerSword.addToList(tuskerSword.createTree(" of the Whale", tuskerSword.createSubTree(Stat.Spirit, 13, 14), tuskerSword.createSubTree(Stat.Stamina, 13, 14), 11.9));
		tuskerSword.addToList(tuskerSword.createTree(" of the Wolf", tuskerSword.createSubTree(Stat.Agility, 13, 14), tuskerSword.createSubTree(Stat.Spirit, 13, 14), 11.6));
		list.add(tuskerSword);
	}

	private static void fillTrainingSword() {
		int id = 8178;
		MultiBonus trainingSword = new MultiBonus("Training Sword", id);
		trainingSword.addToList(trainingSword.createTree(" of Agility", trainingSword.createSubTree(Stat.Agility, 3, 4), null, 6.2));
		trainingSword.addToList(trainingSword.createTree(" of Power", trainingSword.createSubTree(Stat.AttackPower, 6, 8), null, 2.5));
		trainingSword.addToList(trainingSword.createTree(" of Stamina", trainingSword.createSubTree(Stat.Stamina, 3, 4), null, 5.9));
		trainingSword.addToList(trainingSword.createTree(" of Strength", trainingSword.createSubTree(Stat.Strength, 3, 4), null, 5.5));
		
		trainingSword.addToList(trainingSword.createTree(" of the Bear", trainingSword.createSubTree(Stat.Stamina, 1, 2), trainingSword.createSubTree(Stat.Strength, 1, 2), 10.1));
		trainingSword.addToList(trainingSword.createTree(" of the Boar", trainingSword.createSubTree(Stat.Spirit, 1, 2), trainingSword.createSubTree(Stat.Strength, 1, 2), 11.6));
		trainingSword.addToList(trainingSword.createTree(" of the Eagle", trainingSword.createSubTree(Stat.Intellect, 1, 2), trainingSword.createSubTree(Stat.Stamina, 1, 2), 12.1));
		trainingSword.addToList(trainingSword.createTree(" of the Monkey", trainingSword.createSubTree(Stat.Agility, 1, 2), trainingSword.createSubTree(Stat.Stamina, 1, 2), 11.0));
		trainingSword.addToList(trainingSword.createTree(" of the Tiger", trainingSword.createSubTree(Stat.Agility, 1, 2), trainingSword.createSubTree(Stat.Strength, 1, 2), 10.8));
		trainingSword.addToList(trainingSword.createTree(" of the Whale", trainingSword.createSubTree(Stat.Spirit, 1, 2), trainingSword.createSubTree(Stat.Stamina, 1, 2), 12.1));
		trainingSword.addToList(trainingSword.createTree(" of the Wolf", trainingSword.createSubTree(Stat.Agility, 1, 2), trainingSword.createSubTree(Stat.Spirit, 1, 2), 12.1));
		list.add(trainingSword);
	}

	private static void fillStoneclutterClaymore() {
		int id = 3197;
		MultiBonus stoneclutterClaymore = new MultiBonus("Stoneclutter Claymore", id);
		stoneclutterClaymore.addToList(stoneclutterClaymore.createTree(" of Agility", stoneclutterClaymore.createSubTree(Stat.Agility, 13, 14), null, 4.9));
		stoneclutterClaymore.addToList(stoneclutterClaymore.createTree(" of Power", stoneclutterClaymore.createSubTree(Stat.AttackPower, 16, 28), null, 2.5));
		stoneclutterClaymore.addToList(stoneclutterClaymore.createTree(" of Stamina", stoneclutterClaymore.createSubTree(Stat.Stamina, 13, 14), null, 6.6));
		stoneclutterClaymore.addToList(stoneclutterClaymore.createTree(" of Strength", stoneclutterClaymore.createSubTree(Stat.Strength, 13, 14), null, 6.4));
		
		stoneclutterClaymore.addToList(stoneclutterClaymore.createTree(" of the Bear", stoneclutterClaymore.createSubTree(Stat.Stamina, 8, 9), stoneclutterClaymore.createSubTree(Stat.Strength, 8, 9), 10.6));
		stoneclutterClaymore.addToList(stoneclutterClaymore.createTree(" of the Boar", stoneclutterClaymore.createSubTree(Stat.Spirit, 8, 9), stoneclutterClaymore.createSubTree(Stat.Strength, 8, 9), 12.9));
		stoneclutterClaymore.addToList(stoneclutterClaymore.createTree(" of the Eagle", stoneclutterClaymore.createSubTree(Stat.Intellect, 8, 9), stoneclutterClaymore.createSubTree(Stat.Stamina, 8, 9), 11.6));
		stoneclutterClaymore.addToList(stoneclutterClaymore.createTree(" of the Monkey", stoneclutterClaymore.createSubTree(Stat.Agility, 8, 9), stoneclutterClaymore.createSubTree(Stat.Stamina, 8, 9), 9.0));
		stoneclutterClaymore.addToList(stoneclutterClaymore.createTree(" of the Tiger", stoneclutterClaymore.createSubTree(Stat.Agility, 8, 9), stoneclutterClaymore.createSubTree(Stat.Strength, 8, 9), 10.6));
		stoneclutterClaymore.addToList(stoneclutterClaymore.createTree(" of the Whale", stoneclutterClaymore.createSubTree(Stat.Spirit, 8, 9), stoneclutterClaymore.createSubTree(Stat.Stamina, 8, 9), 12.9));
		stoneclutterClaymore.addToList(stoneclutterClaymore.createTree(" of the Wolf", stoneclutterClaymore.createSubTree(Stat.Agility, 8, 9), stoneclutterClaymore.createSubTree(Stat.Spirit, 8, 9), 12.0));
		list.add(stoneclutterClaymore);
	}

	private static void fillShortBastardSword() {
		int id = 3192;
		MultiBonus shortBastardSword = new MultiBonus("Short Bastard Sword", id);
		shortBastardSword.addToList(shortBastardSword.createTree(" of Agility", shortBastardSword.createSubTree(Stat.Agility, 3, 4), null, 6.0));
		shortBastardSword.addToList(shortBastardSword.createTree(" of Power", shortBastardSword.createSubTree(Stat.AttackPower, 6, 8), null, 2.5));
		shortBastardSword.addToList(shortBastardSword.createTree(" of Stamina", shortBastardSword.createSubTree(Stat.Stamina, 3, 4), null, 5.7));
		shortBastardSword.addToList(shortBastardSword.createTree(" of Strength", shortBastardSword.createSubTree(Stat.Strength, 3, 4), null, 5.4));
		
		shortBastardSword.addToList(shortBastardSword.createTree(" of the Bear", shortBastardSword.createSubTree(Stat.Stamina, 1, 2), shortBastardSword.createSubTree(Stat.Strength, 1, 2), 9.4));
		shortBastardSword.addToList(shortBastardSword.createTree(" of the Boar", shortBastardSword.createSubTree(Stat.Spirit, 1, 2), shortBastardSword.createSubTree(Stat.Strength, 1, 2), 12.2));
		shortBastardSword.addToList(shortBastardSword.createTree(" of the Eagle", shortBastardSword.createSubTree(Stat.Intellect, 1, 2), shortBastardSword.createSubTree(Stat.Stamina, 1, 2), 12.1));
		shortBastardSword.addToList(shortBastardSword.createTree(" of the Monkey", shortBastardSword.createSubTree(Stat.Agility, 1, 2), shortBastardSword.createSubTree(Stat.Stamina, 1, 2), 10.6));
		shortBastardSword.addToList(shortBastardSword.createTree(" of the Tiger", shortBastardSword.createSubTree(Stat.Agility, 1, 2), shortBastardSword.createSubTree(Stat.Strength, 1, 2), 10.3));
		shortBastardSword.addToList(shortBastardSword.createTree(" of the Whale", shortBastardSword.createSubTree(Stat.Spirit, 1, 2), shortBastardSword.createSubTree(Stat.Stamina, 1, 2), 13.1));
		shortBastardSword.addToList(shortBastardSword.createTree(" of the Wolf", shortBastardSword.createSubTree(Stat.Agility, 1, 2), shortBastardSword.createSubTree(Stat.Spirit, 1, 2), 12.7));
		list.add(shortBastardSword);
	}

	private static void fillShinBlade() {
		int id = 15257;
		MultiBonus shinBlade = new MultiBonus("Shin Blade", id);
		shinBlade.addToList(shinBlade.createTree(" of Agility", shinBlade.createSubTree(Stat.Agility, 27, 28), null, 5.9));
		shinBlade.addToList(shinBlade.createTree(" of Power", shinBlade.createSubTree(Stat.AttackPower, 54, 56), null, 2.8));
		shinBlade.addToList(shinBlade.createTree(" of Stamina", shinBlade.createSubTree(Stat.Stamina, 27, 28), null, 6.1));
		shinBlade.addToList(shinBlade.createTree(" of Strength", shinBlade.createSubTree(Stat.Strength, 27, 28), null, 6.7));
		
		shinBlade.addToList(shinBlade.createTree(" of the Bear", shinBlade.createSubTree(Stat.Stamina, 17, 18), shinBlade.createSubTree(Stat.Strength, 17, 18), 12.6));
		shinBlade.addToList(shinBlade.createTree(" of the Boar", shinBlade.createSubTree(Stat.Spirit, 17, 18), shinBlade.createSubTree(Stat.Strength, 17, 18), 10.0));
		shinBlade.addToList(shinBlade.createTree(" of the Eagle", shinBlade.createSubTree(Stat.Intellect, 17, 18), shinBlade.createSubTree(Stat.Stamina, 17, 18), 11.4));
		shinBlade.addToList(shinBlade.createTree(" of the Monkey", shinBlade.createSubTree(Stat.Agility, 17, 18), shinBlade.createSubTree(Stat.Stamina, 17, 18), 12.7));
		shinBlade.addToList(shinBlade.createTree(" of the Tiger", shinBlade.createSubTree(Stat.Agility, 17, 18), shinBlade.createSubTree(Stat.Strength, 17, 18), 11.7));
		shinBlade.addToList(shinBlade.createTree(" of the Whale", shinBlade.createSubTree(Stat.Spirit, 17, 18), shinBlade.createSubTree(Stat.Stamina, 17, 18), 9.6));
		shinBlade.addToList(shinBlade.createTree(" of the Wolf", shinBlade.createSubTree(Stat.Agility, 17, 18), shinBlade.createSubTree(Stat.Spirit, 17, 18), 10.4));
		list.add(shinBlade);
	}

	private static void fillPolishedZweihander() {
		int id = 15249;
		MultiBonus polishedZweihander = new MultiBonus("Polished Zweihander", id);
		polishedZweihander.addToList(polishedZweihander.createTree(" of Agility", polishedZweihander.createSubTree(Stat.Agility, 9, 10), null, 5.5));
		polishedZweihander.addToList(polishedZweihander.createTree(" of Power", polishedZweihander.createSubTree(Stat.AttackPower, 10, 20), null, 2.6));
		polishedZweihander.addToList(polishedZweihander.createTree(" of Stamina", polishedZweihander.createSubTree(Stat.Stamina, 9, 10), null, 6.2));
		polishedZweihander.addToList(polishedZweihander.createTree(" of Strength", polishedZweihander.createSubTree(Stat.Strength, 9, 10), null, 6.3));
		
		polishedZweihander.addToList(polishedZweihander.createTree(" of the Bear", polishedZweihander.createSubTree(Stat.Stamina, 5, 6), polishedZweihander.createSubTree(Stat.Strength, 5, 6), 10.5));
		polishedZweihander.addToList(polishedZweihander.createTree(" of the Boar", polishedZweihander.createSubTree(Stat.Spirit, 5, 6), polishedZweihander.createSubTree(Stat.Strength, 5, 6), 12.2));
		polishedZweihander.addToList(polishedZweihander.createTree(" of the Eagle", polishedZweihander.createSubTree(Stat.Intellect, 5, 6), polishedZweihander.createSubTree(Stat.Stamina, 5, 6), 11.8));
		polishedZweihander.addToList(polishedZweihander.createTree(" of the Monkey", polishedZweihander.createSubTree(Stat.Agility, 5, 6), polishedZweihander.createSubTree(Stat.Stamina, 5, 6), 9.9));
		polishedZweihander.addToList(polishedZweihander.createTree(" of the Tiger", polishedZweihander.createSubTree(Stat.Agility, 5, 6), polishedZweihander.createSubTree(Stat.Strength, 5, 6), 10.7));
		polishedZweihander.addToList(polishedZweihander.createTree(" of the Whale", polishedZweihander.createSubTree(Stat.Spirit, 5, 6), polishedZweihander.createSubTree(Stat.Stamina, 5, 6), 12.2));
		polishedZweihander.addToList(polishedZweihander.createTree(" of the Wolf", polishedZweihander.createSubTree(Stat.Agility, 5, 6), polishedZweihander.createSubTree(Stat.Spirit, 5, 6), 12.1));
		list.add(polishedZweihander);
	}

	private static void fillMercSword() {
		int id = 4567;
		MultiBonus mercSword = new MultiBonus("Merc Sword", id);
		mercSword.addToList(mercSword.createTree(" of Agility", mercSword.createSubTree(Stat.Agility, 4, 5), null, 6.4));
		mercSword.addToList(mercSword.createTree(" of Power", mercSword.createSubTree(Stat.AttackPower, 8, 10), null, 2.4));
		mercSword.addToList(mercSword.createTree(" of Stamina", mercSword.createSubTree(Stat.Stamina, 4, 5), null, 5.8));
		mercSword.addToList(mercSword.createTree(" of Strength", mercSword.createSubTree(Stat.Strength, 4, 5), null, 5.4));
		
		mercSword.addToList(mercSword.createTree(" of the Bear", mercSword.createSubTree(Stat.Stamina, 2, 3), mercSword.createSubTree(Stat.Strength, 2, 3), 9.0));
		mercSword.addToList(mercSword.createTree(" of the Boar", mercSword.createSubTree(Stat.Spirit, 2, 3), mercSword.createSubTree(Stat.Strength, 2, 3), 12.5));
		mercSword.addToList(mercSword.createTree(" of the Eagle", mercSword.createSubTree(Stat.Intellect, 2, 3), mercSword.createSubTree(Stat.Stamina, 2, 3), 11.8));
		mercSword.addToList(mercSword.createTree(" of the Monkey", mercSword.createSubTree(Stat.Agility, 2, 3), mercSword.createSubTree(Stat.Stamina, 2, 3), 10.2));
		mercSword.addToList(mercSword.createTree(" of the Tiger", mercSword.createSubTree(Stat.Agility, 2, 3), mercSword.createSubTree(Stat.Strength, 2, 3), 9.8));
		mercSword.addToList(mercSword.createTree(" of the Whale", mercSword.createSubTree(Stat.Spirit, 2, 3), mercSword.createSubTree(Stat.Stamina, 2, 3), 13.3));
		mercSword.addToList(mercSword.createTree(" of the Wolf", mercSword.createSubTree(Stat.Agility, 2, 3), mercSword.createSubTree(Stat.Spirit, 2, 3), 13.1));
		list.add(mercSword);
	}

	private static void fillMassacreSword() {
		int id = 15256;
		MultiBonus massacreSword = new MultiBonus("Massacre Sword", id);
		massacreSword.addToList(massacreSword.createTree(" of Agility", massacreSword.createSubTree(Stat.Agility, 25, 26), null, 5.4));
		massacreSword.addToList(massacreSword.createTree(" of Power", massacreSword.createSubTree(Stat.AttackPower, 50, 52), null, 2.8));
		massacreSword.addToList(massacreSword.createTree(" of Stamina", massacreSword.createSubTree(Stat.Stamina, 25, 26), null, 6.4));
		massacreSword.addToList(massacreSword.createTree(" of Strength", massacreSword.createSubTree(Stat.Strength, 25, 26), null, 6.4));
		
		massacreSword.addToList(massacreSword.createTree(" of the Bear", massacreSword.createSubTree(Stat.Stamina, 16, 17), massacreSword.createSubTree(Stat.Strength, 16, 17), 11.6));
		massacreSword.addToList(massacreSword.createTree(" of the Boar", massacreSword.createSubTree(Stat.Spirit, 16, 17), massacreSword.createSubTree(Stat.Strength, 16, 17), 11.6));
		massacreSword.addToList(massacreSword.createTree(" of the Eagle", massacreSword.createSubTree(Stat.Intellect, 16, 17), massacreSword.createSubTree(Stat.Stamina, 16, 17), 11.7));
		massacreSword.addToList(massacreSword.createTree(" of the Monkey", massacreSword.createSubTree(Stat.Agility, 16, 17), massacreSword.createSubTree(Stat.Stamina, 16, 17), 10.5));
		massacreSword.addToList(massacreSword.createTree(" of the Tiger", massacreSword.createSubTree(Stat.Agility, 16, 17), massacreSword.createSubTree(Stat.Strength, 16, 17), 11.7));
		massacreSword.addToList(massacreSword.createTree(" of the Whale", massacreSword.createSubTree(Stat.Spirit, 16, 17), massacreSword.createSubTree(Stat.Stamina, 16, 17), 10.8));
		massacreSword.addToList(massacreSword.createTree(" of the Wolf", massacreSword.createSubTree(Stat.Agility, 16, 17), massacreSword.createSubTree(Stat.Spirit, 16, 17), 11.3));
		list.add(massacreSword);
	}

	private static void fillHeadstrikerSword() {
		int id = 15251;
		MultiBonus headstrikerSword = new MultiBonus("Headstriker Sword", id);
		headstrikerSword.addToList(headstrikerSword.createTree(" of Agility", headstrikerSword.createSubTree(Stat.Agility, 18, 19), null, 4.4));
		headstrikerSword.addToList(headstrikerSword.createTree(" of Power", headstrikerSword.createSubTree(Stat.AttackPower, 36, 38), null, 2.4));
		headstrikerSword.addToList(headstrikerSword.createTree(" of Stamina", headstrikerSword.createSubTree(Stat.Stamina, 18, 19), null, 6.8));
		headstrikerSword.addToList(headstrikerSword.createTree(" of Strength", headstrikerSword.createSubTree(Stat.Strength, 18, 19), null, 7.3));
		
		headstrikerSword.addToList(headstrikerSword.createTree(" of the Bear", headstrikerSword.createSubTree(Stat.Stamina, 11, 12), headstrikerSword.createSubTree(Stat.Strength, 11, 12), 12.1));
		headstrikerSword.addToList(headstrikerSword.createTree(" of the Boar", headstrikerSword.createSubTree(Stat.Spirit, 11, 12), headstrikerSword.createSubTree(Stat.Strength, 11, 12), 12.7));
		headstrikerSword.addToList(headstrikerSword.createTree(" of the Eagle", headstrikerSword.createSubTree(Stat.Intellect, 11, 12), headstrikerSword.createSubTree(Stat.Stamina, 11, 12), 11.7));
		headstrikerSword.addToList(headstrikerSword.createTree(" of the Monkey", headstrikerSword.createSubTree(Stat.Agility, 11, 12), headstrikerSword.createSubTree(Stat.Stamina, 11, 12), 8.3));
		headstrikerSword.addToList(headstrikerSword.createTree(" of the Tiger", headstrikerSword.createSubTree(Stat.Agility, 11, 12), headstrikerSword.createSubTree(Stat.Strength, 11, 12), 10.7));
		headstrikerSword.addToList(headstrikerSword.createTree(" of the Whale", headstrikerSword.createSubTree(Stat.Spirit, 11, 12), headstrikerSword.createSubTree(Stat.Stamina, 11, 12), 12.5));
		headstrikerSword.addToList(headstrikerSword.createTree(" of the Wolf", headstrikerSword.createSubTree(Stat.Agility, 11, 12), headstrikerSword.createSubTree(Stat.Spirit, 11, 12), 11.2));
		list.add(headstrikerSword);
	}

	private static void fillGlimmeringFlamberge() {
		int id = 15250;
		MultiBonus glimmeringFlamberge = new MultiBonus("Glimmering Flamberge", id);
		glimmeringFlamberge.addToList(glimmeringFlamberge.createTree(" of Agility", glimmeringFlamberge.createSubTree(Stat.Agility, 12, 13), null, 5.1));
		glimmeringFlamberge.addToList(glimmeringFlamberge.createTree(" of Power", glimmeringFlamberge.createSubTree(Stat.AttackPower, 24, 26), null, 2.4));
		glimmeringFlamberge.addToList(glimmeringFlamberge.createTree(" of Stamina", glimmeringFlamberge.createSubTree(Stat.Stamina, 12, 13), null, 6.3));
		glimmeringFlamberge.addToList(glimmeringFlamberge.createTree(" of Strength", glimmeringFlamberge.createSubTree(Stat.Strength, 12, 13), null, 6.2));
		
		glimmeringFlamberge.addToList(glimmeringFlamberge.createTree(" of the Bear", glimmeringFlamberge.createSubTree(Stat.Stamina, 7, 8), glimmeringFlamberge.createSubTree(Stat.Strength, 7, 8), 10.1));
		glimmeringFlamberge.addToList(glimmeringFlamberge.createTree(" of the Boar", glimmeringFlamberge.createSubTree(Stat.Spirit, 7, 8), glimmeringFlamberge.createSubTree(Stat.Strength, 7, 8), 12.8));
		glimmeringFlamberge.addToList(glimmeringFlamberge.createTree(" of the Eagle", glimmeringFlamberge.createSubTree(Stat.Intellect, 7, 8), glimmeringFlamberge.createSubTree(Stat.Stamina, 7, 8), 11.7));
		glimmeringFlamberge.addToList(glimmeringFlamberge.createTree(" of the Monkey", glimmeringFlamberge.createSubTree(Stat.Agility, 7, 8), glimmeringFlamberge.createSubTree(Stat.Stamina, 7, 8), 9.3));
		glimmeringFlamberge.addToList(glimmeringFlamberge.createTree(" of the Tiger", glimmeringFlamberge.createSubTree(Stat.Agility, 7, 8), glimmeringFlamberge.createSubTree(Stat.Strength, 7, 8), 10.7));
		glimmeringFlamberge.addToList(glimmeringFlamberge.createTree(" of the Whale", glimmeringFlamberge.createSubTree(Stat.Spirit, 7, 8), glimmeringFlamberge.createSubTree(Stat.Stamina, 7, 8), 13.0));
		glimmeringFlamberge.addToList(glimmeringFlamberge.createTree(" of the Wolf", glimmeringFlamberge.createSubTree(Stat.Agility, 7, 8), glimmeringFlamberge.createSubTree(Stat.Spirit, 7, 8), 12.7));
		list.add(glimmeringFlamberge);
	}

	private static void fillGleamingClaymore() {
		int id = 15248;
		MultiBonus gleamingClaymore = new MultiBonus("gleamingClaymore", id);
		gleamingClaymore.addToList(gleamingClaymore.createTree(" of Agility", gleamingClaymore.createSubTree(Stat.Agility, 6, 7), null, 5.8));
		gleamingClaymore.addToList(gleamingClaymore.createTree(" of Power", gleamingClaymore.createSubTree(Stat.AttackPower, 12, 14), null, 2.5));
		gleamingClaymore.addToList(gleamingClaymore.createTree(" of Stamina", gleamingClaymore.createSubTree(Stat.Stamina, 6, 7), null, 6.2));
		gleamingClaymore.addToList(gleamingClaymore.createTree(" of Strength", gleamingClaymore.createSubTree(Stat.Strength, 6, 7), null, 5.8));
		
		gleamingClaymore.addToList(gleamingClaymore.createTree(" of the Bear", gleamingClaymore.createSubTree(Stat.Stamina, 3, 4), gleamingClaymore.createSubTree(Stat.Strength, 3, 4), 9.0));
		gleamingClaymore.addToList(gleamingClaymore.createTree(" of the Boar", gleamingClaymore.createSubTree(Stat.Spirit, 3, 4), gleamingClaymore.createSubTree(Stat.Strength, 3, 4), 12.9));
		gleamingClaymore.addToList(gleamingClaymore.createTree(" of the Eagle", gleamingClaymore.createSubTree(Stat.Intellect, 3, 4), gleamingClaymore.createSubTree(Stat.Stamina, 3, 4), 11.6));
		gleamingClaymore.addToList(gleamingClaymore.createTree(" of the Monkey", gleamingClaymore.createSubTree(Stat.Agility, 3, 4), gleamingClaymore.createSubTree(Stat.Stamina, 3, 4), 9.7));
		gleamingClaymore.addToList(gleamingClaymore.createTree(" of the Tiger", gleamingClaymore.createSubTree(Stat.Agility, 3, 4), gleamingClaymore.createSubTree(Stat.Strength, 3, 4), 9.6));
		gleamingClaymore.addToList(gleamingClaymore.createTree(" of the Whale", gleamingClaymore.createSubTree(Stat.Spirit, 3, 4), gleamingClaymore.createSubTree(Stat.Stamina, 3, 4), 13.8));
		gleamingClaymore.addToList(gleamingClaymore.createTree(" of the Wolf", gleamingClaymore.createSubTree(Stat.Agility, 3, 4), gleamingClaymore.createSubTree(Stat.Spirit, 3, 4), 13.2));
		list.add(gleamingClaymore);
	}
	
	private static void fillGallantFlamberge() {
		int id = 15255;
		MultiBonus gallantFlamberge = new MultiBonus("Gallant Flamberge", id);
		gallantFlamberge.addToList(gallantFlamberge.createTree(" of Agility", gallantFlamberge.createSubTree(Stat.Agility, 24, 25), null, 5.4));
		gallantFlamberge.addToList(gallantFlamberge.createTree(" of Power", gallantFlamberge.createSubTree(Stat.AttackPower, 48, 50), null, 2.7));
		gallantFlamberge.addToList(gallantFlamberge.createTree(" of Stamina", gallantFlamberge.createSubTree(Stat.Stamina, 24, 25), null, 6.3));
		gallantFlamberge.addToList(gallantFlamberge.createTree(" of Strength", gallantFlamberge.createSubTree(Stat.Strength, 24, 25), null, 6.6));
		
		gallantFlamberge.addToList(gallantFlamberge.createTree(" of the Bear", gallantFlamberge.createSubTree(Stat.Stamina, 15, 16), gallantFlamberge.createSubTree(Stat.Strength, 15, 16), 12.1));
		gallantFlamberge.addToList(gallantFlamberge.createTree(" of the Boar", gallantFlamberge.createSubTree(Stat.Spirit, 15, 16), gallantFlamberge.createSubTree(Stat.Strength, 15, 16), 11.1));
		gallantFlamberge.addToList(gallantFlamberge.createTree(" of the Eagle", gallantFlamberge.createSubTree(Stat.Intellect, 15, 16), gallantFlamberge.createSubTree(Stat.Stamina, 15, 16), 11.0));
		gallantFlamberge.addToList(gallantFlamberge.createTree(" of the Monkey", gallantFlamberge.createSubTree(Stat.Agility, 15, 16), gallantFlamberge.createSubTree(Stat.Stamina, 15, 16), 11.2));
		gallantFlamberge.addToList(gallantFlamberge.createTree(" of the Tiger", gallantFlamberge.createSubTree(Stat.Agility, 15, 16), gallantFlamberge.createSubTree(Stat.Strength, 15, 16), 11.9));
		gallantFlamberge.addToList(gallantFlamberge.createTree(" of the Whale", gallantFlamberge.createSubTree(Stat.Spirit, 15, 16), gallantFlamberge.createSubTree(Stat.Stamina, 15, 16), 10.9));
		gallantFlamberge.addToList(gallantFlamberge.createTree(" of the Wolf", gallantFlamberge.createSubTree(Stat.Agility, 15, 16), gallantFlamberge.createSubTree(Stat.Spirit, 15, 16), 10.7));
		list.add(gallantFlamberge);
	}
	
	private static void fillExquisiteFlamberge() {
		int id = 1625;
		MultiBonus exquisiteFlamberge = new MultiBonus("Exquisite Flamberge", id);
		exquisiteFlamberge.addToList(exquisiteFlamberge.createTree(" of Agility", exquisiteFlamberge.createSubTree(Stat.Agility, 16, 17), null, 4.8));
		exquisiteFlamberge.addToList(exquisiteFlamberge.createTree(" of Power", exquisiteFlamberge.createSubTree(Stat.AttackPower, 32, 34), null, 2.5));
		exquisiteFlamberge.addToList(exquisiteFlamberge.createTree(" of Stamina", exquisiteFlamberge.createSubTree(Stat.Stamina, 16, 17), null, 6.9));
		exquisiteFlamberge.addToList(exquisiteFlamberge.createTree(" of Strength", exquisiteFlamberge.createSubTree(Stat.Strength, 16, 17), null, 6.9));
		
		exquisiteFlamberge.addToList(exquisiteFlamberge.createTree(" of the Bear", exquisiteFlamberge.createSubTree(Stat.Stamina, 10, 11), exquisiteFlamberge.createSubTree(Stat.Strength, 10, 11), 11.4));
		exquisiteFlamberge.addToList(exquisiteFlamberge.createTree(" of the Boar", exquisiteFlamberge.createSubTree(Stat.Spirit, 10, 11), exquisiteFlamberge.createSubTree(Stat.Strength, 10, 11), 12.9));
		exquisiteFlamberge.addToList(exquisiteFlamberge.createTree(" of the Eagle", exquisiteFlamberge.createSubTree(Stat.Intellect, 10, 11), exquisiteFlamberge.createSubTree(Stat.Stamina, 10, 11), 11.6));
		exquisiteFlamberge.addToList(exquisiteFlamberge.createTree(" of the Monkey", exquisiteFlamberge.createSubTree(Stat.Agility, 10, 11), exquisiteFlamberge.createSubTree(Stat.Stamina, 10, 11), 8.9));
		exquisiteFlamberge.addToList(exquisiteFlamberge.createTree(" of the Tiger", exquisiteFlamberge.createSubTree(Stat.Agility, 10, 11), exquisiteFlamberge.createSubTree(Stat.Strength, 10, 11), 10.8));
		exquisiteFlamberge.addToList(exquisiteFlamberge.createTree(" of the Whale", exquisiteFlamberge.createSubTree(Stat.Spirit, 10, 11), exquisiteFlamberge.createSubTree(Stat.Stamina, 10, 11), 12.2));
		exquisiteFlamberge.addToList(exquisiteFlamberge.createTree(" of the Wolf", exquisiteFlamberge.createSubTree(Stat.Agility, 10, 11), exquisiteFlamberge.createSubTree(Stat.Spirit, 10, 11), 11.4));
		list.add(exquisiteFlamberge);
	}
	
	private static void fillEdgedBastardSword() {
		int id = 3196;
		MultiBonus edgedBastardSword = new MultiBonus("Edged Bastard Sword", id);
		edgedBastardSword.addToList(edgedBastardSword.createTree(" of Agility", edgedBastardSword.createSubTree(Stat.Agility, 4, 5), null, 6.2));
		edgedBastardSword.addToList(edgedBastardSword.createTree(" of Power", edgedBastardSword.createSubTree(Stat.AttackPower, 8, 10), null, 2.6));
		edgedBastardSword.addToList(edgedBastardSword.createTree(" of Stamina", edgedBastardSword.createSubTree(Stat.Stamina, 4, 5), null, 6.2));
		edgedBastardSword.addToList(edgedBastardSword.createTree(" of Strength", edgedBastardSword.createSubTree(Stat.Strength, 4, 5), null, 5.7));
		
		edgedBastardSword.addToList(edgedBastardSword.createTree(" of the Bear", edgedBastardSword.createSubTree(Stat.Stamina, 2, 3), edgedBastardSword.createSubTree(Stat.Strength, 2, 3), 9.2));
		edgedBastardSword.addToList(edgedBastardSword.createTree(" of the Boar", edgedBastardSword.createSubTree(Stat.Spirit, 2, 3), edgedBastardSword.createSubTree(Stat.Strength, 2, 3), 12.3));
		edgedBastardSword.addToList(edgedBastardSword.createTree(" of the Eagle", edgedBastardSword.createSubTree(Stat.Intellect, 2, 3), edgedBastardSword.createSubTree(Stat.Stamina, 2, 3), 11.7));
		edgedBastardSword.addToList(edgedBastardSword.createTree(" of the Monkey", edgedBastardSword.createSubTree(Stat.Agility, 2, 3), edgedBastardSword.createSubTree(Stat.Stamina, 2, 3), 10.4));
		edgedBastardSword.addToList(edgedBastardSword.createTree(" of the Tiger", edgedBastardSword.createSubTree(Stat.Agility, 2, 3), edgedBastardSword.createSubTree(Stat.Strength, 2, 3), 10.1));
		edgedBastardSword.addToList(edgedBastardSword.createTree(" of the Whale", edgedBastardSword.createSubTree(Stat.Spirit, 2, 3), edgedBastardSword.createSubTree(Stat.Stamina, 2, 3), 12.9));
		edgedBastardSword.addToList(edgedBastardSword.createTree(" of the Wolf", edgedBastardSword.createSubTree(Stat.Agility, 2, 3), edgedBastardSword.createSubTree(Stat.Spirit, 2, 3), 12.7));
		list.add(edgedBastardSword);
	}
	
	private static void fillDivineWarblade() {
		int id = 15258;
		MultiBonus divineWarblade = new MultiBonus("Divine Warblade", id);
		divineWarblade.addToList(divineWarblade.createTree(" of Agility", divineWarblade.createSubTree(Stat.Agility, 28, 29), null, 6.5));
		divineWarblade.addToList(divineWarblade.createTree(" of Power", divineWarblade.createSubTree(Stat.AttackPower, 56, 58), null, 3.0));
		divineWarblade.addToList(divineWarblade.createTree(" of Stamina", divineWarblade.createSubTree(Stat.Stamina, 28, 29), null, 5.7));
		divineWarblade.addToList(divineWarblade.createTree(" of Strength", divineWarblade.createSubTree(Stat.Strength, 28, 29), null, 6.1));
		
		divineWarblade.addToList(divineWarblade.createTree(" of the Bear", divineWarblade.createSubTree(Stat.Stamina, 18, 19), divineWarblade.createSubTree(Stat.Strength, 18, 19), 12.7));
		divineWarblade.addToList(divineWarblade.createTree(" of the Boar", divineWarblade.createSubTree(Stat.Spirit, 18, 19), divineWarblade.createSubTree(Stat.Strength, 18, 19), 10.3));
		divineWarblade.addToList(divineWarblade.createTree(" of the Eagle", divineWarblade.createSubTree(Stat.Intellect, 18, 19), divineWarblade.createSubTree(Stat.Stamina, 18, 19), 11.4));
		divineWarblade.addToList(divineWarblade.createTree(" of the Monkey", divineWarblade.createSubTree(Stat.Agility, 18, 19), divineWarblade.createSubTree(Stat.Stamina, 18, 19), 12.3));
		divineWarblade.addToList(divineWarblade.createTree(" of the Tiger", divineWarblade.createSubTree(Stat.Agility, 18, 19), divineWarblade.createSubTree(Stat.Strength, 18, 19), 13.1));
		divineWarblade.addToList(divineWarblade.createTree(" of the Whale", divineWarblade.createSubTree(Stat.Spirit, 18, 19), divineWarblade.createSubTree(Stat.Stamina, 18, 19), 8.9));
		divineWarblade.addToList(divineWarblade.createTree(" of the Wolf", divineWarblade.createSubTree(Stat.Agility, 18, 19), divineWarblade.createSubTree(Stat.Spirit, 18, 19), 10.0));
		list.add(divineWarblade);
	}
	
	private static void fillDarkEspadon() {
		int id = 15254;
		MultiBonus darkEspadon = new MultiBonus("Dark Espadon", id);
		darkEspadon.addToList(darkEspadon.createTree(" of Agility", darkEspadon.createSubTree(Stat.Agility, 22, 23), null, 4.5));
		darkEspadon.addToList(darkEspadon.createTree(" of Power", darkEspadon.createSubTree(Stat.AttackPower, 44, 46), null, 2.4));
		darkEspadon.addToList(darkEspadon.createTree(" of Stamina", darkEspadon.createSubTree(Stat.Stamina, 22, 23), null, 6.4));
		darkEspadon.addToList(darkEspadon.createTree(" of Strength", darkEspadon.createSubTree(Stat.Strength, 22, 23), null, 6.9));
		
		darkEspadon.addToList(darkEspadon.createTree(" of the Bear", darkEspadon.createSubTree(Stat.Stamina, 14, 15), darkEspadon.createSubTree(Stat.Strength, 14, 15), 11.6));
		darkEspadon.addToList(darkEspadon.createTree(" of the Boar", darkEspadon.createSubTree(Stat.Spirit, 14, 15), darkEspadon.createSubTree(Stat.Strength, 14, 15), 12.3));
		darkEspadon.addToList(darkEspadon.createTree(" of the Eagle", darkEspadon.createSubTree(Stat.Intellect, 14, 15), darkEspadon.createSubTree(Stat.Stamina, 14, 15), 11.5));
		darkEspadon.addToList(darkEspadon.createTree(" of the Monkey", darkEspadon.createSubTree(Stat.Agility, 14, 15), darkEspadon.createSubTree(Stat.Stamina, 14, 15), 9.5));
		darkEspadon.addToList(darkEspadon.createTree(" of the Tiger", darkEspadon.createSubTree(Stat.Agility, 14, 15), darkEspadon.createSubTree(Stat.Strength, 14, 15), 11.4));
		darkEspadon.addToList(darkEspadon.createTree(" of the Whale", darkEspadon.createSubTree(Stat.Spirit, 14, 15), darkEspadon.createSubTree(Stat.Stamina, 14, 15), 12.0));
		darkEspadon.addToList(darkEspadon.createTree(" of the Wolf", darkEspadon.createSubTree(Stat.Agility, 14, 15), darkEspadon.createSubTree(Stat.Spirit, 14, 15), 11.5));
		list.add(darkEspadon);
	}
	
	private static void fillCavalierTwoHander() {
		int id = 3206;
		MultiBonus cavalierTwoHander = new MultiBonus("Cavalier Two-Hander", id);
		cavalierTwoHander.addToList(cavalierTwoHander.createTree(" of Agility", cavalierTwoHander.createSubTree(Stat.Agility, 10, 11), null, 5.0));
		cavalierTwoHander.addToList(cavalierTwoHander.createTree(" of Power", cavalierTwoHander.createSubTree(Stat.AttackPower, 20, 22), null, 2.5));
		cavalierTwoHander.addToList(cavalierTwoHander.createTree(" of Stamina", cavalierTwoHander.createSubTree(Stat.Stamina, 10, 11), null, 6.3));
		cavalierTwoHander.addToList(cavalierTwoHander.createTree(" of Strength", cavalierTwoHander.createSubTree(Stat.Strength, 10, 11), null, 6.5));
		
		cavalierTwoHander.addToList(cavalierTwoHander.createTree(" of the Bear", cavalierTwoHander.createSubTree(Stat.Stamina, 6, 7), cavalierTwoHander.createSubTree(Stat.Strength, 6, 7), 10.6));
		cavalierTwoHander.addToList(cavalierTwoHander.createTree(" of the Boar", cavalierTwoHander.createSubTree(Stat.Spirit, 6, 7), cavalierTwoHander.createSubTree(Stat.Strength, 6, 7), 13.2));
		cavalierTwoHander.addToList(cavalierTwoHander.createTree(" of the Eagle", cavalierTwoHander.createSubTree(Stat.Intellect, 6, 7), cavalierTwoHander.createSubTree(Stat.Stamina, 6, 7), 11.3));
		cavalierTwoHander.addToList(cavalierTwoHander.createTree(" of the Monkey", cavalierTwoHander.createSubTree(Stat.Agility, 6, 7), cavalierTwoHander.createSubTree(Stat.Stamina, 6, 7), 8.9));
		cavalierTwoHander.addToList(cavalierTwoHander.createTree(" of the Tiger", cavalierTwoHander.createSubTree(Stat.Agility, 6, 7), cavalierTwoHander.createSubTree(Stat.Strength, 6, 7), 10.6));
		cavalierTwoHander.addToList(cavalierTwoHander.createTree(" of the Whale", cavalierTwoHander.createSubTree(Stat.Spirit, 6, 7), cavalierTwoHander.createSubTree(Stat.Stamina, 6, 7), 12.9));
		cavalierTwoHander.addToList(cavalierTwoHander.createTree(" of the Wolf", cavalierTwoHander.createSubTree(Stat.Agility, 6, 7), cavalierTwoHander.createSubTree(Stat.Spirit, 6, 7), 12.1));
		list.add(cavalierTwoHander);
	}
	
	private static void fillBeheadingBlade() {
		int id = 15253;
		MultiBonus beheadingBlade = new MultiBonus("Beheading Blade", id);
		beheadingBlade.addToList(beheadingBlade.createTree(" of Agility", beheadingBlade.createSubTree(Stat.Agility, 22, 23), null, 4.5));
		beheadingBlade.addToList(beheadingBlade.createTree(" of Power", beheadingBlade.createSubTree(Stat.AttackPower, 44, 46), null, 2.3));
		beheadingBlade.addToList(beheadingBlade.createTree(" of Stamina", beheadingBlade.createSubTree(Stat.Stamina, 22, 23), null, 6.4));
		beheadingBlade.addToList(beheadingBlade.createTree(" of Strength", beheadingBlade.createSubTree(Stat.Strength, 22, 23), null, 7.0));
		
		beheadingBlade.addToList(beheadingBlade.createTree(" of the Bear", beheadingBlade.createSubTree(Stat.Stamina, 14, 15), beheadingBlade.createSubTree(Stat.Strength, 14, 15), 11.7));
		beheadingBlade.addToList(beheadingBlade.createTree(" of the Boar", beheadingBlade.createSubTree(Stat.Spirit, 14, 15), beheadingBlade.createSubTree(Stat.Strength, 14, 15), 12.5));
		beheadingBlade.addToList(beheadingBlade.createTree(" of the Eagle", beheadingBlade.createSubTree(Stat.Intellect, 14, 15), beheadingBlade.createSubTree(Stat.Stamina, 14, 15), 11.8));
		beheadingBlade.addToList(beheadingBlade.createTree(" of the Monkey", beheadingBlade.createSubTree(Stat.Agility, 14, 15), beheadingBlade.createSubTree(Stat.Stamina, 14, 15), 9.1));
		beheadingBlade.addToList(beheadingBlade.createTree(" of the Tiger", beheadingBlade.createSubTree(Stat.Agility, 14, 15), beheadingBlade.createSubTree(Stat.Strength, 14, 15), 11.3));
		beheadingBlade.addToList(beheadingBlade.createTree(" of the Whale", beheadingBlade.createSubTree(Stat.Spirit, 14, 15), beheadingBlade.createSubTree(Stat.Stamina, 14, 15), 12.2));
		beheadingBlade.addToList(beheadingBlade.createTree(" of the Wolf", beheadingBlade.createSubTree(Stat.Agility, 14, 15), beheadingBlade.createSubTree(Stat.Spirit, 14, 15), 11.3));
		list.add(beheadingBlade);
	}
	
	private static void fillBattlefieldDestroyer() {
		int id = 8199;
		MultiBonus battlefieldDestroyer = new MultiBonus("Battlefield Destroyer", id);
		battlefieldDestroyer.addToList(battlefieldDestroyer.createTree(" of Agility", battlefieldDestroyer.createSubTree(Stat.Agility, 19, 20), null, 4.9));
		battlefieldDestroyer.addToList(battlefieldDestroyer.createTree(" of Power", battlefieldDestroyer.createSubTree(Stat.AttackPower, 32, 38), null, 2.6));
		battlefieldDestroyer.addToList(battlefieldDestroyer.createTree(" of Stamina", battlefieldDestroyer.createSubTree(Stat.Stamina, 19, 20), null, 6.5));
		battlefieldDestroyer.addToList(battlefieldDestroyer.createTree(" of Strength", battlefieldDestroyer.createSubTree(Stat.Strength, 19, 20), null, 6.9));
		
		battlefieldDestroyer.addToList(battlefieldDestroyer.createTree(" of the Bear", battlefieldDestroyer.createSubTree(Stat.Stamina, 12, 13), battlefieldDestroyer.createSubTree(Stat.Strength, 12, 13), 12.3));
		battlefieldDestroyer.addToList(battlefieldDestroyer.createTree(" of the Boar", battlefieldDestroyer.createSubTree(Stat.Spirit, 12, 13), battlefieldDestroyer.createSubTree(Stat.Strength, 12, 13), 12.2));
		battlefieldDestroyer.addToList(battlefieldDestroyer.createTree(" of the Eagle", battlefieldDestroyer.createSubTree(Stat.Intellect, 12, 13), battlefieldDestroyer.createSubTree(Stat.Stamina, 12, 13), 11.4));
		battlefieldDestroyer.addToList(battlefieldDestroyer.createTree(" of the Monkey", battlefieldDestroyer.createSubTree(Stat.Agility, 12, 13), battlefieldDestroyer.createSubTree(Stat.Stamina, 12, 13), 9.6));
		battlefieldDestroyer.addToList(battlefieldDestroyer.createTree(" of the Tiger", battlefieldDestroyer.createSubTree(Stat.Agility, 12, 13), battlefieldDestroyer.createSubTree(Stat.Strength, 12, 13), 11.3));
		battlefieldDestroyer.addToList(battlefieldDestroyer.createTree(" of the Whale", battlefieldDestroyer.createSubTree(Stat.Spirit, 12, 13), battlefieldDestroyer.createSubTree(Stat.Stamina, 12, 13), 11.5));
		battlefieldDestroyer.addToList(battlefieldDestroyer.createTree(" of the Wolf", battlefieldDestroyer.createSubTree(Stat.Agility, 12, 13), battlefieldDestroyer.createSubTree(Stat.Spirit, 12, 13), 11.0));
		list.add(battlefieldDestroyer);
	}
	
	public static void main(String[] args) {
		fill();
	}
}
