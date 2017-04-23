package db.weapon.ranged;

public class Gun {

	private static Object[][] guns = {
		{17072, "INV_Weapon_Rifle_09", "Blastershot Launcher"},
		{21272, "INV_Weapon_Rifle_11", "Blessed Qiraji Musket"},
		{18282, "INV_Weapon_Rifle_05", "Core Marksman Rifle"},
		{19368, "INV_Weapon_Rifle_02", "Dragonbreath Hand Cannon"},
		{2099, "INV_Weapon_Rifle_09", "Dwarven Hand Cannon"},
		{18855, "INV_Weapon_Rifle_08", "Grand Marshal's Hand Cannon"},
		{19853, "INV_Weapon_Rifle_10", "Gurubashi Dwarf Destroyer"},
		{18860, "INV_Weapon_Rifle_06", "High Warlord's Street Sweeper"},
		{23557, "INV_Weapon_Rifle_10", "Larvae of the Great Worm"},
		{2100, "INV_Weapon_Rifle_06", "Precisely Calibrated Boomstick"},
		{22656, "INV_Weapon_Rifle_06", "The Purifier"},
		{22810, "INV_Weapon_Rifle_11", "Toxin Injector"},
		{13248, "INV_Weapon_Rifle_06", "Burstshot Harquebus"},
		{7729, "INV_Weapon_Rifle_06", "Chesterfall Musket"},
		{20722, "INV_Weapon_Rifle_03", "Crystal Slugthrower"},
		{16004, "INV_Weapon_Rifle_08", "Dark Iron Rifle"},
		{2098, "INV_Weapon_Rifle_08", "Double-barreled Shotgun"},
		{16007, "INV_Weapon_Rifle_03", "Flawless Arcanite Rifle"},
		{9412, "INV_Weapon_Rifle_07", "Galgann's Fireblaster"},
		{9456, "INV_Weapon_Rifle_02", "Glass Shooter"},
		{13139, "INV_Weapon_Rifle_08", "Guttbuster"},
		{9487, "INV_Weapon_Rifle_06", "Hi-tech Supergun"},
		{11629, "INV_Weapon_Rifle_07", "Houndmaster's Rifle"},
		{13137, "INV_Weapon_Rifle_08", "Ironweaver"},
		{13136, "INV_Weapon_Rifle_08", "Lil Timmy's Peashooter"},
		{17717, "INV_Weapon_Rifle_05", "Megashot Rifle"},
		{9422, "INV_Musket_02", "Shadowforge Bushmaster"},
		{13146, "INV_Weapon_Rifle_08", "Shell Launcher Shotgun"},
		{21800, "INV_Weapon_Rifle_10", "Silithid Husked Launcher"},
		{13138, "INV_Weapon_Rifle_08", "The Silencer"},
		{13380, "INV_Weapon_Rifle_07", "Willey's Portable Howitzer"},
		{18755, "INV_Weapon_Rifle_03", "Xorothian Firestick"},
		{3041, "INV_Weapon_Rifle_05", "'Mage-Eye' Blunderbuss"},
		{3042, "INV_Weapon_Rifle_01", "BKP 'Sparrow' Smallbore"},
		{6798, "INV_Weapon_Rifle_04", "Blasting Hackbut"},
		{15324, "INV_Weapon_Rifle_01", "Burnside Rifle"},
		{4577, "INV_Weapon_Rifle_03", "Compact Shotgun"},
		{2904, "INV_Weapon_Rifle_03", "Daryl's Hunting Rifle"},
		{4369, "INV_Weapon_Rifle_07", "Deadly Blunderbuss"},
		{3567, "INV_Weapon_Rifle_01", "Dwarven Fishing Pole"},
		{8188, "INV_Weapon_Rifle_08", "Explosive Shotgun"},
		{13474, "INV_Weapon_Rifle_04", "Farmer Dalson's Shotgun"},
		{4086, "INV_Weapon_Rifle_07", "Flash Rifle"},
		{3040, "INV_Weapon_Rifle_01", "Hunter's Muzzle Loader"},
		{4372, "INV_Weapon_Rifle_07", "Lovingly Crafted Boomstick"},
		{4111, "INV_Weapon_Rifle_05", "Master Hunter's Rifle"},
		{17687, "INV_Weapon_Rifle_05", "Master Hunter's Rifle"},
		{10508, "INV_Weapon_Rifle_07", "Mithril Blunderbuss"},
		{10510, "INV_Weapon_Rifle_07", "Mithril Heavy-bore Rifle"},
		{4383, "INV_Weapon_Rifle_06", "Moonsight Rifle"},
		{17042, "INV_Weapon_Rifle_01", "Nail Spitter"},
		{15205, "INV_Weapon_Rifle_04", "Owlsight Rifle"},
		{15323, "INV_Weapon_Rifle_01", "Percussion Shotgun"},
		{5309, "INV_Weapon_Rifle_04", "Privateer Musket"},
		{4089, "INV_Weapon_Rifle_03", "Ricochet Blunderbuss"},
		{4362, "INV_Weapon_Rifle_03", "Rough Boomstick"},
		{15325, "INV_Weapon_Rifle_06", "Sharpshooter Harquebus"},
		{4127, "INV_Weapon_Rifle_02", "Shrapnel Blaster"},
		{15691, "INV_Weapon_Rifle_04", "Sidegunner Shottie"},
		{4379, "INV_Weapon_Rifle_07", "Silver-plated Shotgun"},
		{3079, "INV_Weapon_Rifle_01", "Skorn's Rifle"},
		{16992, "INV_Weapon_Rifle_08", "Smokey's Explosive Launcher"},
		{15322, "INV_Weapon_Rifle_01", "Smoothbore Gun"},
		{3430, "INV_Weapon_Rifle_05", "Sniper Rifle"},
		{15995, "INV_Weapon_Rifle_07", "Thorium Rifle"},
		{18460, "INV_Weapon_Rifle_07", "Unsophisticated Hand Cannon"},
		{12446, "INV_Weapon_Rifle_07", "Anvilmar Musket"},
		{3024, "INV_Weapon_Rifle_03", "BKP 2700 'Enforcer'"},
		{3025, "INV_Weapon_Rifle_03", "BKP 42 'Ultra'"},
		{2511, "INV_Weapon_Rifle_04", "Hunter's Boomstick"},
		{8181, "INV_Weapon_Rifle_04", "Hunting Rifle"},
		{3023, "INV_Weapon_Rifle_03", "Large Bore Blunderbuss"},
		{12448, "INV_Weapon_Rifle_07", "Light Hunting Rifle"},
		{2508, "INV_Weapon_Rifle_01", "Old Blunderbuss"},
		{2509, "INV_Weapon_Rifle_02", "Ornate Blunderbuss"},
		{8182, "INV_Weapon_Rifle_04", "Pellet Rifle"},
		{2510, "INV_Weapon_Rifle_07", "Solid Blunderbuss"},
		{2778, "INV_Weapon_Rifle_03", "Cheap Blunderbuss"},
		{2781, "INV_Weapon_Rifle_01", "Dirty Blunderbuss"},
		{3780, "INV_Weapon_Rifle_01", "Long-barreled Musket"},
		{2786, "INV_Weapon_Rifle_01", "Oiled Blunderbuss"},
		{13825, "INV_Weapon_Rifle_01", "Primed Musket"},
		{2774, "INV_Weapon_Rifle_03", "Rust-covered Blunderbuss"},
		{4026, "INV_Weapon_Rifle_01", "Sentinel Musket"},
		{2783, "INV_Weapon_Rifle_01", "Shoddy Blunderbuss"}
	};
	
	public static int[] getIDs() {
		int[] res = new int[guns.length];
		for (int i = 0; i < guns.length; i++)
			res[i] = (int)guns[i][0];
		return res;
	}
	
	public static String[] getIcons() {
		String[] res = new String[guns.length];
		for (int i = 0; i < guns.length; i++)
			res[i] = (String)guns[i][1];
		return res;
	}
	
	public static String[] getNames() {
		String[] res = new String[guns.length];
		for (int i = 0; i < guns.length; i++)
			res[i] = (String)guns[i][2];
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
