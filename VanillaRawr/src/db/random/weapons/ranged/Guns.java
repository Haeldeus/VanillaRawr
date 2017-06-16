package db.random.weapons.ranged;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class Guns {
	
	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		15324, 15323, 4089, 15325, 3430
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
		fillBurnsideRifle();
		fillPercussionShotgun();
		fillRicochetBlunderbuss();
		fillSharpshooterHarquebus();
		fillSniperRifle();
	/*	System.out.println(list.get(0));
		System.out.println("-------------");
		System.out.println(list.get(1));
		System.out.println("-------------");
		System.out.println(list.get(2));
		System.out.println("-------------");
		System.out.println(list.get(3));
		System.out.println("-------------");
		System.out.println(list.get(4));
		System.out.println("-------------"); */
	}

	private static void fillSniperRifle() {
		int id = 3430;
		MultiBonus sniperRifle = new MultiBonus("Sniper Rifle", id);
		sniperRifle.addToList(sniperRifle.createTree(" of Agility", sniperRifle.createSubTree(Stat.Agility, 6, 6), null, 5.1));
		sniperRifle.addToList(sniperRifle.createTree(" of Marksmanship", sniperRifle.createSubTree(Stat.RangedAttackPower, 14, 14), null, 2.8));
		sniperRifle.addToList(sniperRifle.createTree(" of Spirit", sniperRifle.createSubTree(Stat.Spirit, 6, 6), null, 6.8));
		sniperRifle.addToList(sniperRifle.createTree(" of Stamina", sniperRifle.createSubTree(Stat.Stamina, 6, 6), null, 5.3));
		
		sniperRifle.addToList(sniperRifle.createTree(" of the Eagle", sniperRifle.createSubTree(Stat.Intellect, 3, 4), sniperRifle.createSubTree(Stat.Stamina, 3, 4), 13.2));
		sniperRifle.addToList(sniperRifle.createTree(" of the Falcon", sniperRifle.createSubTree(Stat.Agility, 3, 4), sniperRifle.createSubTree(Stat.Intellect, 3, 4), 12.0));
		sniperRifle.addToList(sniperRifle.createTree(" of the Monkey", sniperRifle.createSubTree(Stat.Agility, 3, 4), sniperRifle.createSubTree(Stat.Stamina, 3, 4), 8.8));
		sniperRifle.addToList(sniperRifle.createTree(" of the Owl", sniperRifle.createSubTree(Stat.Intellect, 3, 4), sniperRifle.createSubTree(Stat.Spirit, 3, 4), 13.4));
		sniperRifle.addToList(sniperRifle.createTree(" of the Tiger", sniperRifle.createSubTree(Stat.Agility, 3, 4), sniperRifle.createSubTree(Stat.Strength, 3, 4), 9.1));
		sniperRifle.addToList(sniperRifle.createTree(" of the Whale", sniperRifle.createSubTree(Stat.Spirit, 3, 4), sniperRifle.createSubTree(Stat.Stamina, 3, 4), 12.0));
		sniperRifle.addToList(sniperRifle.createTree(" of the Wolf", sniperRifle.createSubTree(Stat.Agility, 3, 4), sniperRifle.createSubTree(Stat.Spirit, 3, 4), 11.6));
		list.add(sniperRifle);
	}

	private static void fillSharpshooterHarquebus() {
		int id = 15325;
		MultiBonus sharpshooterHarquebus = new MultiBonus("Sharpshooter Harquebus", id);
		sharpshooterHarquebus.addToList(sharpshooterHarquebus.createTree(" of Agility", sharpshooterHarquebus.createSubTree(Stat.Agility, 8, 8), null, 6.4));
		sharpshooterHarquebus.addToList(sharpshooterHarquebus.createTree(" of Marksmanship", sharpshooterHarquebus.createSubTree(Stat.RangedAttackPower, 19, 19), null, 3.1));
		sharpshooterHarquebus.addToList(sharpshooterHarquebus.createTree(" of Spirit", sharpshooterHarquebus.createSubTree(Stat.Spirit, 8, 8), null, 5.4));
		sharpshooterHarquebus.addToList(sharpshooterHarquebus.createTree(" of Stamina", sharpshooterHarquebus.createSubTree(Stat.Stamina, 8, 8), null, 6.1));
		
		sharpshooterHarquebus.addToList(sharpshooterHarquebus.createTree(" of the Eagle", sharpshooterHarquebus.createSubTree(Stat.Intellect, 5, 5), sharpshooterHarquebus.createSubTree(Stat.Stamina, 5, 5), 11.7));
		sharpshooterHarquebus.addToList(sharpshooterHarquebus.createTree(" of the Falcon", sharpshooterHarquebus.createSubTree(Stat.Agility, 5, 5), sharpshooterHarquebus.createSubTree(Stat.Intellect, 5, 5), 11.8));
		sharpshooterHarquebus.addToList(sharpshooterHarquebus.createTree(" of the Monkey", sharpshooterHarquebus.createSubTree(Stat.Agility, 5, 5), sharpshooterHarquebus.createSubTree(Stat.Stamina, 5, 5), 11.6));
		sharpshooterHarquebus.addToList(sharpshooterHarquebus.createTree(" of the Owl", sharpshooterHarquebus.createSubTree(Stat.Intellect, 5, 5), sharpshooterHarquebus.createSubTree(Stat.Spirit, 5, 5), 11.0));
		sharpshooterHarquebus.addToList(sharpshooterHarquebus.createTree(" of the Tiger", sharpshooterHarquebus.createSubTree(Stat.Agility, 5, 5), sharpshooterHarquebus.createSubTree(Stat.Strength, 5, 5), 11.6));
		sharpshooterHarquebus.addToList(sharpshooterHarquebus.createTree(" of the Whale", sharpshooterHarquebus.createSubTree(Stat.Spirit, 5, 5), sharpshooterHarquebus.createSubTree(Stat.Stamina, 5, 5), 10.4));
		sharpshooterHarquebus.addToList(sharpshooterHarquebus.createTree(" of the Wolf", sharpshooterHarquebus.createSubTree(Stat.Agility, 5, 5), sharpshooterHarquebus.createSubTree(Stat.Spirit, 5, 5), 10.8));
		list.add(sharpshooterHarquebus);
	}

	private static void fillRicochetBlunderbuss() {
		int id = 4089;
		MultiBonus ricochetBlunderbuss = new MultiBonus("Ricochet Blunderbuss", id);
		ricochetBlunderbuss.addToList(ricochetBlunderbuss.createTree(" of Agility", ricochetBlunderbuss.createSubTree(Stat.Agility, 6, 6), null, 6.0));
		ricochetBlunderbuss.addToList(ricochetBlunderbuss.createTree(" of Marksmanship", ricochetBlunderbuss.createSubTree(Stat.RangedAttackPower, 14, 14), null, 3.1));
		ricochetBlunderbuss.addToList(ricochetBlunderbuss.createTree(" of Spirit", ricochetBlunderbuss.createSubTree(Stat.Spirit, 6, 6), null, 5.8));
		ricochetBlunderbuss.addToList(ricochetBlunderbuss.createTree(" of Stamina", ricochetBlunderbuss.createSubTree(Stat.Stamina, 6, 6), null, 6.0));
		
		ricochetBlunderbuss.addToList(ricochetBlunderbuss.createTree(" of the Eagle", ricochetBlunderbuss.createSubTree(Stat.Intellect, 4, 4), ricochetBlunderbuss.createSubTree(Stat.Stamina, 4, 4), 12.1));
		ricochetBlunderbuss.addToList(ricochetBlunderbuss.createTree(" of the Falcon", ricochetBlunderbuss.createSubTree(Stat.Agility, 4, 4), ricochetBlunderbuss.createSubTree(Stat.Intellect, 4, 4), 11.7));
		ricochetBlunderbuss.addToList(ricochetBlunderbuss.createTree(" of the Monkey", ricochetBlunderbuss.createSubTree(Stat.Agility, 4, 4), ricochetBlunderbuss.createSubTree(Stat.Stamina, 4, 4), 10.2));
		ricochetBlunderbuss.addToList(ricochetBlunderbuss.createTree(" of the Owl", ricochetBlunderbuss.createSubTree(Stat.Intellect, 4, 4), ricochetBlunderbuss.createSubTree(Stat.Spirit, 4, 4), 11.9));
		ricochetBlunderbuss.addToList(ricochetBlunderbuss.createTree(" of the Tiger", ricochetBlunderbuss.createSubTree(Stat.Agility, 4, 4), ricochetBlunderbuss.createSubTree(Stat.Strength, 4, 4), 10.4));
		ricochetBlunderbuss.addToList(ricochetBlunderbuss.createTree(" of the Whale", ricochetBlunderbuss.createSubTree(Stat.Spirit, 4, 4), ricochetBlunderbuss.createSubTree(Stat.Stamina, 4, 4), 11.4));
		ricochetBlunderbuss.addToList(ricochetBlunderbuss.createTree(" of the Wolf", ricochetBlunderbuss.createSubTree(Stat.Agility, 4, 4), ricochetBlunderbuss.createSubTree(Stat.Spirit, 4, 4), 11.4));
		list.add(ricochetBlunderbuss);
	}

	private static void fillPercussionShotgun() {
		int id = 15323;
		MultiBonus percussionShotgun = new MultiBonus("Percussion Shotgun", id);
		percussionShotgun.addToList(percussionShotgun.createTree(" of Agility", percussionShotgun.createSubTree(Stat.Agility, 6, 7), null, 5.8));
		percussionShotgun.addToList(percussionShotgun.createTree(" of Marksmanship", percussionShotgun.createSubTree(Stat.RangedAttackPower, 14, 17), null, 2.9));
		percussionShotgun.addToList(percussionShotgun.createTree(" of Spirit", percussionShotgun.createSubTree(Stat.Spirit, 6, 7), null, 6.3));
		percussionShotgun.addToList(percussionShotgun.createTree(" of Stamina", percussionShotgun.createSubTree(Stat.Stamina, 6, 7), null, 5.7));
		
		percussionShotgun.addToList(percussionShotgun.createTree(" of the Eagle", percussionShotgun.createSubTree(Stat.Intellect, 4, 5), percussionShotgun.createSubTree(Stat.Stamina, 4, 5), 12.6));
		percussionShotgun.addToList(percussionShotgun.createTree(" of the Falcon", percussionShotgun.createSubTree(Stat.Agility, 4, 5), percussionShotgun.createSubTree(Stat.Intellect, 4, 5), 11.6));
		percussionShotgun.addToList(percussionShotgun.createTree(" of the Monkey", percussionShotgun.createSubTree(Stat.Agility, 4, 5), percussionShotgun.createSubTree(Stat.Stamina, 4, 5), 9.7));
		percussionShotgun.addToList(percussionShotgun.createTree(" of the Owl", percussionShotgun.createSubTree(Stat.Intellect, 4, 5), percussionShotgun.createSubTree(Stat.Spirit, 4, 5), 12.4));
		percussionShotgun.addToList(percussionShotgun.createTree(" of the Tiger", percussionShotgun.createSubTree(Stat.Agility, 4, 5), percussionShotgun.createSubTree(Stat.Strength, 4, 5), 10.0));
		percussionShotgun.addToList(percussionShotgun.createTree(" of the Whale", percussionShotgun.createSubTree(Stat.Spirit, 4, 5), percussionShotgun.createSubTree(Stat.Stamina, 4, 5), 11.7));
		percussionShotgun.addToList(percussionShotgun.createTree(" of the Wolf", percussionShotgun.createSubTree(Stat.Agility, 4, 5), percussionShotgun.createSubTree(Stat.Spirit, 4, 5), 11.5));
		list.add(percussionShotgun);
	}

	private static void fillBurnsideRifle() {
		int id = 15324;
		MultiBonus burnsideRifle = new MultiBonus("Burnside Rifle", id);
		burnsideRifle.addToList(burnsideRifle.createTree(" of Agility", burnsideRifle.createSubTree(Stat.Agility, 7, 8), null, 6.4));
		burnsideRifle.addToList(burnsideRifle.createTree(" of Marksmanship", burnsideRifle.createSubTree(Stat.RangedAttackPower, 17, 19), null, 3.1));
		burnsideRifle.addToList(burnsideRifle.createTree(" of Spirit", burnsideRifle.createSubTree(Stat.Spirit, 7, 8), null, 5.5));
		burnsideRifle.addToList(burnsideRifle.createTree(" of Stamina", burnsideRifle.createSubTree(Stat.Stamina, 7, 8), null, 6.0));
		
		burnsideRifle.addToList(burnsideRifle.createTree(" of the Eagle", burnsideRifle.createSubTree(Stat.Intellect, 4, 5), burnsideRifle.createSubTree(Stat.Stamina, 4, 5), 11.9));
		burnsideRifle.addToList(burnsideRifle.createTree(" of the Falcon", burnsideRifle.createSubTree(Stat.Agility, 4, 5), burnsideRifle.createSubTree(Stat.Intellect, 4, 5), 11.5));
		burnsideRifle.addToList(burnsideRifle.createTree(" of the Monkey", burnsideRifle.createSubTree(Stat.Agility, 4, 5), burnsideRifle.createSubTree(Stat.Stamina, 4, 5), 11.3));
		burnsideRifle.addToList(burnsideRifle.createTree(" of the Owl", burnsideRifle.createSubTree(Stat.Intellect, 4, 5), burnsideRifle.createSubTree(Stat.Spirit, 4, 5), 11.0));
		burnsideRifle.addToList(burnsideRifle.createTree(" of the Tiger", burnsideRifle.createSubTree(Stat.Agility, 4, 5), burnsideRifle.createSubTree(Stat.Strength, 4, 5), 11.2));
		burnsideRifle.addToList(burnsideRifle.createTree(" of the Whale", burnsideRifle.createSubTree(Stat.Spirit, 4, 5), burnsideRifle.createSubTree(Stat.Stamina, 4, 5), 10.8));
		burnsideRifle.addToList(burnsideRifle.createTree(" of the Wolf", burnsideRifle.createSubTree(Stat.Agility, 4, 5), burnsideRifle.createSubTree(Stat.Spirit, 4, 5), 11.2));
		list.add(burnsideRifle);
	}
}
