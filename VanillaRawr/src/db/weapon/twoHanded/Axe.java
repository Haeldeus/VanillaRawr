package db.weapon.twohanded;

public class Axe {
  
  private static Object[][] axes = {
    {1263, "INV_Weapon_Halberd_10", "Brain Hacker"},
    {21134, "INV_Axe_24", "Dark Edge of Insanity"},
    {19354, "INV_Axe_21", "Draconic Avenger"},
    {19353, "INV_Axe_10", "Drake Talon Cleaver"},
    {870, "INV_Axe_02", "Fiery War Axe"},
    {18830, "INV_Axe_10", "Grand Marshal's Sunderer"},
    {18831, "INV_Axe_21", "High Warlord's Battle Axe"},
    {2291, "INV_Axe_15", "Kang the Decapitator"},
    {21856, "INV_Axe_09", "Neretzek, The Blood Drinker"},
    {19169, "INV_Axe_12", "Nightfall"},
    {22815, "INV_Axe_22", "Severance"},
    {17104, "INV_Axe_09", "Spinal Reaper"},
    {18538, "INV_Axe_10", "Treant's Bane"},
    {11816, "INV_Weapon_Halberd_06", "Angerforge's Battle Axe"},
    {12784, "INV_Axe_09", "Arcanite Reaper"},
    {7753, "INV_Axe_10", "Bloodspiller"},
    {5423, "INV_Axe_17", "Boahn's Fang"},
    {6830, "INV_Axe_04", "Bonebiter"},
    {2299, "INV_Axe_02", "Burning War Axe"},
    {6687, "INV_Weapon_Halbard_01", "Corpsemaker"},
    {11607, "INV_Weapon_Halberd_02", "Dark Iron Sunderer"},
    {11931, "INV_Axe_22", "Dreadforge Retaliator"},
    {13018, "INV_Axe_24", "Executioner's Cleaver"},
    {17730, "INV_Axe_04", "Gatorbite Axe"},
    {13983, "INV_Weapon_Halberd_09", "Gravestone War Axe"},
    {19962, "INV_Axe_24", "Gri'lek's Carver"},
    {13017, "INV_Axe_24", "Hellslayer Battle Axe"},
    {13016, "INV_Axe_10", "Killmaim"},
    {13003, "INV_Weapon_Halberd_02", "Lord Alexander's Battle Axe"},
    {18759, "INV_Axe_18", "Malicious Axe"},
    {10570, "INV_Axe_04", "Manslayer"},
    {1318, "INV_ThrowingAxe_06", "Night Reaver"},
    {9383, "INV_Axe_14", "Obsidian Cleaver"},
    {9425, "INV_Weapon_Halberd_08", "Pendulum of Doom"},
    {12975, "INV_Axe_03", "Prospector Axe"},
    {7717, "INV_Weapon_Halberd_05", "Ravager"},
    {9486, "INV_Axe_21", "Supercharger Battle Axe"},
    {5194, "INV_ThrowingAxe_06", "Taskmaster Axe"},
    {23171, "INV_Axe_03", "The Axe of Severing"},
    {9481, "INV_Axe_03", "The Minotaur"},
    {13285, "INV_Weapon_Halberd_11", "The Nicker"},
    {9459, "INV_Axe_03", "Thermaplugg's Left Arm"},
    {18324, "INV_Axe_17", "Waveslicer"},
    {6975, "INV_Axe_12", "Whirlwind Axe"},
    {19900, "INV_Axe_34", "Zulian Stone Axe"},
    {3191, "INV_Axe_06", "Arced War Axe"},
    {15424, "INV_Axe_04", "Axe of Orgrimmar"},
    {3201, "INV_Axe_17", "Barbarian War Axe"},
    {3195, "INV_Axe_10", "Barbaric Battle Axe"},
    {3199, "INV_ThrowingAxe_06", "Battle Slayer"},
    {11907, "INV_Axe_10", "Beastslayer"},
    {2015, "INV_Axe_17", "Black Metal War Axe"},
    {1455, "INV_Weapon_Halbard_01", "Blackrock Champion's Axe"},
    {2203, "INV_Axe_23", "Brashclaw's Chopper"},
    {3210, "INV_Axe_17", "Brutal War Axe"},
    {1959, "INV_Pick_01", "Cold Iron Pick"},
    {15271, "INV_Axe_12", "Colossal Great Axe"},
    {3488, "INV_ThrowingAxe_02", "Copper Battle Axe"},
    {15273, "INV_Axe_18", "Death Striker"},
    {9626, "INV_Axe_09", "Dwarven Charge"},
    {2907, "INV_ThrowingAxe_01", "Dwarven Tree Chopper"},
    {15270, "INV_Axe_17", "Gigantic War Axe"},
    {1639, "INV_Axe_04", "Grinning Axe"},
    {1680, "INV_Axe_17", "Headchopper"},
    {2227, "INV_Weapon_Halbard_01", "Heavy Ogre War Axe"},
    {12775, "INV_Weapon_Halberd_11", "Huge Thorium Battleaxe"},
    {12000, "INV_Axe_02", "Limb Cleaver"},
    {3586, "INV_Axe_11", "Logsplitter"},
    {1521, "INV_Axe_18", "Lumbering Ogre Axe"},
    {1220, "INV_Axe_14", "Lupine Axe"},
    {15269, "INV_Axe_21", "Massive Battle Axe"},
    {3855, "INV_ThrowingAxe_05", "Massive Iron Axe"},
    {12249, "INV_Axe_17", "Merciless Axe"},
    {12250, "INV_Axe_17", "Midnight Axe"},
    {1893, "INV_Pick_03", "Miner's Revenge"},
    {2823, "INV_Axe_06", "Mo'grosh Can Opener"},
    {1640, "INV_Axe_18", "Monstrous War Axe"},
    {6094, "INV_ThrowingAxe_01", "Piercing Axe"},
    {15272, "INV_Axe_17", "Razor Axe"},
    {6905, "INV_Weapon_Halberd_06", "Reef Axe"},
    {872, "INV_ThrowingAxe_01", "Rockslicer"},
    {5749, "INV_Axe_06", "Scythe Axe"},
    {4562, "INV_ThrowingAxe_02", "Severing Axe"},
    {3856, "INV_Axe_17", "Shadow Crescent Axe"},
    {2175, "INV_ThrowingAxe_06", "Shadowhide Battle Axe"},
    {5626, "INV_Axe_23", "Skullchipper"},
    {9521, "INV_Axe_06", "Skullsplitter"},
    {1461, "INV_ThrowingAxe_06", "Slayer's Battle Axe"},
    {9679, "INV_Weapon_Halbard_01", "Tok'kar's Murloc Chopper"},
    {756, "INV_Pick_02", "Tunnel Pick"},
    {15268, "INV_Axe_09", "Twin-bladed Axe"},
    {10652, "INV_Weapon_Halberd_05", "Will of the Mountain Giant"},
    {5318, "INV_Weapon_Halberd_02", "Zhovur Axe"},
    {926, "INV_ThrowingAxe_05", "Battle Axe"},
    {2025, "INV_Axe_03", "Bearded Axe"},
    {5777, "INV_ThrowingAxe_05", "Brave's Axe"},
    {2479, "INV_Axe_11", "Broad Axe"},
    {7958, "INV_Axe_21", "Bronze Battle Axe"},
    {2523, "INV_Weapon_Halberd_06", "Bullova"},
    {2499, "INV_ThrowingAxe_06", "Double-bladed Axe"},
    {2531, "INV_ThrowingAxe_06", "Great Axe"},
    {2491, "INV_Axe_10", "Large Axe"},
    {6206, "INV_Pick_02", "Rock Chipper"},
    {1196, "INV_Axe_04", "Tabar"},
    {1386, "INV_Axe_01", "Thistlewood Axe"},
    {3325, "INV_Axe_21", "Vile Fin Battle Axe"},
    {3189, "INV_Axe_11", "Wood Chopper"},
    {12282, "INV_Axe_09", "Worn Battleaxe"},
    {13819, "INV_ThrowingAxe_06", "Balanced War Axe"},
    {1417, "INV_ThrowingAxe_06", "Beaten Battle Axe"},
    {1512, "INV_ThrowingAxe_05", "Crude Battle Axe"},
    {3779, "INV_Axe_11", "Hefty War Axe"},
    {1824, "INV_Axe_18", "Shiny War Axe"},
    {1812, "INV_ThrowingAxe_05", "Short-handled Battle Axe"},
    {4020, "INV_ThrowingAxe_06", "Splintering Battle Axe"},
    {1828, "INV_Axe_20", "Stone War Axe"}
  };
  
  public static int[] getIDs() {
    int[] res = new int[axes.length];
    for (int i = 0; i < axes.length; i++) {
      res[i] = (int)axes[i][0];
    }
    return res;
  }
  
  public static String[] getIcons() {
    String[] res = new String[axes.length];
    for (int i = 0; i < axes.length; i++) {
      res[i] = (String)axes[i][1];
    }
    return res;
  }
  
  public static String[] getNames() {
    String[] res = new String[axes.length];
    for (int i = 0; i < axes.length; i++) {
      res[i] = (String)axes[i][2];
    }
    return res;
  }
  
  public static void main(String[] args) {
    int[] t1 = getIDs();
    String[] t2 = getIcons();
    String[] t3 = getNames();
    for (int i = 0; i < t1.length; i++) {
      System.out.println(t1[i] + ", " + t2[i] + ", " + t3[i]);
    }
  }
}
