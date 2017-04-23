package db.randomBoni.weapons.ranged;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class Bows {
	
	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		15289, 15288, 15287, 15291, 15296, 15295, 15294, 4087
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
		fillArchstrikeBow();
		fillBlasthornBow();
		fillCrusaderBow();
		fillHarpyNeedler();
		fillHawkeyeBow();
		fillQuillfireBow();
		fillSiegeBow();
		fillTrueshotBow();
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
		System.out.println("-------------");
		System.out.println(list.get(7));
		System.out.println("-------------"); */
	}
	
	private static void fillTrueshotBow() {
		int id = 4087;
		MultiBonus trueshotBow = new MultiBonus("Trueshot Bow", id);
		trueshotBow.addToList(trueshotBow.createTree(" of Agility", trueshotBow.createSubTree(Stat.Agility, 5, 5), null, 4.9));
		trueshotBow.addToList(trueshotBow.createTree(" of Marksmanship", trueshotBow.createSubTree(Stat.RangedAttackPower, 12, 12), null, 2.8));
		trueshotBow.addToList(trueshotBow.createTree(" of Spirit", trueshotBow.createSubTree(Stat.Spirit, 5, 5), null, 7.3));
		trueshotBow.addToList(trueshotBow.createTree(" of Stamina", trueshotBow.createSubTree(Stat.Stamina, 5, 5), null, 6.0));
		
		trueshotBow.addToList(trueshotBow.createTree(" of the Eagle", trueshotBow.createSubTree(Stat.Intellect, 3, 4), trueshotBow.createSubTree(Stat.Stamina, 3, 4), 13.0));
		trueshotBow.addToList(trueshotBow.createTree(" of the Falcon", trueshotBow.createSubTree(Stat.Agility, 3, 4), trueshotBow.createSubTree(Stat.Intellect, 3, 4), 10.7));
		trueshotBow.addToList(trueshotBow.createTree(" of the Monkey", trueshotBow.createSubTree(Stat.Agility, 3, 4), trueshotBow.createSubTree(Stat.Stamina, 3, 4), 8.6));
		trueshotBow.addToList(trueshotBow.createTree(" of the Owl", trueshotBow.createSubTree(Stat.Intellect, 3, 4), trueshotBow.createSubTree(Stat.Spirit, 3, 4), 13.9));
		trueshotBow.addToList(trueshotBow.createTree(" of the Tiger", trueshotBow.createSubTree(Stat.Agility, 3, 4), trueshotBow.createSubTree(Stat.Strength, 3, 4), 9.3));
		trueshotBow.addToList(trueshotBow.createTree(" of the Whale", trueshotBow.createSubTree(Stat.Spirit, 3, 4), trueshotBow.createSubTree(Stat.Stamina, 3, 4), 12.8));
		trueshotBow.addToList(trueshotBow.createTree(" of the Wolf", trueshotBow.createSubTree(Stat.Agility, 3, 4), trueshotBow.createSubTree(Stat.Spirit, 3, 4), 10.7));
		list.add(trueshotBow);
	}

	private static void fillSiegeBow() {
		int id = 15294;
		MultiBonus siegeBow = new MultiBonus("Siege Bow", id);
		siegeBow.addToList(siegeBow.createTree(" of Agility", siegeBow.createSubTree(Stat.Agility, 7, 7), null, 5.4));
		siegeBow.addToList(siegeBow.createTree(" of Marksmanship", siegeBow.createSubTree(Stat.RangedAttackPower, 17, 17), null, 2.5));
		siegeBow.addToList(siegeBow.createTree(" of Spirit", siegeBow.createSubTree(Stat.Spirit, 7, 7), null, 6.6));
		siegeBow.addToList(siegeBow.createTree(" of Stamina", siegeBow.createSubTree(Stat.Stamina, 7, 7), null, 6.5));
		
		siegeBow.addToList(siegeBow.createTree(" of the Eagle", siegeBow.createSubTree(Stat.Intellect, 4, 5), siegeBow.createSubTree(Stat.Stamina, 4, 5), 12.7));
		siegeBow.addToList(siegeBow.createTree(" of the Falcon", siegeBow.createSubTree(Stat.Agility, 4, 5), siegeBow.createSubTree(Stat.Intellect, 4, 5), 11.1));
		siegeBow.addToList(siegeBow.createTree(" of the Monkey", siegeBow.createSubTree(Stat.Agility, 4, 5), siegeBow.createSubTree(Stat.Stamina, 4, 5), 9.3));
		siegeBow.addToList(siegeBow.createTree(" of the Owl", siegeBow.createSubTree(Stat.Intellect, 4, 5), siegeBow.createSubTree(Stat.Spirit, 4, 5), 12.8));
		siegeBow.addToList(siegeBow.createTree(" of the Tiger", siegeBow.createSubTree(Stat.Agility, 4, 5), siegeBow.createSubTree(Stat.Strength, 4, 5), 10.0));
		siegeBow.addToList(siegeBow.createTree(" of the Whale", siegeBow.createSubTree(Stat.Spirit, 4, 5), siegeBow.createSubTree(Stat.Stamina, 4, 5), 12.2));
		siegeBow.addToList(siegeBow.createTree(" of the Wolf", siegeBow.createSubTree(Stat.Agility, 4, 5), siegeBow.createSubTree(Stat.Spirit, 4, 5), 11.0));
		list.add(siegeBow);
	}

	private static void fillQuillfireBow() {
		int id = 15295;
		MultiBonus quillfireBow = new MultiBonus("Quillfire Bow", id);
		quillfireBow.addToList(quillfireBow.createTree(" of Agility", quillfireBow.createSubTree(Stat.Agility, 7, 8), null, 5.5));
		quillfireBow.addToList(quillfireBow.createTree(" of Marksmanship", quillfireBow.createSubTree(Stat.RangedAttackPower, 17, 31), null, 2.7));
		quillfireBow.addToList(quillfireBow.createTree(" of Spirit", quillfireBow.createSubTree(Stat.Spirit, 7, 8), null, 6.5));
		quillfireBow.addToList(quillfireBow.createTree(" of Stamina", quillfireBow.createSubTree(Stat.Stamina, 7, 8), null, 6.1));
		
		quillfireBow.addToList(quillfireBow.createTree(" of the Eagle", quillfireBow.createSubTree(Stat.Intellect, 4, 5), quillfireBow.createSubTree(Stat.Stamina, 4, 5), 12.7));
		quillfireBow.addToList(quillfireBow.createTree(" of the Falcon", quillfireBow.createSubTree(Stat.Agility, 4, 5), quillfireBow.createSubTree(Stat.Intellect, 4, 5), 11.0));
		quillfireBow.addToList(quillfireBow.createTree(" of the Monkey", quillfireBow.createSubTree(Stat.Agility, 4, 5), quillfireBow.createSubTree(Stat.Stamina, 4, 5), 9.5));
		quillfireBow.addToList(quillfireBow.createTree(" of the Owl", quillfireBow.createSubTree(Stat.Intellect, 4, 5), quillfireBow.createSubTree(Stat.Spirit, 4, 5), 12.9));
		quillfireBow.addToList(quillfireBow.createTree(" of the Tiger", quillfireBow.createSubTree(Stat.Agility, 4, 5), quillfireBow.createSubTree(Stat.Strength, 4, 5), 10.0));
		quillfireBow.addToList(quillfireBow.createTree(" of the Whale", quillfireBow.createSubTree(Stat.Spirit, 4, 5), quillfireBow.createSubTree(Stat.Stamina, 4, 5), 12.0));
		quillfireBow.addToList(quillfireBow.createTree(" of the Wolf", quillfireBow.createSubTree(Stat.Agility, 4, 5), quillfireBow.createSubTree(Stat.Spirit, 4, 5), 11.2));
		list.add(quillfireBow);
	}

	private static void fillHawkeyeBow() {
		int id = 15296;
		MultiBonus hawkeyeBow = new MultiBonus("Hawkeye Bow", id);
		hawkeyeBow.addToList(hawkeyeBow.createTree(" of Agility", hawkeyeBow.createSubTree(Stat.Agility, 8, 9), null, 6.7));
		hawkeyeBow.addToList(hawkeyeBow.createTree(" of Marksmanship", hawkeyeBow.createSubTree(Stat.RangedAttackPower, 19, 22), null, 3.3));
		hawkeyeBow.addToList(hawkeyeBow.createTree(" of Spirit", hawkeyeBow.createSubTree(Stat.Spirit, 8, 9), null, 5.5));
		hawkeyeBow.addToList(hawkeyeBow.createTree(" of Stamina", hawkeyeBow.createSubTree(Stat.Stamina, 8, 9), null, 6.0));
		
		hawkeyeBow.addToList(hawkeyeBow.createTree(" of the Eagle", hawkeyeBow.createSubTree(Stat.Intellect, 5, 6), hawkeyeBow.createSubTree(Stat.Stamina, 5, 6), 11.0));
		hawkeyeBow.addToList(hawkeyeBow.createTree(" of the Falcon", hawkeyeBow.createSubTree(Stat.Agility, 5, 6), hawkeyeBow.createSubTree(Stat.Intellect, 5, 6), 11.1));
		hawkeyeBow.addToList(hawkeyeBow.createTree(" of the Monkey", hawkeyeBow.createSubTree(Stat.Agility, 5, 6), hawkeyeBow.createSubTree(Stat.Stamina, 5, 6), 12.3));
		hawkeyeBow.addToList(hawkeyeBow.createTree(" of the Owl", hawkeyeBow.createSubTree(Stat.Intellect, 5, 6), hawkeyeBow.createSubTree(Stat.Spirit, 5, 6), 10.0));
		hawkeyeBow.addToList(hawkeyeBow.createTree(" of the Tiger", hawkeyeBow.createSubTree(Stat.Agility, 5, 6), hawkeyeBow.createSubTree(Stat.Strength, 5, 6), 12.5));
		hawkeyeBow.addToList(hawkeyeBow.createTree(" of the Whale", hawkeyeBow.createSubTree(Stat.Spirit, 5, 6), hawkeyeBow.createSubTree(Stat.Stamina, 5, 6), 10.9));
		hawkeyeBow.addToList(hawkeyeBow.createTree(" of the Wolf", hawkeyeBow.createSubTree(Stat.Agility, 5, 6), hawkeyeBow.createSubTree(Stat.Spirit, 5, 6), 10.7));
		list.add(hawkeyeBow);
	}

	private static void fillHarpyNeedler() {
		int id = 15291;
		MultiBonus harpyNeedler = new MultiBonus("Harpy Needler", id);
		harpyNeedler.addToList(harpyNeedler.createTree(" of Agility", harpyNeedler.createSubTree(Stat.Agility, 6, 7), null, 5.4));
		harpyNeedler.addToList(harpyNeedler.createTree(" of Marksmanship", harpyNeedler.createSubTree(Stat.RangedAttackPower, 14, 17), null, 2.8));
		harpyNeedler.addToList(harpyNeedler.createTree(" of Spirit", harpyNeedler.createSubTree(Stat.Spirit, 6, 7), null, 6.7));
		harpyNeedler.addToList(harpyNeedler.createTree(" of Stamina", harpyNeedler.createSubTree(Stat.Stamina, 6, 7), null, 6.2));
		
		harpyNeedler.addToList(harpyNeedler.createTree(" of the Eagle", harpyNeedler.createSubTree(Stat.Intellect, 4, 5), harpyNeedler.createSubTree(Stat.Stamina, 4, 5), 12.6));
		harpyNeedler.addToList(harpyNeedler.createTree(" of the Falcon", harpyNeedler.createSubTree(Stat.Agility, 4, 5), harpyNeedler.createSubTree(Stat.Intellect, 4, 5), 10.9));
		harpyNeedler.addToList(harpyNeedler.createTree(" of the Monkey", harpyNeedler.createSubTree(Stat.Agility, 4, 5), harpyNeedler.createSubTree(Stat.Stamina, 4, 5), 9.4));
		harpyNeedler.addToList(harpyNeedler.createTree(" of the Owl", harpyNeedler.createSubTree(Stat.Intellect, 4, 5), harpyNeedler.createSubTree(Stat.Spirit, 4, 5), 12.5));
		harpyNeedler.addToList(harpyNeedler.createTree(" of the Tiger", harpyNeedler.createSubTree(Stat.Agility, 4, 5), harpyNeedler.createSubTree(Stat.Strength, 4, 5), 10.5));
		harpyNeedler.addToList(harpyNeedler.createTree(" of the Whale", harpyNeedler.createSubTree(Stat.Spirit, 4, 5), harpyNeedler.createSubTree(Stat.Stamina, 4, 5), 12.1));
		harpyNeedler.addToList(harpyNeedler.createTree(" of the Wolf", harpyNeedler.createSubTree(Stat.Agility, 4, 5), harpyNeedler.createSubTree(Stat.Spirit, 4, 5), 10.9));
		list.add(harpyNeedler);
	}

	private static void fillCrusaderBow() {
		int id = 15287;
		MultiBonus crusaderBow = new MultiBonus("Crusader Bow", id);
		crusaderBow.addToList(crusaderBow.createTree(" of Agility", crusaderBow.createSubTree(Stat.Agility, 6, 6), null, 4.8));
		crusaderBow.addToList(crusaderBow.createTree(" of Marksmanship", crusaderBow.createSubTree(Stat.RangedAttackPower, 14, 14), null, 2.5));
		crusaderBow.addToList(crusaderBow.createTree(" of Spirit", crusaderBow.createSubTree(Stat.Spirit, 6, 6), null, 7.5));
		crusaderBow.addToList(crusaderBow.createTree(" of Stamina", crusaderBow.createSubTree(Stat.Stamina, 6, 6), null, 6.1));
		
		crusaderBow.addToList(crusaderBow.createTree(" of the Eagle", crusaderBow.createSubTree(Stat.Intellect, 3, 4), crusaderBow.createSubTree(Stat.Stamina, 3, 4), 12.8));
		crusaderBow.addToList(crusaderBow.createTree(" of the Falcon", crusaderBow.createSubTree(Stat.Agility, 3, 4), crusaderBow.createSubTree(Stat.Intellect, 3, 4), 10.7));
		crusaderBow.addToList(crusaderBow.createTree(" of the Monkey", crusaderBow.createSubTree(Stat.Agility, 3, 4), crusaderBow.createSubTree(Stat.Stamina, 3, 4), 8.8));
		crusaderBow.addToList(crusaderBow.createTree(" of the Owl", crusaderBow.createSubTree(Stat.Intellect, 3, 4), crusaderBow.createSubTree(Stat.Spirit, 3, 4), 13.8));
		crusaderBow.addToList(crusaderBow.createTree(" of the Tiger", crusaderBow.createSubTree(Stat.Agility, 3, 4), crusaderBow.createSubTree(Stat.Strength, 3, 4), 9.5));
		crusaderBow.addToList(crusaderBow.createTree(" of the Whale", crusaderBow.createSubTree(Stat.Spirit, 3, 4), crusaderBow.createSubTree(Stat.Stamina, 3, 4), 12.8));
		crusaderBow.addToList(crusaderBow.createTree(" of the Wolf", crusaderBow.createSubTree(Stat.Agility, 3, 4), crusaderBow.createSubTree(Stat.Spirit, 3, 4), 10.8));
		list.add(crusaderBow);
	}

	private static void fillBlasthornBow() {
		int id = 15288;
		MultiBonus blasthornBow = new MultiBonus("Blasthorn Bow", id);
		blasthornBow.addToList(blasthornBow.createTree(" of Marksmanship", blasthornBow.createSubTree(Stat.RangedAttackPower, 19, 36), null, 100.0));
		list.add(blasthornBow);
	}

	private static void fillArchstrikeBow() {
		int id = 15289;
		MultiBonus archstrikeBow = new MultiBonus("Archstrike Bow", id);
		archstrikeBow.addToList(archstrikeBow.createTree(" of Agility", archstrikeBow.createSubTree(Stat.Agility, 9, 9), null, 6.4));
		archstrikeBow.addToList(archstrikeBow.createTree(" of Marksmanship", archstrikeBow.createSubTree(Stat.RangedAttackPower, 22, 22), null, 3.1));
		archstrikeBow.addToList(archstrikeBow.createTree(" of Spirit", archstrikeBow.createSubTree(Stat.Spirit, 9, 9), null, 5.1));
		archstrikeBow.addToList(archstrikeBow.createTree(" of Stamina", archstrikeBow.createSubTree(Stat.Stamina, 9, 9), null, 5.6));
		
		archstrikeBow.addToList(archstrikeBow.createTree(" of the Eagle", archstrikeBow.createSubTree(Stat.Intellect, 5, 6), archstrikeBow.createSubTree(Stat.Stamina, 5, 6), 12.0));
		archstrikeBow.addToList(archstrikeBow.createTree(" of the Falcon", archstrikeBow.createSubTree(Stat.Agility, 5, 6), archstrikeBow.createSubTree(Stat.Intellect, 5, 6), 11.5));
		archstrikeBow.addToList(archstrikeBow.createTree(" of the Monkey", archstrikeBow.createSubTree(Stat.Agility, 5, 6), archstrikeBow.createSubTree(Stat.Stamina, 5, 6), 11.8));
		archstrikeBow.addToList(archstrikeBow.createTree(" of the Owl", archstrikeBow.createSubTree(Stat.Intellect, 5, 6), archstrikeBow.createSubTree(Stat.Spirit, 5, 6), 10.8));
		archstrikeBow.addToList(archstrikeBow.createTree(" of the Tiger", archstrikeBow.createSubTree(Stat.Agility, 5, 6), archstrikeBow.createSubTree(Stat.Strength, 5, 6), 12.4));
		archstrikeBow.addToList(archstrikeBow.createTree(" of the Whale", archstrikeBow.createSubTree(Stat.Spirit, 5, 6), archstrikeBow.createSubTree(Stat.Stamina, 5, 6), 10.5));
		archstrikeBow.addToList(archstrikeBow.createTree(" of the Wolf", archstrikeBow.createSubTree(Stat.Agility, 5, 6), archstrikeBow.createSubTree(Stat.Spirit, 5, 6), 10.8));
		list.add(archstrikeBow);
	}
}
