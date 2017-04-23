package db.armor.plate;

public class Waist {

	private static Object[][] waists = {
		{16864, "INV_Belt_09", "Belt of Might"},
		{21606, "INV_Belt_34", "Belt of the Fallen Emperor"},
		{23666, "INV_Belt_27", "Belt of the Grand Crusader"},
		{22422, "INV_Belt_27", "Dreadnaught Waistguard"},
		{19392, "INV_Belt_11", "Girdle of the Fallen Crusader"},
		{23219, "INV_Belt_13", "Girdle of the Mentor"},
		{16952, "INV_Belt_27", "Judgement Belt"},
		{16858, "INV_Belt_27", "Lawbringer Belt"},
		{19137, "INV_Belt_29", "Onslaught Girdle"},
		{22431, "INV_Belt_22", "Redemption Girdle"},
		{21598, "INV_Belt_31", "Royal Qiraji Belt"},
		{21692, "INV_Belt_18", "Triad Girdle"},
		{18547, "INV_Belt_31", "Unmelting Ice Girdle"},
		{16960, "INV_Belt_09", "Waistband of Wrath"},
		{19826, "INV_Belt_32", "Zandalar Freethinker's Belt"},
		{19823, "INV_Belt_32", "Zandalar Vindicator's Belt"},
		{10798, "INV_Belt_15", "Atal'alarion's Tusk Ring"},
		{21994, "INV_Belt_34", "Belt of Heroism"},
		{20213, "INV_Belt_13", "Belt of Shrunken Heads"},
		{18702, "INV_Belt_28", "Belt of the Ordained"},
		{21503, "INV_Belt_13", "Belt of the Sand Reaver"},
		{16736, "INV_Belt_34", "Belt of Valor"},
		{13142, "INV_Belt_33", "Brigam Girdle"},
		{14620, "INV_Belt_12", "Deathbone Girdle"},
		{20177, "INV_Belt_14", "Defiler's Lamellar Girdle"},
		{20204, "INV_Belt_14", "Defiler's Plate Girdle"},
		{20205, "INV_Belt_14", "Defiler's Plate Girdle"},
		{20206, "INV_Belt_14", "Defiler's Plate Girdle"},
		{18529, "INV_Belt_18", "Elemental Plate Girdle"},
		{13145, "INV_Belt_27", "Enormous Ogre Belt"},
		{19087, "INV_Belt_35", "Frostwolf Plate Belt"},
		{19051, "INV_Belt_11", "Girdle of the Dawn"},
		{13077, "INV_Belt_32", "Girdle of Uther"},
		{13502, "INV_Belt_23", "Handcrafted Mastersmith Girdle"},
		{22197, "INV_Belt_16", "Heavy Obsidian Belt"},
		{20042, "INV_Belt_14", "Highlander's Lamellar Girdle"},
		{20106, "INV_Belt_14", "Highlander's Lamellar Girdle"},
		{20107, "INV_Belt_14", "Highlander's Lamellar Girdle"},
		{20041, "INV_Belt_14", "Highlander's Plate Girdle"},
		{20124, "INV_Belt_14", "Highlander's Plate Girdle"},
		{20125, "INV_Belt_14", "Highlander's Plate Girdle"},
		{22764, "INV_Belt_21", "Ironvine Belt"},
		{16723, "INV_Belt_11", "Lightforge Belt"},
		{13959, "INV_Belt_13", "Omokk's Girth Restrainer"},
		{13384, "INV_Belt_30", "Rainbow Girdle"},
		{22086, "INV_Belt_11", "Soulforge Belt"},
		{11703, "INV_Belt_16", "Stonewall Girdle"},
		{19091, "INV_Belt_35", "Stormpike Plate Girdle"},
		{20673, "INV_Belt_26", "Abyssal Plate Girdle"},
		{8315, "INV_Belt_18", "Alabaster Plate Girdle"},
		{10788, "INV_Belt_15", "Atal'ai Girdle"},
		{14950, "INV_Belt_13", "Bloodforged Belt"},
		{14906, "INV_Belt_24", "Brutish Belt"},
		{8140, "INV_Belt_14", "Chromite Girdle"},
		{10381, "INV_Belt_13", "Commander's Girdle"},
		{9968, "INV_Belt_11", "Embossed Plate Girdle"},
		{10278, "INV_Belt_04", "Emerald Girdle"},
		{14977, "INV_Belt_24", "Exalted Girdle"},
		{9288, "INV_Belt_03", "Field Plate Girdle"},
		{15709, "INV_Belt_33", "Gearforge Girdle"},
		{14968, "INV_Belt_11", "Glorious Belt"},
		{10088, "INV_Belt_13", "Gothic Plate Girdle"},
		{10243, "INV_Belt_10", "Heavy Lamellar Girdle"},
		{14934, "INV_Belt_12", "Heroic Girdle"},
		{14960, "INV_Belt_29", "High Chief's Belt"},
		{10387, "INV_Belt_28", "Hyperion Girdle"},
		{10370, "INV_Belt_12", "Imbued Plate Girdle"},
		{12424, "INV_Belt_01", "Imperial Plate Belt"},
		{14918, "INV_Belt_17", "Jade Belt"},
		{8159, "INV_Belt_22", "Jouster's Girdle"},
		{14927, "INV_Belt_32", "Lofty Belt"},
		{10206, "INV_Belt_06", "Overlord's Girdle"},
		{10130, "INV_Belt_30", "Revenant Girdle"},
		{14898, "INV_Belt_13", "Saltstone Girdle"},
		{12115, "INV_Belt_34", "Stalwart Clutch"},
		{14847, "INV_Belt_19", "Sunscale Belt"},
		{14827, "INV_Belt_31", "Symbolic Belt"},
		{10166, "INV_Belt_32", "Templar Girdle"},
		{12406, "INV_Belt_30", "Thorium Belt"},
		{14838, "INV_Belt_24", "Tyrant's Belt"},
		{8277, "INV_Belt_19", "Valorous Girdle"},
		{14856, "INV_Belt_22", "Vanguard Girdle"},
		{14943, "INV_Belt_14", "Warbringer's Belt"},
		{14864, "INV_Belt_22", "Warleader's Belt"},
		{8088, "INV_Belt_15", "Platemail Belt"},
		{8081, "INV_Belt_16", "Light Plate Belt"}
	};
	
	public static int[] getIDs() {
		int[] res = new int[waists.length];
		for (int i = 0; i < waists.length; i++)
			res[i] = (int)waists[i][0];
		return res;
	}
	
	public static String[] getIcons() {
		String[] res = new String[waists.length];
		for (int i = 0; i < waists.length; i++)
			res[i] = (String)waists[i][1];
		return res;
	}
	
	public static String[] getNames() {
		String[] res = new String[waists.length];
		for (int i = 0; i < waists.length; i++)
			res[i] = (String)waists[i][2];
		return res;
	}
	
	public static void main(String[] args) {
		int[] t1 = getIDs();
		String[] t2 = getIcons();
		String[] t3 = getNames();
		for (int i = 0; i < t1.length; i++)
			System.out.println(t1[i] + ", " + t2[i] + ", " + t3[i]);
	}
}
