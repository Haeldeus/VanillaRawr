package db.random.armor.cloth;

import java.util.ArrayList;

import util.MultiBonus;

public class Wrist {

	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		20690, 11766, 13409, 9937, 14291, 14260, 14301, 14166, 14311, 9846, 10096, 14240, 9821, 
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
		System.out.println(list.get(0));
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