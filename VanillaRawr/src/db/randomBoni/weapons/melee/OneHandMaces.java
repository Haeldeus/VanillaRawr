package db.randomBoni.weapons.melee;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class OneHandMaces {

	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		15222, 15224, 15229, 15227, 15226, 8194, 15223, 865, 1207, 2075, 15225, 2079, 1608, 
		15228, 4569, 789
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
		fillBarbedClub();
		fillBattlesmasher();
		fillBlesswindHammer();
		fillDiamondtipBludgeon();
		fillGiantClub();
		fillGoblinNutcracker();
		fillJaggedStar();
		fillLeadenMace();
		fillMurphstar();
		fillPriestsMace();
		fillSequoiaHammer();
		fillSergeantsWarhammer();
		fillSkullcrusherMace();
		fillSmashingStar();
		fillStaunchHammer();
		fillStoutBattleHammer();
/*		System.out.println(list.get(0));
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
		System.out.println(list.get(15)); */
	}
	
	private static void fillStoutBattleHammer() {
		int id = 789;
		MultiBonus stoutBattlehammer = new MultiBonus("Stout Battlehammer", id);
		stoutBattlehammer.addToList(stoutBattlehammer.createTree(" of Arcane Wrath", stoutBattlehammer.createSubTree(Stat.ArcaneSpellDamage, 4, 6), null, 4.2));
		stoutBattlehammer.addToList(stoutBattlehammer.createTree(" of Healing", stoutBattlehammer.createSubTree(Stat.SpellPower, 4, 4), null, 1.8));
		stoutBattlehammer.addToList(stoutBattlehammer.createTree(" of Nature's Wrath", stoutBattlehammer.createSubTree(Stat.NatureSpellDamage, 4, 4), null, 3.4));
		stoutBattlehammer.addToList(stoutBattlehammer.createTree(" of Power", stoutBattlehammer.createSubTree(Stat.AttackPower, 6, 8), null, 13.7));
		stoutBattlehammer.addToList(stoutBattlehammer.createTree(" of Shadow Wrath", stoutBattlehammer.createSubTree(Stat.ShadowSpellDamage, 4, 4), null, 3.3));
		stoutBattlehammer.addToList(stoutBattlehammer.createTree(" of Stamina", stoutBattlehammer.createSubTree(Stat.Stamina, 3, 3), null, 4.3));
		stoutBattlehammer.addToList(stoutBattlehammer.createTree(" of Strength", stoutBattlehammer.createSubTree(Stat.Strength, 3, 3), null, 5.1));
		
		stoutBattlehammer.addToList(stoutBattlehammer.createTree(" of the Bear", stoutBattlehammer.createSubTree(Stat.Stamina, 1, 2), stoutBattlehammer.createSubTree(Stat.Strength, 1, 2), 20.2));
		stoutBattlehammer.addToList(stoutBattlehammer.createTree(" of the Monkey", stoutBattlehammer.createSubTree(Stat.Agility, 1, 2), stoutBattlehammer.createSubTree(Stat.Stamina, 1, 2), 21.9));
		stoutBattlehammer.addToList(stoutBattlehammer.createTree(" of the Tiger", stoutBattlehammer.createSubTree(Stat.Agility, 1, 2), stoutBattlehammer.createSubTree(Stat.Strength, 1, 2), 22.0));
		list.add(stoutBattlehammer);
	}
	
	private static void fillStaunchHammer() {
		int id = 4569;
		MultiBonus staunchHammer = new MultiBonus("Staunch Hammer", id);
		staunchHammer.addToList(staunchHammer.createTree(" of Arcane Wrath", staunchHammer.createSubTree(Stat.ArcaneSpellDamage, 1, 3), null, 10.0));
		staunchHammer.addToList(staunchHammer.createTree(" of Healing", staunchHammer.createSubTree(Stat.SpellPower, 1, 2), null, 5.5));
		staunchHammer.addToList(staunchHammer.createTree(" of Nature's Wrath", staunchHammer.createSubTree(Stat.NatureSpellDamage, 1, 3), null, 8.2));
		staunchHammer.addToList(staunchHammer.createTree(" of Power", staunchHammer.createSubTree(Stat.AttackPower, 2, 4), null, 29.5));
		staunchHammer.addToList(staunchHammer.createTree(" of Shadow Wrath", staunchHammer.createSubTree(Stat.ShadowSpellDamage, 1, 1), null, 7.7));
		staunchHammer.addToList(staunchHammer.createTree(" of Stamina", staunchHammer.createSubTree(Stat.Stamina, 1, 1), null, 18.0));
		staunchHammer.addToList(staunchHammer.createTree(" of Strength", staunchHammer.createSubTree(Stat.Strength, 1, 1), null, 20.9));
		list.add(staunchHammer);
	}
	
	private static void fillSmashingStar() {
		int id = 15228;
		MultiBonus smashingStar = new MultiBonus("Smashing Star", id);
		smashingStar.addToList(smashingStar.createTree(" of Arcane Wrath", smashingStar.createSubTree(Stat.ArcaneSpellDamage, 13, 14), null, 9.7));
		smashingStar.addToList(smashingStar.createTree(" of Healing", smashingStar.createSubTree(Stat.SpellPower, 11, 12), null, 6.3));
		smashingStar.addToList(smashingStar.createTree(" of Nature's Wrath", smashingStar.createSubTree(Stat.NatureSpellDamage, 13, 14), null, 7.6));
		smashingStar.addToList(smashingStar.createTree(" of Shadow Wrath", smashingStar.createSubTree(Stat.ShadowSpellDamage, 13, 14), null, 9.1));
		smashingStar.addToList(smashingStar.createTree(" of Stamina", smashingStar.createSubTree(Stat.Stamina, 9, 10), null, 4.5));
		smashingStar.addToList(smashingStar.createTree(" of Strength", smashingStar.createSubTree(Stat.Strength, 9, 10), null, 4.3));
		
		smashingStar.addToList(smashingStar.createTree(" of the Bear", smashingStar.createSubTree(Stat.Stamina, 6, 6), smashingStar.createSubTree(Stat.Strength, 6, 6), 19.2));
		smashingStar.addToList(smashingStar.createTree(" of the Monkey", smashingStar.createSubTree(Stat.Agility, 6, 6), smashingStar.createSubTree(Stat.Stamina, 6, 6), 20.2));
		smashingStar.addToList(smashingStar.createTree(" of the Tiger", smashingStar.createSubTree(Stat.Agility, 6, 6), smashingStar.createSubTree(Stat.Strength, 6, 6), 19.0));
		list.add(smashingStar);
	}
	
	private static void fillSkullcrusherMace() {
		int id = 1608;
		MultiBonus skullcrusherMace = new MultiBonus("Skullcrusher Mace", id);
		skullcrusherMace.addToList(skullcrusherMace.createTree(" of Arcane Wrath", skullcrusherMace.createSubTree(Stat.ArcaneSpellDamage, 11, 16), null, 4.4));
		skullcrusherMace.addToList(skullcrusherMace.createTree(" of Healing", skullcrusherMace.createSubTree(Stat.SpellPower, 9, 9), null, 3.2));
		skullcrusherMace.addToList(skullcrusherMace.createTree(" of Nature's Wrath", skullcrusherMace.createSubTree(Stat.NatureSpellDamage, 11, 11), null, 3.7));
		skullcrusherMace.addToList(skullcrusherMace.createTree(" of Power", skullcrusherMace.createSubTree(Stat.AttackPower, 16, 22), null, 13.5));
		skullcrusherMace.addToList(skullcrusherMace.createTree(" of Shadow Wrath", skullcrusherMace.createSubTree(Stat.ShadowSpellDamage, 11, 11), null, 3.9));
		skullcrusherMace.addToList(skullcrusherMace.createTree(" of Stamina", skullcrusherMace.createSubTree(Stat.Stamina, 8, 8), null, 4.5));
		skullcrusherMace.addToList(skullcrusherMace.createTree(" of Strength", skullcrusherMace.createSubTree(Stat.Strength, 8, 8), null, 4.5));
		
		skullcrusherMace.addToList(skullcrusherMace.createTree(" of the Bear", skullcrusherMace.createSubTree(Stat.Stamina, 5, 6), skullcrusherMace.createSubTree(Stat.Strength, 5, 6), 20.5));
		skullcrusherMace.addToList(skullcrusherMace.createTree(" of the Monkey", skullcrusherMace.createSubTree(Stat.Agility, 5, 6), skullcrusherMace.createSubTree(Stat.Stamina, 5, 6), 21.2));
		skullcrusherMace.addToList(skullcrusherMace.createTree(" of the Tiger", skullcrusherMace.createSubTree(Stat.Agility, 5, 6), skullcrusherMace.createSubTree(Stat.Strength, 5, 6), 20.6));
		list.add(skullcrusherMace);
	}
	
	private static void fillSergeantsWarhammer() {
		int id = 2079;
		MultiBonus sergeantsWarhammer = new MultiBonus("Sergeant's Warhammer", id);
		sergeantsWarhammer.addToList(sergeantsWarhammer.createTree(" of Arcane Wrath", sergeantsWarhammer.createSubTree(Stat.ArcaneSpellDamage, 3, 4), null, 10.1));
		sergeantsWarhammer.addToList(sergeantsWarhammer.createTree(" of Healing", sergeantsWarhammer.createSubTree(Stat.SpellPower, 2, 2), null, 5.2));
		sergeantsWarhammer.addToList(sergeantsWarhammer.createTree(" of Nature's Wrath", sergeantsWarhammer.createSubTree(Stat.NatureSpellDamage, 3, 4), null, 8.3));
		sergeantsWarhammer.addToList(sergeantsWarhammer.createTree(" of Power", sergeantsWarhammer.createSubTree(Stat.AttackPower, 4, 6), null, 29.8));
		sergeantsWarhammer.addToList(sergeantsWarhammer.createTree(" of Shadow Wrath", sergeantsWarhammer.createSubTree(Stat.ShadowSpellDamage, 3, 4), null, 7.4));
		sergeantsWarhammer.addToList(sergeantsWarhammer.createTree(" of Stamina", sergeantsWarhammer.createSubTree(Stat.Stamina, 2, 2), null, 18.1));
		sergeantsWarhammer.addToList(sergeantsWarhammer.createTree(" of Strength", sergeantsWarhammer.createSubTree(Stat.Strength, 2, 2), null, 21.1));
		list.add(sergeantsWarhammer);
	}
	
	private static void fillSequoiaHammer() {
		int id = 15225;
		MultiBonus sequoiaHammer = new MultiBonus("Sequoia Hammer", id);
		sequoiaHammer.addToList(sequoiaHammer.createTree(" of Arcane Wrath", sequoiaHammer.createSubTree(Stat.ArcaneSpellDamage, 7, 10), null, 4.3));
		sequoiaHammer.addToList(sequoiaHammer.createTree(" of Healing", sequoiaHammer.createSubTree(Stat.SpellPower, 6, 6), null, 1.9));
		sequoiaHammer.addToList(sequoiaHammer.createTree(" of Nature's Wrath", sequoiaHammer.createSubTree(Stat.NatureSpellDamage, 7, 7), null, 3.8));
		sequoiaHammer.addToList(sequoiaHammer.createTree(" of Power", sequoiaHammer.createSubTree(Stat.AttackPower, 10, 14), null, 13.7));
		sequoiaHammer.addToList(sequoiaHammer.createTree(" of Shadow Wrath", sequoiaHammer.createSubTree(Stat.ShadowSpellDamage, 7, 7), null, 3.4));
		sequoiaHammer.addToList(sequoiaHammer.createTree(" of Stamina", sequoiaHammer.createSubTree(Stat.Stamina, 5, 5), null, 4.3));
		sequoiaHammer.addToList(sequoiaHammer.createTree(" of Strength", sequoiaHammer.createSubTree(Stat.Strength, 5, 5), null, 5.2));
		
		sequoiaHammer.addToList(sequoiaHammer.createTree(" of the Bear", sequoiaHammer.createSubTree(Stat.Stamina, 3, 4), sequoiaHammer.createSubTree(Stat.Strength, 3, 4), 20.2));
		sequoiaHammer.addToList(sequoiaHammer.createTree(" of the Monkey", sequoiaHammer.createSubTree(Stat.Agility, 3, 4), sequoiaHammer.createSubTree(Stat.Stamina, 3, 4), 21.4));
		sequoiaHammer.addToList(sequoiaHammer.createTree(" of the Tiger", sequoiaHammer.createSubTree(Stat.Agility, 3, 4), sequoiaHammer.createSubTree(Stat.Strength, 3, 4), 21.6));
		list.add(sequoiaHammer);
	}
	
	private static void fillPriestsMace() {
		int id = 2075;
		MultiBonus priestsMace = new MultiBonus("Priest's Mace", id);
		priestsMace.addToList(priestsMace.createTree(" of Arcane Wrath", priestsMace.createSubTree(Stat.ArcaneSpellDamage, 1, 1), null, 9.5));
		priestsMace.addToList(priestsMace.createTree(" of Healing", priestsMace.createSubTree(Stat.SpellPower, 1, 1), null, 6.2));
		priestsMace.addToList(priestsMace.createTree(" of Nature's Wrath", priestsMace.createSubTree(Stat.NatureSpellDamage, 1, 1), null, 8.2));
		priestsMace.addToList(priestsMace.createTree(" of Power", priestsMace.createSubTree(Stat.AttackPower, 2, 4), null, 29.5));
		priestsMace.addToList(priestsMace.createTree(" of Shadow Wrath", priestsMace.createSubTree(Stat.ShadowSpellDamage, 1, 3), null, 8.0));
		priestsMace.addToList(priestsMace.createTree(" of Stamina", priestsMace.createSubTree(Stat.Stamina, 1, 1), null, 18.0));
		priestsMace.addToList(priestsMace.createTree(" of Strength", priestsMace.createSubTree(Stat.Strength, 1, 1), null, 20.6));
		list.add(priestsMace);
	}
	
	private static void fillMurphstar() {
		int id = 1207;
		MultiBonus murphstar = new MultiBonus("Murphstar", id);
		murphstar.addToList(murphstar.createTree(" of Arcane Wrath", murphstar.createSubTree(Stat.ArcaneSpellDamage, 9, 10), null, 4.7));
		murphstar.addToList(murphstar.createTree(" of Healing", murphstar.createSubTree(Stat.SpellPower, 7, 8), null, 2.3));
		murphstar.addToList(murphstar.createTree(" of Nature's Wrath", murphstar.createSubTree(Stat.NatureSpellDamage, 9, 10), null, 3.9));
		murphstar.addToList(murphstar.createTree(" of Power", murphstar.createSubTree(Stat.AttackPower, 12, 14), null, 13.8));
		murphstar.addToList(murphstar.createTree(" of Shadow Wrath", murphstar.createSubTree(Stat.ShadowSpellDamage, 9, 11), null, 3.5));
		murphstar.addToList(murphstar.createTree(" of Stamina", murphstar.createSubTree(Stat.Stamina, 6, 7), null, 4.6));
		murphstar.addToList(murphstar.createTree(" of Strength", murphstar.createSubTree(Stat.Strength, 6, 7), null, 5.2));
		
		murphstar.addToList(murphstar.createTree(" of the Bear", murphstar.createSubTree(Stat.Stamina, 4, 4), murphstar.createSubTree(Stat.Strength, 4, 4), 20.4));
		murphstar.addToList(murphstar.createTree(" of the Monkey", murphstar.createSubTree(Stat.Agility, 4, 4), murphstar.createSubTree(Stat.Stamina, 4, 4), 20.7));
		murphstar.addToList(murphstar.createTree(" of the Tiger", murphstar.createSubTree(Stat.Agility, 4, 4), murphstar.createSubTree(Stat.Strength, 4, 4), 20.7));
		list.add(murphstar);
	}
	
	private static void fillLeadenMace() {
		int id = 865;
		MultiBonus leadenMace = new MultiBonus("Leaden Mace", id);
		leadenMace.addToList(leadenMace.createTree(" of Arcane Wrath", leadenMace.createSubTree(Stat.ArcaneSpellDamage, 7, 7), null, 4.9));
		leadenMace.addToList(leadenMace.createTree(" of Healing", leadenMace.createSubTree(Stat.SpellPower, 6, 6), null, 2.4));
		leadenMace.addToList(leadenMace.createTree(" of Nature's Wrath", leadenMace.createSubTree(Stat.NatureSpellDamage, 7, 7), null, 4.1));
		leadenMace.addToList(leadenMace.createTree(" of Power", leadenMace.createSubTree(Stat.AttackPower, 10, 14), null, 13.7));
		leadenMace.addToList(leadenMace.createTree(" of Shadow Wrath", leadenMace.createSubTree(Stat.ShadowSpellDamage, 7, 7), null, 3.9));
		leadenMace.addToList(leadenMace.createTree(" of Stamina", leadenMace.createSubTree(Stat.Stamina, 5, 5), null, 4.4));
		leadenMace.addToList(leadenMace.createTree(" of Strength", leadenMace.createSubTree(Stat.Strength, 5, 5), null, 5.0));
		
		leadenMace.addToList(leadenMace.createTree(" of the Bear", leadenMace.createSubTree(Stat.Stamina, 3, 4), leadenMace.createSubTree(Stat.Strength, 3, 4), 20.6));
		leadenMace.addToList(leadenMace.createTree(" of the Monkey", leadenMace.createSubTree(Stat.Agility, 3, 4), leadenMace.createSubTree(Stat.Stamina, 3, 4), 20.3));
		leadenMace.addToList(leadenMace.createTree(" of the Tiger", leadenMace.createSubTree(Stat.Agility, 3, 4), leadenMace.createSubTree(Stat.Strength, 3, 4), 20.8));
		list.add(leadenMace);
	}
	
	private static void fillJaggedStar() {
		int id = 15223;
		MultiBonus jaggedStar = new MultiBonus("Jagged Star", id);
		jaggedStar.addToList(jaggedStar.createTree(" of Arcane Wrath", jaggedStar.createSubTree(Stat.ArcaneSpellDamage, 4, 6), null, 4.2));
		jaggedStar.addToList(jaggedStar.createTree(" of Healing", jaggedStar.createSubTree(Stat.SpellPower, 4, 4), null, 1.9));
		jaggedStar.addToList(jaggedStar.createTree(" of Nature's Wrath", jaggedStar.createSubTree(Stat.NatureSpellDamage, 4, 4), null, 3.5));
		jaggedStar.addToList(jaggedStar.createTree(" of Power", jaggedStar.createSubTree(Stat.AttackPower, 6, 10), null, 13.5));
		jaggedStar.addToList(jaggedStar.createTree(" of Shadow Wrath", jaggedStar.createSubTree(Stat.ShadowSpellDamage, 4, 4), null, 3.3));
		jaggedStar.addToList(jaggedStar.createTree(" of Stamina", jaggedStar.createSubTree(Stat.Stamina, 3, 3), null, 4.4));
		jaggedStar.addToList(jaggedStar.createTree(" of Strength", jaggedStar.createSubTree(Stat.Strength, 3, 3), null, 5.0));
		
		jaggedStar.addToList(jaggedStar.createTree(" of the Bear", jaggedStar.createSubTree(Stat.Stamina, 1, 2), jaggedStar.createSubTree(Stat.Strength, 1, 2), 20.0));
		jaggedStar.addToList(jaggedStar.createTree(" of the Monkey", jaggedStar.createSubTree(Stat.Agility, 1, 2), jaggedStar.createSubTree(Stat.Stamina, 1, 2), 22.1));
		jaggedStar.addToList(jaggedStar.createTree(" of the Tiger", jaggedStar.createSubTree(Stat.Agility, 1, 2), jaggedStar.createSubTree(Stat.Strength, 1, 2), 22.1));
		list.add(jaggedStar);
	}
	
	private static void fillGoblinNutcracker() {
		int id = 8194;
		MultiBonus goblinNutcracker = new MultiBonus("Goblin Nutcracker", id);
		goblinNutcracker.addToList(goblinNutcracker.createTree(" of Arcane Wrath", goblinNutcracker.createSubTree(Stat.ArcaneSpellDamage, 10, 10), null, 5.1));
		goblinNutcracker.addToList(goblinNutcracker.createTree(" of Healing", goblinNutcracker.createSubTree(Stat.SpellPower, 8, 11), null, 3.0));
		goblinNutcracker.addToList(goblinNutcracker.createTree(" of Nature's Wrath", goblinNutcracker.createSubTree(Stat.NatureSpellDamage, 10, 10), null, 4.2));
		goblinNutcracker.addToList(goblinNutcracker.createTree(" of Power", goblinNutcracker.createSubTree(Stat.AttackPower, 14, 20), null, 13.5));
		goblinNutcracker.addToList(goblinNutcracker.createTree(" of Shadow Wrath", goblinNutcracker.createSubTree(Stat.ShadowSpellDamage, 10, 13), null, 4.2));
		goblinNutcracker.addToList(goblinNutcracker.createTree(" of Stamina", goblinNutcracker.createSubTree(Stat.Stamina, 7, 7), null, 4.6));
		goblinNutcracker.addToList(goblinNutcracker.createTree(" of Strength", goblinNutcracker.createSubTree(Stat.Strength, 7, 7), null, 4.9));
		
		goblinNutcracker.addToList(goblinNutcracker.createTree(" of the Bear", goblinNutcracker.createSubTree(Stat.Stamina, 4, 5), goblinNutcracker.createSubTree(Stat.Strength, 4, 5), 20.0));
		goblinNutcracker.addToList(goblinNutcracker.createTree(" of the Monkey", goblinNutcracker.createSubTree(Stat.Agility, 4, 5), goblinNutcracker.createSubTree(Stat.Stamina, 4, 5), 20.6));
		goblinNutcracker.addToList(goblinNutcracker.createTree(" of the Tiger", goblinNutcracker.createSubTree(Stat.Agility, 4, 5), goblinNutcracker.createSubTree(Stat.Strength, 4, 5), 20.0));
		list.add(goblinNutcracker);
	}
	
	private static void fillGiantClub() {
		int id = 15226;
		MultiBonus giantClub = new MultiBonus("Giant Club", id);
		giantClub.addToList(giantClub.createTree(" of Arcane Wrath", giantClub.createSubTree(Stat.ArcaneSpellDamage, 9, 13), null, 4.0));
		giantClub.addToList(giantClub.createTree(" of Healing", giantClub.createSubTree(Stat.SpellPower, 7, 8), null, 1.9));
		giantClub.addToList(giantClub.createTree(" of Nature's Wrath", giantClub.createSubTree(Stat.NatureSpellDamage, 9, 11), null, 3.3));
		giantClub.addToList(giantClub.createTree(" of Power", giantClub.createSubTree(Stat.AttackPower, 12, 18), null, 14.7));
		giantClub.addToList(giantClub.createTree(" of Shadow Wrath", giantClub.createSubTree(Stat.ShadowSpellDamage, 9, 11), null, 2.8));
		giantClub.addToList(giantClub.createTree(" of Stamina", giantClub.createSubTree(Stat.Stamina, 6, 7), null, 4.5));
		giantClub.addToList(giantClub.createTree(" of Strength", giantClub.createSubTree(Stat.Strength, 6, 7), null, 5.3));
		
		giantClub.addToList(giantClub.createTree(" of the Bear", giantClub.createSubTree(Stat.Stamina, 4, 4), giantClub.createSubTree(Stat.Strength, 4, 4), 20.6));
		giantClub.addToList(giantClub.createTree(" of the Monkey", giantClub.createSubTree(Stat.Agility, 4, 4), giantClub.createSubTree(Stat.Stamina, 4, 4), 21.4));
		giantClub.addToList(giantClub.createTree(" of the Tiger", giantClub.createSubTree(Stat.Agility, 4, 4), giantClub.createSubTree(Stat.Strength, 4, 4), 21.5));
		list.add(giantClub);
	}
	
	private static void fillDiamondtipBludgeon() {
		int id = 15227;
		MultiBonus diamondtipBludgeon = new MultiBonus("Diamond-Tip Bludgeon", id);
		diamondtipBludgeon.addToList(diamondtipBludgeon.createTree(" of Arcane Wrath", diamondtipBludgeon.createSubTree(Stat.ArcaneSpellDamage, 13, 13), null, 4.3));
		diamondtipBludgeon.addToList(diamondtipBludgeon.createTree(" of Healing", diamondtipBludgeon.createSubTree(Stat.SpellPower, 11, 11), null, 2.9));
		diamondtipBludgeon.addToList(diamondtipBludgeon.createTree(" of Nature's Wrath", diamondtipBludgeon.createSubTree(Stat.NatureSpellDamage, 13, 13), null, 3.8));
		diamondtipBludgeon.addToList(diamondtipBludgeon.createTree(" of Power", diamondtipBludgeon.createSubTree(Stat.AttackPower, 18, 24), null, 13.4));
		diamondtipBludgeon.addToList(diamondtipBludgeon.createTree(" of Shadow Wrath", diamondtipBludgeon.createSubTree(Stat.ShadowSpellDamage, 13, 13), null, 3.7));
		diamondtipBludgeon.addToList(diamondtipBludgeon.createTree(" of Stamina", diamondtipBludgeon.createSubTree(Stat.Stamina, 9, 9), null, 4.6));
		diamondtipBludgeon.addToList(diamondtipBludgeon.createTree(" of Strength", diamondtipBludgeon.createSubTree(Stat.Strength, 9, 9), null, 4.4));
		
		diamondtipBludgeon.addToList(diamondtipBludgeon.createTree(" of the Bear", diamondtipBludgeon.createSubTree(Stat.Stamina, 5, 6), diamondtipBludgeon.createSubTree(Stat.Strength, 5, 6), 20.9));
		diamondtipBludgeon.addToList(diamondtipBludgeon.createTree(" of the Monkey", diamondtipBludgeon.createSubTree(Stat.Agility, 5, 6), diamondtipBludgeon.createSubTree(Stat.Stamina, 5, 6), 21.4));
		diamondtipBludgeon.addToList(diamondtipBludgeon.createTree(" of the Tiger", diamondtipBludgeon.createSubTree(Stat.Agility, 5, 6), diamondtipBludgeon.createSubTree(Stat.Strength, 5, 6), 20.5));
		list.add(diamondtipBludgeon);
	}
	
	private static void fillBlesswindHammer() {
		int id = 15229;
		MultiBonus blesswindHammer = new MultiBonus("Blesswind Hammer", id);
		blesswindHammer.addToList(blesswindHammer.createTree(" of Arcane Wrath", blesswindHammer.createSubTree(Stat.ArcaneSpellDamage, 14, 14), null, 4.9));
		blesswindHammer.addToList(blesswindHammer.createTree(" of Healing", blesswindHammer.createSubTree(Stat.SpellPower, 12, 12), null, 3.0));
		blesswindHammer.addToList(blesswindHammer.createTree(" of Nature's Wrath", blesswindHammer.createSubTree(Stat.NatureSpellDamage, 14, 14), null, 3.9));
		blesswindHammer.addToList(blesswindHammer.createTree(" of Power", blesswindHammer.createSubTree(Stat.AttackPower, 20, 28), null, 13.2));
		blesswindHammer.addToList(blesswindHammer.createTree(" of Shadow Wrath", blesswindHammer.createSubTree(Stat.ShadowSpellDamage, 14, 14), null, 4.5));
		blesswindHammer.addToList(blesswindHammer.createTree(" of Stamina", blesswindHammer.createSubTree(Stat.Stamina, 10, 10), null, 4.6));
		blesswindHammer.addToList(blesswindHammer.createTree(" of Strength", blesswindHammer.createSubTree(Stat.Strength, 10, 10), null, 4.6));
		
		blesswindHammer.addToList(blesswindHammer.createTree(" of the Bear", blesswindHammer.createSubTree(Stat.Stamina, 6, 7), blesswindHammer.createSubTree(Stat.Strength, 6, 7), 20.6));
		blesswindHammer.addToList(blesswindHammer.createTree(" of the Monkey", blesswindHammer.createSubTree(Stat.Agility, 6, 7), blesswindHammer.createSubTree(Stat.Stamina, 6, 7), 20.4));
		blesswindHammer.addToList(blesswindHammer.createTree(" of the Tiger", blesswindHammer.createSubTree(Stat.Agility, 6, 7), blesswindHammer.createSubTree(Stat.Strength, 6, 7), 20.1));
		list.add(blesswindHammer);
	}
	
	private static void fillBattlesmasher() {
		int id = 15224;
		MultiBonus battlesmasher = new MultiBonus("Battlesmasher", id);
		battlesmasher.addToList(battlesmasher.createTree(" of Arcane Wrath", battlesmasher.createSubTree(Stat.ArcaneSpellDamage, 6, 7), null, 5.0));
		battlesmasher.addToList(battlesmasher.createTree(" of Healing", battlesmasher.createSubTree(Stat.SpellPower, 5, 6), null, 2.2));
		battlesmasher.addToList(battlesmasher.createTree(" of Nature's Wrath", battlesmasher.createSubTree(Stat.NatureSpellDamage, 6, 7), null, 4.1));
		battlesmasher.addToList(battlesmasher.createTree(" of Power", battlesmasher.createSubTree(Stat.AttackPower, 8, 10), null, 13.7));
		battlesmasher.addToList(battlesmasher.createTree(" of Shadow Wrath", battlesmasher.createSubTree(Stat.ShadowSpellDamage, 6, 6), null, 3.7));
		battlesmasher.addToList(battlesmasher.createTree(" of Stamina", battlesmasher.createSubTree(Stat.Stamina, 4, 4), null, 4.3));
		battlesmasher.addToList(battlesmasher.createTree(" of Strength", battlesmasher.createSubTree(Stat.Strength, 4, 4), null, 4.9));
		
		battlesmasher.addToList(battlesmasher.createTree(" of the Bear", battlesmasher.createSubTree(Stat.Stamina, 2, 3), battlesmasher.createSubTree(Stat.Strength, 2, 3), 19.5));
		battlesmasher.addToList(battlesmasher.createTree(" of the Monkey", battlesmasher.createSubTree(Stat.Agility, 2, 3), battlesmasher.createSubTree(Stat.Stamina, 2, 3), 21.4));
		battlesmasher.addToList(battlesmasher.createTree(" of the Tiger", battlesmasher.createSubTree(Stat.Agility, 2, 3), battlesmasher.createSubTree(Stat.Strength, 2, 3), 21.3));
		list.add(battlesmasher);
	}
	
	private static void fillBarbedClub() {
		int id = 15222;
		MultiBonus barbedClub = new MultiBonus("Barbed Club", id);
		barbedClub.addToList(barbedClub.createTree(" of Arcane Wrath", barbedClub.createSubTree(Stat.ArcaneSpellDamage, 3, 4), null, 10.2));
		barbedClub.addToList(barbedClub.createTree(" of Healing", barbedClub.createSubTree(Stat.SpellPower, 2, 4), null, 4.7));
		barbedClub.addToList(barbedClub.createTree(" of Nature's Wrath", barbedClub.createSubTree(Stat.NatureSpellDamage, 3, 4), null, 8.0));
		barbedClub.addToList(barbedClub.createTree(" of Power", barbedClub.createSubTree(Stat.AttackPower, 4, 8), null, 30.0));
		barbedClub.addToList(barbedClub.createTree(" of Shadow Wrath", barbedClub.createSubTree(Stat.ShadowSpellDamage, 3, 4), null, 7.4));
		barbedClub.addToList(barbedClub.createTree(" of Stamina", barbedClub.createSubTree(Stat.Stamina, 2, 3), null, 18.2));
		barbedClub.addToList(barbedClub.createTree(" of Strength", barbedClub.createSubTree(Stat.Strength, 2, 3), null, 21.4));
		list.add(barbedClub);
	}
}
