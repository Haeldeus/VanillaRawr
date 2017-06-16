package db.random.armor.cloth;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class Chest {

	private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

	private static ArrayList<MultiBonus> list;
	
	private static int[] ids = {
		/*Done*/9943, 9946,
		/*ToDo*/14120, 14121, 14288, 14297, 14091, 14094, 14267, 14265, 14303, 14306, 
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
		list = new ArrayList<MultiBonus>();
		fillAbjurersRobe();
		fillAbjurersTunic();
		fillAboriginalRobe();
		System.out.println(list.get(0));
		System.out.println("--------------");
		System.out.println(list.get(1));
		System.out.println("--------------");
	}
	
	private static void fillAboriginalRobe() {
		int id = 14120;
		MultiBonus aboriginalRobe = new MultiBonus("Aboriginal Robe", id);
	}
	
	private static void fillAbjurersTunic() {
		int id = 9946;
		MultiBonus abjurersTunic = new MultiBonus("Abjurer's Tunic", id);
		abjurersTunic.createArcaneResistanceTree(22, 23, 0.3);
		abjurersTunic.createArcaneWrathTree(31, 33, 9.5);
		abjurersTunic.createFireResistanceTree(22, 23, 0.4);
		abjurersTunic.createFrostResistanceTree(22, 23, 0.3);
		abjurersTunic.createFrozenWrathTree(31, 33, 7.2);
		abjurersTunic.createIntellectTree(22, 23, 6.6);
		abjurersTunic.createNatureResistanceTree(22, 23, 0.3);
		abjurersTunic.createShadowResistanceTree(22, 23, 0.4);
		abjurersTunic.createShadowWrathTree(31, 33, 5.4);
		abjurersTunic.createSpiritTree(22, 23, 7.7);
		abjurersTunic.createStaminaTree(22, 23, 6.1);
		
		abjurersTunic.createEagleTree(14, 15, 14.7);
		abjurersTunic.createOwlTree(14, 15, 23.5);
		abjurersTunic.createWhaleTree(14, 15, 17.4);
		list.add(abjurersTunic);
	}

	private static void fillAbjurersRobe() {
		int id = 9943;
		MultiBonus abjurersRobe = new MultiBonus("Abjurer's Robe", id);
		abjurersRobe.createArcaneResistanceTree(22, 23, 0.3);
		abjurersRobe.createArcaneWrathTree(31, 33, 10.7);
		abjurersRobe.createFireResistanceTree(22, 23, 0.3);
		abjurersRobe.createFrostResistanceTree(22, 23, 0.4);
		abjurersRobe.createFrozenWrathTree(31, 33, 8.1);
		abjurersRobe.createIntellectTree(22, 23, 6.7);
		abjurersRobe.createNatureResistanceTree(22, 23, 0.4);
		abjurersRobe.createShadowResistanceTree(22, 23, 0.3);
		abjurersRobe.createShadowWrathTree(31, 33, 5.5);
		abjurersRobe.createSpiritTree(22, 23, 9.3);
		abjurersRobe.createStaminaTree(22, 23, 6.1);
		
		abjurersRobe.createEagleTree(14, 15, 11.5);
		abjurersRobe.createOwlTree(14, 15, 23.6);
		abjurersRobe.createWhaleTree(14, 15, 16.9);
		list.add(abjurersRobe);
	}

	public static void main(String[] args) {
		fill();
	}
}
