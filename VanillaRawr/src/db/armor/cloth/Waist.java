package db.armor.cloth;

/**
 * The Class, that stores every single Cloth-Waist in the game with Values to search their Stats in 
 * the Database.
 * @author Haeldeus
 * @version 1.0
 */
public class Waist {

  /**
   * All Cloth-Waists stored as a Matrix of Objects. The Waists will be saved in the following way:
   * <br/> [id][Icon][Name]
   * <br/> [id][Icon][Name]
   * <br/> :
   * <br/> :
   * <br/> :
   */
  private static Object[][] waists = {
    {19388, "INV_Belt_13", "Angelista's Grasp"},
    {16802, "INV_Belt_30", "Arcanist Belt"},
    {22518, "INV_Belt_08", "Belt of Faith"},
    {18405, "INV_Belt_31", "Belt of the Archmage"},
    {20625, "INV_Belt_15", "Belt of the Dark Bog"},
    {16925, "INV_Belt_22", "Belt of Transcendence"},
    {22730, "INV_Belt_12", "Eyestalk Waist Cord"},
    {16806, "INV_Belt_13", "Felheart Belt"},
    {19400, "INV_Belt_10", "Firemaw's Clutch"},
    {22502, "INV_Belt_03", "Frostfire Belt"},
    {16817, "INV_Belt_22", "Girdle of Prophecy"},
    {21582, "INV_Belt_31", "Grasp of the Old God"},
    {19136, "INV_Belt_11", "Mana Igniting Cord"},
    {16933, "INV_Belt_13", "Nemesis Belt"},
    {16818, "INV_Belt_22", "Netherwind Belt"},
    {22510, "INV_Belt_03", "Plagueheart Belt"},
    {18809, "INV_Belt_12", "Sash of Whispered Secrets"},
    {19842, "INV_Belt_08", "Zandalar Confessor's Bindings"},
    {11662, "INV_Belt_29", "Ban'thok Sash"},
    {6392, "INV_Belt_10", "Belt of Arugal"},
    {21500, "INV_Belt_05", "Belt of the Inquisition"},
    {20217, "INV_Belt_13", "Belt of Tiny Heads"},
    {22716, "INV_Belt_01", "Belt of Untapped Power"},
    {13956, "INV_Belt_12", "Clutch of Andros"},
    {12466, "INV_Belt_11", "Dawnspire Cord"},
    {10771, "INV_Belt_24", "Deathmage Sash"},
    {22070, "INV_Belt_12", "Deathmist Belt"},
    {20163, "INV_Belt_17", "Defiler's Cloth Girdle"},
    {20164, "INV_Belt_17", "Defiler's Cloth Girdle"},
    {20165, "INV_Belt_17", "Defiler's Cloth Girdle"},
    {20166, "INV_Belt_17", "Defiler's Cloth Girdle"},
    {16696, "INV_Belt_10", "Devout Belt"},
    {16702, "INV_Belt_12", "Dreadmist Belt"},
    {12589, "INV_Belt_11", "Dustfeather Sash"},
    {19090, "INV_Belt_04", "Frostwolf Cloth Belt"},
    {13403, "INV_Belt_02", "Grimgore Noose"},
    {20047, "INV_Belt_17", "Highlander's Cloth Girdle"},
    {20097, "INV_Belt_17", "Highlander's Cloth Girdle"},
    {20098, "INV_Belt_17", "Highlander's Cloth Girdle"},
    {20099, "INV_Belt_17", "Highlander's Cloth Girdle"},
    {22306, "INV_Belt_03", "Ironweave Belt"},
    {2911, "INV_Belt_04", "Keller's Girdle"},
    {16685, "INV_Belt_08", "Magister's Belt"},
    {20539, "INV_Belt_14", "Runed Stygian Belt"},
    {11807, "INV_Belt_11", "Sash of the Burning Heart"},
    {17755, "INV_Belt_24", "Satyrmane Sash"},
    {13144, "INV_Belt_07", "Serenity Belt"},
    {22062, "INV_Belt_08", "Sorcerer's Belt"},
    {19094, "INV_Belt_04", "Stormpike Cloth Girdle"},
    {13105, "INV_Belt_11", "Sutarn's Ring"},
    {18740, "INV_Belt_13", "Thuzadin Sash"},
    {22078, "INV_Belt_10", "Virtuous Belt"},
    {23126, "INV_Belt_13", "Waistband of Balzaphon"},
    {16975, "INV_Belt_02", "Warsong Sash"},
    {18327, "INV_Belt_17", "Whipvine Cord"},
    {19047, "INV_Belt_09", "Wisdom of the Timbermaw"},
    {9945, "INV_Belt_22", "Abjurer's Sash"},
    {14113, "INV_Belt_05", "Aboriginal Sash"},
    {20664, "INV_Belt_06", "Abyssal Cloth Sash"},
    {14289, "INV_Belt_10", "Arachnidian Girdle"},
    {8291, "INV_Belt_04", "Arcane Sash"},
    {6418, "INV_Belt_06", "Aurora Sash"},
    {7052, "INV_Belt_22", "Azure Silk Belt"},
    {4463, "INV_Belt_11", "Beaded Raptor Collar"},
    {14258, "INV_Belt_07", "Bloodwoven Cord"},
    {14304, "INV_Belt_30", "Bonecaster's Belt"},
    {15707, "INV_Belt_08", "Brantwood Sash"},
    {4708, "INV_Belt_11", "Bright Belt"},
    {4785, "INV_Belt_02", "Brimstone Belt"},
    {14173, "INV_Belt_22", "Buccaneer's Cord"},
    {3344, "INV_Misc_Bandana_03", "Captain Sander's Sash"},
    {14309, "INV_Belt_29", "Celestial Belt"},
    {17750, "INV_Belt_25", "Chloromesh Girdle"},
    {9853, "INV_Belt_15", "Conjurer's Cinch"},
    {10103, "INV_Belt_25", "Councillor's Sash"},
    {7055, "INV_Belt_04", "Crimson Silk Belt"},
    {14245, "INV_Belt_10", "Darkmist Girdle"},
    {4829, "INV_Belt_04", "Dreamer's Belt"},
    {10404, "INV_Belt_03", "Durable Belt"},
    {10066, "INV_Belt_03", "Duskwoven Sash"},
    {7061, "INV_Belt_24", "Earthen Silk Belt"},
    {7370, "INV_Belt_15", "Elder's Sash"},
    {10216, "INV_Belt_29", "Elegant Belt"},
    {14465, "INV_Belt_17", "Elunarian Belt"},
    {14235, "INV_Belt_11", "Embersilk Cord"},
    {14337, "INV_Belt_10", "Eternal Cord"},
    {3217, "INV_Belt_23", "Foreman Belt"},
    {14276, "INV_Belt_10", "Gaea's Belt"},
    {14217, "INV_Belt_02", "Geomancer's Cord"},
    {6908, "INV_Belt_24", "Ghamoo-ra's Bind"},
    {14143, "INV_Belt_16", "Ghostweave Belt"},
    {5967, "INV_Belt_10", "Girdle of Nobility"},
    {7526, "INV_Belt_07", "Gossamer Belt"},
    {6477, "INV_Belt_02", "Grassland Sash"},
    {9766, "INV_Belt_05", "Greenweave Sash"},
    {8114, "INV_Belt_25", "Hibernal Sash"},
    {10144, "INV_Belt_04", "High Councillor's Sash"},
    {14454, "INV_Belt_30", "Highborne Cord"},
    {8253, "INV_Belt_29", "Imperial Red Sash"},
    {9799, "INV_Belt_25", "Ivycloth Sash"},
    {10820, "INV_Belt_09", "Jackseed Belt"},
    {4436, "INV_Belt_04", "Jewel-encrusted Sash"},
    {1299, "INV_Belt_29", "Lesser Belt of the Spire"},
    {6780, "INV_Belt_24", "Lilac Sash"},
    {14255, "INV_Belt_08", "Lunar Belt"},
    {10255, "INV_Belt_04", "Master's Belt"},
    {4736, "INV_Belt_04", "Mistscape Sash"},
    {3985, "INV_Misc_Bandana_03", "Monogrammed Sash"},
    {14025, "INV_Belt_26", "Mystic's Belt"},
    {10180, "INV_Belt_02", "Mystical Belt"},
    {4720, "INV_Belt_03", "Nightsky Sash"},
    {4828, "INV_Belt_26", "Nightwind Belt"},
    {18475, "INV_Belt_07", "Oddly Magical Belt"},
    {14286, "INV_Belt_21", "Opulent Belt"},
    {14164, "INV_Belt_24", "Pagan Belt"},
    {14194, "INV_Misc_Bandana_01", "Raincaller Cord"},
    {2283, "INV_Belt_05", "Rat Cloth Belt"},
    {6726, "INV_Belt_15", "Razzeric's Customized Seatbelt"},
    {7476, "INV_Belt_08", "Regal Sash"},
    {11936, "INV_Belt_23", "Relic Hunter Belt"},
    {14406, "INV_Belt_03", "Resilient Cord"},
    {14327, "INV_Belt_13", "Resplendent Belt"},
    {14131, "INV_Belt_05", "Ritual Belt"},
    {9906, "INV_Belt_10", "Royal Sash"},
    {13856, "INV_Belt_15", "Runecloth Belt"},
    {6611, "INV_Misc_Bandana_01", "Sage's Sash"},
    {14373, "INV_Belt_03", "Sanguine Belt"},
    {4117, "INV_Misc_Bandana_03", "Scorching Sash"},
    {4699, "INV_Belt_22", "Seer's Belt"},
    {10462, "INV_Belt_26", "Shadowy Belt"},
    {6570, "INV_Belt_25", "Shimmering Sash"},
    {14426, "INV_Belt_06", "Silksand Girdle"},
    {4714, "INV_Belt_03", "Silver-thread Sash"},
    {9875, "INV_Belt_10", "Sorcerer Sash"},
    {4328, "INV_Belt_25", "Spider Belt"},
    {4329, "INV_Belt_06", "Star Belt"},
    {14414, "INV_Belt_03", "Stonecloth Belt"},
    {9636, "INV_Misc_Bandana_03", "Swashbuckler Sash"},
    {3229, "INV_Belt_07", "Tarantula Silk Sash"},
    {10747, "INV_Belt_11", "Teacher's Sash"},
    {14205, "INV_Belt_23", "Thistlefur Belt"},
    {15791, "INV_Belt_10", "Turquoise Sash"},
    {7438, "INV_Belt_10", "Twilight Belt"},
    {12083, "INV_Belt_11", "Valconian Sash"},
    {14446, "INV_Belt_25", "Venomshroud Belt"},
    {14209, "INV_Belt_21", "Vital Sash"},
    {14185, "INV_Belt_21", "Watcher's Cinch"},
    {6539, "INV_Belt_05", "Willow Belt"},
    {14435, "INV_Belt_23", "Windchaser Cinch"},
    {4786, "INV_Belt_02", "Wise Man's Belt"},
    {4827, "INV_Belt_29", "Wizard's Belt"},
    {4672, "INV_Belt_03", "Ancestral Belt"},
    {3442, "INV_Misc_Bandana_01", "Apprentice Sash"},
    {4687, "INV_Belt_03", "Barbaric Cloth Belt"},
    {14093, "INV_Belt_02", "Beaded Cord"},
    {5458, "INV_Belt_04", "Dirtwood Belt"},
    {6513, "INV_Belt_02", "Disciple's Sash"},
    {3587, "INV_Belt_08", "Embroidered Belt"},
    {11848, "INV_Belt_03", "Flax Belt"},
    {3589, "INV_Belt_25", "Heavy Weave Belt"},
    {4663, "INV_Belt_04", "Journeyman's Belt"},
    {3602, "INV_Belt_06", "Knitted Belt"},
    {7026, "INV_Belt_05", "Linen Belt"},
    {14099, "INV_Belt_24", "Native Sash"},
    {3591, "INV_Belt_06", "Padded Belt"},
    {983, "INV_Misc_Bandana_03", "Red Linen Sash"},
    {3593, "INV_Belt_26", "Russet Belt"},
    {9742, "INV_Belt_02", "Simple Cord"},
    {4919, "INV_Belt_03", "Soft Wool Belt"},
    {4684, "INV_Belt_04", "Spellbinder Belt"},
    {3595, "INV_Belt_24", "Tattered Cloth Belt"},
    {3597, "INV_Belt_06", "Thick Cloth Belt"},
    {3599, "INV_Belt_06", "Thin Cloth Belt"},
    {3606, "INV_Belt_24", "Woven Belt"},
    {3378, "INV_Belt_03", "Brocade Belt"},
    {3374, "INV_Belt_06", "Calico Belt"},
    {3376, "INV_Belt_06", "Canvas Belt"},
    {3936, "INV_Belt_02", "Crochet Belt"},
    {3380, "INV_Belt_26", "Cross-stitched Belt"},
    {3363, "INV_Belt_04", "Frayed Belt"},
    {3792, "INV_Belt_04", "Interlaced Belt"},
    {3370, "INV_Belt_03", "Patchwork Belt"},
    {3944, "INV_Belt_02", "Twill Belt"}
  };
  
  /**
   * Returns all IDs, that are used by Cloth-Waists.
   * @return  An Array of Integers, that represents all IDs, that are used by Cloth-Waists.
   * @since 1.0
   */
  public static int[] getIDs() {
    int[] res = new int[waists.length];
    for (int i = 0; i < waists.length; i++) {
      res[i] = (int)waists[i][0];
    }
    return res;
  }
  
  /**
   * Returns all Icons, that are used by Cloth-Waists.
   * @return  An Array of Strings, that represents all Icons, that are used by Cloth-Waists by 
   *     stating their Name.
   * @since 1.0
   */
  public static String[] getIcons() {
    String[] res = new String[waists.length];
    for (int i = 0; i < waists.length; i++) {
      res[i] = (String)waists[i][1];
    }
    return res;
  }
  
  /**
   * Returns all Names of Cloth-Waists in the Game.
   * @return  The Name of all Cloth-Waists in the Game as an Array of Strings.
   * @since 1.0
   */
  public static String[] getNames() {
    String[] res = new String[waists.length];
    for (int i = 0; i < waists.length; i++) {
      res[i] = (String)waists[i][2];
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
