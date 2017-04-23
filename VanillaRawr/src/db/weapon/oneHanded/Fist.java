package db.weapon.oneHanded;

public class Fist {

	private static Object[][] fists = {
		{19910, "INV_Weapon_Hand_01", "Arlokk's Grasp"},
		{19365, "INV_Weapon_ShortBlade_27", "Claw of the Black Drake"},
		{23242, "INV_Weapon_Hand_03", "Claw of the Frost Wyrm"},
		{18202, "INV_Misc_MonsterClaw_04", "Eskhandar's Left Claw"},
		{18203, "INV_Misc_MonsterClaw_04", "Eskhandar's Right Claw"},
		{18847, "Ability_Rogue_Rupture", "Grand Marshal's Left Hand Blade"},
		{18843, "INV_Weapon_ShortBlade_07", "Grand Marshal's Right Hand Blade"},
		{18848, "INV_Misc_MonsterClaw_04", "High Warlord's Left Claw"},
		{18844, "INV_Misc_MonsterClaw_03", "High Warlord's Right Claw"},
		{21673, "INV_Misc_MonsterClaw_03", "Silithid Claw"},
		{19896, "INV_Weapon_Hand_01", "Thekal's Grasp"},
		{11744, "INV_Gauntlets_11", "Bloodfist"},
		{17738, "Ability_Whirlwind", "Claw of Celebras"},
		{13399, "INV_Gauntlets_11", "Gargoyle Shredder Talons"},
		{13198, "INV_Gauntlets_11", "Hurd Smasher"},
		{2942, "INV_Gauntlets_04", "Iron Knuckles"},
		{22317, "INV_Gauntlets_11", "Lefty's Brass Knuckle"},
		{11603, "Ability_Whirlwind", "Vilerend Slicer"},
		{22404, "INV_Weapon_ShortBlade_16", "Willey's Back Scratcher"},
		{18462, "INV_Gauntlets_13", "Jagged Bone Fist"},
		{11743, "INV_Gauntlets_11", "Rockfist"},
		{11863, "Ability_Whirlwind", "White Bone Shredder"},
		{7683, "INV_Gauntlets_11", "Bloody Brass Knuckles"},
		{15909, "INV_Gauntlets_07", "Left-Handed Blades"},
		{15906, "INV_Gauntlets_04", "Left-Handed Brass Knuckles"},
		{15907, "INV_Gauntlets_07", "Left-Handed Claw"},
		{15904, "INV_Gauntlets_07", "Right-Handed Blades"},
		{15905, "INV_Gauntlets_04", "Right-Handed Brass Knuckles"},
		{15903, "INV_Gauntlets_07", "Right-Handed Claw"}
	};
	
	public static int[] getIDs() {
		int[] res = new int[fists.length];
		for (int i = 0; i < fists.length; i++)
			res[i] = (int)fists[i][0];
		return res;
	}
	
	public static String[] getIcons() {
		String[] res = new String[fists.length];
		for (int i = 0; i < fists.length; i++)
			res[i] = (String)fists[i][1];
		return res;
	}
	
	public static String[] getNames() {
		String[] res = new String[fists.length];
		for (int i = 0; i < fists.length; i++)
			res[i] = (String)fists[i][2];
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
