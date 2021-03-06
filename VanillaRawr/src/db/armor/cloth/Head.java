package db.armor.cloth;

/**
 * The Class, that stores every single Cloth-Head in the game with Values to search their Stats in 
 * the Database.
 * @author Haeldeus
 * @version 1.0
 */
public class Head {

  /**
   * All Cloth-Heads stored as a Matrix of Objects. The Heads will be saved in the following way:
   * <br/> [id][Icon][Name]
   * <br/> [id][Icon][Name]
   * <br/> :
   * <br/> :
   * <br/> :
   */
  private static Object[][] heads = {
    {16795, "INV_Helmet_53", "Arcanist Crown"},
    {12752, "INV_Helmet_59", "Cap of the Scarlet Savant"},
    {11808, "Spell_Fire_Fire", "Circle of Flame"},
    {22514, "INV_Crown_01", "Circlet of Faith"},
    {16813, "INV_Helmet_34", "Circlet of Prophecy"},
    {19132, "INV_Crown_01", "Crystal Adorned Crown"},
    {22074, "INV_Helmet_29", "Deathmist Mask"},
    {21615, "INV_Helmet_51", "Don Rigoberto's Lost Hat"},
    {21337, "INV_Helmet_06", "Doomcaller's Circlet"},
    {21472, "INV_Helmet_62", "Dustwind Turban"},
    {21347, "INV_Helmet_06", "Enigma Circlet"},
    {3075, "INV_Helmet_44", "Eye of Flame"},
    {16808, "INV_Helmet_08", "Felheart Horns"},
    {17578, "INV_Helmet_24", "Field Marshal's Coronal"},
    {16441, "INV_Helmet_24", "Field Marshal's Coronet"},
    {17602, "INV_Helmet_24", "Field Marshal's Headdress"},
    {22498, "INV_Crown_01", "Frostfire Circlet"},
    {23032, "INV_Helmet_53", "Glacial Headdress"},
    {21517, "INV_Helmet_63", "Gnomish Turban of Psychic Might"},
    {16921, "INV_Helmet_24", "Halo of Transcendence"},
    {19375, "INV_Helmet_52", "Mish'undare, Circlet of the Mind Flayer"},
    {16929, "INV_Helmet_08", "Nemesis Skullcap"},
    {16914, "INV_Helmet_70", "Netherwind Crown"},
    {22506, "INV_Crown_01", "Plagueheart Circlet"},
    {23035, "INV_Helmet_50", "Preceptor's Hat"},
    {22065, "INV_Crown_02", "Sorcerer's Crown"},
    {21348, "INV_Helmet_06", "Tiara of the Oracle"},
    {22080, "INV_Crown_01", "Virtuous Crown"},
    {17591, "INV_Helmet_08", "Warlord's Dreadweave Hood"},
    {17623, "INV_Helmet_08", "Warlord's Satin Cowl"},
    {16533, "INV_Helmet_08", "Warlord's Silk Cowl"},
    {9470, "INV_Banner_01", "Bad Mojo Mask"},
    {19999, "INV_Helmet_47", "Bloodvine Goggles"},
    {13102, "INV_Jewelry_Ring_03", "Cassandra's Grace"},
    {23255, "INV_Helmet_08", "Champion's Dreadweave Cowl"},
    {17570, "INV_Helmet_08", "Champion's Dreadweave Hood"},
    {17610, "INV_Helmet_17", "Champion's Satin Cowl"},
    {23261, "INV_Helmet_17", "Champion's Satin Hood"},
    {23263, "INV_Helmet_06", "Champion's Silk Cowl"},
    {16489, "INV_Helmet_06", "Champion's Silk Hood"},
    {11839, "INV_Helmet_44", "Chief Architect's Monocle"},
    {10574, "INV_Misc_Cape_04", "Corpseshroud"},
    {18727, "INV_Helmet_51", "Crimson Felt Hat"},
    {13986, "INV_Crown_01", "Crown of Caer Darrow"},
    {18526, "INV_Crown_01", "Crown of the Ogre King"},
    {16693, "INV_Crown_01", "Devout Crown"},
    {22225, "INV_Helmet_27", "Dragonskin Cowl"},
    {16698, "INV_Helmet_29", "Dreadmist Mask"},
    {10041, "INV_Crown_01", "Dreamweave Circlet"},
    {9492, "INV_Gizmo_01", "Electromagnetic Gigaflux Reactivator"},
    {7691, "INV_Helmet_28", "Embalmed Shroud"},
    {17715, "INV_Crown_01", "Eye of Theradras"},
    {19105, "INV_Helmet_61", "Frost Runed Headdress"},
    {10751, "INV_Crown_01", "Gemburst Circlet"},
    {10504, "INV_Helmet_44", "Green Lens"},
    {2721, "INV_Helmet_16", "Holy Shroud"},
    {22302, "INV_Helmet_30", "Ironweave Cowl"},
    {16416, "INV_Helmet_24", "Lieutenant Commander's Crown"},
    {17598, "INV_Helmet_24", "Lieutenant Commander's Diadem"},
    {23310, "INV_Helmet_08", "Lieutenant Commander's Dreadweave Cowl"},
    {17566, "INV_Helmet_24", "Lieutenant Commander's Headguard"},
    {23316, "INV_Helmet_17", "Lieutenant Commander's Satin Hood"},
    {23318, "INV_Helmet_06", "Lieutenant Commander's Silk Cowl"},
    {16686, "INV_Crown_02", "Magister's Crown"},
    {9429, "INV_Helmet_15", "Miner's Hat of the Deep"},
    {14140, "INV_Misc_Bandana_01", "Mooncloth Circlet"},
    {9431, "INV_Helmet_28", "Papal Fez"},
    {10630, "INV_Crown_01", "Soulcatcher Halo"},
    {22267, "INV_Helmet_62", "Spellweaver's Turban"},
    {12604, "INV_Crown_02", "Starfire Tiara"},
    {22757, "INV_Crown_01", "Sylvan Crown"},
    {19886, "INV_Mask_02", "The Hexxer's Cover"},
    {13390, "INV_Misc_Bandage_15", "The Postmaster's Band"},
    {7720, "INV_Helmet_12", "Whitemane's Chapeau"},
    {22720, "INV_Helmet_61", "Zulian Headdress"},
    {9940, "INV_Helmet_29", "Abjurer's Hood"},
    {10030, "INV_Helmet_29", "Admiral's Hat"},
    {14293, "INV_Crown_01", "Arachnidian Circlet"},
    {8292, "INV_Helmet_11", "Arcane Cover"},
    {2620, "INV_Misc_Cape_04", "Augural Shroud"},
    {4041, "INV_Helmet_33", "Aurora Cowl"},
    {10024, "INV_Misc_Bandana_01", "Black Mageweave Headband"},
    {12185, "INV_Helmet_66", "Bloodsail Admiral's Hat"},
    {14263, "INV_Misc_Bandana_03", "Bloodwoven Mask"},
    {14307, "INV_Crown_02", "Bonecaster's Crown"},
    {10499, "INV_Helmet_47", "Bright-Eye Goggles"},
    {10501, "INV_Helmet_47", "Catseye Ultra Goggles"},
    {14312, "INV_Crown_01", "Celestial Crown"},
    {5624, "INV_Crown_01", "Circlet of the Order"},
    {9849, "INV_Helmet_32", "Conjurer's Hood"},
    {10097, "INV_Crown_01", "Councillor's Circlet"},
    {2621, "INV_Helmet_30", "Cowl of Necromancy"},
    {4393, "INV_Helmet_44", "Craftsman's Monocle"},
    {13216, "INV_Helmet_06", "Crown of the Penitent"},
    {14246, "INV_Helmet_11", "Darkmist Wizard Hat"},
    {10506, "INV_Helmet_49", "Deepdive Helmet"},
    {3556, "INV_Helmet_14", "Dread Mage Hat"},
    {10289, "INV_Helmet_15", "Durable Hat"},
    {10061, "INV_Helmet_32", "Duskwoven Turban"},
    {7357, "INV_Helmet_15", "Elder's Hat"},
    {10219, "INV_Crown_01", "Elegant Circlet"},
    {14460, "INV_Helmet_21", "Elunarian Diadem"},
    {14228, "INV_Belt_32", "Embersilk Coronet"},
    {4322, "INV_Helmet_31", "Enchanter's Cowl"},
    {14332, "INV_Helmet_06", "Eternal Crown"},
    {14111, "INV_Helmet_34", "Felcloth Hood"},
    {10500, "INV_Helmet_47", "Fire Goggles"},
    {2955, "INV_Helmet_30", "First Mate Hat"},
    {4368, "INV_Helmet_47", "Flying Tiger Goggles"},
    {14271, "INV_Belt_31", "Gaea's Circlet"},
    {14220, "INV_Belt_23", "Geomancer's Cap"},
    {10545, "INV_Helmet_47", "Gnomish Goggles"},
    {10726, "INV_Helmet_49", "Gnomish Mind Control Cap"},
    {10543, "INV_Helmet_60", "Goblin Construction Helmet"},
    {10588, "INV_Helmet_49", "Goblin Rocket Helmet"},
    {7520, "INV_Helmet_13", "Gossamer Headpiece"},
    {4385, "INV_Helmet_47", "Green Tinted Goggles"},
    {10782, "INV_Helmet_38", "Hakkari Shroud"},
    {8115, "INV_Helmet_32", "Hibernal Cowl"},
    {10139, "INV_Crown_02", "High Councillor's Circlet"},
    {14449, "INV_Crown_01", "Highborne Crown"},
    {2623, "INV_Crown_01", "Holy Diadem"},
    {8254, "INV_Crown_01", "Imperial Red Circlet"},
    {5608, "INV_Helmet_04", "Living Cowl"},
    {19972, "INV_Helmet_31", "Lucky Fishing Hat"},
    {14252, "INV_Belt_22", "Lunar Coronet"},
    {16008, "INV_Helmet_47", "Master Engineer's Goggles"},
    {10250, "INV_Helmet_51", "Master's Hat"},
    {6429, "INV_Helmet_11", "Mistscape Wizard Hat"},
    {10175, "INV_Helmet_61", "Mystical Headwrap"},
    {4039, "INV_Helmet_30", "Nightsky Cowl"},
    {2622, "INV_Helmet_04", "Nimar's Tribal Headdress"},
    {14281, "INV_Belt_16", "Opulent Crown"},
    {14189, "INV_Helmet_29", "Raincaller Cap"},
    {10033, "INV_Misc_Bandana_03", "Red Mageweave Headband"},
    {7470, "INV_Helmet_11", "Regal Wizard Hat"},
    {14401, "INV_Helmet_34", "Resilient Cap"},
    {14322, "INV_Helmet_01", "Resplendent Circlet"},
    {10503, "INV_Helmet_47", "Rose Colored Goggles"},
    {9915, "INV_Misc_Bandana_01", "Royal Headband"},
    {13866, "INV_Misc_Bandana_03", "Runecloth Headband"},
    {10288, "INV_Misc_Bandana_01", "Sage's Circlet"},
    {4373, "INV_Helmet_47", "Shadow Goggles"},
    {4323, "INV_Helmet_27", "Shadow Hood"},
    {10025, "INV_Helmet_27", "Shadoweave Mask"},
    {3345, "INV_Helmet_15", "Silk Wizard Hat"},
    {14421, "INV_Belt_11", "Silksand Circlet"},
    {9878, "INV_Helmet_51", "Sorcerer Hat"},
    {9653, "INV_Helmet_47", "Speedy Racer Goggles"},
    {10502, "INV_Helmet_47", "Spellpower Goggles Xtreme"},
    {15999, "INV_Helmet_47", "Spellpower Goggles Xtreme Plus"},
    {14410, "INV_Belt_26", "Stonecloth Circlet"},
    {2624, "INV_Helmet_04", "Thinking Cap"},
    {14200, "INV_Helmet_31", "Thistlefur Cap"},
    {7432, "INV_Helmet_29", "Twilight Cowl"},
    {20408, "INV_Helmet_27", "Twilight Cultist Cowl"},
    {14441, "INV_Helmet_32", "Venomshroud Mask"},
    {14208, "INV_Belt_25", "Vital Headband"},
    {14178, "INV_Helmet_32", "Watcher's Cap"},
    {10008, "INV_Misc_Cape_11", "White Bandit Mask"},
    {14436, "INV_Helmet_13", "Windchaser Coronet"},
    {14130, "INV_Helmet_63", "Wizardweave Turban"},
    {7048, "INV_Helmet_29", "Azure Silk Hood"},
    {23323, "INV_Helmet_08", "Crown of the Fire Festival"},
    {3892, "INV_Helmet_33", "Embroidered Hat"},
    {12064, "INV_Helmet_29", "Gamemaster Hood"},
    {3732, "INV_Helmet_34", "Hooded Cowl"},
    {7996, "INV_Helmet_31", "Lucky Fishing Hat"},
    {3889, "INV_Helmet_33", "Russet Hat"},
    {7050, "INV_Misc_Bandana_01", "Silk Headband"},
    {8749, "INV_Helmet_15", "Crochet Hat"},
    {8746, "INV_Helmet_28", "Interlaced Cowl"},
    {8754, "INV_Helmet_33", "Twill Cover"}
  };
  
  /**
   * Returns all IDs, that are used by Cloth-Heads.
   * @return  An Array of Integers, that represents all IDs, that are used by Cloth-Heads.
   * @since 1.0
   */
  public static int[] getIDs() {
    int[] res = new int[heads.length];
    for (int i = 0; i < heads.length; i++) {
      res[i] = (int)heads[i][0];
    }
    return res;
  }
  
  /**
   * Returns all Icons, that are used by Cloth-Heads.
   * @return  An Array of Strings, that represents all Icons, that are used by Cloth-Heads by 
   *     stating their Name.
   * @since 1.0
   */
  public static String[] getIcons() {
    String[] res = new String[heads.length];
    for (int i = 0; i < heads.length; i++) {
      res[i] = (String)heads[i][1];
    }
    return res;
  }
  
  /**
   * Returns all Names of Cloth-Heads in the Game.
   * @return  The Name of all Cloth-Heads in the Game as an Array of Strings.
   * @since 1.0
   */
  public static String[] getNames() {
    String[] res = new String[heads.length];
    for (int i = 0; i < heads.length; i++) {
      res[i] = (String)heads[i][2];
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
