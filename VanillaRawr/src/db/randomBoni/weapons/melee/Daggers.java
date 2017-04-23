package db.randomBoni.weapons.melee;

import java.util.ArrayList;

import util.MultiBonus;
import db.stats.Stat;

public class Daggers {

	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		10828, 15241, 15247, 2140, 2819, 2632, 15243, 15246, 4088, 15242, 3184, 15244, 3187, 
		15245, 4571
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
		fillDireNail();
		fillBattleKnife();
		fillBloodstrikeDagger();
		fillCarvingKnife();
		fillCrossDagger();
		fillCurvedDagger();
		fillDeadlyKris();
		fillDemonBlade();
		fillDreadBlade();
		fillHonedStiletto();
		fillHookDagger();
		fillRazorBlade();
		fillSacrificialKris();
		fillVorpalDagger();
		fillWarKnife();
/*		System.out.println(list.get(0).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(1).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(2).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(3).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(4).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(5).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(6).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(7).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(8).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(9).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(10).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(11).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(12).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(13).toString());
		System.out.println("----------------------------------------");
		System.out.println(list.get(14).toString()); */
	}
	
	private static void fillWarKnife() {
		int id = 4571;
		MultiBonus warKnife = new MultiBonus("War Knife", id);
		warKnife.addToList(warKnife.createTree(" of Agility", warKnife.createSubTree(Stat.Agility, 2, 2), null, 10.2));
		warKnife.addToList(warKnife.createTree(" of Arcane Wrath", warKnife.createSubTree(Stat.ArcaneSpellDamage, 3, 3), null, 7.4));
		warKnife.addToList(warKnife.createTree(" of Fiery Wrath", warKnife.createSubTree(Stat.FireSpellDamage, 3, 3), null, 4.8));
		warKnife.addToList(warKnife.createTree(" of Frozen Wrath", warKnife.createSubTree(Stat.FrostSpellDamage, 3, 3), null, 3.8));
		warKnife.addToList(warKnife.createTree(" of Healing", warKnife.createSubTree(Stat.SpellPower, 2, 2), null, 9.2));
		warKnife.addToList(warKnife.createTree(" of Nature's Wrath", warKnife.createSubTree(Stat.NatureSpellDamage, 3, 3), null, 6.6));
		warKnife.addToList(warKnife.createTree(" of Power", warKnife.createSubTree(Stat.AttackPower, 4, 6), null, 31.5));
		warKnife.addToList(warKnife.createTree(" of Shadow Wrath", warKnife.createSubTree(Stat.ShadowSpellDamage, 3, 4), null, 2.5));
		warKnife.addToList(warKnife.createTree(" of Stamina", warKnife.createSubTree(Stat.Stamina, 2, 2), null, 10.6));
		warKnife.addToList(warKnife.createTree(" of Strength", warKnife.createSubTree(Stat.Strength, 2, 2), null, 13.5));
		list.add(warKnife);
	}
	
	private static void fillVorpalDagger() {
		int id = 15245;
		MultiBonus vorpalDagger = new MultiBonus("Vorpal Dagger", id);
		vorpalDagger.addToList(vorpalDagger.createTree(" of Agility", vorpalDagger.createSubTree(Stat.Agility, 9, 9), null, 3.5));
		vorpalDagger.addToList(vorpalDagger.createTree(" of Arcane Wrath", vorpalDagger.createSubTree(Stat.ArcaneSpellDamage, 13, 13), null, 4.0));
		vorpalDagger.addToList(vorpalDagger.createTree(" of Fiery Wrath", vorpalDagger.createSubTree(Stat.FireSpellDamage, 13, 17), null, 2.9));
		vorpalDagger.addToList(vorpalDagger.createTree(" of Frozen Wrath", vorpalDagger.createSubTree(Stat.FrostSpellDamage, 13, 13), null, 2.1));
		vorpalDagger.addToList(vorpalDagger.createTree(" of Healing", vorpalDagger.createSubTree(Stat.SpellPower, 11, 11), null, 4.4));
		vorpalDagger.addToList(vorpalDagger.createTree(" of Nature's Wrath", vorpalDagger.createSubTree(Stat.NatureSpellDamage, 13, 13), null, 3.1));
		vorpalDagger.addToList(vorpalDagger.createTree(" of Power", vorpalDagger.createSubTree(Stat.AttackPower, 18, 24), null, 19.6));
		vorpalDagger.addToList(vorpalDagger.createTree(" of Shadow Wrath", vorpalDagger.createSubTree(Stat.ShadowSpellDamage, 13, 13), null, 1.6));
		vorpalDagger.addToList(vorpalDagger.createTree(" of Stamina", vorpalDagger.createSubTree(Stat.Stamina, 9, 9), null, 3.9));
		vorpalDagger.addToList(vorpalDagger.createTree(" of Strength", vorpalDagger.createSubTree(Stat.Strength, 9, 9), null, 4.5));
		
		vorpalDagger.addToList(vorpalDagger.createTree(" of the Bear", vorpalDagger.createSubTree(Stat.Stamina, 5, 6), vorpalDagger.createSubTree(Stat.Strength, 5, 6), 18.6));
		vorpalDagger.addToList(vorpalDagger.createTree(" of the Monkey", vorpalDagger.createSubTree(Stat.Agility, 5, 6), vorpalDagger.createSubTree(Stat.Stamina, 5, 6), 15.5));
		vorpalDagger.addToList(vorpalDagger.createTree(" of the Tiger", vorpalDagger.createSubTree(Stat.Agility, 5, 6), vorpalDagger.createSubTree(Stat.Strength, 5, 6), 16.1));
		list.add(vorpalDagger);
	}

	private static void fillSacrificialKris() {
		int id = 3187;
		MultiBonus sacrificialKris = new MultiBonus("Sacrificial Kris", id);
		sacrificialKris.addToList(sacrificialKris.createTree(" of Agility", sacrificialKris.createSubTree(Stat.Agility, 7, 8), null, 3.5));
		sacrificialKris.addToList(sacrificialKris.createTree(" of Arcane Wrath", sacrificialKris.createSubTree(Stat.ArcaneSpellDamage, 10, 11), null, 4.2));
		sacrificialKris.addToList(sacrificialKris.createTree(" of Fiery Wrath", sacrificialKris.createSubTree(Stat.FireSpellDamage, 10, 11), null, 2.9));
		sacrificialKris.addToList(sacrificialKris.createTree(" of Frozen Wrath", sacrificialKris.createSubTree(Stat.FrostSpellDamage, 10, 11), null, 2.1));
		sacrificialKris.addToList(sacrificialKris.createTree(" of Healing", sacrificialKris.createSubTree(Stat.SpellPower, 8, 12), null, 4.5));
		sacrificialKris.addToList(sacrificialKris.createTree(" of Nature's Wrath", sacrificialKris.createSubTree(Stat.NatureSpellDamage, 10, 11), null, 3.2));
		sacrificialKris.addToList(sacrificialKris.createTree(" of Power", sacrificialKris.createSubTree(Stat.AttackPower, 14, 20), null, 19.7));
		sacrificialKris.addToList(sacrificialKris.createTree(" of Shadow Wrath", sacrificialKris.createSubTree(Stat.ShadowSpellDamage, 10, 11), null, 1.2));
		sacrificialKris.addToList(sacrificialKris.createTree(" of Stamina", sacrificialKris.createSubTree(Stat.Stamina, 7, 8), null, 3.8));
		sacrificialKris.addToList(sacrificialKris.createTree(" of Strength", sacrificialKris.createSubTree(Stat.Strength, 7, 8), null, 5.0));
		
		sacrificialKris.addToList(sacrificialKris.createTree(" of the Bear", sacrificialKris.createSubTree(Stat.Stamina, 4, 5), sacrificialKris.createSubTree(Stat.Strength, 4, 5), 18.8));
		sacrificialKris.addToList(sacrificialKris.createTree(" of the Monkey", sacrificialKris.createSubTree(Stat.Agility, 4, 5), sacrificialKris.createSubTree(Stat.Stamina, 4, 5), 15.0));
		sacrificialKris.addToList(sacrificialKris.createTree(" of the Tiger", sacrificialKris.createSubTree(Stat.Agility, 4, 5), sacrificialKris.createSubTree(Stat.Strength, 4, 5), 16.1));
		list.add(sacrificialKris);
		
	}
	
	private static void fillRazorBlade() {
		int id = 15244;
		MultiBonus razorBlade = new MultiBonus("Razor Blade", id);
		razorBlade.addToList(razorBlade.createTree(" of Agility", razorBlade.createSubTree(Stat.Agility, 7, 7), null, 3.7));
		razorBlade.addToList(razorBlade.createTree(" of Arcane Wrath", razorBlade.createSubTree(Stat.ArcaneSpellDamage, 10, 10), null, 4.2));
		razorBlade.addToList(razorBlade.createTree(" of Fiery Wrath", razorBlade.createSubTree(Stat.FireSpellDamage, 10, 10), null, 2.8));
		razorBlade.addToList(razorBlade.createTree(" of Frozen Wrath", razorBlade.createSubTree(Stat.FrostSpellDamage, 10, 10), null, 2.1));
		razorBlade.addToList(razorBlade.createTree(" of Healing", razorBlade.createSubTree(Stat.SpellPower, 8, 8), null, 4.5));
		razorBlade.addToList(razorBlade.createTree(" of Nature's Wrath", razorBlade.createSubTree(Stat.NatureSpellDamage, 10, 13), null, 3.3));
		razorBlade.addToList(razorBlade.createTree(" of Power", razorBlade.createSubTree(Stat.AttackPower, 14, 18), null, 19.6));
		razorBlade.addToList(razorBlade.createTree(" of Shadow Wrath", razorBlade.createSubTree(Stat.ShadowSpellDamage, 10, 10), null, 1.3));
		razorBlade.addToList(razorBlade.createTree(" of Stamina", razorBlade.createSubTree(Stat.Stamina, 7, 7), null, 3.8));
		razorBlade.addToList(razorBlade.createTree(" of Strength", razorBlade.createSubTree(Stat.Strength, 7, 7), null, 4.5));
		
		razorBlade.addToList(razorBlade.createTree(" of the Bear", razorBlade.createSubTree(Stat.Stamina, 4, 5), razorBlade.createSubTree(Stat.Strength, 4, 5), 18.5));
		razorBlade.addToList(razorBlade.createTree(" of the Monkey", razorBlade.createSubTree(Stat.Agility, 4, 5), razorBlade.createSubTree(Stat.Stamina, 4, 5), 15.5));
		razorBlade.addToList(razorBlade.createTree(" of the Tiger", razorBlade.createSubTree(Stat.Agility, 4, 5), razorBlade.createSubTree(Stat.Strength, 4, 5), 16.2));
		list.add(razorBlade);
	}
	
	private static void fillHookDagger() {
		int id = 3184;
		MultiBonus hookDagger = new MultiBonus("Hook Dagger", id);
		hookDagger.addToList(hookDagger.createTree(" of Agility", hookDagger.createSubTree(Stat.Agility, 2, 3), null, 8.8));
		hookDagger.addToList(hookDagger.createTree(" of Arcane Wrath", hookDagger.createSubTree(Stat.ArcaneSpellDamage, 3, 4), null, 9.7));
		hookDagger.addToList(hookDagger.createTree(" of Fiery Wrath", hookDagger.createSubTree(Stat.FireSpellDamage, 3, 4), null, 4.5));
		hookDagger.addToList(hookDagger.createTree(" of Frozen Wrath", hookDagger.createSubTree(Stat.FrostSpellDamage, 3, 4), null, 5.5));
		hookDagger.addToList(hookDagger.createTree(" of Healing", hookDagger.createSubTree(Stat.SpellPower, 2, 4), null, 8.7));
		hookDagger.addToList(hookDagger.createTree(" of Nature's Wrath", hookDagger.createSubTree(Stat.NatureSpellDamage, 3, 4), null, 7.1));
		hookDagger.addToList(hookDagger.createTree(" of Power", hookDagger.createSubTree(Stat.AttackPower, 4, 8), null, 30.9));
// ??	hookDagger.addToList(hookDagger.createTree(" of Shadow Wrath", hookDagger.createSubTree(Stat.ShadowSpellDamage, 6, 7), null, 1.6));
		hookDagger.addToList(hookDagger.createTree(" of Stamina", hookDagger.createSubTree(Stat.Stamina, 2, 3), null, 10.7));
		hookDagger.addToList(hookDagger.createTree(" of Strength", hookDagger.createSubTree(Stat.Strength, 2, 3), null, 14.2));
		list.add(hookDagger);
	}
	
	private static void fillHonedStiletto() {
		int id = 15242;
		MultiBonus honedStiletto = new MultiBonus("Honed Stiletto", id);
		honedStiletto.addToList(honedStiletto.createTree(" of Agility", honedStiletto.createSubTree(Stat.Agility, 4, 5), null, 3.1));
		honedStiletto.addToList(honedStiletto.createTree(" of Arcane Wrath", honedStiletto.createSubTree(Stat.ArcaneSpellDamage, 6, 7), null, 4.9));
		honedStiletto.addToList(honedStiletto.createTree(" of Fiery Wrath", honedStiletto.createSubTree(Stat.FireSpellDamage, 6, 9), null, 3.1));
		honedStiletto.addToList(honedStiletto.createTree(" of Frozen Wrath", honedStiletto.createSubTree(Stat.FrostSpellDamage, 6, 7), null, 2.2));
		honedStiletto.addToList(honedStiletto.createTree(" of Healing", honedStiletto.createSubTree(Stat.SpellPower, 5, 6), null, 5.6));
		honedStiletto.addToList(honedStiletto.createTree(" of Nature's Wrath", honedStiletto.createSubTree(Stat.NatureSpellDamage, 6, 7), null, 4.0));
		honedStiletto.addToList(honedStiletto.createTree(" of Power", honedStiletto.createSubTree(Stat.AttackPower, 8, 12), null, 19.6));
		honedStiletto.addToList(honedStiletto.createTree(" of Shadow Wrath", honedStiletto.createSubTree(Stat.ShadowSpellDamage, 6, 7), null, 1.6));
		honedStiletto.addToList(honedStiletto.createTree(" of Stamina", honedStiletto.createSubTree(Stat.Stamina, 4, 5), null, 3.9));
		honedStiletto.addToList(honedStiletto.createTree(" of Strength", honedStiletto.createSubTree(Stat.Strength, 4, 5), null, 4.9));
		
		honedStiletto.addToList(honedStiletto.createTree(" of the Bear", honedStiletto.createSubTree(Stat.Stamina, 2, 3), honedStiletto.createSubTree(Stat.Strength, 2, 3), 18.6));
		honedStiletto.addToList(honedStiletto.createTree(" of the Monkey", honedStiletto.createSubTree(Stat.Agility, 2, 3), honedStiletto.createSubTree(Stat.Stamina, 2, 3), 13.7));
		honedStiletto.addToList(honedStiletto.createTree(" of the Tiger", honedStiletto.createSubTree(Stat.Agility, 2, 3), honedStiletto.createSubTree(Stat.Strength, 2, 3), 14.9));
		list.add(honedStiletto);
	}
	
	private static void fillDreadBlade() {
		int id = 4088;
		MultiBonus dreadblade = new MultiBonus("Dreadblade", id);
		dreadblade.addToList(dreadblade.createTree(" of Agility", dreadblade.createSubTree(Stat.Agility, 8, 8), null, 3.5));
		dreadblade.addToList(dreadblade.createTree(" of Arcane Wrath", dreadblade.createSubTree(Stat.ArcaneSpellDamage, 11, 11), null, 4.0));
		dreadblade.addToList(dreadblade.createTree(" of Fiery Wrath", dreadblade.createSubTree(Stat.FireSpellDamage, 11, 11), null, 3.0));
		dreadblade.addToList(dreadblade.createTree(" of Frozen Wrath", dreadblade.createSubTree(Stat.FrostSpellDamage, 11, 11), null, 2.2));
		dreadblade.addToList(dreadblade.createTree(" of Healing", dreadblade.createSubTree(Stat.SpellPower, 9, 9), null, 4.5));
		dreadblade.addToList(dreadblade.createTree(" of Nature's Wrath", dreadblade.createSubTree(Stat.NatureSpellDamage, 11, 11), null, 2.9));
		dreadblade.addToList(dreadblade.createTree(" of Power", dreadblade.createSubTree(Stat.AttackPower, 16, 22), null, 19.5));
		dreadblade.addToList(dreadblade.createTree(" of Shadow Wrath", dreadblade.createSubTree(Stat.ShadowSpellDamage, 11, 11), null, 1.6));
		dreadblade.addToList(dreadblade.createTree(" of Stamina", dreadblade.createSubTree(Stat.Stamina, 8, 8), null, 3.9));
		dreadblade.addToList(dreadblade.createTree(" of Strength", dreadblade.createSubTree(Stat.Strength, 8, 8), null, 4.5));
		
		dreadblade.addToList(dreadblade.createTree(" of the Bear", dreadblade.createSubTree(Stat.Stamina, 5, 6), dreadblade.createSubTree(Stat.Strength, 5, 6), 18.7));
		dreadblade.addToList(dreadblade.createTree(" of the Monkey", dreadblade.createSubTree(Stat.Agility, 5, 6), dreadblade.createSubTree(Stat.Stamina, 5, 6), 15.5));
		dreadblade.addToList(dreadblade.createTree(" of the Tiger", dreadblade.createSubTree(Stat.Agility, 5, 6), dreadblade.createSubTree(Stat.Strength, 5, 6), 16.1));
		list.add(dreadblade);
	}
	
	private static void fillDemonBlade() {
		int id = 15246;
		MultiBonus demonBlade = new MultiBonus("Demon Blade", id);
		demonBlade.addToList(demonBlade.createTree(" of Agility", demonBlade.createSubTree(Stat.Agility, 11, 12), null, 4.1));
		demonBlade.addToList(demonBlade.createTree(" of Arcane Wrath", demonBlade.createSubTree(Stat.ArcaneSpellDamage, 16, 17), null, 3.1));
		demonBlade.addToList(demonBlade.createTree(" of Fiery Wrath", demonBlade.createSubTree(Stat.FireSpellDamage, 16, 17), null, 2.4));
		demonBlade.addToList(demonBlade.createTree(" of Frozen Wrath", demonBlade.createSubTree(Stat.FrostSpellDamage, 16, 17), null, 1.5));
		demonBlade.addToList(demonBlade.createTree(" of Healing", demonBlade.createSubTree(Stat.SpellPower, 13, 14), null, 4.1));
		demonBlade.addToList(demonBlade.createTree(" of Nature's Wrath", demonBlade.createSubTree(Stat.NatureSpellDamage, 16, 17), null, 2.7));
		demonBlade.addToList(demonBlade.createTree(" of Power", demonBlade.createSubTree(Stat.AttackPower, 22, 24), null, 20.7));
		demonBlade.addToList(demonBlade.createTree(" of Shadow Wrath", demonBlade.createSubTree(Stat.ShadowSpellDamage, 16, 17), null, 1.6));
		demonBlade.addToList(demonBlade.createTree(" of Stamina", demonBlade.createSubTree(Stat.Stamina, 11, 12), null, 3.7));
		demonBlade.addToList(demonBlade.createTree(" of Strength", demonBlade.createSubTree(Stat.Strength, 11, 12), null, 3.6));
		
		demonBlade.addToList(demonBlade.createTree(" of the Bear", demonBlade.createSubTree(Stat.Stamina, 7, 8), demonBlade.createSubTree(Stat.Strength, 7, 8), 17.4));
		demonBlade.addToList(demonBlade.createTree(" of the Monkey", demonBlade.createSubTree(Stat.Agility, 7, 8), demonBlade.createSubTree(Stat.Stamina, 7, 8), 17.5));
		demonBlade.addToList(demonBlade.createTree(" of the Tiger", demonBlade.createSubTree(Stat.Agility, 7, 8), demonBlade.createSubTree(Stat.Strength, 7, 8), 17.6));
		list.add(demonBlade);
	}
	
	private static void fillDeadlyKris() {
		int id = 15243;
		MultiBonus deadlyKris = new MultiBonus("Deadly Kris", id);
		deadlyKris.addToList(deadlyKris.createTree(" of Agility", deadlyKris.createSubTree(Stat.Agility, 5, 6), null, 3.5));
		deadlyKris.addToList(deadlyKris.createTree(" of Arcane Wrath", deadlyKris.createSubTree(Stat.ArcaneSpellDamage, 7, 11), null, 4.1));
		deadlyKris.addToList(deadlyKris.createTree(" of Fiery Wrath", deadlyKris.createSubTree(Stat.FireSpellDamage, 7, 9), null, 2.5));
		deadlyKris.addToList(deadlyKris.createTree(" of Frozen Wrath", deadlyKris.createSubTree(Stat.FrostSpellDamage, 7, 9), null, 2.0));
		deadlyKris.addToList(deadlyKris.createTree(" of Healing", deadlyKris.createSubTree(Stat.SpellPower, 6, 9), null, 4.0));
		deadlyKris.addToList(deadlyKris.createTree(" of Nature's Wrath", deadlyKris.createSubTree(Stat.NatureSpellDamage, 7, 9), null, 3.5));
		deadlyKris.addToList(deadlyKris.createTree(" of Power", deadlyKris.createSubTree(Stat.AttackPower, 10, 16), null, 20.4));
		deadlyKris.addToList(deadlyKris.createTree(" of Shadow Wrath", deadlyKris.createSubTree(Stat.ShadowSpellDamage, 7, 9), null, 1.2));
		deadlyKris.addToList(deadlyKris.createTree(" of Stamina", deadlyKris.createSubTree(Stat.Stamina, 5, 6), null, 3.7));
		deadlyKris.addToList(deadlyKris.createTree(" of Strength", deadlyKris.createSubTree(Stat.Strength, 5, 6), null, 5.3));
		
		deadlyKris.addToList(deadlyKris.createTree(" of the Bear", deadlyKris.createSubTree(Stat.Stamina, 3, 4), deadlyKris.createSubTree(Stat.Strength, 3, 4), 19.5));
		deadlyKris.addToList(deadlyKris.createTree(" of the Monkey", deadlyKris.createSubTree(Stat.Agility, 3, 4), deadlyKris.createSubTree(Stat.Stamina, 3, 4), 14.5));
		deadlyKris.addToList(deadlyKris.createTree(" of the Tiger", deadlyKris.createSubTree(Stat.Agility, 3, 4), deadlyKris.createSubTree(Stat.Strength, 3, 4), 16.0));
		list.add(deadlyKris);
	}
	
	private static void fillCurvedDagger() {
		int id = 2632;
		MultiBonus curvedDagger = new MultiBonus("Curved Dagger", id);
		curvedDagger.addToList(curvedDagger.createTree(" of Agility", curvedDagger.createSubTree(Stat.Agility, 1, 1), null, 10.7));
		curvedDagger.addToList(curvedDagger.createTree(" of Arcane Wrath", curvedDagger.createSubTree(Stat.ArcaneSpellDamage, 1, 1), null, 6.6));
		curvedDagger.addToList(curvedDagger.createTree(" of Fiery Wrath", curvedDagger.createSubTree(Stat.FireSpellDamage, 1, 1), null, 3.5));
		curvedDagger.addToList(curvedDagger.createTree(" of Frozen Wrath", curvedDagger.createSubTree(Stat.FrostSpellDamage, 1, 1), null, 3.9));
		curvedDagger.addToList(curvedDagger.createTree(" of Healing", curvedDagger.createSubTree(Stat.SpellPower, 1, 2), null, 7.5));
		curvedDagger.addToList(curvedDagger.createTree(" of Nature's Wrath", curvedDagger.createSubTree(Stat.NatureSpellDamage, 1, 1), null, 5.8));
		curvedDagger.addToList(curvedDagger.createTree(" of Power", curvedDagger.createSubTree(Stat.AttackPower, 2, 4), null, 31.8));
		curvedDagger.addToList(curvedDagger.createTree(" of Shadow Wrath", curvedDagger.createSubTree(Stat.ShadowSpellDamage, 1, 1), null, 3.1));
		curvedDagger.addToList(curvedDagger.createTree(" of Stamina", curvedDagger.createSubTree(Stat.Stamina, 1, 1), null, 10.5));
		curvedDagger.addToList(curvedDagger.createTree(" of Strength", curvedDagger.createSubTree(Stat.Strength, 1, 1), null, 12.2));
		list.add(curvedDagger);
	}
	
	private static void fillBattleKnife() {
		int id = 15241;
		MultiBonus battleKnife = new MultiBonus("Battle Knife", id);
		battleKnife.addToList(battleKnife.createTree(" of Agility", battleKnife.createSubTree(Stat.Agility, 4, 4), null, 3.3));
		battleKnife.addToList(battleKnife.createTree(" of Arcane Wrath", battleKnife.createSubTree(Stat.ArcaneSpellDamage, 6, 6), null, 4.5));
		battleKnife.addToList(battleKnife.createTree(" of Fiery Wrath", battleKnife.createSubTree(Stat.FireSpellDamage, 6, 6), null, 2.8));
		battleKnife.addToList(battleKnife.createTree(" of Frozen Wrath", battleKnife.createSubTree(Stat.FrostSpellDamage, 6, 6), null, 2.1));
		battleKnife.addToList(battleKnife.createTree(" of Healing", battleKnife.createSubTree(Stat.SpellPower, 5, 5), null, 4.8));
		battleKnife.addToList(battleKnife.createTree(" of Nature's Wrath", battleKnife.createSubTree(Stat.NatureSpellDamage, 6, 6), null, 3.8));
		battleKnife.addToList(battleKnife.createTree(" of Power", battleKnife.createSubTree(Stat.AttackPower, 8, 10), null, 19.6));
		battleKnife.addToList(battleKnife.createTree(" of Shadow Wrath", battleKnife.createSubTree(Stat.ShadowSpellDamage, 6, 6), null, 1.5));
		battleKnife.addToList(battleKnife.createTree(" of Stamina", battleKnife.createSubTree(Stat.Stamina, 4, 4), null, 3.7));
		battleKnife.addToList(battleKnife.createTree(" of Strength", battleKnife.createSubTree(Stat.Strength, 4, 4), null, 4.9));
		
		battleKnife.addToList(battleKnife.createTree(" of the Bear", battleKnife.createSubTree(Stat.Stamina, 2, 3), battleKnife.createSubTree(Stat.Strength, 2, 3), 19.0));
		battleKnife.addToList(battleKnife.createTree(" of the Monkey", battleKnife.createSubTree(Stat.Agility, 2, 3), battleKnife.createSubTree(Stat.Stamina, 2, 3), 14.5));
		battleKnife.addToList(battleKnife.createTree(" of the Tiger", battleKnife.createSubTree(Stat.Agility, 2, 3), battleKnife.createSubTree(Stat.Strength, 2, 3), 15.6));
		list.add(battleKnife);
	}
	
	private static void fillCarvingKnife() {
		int id = 2140;
		MultiBonus carvingKnife = new MultiBonus("Carving Knife", id);
		carvingKnife.addToList(carvingKnife.createTree(" of Agility", carvingKnife.createSubTree(Stat.Agility, 1, 1), null, 11.3));
		carvingKnife.addToList(carvingKnife.createTree(" of Arcane Wrath", carvingKnife.createSubTree(Stat.ArcaneSpellDamage, 1, 3), null, 6.2));
		carvingKnife.addToList(carvingKnife.createTree(" of Fiery Wrath", carvingKnife.createSubTree(Stat.FireSpellDamage, 1, 1), null, 3.3));
		carvingKnife.addToList(carvingKnife.createTree(" of Frozen Wrath", carvingKnife.createSubTree(Stat.FrostSpellDamage, 1, 3), null, 3.7));
		carvingKnife.addToList(carvingKnife.createTree(" of Healing", carvingKnife.createSubTree(Stat.SpellPower, 1, 1), null, 6.9));
		carvingKnife.addToList(carvingKnife.createTree(" of Holy Wrath", carvingKnife.createSubTree(Stat.HolySpellDamage, 1, 1), null, 3.9));
		carvingKnife.addToList(carvingKnife.createTree(" of Nature's Wrath", carvingKnife.createSubTree(Stat.NatureSpellDamage, 1, 1), null, 5.5));
		carvingKnife.addToList(carvingKnife.createTree(" of Power", carvingKnife.createSubTree(Stat.AttackPower, 2, 4), null, 33.1));
		carvingKnife.addToList(carvingKnife.createTree(" of Shadow Wrath", carvingKnife.createSubTree(Stat.ShadowSpellDamage, 1, 1), null, 2.9));
		carvingKnife.addToList(carvingKnife.createTree(" of Stamina", carvingKnife.createSubTree(Stat.Stamina, 1, 1), null, 10.8));
		carvingKnife.addToList(carvingKnife.createTree(" of Strength", carvingKnife.createSubTree(Stat.Strength, 1, 1), null, 12.4));
		list.add(carvingKnife);
	}
	
	private static void fillCrossDagger() {
		int id = 2819;
		MultiBonus crossDagger = new MultiBonus("Cross Dagger", id);
		crossDagger.addToList(crossDagger.createTree(" of Agility", crossDagger.createSubTree(Stat.Agility, 4, 5), null, 3.3));
		crossDagger.addToList(crossDagger.createTree(" of Arcane Wrath", crossDagger.createSubTree(Stat.ArcaneSpellDamage, 6, 7), null, 4.5));
		crossDagger.addToList(crossDagger.createTree(" of Fiery Wrath", crossDagger.createSubTree(Stat.FireSpellDamage, 6, 7), null, 2.9));
		crossDagger.addToList(crossDagger.createTree(" of Frozen Wrath", crossDagger.createSubTree(Stat.FrostSpellDamage, 6, 7), null, 2.2));
		crossDagger.addToList(crossDagger.createTree(" of Healing", crossDagger.createSubTree(Stat.SpellPower, 5, 7), null, 5.0));
		crossDagger.addToList(crossDagger.createTree(" of Nature's Wrath", crossDagger.createSubTree(Stat.NatureSpellDamage, 6, 7), null, 3.9));
		crossDagger.addToList(crossDagger.createTree(" of Power", crossDagger.createSubTree(Stat.AttackPower, 8, 12), null, 19.9));
		crossDagger.addToList(crossDagger.createTree(" of Shadow Wrath", crossDagger.createSubTree(Stat.ShadowSpellDamage, 6, 7), null, 1.5));
		crossDagger.addToList(crossDagger.createTree(" of Stamina", crossDagger.createSubTree(Stat.Stamina, 4, 5), null, 3.7));
		crossDagger.addToList(crossDagger.createTree(" of Strength", crossDagger.createSubTree(Stat.Strength, 4, 5), null, 4.8));
		
		crossDagger.addToList(crossDagger.createTree(" of the Bear", crossDagger.createSubTree(Stat.Stamina, 2, 3), crossDagger.createSubTree(Stat.Strength, 2, 3), 18.9));
		crossDagger.addToList(crossDagger.createTree(" of the Monkey", crossDagger.createSubTree(Stat.Agility, 2, 3), crossDagger.createSubTree(Stat.Stamina, 2, 3), 14.0));
		crossDagger.addToList(crossDagger.createTree(" of the Tiger", crossDagger.createSubTree(Stat.Agility, 2, 3), crossDagger.createSubTree(Stat.Strength, 2, 3), 15.3));
		list.add(crossDagger);
	}
	
	private static void fillBloodstrikeDagger() {
		int id = 15247;
		MultiBonus bsDagger = new MultiBonus("Bloodstrike Dagger", id);
		bsDagger.addToList(bsDagger.createTree(" of Agility", bsDagger.createSubTree(Stat.Agility, 12, 12), null, 4.3));
		bsDagger.addToList(bsDagger.createTree(" of Arcane Wrath", bsDagger.createSubTree(Stat.ArcaneSpellDamage, 17, 17), null, 2.7));
		bsDagger.addToList(bsDagger.createTree(" of Fiery Wrath", bsDagger.createSubTree(Stat.FireSpellDamage, 17, 17), null, 2.4));
		bsDagger.addToList(bsDagger.createTree(" of Frozen Wrath", bsDagger.createSubTree(Stat.FrostSpellDamage, 17, 17), null, 1.4));
		bsDagger.addToList(bsDagger.createTree(" of Healing", bsDagger.createSubTree(Stat.SpellPower, 14, 14), null, 4.2));
		bsDagger.addToList(bsDagger.createTree(" of Nature's Wrath", bsDagger.createSubTree(Stat.NatureSpellDamage, 17, 17), null, 2.1));
		bsDagger.addToList(bsDagger.createTree(" of Power", bsDagger.createSubTree(Stat.AttackPower, 24, 24), null, 19.8));
		bsDagger.addToList(bsDagger.createTree(" of Shadow Wrath", bsDagger.createSubTree(Stat.ShadowSpellDamage, 17, 17), null, 1.5));
		bsDagger.addToList(bsDagger.createTree(" of Stamina", bsDagger.createSubTree(Stat.Stamina, 12, 12), null, 3.9));
		bsDagger.addToList(bsDagger.createTree(" of Strength", bsDagger.createSubTree(Stat.Strength, 12, 12), null, 3.7));
		
		bsDagger.addToList(bsDagger.createTree(" of the Bear", bsDagger.createSubTree(Stat.Stamina, 7, 8), bsDagger.createSubTree(Stat.Strength, 7, 8), 17.1));
		bsDagger.addToList(bsDagger.createTree(" of the Monkey", bsDagger.createSubTree(Stat.Agility, 7, 8), bsDagger.createSubTree(Stat.Stamina, 7, 8), 19.1));
		bsDagger.addToList(bsDagger.createTree(" of the Tiger", bsDagger.createSubTree(Stat.Agility, 7, 8), bsDagger.createSubTree(Stat.Strength, 7, 8), 17.9));
		list.add(bsDagger);
	}
	
	private static void fillDireNail() { //+5 Shadow Resistance on default!
		int id = 10828;
		MultiBonus direNail = new MultiBonus("Dire Nail", id);
		direNail.addToList(direNail.createTree(" of Agility", direNail.createSubTree(Stat.Agility, 11, 12), null, 4.8));
		direNail.addToList(direNail.createTree(" of Arcane Wrath", direNail.createSubTree(Stat.ArcaneSpellDamage, 16, 17), null, 3.4));
		direNail.addToList(direNail.createTree(" of Fiery Wrath", direNail.createSubTree(Stat.FireSpellDamage, 16, 17), null, 2.1));
		direNail.addToList(direNail.createTree(" of Frozen Wrath", direNail.createSubTree(Stat.FrostSpellDamage, 16, 16), null, 0.6));
		direNail.addToList(direNail.createTree(" of Healing", direNail.createSubTree(Stat.SpellPower, 13, 14), null, 3.7));
		direNail.addToList(direNail.createTree(" of Nature's Wrath", direNail.createSubTree(Stat.NatureSpellDamage, 16, 17), null, 2.6));
		direNail.addToList(direNail.createTree(" of Power", direNail.createSubTree(Stat.AttackPower, 22, 24), null, 20.3));
		direNail.addToList(direNail.createTree(" of Shadow Wrath", direNail.createSubTree(Stat.ShadowSpellDamage, 16, 16), null, 0.6));
		direNail.addToList(direNail.createTree(" of Stamina", direNail.createSubTree(Stat.Stamina, 11, 12), null, 3.7));
		direNail.addToList(direNail.createTree(" of Strength", direNail.createSubTree(Stat.Strength, 11, 12), null, 4.0));
		
		direNail.addToList(direNail.createTree(" of the Bear", direNail.createSubTree(Stat.Stamina, 7, 8), direNail.createSubTree(Stat.Strength, 7, 8), 17.9));
		direNail.addToList(direNail.createTree(" of the Monkey", direNail.createSubTree(Stat.Agility, 7, 8), direNail.createSubTree(Stat.Stamina, 7, 8), 18.8));
		direNail.addToList(direNail.createTree(" of the Tiger", direNail.createSubTree(Stat.Agility, 7, 8), direNail.createSubTree(Stat.Strength, 7, 8), 17.5));
		list.add(direNail);
	}
}
