package db.weapon.onehanded;

/**
 * The Class, that is used to store all Daggers and their Values to search for them in the 
 * Database. The Values can be get by using the Methods {@link #getNames()}, {@link #getIDs()} and 
 * {@link #getIcons()}.
 * @author Haeldeus
 * @version 1.0
 */
public class Dagger {

  /**
   * A Matrix, that stores every Dagger and their Values, that are used to search for them in the 
   * Database.
   * @since 1.0
   */
  private static Object[][] daggers = {
    {14555, "INV_Sword_34", "Alcor's Sunrazor"},
    {19166, "INV_Weapon_ShortBlade_12", "Black Amnesty"},
    {17780, "INV_Sword_09", "Blade of Eternal Darkness"},
    {21244, "INV_Weapon_Shortblade_35", "Blessed Qiraji Pugio"},
    {19347, "INV_Weapon_Shortblade_28", "Claw of Chromaggus"},
    {18805, "INV_Weapon_ShortBlade_11", "Core Hound Tooth"},
    {21404, "INV_Weapon_ShortBlade_27", "Dagger of Veiled Shadows"},
    {21126, "INV_Weapon_Shortblade_33", "Death's Sting"},
    {19346, "INV_Weapon_Shortblade_29", "Dragonfang Blade"},
    {20578, "INV_Weapon_ShortBlade_22", "Emerald Dragonfang"},
    {21523, "INV_Weapon_Shortblade_29", "Fang of Korialstrasz"},
    {19859, "INV_Weapon_Shortblade_30", "Fang of the Faceless"},
    {17070, "INV_Weapon_ShortBlade_06", "Fang of the Mystics"},
    {19903, "INV_Weapon_Shortblade_31", "Fang of Venoxis"},
    {12590, "INV_Weapon_ShortBlade_25", "Felstriker"},
    {18838, "INV_Weapon_ShortBlade_26", "Grand Marshal's Dirk"},
    {23451, "INV_Weapon_ShortBlade_26", "Grand Marshal's Mageblade"},
    {2164, "INV_Sword_13", "Gut Ripper"},
    {17071, "INV_Weapon_ShortBlade_18", "Gutgore Ripper"},
    {23044, "INV_knife_1h_stratholme_d_03", "Harbinger of Doom"},
    {18840, "INV_Weapon_ShortBlade_13", "High Warlord's Razor"},
    {23466, "INV_Weapon_ShortBlade_26", "High Warlord's Spellblade"},
    {22802, "INV_Weapon_Shortblade_37", "Kingsfall"},
    {21416, "INV_Weapon_ShortBlade_27", "Kris of Unspoken Names"},
    {22804, "INV_knife_1h_stratholme_d_01", "Maexxna's Fang"},
    {22803, "INV_knife_1h_stratholme_d_02", "Midnight Haze"},
    {20214, "INV_Sword_13", "Mindfang"},
    {18816, "INV_Sword_48", "Perdition's Blade"},
    {21498, "INV_Weapon_ShortBlade_12", "Qiraji Sacrificial Dagger"},
    {20070, "INV_Sword_13", "Sageclaw"},
    {2163, "INV_Sword_12", "Shadowblade"},
    {21522, "INV_Weapon_ShortBlade_25", "Shadowsong's Sorrow"},
    {18878, "INV_Weapon_ShortBlade_07", "Sorcerous Dagger"},
    {19324, "INV_Sword_29", "The Lobotomizer"},
    {1935, "INV_Weapon_ShortBlade_24", "Assassin's Blade"},
    {12791, "INV_Drink_10", "Barman Shanker"},
    {6904, "INV_Misc_MonsterFang_01", "Bite of Serra'kis"},
    {6831, "INV_Sword_13", "Black Menace"},
    {2236, "INV_Weapon_ShortBlade_02", "Blackfang"},
    {4446, "INV_Weapon_ShortBlade_02", "Blackvenom Blade"},
    {18372, "INV_Weapon_ShortBlade_18", "Blade of the New Moon"},
    {11922, "INV_Weapon_ShortBlade_15", "Blood-etched Blade"},
    {13368, "INV_Weapon_ShortBlade_12", "Bonescraper"},
    {17710, "INV_Weapon_ShortBlade_14", "Charstone Dirk"},
    {2912, "INV_Weapon_ShortBlade_16", "Claw of the Shadowmancer"},
    {10761, "INV_Sword_34", "Coldrage Dagger"},
    {20657, "INV_Weapon_ShortBlade_27", "Crystal Tipped Stiletto"},
    {20720, "INV_Weapon_ShortBlade_16", "Dark Whisper Blade"},
    {13984, "INV_Weapon_ShortBlade_21", "Darrowspike"},
    {10828, "INV_Weapon_ShortBlade_16", "Dire Nail"},
    {18392, "INV_Weapon_ShortBlade_05", "Distracting Dagger"},
    {3413, "INV_Sword_29", "Doomspike"},
    {19100, "INV_Weapon_ShortBlade_15", "Electrified Dagger"},
    {2567, "INV_Weapon_ShortBlade_15", "Evocator's Blade"},
    {13218, "INV_Weapon_ShortBlade_16", "Fang of the Crystal Spider"},
    {12709, "INV_Sword_33", "Finkle's Skinner"},
    {22266, "INV_Spear_01", "Flarethorn"},
    {14024, "INV_Weapon_ShortBlade_16", "Frightalon"},
    {13360, "INV_Weapon_ShortBlade_15", "Gift of the Elven Magi"},
    {19099, "INV_Weapon_ShortBlade_06", "Glacial Blade"},
    {20035, "INV_Weapon_ShortBlade_06", "Glacial Spike"},
    {5616, "INV_Sword_31", "Gutwrencher"},
    {12783, "INV_Sword_17", "Heartseeker"},
    {11635, "INV_Weapon_ShortBlade_10", "Hookfang Shanker"},
    {6331, "INV_Weapon_ShortBlade_15", "Howling Blade"},
    {7714, "INV_Weapon_ShortBlade_07", "Hypnotic Blade"},
    {6660, "INV_Weapon_ShortBlade_07", "Julie's Dagger"},
    {12582, "INV_Weapon_ShortBlade_12", "Keris of Zul'Serak"},
    {10750, "INV_Sword_21", "Lifeforce Dirk"},
    {18491, "INV_Weapon_ShortBlade_21", "Lorespinner"},
    {6220, "INV_Weapon_ShortBlade_25", "Meteor Shard"},
    {2941, "INV_Weapon_ShortBlade_18", "Prison Shank"},
    {17752, "INV_Weapon_ShortBlade_09", "Satyr's Lash"},
    {5267, "INV_Weapon_ShortBlade_03", "Scarlet Kris"},
    {23168, "INV_Weapon_ShortBlade_07", "Scorn's Focal Dagger"},
    {19542, "INV_Weapon_ShortBlade_15", "Scout's Blade"},
    {19543, "INV_Weapon_ShortBlade_15", "Scout's Blade"},
    {19544, "INV_Weapon_ShortBlade_15", "Scout's Blade"},
    {19545, "INV_Weapon_ShortBlade_15", "Scout's Blade"},
    {20441, "INV_Weapon_ShortBlade_15", "Scout's Blade"},
    {12531, "INV_Weapon_ShortBlade_03", "Searing Needle"},
    {19546, "INV_Weapon_ShortBlade_14", "Sentinel's Blade"},
    {19547, "INV_Weapon_ShortBlade_14", "Sentinel's Blade"},
    {19548, "INV_Weapon_ShortBlade_14", "Sentinel's Blade"},
    {19549, "INV_Weapon_ShortBlade_14", "Sentinel's Blade"},
    {20443, "INV_Weapon_ShortBlade_14", "Sentinel's Blade"},
    {22379, "INV_Sword_21", "Shivsprocket's Shiv"},
    {5756, "INV_Weapon_ShortBlade_24", "Sliverblade"},
    {18758, "INV_Weapon_ShortBlade_18", "Specter's Blade"},
    {10625, "INV_Sword_41", "Stealthblade"},
    {9384, "INV_Weapon_ShortBlade_18", "Stonevault Shiv"},
    {6691, "INV_Misc_Bone_06", "Swinetusk Shank"},
    {4454, "INV_Weapon_ShortBlade_16", "Talon of Vultros"},
    {21802, "INV_Sword_32", "The Lost Kris of Zedd"},
    {24222, "INV_Weapon_ShortBlade_18", "The Shadowfoot Stabber"},
    {22377, "INV_Sword_17", "The Thunderwood Poker"},
    {8006, "INV_Weapon_ShortBlade_25", "The Ziggler"},
    {7682, "INV_Spear_01", "Torturing Poker"},
    {9453, "INV_Weapon_ShortBlade_02", "Toxic Revenger"},
    {776, "INV_Weapon_ShortBlade_02", "Vendetta"},
    {22688, "INV_Weapon_ShortBlade_03", "Verimonde's Last Resort"},
    {4091, "INV_Weapon_ShortBlade_03", "Widowmaker"},
    {13964, "INV_Weapon_ShortBlade_25", "Witchblade"},
    {19965, "INV_Sword_37", "Wushoolay's Poker"},
    {15241, "INV_Weapon_ShortBlade_01", "Battle Knife"},
    {15783, "INV_Weapon_ShortBlade_14", "Beasthunter Dagger"},
    {3848, "INV_Weapon_ShortBlade_04", "Big Bronze Knife"},
    {20647, "INV_Weapon_ShortBlade_20", "Black Crystal Dagger"},
    {7298, "INV_Weapon_ShortBlade_26", "Blade of Cunning"},
    {15247, "INV_Weapon_ShortBlade_03", "Bloodstrike Dagger"},
    {2235, "INV_Weapon_ShortBlade_15", "Brackclaw"},
    {12247, "INV_Weapon_ShortBlade_04", "Broad Bladed Knife"},
    {2140, "INV_Weapon_ShortBlade_01", "Carving Knife"},
    {11856, "INV_Sword_13", "Ceremonial Elven Blade"},
    {14151, "INV_Weapon_ShortBlade_25", "Chanting Blade"},
    {4974, "INV_Weapon_ShortBlade_05", "Compact Fighting Knife"},
    {2218, "INV_Weapon_ShortBlade_05", "Craftsman's Dagger"},
    {2819, "INV_Weapon_ShortBlade_05", "Cross Dagger"},
    {2632, "INV_Weapon_ShortBlade_01", "Curved Dagger"},
    {15396, "INV_Weapon_ShortBlade_05", "Curvewood Dagger"},
    {12248, "INV_Weapon_ShortBlade_15", "Daring Dirk"},
    {3490, "INV_Weapon_ShortBlade_05", "Deadly Bronze Poniard"},
    {15243, "INV_Weapon_ShortBlade_01", "Deadly Kris"},
    {15246, "INV_Weapon_ShortBlade_03", "Demon Blade"},
    {4088, "INV_Sword_41", "Dreadblade"},
    {7947, "INV_Weapon_ShortBlade_14", "Ebon Shiv"},
    {6969, "INV_Weapon_ShortBlade_05", "Elunite Dagger"},
    {10697, "INV_Sword_31", "Enchanted Azsharite Felbane Dagger"},
    {10703, "INV_Sword_21", "Fiendish Skiv"},
    {3336, "INV_Weapon_ShortBlade_10", "Flesh Piercer"},
    {9467, "INV_Misc_MonsterFang_01", "Gahz'rilla Fang"},
    {1287, "INV_Misc_MonsterFang_01", "Giant Tarantula Fang"},
    {12259, "INV_Weapon_ShortBlade_05", "Glinting Steel Dagger"},
    {1936, "INV_Weapon_ShortBlade_05", "Goblin Screwdriver"},
    {6980, "INV_Weapon_ShortBlade_15", "Haggard's Dagger"},
    {5279, "INV_Weapon_ShortBlade_14", "Harpy Skinner"},
    {7116, "INV_Weapon_ShortBlade_15", "Heirloom Dagger"},
    {2020, "INV_Weapon_ShortBlade_16", "Hollowfang Blade"},
    {15242, "INV_Weapon_ShortBlade_01", "Honed Stiletto"},
    {3184, "INV_Weapon_ShortBlade_01", "Hook Dagger"},
    {15706, "INV_Weapon_ShortBlade_15", "Hunt Tracker Blade"},
    {4947, "INV_Weapon_ShortBlade_02", "Jagged Dagger"},
    {1917, "INV_Weapon_ShortBlade_15", "Jeweled Dagger"},
    {15443, "INV_Weapon_ShortBlade_05", "Kris of Orgrimmar"},
    {2088, "INV_Misc_Bone_06", "Long Crawler Limb"},
    {4449, "INV_Misc_MonsterFang_01", "Naraxis' Fang"},
    {5540, "INV_Weapon_ShortBlade_05", "Pearl-handled Dagger"},
    {15244, "INV_Weapon_ShortBlade_01", "Razor Blade"},
    {5627, "INV_Weapon_ShortBlade_05", "Relic Blade"},
    {5112, "INV_Weapon_ShortBlade_02", "Ritual Blade"},
    {3187, "INV_Weapon_ShortBlade_03", "Sacrificial Kris"},
    {2089, "INV_Weapon_ShortBlade_01", "Scrimshaw Dagger"},
    {12260, "INV_Weapon_ShortBlade_05", "Searing Golden Blade"},
    {3581, "INV_Weapon_ShortBlade_01", "Serrated Knife"},
    {9520, "INV_Weapon_ShortBlade_18", "Silent Hunter"},
    {12062, "INV_Sword_21", "Skilled Fighting Blade"},
    {820, "INV_Weapon_ShortBlade_01", "Slicer Blade"},
    {816, "INV_Weapon_ShortBlade_01", "Small Hand Blade"},
    {6333, "INV_Weapon_ShortBlade_10", "Spikelash Dagger"},
    {2266, "INV_Weapon_ShortBlade_08", "Stonesplinter Dagger"},
    {6448, "INV_Weapon_ShortBlade_10", "Tail Spike"},
    {2908, "INV_Weapon_ShortBlade_15", "Thornblade"},
    {7327, "INV_Weapon_ShortBlade_05", "Thun'grim's Dagger"},
    {1465, "INV_Weapon_ShortBlade_15", "Tigerbane"},
    {9680, "INV_Weapon_ShortBlade_18", "Tok'kar's Murloc Shanker"},
    {6981, "INV_Weapon_ShortBlade_15", "Umbral Dagger"},
    {899, "INV_Misc_MonsterFang_01", "Venom Web Fang"},
    {15245, "INV_Weapon_ShortBlade_03", "Vorpal Dagger"},
    {4571, "INV_Weapon_ShortBlade_15", "War Knife"},
    {5752, "INV_Weapon_ShortBlade_16", "Wyvern Tailspike"},
    {2195, "INV_Weapon_ShortBlade_05", "Anvilmar Knife"},
    {3225, "INV_Weapon_ShortBlade_01", "Bloodstained Knife"},
    {2169, "INV_Weapon_ShortBlade_05", "Buzzer Blade"},
    {10547, "INV_Weapon_ShortBlade_01", "Camping Knife"},
    {3445, "INV_Weapon_ShortBlade_10", "Ceremonial Knife"},
    {7166, "INV_Weapon_ShortBlade_14", "Copper Dagger"},
    {3296, "INV_Weapon_ShortBlade_05", "Deadman Dagger"},
    {2139, "INV_Weapon_ShortBlade_14", "Dirk"},
    {3268, "INV_Weapon_ShortBlade_05", "Forsaken Dagger"},
    {2207, "INV_Weapon_ShortBlade_04", "Jambiya"},
    {2209, "INV_Sword_32", "Kris"},
    {4840, "INV_Weapon_ShortBlade_05", "Long Bayonet"},
    {2526, "INV_Weapon_ShortBlade_15", "Main Gauche"},
    {2224, "INV_Weapon_ShortBlade_05", "Militia Dagger"},
    {2208, "INV_Sword_12", "Poniard"},
    {4925, "INV_Weapon_ShortBlade_05", "Primitive Hand Blade"},
    {5605, "INV_Weapon_ShortBlade_01", "Pruning Knife"},
    {5093, "INV_Weapon_ShortBlade_04", "Razormane Backstabber"},
    {2534, "INV_Sword_31", "Rondel"},
    {5040, "INV_Weapon_ShortBlade_11", "Shadow Hunter Knife"},
    {2225, "INV_Weapon_ShortBlade_14", "Sharp Kitchen Knife"},
    {4565, "INV_Weapon_ShortBlade_01", "Simple Dagger"},
    {4302, "INV_Weapon_ShortBlade_05", "Small Green Dagger"},
    {2494, "INV_Weapon_ShortBlade_05", "Stiletto"},
    {5392, "INV_Weapon_ShortBlade_05", "Thistlewood Dagger"},
    {6681, "INV_Weapon_ShortBlade_10", "Thornspike"},
    {2787, "INV_Weapon_ShortBlade_08", "Trogg Dagger"},
    {2137, "INV_Weapon_ShortBlade_01", "Whittling Knife"},
    {2092, "INV_Weapon_ShortBlade_05", "Worn Dagger"},
    {2766, "INV_Weapon_ShortBlade_05", "Deft Stiletto"},
    {4023, "INV_Weapon_ShortBlade_05", "Fine Pointed Dagger"},
    {2763, "INV_Weapon_ShortBlade_01", "Fisherman Knife"},
    {2765, "INV_Weapon_ShortBlade_15", "Hunting Knife"},
    {2138, "INV_Weapon_ShortBlade_05", "Sharpened Letter Opener"},
    {3786, "INV_Weapon_ShortBlade_01", "Shiny Dirk"},
    {2764, "INV_Weapon_ShortBlade_01", "Small Dagger"},
    {13822, "INV_Weapon_ShortBlade_05", "Spiked Dagger"},
    {5516, "INV_Misc_Bone_06", "Threshadon Fang"},
  };
  
  /**
   * Returns all IDs, that are used by Daggers.
   * @return  An Array of Integers, that represents all IDs, that are used by onehanded Axes.
   * @since 1.0
   */
  public static int[] getIDs() {
    int[] res = new int[daggers.length];
    for (int i = 0; i < daggers.length; i++) {
      res[i] = (int)daggers[i][0];
    }
    return res;
  }
  
  /**
   * Returns all Icons, that are used by Daggers.
   * @return  An Array of Strings, that represents all Icons, that are used by Daggers by stating 
   *     their Name.
   * @since 1.0
   */
  public static String[] getIcons() {
    String[] res = new String[daggers.length];
    for (int i = 0; i < daggers.length; i++) {
      res[i] = (String)daggers[i][1];
    }
    return res;
  }
  
  /**
   * Returns all Names of Daggers in the Game.
   * @return  The Name of all Daggers in the Game as an Array of Strings.
   * @since 1.0
   */
  public static String[] getNames() {
    String[] res = new String[daggers.length];
    for (int i = 0; i < daggers.length; i++) {
      res[i] = (String)daggers[i][2];
    }
    return res;
  }
  
  /**
   * The Main-Method for this Class, that executes all Methods to get all IDs, Names and 
   * Icons and prints them into the Console.
   * @param args  Unused.
   * @since 1.0
   */
  public static void main(String[] args) {
    int[] t1 = getIDs();
    String[] t2 = getIcons();
    String[] t3 = getNames();
    for (int i = 0; i < t1.length; i++) {
      System.out.println(t1[i] + ", " + t2[i] + ", " + t3[i]);
    }
  }
}
