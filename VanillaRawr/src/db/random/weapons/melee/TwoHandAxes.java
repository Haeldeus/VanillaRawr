package db.random.weapons.melee;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class TwoHandAxes {

	private static ArrayList<MultiBonus> list;

	private static int[] ids = {
		3201, 3195, 3199, 3210, 15271, 15273, 15270, 1639, 15269, 1640, 15272, 4562, 15268
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
		fillBarbarianWarAxe();
		fillBarbaricBattleAxe();
		fillBattleSlayer();
		fillBrutalWarAxe();
		fillColossalGreatAxe();
		fillDeathStriker();
		fillGiganticWarAxe();
		fillGrinningAxe();
		fillMassiveBattleAxe();
		fillMonstrousWarAxe();
		fillRazorAxe();
		fillSeveringAxe();
		fillTwinbladedAxe();
/*		System.out.println(list.get(0));
		System.out.println("--------------");
		System.out.println(list.get(1));
		System.out.println("--------------");
		System.out.println(list.get(2));
		System.out.println("--------------");
		System.out.println(list.get(3));
		System.out.println("--------------");
		System.out.println(list.get(4));
		System.out.println("--------------");
		System.out.println(list.get(5));
		System.out.println("--------------");
		System.out.println(list.get(6));
		System.out.println("--------------");
		System.out.println(list.get(7));
		System.out.println("--------------");
		System.out.println(list.get(8));
		System.out.println("--------------");
		System.out.println(list.get(9));
		System.out.println("--------------");
		System.out.println(list.get(10));
		System.out.println("--------------");
		System.out.println(list.get(11));
		System.out.println("--------------");
		System.out.println(list.get(12));
		System.out.println("--------------"); */
	}
	
	private static void fillTwinbladedAxe() {
		int id = 15268;
		MultiBonus twinbladedAxe = new MultiBonus("Twin-bladed Axe", id);
		twinbladedAxe.addToList(twinbladedAxe.createTree(" of Agility", twinbladedAxe.createSubTree(Stat.Agility, 4, 5), null, 5.9));
		twinbladedAxe.addToList(twinbladedAxe.createTree(" of Power", twinbladedAxe.createSubTree(Stat.AttackPower, 8, 10), null, 2.6));
		twinbladedAxe.addToList(twinbladedAxe.createTree(" of Stamina", twinbladedAxe.createSubTree(Stat.Stamina, 4, 5), null, 6.1));
		twinbladedAxe.addToList(twinbladedAxe.createTree(" of Strength", twinbladedAxe.createSubTree(Stat.Strength, 4, 5), null, 5.8));
		
		twinbladedAxe.addToList(twinbladedAxe.createTree(" of the Bear", twinbladedAxe.createSubTree(Stat.Stamina, 2, 3), twinbladedAxe.createSubTree(Stat.Strength, 2, 3), 9.6));
		twinbladedAxe.addToList(twinbladedAxe.createTree(" of the Boar", twinbladedAxe.createSubTree(Stat.Spirit, 2, 3), twinbladedAxe.createSubTree(Stat.Strength, 2, 3), 12.5));
		twinbladedAxe.addToList(twinbladedAxe.createTree(" of the Eagle", twinbladedAxe.createSubTree(Stat.Intellect, 2, 3), twinbladedAxe.createSubTree(Stat.Stamina, 2, 3), 12.5));
		twinbladedAxe.addToList(twinbladedAxe.createTree(" of the Monkey", twinbladedAxe.createSubTree(Stat.Agility, 2, 3), twinbladedAxe.createSubTree(Stat.Stamina, 2, 3), 9.8));
		twinbladedAxe.addToList(twinbladedAxe.createTree(" of the Tiger", twinbladedAxe.createSubTree(Stat.Agility, 2, 3), twinbladedAxe.createSubTree(Stat.Strength, 2, 3), 10.0));
		twinbladedAxe.addToList(twinbladedAxe.createTree(" of the Whale", twinbladedAxe.createSubTree(Stat.Spirit, 2, 3), twinbladedAxe.createSubTree(Stat.Stamina, 2, 3), 13.0));
		twinbladedAxe.addToList(twinbladedAxe.createTree(" of the Wolf", twinbladedAxe.createSubTree(Stat.Agility, 2, 3), twinbladedAxe.createSubTree(Stat.Spirit, 2, 3), 12.3));
		list.add(twinbladedAxe);
	}
	
	private static void fillSeveringAxe() {
		int id = 4562;
		MultiBonus severingAxe = new MultiBonus("Severing Axe", id);
		severingAxe.addToList(severingAxe.createTree(" of Agility", severingAxe.createSubTree(Stat.Agility, 3, 4), null, 6.1));
		severingAxe.addToList(severingAxe.createTree(" of Power", severingAxe.createSubTree(Stat.AttackPower, 4, 8), null, 2.6));
		severingAxe.addToList(severingAxe.createTree(" of Stamina", severingAxe.createSubTree(Stat.Stamina, 3, 4), null, 5.8));
		severingAxe.addToList(severingAxe.createTree(" of Strength", severingAxe.createSubTree(Stat.Strength, 3, 4), null, 5.7));
		
		severingAxe.addToList(severingAxe.createTree(" of the Bear", severingAxe.createSubTree(Stat.Stamina, 1, 2), severingAxe.createSubTree(Stat.Strength, 1, 2), 10.4));
		severingAxe.addToList(severingAxe.createTree(" of the Boar", severingAxe.createSubTree(Stat.Spirit, 1, 2), severingAxe.createSubTree(Stat.Strength, 1, 2), 12.0));
		severingAxe.addToList(severingAxe.createTree(" of the Eagle", severingAxe.createSubTree(Stat.Intellect, 1, 2), severingAxe.createSubTree(Stat.Stamina, 1, 2), 12.0));
		severingAxe.addToList(severingAxe.createTree(" of the Monkey", severingAxe.createSubTree(Stat.Agility, 1, 2), severingAxe.createSubTree(Stat.Stamina, 1, 2), 10.7));
		severingAxe.addToList(severingAxe.createTree(" of the Tiger", severingAxe.createSubTree(Stat.Agility, 1, 2), severingAxe.createSubTree(Stat.Strength, 1, 2), 10.7));
		severingAxe.addToList(severingAxe.createTree(" of the Whale", severingAxe.createSubTree(Stat.Spirit, 1, 2), severingAxe.createSubTree(Stat.Stamina, 1, 2), 11.9));
		severingAxe.addToList(severingAxe.createTree(" of the Wolf", severingAxe.createSubTree(Stat.Agility, 1, 2), severingAxe.createSubTree(Stat.Spirit, 1, 2), 12.2));
		list.add(severingAxe);
	}
	
	private static void fillRazorAxe() {
		int id = 15272;
		MultiBonus razorAxe = new MultiBonus("Razor Axe", id);
		razorAxe.addToList(razorAxe.createTree(" of Agility", razorAxe.createSubTree(Stat.Agility, 25, 26), null, 5.6));
		razorAxe.addToList(razorAxe.createTree(" of Power", razorAxe.createSubTree(Stat.AttackPower, 50, 52), null, 2.7));
		razorAxe.addToList(razorAxe.createTree(" of Stamina", razorAxe.createSubTree(Stat.Stamina, 25, 26), null, 6.4));
		razorAxe.addToList(razorAxe.createTree(" of Strength", razorAxe.createSubTree(Stat.Strength, 25, 26), null, 6.6));
		
		razorAxe.addToList(razorAxe.createTree(" of the Bear", razorAxe.createSubTree(Stat.Stamina, 16, 17), razorAxe.createSubTree(Stat.Strength, 16, 17), 12.3));
		razorAxe.addToList(razorAxe.createTree(" of the Boar", razorAxe.createSubTree(Stat.Spirit, 16, 17), razorAxe.createSubTree(Stat.Strength, 16, 17), 11.0));
		razorAxe.addToList(razorAxe.createTree(" of the Eagle", razorAxe.createSubTree(Stat.Intellect, 16, 17), razorAxe.createSubTree(Stat.Stamina, 16, 17), 10.8));
		razorAxe.addToList(razorAxe.createTree(" of the Monkey", razorAxe.createSubTree(Stat.Agility, 16, 17), razorAxe.createSubTree(Stat.Stamina, 16, 17), 10.9));
		razorAxe.addToList(razorAxe.createTree(" of the Tiger", razorAxe.createSubTree(Stat.Agility, 16, 17), razorAxe.createSubTree(Stat.Strength, 16, 17), 11.9));
		razorAxe.addToList(razorAxe.createTree(" of the Whale", razorAxe.createSubTree(Stat.Spirit, 16, 17), razorAxe.createSubTree(Stat.Stamina, 16, 17), 10.7));
		razorAxe.addToList(razorAxe.createTree(" of the Wolf", razorAxe.createSubTree(Stat.Agility, 16, 17), razorAxe.createSubTree(Stat.Spirit, 16, 17), 10.8));
		list.add(razorAxe);
	}
	
	private static void fillMonstrousWarAxe() {
		int id = 1640;
		MultiBonus monstrousWarAxe = new MultiBonus("Monstrous War Axe", id);
		monstrousWarAxe.addToList(monstrousWarAxe.createTree(" of Agility", monstrousWarAxe.createSubTree(Stat.Agility, 16, 17), null, 4.6));
		monstrousWarAxe.addToList(monstrousWarAxe.createTree(" of Power", monstrousWarAxe.createSubTree(Stat.AttackPower, 32, 34), null, 2.4));
		monstrousWarAxe.addToList(monstrousWarAxe.createTree(" of Stamina", monstrousWarAxe.createSubTree(Stat.Stamina, 16, 17), null, 6.4));
		monstrousWarAxe.addToList(monstrousWarAxe.createTree(" of Strength", monstrousWarAxe.createSubTree(Stat.Strength, 16, 17), null, 6.9));
		
		monstrousWarAxe.addToList(monstrousWarAxe.createTree(" of the Bear", monstrousWarAxe.createSubTree(Stat.Stamina, 10, 11), monstrousWarAxe.createSubTree(Stat.Strength, 10, 11), 11.6));
		monstrousWarAxe.addToList(monstrousWarAxe.createTree(" of the Boar", monstrousWarAxe.createSubTree(Stat.Spirit, 10, 11), monstrousWarAxe.createSubTree(Stat.Strength, 10, 11), 13.1));
		monstrousWarAxe.addToList(monstrousWarAxe.createTree(" of the Eagle", monstrousWarAxe.createSubTree(Stat.Intellect, 10, 11), monstrousWarAxe.createSubTree(Stat.Stamina, 10, 11), 11.5));
		monstrousWarAxe.addToList(monstrousWarAxe.createTree(" of the Monkey", monstrousWarAxe.createSubTree(Stat.Agility, 10, 11), monstrousWarAxe.createSubTree(Stat.Stamina, 10, 11), 8.8));
		monstrousWarAxe.addToList(monstrousWarAxe.createTree(" of the Tiger", monstrousWarAxe.createSubTree(Stat.Agility, 10, 11), monstrousWarAxe.createSubTree(Stat.Strength, 10, 11), 10.5));
		monstrousWarAxe.addToList(monstrousWarAxe.createTree(" of the Whale", monstrousWarAxe.createSubTree(Stat.Spirit, 10, 11), monstrousWarAxe.createSubTree(Stat.Stamina, 10, 11), 12.7));
		monstrousWarAxe.addToList(monstrousWarAxe.createTree(" of the Wolf", monstrousWarAxe.createSubTree(Stat.Agility, 10, 11), monstrousWarAxe.createSubTree(Stat.Spirit, 10, 11), 11.4));
		list.add(monstrousWarAxe);
	}
	
	private static void fillMassiveBattleAxe() {
		int id = 15269;
		MultiBonus massiveBattleAxe = new MultiBonus("Massive Battle Axe", id);
		massiveBattleAxe.addToList(massiveBattleAxe.createTree(" of Agility", massiveBattleAxe.createSubTree(Stat.Agility, 7, 8), null, 5.7));
		massiveBattleAxe.addToList(massiveBattleAxe.createTree(" of Power", massiveBattleAxe.createSubTree(Stat.AttackPower, 10, 16), null, 2.6));
		massiveBattleAxe.addToList(massiveBattleAxe.createTree(" of Stamina", massiveBattleAxe.createSubTree(Stat.Stamina, 7, 8), null, 6.2));
		massiveBattleAxe.addToList(massiveBattleAxe.createTree(" of Strength", massiveBattleAxe.createSubTree(Stat.Strength, 7, 8), null, 6.5));
		
		massiveBattleAxe.addToList(massiveBattleAxe.createTree(" of the Bear", massiveBattleAxe.createSubTree(Stat.Stamina, 4, 5), massiveBattleAxe.createSubTree(Stat.Strength, 4, 5), 10.9));
		massiveBattleAxe.addToList(massiveBattleAxe.createTree(" of the Boar", massiveBattleAxe.createSubTree(Stat.Spirit, 4, 5), massiveBattleAxe.createSubTree(Stat.Strength, 4, 5), 12.1));
		massiveBattleAxe.addToList(massiveBattleAxe.createTree(" of the Eagle", massiveBattleAxe.createSubTree(Stat.Intellect, 4, 5), massiveBattleAxe.createSubTree(Stat.Stamina, 4, 5), 11.6));
		massiveBattleAxe.addToList(massiveBattleAxe.createTree(" of the Monkey", massiveBattleAxe.createSubTree(Stat.Agility, 4, 5), massiveBattleAxe.createSubTree(Stat.Stamina, 4, 5), 9.5));
		massiveBattleAxe.addToList(massiveBattleAxe.createTree(" of the Tiger", massiveBattleAxe.createSubTree(Stat.Agility, 4, 5), massiveBattleAxe.createSubTree(Stat.Strength, 4, 5), 10.8));
		massiveBattleAxe.addToList(massiveBattleAxe.createTree(" of the Whale", massiveBattleAxe.createSubTree(Stat.Spirit, 4, 5), massiveBattleAxe.createSubTree(Stat.Stamina, 4, 5), 12.0));
		massiveBattleAxe.addToList(massiveBattleAxe.createTree(" of the Wolf", massiveBattleAxe.createSubTree(Stat.Agility, 4, 5), massiveBattleAxe.createSubTree(Stat.Spirit, 4, 5), 12.0));
		list.add(massiveBattleAxe);
	}
	
	private static void fillGrinningAxe() {
		int id = 1639;
		MultiBonus grinningAxe = new MultiBonus("Grinning Axe", id);
		grinningAxe.addToList(grinningAxe.createTree(" of Agility", grinningAxe.createSubTree(Stat.Agility, 21, 22), null, 4.3));
		grinningAxe.addToList(grinningAxe.createTree(" of Power", grinningAxe.createSubTree(Stat.AttackPower, 42, 44), null, 2.4));
		grinningAxe.addToList(grinningAxe.createTree(" of Stamina", grinningAxe.createSubTree(Stat.Stamina, 21, 22), null, 6.7));
		grinningAxe.addToList(grinningAxe.createTree(" of Strength", grinningAxe.createSubTree(Stat.Strength, 21, 22), null, 6.9));
		
		grinningAxe.addToList(grinningAxe.createTree(" of the Bear", grinningAxe.createSubTree(Stat.Stamina, 13, 14), grinningAxe.createSubTree(Stat.Strength, 13, 14), 12.2));
		grinningAxe.addToList(grinningAxe.createTree(" of the Boar", grinningAxe.createSubTree(Stat.Spirit, 13, 14), grinningAxe.createSubTree(Stat.Strength, 13, 14), 12.4));
		grinningAxe.addToList(grinningAxe.createTree(" of the Eagle", grinningAxe.createSubTree(Stat.Intellect, 13, 14), grinningAxe.createSubTree(Stat.Stamina, 13, 14), 11.8));
		grinningAxe.addToList(grinningAxe.createTree(" of the Monkey", grinningAxe.createSubTree(Stat.Agility, 13, 14), grinningAxe.createSubTree(Stat.Stamina, 13, 14), 9.3));
		grinningAxe.addToList(grinningAxe.createTree(" of the Tiger", grinningAxe.createSubTree(Stat.Agility, 13, 14), grinningAxe.createSubTree(Stat.Strength, 13, 14), 11.2));
		grinningAxe.addToList(grinningAxe.createTree(" of the Whale", grinningAxe.createSubTree(Stat.Spirit, 13, 14), grinningAxe.createSubTree(Stat.Stamina, 13, 14), 11.8));
		grinningAxe.addToList(grinningAxe.createTree(" of the Wolf", grinningAxe.createSubTree(Stat.Agility, 13, 14), grinningAxe.createSubTree(Stat.Spirit, 13, 14), 11.3));
		list.add(grinningAxe);
	}
	
	private static void fillGiganticWarAxe() {
		int id = 15270;
		MultiBonus giganticWarAxe = new MultiBonus("Gigantic War Axe", id);
		giganticWarAxe.addToList(giganticWarAxe.createTree(" of Agility", giganticWarAxe.createSubTree(Stat.Agility, 19, 20), null, 4.8));
		giganticWarAxe.addToList(giganticWarAxe.createTree(" of Power", giganticWarAxe.createSubTree(Stat.AttackPower, 32, 38), null, 2.6));
		giganticWarAxe.addToList(giganticWarAxe.createTree(" of Stamina", giganticWarAxe.createSubTree(Stat.Stamina, 19, 20), null, 6.7));
		giganticWarAxe.addToList(giganticWarAxe.createTree(" of Strength", giganticWarAxe.createSubTree(Stat.Strength, 19, 20), null, 7.1));
		
		giganticWarAxe.addToList(giganticWarAxe.createTree(" of the Bear", giganticWarAxe.createSubTree(Stat.Stamina, 12, 13), giganticWarAxe.createSubTree(Stat.Strength, 12, 13), 12.3));
		giganticWarAxe.addToList(giganticWarAxe.createTree(" of the Boar", giganticWarAxe.createSubTree(Stat.Spirit, 12, 13), giganticWarAxe.createSubTree(Stat.Strength, 12, 13), 12.1));
		giganticWarAxe.addToList(giganticWarAxe.createTree(" of the Eagle", giganticWarAxe.createSubTree(Stat.Intellect, 12, 13), giganticWarAxe.createSubTree(Stat.Stamina, 12, 13), 11.4));
		giganticWarAxe.addToList(giganticWarAxe.createTree(" of the Monkey", giganticWarAxe.createSubTree(Stat.Agility, 12, 13), giganticWarAxe.createSubTree(Stat.Stamina, 12, 13), 9.1));
		giganticWarAxe.addToList(giganticWarAxe.createTree(" of the Tiger", giganticWarAxe.createSubTree(Stat.Agility, 12, 13), giganticWarAxe.createSubTree(Stat.Strength, 12, 13), 11.2));
		giganticWarAxe.addToList(giganticWarAxe.createTree(" of the Whale", giganticWarAxe.createSubTree(Stat.Spirit, 12, 13), giganticWarAxe.createSubTree(Stat.Stamina, 12, 13), 11.7));
		giganticWarAxe.addToList(giganticWarAxe.createTree(" of the Wolf", giganticWarAxe.createSubTree(Stat.Agility, 12, 13), giganticWarAxe.createSubTree(Stat.Spirit, 12, 13), 10.8));
		list.add(giganticWarAxe);
	}
	
	private static void fillDeathStriker() {
		int id = 15273;
		MultiBonus deathStriker = new MultiBonus("Death Striker", id);
		deathStriker.addToList(deathStriker.createTree(" of Agility", deathStriker.createSubTree(Stat.Agility, 27, 28), null, 6.3));
		deathStriker.addToList(deathStriker.createTree(" of Power", deathStriker.createSubTree(Stat.AttackPower, 54, 56), null, 2.7));
		deathStriker.addToList(deathStriker.createTree(" of Stamina", deathStriker.createSubTree(Stat.Stamina, 27, 28), null, 6.2));
		deathStriker.addToList(deathStriker.createTree(" of Strength", deathStriker.createSubTree(Stat.Strength, 27, 28), null, 6.1));
		
		deathStriker.addToList(deathStriker.createTree(" of the Bear", deathStriker.createSubTree(Stat.Stamina, 17, 18), deathStriker.createSubTree(Stat.Strength, 17, 18), 13.0));
		deathStriker.addToList(deathStriker.createTree(" of the Boar", deathStriker.createSubTree(Stat.Spirit, 17, 18), deathStriker.createSubTree(Stat.Strength, 17, 18), 10.1));
		deathStriker.addToList(deathStriker.createTree(" of the Eagle", deathStriker.createSubTree(Stat.Intellect, 17, 18), deathStriker.createSubTree(Stat.Stamina, 17, 18), 10.9));
		deathStriker.addToList(deathStriker.createTree(" of the Monkey", deathStriker.createSubTree(Stat.Agility, 17, 18), deathStriker.createSubTree(Stat.Stamina, 17, 18), 12.5));
		deathStriker.addToList(deathStriker.createTree(" of the Tiger", deathStriker.createSubTree(Stat.Agility, 17, 18), deathStriker.createSubTree(Stat.Strength, 17, 18), 12.1));
		deathStriker.addToList(deathStriker.createTree(" of the Whale", deathStriker.createSubTree(Stat.Spirit, 17, 18), deathStriker.createSubTree(Stat.Stamina, 17, 18), 10.3));
		deathStriker.addToList(deathStriker.createTree(" of the Wolf", deathStriker.createSubTree(Stat.Agility, 17, 18), deathStriker.createSubTree(Stat.Spirit, 17, 18), 9.6));
		list.add(deathStriker);
	}
	
	private static void fillColossalGreatAxe() {
		int id = 15271;
		MultiBonus colossalGreatAxe = new MultiBonus("Colossal War Axe", id);
		colossalGreatAxe.addToList(colossalGreatAxe.createTree(" of Agility", colossalGreatAxe.createSubTree(Stat.Agility, 24, 25), null, 5.7));
		colossalGreatAxe.addToList(colossalGreatAxe.createTree(" of Power", colossalGreatAxe.createSubTree(Stat.AttackPower, 48, 50), null, 2.8));
		colossalGreatAxe.addToList(colossalGreatAxe.createTree(" of Stamina", colossalGreatAxe.createSubTree(Stat.Stamina, 24, 25), null, 6.3));
		colossalGreatAxe.addToList(colossalGreatAxe.createTree(" of Strength", colossalGreatAxe.createSubTree(Stat.Strength, 24, 25), null, 6.3));
		
		colossalGreatAxe.addToList(colossalGreatAxe.createTree(" of the Bear", colossalGreatAxe.createSubTree(Stat.Stamina, 15, 16), colossalGreatAxe.createSubTree(Stat.Strength, 15, 16), 11.8));
		colossalGreatAxe.addToList(colossalGreatAxe.createTree(" of the Boar", colossalGreatAxe.createSubTree(Stat.Spirit, 15, 16), colossalGreatAxe.createSubTree(Stat.Strength, 15, 16), 11.5));
		colossalGreatAxe.addToList(colossalGreatAxe.createTree(" of the Eagle", colossalGreatAxe.createSubTree(Stat.Intellect, 15, 16), colossalGreatAxe.createSubTree(Stat.Stamina, 15, 16), 11.3));
		colossalGreatAxe.addToList(colossalGreatAxe.createTree(" of the Monkey", colossalGreatAxe.createSubTree(Stat.Agility, 15, 16), colossalGreatAxe.createSubTree(Stat.Stamina, 15, 16), 10.4));
		colossalGreatAxe.addToList(colossalGreatAxe.createTree(" of the Tiger", colossalGreatAxe.createSubTree(Stat.Agility, 15, 16), colossalGreatAxe.createSubTree(Stat.Strength, 15, 16), 11.9));
		colossalGreatAxe.addToList(colossalGreatAxe.createTree(" of the Whale", colossalGreatAxe.createSubTree(Stat.Spirit, 15, 16), colossalGreatAxe.createSubTree(Stat.Stamina, 15, 16), 10.8));
		colossalGreatAxe.addToList(colossalGreatAxe.createTree(" of the Wolf", colossalGreatAxe.createSubTree(Stat.Agility, 15, 16), colossalGreatAxe.createSubTree(Stat.Spirit, 15, 16), 11.3));
		list.add(colossalGreatAxe);
	}
	
	private static void fillBrutalWarAxe() {
		int id = 3210;
		MultiBonus brutalWarAxe = new MultiBonus("Brutal War Axe", id);
		brutalWarAxe.addToList(brutalWarAxe.createTree(" of Agility", brutalWarAxe.createSubTree(Stat.Agility, 10, 11), null, 5.3));
		brutalWarAxe.addToList(brutalWarAxe.createTree(" of Power", brutalWarAxe.createSubTree(Stat.AttackPower, 12, 22), null, 2.4));
		brutalWarAxe.addToList(brutalWarAxe.createTree(" of Stamina", brutalWarAxe.createSubTree(Stat.Stamina, 10, 11), null, 6.3));
		brutalWarAxe.addToList(brutalWarAxe.createTree(" of Strength", brutalWarAxe.createSubTree(Stat.Strength, 10, 11), null, 6.1));
		
		brutalWarAxe.addToList(brutalWarAxe.createTree(" of the Bear", brutalWarAxe.createSubTree(Stat.Stamina, 6, 7), brutalWarAxe.createSubTree(Stat.Strength, 6, 7), 9.9));
		brutalWarAxe.addToList(brutalWarAxe.createTree(" of the Boar", brutalWarAxe.createSubTree(Stat.Spirit, 6, 7), brutalWarAxe.createSubTree(Stat.Strength, 6, 7), 13.0));
		brutalWarAxe.addToList(brutalWarAxe.createTree(" of the Eagle", brutalWarAxe.createSubTree(Stat.Intellect, 6, 7), brutalWarAxe.createSubTree(Stat.Stamina, 6, 7), 11.6));
		brutalWarAxe.addToList(brutalWarAxe.createTree(" of the Monkey", brutalWarAxe.createSubTree(Stat.Agility, 6, 7), brutalWarAxe.createSubTree(Stat.Stamina, 6, 7), 9.4));
		brutalWarAxe.addToList(brutalWarAxe.createTree(" of the Tiger", brutalWarAxe.createSubTree(Stat.Agility, 6, 7), brutalWarAxe.createSubTree(Stat.Strength, 6, 7), 10.0));
		brutalWarAxe.addToList(brutalWarAxe.createTree(" of the Whale", brutalWarAxe.createSubTree(Stat.Spirit, 6, 7), brutalWarAxe.createSubTree(Stat.Stamina, 6, 7), 13.2));
		brutalWarAxe.addToList(brutalWarAxe.createTree(" of the Wolf", brutalWarAxe.createSubTree(Stat.Agility, 6, 7), brutalWarAxe.createSubTree(Stat.Spirit, 6, 7), 12.8));
		list.add(brutalWarAxe);
	}
	
	private static void fillBattleSlayer() {
		int id = 3199;
		MultiBonus battleSlayer = new MultiBonus("Battle Slayer", id);
		battleSlayer.addToList(battleSlayer.createTree(" of Agility", battleSlayer.createSubTree(Stat.Agility, 7, 8), null, 5.5));
		battleSlayer.addToList(battleSlayer.createTree(" of Power", battleSlayer.createSubTree(Stat.AttackPower, 14, 16), null, 2.7));
		battleSlayer.addToList(battleSlayer.createTree(" of Stamina", battleSlayer.createSubTree(Stat.Stamina, 7, 8), null, 6.4));
		battleSlayer.addToList(battleSlayer.createTree(" of Strength", battleSlayer.createSubTree(Stat.Strength, 7, 8), null, 6.2));
		
		battleSlayer.addToList(battleSlayer.createTree(" of the Bear", battleSlayer.createSubTree(Stat.Stamina, 4, 5), battleSlayer.createSubTree(Stat.Strength, 4, 5), 10.5));
		battleSlayer.addToList(battleSlayer.createTree(" of the Boar", battleSlayer.createSubTree(Stat.Spirit, 4, 5), battleSlayer.createSubTree(Stat.Strength, 4, 5), 12.2));
		battleSlayer.addToList(battleSlayer.createTree(" of the Eagle", battleSlayer.createSubTree(Stat.Intellect, 4, 5), battleSlayer.createSubTree(Stat.Stamina, 4, 5), 11.9));
		battleSlayer.addToList(battleSlayer.createTree(" of the Monkey", battleSlayer.createSubTree(Stat.Agility, 4, 5), battleSlayer.createSubTree(Stat.Stamina, 4, 5), 9.5));
		battleSlayer.addToList(battleSlayer.createTree(" of the Tiger", battleSlayer.createSubTree(Stat.Agility, 4, 5), battleSlayer.createSubTree(Stat.Strength, 4, 5), 10.7));
		battleSlayer.addToList(battleSlayer.createTree(" of the Whale", battleSlayer.createSubTree(Stat.Spirit, 4, 5), battleSlayer.createSubTree(Stat.Stamina, 4, 5), 12.4));
		battleSlayer.addToList(battleSlayer.createTree(" of the Wolf", battleSlayer.createSubTree(Stat.Agility, 4, 5), battleSlayer.createSubTree(Stat.Spirit, 4, 5), 12.0));
		list.add(battleSlayer);
	}
	
	private static void fillBarbaricBattleAxe() {
		int id = 3195;
		MultiBonus barbaricBattleAxe = new MultiBonus("Barbaric Battle Axe", id);
		barbaricBattleAxe.addToList(barbaricBattleAxe.createTree(" of Agility", barbaricBattleAxe.createSubTree(Stat.Agility, 4, 5), null, 6.1));
		barbaricBattleAxe.addToList(barbaricBattleAxe.createTree(" of Power", barbaricBattleAxe.createSubTree(Stat.AttackPower, 8, 10), null, 2.6));
		barbaricBattleAxe.addToList(barbaricBattleAxe.createTree(" of Stamina", barbaricBattleAxe.createSubTree(Stat.Stamina, 4, 5), null, 6.3));
		barbaricBattleAxe.addToList(barbaricBattleAxe.createTree(" of Strength", barbaricBattleAxe.createSubTree(Stat.Strength, 4, 5), null, 5.9));
		
		barbaricBattleAxe.addToList(barbaricBattleAxe.createTree(" of the Bear", barbaricBattleAxe.createSubTree(Stat.Stamina, 2, 3), barbaricBattleAxe.createSubTree(Stat.Strength, 2, 3), 9.7));
		barbaricBattleAxe.addToList(barbaricBattleAxe.createTree(" of the Boar", barbaricBattleAxe.createSubTree(Stat.Spirit, 2, 3), barbaricBattleAxe.createSubTree(Stat.Strength, 2, 3), 12.3));
		barbaricBattleAxe.addToList(barbaricBattleAxe.createTree(" of the Eagle", barbaricBattleAxe.createSubTree(Stat.Intellect, 2, 3), barbaricBattleAxe.createSubTree(Stat.Stamina, 2, 3), 11.9));
		barbaricBattleAxe.addToList(barbaricBattleAxe.createTree(" of the Monkey", barbaricBattleAxe.createSubTree(Stat.Agility, 2, 3), barbaricBattleAxe.createSubTree(Stat.Stamina, 2, 3), 10.2));
		barbaricBattleAxe.addToList(barbaricBattleAxe.createTree(" of the Tiger", barbaricBattleAxe.createSubTree(Stat.Agility, 2, 3), barbaricBattleAxe.createSubTree(Stat.Strength, 2, 3), 10.2));
		barbaricBattleAxe.addToList(barbaricBattleAxe.createTree(" of the Whale", barbaricBattleAxe.createSubTree(Stat.Spirit, 2, 3), barbaricBattleAxe.createSubTree(Stat.Stamina, 2, 3), 12.5));
		barbaricBattleAxe.addToList(barbaricBattleAxe.createTree(" of the Wolf", barbaricBattleAxe.createSubTree(Stat.Agility, 2, 3), barbaricBattleAxe.createSubTree(Stat.Spirit, 2, 3), 12.3));
		list.add(barbaricBattleAxe);
	}
	
	private static void fillBarbarianWarAxe() {
		int id = 3201;
		MultiBonus barbarianWarAxe = new MultiBonus("Barbarian War Axe", id);
		barbarianWarAxe.addToList(barbarianWarAxe.createTree(" of Agility", barbarianWarAxe.createSubTree(Stat.Agility, 10, 11), null, 5.3));
		barbarianWarAxe.addToList(barbarianWarAxe.createTree(" of Power", barbarianWarAxe.createSubTree(Stat.AttackPower, 12, 22), null, 2.5));
		barbarianWarAxe.addToList(barbarianWarAxe.createTree(" of Stamina", barbarianWarAxe.createSubTree(Stat.Stamina, 10, 11), null, 6.4));
		barbarianWarAxe.addToList(barbarianWarAxe.createTree(" of Strength", barbarianWarAxe.createSubTree(Stat.Strength, 10, 11), null, 6.3));
		
		barbarianWarAxe.addToList(barbarianWarAxe.createTree(" of the Bear", barbarianWarAxe.createSubTree(Stat.Stamina, 6, 7), barbarianWarAxe.createSubTree(Stat.Strength, 6, 7), 10.2));
		barbarianWarAxe.addToList(barbarianWarAxe.createTree(" of the Boar", barbarianWarAxe.createSubTree(Stat.Spirit, 6, 7), barbarianWarAxe.createSubTree(Stat.Strength, 6, 7), 13.2));
		barbarianWarAxe.addToList(barbarianWarAxe.createTree(" of the Eagle", barbarianWarAxe.createSubTree(Stat.Intellect, 6, 7), barbarianWarAxe.createSubTree(Stat.Stamina, 6, 7), 11.3));
		barbarianWarAxe.addToList(barbarianWarAxe.createTree(" of the Monkey", barbarianWarAxe.createSubTree(Stat.Agility, 6, 7), barbarianWarAxe.createSubTree(Stat.Stamina, 6, 7), 9.2));
		barbarianWarAxe.addToList(barbarianWarAxe.createTree(" of the Tiger", barbarianWarAxe.createSubTree(Stat.Agility, 6, 7), barbarianWarAxe.createSubTree(Stat.Strength, 6, 7), 10.3));
		barbarianWarAxe.addToList(barbarianWarAxe.createTree(" of the Whale", barbarianWarAxe.createSubTree(Stat.Spirit, 6, 7), barbarianWarAxe.createSubTree(Stat.Stamina, 6, 7), 13.1));
		barbarianWarAxe.addToList(barbarianWarAxe.createTree(" of the Wolf", barbarianWarAxe.createSubTree(Stat.Agility, 6, 7), barbarianWarAxe.createSubTree(Stat.Spirit, 6, 7), 12.3));
		list.add(barbarianWarAxe);
	}
}
