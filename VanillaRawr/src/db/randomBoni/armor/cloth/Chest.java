package db.randomBoni.armor.cloth;

import java.util.ArrayList;

import util.MultiBonus;

public class Chest {

	private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		/*Done*/
		/*ToDo*/9943, 9946, 14120, 14121, 14288, 14297, 14091, 14094, 14267, 14265, 14303, 14306, 
		14172, 14175, 14317, 14308, 9852, 9844, 10102, 10104, 14237, 14244, 6512, 6266, 9826, 
		9819, 10065, 10057, 7353, 7369, 10215, 10218, 14234, 14230, 14328, 14336, 14275, 14277, 
		14216, 14225, 7518, 7517, 9773, 9774, 10143, 10135, 9798, 9791, 14254, 14249, 10254, 
		10246, 10181, 10178, 14109, 14096, 14284, 14287, 14158, 14163, 14192, 14190, 7332, 
		7468, 14326, 14318, 14127, 14133, 9905, 9913, 6609, 6610, 6567, 6569, 9749, 9748, 9874, 
		9884, 14202, 14204, 7429, 7430, 14213, 14215, 14180, 14184, 6538, 6536
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
		
	}
	
	public static void main(String[] args) {
		fill();
	}
}
