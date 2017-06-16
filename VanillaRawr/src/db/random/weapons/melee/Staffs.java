package db.random.weapons.melee;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class Staffs {
	
	private static ArrayList<MultiBonus> list;

	private static int[] ids = {
		3185, 15274, 2072, 2077, 15276, 4575, 866, 15278, 1613, 4566, 15275
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
		fillAcrobaticStaff();
		fillDivinerLongStaff();
		fillDwarvenMagestaff();
		fillMagicianStaff();
		fillMagusLongStaff();
		fillMedicineStaff();
		fillMonksStaff();
		fillSolsticeStaff();
		fillSpiritchaserStaff();
		fillSturdyQuarterstaff();
		fillThaumaturgistStaff();
	/*	System.out.println(list.get(0));
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
		System.out.println("--------------"); */
	}
	
	private static void fillThaumaturgistStaff() {
		int id = 15275;
		MultiBonus thaumaturgistStaff = new MultiBonus("Thaumaturgist Staff", id);
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of Arcane Wrath", thaumaturgistStaff.createSubTree(Stat.ArcaneSpellDamage, 19, 33), null, 5.7));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of Fiery Wrath", thaumaturgistStaff.createSubTree(Stat.FireSpellDamage, 19, 33), null, 3.3));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of Frozen Wrath", thaumaturgistStaff.createSubTree(Stat.FrostSpellDamage, 31, 33), null, 2.1));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of Healing", thaumaturgistStaff.createSubTree(Stat.SpellPower, 26, 27), null, 5.3));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of Intellect", thaumaturgistStaff.createSubTree(Stat.Intellect, 22, 23), null, 3.4));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of Nature's Wrath", thaumaturgistStaff.createSubTree(Stat.NatureSpellDamage, 31, 33), null, 5.1));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of Power", thaumaturgistStaff.createSubTree(Stat.AttackPower, 26, 46), null, 2.1));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of Shadow Wrath", thaumaturgistStaff.createSubTree(Stat.ShadowSpellDamage, 31, 33), null, 1.5));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of Spirit", thaumaturgistStaff.createSubTree(Stat.Spirit, 22, 23), null, 5.6));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of Stamina", thaumaturgistStaff.createSubTree(Stat.Stamina, 22, 23), null, 4.4));
		
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of the Bear", thaumaturgistStaff.createSubTree(Stat.Stamina, 14, 15), thaumaturgistStaff.createSubTree(Stat.Strength, 14, 15), 9.0));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of the Boar", thaumaturgistStaff.createSubTree(Stat.Spirit, 14, 15), thaumaturgistStaff.createSubTree(Stat.Strength, 14, 15), 11.3));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of the Eagle", thaumaturgistStaff.createSubTree(Stat.Intellect, 14, 15), thaumaturgistStaff.createSubTree(Stat.Stamina, 14, 15), 5.0));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of the Monkey", thaumaturgistStaff.createSubTree(Stat.Agility, 14, 15), thaumaturgistStaff.createSubTree(Stat.Stamina, 14, 15), 8.2));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of the Owl", thaumaturgistStaff.createSubTree(Stat.Intellect, 14, 15), thaumaturgistStaff.createSubTree(Stat.Spirit, 14, 15), 7.8));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of the Whale", thaumaturgistStaff.createSubTree(Stat.Spirit, 14, 15), thaumaturgistStaff.createSubTree(Stat.Stamina, 14, 15), 9.4));
		thaumaturgistStaff.addToList(thaumaturgistStaff.createTree(" of the Wolf", thaumaturgistStaff.createSubTree(Stat.Agility, 14, 15), thaumaturgistStaff.createSubTree(Stat.Spirit, 14, 15), 11.0));
		list.add(thaumaturgistStaff);
	}
	
	private static void fillSturdyQuarterstaff() {
		int id = 4566;
		MultiBonus sturdyQuarterstaff = new MultiBonus("Sturdy Quarterstaff", id);
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of Arcane Wrath", sturdyQuarterstaff.createSubTree(Stat.ArcaneSpellDamage, 4, 6), null, 5.1));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of Fiery Wrath", sturdyQuarterstaff.createSubTree(Stat.FireSpellDamage, 4, 6), null, 3.1));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of Frozen Wrath", sturdyQuarterstaff.createSubTree(Stat.FrostSpellDamage, 4, 6), null, 2.4));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of Healing", sturdyQuarterstaff.createSubTree(Stat.SpellPower, 4, 5), null, 5.7));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of Intellect", sturdyQuarterstaff.createSubTree(Stat.Intellect, 3, 4), null, 3.3));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of Nature's Wrath", sturdyQuarterstaff.createSubTree(Stat.NatureSpellDamage, 4, 6), null, 5.2));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of Power", sturdyQuarterstaff.createSubTree(Stat.AttackPower, 6, 8), null, 2.4));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of Shadow Wrath", sturdyQuarterstaff.createSubTree(Stat.ShadowSpellDamage, 4, 6), null, 2.2));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of Spirit", sturdyQuarterstaff.createSubTree(Stat.Spirit, 3, 4), null, 4.9));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of Stamina", sturdyQuarterstaff.createSubTree(Stat.Stamina, 3, 4), null, 4.2));
		
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of the Bear", sturdyQuarterstaff.createSubTree(Stat.Stamina, 1, 2), sturdyQuarterstaff.createSubTree(Stat.Strength, 1, 2), 9.5));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of the Boar", sturdyQuarterstaff.createSubTree(Stat.Spirit, 1, 2), sturdyQuarterstaff.createSubTree(Stat.Strength, 1, 2), 10.5));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of the Eagle", sturdyQuarterstaff.createSubTree(Stat.Intellect, 1, 2), sturdyQuarterstaff.createSubTree(Stat.Stamina, 1, 2), 6.2));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of the Monkey", sturdyQuarterstaff.createSubTree(Stat.Agility, 1, 2), sturdyQuarterstaff.createSubTree(Stat.Stamina, 1, 2), 9.9));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of the Owl", sturdyQuarterstaff.createSubTree(Stat.Intellect, 1, 2), sturdyQuarterstaff.createSubTree(Stat.Spirit, 1, 2), 6.8));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of the Whale", sturdyQuarterstaff.createSubTree(Stat.Spirit, 1, 2), sturdyQuarterstaff.createSubTree(Stat.Stamina, 1, 2), 8.4));
		sturdyQuarterstaff.addToList(sturdyQuarterstaff.createTree(" of the Wolf", sturdyQuarterstaff.createSubTree(Stat.Agility, 1, 2), sturdyQuarterstaff.createSubTree(Stat.Spirit, 1, 2), 10.4));
		list.add(sturdyQuarterstaff);
	}
	
	private static void fillSpiritchaserStaff() {
		int id = 1613;
		MultiBonus spiritchaserStaff = new MultiBonus("Spiritchaser Staff", id);
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of Arcane Wrath", spiritchaserStaff.createSubTree(Stat.ArcaneSpellDamage, 14, 27), null, 5.7));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of Fiery Wrath", spiritchaserStaff.createSubTree(Stat.FireSpellDamage, 14, 27), null, 3.2));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of Frozen Wrath", spiritchaserStaff.createSubTree(Stat.FrostSpellDamage, 26, 27), null, 2.3));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of Healing", spiritchaserStaff.createSubTree(Stat.SpellPower, 12, 22), null, 4.7));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of Intellect", spiritchaserStaff.createSubTree(Stat.Intellect, 18, 19), null, 3.4));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of Nature's Wrath", spiritchaserStaff.createSubTree(Stat.NatureSpellDamage, 14, 27), null, 5.4));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of Power", spiritchaserStaff.createSubTree(Stat.AttackPower, 36, 38), null, 2.3));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of Shadow Wrath", spiritchaserStaff.createSubTree(Stat.ShadowSpellDamage, 26, 27), null, 1.5));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of Spirit", spiritchaserStaff.createSubTree(Stat.Spirit, 18, 19), null, 5.7));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of Stamina", spiritchaserStaff.createSubTree(Stat.Stamina, 18, 19), null, 4.6));
		
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of the Bear", spiritchaserStaff.createSubTree(Stat.Stamina, 11, 12), spiritchaserStaff.createSubTree(Stat.Strength, 11, 12), 9.5));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of the Boar", spiritchaserStaff.createSubTree(Stat.Spirit, 11, 12), spiritchaserStaff.createSubTree(Stat.Strength, 11, 12), 12.0));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of the Eagle", spiritchaserStaff.createSubTree(Stat.Intellect, 11, 12), spiritchaserStaff.createSubTree(Stat.Stamina, 11, 12), 4.9));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of the Monkey", spiritchaserStaff.createSubTree(Stat.Agility, 11, 12), spiritchaserStaff.createSubTree(Stat.Stamina, 11, 12), 8.0));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of the Owl", spiritchaserStaff.createSubTree(Stat.Intellect, 11, 12), spiritchaserStaff.createSubTree(Stat.Spirit, 11, 12), 6.6));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of the Whale", spiritchaserStaff.createSubTree(Stat.Spirit, 11, 12), spiritchaserStaff.createSubTree(Stat.Stamina, 11, 12), 9.1));
		spiritchaserStaff.addToList(spiritchaserStaff.createTree(" of the Wolf", spiritchaserStaff.createSubTree(Stat.Agility, 11, 12), spiritchaserStaff.createSubTree(Stat.Spirit, 11, 12), 11.1));
		list.add(spiritchaserStaff);
	}
	
	private static void fillSolsticeStaff() {
		int id = 15278;
		MultiBonus solsticeStaff = new MultiBonus("Solstice Staff", id);
		solsticeStaff.addToList(solsticeStaff.createTree(" of Arcane Wrath", solsticeStaff.createSubTree(Stat.ArcaneSpellDamage, 36, 37), null, 4.5));
		solsticeStaff.addToList(solsticeStaff.createTree(" of Fiery Wrath", solsticeStaff.createSubTree(Stat.FireSpellDamage, 36, 37), null, 3.8));
		solsticeStaff.addToList(solsticeStaff.createTree(" of Frozen Wrath", solsticeStaff.createSubTree(Stat.FrostSpellDamage, 36, 37), null, 2.1));
		solsticeStaff.addToList(solsticeStaff.createTree(" of Healing", solsticeStaff.createSubTree(Stat.SpellPower, 29, 30), null, 5.9));
		solsticeStaff.addToList(solsticeStaff.createTree(" of Intellect", solsticeStaff.createSubTree(Stat.Intellect, 25, 26), null, 4.5));
		solsticeStaff.addToList(solsticeStaff.createTree(" of Nature's Wrath", solsticeStaff.createSubTree(Stat.NatureSpellDamage, 36, 37), null, 4.4));
		solsticeStaff.addToList(solsticeStaff.createTree(" of Power", solsticeStaff.createSubTree(Stat.AttackPower, 50, 52), null, 2.1));
		solsticeStaff.addToList(solsticeStaff.createTree(" of Shadow Wrath", solsticeStaff.createSubTree(Stat.ShadowSpellDamage, 36, 37), null, 2.0));
		solsticeStaff.addToList(solsticeStaff.createTree(" of Spirit", solsticeStaff.createSubTree(Stat.Spirit, 25, 26), null, 4.6));
		solsticeStaff.addToList(solsticeStaff.createTree(" of Stamina", solsticeStaff.createSubTree(Stat.Stamina, 25, 26), null, 4.7));
		
		solsticeStaff.addToList(solsticeStaff.createTree(" of the Bear", solsticeStaff.createSubTree(Stat.Stamina, 16, 17), solsticeStaff.createSubTree(Stat.Strength, 16, 17), 9.1));
		solsticeStaff.addToList(solsticeStaff.createTree(" of the Boar", solsticeStaff.createSubTree(Stat.Spirit, 16, 17), solsticeStaff.createSubTree(Stat.Strength, 16, 17), 9.1));
		solsticeStaff.addToList(solsticeStaff.createTree(" of the Eagle", solsticeStaff.createSubTree(Stat.Intellect, 16, 17), solsticeStaff.createSubTree(Stat.Stamina, 16, 17), 7.6));
		solsticeStaff.addToList(solsticeStaff.createTree(" of the Monkey", solsticeStaff.createSubTree(Stat.Agility, 16, 17), solsticeStaff.createSubTree(Stat.Stamina, 16, 17), 8.6));
		solsticeStaff.addToList(solsticeStaff.createTree(" of the Owl", solsticeStaff.createSubTree(Stat.Intellect, 16, 17), solsticeStaff.createSubTree(Stat.Spirit, 16, 17), 8.8));
		solsticeStaff.addToList(solsticeStaff.createTree(" of the Whale", solsticeStaff.createSubTree(Stat.Spirit, 16, 17), solsticeStaff.createSubTree(Stat.Stamina, 16, 17), 9.2));
		solsticeStaff.addToList(solsticeStaff.createTree(" of the Wolf", solsticeStaff.createSubTree(Stat.Agility, 16, 17), solsticeStaff.createSubTree(Stat.Spirit, 16, 17), 8.9));
		list.add(solsticeStaff);
	}
	
	private static void fillMonksStaff() {
		int id = 866;
		MultiBonus monksStaff = new MultiBonus("Monk's Staff", id);
		monksStaff.addToList(monksStaff.createTree(" of Arcane Wrath", monksStaff.createSubTree(Stat.ArcaneSpellDamage, 23, 24), null, 5.6));
		monksStaff.addToList(monksStaff.createTree(" of Fiery Wrath", monksStaff.createSubTree(Stat.FireSpellDamage, 23, 24), null, 3.2));
		monksStaff.addToList(monksStaff.createTree(" of Frozen Wrath", monksStaff.createSubTree(Stat.FrostSpellDamage, 23, 24), null, 2.2));
		monksStaff.addToList(monksStaff.createTree(" of Healing", monksStaff.createSubTree(Stat.SpellPower, 19, 20), null, 5.0));
		monksStaff.addToList(monksStaff.createTree(" of Intellect", monksStaff.createSubTree(Stat.Intellect, 16, 17), null, 3.6));
		monksStaff.addToList(monksStaff.createTree(" of Nature's Wrath", monksStaff.createSubTree(Stat.NatureSpellDamage, 23, 24), null, 5.4));
		monksStaff.addToList(monksStaff.createTree(" of Power", monksStaff.createSubTree(Stat.AttackPower, 32, 34), null, 2.1));
		monksStaff.addToList(monksStaff.createTree(" of Shadow Wrath", monksStaff.createSubTree(Stat.ShadowSpellDamage, 23, 24), null, 1.5));
		monksStaff.addToList(monksStaff.createTree(" of Spirit", monksStaff.createSubTree(Stat.Spirit, 16, 17), null, 5.6));
		monksStaff.addToList(monksStaff.createTree(" of Stamina", monksStaff.createSubTree(Stat.Stamina, 16, 17), null, 4.5));
		
		monksStaff.addToList(monksStaff.createTree(" of the Bear", monksStaff.createSubTree(Stat.Stamina, 10, 11), monksStaff.createSubTree(Stat.Strength, 10, 11), 9.3));
		monksStaff.addToList(monksStaff.createTree(" of the Boar", monksStaff.createSubTree(Stat.Spirit, 10, 11), monksStaff.createSubTree(Stat.Strength, 10, 11), 11.6));
		monksStaff.addToList(monksStaff.createTree(" of the Eagle", monksStaff.createSubTree(Stat.Intellect, 10, 11), monksStaff.createSubTree(Stat.Stamina, 10, 11), 5.0));
		monksStaff.addToList(monksStaff.createTree(" of the Monkey", monksStaff.createSubTree(Stat.Agility, 10, 11), monksStaff.createSubTree(Stat.Stamina, 10, 11), 8.1));
		monksStaff.addToList(monksStaff.createTree(" of the Owl", monksStaff.createSubTree(Stat.Intellect, 10, 11), monksStaff.createSubTree(Stat.Spirit, 10, 11), 6.9));
		monksStaff.addToList(monksStaff.createTree(" of the Whale", monksStaff.createSubTree(Stat.Spirit, 10, 11), monksStaff.createSubTree(Stat.Stamina, 10, 11), 9.3));
		monksStaff.addToList(monksStaff.createTree(" of the Wolf", monksStaff.createSubTree(Stat.Agility, 10, 11), monksStaff.createSubTree(Stat.Spirit, 10, 11), 11.0));
		list.add(monksStaff);
	}
	
	private static void fillMedicineStaff() {
		int id = 4575;
		MultiBonus medicineStaff = new MultiBonus("Medicine Staff", id);
		medicineStaff.addToList(medicineStaff.createTree(" of Arcane Wrath", medicineStaff.createSubTree(Stat.ArcaneSpellDamage, 4, 10), null, 5.4));
		medicineStaff.addToList(medicineStaff.createTree(" of Fiery Wrath", medicineStaff.createSubTree(Stat.FireSpellDamage, 9, 10), null, 2.9));
		medicineStaff.addToList(medicineStaff.createTree(" of Frozen Wrath", medicineStaff.createSubTree(Stat.FrostSpellDamage, 9, 10), null, 2.3));
		medicineStaff.addToList(medicineStaff.createTree(" of Healing", medicineStaff.createSubTree(Stat.SpellPower, 4, 8), null, 4.7));
		medicineStaff.addToList(medicineStaff.createTree(" of Intellect", medicineStaff.createSubTree(Stat.Intellect, 6, 7), null, 2.8));
		medicineStaff.addToList(medicineStaff.createTree(" of Nature's Wrath", medicineStaff.createSubTree(Stat.NatureSpellDamage, 4, 10), null, 5.7));
		medicineStaff.addToList(medicineStaff.createTree(" of Power", medicineStaff.createSubTree(Stat.AttackPower, 12, 14), null, 2.5));
		medicineStaff.addToList(medicineStaff.createTree(" of Shadow Wrath", medicineStaff.createSubTree(Stat.ShadowSpellDamage, 9, 10), null, 1.6));
		medicineStaff.addToList(medicineStaff.createTree(" of Spirit", medicineStaff.createSubTree(Stat.Spirit, 6, 7), null, 5.8));
		medicineStaff.addToList(medicineStaff.createTree(" of Stamina", medicineStaff.createSubTree(Stat.Stamina, 6, 7), null, 4.0));
		
		medicineStaff.addToList(medicineStaff.createTree(" of the Bear", medicineStaff.createSubTree(Stat.Stamina, 3, 4), medicineStaff.createSubTree(Stat.Strength, 3, 4), 9.3));
		medicineStaff.addToList(medicineStaff.createTree(" of the Boar", medicineStaff.createSubTree(Stat.Spirit, 3, 4), medicineStaff.createSubTree(Stat.Strength, 3, 4), 12.7));
		medicineStaff.addToList(medicineStaff.createTree(" of the Eagle", medicineStaff.createSubTree(Stat.Intellect, 3, 4), medicineStaff.createSubTree(Stat.Stamina, 3, 4), 4.5));
		medicineStaff.addToList(medicineStaff.createTree(" of the Monkey", medicineStaff.createSubTree(Stat.Agility, 3, 4), medicineStaff.createSubTree(Stat.Stamina, 3, 4), 9.6));
		medicineStaff.addToList(medicineStaff.createTree(" of the Owl", medicineStaff.createSubTree(Stat.Intellect, 3, 4), medicineStaff.createSubTree(Stat.Spirit, 3, 4), 5.8));
		medicineStaff.addToList(medicineStaff.createTree(" of the Whale", medicineStaff.createSubTree(Stat.Spirit, 3, 4), medicineStaff.createSubTree(Stat.Stamina, 3, 4), 8.5));
		medicineStaff.addToList(medicineStaff.createTree(" of the Wolf", medicineStaff.createSubTree(Stat.Agility, 3, 4), medicineStaff.createSubTree(Stat.Spirit, 3, 4), 12.3));
		list.add(medicineStaff);
	}
	
	private static void fillMagusLongStaff() {
		int id = 15276;
		MultiBonus magusLongStaff = new MultiBonus("Magus Long Staff", id);
		magusLongStaff.addToList(magusLongStaff.createTree(" of Arcane Wrath", magusLongStaff.createSubTree(Stat.ArcaneSpellDamage, 36, 37), null, 5.4));
		magusLongStaff.addToList(magusLongStaff.createTree(" of Fiery Wrath", magusLongStaff.createSubTree(Stat.FireSpellDamage, 36, 37), null, 3.7));
		magusLongStaff.addToList(magusLongStaff.createTree(" of Frozen Wrath", magusLongStaff.createSubTree(Stat.FrostSpellDamage, 36, 37), null, 2.3));
		magusLongStaff.addToList(magusLongStaff.createTree(" of Healing", magusLongStaff.createSubTree(Stat.SpellPower, 16, 30), null, 6.1));
		magusLongStaff.addToList(magusLongStaff.createTree(" of Intellect", magusLongStaff.createSubTree(Stat.Intellect, 25, 26), null, 3.9));
		magusLongStaff.addToList(magusLongStaff.createTree(" of Nature's Wrath", magusLongStaff.createSubTree(Stat.NatureSpellDamage, 36, 37), null, 5.2));
		magusLongStaff.addToList(magusLongStaff.createTree(" of Power", magusLongStaff.createSubTree(Stat.AttackPower, 50, 52), null, 2.1));
		magusLongStaff.addToList(magusLongStaff.createTree(" of Shadow Wrath", magusLongStaff.createSubTree(Stat.ShadowSpellDamage, 36, 37), null, 1.8));
		magusLongStaff.addToList(magusLongStaff.createTree(" of Spirit", magusLongStaff.createSubTree(Stat.Spirit, 25, 26), null, 5.2));
		magusLongStaff.addToList(magusLongStaff.createTree(" of Stamina", magusLongStaff.createSubTree(Stat.Stamina, 25, 26), null, 4.4));
		
		magusLongStaff.addToList(magusLongStaff.createTree(" of the Bear", magusLongStaff.createSubTree(Stat.Stamina, 16, 17), magusLongStaff.createSubTree(Stat.Strength, 16, 17), 9.4));
		magusLongStaff.addToList(magusLongStaff.createTree(" of the Boar", magusLongStaff.createSubTree(Stat.Spirit, 16, 17), magusLongStaff.createSubTree(Stat.Strength, 16, 17), 9.9));
		magusLongStaff.addToList(magusLongStaff.createTree(" of the Eagle", magusLongStaff.createSubTree(Stat.Intellect, 16, 17), magusLongStaff.createSubTree(Stat.Stamina, 16, 17), 6.1));
		magusLongStaff.addToList(magusLongStaff.createTree(" of the Monkey", magusLongStaff.createSubTree(Stat.Agility, 16, 17), magusLongStaff.createSubTree(Stat.Stamina, 16, 17), 8.5));
		magusLongStaff.addToList(magusLongStaff.createTree(" of the Owl", magusLongStaff.createSubTree(Stat.Intellect, 16, 17), magusLongStaff.createSubTree(Stat.Spirit, 16, 17), 7.5));
		magusLongStaff.addToList(magusLongStaff.createTree(" of the Whale", magusLongStaff.createSubTree(Stat.Spirit, 16, 17), magusLongStaff.createSubTree(Stat.Stamina, 16, 17), 8.9));
		magusLongStaff.addToList(magusLongStaff.createTree(" of the Wolf", magusLongStaff.createSubTree(Stat.Agility, 16, 17), magusLongStaff.createSubTree(Stat.Spirit, 16, 17), 9.7));
		list.add(magusLongStaff);
	}
	
	private static void fillMagicianStaff() {
		int id = 2077;
		MultiBonus magicianStaff = new MultiBonus("Magician Staff", id);
		magicianStaff.addToList(magicianStaff.createTree(" of Arcane Wrath", magicianStaff.createSubTree(Stat.ArcaneSpellDamage, 9, 16), null, 5.8));
		magicianStaff.addToList(magicianStaff.createTree(" of Fiery Wrath", magicianStaff.createSubTree(Stat.FireSpellDamage, 9, 16), null, 2.7));
		magicianStaff.addToList(magicianStaff.createTree(" of Frozen Wrath", magicianStaff.createSubTree(Stat.FrostSpellDamage, 14, 16), null, 2.2));
		magicianStaff.addToList(magicianStaff.createTree(" of Healing", magicianStaff.createSubTree(Stat.SpellPower, 7, 13), null, 4.6));
		magicianStaff.addToList(magicianStaff.createTree(" of Intellect", magicianStaff.createSubTree(Stat.Intellect, 10, 11), null, 3.4));
		magicianStaff.addToList(magicianStaff.createTree(" of Nature's Wrath", magicianStaff.createSubTree(Stat.NatureSpellDamage, 9, 16), null, 6.0));
		magicianStaff.addToList(magicianStaff.createTree(" of Power", magicianStaff.createSubTree(Stat.AttackPower, 12, 22), null, 2.0));
		magicianStaff.addToList(magicianStaff.createTree(" of Shadow Wrath", magicianStaff.createSubTree(Stat.ShadowSpellDamage, 14, 16), null, 1.6));
		magicianStaff.addToList(magicianStaff.createTree(" of Spirit", magicianStaff.createSubTree(Stat.Spirit, 10, 11), null, 6.0));
		magicianStaff.addToList(magicianStaff.createTree(" of Stamina", magicianStaff.createSubTree(Stat.Stamina, 10, 11), null, 4.0));
		
		magicianStaff.addToList(magicianStaff.createTree(" of the Bear", magicianStaff.createSubTree(Stat.Stamina, 6, 7), magicianStaff.createSubTree(Stat.Strength, 6, 7), 9.2));
		magicianStaff.addToList(magicianStaff.createTree(" of the Boar", magicianStaff.createSubTree(Stat.Spirit, 6, 7), magicianStaff.createSubTree(Stat.Strength, 6, 7), 12.1));
		magicianStaff.addToList(magicianStaff.createTree(" of the Eagle", magicianStaff.createSubTree(Stat.Intellect, 6, 7), magicianStaff.createSubTree(Stat.Stamina, 6, 7), 4.9));
		magicianStaff.addToList(magicianStaff.createTree(" of the Monkey", magicianStaff.createSubTree(Stat.Agility, 6, 7), magicianStaff.createSubTree(Stat.Stamina, 6, 7), 8.0));
		magicianStaff.addToList(magicianStaff.createTree(" of the Owl", magicianStaff.createSubTree(Stat.Intellect, 6, 7), magicianStaff.createSubTree(Stat.Spirit, 6, 7), 7.1));
		magicianStaff.addToList(magicianStaff.createTree(" of the Whale", magicianStaff.createSubTree(Stat.Spirit, 6, 7), magicianStaff.createSubTree(Stat.Stamina, 6, 7), 9.4));
		magicianStaff.addToList(magicianStaff.createTree(" of the Wolf", magicianStaff.createSubTree(Stat.Agility, 6, 7), magicianStaff.createSubTree(Stat.Spirit, 6, 7), 11.4));
		list.add(magicianStaff);
	}
	
	private static void fillDwarvenMagestaff() {
		int id = 2072;
		MultiBonus dwarvenMagestaff = new MultiBonus("Dwarven Magestaff", id);
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of Arcane Wrath", dwarvenMagestaff.createSubTree(Stat.ArcaneSpellDamage, 7, 14), null, 5.3));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of Fiery Wrath", dwarvenMagestaff.createSubTree(Stat.FireSpellDamage, 7, 14), null, 2.9));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of Frozen Wrath", dwarvenMagestaff.createSubTree(Stat.FrostSpellDamage, 13, 14), null, 2.0));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of Healing", dwarvenMagestaff.createSubTree(Stat.SpellPower, 6, 12), null, 4.4));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of Intellect", dwarvenMagestaff.createSubTree(Stat.Intellect, 9, 10), null, 3.3));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of Nature's Wrath", dwarvenMagestaff.createSubTree(Stat.NatureSpellDamage, 7, 14), null, 5.6));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of Power", dwarvenMagestaff.createSubTree(Stat.AttackPower, 10, 20), null, 2.2));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of Shadow Wrath", dwarvenMagestaff.createSubTree(Stat.ShadowSpellDamage, 13, 14), null, 1.5));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of Spirit", dwarvenMagestaff.createSubTree(Stat.Spirit, 9, 10), null, 6.0));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of Stamina", dwarvenMagestaff.createSubTree(Stat.Stamina, 9, 10), null, 4.4));
		
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of the Bear", dwarvenMagestaff.createSubTree(Stat.Stamina, 5, 6), dwarvenMagestaff.createSubTree(Stat.Strength, 5, 6), 9.4));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of the Boar", dwarvenMagestaff.createSubTree(Stat.Spirit, 5, 6), dwarvenMagestaff.createSubTree(Stat.Strength, 5, 6), 12.0));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of the Eagle", dwarvenMagestaff.createSubTree(Stat.Intellect, 5, 6), dwarvenMagestaff.createSubTree(Stat.Stamina, 5, 6), 5.3));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of the Monkey", dwarvenMagestaff.createSubTree(Stat.Agility, 5, 6), dwarvenMagestaff.createSubTree(Stat.Stamina, 5, 6), 8.4));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of the Owl", dwarvenMagestaff.createSubTree(Stat.Intellect, 5, 6), dwarvenMagestaff.createSubTree(Stat.Spirit, 5, 6), 7.0));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of the Whale", dwarvenMagestaff.createSubTree(Stat.Spirit, 5, 6), dwarvenMagestaff.createSubTree(Stat.Stamina, 5, 6), 9.3));
		dwarvenMagestaff.addToList(dwarvenMagestaff.createTree(" of the Wolf", dwarvenMagestaff.createSubTree(Stat.Agility, 5, 6), dwarvenMagestaff.createSubTree(Stat.Spirit, 5, 6), 11.2));
		list.add(dwarvenMagestaff);
	}
	
	private static void fillDivinerLongStaff() {
		int id = 15274;
		MultiBonus divinerLongStaff = new MultiBonus("Diviner Long Staff", id);
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of Arcane Wrath", divinerLongStaff.createSubTree(Stat.ArcaneSpellDamage, 31, 33), null, 5.4));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of Fiery Wrath", divinerLongStaff.createSubTree(Stat.FireSpellDamage, 31, 33), null, 3.3));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of Frozen Wrath", divinerLongStaff.createSubTree(Stat.FrostSpellDamage, 31, 33), null, 2.2));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of Healing", divinerLongStaff.createSubTree(Stat.SpellPower, 26, 27), null, 5.0));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of Intellect", divinerLongStaff.createSubTree(Stat.Intellect, 22, 23), null, 3.3));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of Nature's Wrath", divinerLongStaff.createSubTree(Stat.NatureSpellDamage, 19, 33), null, 5.4));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of Power", divinerLongStaff.createSubTree(Stat.AttackPower, 24, 46), null, 2.0));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of Shadow Wrath", divinerLongStaff.createSubTree(Stat.ShadowSpellDamage, 31, 33), null, 1.4));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of Spirit", divinerLongStaff.createSubTree(Stat.Spirit, 22, 23), null, 5.7));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of Stamina", divinerLongStaff.createSubTree(Stat.Stamina, 22, 23), null, 4.4));
		
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of the Bear", divinerLongStaff.createSubTree(Stat.Stamina, 14, 15), divinerLongStaff.createSubTree(Stat.Strength, 14, 15), 9.1));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of the Boar", divinerLongStaff.createSubTree(Stat.Spirit, 14, 15), divinerLongStaff.createSubTree(Stat.Strength, 14, 15), 11.7));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of the Eagle", divinerLongStaff.createSubTree(Stat.Intellect, 14, 15), divinerLongStaff.createSubTree(Stat.Stamina, 14, 15), 4.8));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of the Monkey", divinerLongStaff.createSubTree(Stat.Agility, 14, 15), divinerLongStaff.createSubTree(Stat.Stamina, 14, 15), 7.8));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of the Owl", divinerLongStaff.createSubTree(Stat.Intellect, 14, 15), divinerLongStaff.createSubTree(Stat.Spirit, 14, 15), 7.2));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of the Whale", divinerLongStaff.createSubTree(Stat.Spirit, 14, 15), divinerLongStaff.createSubTree(Stat.Stamina, 14, 15), 9.9));
		divinerLongStaff.addToList(divinerLongStaff.createTree(" of the Wolf", divinerLongStaff.createSubTree(Stat.Agility, 14, 15), divinerLongStaff.createSubTree(Stat.Spirit, 14, 15), 11.1));
		list.add(divinerLongStaff);
	}
	
	private static void fillAcrobaticStaff() {
		int id = 3185;
		MultiBonus acrobaticStaff = new MultiBonus("Acrobatic Staff", id);
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of Arcane Wrath", acrobaticStaff.createSubTree(Stat.ArcaneSpellDamage, 19, 20), null, 5.7));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of Fiery Wrath", acrobaticStaff.createSubTree(Stat.FireSpellDamage, 19, 20), null, 2.9));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of Frozen Wrath", acrobaticStaff.createSubTree(Stat.FrostSpellDamage, 19, 20), null, 2.0));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of Healing", acrobaticStaff.createSubTree(Stat.SpellPower, 8, 16), null, 4.7));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of Intellect", acrobaticStaff.createSubTree(Stat.Intellect, 13, 14), null, 3.1));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of Nature's Wrath", acrobaticStaff.createSubTree(Stat.NatureSpellDamage, 11, 20), null, 5.9));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of Power", acrobaticStaff.createSubTree(Stat.AttackPower, 16, 28), null, 2.1));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of Shadow Wrath", acrobaticStaff.createSubTree(Stat.ShadowSpellDamage, 19, 20), null, 1.5));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of Spirit", acrobaticStaff.createSubTree(Stat.Spirit, 13, 14), null, 6.2));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of Stamina", acrobaticStaff.createSubTree(Stat.Stamina, 13, 14), null, 3.9));
		
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of the Bear", acrobaticStaff.createSubTree(Stat.Stamina, 8, 9), acrobaticStaff.createSubTree(Stat.Strength, 8, 9), 8.7));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of the Boar", acrobaticStaff.createSubTree(Stat.Spirit, 8, 9), acrobaticStaff.createSubTree(Stat.Strength, 8, 9), 13.0));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of the Eagle", acrobaticStaff.createSubTree(Stat.Intellect, 8, 9), acrobaticStaff.createSubTree(Stat.Stamina, 8, 9), 4.2));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of the Monkey", acrobaticStaff.createSubTree(Stat.Agility, 8, 9), acrobaticStaff.createSubTree(Stat.Stamina, 8, 9), 7.5));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of the Owl", acrobaticStaff.createSubTree(Stat.Intellect, 8, 9), acrobaticStaff.createSubTree(Stat.Spirit, 8, 9), 6.8));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of the Whale", acrobaticStaff.createSubTree(Stat.Spirit, 8, 9), acrobaticStaff.createSubTree(Stat.Stamina, 8, 9), 9.5));
		acrobaticStaff.addToList(acrobaticStaff.createTree(" of the Wolf", acrobaticStaff.createSubTree(Stat.Agility, 8, 9), acrobaticStaff.createSubTree(Stat.Spirit, 8, 9), 12.1));
		list.add(acrobaticStaff);
	}
}
