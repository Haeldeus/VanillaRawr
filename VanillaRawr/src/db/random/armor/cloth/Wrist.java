package db.random.armor.cloth;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class Wrist {

	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		/*Done*/20690, 11766, 
		/*ToDo*/13409, 9937, 14291, 14260, 14301, 14166, 14311, 9846, 10096, 14240, 9821, 
		10059, 7355, 10213, 14226, 14330, 14268, 14221, 7525, 9768, 10136, 9793, 14248, 10248, 
		10173, 14279, 14160, 14187, 7475, 14320, 14122, 9909, 6613, 6563, 9879, 14197, 7437, 
		14206, 14177, 6543, 
	};
	
	public static ArrayList<MultiBonus> getList() {
		if (list == null)
			fill();
		return list;
	}
	
	public static int[] getIDs() {
		return ids;
	}
	
	public static void fill() {
		list = new ArrayList<MultiBonus>();
		fillAbyssalClothWristbands();
		fillFlameweaveCuffs();
		System.out.println(list.get(1));
	}

	private static void fillFlameweaveCuffs() {
		int id = 11766;
		MultiBonus flameweaveCuffs = new MultiBonus("Flameweave Cuffs", id);
		flameweaveCuffs.addDefaultBonus(Stat.FireResist, 10);
		flameweaveCuffs.createArcaneWrathTree(21, 21, 3.5);
		flameweaveCuffs.createFieryWrathTree(21, 21, 5.4);
		flameweaveCuffs.createFireResistanceTree(15, 15, 0.3);
		flameweaveCuffs.createFrostResistanceTree(15, 15, 0.3);
		flameweaveCuffs.createFrozenWrathTree(21, 21, 3.7);
		flameweaveCuffs.createHealingTree(18, 18, 5.7);
		flameweaveCuffs.createIntellectTree(15, 15, 7.7);
		flameweaveCuffs.createShadowWrathTree(21, 21, 4.1);
		flameweaveCuffs.createSpiritTree(15, 15, 7.9);
		flameweaveCuffs.createStaminaTree(15, 15, 5.7);
		flameweaveCuffs.createEagleTree(9, 10, 15.6);
		flameweaveCuffs.createOwlTree(9, 10, 24.7);
		flameweaveCuffs.createWhaleTree(9, 10, 15.5);
		list.add(flameweaveCuffs);
	}

	private static void fillAbyssalClothWristbands() {
		int id = 20690;
		MultiBonus abyssalClothWristbands = new MultiBonus("Abyssal Cloth Wristbands", id);
		abyssalClothWristbands.createRestorationTree(11, 14, 4, 46.5);
		abyssalClothWristbands.createSorceryTree(11, 11, 14, 53.5);
		list.add(abyssalClothWristbands);
	}
	
	public static void main(String[] args) {
		fill();
	}
}