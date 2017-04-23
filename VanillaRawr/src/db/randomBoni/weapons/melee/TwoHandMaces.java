package db.randomBoni.weapons.melee;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class TwoHandMaces {

	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		15264, 1990, 3198, 4570, 15267, 3208, 15266, 15262, 15259, 3193, 15265, 15263, 15261, 
		4564, 15260
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
		fillBackbreaker();
		fillBallastMaul();
		fillBatteringHammer();
		fillBirchwoodMaul();
		fillBrutehammer();
		fillConkHammer();
		fillFierceMauler();
		fillGreaterMaul();
		fillHeftyBattlehammer();
		fillOakMallet();
		fillPainbringer();
		fillRoyalMallet();
		fillSequoiaBranch();
		fillSpikedClub();
		fillStoneHammer();
	/*	System.out.println(list.get(0));
		System.out.println("---------------");
		System.out.println(list.get(1));
		System.out.println("---------------");
		System.out.println(list.get(2));
		System.out.println("---------------");
		System.out.println(list.get(3));
		System.out.println("---------------");
		System.out.println(list.get(4));
		System.out.println("---------------");
		System.out.println(list.get(5));
		System.out.println("---------------");
		System.out.println(list.get(6));
		System.out.println("---------------");
		System.out.println(list.get(7));
		System.out.println("---------------");
		System.out.println(list.get(8));
		System.out.println("---------------");
		System.out.println(list.get(9));
		System.out.println("---------------");
		System.out.println(list.get(10));
		System.out.println("---------------");
		System.out.println(list.get(11));
		System.out.println("---------------");
		System.out.println(list.get(12));
		System.out.println("---------------");
		System.out.println(list.get(13));
		System.out.println("---------------");
		System.out.println(list.get(14));
		System.out.println("---------------"); */
	}
	
	private static void fillStoneHammer() {
		int id = 15260;
		MultiBonus stoneHammer = new MultiBonus("Stone Hammer", id);
		stoneHammer.addToList(stoneHammer.createTree(" of Power", stoneHammer.createSubTree(Stat.AttackPower, 30, 32), null, 2.8));
		stoneHammer.addToList(stoneHammer.createTree(" of Spirit", stoneHammer.createSubTree(Stat.Spirit, 15, 16), null, 7.2));
		stoneHammer.addToList(stoneHammer.createTree(" of Stamina", stoneHammer.createSubTree(Stat.Stamina, 15, 16), null, 6.5));
		stoneHammer.addToList(stoneHammer.createTree(" of Strength", stoneHammer.createSubTree(Stat.Strength, 15, 16), null, 6.5));
		
		stoneHammer.addToList(stoneHammer.createTree(" of the Bear", stoneHammer.createSubTree(Stat.Stamina, 9, 10), stoneHammer.createSubTree(Stat.Strength, 9, 10), 9.5));
		stoneHammer.addToList(stoneHammer.createTree(" of the Boar", stoneHammer.createSubTree(Stat.Spirit, 9, 10), stoneHammer.createSubTree(Stat.Strength, 9, 10), 13.4));
		stoneHammer.addToList(stoneHammer.createTree(" of the Eagle", stoneHammer.createSubTree(Stat.Intellect, 9, 10), stoneHammer.createSubTree(Stat.Stamina, 9, 10), 10.6));
		stoneHammer.addToList(stoneHammer.createTree(" of the Gorilla", stoneHammer.createSubTree(Stat.Intellect, 9, 10), stoneHammer.createSubTree(Stat.Strength, 9, 10), 11.9));
		stoneHammer.addToList(stoneHammer.createTree(" of the Monkey", stoneHammer.createSubTree(Stat.Agility, 9, 10), stoneHammer.createSubTree(Stat.Stamina, 9, 10), 9.5));
		stoneHammer.addToList(stoneHammer.createTree(" of the Tiger", stoneHammer.createSubTree(Stat.Agility, 9, 10), stoneHammer.createSubTree(Stat.Strength, 9, 10), 8.8));
		stoneHammer.addToList(stoneHammer.createTree(" of the Whale", stoneHammer.createSubTree(Stat.Spirit, 9, 10), stoneHammer.createSubTree(Stat.Stamina, 9, 10), 13.1));
		list.add(stoneHammer);
	}
	
	private static void fillSpikedClub() {
		int id = 4564;
		MultiBonus spikedClub = new MultiBonus("Spiked Club", id);
		spikedClub.addToList(spikedClub.createTree(" of Power", spikedClub.createSubTree(Stat.AttackPower, 6, 8), null, 2.7));
		spikedClub.addToList(spikedClub.createTree(" of Spirit", spikedClub.createSubTree(Stat.Spirit, 3, 4), null, 6.7));
		spikedClub.addToList(spikedClub.createTree(" of Stamina", spikedClub.createSubTree(Stat.Stamina, 3, 4), null, 6.0));
		spikedClub.addToList(spikedClub.createTree(" of Strength", spikedClub.createSubTree(Stat.Strength, 3, 4), null, 5.7));
		
		spikedClub.addToList(spikedClub.createTree(" of the Bear", spikedClub.createSubTree(Stat.Stamina, 1, 2), spikedClub.createSubTree(Stat.Strength, 1, 2), 9.7));
		spikedClub.addToList(spikedClub.createTree(" of the Boar", spikedClub.createSubTree(Stat.Spirit, 1, 2), spikedClub.createSubTree(Stat.Strength, 1, 2), 12.1));
		spikedClub.addToList(spikedClub.createTree(" of the Eagle", spikedClub.createSubTree(Stat.Intellect, 1, 2), spikedClub.createSubTree(Stat.Stamina, 1, 2), 11.5));
		spikedClub.addToList(spikedClub.createTree(" of the Gorilla", spikedClub.createSubTree(Stat.Intellect, 1, 2), spikedClub.createSubTree(Stat.Strength, 1, 2), 11.4));
		spikedClub.addToList(spikedClub.createTree(" of the Monkey", spikedClub.createSubTree(Stat.Agility, 1, 2), spikedClub.createSubTree(Stat.Stamina, 1, 2), 11.4));
		spikedClub.addToList(spikedClub.createTree(" of the Tiger", spikedClub.createSubTree(Stat.Agility, 1, 2), spikedClub.createSubTree(Stat.Strength, 1, 2), 10.7));
		spikedClub.addToList(spikedClub.createTree(" of the Whale", spikedClub.createSubTree(Stat.Spirit, 1, 2), spikedClub.createSubTree(Stat.Stamina, 1, 2), 12.2));
		list.add(spikedClub);
	}
	
	private static void fillSequoiaBranch() {
		int id = 15261;
		MultiBonus sequoiaBranch = new MultiBonus("Sequoia Branch", id);
		sequoiaBranch.addToList(sequoiaBranch.createTree(" of Power", sequoiaBranch.createSubTree(Stat.AttackPower, 18, 34), null, 2.8));
		sequoiaBranch.addToList(sequoiaBranch.createTree(" of Spirit", sequoiaBranch.createSubTree(Stat.Spirit, 16, 17), null, 7.5));
		sequoiaBranch.addToList(sequoiaBranch.createTree(" of Stamina", sequoiaBranch.createSubTree(Stat.Stamina, 16, 17), null, 6.5));
		sequoiaBranch.addToList(sequoiaBranch.createTree(" of Strength", sequoiaBranch.createSubTree(Stat.Strength, 16, 17), null, 6.2));
		
		sequoiaBranch.addToList(sequoiaBranch.createTree(" of the Bear", sequoiaBranch.createSubTree(Stat.Stamina, 10, 11), sequoiaBranch.createSubTree(Stat.Strength, 10, 11), 9.3));
		sequoiaBranch.addToList(sequoiaBranch.createTree(" of the Boar", sequoiaBranch.createSubTree(Stat.Spirit, 10, 11), sequoiaBranch.createSubTree(Stat.Strength, 10, 11), 13.2));
		sequoiaBranch.addToList(sequoiaBranch.createTree(" of the Eagle", sequoiaBranch.createSubTree(Stat.Intellect, 10, 11), sequoiaBranch.createSubTree(Stat.Stamina, 10, 11), 11.0));
		sequoiaBranch.addToList(sequoiaBranch.createTree(" of the Gorilla", sequoiaBranch.createSubTree(Stat.Intellect, 10, 11), sequoiaBranch.createSubTree(Stat.Strength, 10, 11), 12.1));
		sequoiaBranch.addToList(sequoiaBranch.createTree(" of the Monkey", sequoiaBranch.createSubTree(Stat.Agility, 10, 11), sequoiaBranch.createSubTree(Stat.Stamina, 10, 11), 9.3));
		sequoiaBranch.addToList(sequoiaBranch.createTree(" of the Tiger", sequoiaBranch.createSubTree(Stat.Agility, 10, 11), sequoiaBranch.createSubTree(Stat.Strength, 10, 11), 8.7));
		sequoiaBranch.addToList(sequoiaBranch.createTree(" of the Whale", sequoiaBranch.createSubTree(Stat.Spirit, 10, 11), sequoiaBranch.createSubTree(Stat.Stamina, 10, 11), 13.4));
		list.add(sequoiaBranch);
	}
	
	private static void fillRoyalMallet() {
		int id = 15263;
		MultiBonus royalMallet = new MultiBonus("Royal Mallet", id);
		royalMallet.addToList(royalMallet.createTree(" of Power", royalMallet.createSubTree(Stat.AttackPower, 42, 44), null, 2.9));
		royalMallet.addToList(royalMallet.createTree(" of Spirit", royalMallet.createSubTree(Stat.Spirit, 21, 22), null, 6.2));
		royalMallet.addToList(royalMallet.createTree(" of Stamina", royalMallet.createSubTree(Stat.Stamina, 21, 22), null, 6.3));
		royalMallet.addToList(royalMallet.createTree(" of Strength", royalMallet.createSubTree(Stat.Strength, 21, 22), null, 6.4));
		
		royalMallet.addToList(royalMallet.createTree(" of the Bear", royalMallet.createSubTree(Stat.Stamina, 13, 14), royalMallet.createSubTree(Stat.Strength, 13, 14), 10.7));
		royalMallet.addToList(royalMallet.createTree(" of the Boar", royalMallet.createSubTree(Stat.Spirit, 13, 14), royalMallet.createSubTree(Stat.Strength, 13, 14), 12.2));
		royalMallet.addToList(royalMallet.createTree(" of the Eagle", royalMallet.createSubTree(Stat.Intellect, 13, 14), royalMallet.createSubTree(Stat.Stamina, 13, 14), 11.2));
		royalMallet.addToList(royalMallet.createTree(" of the Gorilla", royalMallet.createSubTree(Stat.Intellect, 13, 14), royalMallet.createSubTree(Stat.Strength, 13, 14), 12.2));
		royalMallet.addToList(royalMallet.createTree(" of the Monkey", royalMallet.createSubTree(Stat.Agility, 13, 14), royalMallet.createSubTree(Stat.Stamina, 13, 14), 10.3));
		royalMallet.addToList(royalMallet.createTree(" of the Tiger", royalMallet.createSubTree(Stat.Agility, 13, 14), royalMallet.createSubTree(Stat.Strength, 13, 14), 9.1));
		royalMallet.addToList(royalMallet.createTree(" of the Whale", royalMallet.createSubTree(Stat.Spirit, 13, 14), royalMallet.createSubTree(Stat.Stamina, 13, 14), 12.6));
		list.add(royalMallet);
	}
	
	private static void fillPainbringer() {
		int id = 15265;
		MultiBonus painbringer = new MultiBonus("Painbringer", id);
		painbringer.addToList(painbringer.createTree(" of Power", painbringer.createSubTree(Stat.AttackPower, 50, 52), null, 3.2));
		painbringer.addToList(painbringer.createTree(" of Spirit", painbringer.createSubTree(Stat.Spirit, 25, 26), null, 5.8));
		painbringer.addToList(painbringer.createTree(" of Stamina", painbringer.createSubTree(Stat.Stamina, 25, 26), null, 6.3));
		painbringer.addToList(painbringer.createTree(" of Strength", painbringer.createSubTree(Stat.Strength, 25, 26), null, 6.5));
		
		painbringer.addToList(painbringer.createTree(" of the Bear", painbringer.createSubTree(Stat.Stamina, 16, 17), painbringer.createSubTree(Stat.Strength, 16, 17), 11.2));
		painbringer.addToList(painbringer.createTree(" of the Boar", painbringer.createSubTree(Stat.Spirit, 16, 17), painbringer.createSubTree(Stat.Strength, 16, 17), 11.5));
		painbringer.addToList(painbringer.createTree(" of the Eagle", painbringer.createSubTree(Stat.Intellect, 16, 17), painbringer.createSubTree(Stat.Stamina, 16, 17), 11.5));
		painbringer.addToList(painbringer.createTree(" of the Gorilla", painbringer.createSubTree(Stat.Intellect, 16, 17), painbringer.createSubTree(Stat.Strength, 16, 17), 11.6));
		painbringer.addToList(painbringer.createTree(" of the Monkey", painbringer.createSubTree(Stat.Agility, 16, 17), painbringer.createSubTree(Stat.Stamina, 16, 17), 10.9));
		painbringer.addToList(painbringer.createTree(" of the Tiger", painbringer.createSubTree(Stat.Agility, 16, 17), painbringer.createSubTree(Stat.Strength, 16, 17), 10.3));
		painbringer.addToList(painbringer.createTree(" of the Whale", painbringer.createSubTree(Stat.Spirit, 16, 17), painbringer.createSubTree(Stat.Stamina, 16, 17), 11.1));
		list.add(painbringer);
	}
	
	private static void fillOakMallet() {
		int id = 3193;
		MultiBonus oakMallet = new MultiBonus("Oak Mallet", id);
		oakMallet.addToList(oakMallet.createTree(" of Power", oakMallet.createSubTree(Stat.AttackPower, 12, 14), null, 2.8));
		oakMallet.addToList(oakMallet.createTree(" of Spirit", oakMallet.createSubTree(Stat.Spirit, 6, 7), null, 6.8));
		oakMallet.addToList(oakMallet.createTree(" of Stamina", oakMallet.createSubTree(Stat.Stamina, 6, 7), null, 6.3));
		oakMallet.addToList(oakMallet.createTree(" of Strength", oakMallet.createSubTree(Stat.Strength, 6, 7), null, 5.8));
		
		oakMallet.addToList(oakMallet.createTree(" of the Bear", oakMallet.createSubTree(Stat.Stamina, 3, 4), oakMallet.createSubTree(Stat.Strength, 3, 4), 9.4));
		oakMallet.addToList(oakMallet.createTree(" of the Boar", oakMallet.createSubTree(Stat.Spirit, 3, 4), oakMallet.createSubTree(Stat.Strength, 3, 4), 12.2));
		oakMallet.addToList(oakMallet.createTree(" of the Eagle", oakMallet.createSubTree(Stat.Intellect, 3, 4), oakMallet.createSubTree(Stat.Stamina, 3, 4), 11.2));
		oakMallet.addToList(oakMallet.createTree(" of the Gorilla", oakMallet.createSubTree(Stat.Intellect, 3, 4), oakMallet.createSubTree(Stat.Strength, 3, 4), 11.1));
		oakMallet.addToList(oakMallet.createTree(" of the Monkey", oakMallet.createSubTree(Stat.Agility, 3, 4), oakMallet.createSubTree(Stat.Stamina, 3, 4), 11.4));
		oakMallet.addToList(oakMallet.createTree(" of the Tiger", oakMallet.createSubTree(Stat.Agility, 3, 4), oakMallet.createSubTree(Stat.Strength, 3, 4), 10.4));
		oakMallet.addToList(oakMallet.createTree(" of the Whale", oakMallet.createSubTree(Stat.Spirit, 3, 4), oakMallet.createSubTree(Stat.Stamina, 3, 4), 12.6));
		list.add(oakMallet);
	}
	
	private static void fillHeftyBattlehammer() {
		int id = 15259;
		MultiBonus heftyBattlehammer = new MultiBonus("Hefty Battlehammer", id);
		heftyBattlehammer.addToList(heftyBattlehammer.createTree(" of Power", heftyBattlehammer.createSubTree(Stat.AttackPower, 18, 20), null, 2.6));
		heftyBattlehammer.addToList(heftyBattlehammer.createTree(" of Spirit", heftyBattlehammer.createSubTree(Stat.Spirit, 9, 10), null, 7.7));
		heftyBattlehammer.addToList(heftyBattlehammer.createTree(" of Stamina", heftyBattlehammer.createSubTree(Stat.Stamina, 9, 10), null, 6.5));
		heftyBattlehammer.addToList(heftyBattlehammer.createTree(" of Strength", heftyBattlehammer.createSubTree(Stat.Strength, 9, 10), null, 6.0));
		
		heftyBattlehammer.addToList(heftyBattlehammer.createTree(" of the Bear", heftyBattlehammer.createSubTree(Stat.Stamina, 5, 6), heftyBattlehammer.createSubTree(Stat.Strength, 5, 6), 9.1));
		heftyBattlehammer.addToList(heftyBattlehammer.createTree(" of the Boar", heftyBattlehammer.createSubTree(Stat.Spirit, 5, 6), heftyBattlehammer.createSubTree(Stat.Strength, 5, 6), 13.5));
		heftyBattlehammer.addToList(heftyBattlehammer.createTree(" of the Eagle", heftyBattlehammer.createSubTree(Stat.Intellect, 5, 6), heftyBattlehammer.createSubTree(Stat.Stamina, 5, 6), 11.0));
		heftyBattlehammer.addToList(heftyBattlehammer.createTree(" of the Gorilla", heftyBattlehammer.createSubTree(Stat.Intellect, 5, 6), heftyBattlehammer.createSubTree(Stat.Strength, 5, 6), 11.3));
		heftyBattlehammer.addToList(heftyBattlehammer.createTree(" of the Monkey", heftyBattlehammer.createSubTree(Stat.Agility, 5, 6), heftyBattlehammer.createSubTree(Stat.Stamina, 5, 6), 9.8));
		heftyBattlehammer.addToList(heftyBattlehammer.createTree(" of the Tiger", heftyBattlehammer.createSubTree(Stat.Agility, 5, 6), heftyBattlehammer.createSubTree(Stat.Strength, 5, 6), 8.8));
		heftyBattlehammer.addToList(heftyBattlehammer.createTree(" of the Whale", heftyBattlehammer.createSubTree(Stat.Spirit, 5, 6), heftyBattlehammer.createSubTree(Stat.Stamina, 5, 6), 13.6));
		list.add(heftyBattlehammer);
	}
	
	private static void fillGreaterMaul() {
		int id = 15262;
		MultiBonus greaterMaul = new MultiBonus("Greater Maul", id);
		greaterMaul.addToList(greaterMaul.createTree(" of Power", greaterMaul.createSubTree(Stat.AttackPower, 32, 38), null, 2.9));
		greaterMaul.addToList(greaterMaul.createTree(" of Spirit", greaterMaul.createSubTree(Stat.Spirit, 19, 20), null, 6.2));
		greaterMaul.addToList(greaterMaul.createTree(" of Stamina", greaterMaul.createSubTree(Stat.Stamina, 19, 20), null, 6.6));
		greaterMaul.addToList(greaterMaul.createTree(" of Strength", greaterMaul.createSubTree(Stat.Strength, 19, 20), null, 6.5));
		
		greaterMaul.addToList(greaterMaul.createTree(" of the Bear", greaterMaul.createSubTree(Stat.Stamina, 12, 13), greaterMaul.createSubTree(Stat.Strength, 12, 13), 10.5));
		greaterMaul.addToList(greaterMaul.createTree(" of the Boar", greaterMaul.createSubTree(Stat.Spirit, 12, 13), greaterMaul.createSubTree(Stat.Strength, 12, 13), 12.2));
		greaterMaul.addToList(greaterMaul.createTree(" of the Eagle", greaterMaul.createSubTree(Stat.Intellect, 12, 13), greaterMaul.createSubTree(Stat.Stamina, 12, 13), 11.6));
		greaterMaul.addToList(greaterMaul.createTree(" of the Gorilla", greaterMaul.createSubTree(Stat.Intellect, 12, 13), greaterMaul.createSubTree(Stat.Strength, 12, 13), 11.9));
		greaterMaul.addToList(greaterMaul.createTree(" of the Monkey", greaterMaul.createSubTree(Stat.Agility, 12, 13), greaterMaul.createSubTree(Stat.Stamina, 12, 13), 10.4));
		greaterMaul.addToList(greaterMaul.createTree(" of the Tiger", greaterMaul.createSubTree(Stat.Agility, 12, 13), greaterMaul.createSubTree(Stat.Strength, 12, 13), 9.5));
		greaterMaul.addToList(greaterMaul.createTree(" of the Whale", greaterMaul.createSubTree(Stat.Spirit, 12, 13), greaterMaul.createSubTree(Stat.Stamina, 12, 13), 11.9));
		list.add(greaterMaul);
	}
	
	private static void fillFierceMauler() {
		int id = 15266;
		MultiBonus fierceMauler = new MultiBonus("Fierce Mauler", id);
		fierceMauler.addToList(fierceMauler.createTree(" of Power", fierceMauler.createSubTree(Stat.AttackPower, 54, 56), null, 3.2));
		fierceMauler.addToList(fierceMauler.createTree(" of Spirit", fierceMauler.createSubTree(Stat.Spirit, 27, 28), null, 5.6));
		fierceMauler.addToList(fierceMauler.createTree(" of Stamina", fierceMauler.createSubTree(Stat.Stamina, 27, 28), null, 6.0));
		fierceMauler.addToList(fierceMauler.createTree(" of Strength", fierceMauler.createSubTree(Stat.Strength, 27, 28), null, 6.4));
		
		fierceMauler.addToList(fierceMauler.createTree(" of the Bear", fierceMauler.createSubTree(Stat.Stamina, 17, 18), fierceMauler.createSubTree(Stat.Strength, 17, 18), 11.5));
		fierceMauler.addToList(fierceMauler.createTree(" of the Boar", fierceMauler.createSubTree(Stat.Spirit, 17, 18), fierceMauler.createSubTree(Stat.Strength, 17, 18), 10.9));
		fierceMauler.addToList(fierceMauler.createTree(" of the Eagle", fierceMauler.createSubTree(Stat.Intellect, 17, 18), fierceMauler.createSubTree(Stat.Stamina, 17, 18), 11.9));
		fierceMauler.addToList(fierceMauler.createTree(" of the Gorilla", fierceMauler.createSubTree(Stat.Intellect, 17, 18), fierceMauler.createSubTree(Stat.Strength, 17, 18), 11.2));
		fierceMauler.addToList(fierceMauler.createTree(" of the Monkey", fierceMauler.createSubTree(Stat.Agility, 17, 18), fierceMauler.createSubTree(Stat.Stamina, 17, 18), 11.7));
		fierceMauler.addToList(fierceMauler.createTree(" of the Tiger", fierceMauler.createSubTree(Stat.Agility, 17, 18), fierceMauler.createSubTree(Stat.Strength, 17, 18), 11.0));
		fierceMauler.addToList(fierceMauler.createTree(" of the Whale", fierceMauler.createSubTree(Stat.Spirit, 17, 18), fierceMauler.createSubTree(Stat.Stamina, 17, 18), 10.7));
		list.add(fierceMauler);
	}
	
	private static void fillConkHammer() {
		int id = 3208;
		MultiBonus conkHammer = new MultiBonus("Conk Hammer", id);
		conkHammer.addToList(conkHammer.createTree(" of Power", conkHammer.createSubTree(Stat.AttackPower, 32, 38), null, 3.0));
		conkHammer.addToList(conkHammer.createTree(" of Spirit", conkHammer.createSubTree(Stat.Spirit, 19, 20), null, 6.0));
		conkHammer.addToList(conkHammer.createTree(" of Stamina", conkHammer.createSubTree(Stat.Stamina, 19, 20), null, 6.6));
		conkHammer.addToList(conkHammer.createTree(" of Strength", conkHammer.createSubTree(Stat.Strength, 19, 20), null, 6.1));
		
		conkHammer.addToList(conkHammer.createTree(" of the Bear", conkHammer.createSubTree(Stat.Stamina, 12, 13), conkHammer.createSubTree(Stat.Strength, 12, 13), 10.7));
		conkHammer.addToList(conkHammer.createTree(" of the Boar", conkHammer.createSubTree(Stat.Spirit, 12, 13), conkHammer.createSubTree(Stat.Strength, 12, 13), 12.1));
		conkHammer.addToList(conkHammer.createTree(" of the Eagle", conkHammer.createSubTree(Stat.Intellect, 12, 13), conkHammer.createSubTree(Stat.Stamina, 12, 13), 11.2));
		conkHammer.addToList(conkHammer.createTree(" of the Gorilla", conkHammer.createSubTree(Stat.Intellect, 12, 13), conkHammer.createSubTree(Stat.Strength, 12, 13), 11.8));
		conkHammer.addToList(conkHammer.createTree(" of the Monkey", conkHammer.createSubTree(Stat.Agility, 12, 13), conkHammer.createSubTree(Stat.Stamina, 12, 13), 10.7));
		conkHammer.addToList(conkHammer.createTree(" of the Tiger", conkHammer.createSubTree(Stat.Agility, 12, 13), conkHammer.createSubTree(Stat.Strength, 12, 13), 9.7));
		conkHammer.addToList(conkHammer.createTree(" of the Whale", conkHammer.createSubTree(Stat.Spirit, 12, 13), conkHammer.createSubTree(Stat.Stamina, 12, 13), 12.0));
		list.add(conkHammer);
	}
	
	private static void fillBrutehammer() {
		int id = 15267;
		MultiBonus brutehammer = new MultiBonus("Brutehammer", id);
		brutehammer.addToList(brutehammer.createTree(" of Power", brutehammer.createSubTree(Stat.AttackPower, 54, 56), null, 3.2));
		brutehammer.addToList(brutehammer.createTree(" of Spirit", brutehammer.createSubTree(Stat.Spirit, 27, 28), null, 4.7));
		brutehammer.addToList(brutehammer.createTree(" of Stamina", brutehammer.createSubTree(Stat.Stamina, 27, 28), null, 6.2));
		brutehammer.addToList(brutehammer.createTree(" of Strength", brutehammer.createSubTree(Stat.Strength, 27, 28), null, 5.5));
		
		brutehammer.addToList(brutehammer.createTree(" of the Bear", brutehammer.createSubTree(Stat.Stamina, 17, 18), brutehammer.createSubTree(Stat.Strength, 17, 18), 12.6));
		brutehammer.addToList(brutehammer.createTree(" of the Boar", brutehammer.createSubTree(Stat.Spirit, 17, 18), brutehammer.createSubTree(Stat.Strength, 17, 18), 10.6));
		brutehammer.addToList(brutehammer.createTree(" of the Eagle", brutehammer.createSubTree(Stat.Intellect, 17, 18), brutehammer.createSubTree(Stat.Stamina, 17, 18), 11.5));
		brutehammer.addToList(brutehammer.createTree(" of the Gorilla", brutehammer.createSubTree(Stat.Intellect, 17, 18), brutehammer.createSubTree(Stat.Strength, 17, 18), 11.1));
		brutehammer.addToList(brutehammer.createTree(" of the Monkey", brutehammer.createSubTree(Stat.Agility, 17, 18), brutehammer.createSubTree(Stat.Stamina, 17, 18), 11.6));
		brutehammer.addToList(brutehammer.createTree(" of the Tiger", brutehammer.createSubTree(Stat.Agility, 17, 18), brutehammer.createSubTree(Stat.Strength, 17, 18), 12.9));
		brutehammer.addToList(brutehammer.createTree(" of the Whale", brutehammer.createSubTree(Stat.Spirit, 17, 18), brutehammer.createSubTree(Stat.Stamina, 17, 18), 10.1));
		list.add(brutehammer);
	}
	
	private static void fillBirchwoodMaul() {
		int id = 4570;
		MultiBonus birchwoodMaul = new MultiBonus("Birchwood Maul", id);
		birchwoodMaul.addToList(birchwoodMaul.createTree(" of Power", birchwoodMaul.createSubTree(Stat.AttackPower, 2, 8), null, 2.5));
		birchwoodMaul.addToList(birchwoodMaul.createTree(" of Spirit", birchwoodMaul.createSubTree(Stat.Spirit, 3, 4), null, 7.4));
		birchwoodMaul.addToList(birchwoodMaul.createTree(" of Stamina", birchwoodMaul.createSubTree(Stat.Stamina, 3, 4), null, 5.9));
		birchwoodMaul.addToList(birchwoodMaul.createTree(" of Strength", birchwoodMaul.createSubTree(Stat.Strength, 3, 4), null, 5.4));
		
		birchwoodMaul.addToList(birchwoodMaul.createTree(" of the Bear", birchwoodMaul.createSubTree(Stat.Stamina, 1, 2), birchwoodMaul.createSubTree(Stat.Strength, 1, 2), 9.1));
		birchwoodMaul.addToList(birchwoodMaul.createTree(" of the Boar", birchwoodMaul.createSubTree(Stat.Spirit, 1, 2), birchwoodMaul.createSubTree(Stat.Strength, 1, 2), 12.4));
		birchwoodMaul.addToList(birchwoodMaul.createTree(" of the Eagle", birchwoodMaul.createSubTree(Stat.Intellect, 1, 2), birchwoodMaul.createSubTree(Stat.Stamina, 1, 2), 11.6));
		birchwoodMaul.addToList(birchwoodMaul.createTree(" of the Gorilla", birchwoodMaul.createSubTree(Stat.Intellect, 1, 2), birchwoodMaul.createSubTree(Stat.Strength, 1, 2), 11.5));
		birchwoodMaul.addToList(birchwoodMaul.createTree(" of the Monkey", birchwoodMaul.createSubTree(Stat.Agility, 1, 2), birchwoodMaul.createSubTree(Stat.Stamina, 1, 2), 11.1));
		birchwoodMaul.addToList(birchwoodMaul.createTree(" of the Tiger", birchwoodMaul.createSubTree(Stat.Agility, 1, 2), birchwoodMaul.createSubTree(Stat.Strength, 1, 2), 10.3));
		birchwoodMaul.addToList(birchwoodMaul.createTree(" of the Whale", birchwoodMaul.createSubTree(Stat.Spirit, 1, 2), birchwoodMaul.createSubTree(Stat.Stamina, 1, 2), 12.8));
		list.add(birchwoodMaul);
	}
	
	private static void fillBatteringHammer() {
		int id = 3198;
		MultiBonus batteringHammer = new MultiBonus("Battering Hammer", id);
		batteringHammer.addToList(batteringHammer.createTree(" of Power", batteringHammer.createSubTree(Stat.AttackPower, 16, 16), null, 3.1));
		batteringHammer.addToList(batteringHammer.createTree(" of Spirit", batteringHammer.createSubTree(Stat.Spirit, 8, 8), null, 6.2));
		batteringHammer.addToList(batteringHammer.createTree(" of Stamina", batteringHammer.createSubTree(Stat.Stamina, 8, 8), null, 6.7));
		batteringHammer.addToList(batteringHammer.createTree(" of Strength", batteringHammer.createSubTree(Stat.Strength, 8, 8), null, 6.1));
		
		batteringHammer.addToList(batteringHammer.createTree(" of the Bear", batteringHammer.createSubTree(Stat.Stamina, 5, 5), batteringHammer.createSubTree(Stat.Strength, 5, 5), 10.6));
		batteringHammer.addToList(batteringHammer.createTree(" of the Boar", batteringHammer.createSubTree(Stat.Spirit, 5, 5), batteringHammer.createSubTree(Stat.Strength, 5, 5), 9.7));
		batteringHammer.addToList(batteringHammer.createTree(" of the Eagle", batteringHammer.createSubTree(Stat.Intellect, 5, 5), batteringHammer.createSubTree(Stat.Stamina, 5, 5), 11.9));
		batteringHammer.addToList(batteringHammer.createTree(" of the Gorilla", batteringHammer.createSubTree(Stat.Intellect, 5, 5), batteringHammer.createSubTree(Stat.Strength, 5, 5), 10.1));
		batteringHammer.addToList(batteringHammer.createTree(" of the Monkey", batteringHammer.createSubTree(Stat.Agility, 5, 5), batteringHammer.createSubTree(Stat.Stamina, 5, 5), 13.8));
		batteringHammer.addToList(batteringHammer.createTree(" of the Tiger", batteringHammer.createSubTree(Stat.Agility, 5, 5), batteringHammer.createSubTree(Stat.Strength, 5, 5), 11.1));
		batteringHammer.addToList(batteringHammer.createTree(" of the Whale", batteringHammer.createSubTree(Stat.Spirit, 5, 5), batteringHammer.createSubTree(Stat.Stamina, 5, 5), 10.6));
		list.add(batteringHammer);
	}
	
	private static void fillBallastMaul() {
		int id = 1990;
		MultiBonus ballastMaul = new MultiBonus("Ballast Maul", id);
		ballastMaul.addToList(ballastMaul.createTree(" of Power", ballastMaul.createSubTree(Stat.AttackPower, 26, 28), null, 2.9));
		ballastMaul.addToList(ballastMaul.createTree(" of Spirit", ballastMaul.createSubTree(Stat.Spirit, 13, 14), null, 6.8));
		ballastMaul.addToList(ballastMaul.createTree(" of Stamina", ballastMaul.createSubTree(Stat.Stamina, 13, 14), null, 6.5));
		ballastMaul.addToList(ballastMaul.createTree(" of Strength", ballastMaul.createSubTree(Stat.Strength, 13, 14), null, 6.3));
		
		ballastMaul.addToList(ballastMaul.createTree(" of the Bear", ballastMaul.createSubTree(Stat.Stamina, 8, 9), ballastMaul.createSubTree(Stat.Strength, 8, 9), 9.8));
		ballastMaul.addToList(ballastMaul.createTree(" of the Boar", ballastMaul.createSubTree(Stat.Spirit, 8, 9), ballastMaul.createSubTree(Stat.Strength, 8, 9), 12.7));
		ballastMaul.addToList(ballastMaul.createTree(" of the Eagle", ballastMaul.createSubTree(Stat.Intellect, 8, 9), ballastMaul.createSubTree(Stat.Stamina, 8, 9), 11.3));
		ballastMaul.addToList(ballastMaul.createTree(" of the Gorilla", ballastMaul.createSubTree(Stat.Intellect, 8, 9), ballastMaul.createSubTree(Stat.Strength, 8, 9), 11.9));
		ballastMaul.addToList(ballastMaul.createTree(" of the Monkey", ballastMaul.createSubTree(Stat.Agility, 8, 9), ballastMaul.createSubTree(Stat.Stamina, 8, 9), 10.0));
		ballastMaul.addToList(ballastMaul.createTree(" of the Tiger", ballastMaul.createSubTree(Stat.Agility, 8, 9), ballastMaul.createSubTree(Stat.Strength, 8, 9), 9.1));
		ballastMaul.addToList(ballastMaul.createTree(" of the Whale", ballastMaul.createSubTree(Stat.Spirit, 8, 9), ballastMaul.createSubTree(Stat.Stamina, 8, 9), 12.6));
		list.add(ballastMaul);
	}
	
	private static void fillBackbreaker() {
		int id = 15264;
		MultiBonus backbreaker = new MultiBonus("Backbreaker", id);
		backbreaker.addToList(backbreaker.createTree(" of Power", backbreaker.createSubTree(Stat.AttackPower, 48, 50), null, 2.9));
		backbreaker.addToList(backbreaker.createTree(" of Spirit", backbreaker.createSubTree(Stat.Spirit, 24, 25), null, 5.6));
		backbreaker.addToList(backbreaker.createTree(" of Stamina", backbreaker.createSubTree(Stat.Stamina, 24, 25), null, 6.3));
		backbreaker.addToList(backbreaker.createTree(" of Strength", backbreaker.createSubTree(Stat.Strength, 24, 25), null, 6.4));
		
		backbreaker.addToList(backbreaker.createTree(" of the Bear", backbreaker.createSubTree(Stat.Stamina, 15, 16), backbreaker.createSubTree(Stat.Strength, 15, 16), 11.4));
		backbreaker.addToList(backbreaker.createTree(" of the Boar", backbreaker.createSubTree(Stat.Spirit, 15, 16), backbreaker.createSubTree(Stat.Strength, 15, 16), 10.9));
		backbreaker.addToList(backbreaker.createTree(" of the Eagle", backbreaker.createSubTree(Stat.Intellect, 15, 16), backbreaker.createSubTree(Stat.Stamina, 15, 16), 11.7));
		backbreaker.addToList(backbreaker.createTree(" of the Gorilla", backbreaker.createSubTree(Stat.Intellect, 15, 16), backbreaker.createSubTree(Stat.Strength, 15, 16), 12.0));
		backbreaker.addToList(backbreaker.createTree(" of the Monkey", backbreaker.createSubTree(Stat.Agility, 15, 16), backbreaker.createSubTree(Stat.Stamina, 15, 16), 11.4));
		backbreaker.addToList(backbreaker.createTree(" of the Tiger", backbreaker.createSubTree(Stat.Agility, 15, 16), backbreaker.createSubTree(Stat.Strength, 15, 16), 10.0));
		backbreaker.addToList(backbreaker.createTree(" of the Whale", backbreaker.createSubTree(Stat.Spirit, 15, 16), backbreaker.createSubTree(Stat.Stamina, 15, 16), 11.3));
		list.add(backbreaker);
	}
}
