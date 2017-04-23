package db.weapon.ranged;

public class Wand {

	private static Object[][] wands = {
		{19130, "INV_Wand_01", "Cold Snap"},
		{17077, "INV_Staff_13", "Crimson Shocker"},
		{22821, "INV_Wand_1H_Stratholme_D_02", "Doomfinger"},
		{19367, "INV_Wand_11", "Dragon's Touch"},
		{19435, "INV_Wand_06", "Essence Gatherer"},
		{19927, "INV_Wand_06", "Mar'li's Touch"},
		{19861, "INV_Wand_09", "Touch of Chaos"},
		{22820, "INV_Wand_1H_Stratholme_D_01", "Wand of Fates"},
		{21603, "INV_Wand_06", "Wand of Qiraji Nobility"},
		{23009, "INV_Wand_1H_Stratholme_D_01", "Wand of the Whispering Dead"},
		{21801, "INV_Wand_04", "Antenna of Invigoration"},
		{13534, "INV_Weapon_ShortBlade_18", "Banshee Finger"},
		{13938, "INV_Misc_Bone_TaurenSkull_01", "Bonecreeper Stylus"},
		{5198, "INV_Staff_02", "Cookie's Stirring Rod"},
		{9381, "INV_Staff_17", "Earthen Rod"},
		{5243, "INV_Wand_11", "Firebelcher"},
		{9483, "INV_Torch_Lit", "Flaming Incinerator"},
		{10572, "INV_Wand_01", "Freezing Shard"},
		{7001, "INV_Wand_04", "Gravestone Scepter"},
		{7514, "INV_Wand_05", "Icefury Wand"},
		{13064, "INV_Wand_09", "Jaina's Firestarter"},
		{23177, "INV_Wand_12", "Lady Falther'ess' Finger"},
		{18483, "INV_Wand_05", "Mana Channeling Wand"},
		{7708, "INV_Wand_04", "Necrotic Wand"},
		{11263, "INV_Wand_07", "Nether Force Wand"},
		{17745, "INV_Wand_04", "Noxious Shooter"},
		{18761, "INV_Wand_12", "Oblivion's Touch"},
		{10766, "INV_Wand_03", "Plaguerot Sprig"},
		{11748, "INV_Staff_13", "Pyric Caduceus"},
		{7513, "INV_Wand_09", "Ragefire Wand"},
		{22408, "INV_Wand_07", "Ritssyn's Wand of Bad Mojo"},
		{10836, "INV_Wand_04", "Rod of Corrosion"},
		{12605, "INV_Misc_Bone_ElfSkull_01", "Serpentine Skuller"},
		{13396, "INV_Misc_Bone_ElfSkull_01", "Skul's Ghastly Touch"},
		{12984, "INV_Wand_02", "Skycaller"},
		{20672, "INV_Wand_12", "Sparkling Crystal Wand"},
		{13063, "INV_Staff_02", "Starfaller"},
		{16997, "INV_Wand_05", "Stormrager"},
		{19967, "INV_Wand_05", "Thoughtblighter"},
		{13062, "INV_Staff_02", "Thunderwood"},
		{13004, "INV_Wand_11", "Torch of Austen"},
		{13065, "INV_Wand_09", "Wand of Allistarj"},
		{18338, "INV_Wand_02", "Wand of Arcane Potency"},
		{19108, "INV_Wand_01", "Wand of Biting Cold"},
		{22254, "INV_Wand_02", "Wand of Eternal Light"},
		{20082, "INV_Wand_09", "Woestave"},
		{5212, "INV_Staff_02", "Blazing Wand"},
		{5356, "INV_Spear_01", "Branding Rod"},
		{5249, "INV_Wand_11", "Burning Sliver"},
		{9654, "INV_Wand_07", "Cairnstone Sliver"},
		{16789, "INV_Staff_08", "Captain Rackmore's Tiller"},
		{11860, "INV_Wand_08", "Charged Lightning Rod"},
		{5250, "INV_Staff_02", "Charred Wand"},
		{10704, "INV_Wand_01", "Chillnail Splinter"},
		{5242, "INV_Staff_02", "Cinder Wand"},
		{5244, "INV_Wand_02", "Consecrated Wand"},
		{6806, "INV_Wand_04", "Dancing Flame"},
		{8186, "INV_Wand_06", "Dire Wand"},
		{15282, "INV_Wand_06", "Dragon Finger"},
		{5241, "INV_Staff_02", "Dwarven Flamestick"},
		{5604, "INV_Staff_02", "Elven Wand"},
		{5215, "INV_Wand_11", "Ember Wand"},
		{5246, "INV_Staff_02", "Excavation Rod"},
		{6797, "INV_Wand_03", "Eyepoker"},
		{5069, "INV_Staff_02", "Fire Wand"},
		{8184, "INV_Wand_11", "Firestarter"},
		{6729, "INV_Wand_11", "Fizzle's Zippy Lighter"},
		{5326, "INV_Staff_02", "Flaring Baton"},
		{5248, "INV_Wand_02", "Flash Wand"},
		{15281, "INV_Staff_10", "Glowstar Rod"},
		{4547, "INV_Wand_02", "Gnomish Zapper"},
		{5253, "INV_Wand_11", "Goblin Igniter"},
		{11288, "INV_Staff_07", "Greater Magic Wand"},
		{11290, "INV_Wand_07", "Greater Mystic Wand"},
		{9489, "INV_Wand_05", "Gyromatic Icemaker"},
		{15279, "INV_Wand_07", "Ivory Wand"},
		{15692, "INV_Wand_07", "Kodo Brander"},
		{11287, "INV_Staff_02", "Lesser Magic Wand"},
		{11289, "INV_Staff_02", "Lesser Mystic Wand"},
		{18301, "INV_Wand_06", "Lethtendris's Wand"},
		{15283, "INV_Staff_06", "Lunar Wand"},
		{5818, "INV_Wand_11", "Moonbeam Wand"},
		{15204, "INV_Wand_07", "Moonstone Wand"},
		{19118, "INV_Wand_12", "Nature's Breath"},
		{5207, "INV_Wand_07", "Opaque Wand"},
		{5247, "INV_Staff_07", "Rod of Sorrow"},
		{7607, "INV_Staff_02", "Sable Wand"},
		{5213, "INV_Wand_06", "Scorching Wand"},
		{5071, "INV_Weapon_ShortBlade_09", "Shadow Wand"},
		{8071, "INV_Staff_02", "Sizzle Stick"},
		{16993, "INV_Wand_03", "Smokey's Fireshooter"},
		{12296, "INV_Staff_02", "Spark of the People's Militia"},
		{6677, "INV_Wand_05", "Spellcrafter Wand"},
		{15465, "INV_Wand_07", "Stingshot Wand"},
		{5245, "INV_Staff_07", "Summoner's Wand"},
		{5240, "INV_Staff_02", "Torchlight Wand"},
		{5216, "INV_Wand_06", "Umbral Wand"},
		{5252, "INV_Wand_04", "Wand of Decay"},
		{5214, "INV_Wand_01", "Wand of Eventide"},
		{15280, "INV_Wand_06", "Wizard's Hand"},
		{5239, "INV_Misc_Bone_01", "Blackbone Wand"},
		{5210, "INV_Staff_02", "Burning Wand"},
		{5092, "INV_Staff_02", "Charred Razormane Wand"},
		{5236, "INV_Wand_06", "Combustible Wand"},
		{5211, "INV_Wand_07", "Dusk Wand"},
		{5209, "INV_Staff_02", "Gloom Wand"},
		{5347, "INV_Wand_04", "Pestilent Wand"},
		{5238, "INV_Staff_02", "Pitchwood Wand"},
		{5208, "INV_Wand_06", "Smoldering Wand"}
	};
	
	public static int[] getIDs() {
		int[] res = new int[wands.length];
		for (int i = 0; i < wands.length; i++)
			res[i] = (int)wands[i][0];
		return res;
	}
	
	public static String[] getIcons() {
		String[] res = new String[wands.length];
		for (int i = 0; i < wands.length; i++)
			res[i] = (String)wands[i][1];
		return res;
	}
	
	public static String[] getNames() {
		String[] res = new String[wands.length];
		for (int i = 0; i < wands.length; i++)
			res[i] = (String)wands[i][2];
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
