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
		stoutBattlehammer.createArcaneWrathTree(4, 6, 4.2);
		stoutBattlehammer.createHealingTree(4, 4, 1.8);
		stoutBattlehammer.createNaturesWrathTree(4, 4, 3.4);
		stoutBattlehammer.createPowerTree(6, 8, 13.7);
		stoutBattlehammer.createShadowWrathTree(4, 4, 3.3);
		stoutBattlehammer.createStaminaTree(3, 3, 4.3);
		stoutBattlehammer.createStrengthTree(3, 3, 5.1);
		
		stoutBattlehammer.createBearTree(1, 2, 20.2);
		stoutBattlehammer.createMonkeyTree(1, 2, 21.9);
		stoutBattlehammer.createTigerTree(1, 2, 22.0);
		list.add(stoutBattlehammer);
	}
	
	private static void fillStaunchHammer() {
		int id = 4569;
		MultiBonus staunchHammer = new MultiBonus("Staunch Hammer", id);
		staunchHammer.createArcaneWrathTree(1, 3, 10.0);
		staunchHammer.createHealingTree(1, 2, 5.5);
		staunchHammer.createNaturesWrathTree(1, 3, 8.2);
		staunchHammer.createPowerTree(2, 4, 29.5);
		staunchHammer.createShadowWrathTree(1, 1, 7.7);
		staunchHammer.createStaminaTree(1, 1, 18.0);
		staunchHammer.createStrengthTree(1, 1, 20.9);
		list.add(staunchHammer);
	}
	
	private static void fillSmashingStar() {
		int id = 15228;
		MultiBonus smashingStar = new MultiBonus("Smashing Star", id);
		smashingStar.createArcaneWrathTree(13, 14, 9.7);
		smashingStar.createHealingTree(11, 12, 6.3);
		smashingStar.createNaturesWrathTree(13, 14, 7.6);
		smashingStar.createShadowWrathTree(13, 14, 9.1);
		smashingStar.createStaminaTree(9, 10, 4.5);
		smashingStar.createStrengthTree(9, 10, 4.3);
		
		smashingStar.createBearTree(6, 6, 19.2);
		smashingStar.createMonkeyTree(6, 6, 20.2);
		smashingStar.createTigerTree(6, 6, 19.0);
		list.add(smashingStar);
	}
	
	private static void fillSkullcrusherMace() {
		int id = 1608;
		MultiBonus skullcrusherMace = new MultiBonus("Skullcrusher Mace", id);
		skullcrusherMace.createArcaneWrathTree(11, 16, 4.4);
		skullcrusherMace.createHealingTree(9, 9, 3.2);
		skullcrusherMace.createNaturesWrathTree(11, 11, 3.7);
		skullcrusherMace.createPowerTree(16, 22, 13.5);
		skullcrusherMace.createShadowWrathTree(11, 11, 3.9);
		skullcrusherMace.createStaminaTree(8, 8, 4.5);
		skullcrusherMace.createStrengthTree(8, 8, 4.5);
		
		skullcrusherMace.createBearTree(5, 6, 20.5);
		skullcrusherMace.createMonkeyTree(5, 6, 21.2);
		skullcrusherMace.createTigerTree(5, 6, 20.6);
		list.add(skullcrusherMace);
	}
	
	private static void fillSergeantsWarhammer() {
		int id = 2079;
		MultiBonus sergeantsWarhammer = new MultiBonus("Sergeant's Warhammer", id);
		sergeantsWarhammer.createArcaneWrathTree(3, 4, 10.1);
		sergeantsWarhammer.createHealingTree(2, 2, 5.2);
		sergeantsWarhammer.createNaturesWrathTree(3, 4, 8.3);
		sergeantsWarhammer.createPowerTree(4, 6, 29.8);
		sergeantsWarhammer.createShadowWrathTree(3, 4, 7.4);
		sergeantsWarhammer.createStaminaTree(2, 2, 18.1);
		sergeantsWarhammer.createStrengthTree(2, 2, 21.1);
		list.add(sergeantsWarhammer);
	}
	
	private static void fillSequoiaHammer() {
		int id = 15225;
		MultiBonus sequoiaHammer = new MultiBonus("Sequoia Hammer", id);
		sequoiaHammer.createArcaneWrathTree(7, 10, 4.3);
		sequoiaHammer.createHealingTree(6, 6, 1.9);
		sequoiaHammer.createNaturesWrathTree(7, 7, 3.8);
		sequoiaHammer.createPowerTree(10, 14, 13.7);
		sequoiaHammer.createShadowWrathTree(7, 7, 3.4);
		sequoiaHammer.createStaminaTree(5, 5, 4.3);
		sequoiaHammer.createStrengthTree(5, 5, 5.2);
		
		sequoiaHammer.createBearTree(3, 4, 20.2);
		sequoiaHammer.createMonkeyTree(3, 4, 21.4);
		sequoiaHammer.createTigerTree(3, 4, 21.6);
		list.add(sequoiaHammer);
	}
	
	private static void fillPriestsMace() {
		int id = 2075;
		MultiBonus priestsMace = new MultiBonus("Priest's Mace", id);
		priestsMace.createArcaneWrathTree(1, 1, 9.5);
		priestsMace.createHealingTree(1, 1, 6.2);
		priestsMace.createNaturesWrathTree(1, 1, 8.2);
		priestsMace.createPowerTree(2, 4, 29.5);
		priestsMace.createShadowWrathTree(1, 3, 8.0);
		priestsMace.createStaminaTree(1, 1, 18.0);
		priestsMace.createStrengthTree(1, 1, 20.6);
		list.add(priestsMace);
	}
	
	private static void fillMurphstar() {
		int id = 1207;
		MultiBonus murphstar = new MultiBonus("Murphstar", id);
		murphstar.createArcaneWrathTree(9, 10, 4.7);
		murphstar.createHealingTree(7, 8, 2.3);
		murphstar.createNaturesWrathTree(9, 10, 3.9);
		murphstar.createPowerTree(12, 14, 13.8);
		murphstar.createShadowWrathTree(9, 11, 3.5);
		murphstar.createStaminaTree(6, 7, 4.6);
		murphstar.createStrengthTree(6, 7, 5.2);
		
		murphstar.createBearTree(4, 4, 20.4);
		murphstar.createMonkeyTree(4, 4, 20.7);
		murphstar.createTigerTree(4, 4, 20.7);
		list.add(murphstar);
	}
	
	private static void fillLeadenMace() {
		int id = 865;
		MultiBonus leadenMace = new MultiBonus("Leaden Mace", id);
		leadenMace.createArcaneWrathTree(7, 7, 4.9);
		leadenMace.createHealingTree(6, 6, 2.4);
		leadenMace.createNaturesWrathTree(7, 7, 4.1);
		leadenMace.createPowerTree(10, 14, 13.7);
		leadenMace.createShadowWrathTree(7, 7, 3.9);
		leadenMace.createStaminaTree(5, 5, 4.4);
		leadenMace.createStrengthTree(5, 5, 5.0);
		
		leadenMace.createBearTree(3, 4, 20.6);
		leadenMace.createMonkeyTree(3, 4, 20.3);
		leadenMace.createTigerTree(3, 4, 20.8);
		list.add(leadenMace);
	}
	
	private static void fillJaggedStar() {
		int id = 15223;
		MultiBonus jaggedStar = new MultiBonus("Jagged Star", id);
		jaggedStar.createArcaneWrathTree(4, 6, 4.2);
		jaggedStar.createHealingTree(4, 4, 1.9);
		jaggedStar.createNaturesWrathTree(4, 4, 3.5);
		jaggedStar.createPowerTree(6, 10, 13.5);
		jaggedStar.createShadowWrathTree(4, 4, 3.3);
		jaggedStar.createStaminaTree(3, 3, 4.4);
		jaggedStar.createStrengthTree(3, 3, 5.0);
		
		jaggedStar.createBearTree(1, 2, 20.0);
		jaggedStar.createMonkeyTree(1, 2, 22.1);
		jaggedStar.createTigerTree(1, 2, 22.1);
		list.add(jaggedStar);
	}
	
	private static void fillGoblinNutcracker() {
		int id = 8194;
		MultiBonus goblinNutcracker = new MultiBonus("Goblin Nutcracker", id);
		goblinNutcracker.createArcaneWrathTree(10, 10, 5.1);
		goblinNutcracker.createHealingTree(8, 11, 3.0);
		goblinNutcracker.createNaturesWrathTree(10, 10, 4.2);
		goblinNutcracker.createPowerTree(14, 20, 13.5);
		goblinNutcracker.createShadowWrathTree(10, 13, 4.2);
		goblinNutcracker.createStaminaTree(7, 7, 4.6);
		goblinNutcracker.createStrengthTree(7, 7, 4.9);
		
		goblinNutcracker.createBearTree(4, 5, 20.0);
		goblinNutcracker.createMonkeyTree(4, 5, 20.6);
		goblinNutcracker.createTigerTree(4, 5, 20.0);
		list.add(goblinNutcracker);
	}
	
	private static void fillGiantClub() {
		int id = 15226;
		MultiBonus giantClub = new MultiBonus("Giant Club", id);
		giantClub.createTree(" of Arcane Wrath", giantClub.createSubTree(Stat.ArcaneSpellDamage, 9, 13), null, 4.0));
		giantClub.createTree(" of Healing", giantClub.createSubTree(Stat.SpellPower, 7, 8), null, 1.9));
		giantClub.createTree(" of Nature's Wrath", giantClub.createSubTree(Stat.NatureSpellDamage, 9, 11), null, 3.3));
		giantClub.createTree(" of Power", giantClub.createSubTree(Stat.AttackPower, 12, 18), null, 14.7));
		giantClub.createTree(" of Shadow Wrath", giantClub.createSubTree(Stat.ShadowSpellDamage, 9, 11), null, 2.8));
		giantClub.createTree(" of Stamina", giantClub.createSubTree(Stat.Stamina, 6, 7), null, 4.5));
		giantClub.createTree(" of Strength", giantClub.createSubTree(Stat.Strength, 6, 7), null, 5.3));
		
		giantClub.createTree(" of the Bear", giantClub.createSubTree(Stat.Stamina, 4, 4), giantClub.createSubTree(Stat.Strength, 4, 4), 20.6));
		giantClub.createTree(" of the Monkey", giantClub.createSubTree(Stat.Agility, 4, 4), giantClub.createSubTree(Stat.Stamina, 4, 4), 21.4));
		giantClub.createTree(" of the Tiger", giantClub.createSubTree(Stat.Agility, 4, 4), giantClub.createSubTree(Stat.Strength, 4, 4), 21.5));
		list.add(giantClub);
	}
	
	private static void fillDiamondtipBludgeon() {
		int id = 15227;
		MultiBonus diamondtipBludgeon = new MultiBonus("Diamond-Tip Bludgeon", id);
		diamondtipBludgeon.createTree(" of Arcane Wrath", diamondtipBludgeon.createSubTree(Stat.ArcaneSpellDamage, 13, 13), null, 4.3));
		diamondtipBludgeon.createTree(" of Healing", diamondtipBludgeon.createSubTree(Stat.SpellPower, 11, 11), null, 2.9));
		diamondtipBludgeon.createTree(" of Nature's Wrath", diamondtipBludgeon.createSubTree(Stat.NatureSpellDamage, 13, 13), null, 3.8));
		diamondtipBludgeon.createTree(" of Power", diamondtipBludgeon.createSubTree(Stat.AttackPower, 18, 24), null, 13.4));
		diamondtipBludgeon.createTree(" of Shadow Wrath", diamondtipBludgeon.createSubTree(Stat.ShadowSpellDamage, 13, 13), null, 3.7));
		diamondtipBludgeon.createTree(" of Stamina", diamondtipBludgeon.createSubTree(Stat.Stamina, 9, 9), null, 4.6));
		diamondtipBludgeon.createTree(" of Strength", diamondtipBludgeon.createSubTree(Stat.Strength, 9, 9), null, 4.4));
		
		diamondtipBludgeon.createTree(" of the Bear", diamondtipBludgeon.createSubTree(Stat.Stamina, 5, 6), diamondtipBludgeon.createSubTree(Stat.Strength, 5, 6), 20.9));
		diamondtipBludgeon.createTree(" of the Monkey", diamondtipBludgeon.createSubTree(Stat.Agility, 5, 6), diamondtipBludgeon.createSubTree(Stat.Stamina, 5, 6), 21.4));
		diamondtipBludgeon.createTree(" of the Tiger", diamondtipBludgeon.createSubTree(Stat.Agility, 5, 6), diamondtipBludgeon.createSubTree(Stat.Strength, 5, 6), 20.5));
		list.add(diamondtipBludgeon);
	}
	
	private static void fillBlesswindHammer() {
		int id = 15229;
		MultiBonus blesswindHammer = new MultiBonus("Blesswind Hammer", id);
		blesswindHammer.createTree(" of Arcane Wrath", blesswindHammer.createSubTree(Stat.ArcaneSpellDamage, 14, 14), null, 4.9));
		blesswindHammer.createTree(" of Healing", blesswindHammer.createSubTree(Stat.SpellPower, 12, 12), null, 3.0));
		blesswindHammer.createTree(" of Nature's Wrath", blesswindHammer.createSubTree(Stat.NatureSpellDamage, 14, 14), null, 3.9));
		blesswindHammer.createTree(" of Power", blesswindHammer.createSubTree(Stat.AttackPower, 20, 28), null, 13.2));
		blesswindHammer.createTree(" of Shadow Wrath", blesswindHammer.createSubTree(Stat.ShadowSpellDamage, 14, 14), null, 4.5));
		blesswindHammer.createTree(" of Stamina", blesswindHammer.createSubTree(Stat.Stamina, 10, 10), null, 4.6));
		blesswindHammer.createTree(" of Strength", blesswindHammer.createSubTree(Stat.Strength, 10, 10), null, 4.6));
		
		blesswindHammer.createTree(" of the Bear", blesswindHammer.createSubTree(Stat.Stamina, 6, 7), blesswindHammer.createSubTree(Stat.Strength, 6, 7), 20.6));
		blesswindHammer.createTree(" of the Monkey", blesswindHammer.createSubTree(Stat.Agility, 6, 7), blesswindHammer.createSubTree(Stat.Stamina, 6, 7), 20.4));
		blesswindHammer.createTree(" of the Tiger", blesswindHammer.createSubTree(Stat.Agility, 6, 7), blesswindHammer.createSubTree(Stat.Strength, 6, 7), 20.1));
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
