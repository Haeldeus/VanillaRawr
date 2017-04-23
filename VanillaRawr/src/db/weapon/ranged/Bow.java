package db.weapon.ranged;

public class Bow {

	private static Object[][] bows = {
		{2825, "INV_Weapon_Bow_09", "Bow of Searing Arrows"},
		{21478, "INV_Weapon_Bow_13", "Bow of Taut Sinew"},
		{18833, "INV_Weapon_Bow_12", "Grand Marshal's Bullseye"},
		{19350, "INV_Weapon_Bow_09", "Heartstriker"},
		{18835, "INV_Weapon_Bow_08", "High Warlord's Recurve"},
		{21616, "INV_Weapon_Bow_14", "Huhuran's Stinger"},
		{2824, "INV_Weapon_Bow_12", "Hurricane"},
		{20038, "INV_Waepon_Bow_ZulGrub_D_01", "Mandokir's Sting"},
		{18713, "INV_Weapon_Bow_01", "Rhok'delar, Longbow of the Ancient Keepers"},
		{20488, "INV_Weapon_Bow_01", "Rhok'delar, Longbow of the Ancient Keepers DEP"},
		{22811, "INV_Weapon_Bow_13", "Soulstring"},
		{17069, "INV_Weapon_Bow_08", "Striker's Mark"},
		{18680, "INV_Weapon_Bow_08", "Ancient Bone Bow"},
		{20663, "INV_Weapon_Bow_10", "Deep Strike Bow"},
		{13023, "INV_Weapon_Bow_11", "Eaglehorn Long Bow"},
		{16996, "INV_Weapon_Bow_04", "Gorewood Bow"},
		{13022, "INV_Weapon_Bow_11", "Gryphonwing Long Bow"},
		{13019, "INV_Weapon_Bow_11", "Harpyclaw Short Bow"},
		{19993, "INV_Waepon_Bow_ZulGrub_D_02", "Hoodoo Hunting Bow"},
		{11628, "INV_Weapon_Bow_04", "Houndmaster's Bow"},
		{22318, "INV_Weapon_Bow_12", "Malgen's Long Bow"},
		{9426, "INV_Weapon_Bow_01", "Monolithic Bow"},
		{13021, "INV_Weapon_Bow_08", "Needle Threader"},
		{6696, "INV_Weapon_Bow_12", "Nightstalker Bow"},
		{19558, "INV_Weapon_Bow_06", "Outrider's Bow"},
		{19559, "INV_Weapon_Bow_06", "Outrider's Bow"},
		{19560, "INV_Weapon_Bow_06", "Outrider's Bow"},
		{19561, "INV_Weapon_Bow_06", "Outrider's Bow"},
		{20437, "INV_Weapon_Bow_06", "Outrider's Bow"},
		{19562, "INV_Weapon_Bow_02", "Outrunner's Bow"},
		{19563, "INV_Weapon_Bow_02", "Outrunner's Bow"},
		{19564, "INV_Weapon_Bow_02", "Outrunner's Bow"},
		{19565, "INV_Weapon_Bow_02", "Outrunner's Bow"},
		{20438, "INV_Weapon_Bow_02", "Outrunner's Bow"},
		{10567, "INV_Weapon_Bow_01", "Quillshooter"},
		{3021, "INV_Weapon_Bow_11", "Ranger Bow"},
		{12653, "INV_Weapon_Bow_08", "Riphook"},
		{18323, "INV_Weapon_Bow_03", "Satyr's Bow"},
		{18729, "INV_Weapon_Bow_12", "Screeching Bow"},
		{13020, "INV_Weapon_Bow_11", "Skystriker Bow"},
		{10624, "INV_Weapon_Bow_08", "Stinging Bow"},
		{6469, "INV_Weapon_Bow_10", "Venomstrike"},
		{17753, "INV_Weapon_Bow_03", "Verdant Keeper's Aim"},
		{15285, "INV_Weapon_Bow_03", "Archer's Longbow"},
		{15289, "INV_Weapon_Bow_06", "Archstrike Bow"},
		{15288, "INV_Weapon_Bow_07", "Blasthorn Bow"},
		{3742, "INV_Weapon_Bow_02", "Bow of Plunder"},
		{6739, "INV_Weapon_Bow_08", "Cliffrunner's Aim"},
		{15287, "INV_Weapon_Bow_02", "Crusader Bow"},
		{2903, "INV_Weapon_Bow_02", "Daryl's Hunting Bow"},
		{11305, "INV_Weapon_Bow_07", "Dense Shortbow"},
		{11304, "INV_Weapon_Bow_02", "Fine Longbow"},
		{11303, "INV_Weapon_Bow_07", "Fine Shortbow"},
		{15291, "INV_Weapon_Bow_08", "Harpy Needler"},
		{15296, "INV_Weapon_Bow_12", "Hawkeye Bow"},
		{3036, "INV_Weapon_Bow_12", "Heavy Shortbow"},
		{19114, "INV_Weapon_Bow_08", "Highland Bow"},
		{8180, "INV_Weapon_Bow_03", "Hunting Bow"},
		{4576, "INV_Weapon_Bow_07", "Light Bow"},
		{15284, "INV_Weapon_Bow_01", "Long Battle Bow"},
		{15286, "INV_Weapon_Bow_10", "Long Redwood Bow"},
		{5817, "INV_Weapon_Bow_01", "Lunaris Bow"},
		{11307, "INV_Weapon_Bow_01", "Massive Longbow"},
		{4110, "INV_Weapon_Bow_11", "Master Hunter's Bow"},
		{17686, "INV_Weapon_Bow_11", "Master Hunter's Bow"},
		{3078, "INV_Weapon_Bow_04", "Naga Heartpiercer"},
		{18482, "INV_Weapon_Bow_05", "Ogre Toothpick Shooter"},
		{5346, "INV_Weapon_Bow_08", "Orcish Battle Bow"},
		{8183, "INV_Weapon_Bow_04", "Precision Bow"},
		{15295, "INV_Weapon_Bow_10", "Quillfire Bow"},
		{3493, "INV_Weapon_Bow_03", "Raptor's End"},
		{4474, "INV_Weapon_Bow_10", "Ravenwood Bow"},
		{20646, "INV_Weapon_Bow_03", "Sandstrider's Mark"},
		{3039, "INV_Weapon_Bow_03", "Short Ash Bow"},
		{15294, "INV_Weapon_Bow_07", "Siege Bow"},
		{11306, "INV_Weapon_Bow_07", "Sturdy Recurve"},
		{11308, "INV_Weapon_Bow_07", "Sylvan Shortbow"},
		{16622, "INV_Weapon_Bow_06", "Thornflinger"},
		{4087, "INV_Weapon_Bow_10", "Trueshot Bow"},
		{13175, "INV_Weapon_Bow_10", "Voone's Twitchbow"},
		{3037, "INV_Weapon_Bow_12", "Whipwood Recurve Bow"},
		{5596, "INV_Weapon_Bow_01", "Ashwood Bow"},
		{9400, "INV_Weapon_Bow_11", "Baelog's Shortbow"},
		{8179, "INV_Weapon_Bow_05", "Cadet's Bow"},
		{3027, "INV_Weapon_Bow_01", "Heavy Recurve Bow"},
		{4931, "INV_Weapon_Bow_05", "Hickory Shortbow"},
		{2506, "INV_Weapon_Bow_11", "Hornwood Recurve Bow"},
		{2507, "INV_Weapon_Bow_01", "Laminated Recurve Bow"},
		{2505, "INV_Weapon_Bow_02", "Polished Shortbow"},
		{12449, "INV_Weapon_Bow_02", "Primitive Bow"},
		{3026, "INV_Weapon_Bow_02", "Reinforced Bow"},
		{12447, "INV_Weapon_Bow_02", "Thistlewood Bow"},
		{2504, "INV_Weapon_Bow_05", "Worn Shortbow"},
		{4025, "INV_Weapon_Bow_02", "Balanced Long Bow"},
		{2773, "INV_Weapon_Bow_05", "Cracked Shortbow"},
		{2777, "INV_Weapon_Bow_05", "Feeble Shortbow"},
		{2780, "INV_Weapon_Bow_02", "Light Hunting Bow"},
		{2782, "INV_Weapon_Bow_03", "Mishandled Recurve Bow"},
		{13824, "INV_Weapon_Bow_02", "Recurve Long Bow"},
		{2785, "INV_Weapon_Bow_05", "Stiff Recurve Bow"},
		{3778, "INV_Weapon_Bow_02", "Taut Compound Bow"}
	};
	
	public static int[] getIDs() {
		int[] res = new int[bows.length];
		for (int i = 0; i < bows.length; i++)
			res[i] = (int)bows[i][0];
		return res;
	}
	
	public static String[] getIcons() {
		String[] res = new String[bows.length];
		for (int i = 0; i < bows.length; i++)
			res[i] = (String)bows[i][1];
		return res;
	}
	
	public static String[] getNames() {
		String[] res = new String[bows.length];
		for (int i = 0; i < bows.length; i++)
			res[i] = (String)bows[i][2];
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
