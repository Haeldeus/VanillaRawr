package db.randomBoni.weapons.melee;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class OneHandAxes {

	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		12527, 19921, 15237, 15235, 15240, 2073, 1994, 15239, 790, 863, 15234, 4568, 15232, 
		2080, 15236, 15230, 15233, 4561, 15231, 15238 
	};
	
	public static ArrayList<MultiBonus> getList() {
		if (list == null)
			fill();
		return list;
	}
	
	public static int[] getIds() {
		return ids;
	}
	
	private static void fill() {
		list = new ArrayList<MultiBonus>();
		fillRibsplitter();
		fillZulianHacker();
		fillCorpseHarvester();
		fillCrescentEdge();
		fillDemonsClaw();
		fillDwarvenHatchet();
		fillEbonclawReaver();
		fillFelstoneReaver();
		fillForestersAxe();
		fillGloomReaper();
		fillGreaterScythe();
		fillGruntAxe();
		fillHackingCleaver();
		fillHillborneAxe();
		fillMoonCleaver();
		fillRidgeCleaver();
		fillSavageAxe();
		fillScalpingTomahawk();
		fillSplittingHatchet();
		fillWarlordsAxe();
	/*	System.out.println(list.get(0));
		System.out.println("--------------------");
		System.out.println(list.get(1));
		System.out.println("--------------------");
		System.out.println(list.get(2));
		System.out.println("--------------------");
		System.out.println(list.get(3));
		System.out.println("--------------------");
		System.out.println(list.get(4));
		System.out.println("--------------------");
		System.out.println(list.get(5));
		System.out.println("--------------------");
		System.out.println(list.get(6));
		System.out.println("--------------------");
		System.out.println(list.get(7));
		System.out.println("--------------------");
		System.out.println(list.get(8));
		System.out.println("--------------------");
		System.out.println(list.get(9));
		System.out.println("--------------------");
		System.out.println(list.get(10));
		System.out.println("--------------------");
		System.out.println(list.get(11));
		System.out.println("--------------------");		
		System.out.println(list.get(12));
		System.out.println("--------------------");
		System.out.println(list.get(13));
		System.out.println("--------------------");
		System.out.println(list.get(14));
		System.out.println("--------------------");
		System.out.println(list.get(15));
		System.out.println("--------------------");
		System.out.println(list.get(16));
		System.out.println("--------------------");
		System.out.println(list.get(17));
		System.out.println("--------------------");
		System.out.println(list.get(18));
		System.out.println("--------------------");
		System.out.println(list.get(19)); */
	}
	
	private static void fillWarlordsAxe() {
		int id = 15238;
		MultiBonus warlordsAxe = new MultiBonus("Warlord's Axe", id);
		warlordsAxe.addToList(warlordsAxe.createTree(" of Agility", warlordsAxe.createSubTree(Stat.Agility, 11, 11), null, 6.1));
		warlordsAxe.addToList(warlordsAxe.createTree(" of Power", warlordsAxe.createSubTree(Stat.AttackPower, 22, 22), null, 2.8));
		warlordsAxe.addToList(warlordsAxe.createTree(" of Stamina", warlordsAxe.createSubTree(Stat.Stamina, 11, 11), null, 5.7));
		warlordsAxe.addToList(warlordsAxe.createTree(" of Strength", warlordsAxe.createSubTree(Stat.Strength, 11, 11), null, 5.9));
		
		warlordsAxe.addToList(warlordsAxe.createTree(" of the Bear", warlordsAxe.createSubTree(Stat.Stamina, 7, 7), warlordsAxe.createSubTree(Stat.Strength, 7, 7), 11.2));
		warlordsAxe.addToList(warlordsAxe.createTree(" of the Boar", warlordsAxe.createSubTree(Stat.Spirit, 7, 7), warlordsAxe.createSubTree(Stat.Strength, 7, 7), 11.6));
		warlordsAxe.addToList(warlordsAxe.createTree(" of the Eagle", warlordsAxe.createSubTree(Stat.Intellect, 7, 7), warlordsAxe.createSubTree(Stat.Stamina, 7, 7), 11.3));
		warlordsAxe.addToList(warlordsAxe.createTree(" of the Monkey", warlordsAxe.createSubTree(Stat.Agility, 7, 7), warlordsAxe.createSubTree(Stat.Stamina, 7, 7), 11.2));
		warlordsAxe.addToList(warlordsAxe.createTree(" of the Tiger", warlordsAxe.createSubTree(Stat.Agility, 7, 7), warlordsAxe.createSubTree(Stat.Strength, 7, 7), 11.0));
		warlordsAxe.addToList(warlordsAxe.createTree(" of the Whale", warlordsAxe.createSubTree(Stat.Spirit, 7, 7), warlordsAxe.createSubTree(Stat.Stamina, 7, 7), 11.7));
		warlordsAxe.addToList(warlordsAxe.createTree(" of the Wolf", warlordsAxe.createSubTree(Stat.Agility, 7, 7), warlordsAxe.createSubTree(Stat.Spirit, 7, 7), 11.4));
		list.add(warlordsAxe);
	}
	
	private static void fillSplittingHatchet() {
		int id = 15231;
		MultiBonus splittingHatchet = new MultiBonus("Splitting Hatchet", id);
		splittingHatchet.addToList(splittingHatchet.createTree(" of Agility", splittingHatchet.createSubTree(Stat.Agility, 5, 5), null, 5.4));
		splittingHatchet.addToList(splittingHatchet.createTree(" of Power", splittingHatchet.createSubTree(Stat.AttackPower, 10, 10), null, 2.6));
		splittingHatchet.addToList(splittingHatchet.createTree(" of Stamina", splittingHatchet.createSubTree(Stat.Stamina, 5, 5), null, 6.1));
		splittingHatchet.addToList(splittingHatchet.createTree(" of Strength", splittingHatchet.createSubTree(Stat.Strength, 5, 5), null, 6.5));
		
		splittingHatchet.addToList(splittingHatchet.createTree(" of the Bear", splittingHatchet.createSubTree(Stat.Stamina, 3, 4), splittingHatchet.createSubTree(Stat.Strength, 3, 4), 10.5));
		splittingHatchet.addToList(splittingHatchet.createTree(" of the Boar", splittingHatchet.createSubTree(Stat.Spirit, 3, 4), splittingHatchet.createSubTree(Stat.Strength, 3, 4), 13.1));
		splittingHatchet.addToList(splittingHatchet.createTree(" of the Eagle", splittingHatchet.createSubTree(Stat.Intellect, 3, 4), splittingHatchet.createSubTree(Stat.Stamina, 3, 4), 11.2));
		splittingHatchet.addToList(splittingHatchet.createTree(" of the Monkey", splittingHatchet.createSubTree(Stat.Agility, 3, 4), splittingHatchet.createSubTree(Stat.Stamina, 3, 4), 9.4));
		splittingHatchet.addToList(splittingHatchet.createTree(" of the Tiger", splittingHatchet.createSubTree(Stat.Agility, 3, 4), splittingHatchet.createSubTree(Stat.Strength, 3, 4), 10.2));
		splittingHatchet.addToList(splittingHatchet.createTree(" of the Whale", splittingHatchet.createSubTree(Stat.Spirit, 3, 4), splittingHatchet.createSubTree(Stat.Stamina, 3, 4), 12.9));
		splittingHatchet.addToList(splittingHatchet.createTree(" of the Wolf", splittingHatchet.createSubTree(Stat.Agility, 3, 4), splittingHatchet.createSubTree(Stat.Spirit, 3, 4), 12.1));
		list.add(splittingHatchet);
	}
	
	private static void fillScalpingTomahawk() {
		int id = 4561;
		MultiBonus scalpingTomahawk = new MultiBonus("Scalping Tomahawk", id);
		scalpingTomahawk.addToList(scalpingTomahawk.createTree(" of Agility", scalpingTomahawk.createSubTree(Stat.Agility, 1, 1), null, 29.0));
		scalpingTomahawk.addToList(scalpingTomahawk.createTree(" of Power", scalpingTomahawk.createSubTree(Stat.AttackPower, 2, 4), null, 13.9));
		scalpingTomahawk.addToList(scalpingTomahawk.createTree(" of Stamina", scalpingTomahawk.createSubTree(Stat.Stamina, 1, 1), null, 28.6));
		scalpingTomahawk.addToList(scalpingTomahawk.createTree(" of Strength", scalpingTomahawk.createSubTree(Stat.Strength, 1, 1), null, 28.5));
		list.add(scalpingTomahawk);
	}
	
	private static void fillSavageAxe() {
		int id = 15233;
		MultiBonus savageAxe = new MultiBonus("Savage Axe", id);
		savageAxe.addToList(savageAxe.createTree(" of Agility", savageAxe.createSubTree(Stat.Agility, 6, 7), null, 5.7));
		savageAxe.addToList(savageAxe.createTree(" of Power", savageAxe.createSubTree(Stat.AttackPower, 12, 14), null, 2.7));
		savageAxe.addToList(savageAxe.createTree(" of Stamina", savageAxe.createSubTree(Stat.Stamina, 6, 7), null, 6.5));
		savageAxe.addToList(savageAxe.createTree(" of Strength", savageAxe.createSubTree(Stat.Strength, 6, 7), null, 6.4));
		
		savageAxe.addToList(savageAxe.createTree(" of the Bear", savageAxe.createSubTree(Stat.Stamina, 4, 4), savageAxe.createSubTree(Stat.Strength, 4, 4), 10.5));
		savageAxe.addToList(savageAxe.createTree(" of the Boar", savageAxe.createSubTree(Stat.Spirit, 4, 4), savageAxe.createSubTree(Stat.Strength, 4, 4), 12.7));
		savageAxe.addToList(savageAxe.createTree(" of the Eagle", savageAxe.createSubTree(Stat.Intellect, 4, 4), savageAxe.createSubTree(Stat.Stamina, 4, 4), 10.6));
		savageAxe.addToList(savageAxe.createTree(" of the Monkey", savageAxe.createSubTree(Stat.Agility, 4, 4), savageAxe.createSubTree(Stat.Stamina, 4, 4), 10.1));
		savageAxe.addToList(savageAxe.createTree(" of the Tiger", savageAxe.createSubTree(Stat.Agility, 4, 4), savageAxe.createSubTree(Stat.Strength, 4, 4), 10.3));
		savageAxe.addToList(savageAxe.createTree(" of the Whale", savageAxe.createSubTree(Stat.Spirit, 4, 4), savageAxe.createSubTree(Stat.Stamina, 4, 4), 12.4));
		savageAxe.addToList(savageAxe.createTree(" of the Wolf", savageAxe.createSubTree(Stat.Agility, 4, 4), savageAxe.createSubTree(Stat.Spirit, 4, 4), 12.1));
		list.add(savageAxe);
	}
	
	private static void fillRidgeCleaver() {
		int id = 15230;
		MultiBonus ridgeCleaver = new MultiBonus("Ridge Cleaver", id);
		ridgeCleaver.addToList(ridgeCleaver.createTree(" of Agility", ridgeCleaver.createSubTree(Stat.Agility, 4, 4), null, 5.2));
		ridgeCleaver.addToList(ridgeCleaver.createTree(" of Power", ridgeCleaver.createSubTree(Stat.AttackPower, 8, 8), null, 2.6));
		ridgeCleaver.addToList(ridgeCleaver.createTree(" of Stamina", ridgeCleaver.createSubTree(Stat.Stamina, 4, 4), null, 5.9));
		ridgeCleaver.addToList(ridgeCleaver.createTree(" of Strength", ridgeCleaver.createSubTree(Stat.Strength, 4, 4), null, 6.2));
		
		ridgeCleaver.addToList(ridgeCleaver.createTree(" of the Bear", ridgeCleaver.createSubTree(Stat.Stamina, 2, 3), ridgeCleaver.createSubTree(Stat.Strength, 2, 3), 10.2));
		ridgeCleaver.addToList(ridgeCleaver.createTree(" of the Boar", ridgeCleaver.createSubTree(Stat.Spirit, 2, 3), ridgeCleaver.createSubTree(Stat.Strength, 2, 3), 13.5));
		ridgeCleaver.addToList(ridgeCleaver.createTree(" of the Eagle", ridgeCleaver.createSubTree(Stat.Intellect, 2, 3), ridgeCleaver.createSubTree(Stat.Stamina, 2, 3), 11.3));
		ridgeCleaver.addToList(ridgeCleaver.createTree(" of the Monkey", ridgeCleaver.createSubTree(Stat.Agility, 2, 3), ridgeCleaver.createSubTree(Stat.Stamina, 2, 3), 9.6));
		ridgeCleaver.addToList(ridgeCleaver.createTree(" of the Tiger", ridgeCleaver.createSubTree(Stat.Agility, 2, 3), ridgeCleaver.createSubTree(Stat.Strength, 2, 3), 10.1));
		ridgeCleaver.addToList(ridgeCleaver.createTree(" of the Whale", ridgeCleaver.createSubTree(Stat.Spirit, 2, 3), ridgeCleaver.createSubTree(Stat.Stamina, 2, 3), 13.4));
		ridgeCleaver.addToList(ridgeCleaver.createTree(" of the Wolf", ridgeCleaver.createSubTree(Stat.Agility, 2, 3), ridgeCleaver.createSubTree(Stat.Spirit, 2, 3), 11.9));
		list.add(ridgeCleaver);		
	}
	
	private static void fillMoonCleaver() {
		int id = 15236;
		MultiBonus moonCleaver = new MultiBonus("Moon Cleaver", id);
		moonCleaver.addToList(moonCleaver.createTree(" of Agility", moonCleaver.createSubTree(Stat.Agility, 9, 10), null, 5.4));
		moonCleaver.addToList(moonCleaver.createTree(" of Power", moonCleaver.createSubTree(Stat.AttackPower, 18, 20), null, 2.7));
		moonCleaver.addToList(moonCleaver.createTree(" of Stamina", moonCleaver.createSubTree(Stat.Stamina, 9, 10), null, 6.6));
		moonCleaver.addToList(moonCleaver.createTree(" of Strength", moonCleaver.createSubTree(Stat.Strength, 9, 10), null, 6.3));
		
		moonCleaver.addToList(moonCleaver.createTree(" of the Bear", moonCleaver.createSubTree(Stat.Stamina, 6, 6), moonCleaver.createSubTree(Stat.Strength, 6, 6), 10.6));
		moonCleaver.addToList(moonCleaver.createTree(" of the Boar", moonCleaver.createSubTree(Stat.Spirit, 6, 6), moonCleaver.createSubTree(Stat.Strength, 6, 6), 12.6));
		moonCleaver.addToList(moonCleaver.createTree(" of the Eagle", moonCleaver.createSubTree(Stat.Intellect, 6, 6), moonCleaver.createSubTree(Stat.Stamina, 6, 6), 11.1));
		moonCleaver.addToList(moonCleaver.createTree(" of the Monkey", moonCleaver.createSubTree(Stat.Agility, 6, 6), moonCleaver.createSubTree(Stat.Stamina, 6, 6), 10.2));
		moonCleaver.addToList(moonCleaver.createTree(" of the Tiger", moonCleaver.createSubTree(Stat.Agility, 6, 6), moonCleaver.createSubTree(Stat.Strength, 6, 6), 10.1));
		moonCleaver.addToList(moonCleaver.createTree(" of the Whale", moonCleaver.createSubTree(Stat.Spirit, 6, 6), moonCleaver.createSubTree(Stat.Stamina, 6, 6), 12.7));
		moonCleaver.addToList(moonCleaver.createTree(" of the Wolf", moonCleaver.createSubTree(Stat.Agility, 6, 6), moonCleaver.createSubTree(Stat.Spirit, 6, 6), 11.8));
		list.add(moonCleaver);		
	}
	
	private static void fillHillborneAxe() {
		int id = 2080;
		MultiBonus hillborneAxe = new MultiBonus("Hillborne Axe", id);
		hillborneAxe.addToList(hillborneAxe.createTree(" of Agility", hillborneAxe.createSubTree(Stat.Agility, 5, 6), null, 5.3));
		hillborneAxe.addToList(hillborneAxe.createTree(" of Power", hillborneAxe.createSubTree(Stat.AttackPower, 10, 12), null, 2.5));
		hillborneAxe.addToList(hillborneAxe.createTree(" of Stamina", hillborneAxe.createSubTree(Stat.Stamina, 5, 6), null, 6.0));
		hillborneAxe.addToList(hillborneAxe.createTree(" of Strength", hillborneAxe.createSubTree(Stat.Strength, 5, 6), null, 6.5));
		
		hillborneAxe.addToList(hillborneAxe.createTree(" of the Bear", hillborneAxe.createSubTree(Stat.Stamina, 3, 4), hillborneAxe.createSubTree(Stat.Strength, 3, 4), 10.4));
		hillborneAxe.addToList(hillborneAxe.createTree(" of the Boar", hillborneAxe.createSubTree(Stat.Spirit, 3, 4), hillborneAxe.createSubTree(Stat.Strength, 3, 4), 13.2));
		hillborneAxe.addToList(hillborneAxe.createTree(" of the Eagle", hillborneAxe.createSubTree(Stat.Intellect, 3, 4), hillborneAxe.createSubTree(Stat.Stamina, 3, 4), 11.0));
		hillborneAxe.addToList(hillborneAxe.createTree(" of the Monkey", hillborneAxe.createSubTree(Stat.Agility, 3, 4), hillborneAxe.createSubTree(Stat.Stamina, 3, 4), 9.6));
		hillborneAxe.addToList(hillborneAxe.createTree(" of the Tiger", hillborneAxe.createSubTree(Stat.Agility, 3, 4), hillborneAxe.createSubTree(Stat.Strength, 3, 4), 10.4));
		hillborneAxe.addToList(hillborneAxe.createTree(" of the Whale", hillborneAxe.createSubTree(Stat.Spirit, 3, 4), hillborneAxe.createSubTree(Stat.Stamina, 3, 4), 12.9));
		hillborneAxe.addToList(hillborneAxe.createTree(" of the Wolf", hillborneAxe.createSubTree(Stat.Agility, 3, 4), hillborneAxe.createSubTree(Stat.Spirit, 3, 4), 12.4));
		list.add(hillborneAxe);
	}
	
	private static void fillHackingCleaver() {
		int id = 15232;
		MultiBonus hackingCleaver = new MultiBonus("Hacking Cleaver", id);
		hackingCleaver.addToList(hackingCleaver.createTree(" of Agility", hackingCleaver.createSubTree(Stat.Agility, 5, 5), null, 5.4));
		hackingCleaver.addToList(hackingCleaver.createTree(" of Power", hackingCleaver.createSubTree(Stat.AttackPower, 10, 10), null, 2.6));
		hackingCleaver.addToList(hackingCleaver.createTree(" of Stamina", hackingCleaver.createSubTree(Stat.Stamina, 5, 5), null, 6.2));
		hackingCleaver.addToList(hackingCleaver.createTree(" of Strength", hackingCleaver.createSubTree(Stat.Strength, 5, 5), null, 6.4));
		
		hackingCleaver.addToList(hackingCleaver.createTree(" of the Bear", hackingCleaver.createSubTree(Stat.Stamina, 3, 4), hackingCleaver.createSubTree(Stat.Strength, 3, 4), 10.5));
		hackingCleaver.addToList(hackingCleaver.createTree(" of the Boar", hackingCleaver.createSubTree(Stat.Spirit, 3, 4), hackingCleaver.createSubTree(Stat.Strength, 3, 4), 12.9));
		hackingCleaver.addToList(hackingCleaver.createTree(" of the Eagle", hackingCleaver.createSubTree(Stat.Intellect, 3, 4), hackingCleaver.createSubTree(Stat.Stamina, 3, 4), 11.1));
		hackingCleaver.addToList(hackingCleaver.createTree(" of the Monkey", hackingCleaver.createSubTree(Stat.Agility, 3, 4), hackingCleaver.createSubTree(Stat.Stamina, 3, 4), 9.7));
		hackingCleaver.addToList(hackingCleaver.createTree(" of the Tiger", hackingCleaver.createSubTree(Stat.Agility, 3, 4), hackingCleaver.createSubTree(Stat.Strength, 3, 4), 10.3));
		hackingCleaver.addToList(hackingCleaver.createTree(" of the Whale", hackingCleaver.createSubTree(Stat.Spirit, 3, 4), hackingCleaver.createSubTree(Stat.Stamina, 3, 4), 12.9));
		hackingCleaver.addToList(hackingCleaver.createTree(" of the Wolf", hackingCleaver.createSubTree(Stat.Agility, 3, 4), hackingCleaver.createSubTree(Stat.Spirit, 3, 4), 12.1));
		list.add(hackingCleaver);		
	}
	
	private static void fillGruntAxe() {
		int id = 4568;
		MultiBonus gruntAxe = new MultiBonus("Grunt Axe", id);
		gruntAxe.addToList(gruntAxe.createTree(" of Agility", gruntAxe.createSubTree(Stat.Agility, 2, 3), null, 28.0));
		gruntAxe.addToList(gruntAxe.createTree(" of Power", gruntAxe.createSubTree(Stat.AttackPower, 4, 18), null, 14.1));
		gruntAxe.addToList(gruntAxe.createTree(" of Stamina", gruntAxe.createSubTree(Stat.Stamina, 2, 3), null, 28.8));
		gruntAxe.addToList(gruntAxe.createTree(" of Strength", gruntAxe.createSubTree(Stat.Strength, 2, 3), null, 29.2));
		list.add(gruntAxe);
	}
	
	private static void fillGreaterScythe() {
		int id = 15234;
		MultiBonus greaterScythe = new MultiBonus("Greater Scythe", id);
		greaterScythe.addToList(greaterScythe.createTree(" of Agility", greaterScythe.createSubTree(Stat.Agility, 7, 7), null, 5.4));
		greaterScythe.addToList(greaterScythe.createTree(" of Power", greaterScythe.createSubTree(Stat.AttackPower, 14, 14), null, 2.6));
		greaterScythe.addToList(greaterScythe.createTree(" of Stamina", greaterScythe.createSubTree(Stat.Stamina, 7, 7), null, 6.3));
		greaterScythe.addToList(greaterScythe.createTree(" of Strength", greaterScythe.createSubTree(Stat.Strength, 7, 7), null, 6.2));
		
		greaterScythe.addToList(greaterScythe.createTree(" of the Bear", greaterScythe.createSubTree(Stat.Stamina, 4, 5), greaterScythe.createSubTree(Stat.Strength, 4, 5), 10.2));
		greaterScythe.addToList(greaterScythe.createTree(" of the Boar", greaterScythe.createSubTree(Stat.Spirit, 4, 5), greaterScythe.createSubTree(Stat.Strength, 4, 5), 12.9));
		greaterScythe.addToList(greaterScythe.createTree(" of the Eagle", greaterScythe.createSubTree(Stat.Intellect, 4, 5), greaterScythe.createSubTree(Stat.Stamina, 4, 5), 10.8));
		greaterScythe.addToList(greaterScythe.createTree(" of the Monkey", greaterScythe.createSubTree(Stat.Agility, 4, 5), greaterScythe.createSubTree(Stat.Stamina, 4, 5), 9.8));
		greaterScythe.addToList(greaterScythe.createTree(" of the Tiger", greaterScythe.createSubTree(Stat.Agility, 4, 5), greaterScythe.createSubTree(Stat.Strength, 4, 5), 10.1));
		greaterScythe.addToList(greaterScythe.createTree(" of the Whale", greaterScythe.createSubTree(Stat.Spirit, 4, 5), greaterScythe.createSubTree(Stat.Stamina, 4, 5), 13.3));
		greaterScythe.addToList(greaterScythe.createTree(" of the Wolf", greaterScythe.createSubTree(Stat.Agility, 4, 5), greaterScythe.createSubTree(Stat.Spirit, 4, 5), 12.2));
		list.add(greaterScythe);			
	}
	
	private static void fillGloomReaper() {
		int id = 863;
		MultiBonus gloomReaper = new MultiBonus("Gloom Reaper", id);
		gloomReaper.addToList(gloomReaper.createTree(" of Agility", gloomReaper.createSubTree(Stat.Agility, 6, 7), null, 5.3));
		gloomReaper.addToList(gloomReaper.createTree(" of Power", gloomReaper.createSubTree(Stat.AttackPower, 12, 14), null, 2.7));
		gloomReaper.addToList(gloomReaper.createTree(" of Stamina", gloomReaper.createSubTree(Stat.Stamina, 6, 7), null, 6.3));
		gloomReaper.addToList(gloomReaper.createTree(" of Strength", gloomReaper.createSubTree(Stat.Strength, 6, 7), null, 6.6));
		
		gloomReaper.addToList(gloomReaper.createTree(" of the Bear", gloomReaper.createSubTree(Stat.Stamina, 4, 4), gloomReaper.createSubTree(Stat.Strength, 4, 4), 10.3));
		gloomReaper.addToList(gloomReaper.createTree(" of the Boar", gloomReaper.createSubTree(Stat.Spirit, 4, 4), gloomReaper.createSubTree(Stat.Strength, 4, 4), 12.9));
		gloomReaper.addToList(gloomReaper.createTree(" of the Eagle", gloomReaper.createSubTree(Stat.Intellect, 4, 4), gloomReaper.createSubTree(Stat.Stamina, 4, 4), 11.1));
		gloomReaper.addToList(gloomReaper.createTree(" of the Monkey", gloomReaper.createSubTree(Stat.Agility, 4, 4), gloomReaper.createSubTree(Stat.Stamina, 4, 4), 9.5));
		gloomReaper.addToList(gloomReaper.createTree(" of the Tiger", gloomReaper.createSubTree(Stat.Agility, 4, 4), gloomReaper.createSubTree(Stat.Strength, 4, 4), 10.1));
		gloomReaper.addToList(gloomReaper.createTree(" of the Whale", gloomReaper.createSubTree(Stat.Spirit, 4, 4), gloomReaper.createSubTree(Stat.Stamina, 4, 4), 12.9));
		gloomReaper.addToList(gloomReaper.createTree(" of the Wolf", gloomReaper.createSubTree(Stat.Agility, 4, 4), gloomReaper.createSubTree(Stat.Spirit, 4, 4), 12.2));
		list.add(gloomReaper);	
	}
	
	private static void fillForestersAxe() {
		int id = 790;
		MultiBonus forestersAxe = new MultiBonus("Forester's Axe", id);
		forestersAxe.addToList(forestersAxe.createTree(" of Agility", forestersAxe.createSubTree(Stat.Agility, 3, 3), null, 6.0));
		forestersAxe.addToList(forestersAxe.createTree(" of Power", forestersAxe.createSubTree(Stat.AttackPower, 6, 6), null, 2.7));
		forestersAxe.addToList(forestersAxe.createTree(" of Stamina", forestersAxe.createSubTree(Stat.Stamina, 3, 3), null, 5.9));
		forestersAxe.addToList(forestersAxe.createTree(" of Strength", forestersAxe.createSubTree(Stat.Strength, 3, 3), null, 6.2));
		
		forestersAxe.addToList(forestersAxe.createTree(" of the Bear", forestersAxe.createSubTree(Stat.Stamina, 1, 2), forestersAxe.createSubTree(Stat.Strength, 1, 2), 10.7));
		forestersAxe.addToList(forestersAxe.createTree(" of the Boar", forestersAxe.createSubTree(Stat.Spirit, 1, 2), forestersAxe.createSubTree(Stat.Strength, 1, 2), 12.0));
		forestersAxe.addToList(forestersAxe.createTree(" of the Eagle", forestersAxe.createSubTree(Stat.Intellect, 1, 2), forestersAxe.createSubTree(Stat.Stamina, 1, 2), 11.0));
		forestersAxe.addToList(forestersAxe.createTree(" of the Monkey", forestersAxe.createSubTree(Stat.Agility, 1, 2), forestersAxe.createSubTree(Stat.Stamina, 1, 2), 10.9));
		forestersAxe.addToList(forestersAxe.createTree(" of the Tiger", forestersAxe.createSubTree(Stat.Agility, 1, 2), forestersAxe.createSubTree(Stat.Strength, 1, 2), 10.9));
		forestersAxe.addToList(forestersAxe.createTree(" of the Whale", forestersAxe.createSubTree(Stat.Spirit, 1, 2), forestersAxe.createSubTree(Stat.Stamina, 1, 2), 12.1));
		forestersAxe.addToList(forestersAxe.createTree(" of the Wolf", forestersAxe.createSubTree(Stat.Agility, 1, 2), forestersAxe.createSubTree(Stat.Spirit, 1, 2), 11.6));
		list.add(forestersAxe);			
	}
	
	private static void fillFelstoneReaver() {
		int id = 15239;
		MultiBonus felstoneReaver = new MultiBonus("Felstone Reaver", id);
		felstoneReaver.addToList(felstoneReaver.createTree(" of Agility", felstoneReaver.createSubTree(Stat.Agility, 11, 12), null, 6.1));
		felstoneReaver.addToList(felstoneReaver.createTree(" of Power", felstoneReaver.createSubTree(Stat.AttackPower, 22, 24), null, 2.8));
		felstoneReaver.addToList(felstoneReaver.createTree(" of Stamina", felstoneReaver.createSubTree(Stat.Stamina, 11, 12), null, 5.9));
		felstoneReaver.addToList(felstoneReaver.createTree(" of Strength", felstoneReaver.createSubTree(Stat.Strength, 11, 12), null, 5.9));
		
		felstoneReaver.addToList(felstoneReaver.createTree(" of the Bear", felstoneReaver.createSubTree(Stat.Stamina, 7, 8), felstoneReaver.createSubTree(Stat.Strength, 7, 8), 11.3));
		felstoneReaver.addToList(felstoneReaver.createTree(" of the Boar", felstoneReaver.createSubTree(Stat.Spirit, 7, 8), felstoneReaver.createSubTree(Stat.Strength, 7, 8), 11.4));
		felstoneReaver.addToList(felstoneReaver.createTree(" of the Eagle", felstoneReaver.createSubTree(Stat.Intellect, 7, 8), felstoneReaver.createSubTree(Stat.Stamina, 7, 8), 11.7));
		felstoneReaver.addToList(felstoneReaver.createTree(" of the Monkey", felstoneReaver.createSubTree(Stat.Agility, 7, 8), felstoneReaver.createSubTree(Stat.Stamina, 7, 8), 11.3));
		felstoneReaver.addToList(felstoneReaver.createTree(" of the Tiger", felstoneReaver.createSubTree(Stat.Agility, 7, 8), felstoneReaver.createSubTree(Stat.Strength, 7, 8), 11.6));
		felstoneReaver.addToList(felstoneReaver.createTree(" of the Whale", felstoneReaver.createSubTree(Stat.Spirit, 7, 8), felstoneReaver.createSubTree(Stat.Stamina, 7, 8), 10.8));
		felstoneReaver.addToList(felstoneReaver.createTree(" of the Wolf", felstoneReaver.createSubTree(Stat.Agility, 7, 8), felstoneReaver.createSubTree(Stat.Spirit, 7, 8), 11.1));
		list.add(felstoneReaver);		
	}
	
	private static void fillEbonclawReaver() {
		int id = 1994;
		MultiBonus ebonclawReaver = new MultiBonus("Ebonclaw Reaver", id);
		ebonclawReaver.addToList(ebonclawReaver.createTree(" of Agility", ebonclawReaver.createSubTree(Stat.Agility, 8, 8), null, 5.6));
		ebonclawReaver.addToList(ebonclawReaver.createTree(" of Power", ebonclawReaver.createSubTree(Stat.AttackPower, 16, 16), null, 2.6));
		ebonclawReaver.addToList(ebonclawReaver.createTree(" of Stamina", ebonclawReaver.createSubTree(Stat.Stamina, 8, 8), null, 6.3));
		ebonclawReaver.addToList(ebonclawReaver.createTree(" of Strength", ebonclawReaver.createSubTree(Stat.Strength, 8, 8), null, 6.4));
		
		ebonclawReaver.addToList(ebonclawReaver.createTree(" of the Bear", ebonclawReaver.createSubTree(Stat.Stamina, 5, 6), ebonclawReaver.createSubTree(Stat.Strength, 5, 6), 10.8));
		ebonclawReaver.addToList(ebonclawReaver.createTree(" of the Boar", ebonclawReaver.createSubTree(Stat.Spirit, 5, 6), ebonclawReaver.createSubTree(Stat.Strength, 5, 6), 12.1));
		ebonclawReaver.addToList(ebonclawReaver.createTree(" of the Eagle", ebonclawReaver.createSubTree(Stat.Intellect, 5, 6), ebonclawReaver.createSubTree(Stat.Stamina, 5, 6), 11.3));
		ebonclawReaver.addToList(ebonclawReaver.createTree(" of the Monkey", ebonclawReaver.createSubTree(Stat.Agility, 5, 6), ebonclawReaver.createSubTree(Stat.Stamina, 5, 6), 10.2));
		ebonclawReaver.addToList(ebonclawReaver.createTree(" of the Tiger", ebonclawReaver.createSubTree(Stat.Agility, 5, 6), ebonclawReaver.createSubTree(Stat.Strength, 5, 6), 10.3));
		ebonclawReaver.addToList(ebonclawReaver.createTree(" of the Whale", ebonclawReaver.createSubTree(Stat.Spirit, 5, 6), ebonclawReaver.createSubTree(Stat.Stamina, 5, 6), 12.3));
		ebonclawReaver.addToList(ebonclawReaver.createTree(" of the Wolf", ebonclawReaver.createSubTree(Stat.Agility, 5, 6), ebonclawReaver.createSubTree(Stat.Spirit, 5, 6), 11.9));
		list.add(ebonclawReaver);
	}
	
	private static void fillDwarvenHatchet() {
		int id = 2073;
		MultiBonus dwarvenHatchet = new MultiBonus("Dwarven Hatchet", id);
		dwarvenHatchet.addToList(dwarvenHatchet.createTree(" of Agility", dwarvenHatchet.createSubTree(Stat.Agility, 1, 1), null, 28.7));
		dwarvenHatchet.addToList(dwarvenHatchet.createTree(" of Power", dwarvenHatchet.createSubTree(Stat.AttackPower, 2, 4), null, 13.8));
		dwarvenHatchet.addToList(dwarvenHatchet.createTree(" of Stamina", dwarvenHatchet.createSubTree(Stat.Stamina, 1, 1), null, 28.8));
		dwarvenHatchet.addToList(dwarvenHatchet.createTree(" of Strength", dwarvenHatchet.createSubTree(Stat.Strength, 1, 1), null, 28.6));
		list.add(dwarvenHatchet);
	}
	
	private static void fillDemonsClaw() {
		int id = 15240;
		MultiBonus demonsClaw = new MultiBonus("Demon's Claw", id);
		demonsClaw.addToList(demonsClaw.createTree(" of Agility", demonsClaw.createSubTree(Stat.Agility, 12, 12), null, 5.9));
		demonsClaw.addToList(demonsClaw.createTree(" of Power", demonsClaw.createSubTree(Stat.AttackPower, 24, 24), null, 2.9));
		demonsClaw.addToList(demonsClaw.createTree(" of Stamina", demonsClaw.createSubTree(Stat.Stamina, 12, 12), null, 5.5));
		demonsClaw.addToList(demonsClaw.createTree(" of Strength", demonsClaw.createSubTree(Stat.Strength, 12, 12), null, 5.9));
		
		demonsClaw.addToList(demonsClaw.createTree(" of the Bear", demonsClaw.createSubTree(Stat.Stamina, 7, 8), demonsClaw.createSubTree(Stat.Strength, 7, 8), 11.8));
		demonsClaw.addToList(demonsClaw.createTree(" of the Boar", demonsClaw.createSubTree(Stat.Spirit, 7, 8), demonsClaw.createSubTree(Stat.Strength, 7, 8), 10.6));
		demonsClaw.addToList(demonsClaw.createTree(" of the Eagle", demonsClaw.createSubTree(Stat.Intellect, 7, 8), demonsClaw.createSubTree(Stat.Stamina, 7, 8), 11.8));
		demonsClaw.addToList(demonsClaw.createTree(" of the Monkey", demonsClaw.createSubTree(Stat.Agility, 7, 8), demonsClaw.createSubTree(Stat.Stamina, 7, 8), 13.0));
		demonsClaw.addToList(demonsClaw.createTree(" of the Tiger", demonsClaw.createSubTree(Stat.Agility, 7, 8), demonsClaw.createSubTree(Stat.Strength, 7, 8), 11.0));
		demonsClaw.addToList(demonsClaw.createTree(" of the Whale", demonsClaw.createSubTree(Stat.Spirit, 7, 8), demonsClaw.createSubTree(Stat.Stamina, 7, 8), 10.3));
		demonsClaw.addToList(demonsClaw.createTree(" of the Wolf", demonsClaw.createSubTree(Stat.Agility, 7, 8), demonsClaw.createSubTree(Stat.Spirit, 7, 8), 11.2));
		list.add(demonsClaw);
	}
	
	private static void fillCrescentEdge() {
		int id = 15235;
		MultiBonus crescentEdge = new MultiBonus("Crescent Edge", id);
		crescentEdge.addToList(crescentEdge.createTree(" of Agility", crescentEdge.createSubTree(Stat.Agility, 8, 8), null, 5.9));
		crescentEdge.addToList(crescentEdge.createTree(" of Power", crescentEdge.createSubTree(Stat.AttackPower, 16, 16), null, 2.9));
		crescentEdge.addToList(crescentEdge.createTree(" of Stamina", crescentEdge.createSubTree(Stat.Stamina, 8, 8), null, 6.1));
		crescentEdge.addToList(crescentEdge.createTree(" of Strength", crescentEdge.createSubTree(Stat.Strength, 8, 8), null, 6.1));
		
		crescentEdge.addToList(crescentEdge.createTree(" of the Bear", crescentEdge.createSubTree(Stat.Stamina, 5, 6), crescentEdge.createSubTree(Stat.Strength, 5, 6), 11.0));
		crescentEdge.addToList(crescentEdge.createTree(" of the Boar", crescentEdge.createSubTree(Stat.Spirit, 5, 6), crescentEdge.createSubTree(Stat.Strength, 5, 6), 12.1));
		crescentEdge.addToList(crescentEdge.createTree(" of the Eagle", crescentEdge.createSubTree(Stat.Intellect, 5, 6), crescentEdge.createSubTree(Stat.Stamina, 5, 6), 11.0));
		crescentEdge.addToList(crescentEdge.createTree(" of the Monkey", crescentEdge.createSubTree(Stat.Agility, 5, 6), crescentEdge.createSubTree(Stat.Stamina, 5, 6), 10.4));
		crescentEdge.addToList(crescentEdge.createTree(" of the Tiger", crescentEdge.createSubTree(Stat.Agility, 5, 6), crescentEdge.createSubTree(Stat.Strength, 5, 6), 10.6));
		crescentEdge.addToList(crescentEdge.createTree(" of the Whale", crescentEdge.createSubTree(Stat.Spirit, 5, 6), crescentEdge.createSubTree(Stat.Stamina, 5, 6), 12.1));
		crescentEdge.addToList(crescentEdge.createTree(" of the Wolf", crescentEdge.createSubTree(Stat.Agility, 5, 6), crescentEdge.createSubTree(Stat.Spirit, 5, 6), 11.8));
		list.add(crescentEdge);
	}
	
	private static void fillCorpseHarvester() {
		int id = 15237;
		MultiBonus corpseHarvester = new MultiBonus("Corpse Harvester", id);
		corpseHarvester.addToList(corpseHarvester.createTree(" of Agility", corpseHarvester.createSubTree(Stat.Agility, 10, 10), null, 5.7));
		corpseHarvester.addToList(corpseHarvester.createTree(" of Power", corpseHarvester.createSubTree(Stat.AttackPower, 20, 20), null, 2.5));
		corpseHarvester.addToList(corpseHarvester.createTree(" of Stamina", corpseHarvester.createSubTree(Stat.Stamina, 10, 10), null, 6.2));
		corpseHarvester.addToList(corpseHarvester.createTree(" of Strength", corpseHarvester.createSubTree(Stat.Strength, 10, 10), null, 6.1));
		
		corpseHarvester.addToList(corpseHarvester.createTree(" of the Bear", corpseHarvester.createSubTree(Stat.Stamina, 6, 7), corpseHarvester.createSubTree(Stat.Strength, 6, 7), 10.7));
		corpseHarvester.addToList(corpseHarvester.createTree(" of the Boar", corpseHarvester.createSubTree(Stat.Spirit, 6, 7), corpseHarvester.createSubTree(Stat.Strength, 6, 7), 12.7));
		corpseHarvester.addToList(corpseHarvester.createTree(" of the Eagle", corpseHarvester.createSubTree(Stat.Intellect, 6, 7), corpseHarvester.createSubTree(Stat.Stamina, 6, 7), 11.4));
		corpseHarvester.addToList(corpseHarvester.createTree(" of the Monkey", corpseHarvester.createSubTree(Stat.Agility, 6, 7), corpseHarvester.createSubTree(Stat.Stamina, 6, 7), 10.1));
		corpseHarvester.addToList(corpseHarvester.createTree(" of the Tiger", corpseHarvester.createSubTree(Stat.Agility, 6, 7), corpseHarvester.createSubTree(Stat.Strength, 6, 7), 10.3));
		corpseHarvester.addToList(corpseHarvester.createTree(" of the Whale", corpseHarvester.createSubTree(Stat.Spirit, 6, 7), corpseHarvester.createSubTree(Stat.Stamina, 6, 7), 12.5));
		corpseHarvester.addToList(corpseHarvester.createTree(" of the Wolf", corpseHarvester.createSubTree(Stat.Agility, 6, 7), corpseHarvester.createSubTree(Stat.Spirit, 6, 7), 11.8));
		list.add(corpseHarvester);
	}
	
	private static void fillZulianHacker() {	//Adds +2 Axes per default!
		int id = 19921;
		MultiBonus zulianHacker = new MultiBonus("Zulian Hacker", id);
		zulianHacker.addToList(zulianHacker.createTree(" of Agility", zulianHacker.createSubTree(Stat.Agility, 12, 12), null, 8.4));
		zulianHacker.addToList(zulianHacker.createTree(" of Stamina", zulianHacker.createSubTree(Stat.Stamina, 12, 12), null, 6.9));
		zulianHacker.addToList(zulianHacker.createTree(" of Strength", zulianHacker.createSubTree(Stat.Strength, 12, 12), null, 5.0));
		
		zulianHacker.addToList(zulianHacker.createTree(" of the Bear", zulianHacker.createSubTree(Stat.Stamina, 7, 8), zulianHacker.createSubTree(Stat.Strength, 7, 8), 12.0));
		zulianHacker.addToList(zulianHacker.createTree(" of the Boar", zulianHacker.createSubTree(Stat.Spirit, 7, 8), zulianHacker.createSubTree(Stat.Strength, 7, 8), 18.0));
		zulianHacker.addToList(zulianHacker.createTree(" of the Eagle", zulianHacker.createSubTree(Stat.Intellect, 8, 8), zulianHacker.createSubTree(Stat.Stamina, 8, 8), 8.0));
		zulianHacker.addToList(zulianHacker.createTree(" of the Monkey", zulianHacker.createSubTree(Stat.Agility, 8, 8), zulianHacker.createSubTree(Stat.Stamina, 8, 8), 11.6));
		zulianHacker.addToList(zulianHacker.createTree(" of the Tiger", zulianHacker.createSubTree(Stat.Agility, 7, 8), zulianHacker.createSubTree(Stat.Strength, 8, 8), 15.8));
		zulianHacker.addToList(zulianHacker.createTree(" of the Whale", zulianHacker.createSubTree(Stat.Spirit, 8, 8), zulianHacker.createSubTree(Stat.Stamina, 8, 8), 9.3));
		zulianHacker.addToList(zulianHacker.createTree(" of the Wolf", zulianHacker.createSubTree(Stat.Agility, 8, 8), zulianHacker.createSubTree(Stat.Spirit, 8, 8), 5.1));
		list.add(zulianHacker);
	}
	
	private static void fillRibsplitter() {		//Adds 10 AP per default!
		int id = 12527;
		MultiBonus ribsplitter = new MultiBonus("Ribsplitter", id);
		ribsplitter.addToList(ribsplitter.createTree(" of Agility", ribsplitter.createSubTree(Stat.Agility, 11, 11), null, 5.7));
		ribsplitter.addToList(ribsplitter.createTree(" of Power", ribsplitter.createSubTree(Stat.AttackPower, 22, 22), null, 2.7));
		ribsplitter.addToList(ribsplitter.createTree(" of Stamina", ribsplitter.createSubTree(Stat.Stamina, 11, 11), null, 5.5));
		ribsplitter.addToList(ribsplitter.createTree(" of Strength", ribsplitter.createSubTree(Stat.Strength, 11, 11), null, 7.5));
		
		ribsplitter.addToList(ribsplitter.createTree(" of the Bear", ribsplitter.createSubTree(Stat.Stamina, 7, 7), ribsplitter.createSubTree(Stat.Strength, 7, 7), 10.1));
		ribsplitter.addToList(ribsplitter.createTree(" of the Boar", ribsplitter.createSubTree(Stat.Spirit, 7, 7), ribsplitter.createSubTree(Stat.Strength, 7, 7), 12.9));
		ribsplitter.addToList(ribsplitter.createTree(" of the Eagle", ribsplitter.createSubTree(Stat.Intellect, 7, 7), ribsplitter.createSubTree(Stat.Stamina, 7, 7), 11.4));
		ribsplitter.addToList(ribsplitter.createTree(" of the Monkey", ribsplitter.createSubTree(Stat.Agility, 7, 7), ribsplitter.createSubTree(Stat.Stamina, 7, 7), 10.7));
		ribsplitter.addToList(ribsplitter.createTree(" of the Tiger", ribsplitter.createSubTree(Stat.Agility, 7, 7), ribsplitter.createSubTree(Stat.Strength, 7, 7), 10.1));
		ribsplitter.addToList(ribsplitter.createTree(" of the Whale", ribsplitter.createSubTree(Stat.Spirit, 7, 7), ribsplitter.createSubTree(Stat.Stamina, 7, 7), 12.6));
		ribsplitter.addToList(ribsplitter.createTree(" of the Wolf", ribsplitter.createSubTree(Stat.Agility, 7, 7), ribsplitter.createSubTree(Stat.Spirit, 7, 7), 10.8));
		list.add(ribsplitter);
	}
}
