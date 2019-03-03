package db.weapon.twohanded;

/**
 * The Class, that stores every single Staff in the game with Values to search their Stats in 
 * the Database.
 * @author Haeldeus
 * @version 1.0
 */
public class Staff {

  /**
   * All Staves stored as a Matrix of Objects. The Staves will be saved in the following way:
   * <br/> [id][Icon][Name]
   * <br/> [id][Icon][Name]
   * <br/> :
   * <br/> :
   * <br/> :
   */
  private static Object[][] staves = {
    {22589, "INV_Staff_Medivh", "Atiesh, Greatstaff of the Guardian"},
    {22630, "INV_Staff_Medivh", "Atiesh, Greatstaff of the Guardian"},
    {22631, "INV_Staff_Medivh", "Atiesh, Greatstaff of the Guardian"},
    {22632, "INV_Staff_Medivh", "Atiesh, Greatstaff of the Guardian"},
    {19879, "INV_Staff_31", "Alex's Test Beatdown Staff"},
    {17113, "INV_Staff_Goldfeathered_01", "Amberseal Keeper"},
    {18609, "INV_Staff_12", "Anathema"},
    {18608, "INV_Staff_30", "Benediction"},
    {21273, "INV_Staff_20", "Blessed Qiraji Acolyte Staff"},
    {21275, "INV_Staff_20", "Blessed Qiraji Augur Staff"},
    {22800, "INV_Staff_13", "Brimstone Staff"},
    {944, "INV_Staff_07", "Elemental Mage Staff"},
    {812, "INV_Staff_29", "Glowing Brightwood Staff"},
    {18873, "INV_Staff_14", "Grand Marshal's Stave"},
    {13937, "INV_Jewelry_Talisman_12", "Headmaster's Charge"},
    {18874, "INV_Misc_Bone_ElfSkull_01", "High Warlord's War Staff"},
    {20069, "INV_Wand_04", "Ironbark Staff"},
    {20220, "INV_Wand_04", "Ironbark Staff"},
    {19884, "INV_Staff_33", "Jin'do's Judgement"},
    {18715, "INV_Staff_21", "Lok'delar, Stave of the Ancient Keepers"},
    {20487, "INV_Staff_21", "Lok'delar, Stave of the Ancient Keepers DEP"},
    {19944, "INV_Fishingpole_02", "Nat Pagle's Fish Terminator"},
    {19355, "INV_Staff_13", "Shadow Wing Focus Staff"},
    {22799, "INV_Staff_15", "Soulseeker"},
    {22801, "INV_Staff_31", "Spire of Twilight"},
    {18842, "INV_Staff_13", "Staff of Dominance"},
    {873, "INV_Staff_13", "Staff of Jordan"},
    {20581, "INV_Staff_36", "Staff of Rampant Growth"},
    {21128, "INV_Staff_01", "Staff of the Qiraji Prophets"},
    {21452, "INV_Staff_12", "Staff of the Ruins"},
    {19356, "INV_Staff_06", "Staff of the Shadow Flame"},
    {943, "INV_Staff_29", "Warden Staff"},
    {19909, "INV_Staff_35", "Will of Arlokk"},
    {19566, "INV_Staff_25", "Advisor's Gnarled Staff"},
    {19567, "INV_Staff_25", "Advisor's Gnarled Staff"},
    {19568, "INV_Staff_25", "Advisor's Gnarled Staff"},
    {19569, "INV_Staff_25", "Advisor's Gnarled Staff"},
    {20425, "INV_Staff_25", "Advisor's Gnarled Staff"},
    {20654, "INV_Staff_11", "Amethyst War Staff"},
    {13249, "INV_Staff_13", "Argent Crusader"},
    {937, "INV_Staff_13", "Black Duskwood Staff"},
    {10627, "INV_Staff_28", "Bludgeon of the Grinning Dog"},
    {9517, "INV_Staff_14", "Celestial Stave"},
    {19102, "INV_Staff_20", "Crackling Staff"},
    {6505, "INV_Staff_04", "Crescent Staff"},
    {15854, "INV_Staff_07", "Dancing Sliver"},
    {5201, "INV_Staff_13", "Emberstone Staff"},
    {791, "INV_Staff_02", "Gnarled Ash Staff"},
    {11932, "INV_Staff_30", "Guiding Stave of Wisdom"},
    {9452, "INV_Staff_15", "Hydrocane"},
    {7713, "INV_Wand_04", "Illusionary Rod"},
    {9408, "INV_Staff_28", "Ironshod Bludgeon"},
    {11750, "INV_Staff_18", "Kindling Stave"},
    {6631, "INV_Staff_25", "Living Root"},
    {7710, "INV_Staff_18", "Loksey's Training Stick"},
    {22335, "INV_Staff_07", "Lord Valthalak's Staff of Command"},
    {19570, "INV_Staff_28", "Lorekeeper's Staff"},
    {19571, "INV_Staff_28", "Lorekeeper's Staff"},
    {19572, "INV_Staff_28", "Lorekeeper's Staff"},
    {19573, "INV_Staff_28", "Lorekeeper's Staff"},
    {20434, "INV_Staff_28", "Lorekeeper's Staff"},
    {22458, "INV_Staff_28", "Moonshadow Stave"},
    {6318, "INV_Staff_27", "Odo's Ley Staff"},
    {18311, "INV_Staff_14", "Quel'dorai Channeling Rod"},
    {22406, "INV_Staff_23", "Redemption"},
    {17743, "INV_Staff_Goldfeathered_01", "Resurgence Rod"},
    {18534, "INV_Staff_32", "Rod of the Ogre Magi"},
    {1155, "INV_Staff_06", "Rod of the Sleepwalker"},
    {13372, "INV_Staff_08", "Slavedriver's Cane"},
    {20536, "INV_Sword_48", "Soul Harvester"},
    {1607, "Spell_Shadow_Haunting", "Soulkeeper"},
    {10844, "INV_Staff_32", "Spire of Hakkar"},
    {12532, "INV_Wand_07", "Spire of the Stoneshaper"},
    {23124, "INV_Staff_07", "Staff of Balzaphon"},
    {13000, "INV_Staff_23", "Staff of Hale Magefire"},
    {22394, "INV_Staff_29", "Staff of Metanoia"},
    {2271, "INV_Staff_31", "Staff of the Blessed Seer"},
    {3415, "INV_Staff_32", "Staff of the Friar"},
    {2549, "INV_Staff_25", "Staff of the Shade"},
    {2042, "INV_Staff_10", "Staff of Westfall"},
    {1720, "INV_Staff_25", "Tanglewood Staff"},
    {9477, "INV_Staff_Goldfeathered_01", "The Chief's Enforcer"},
    {13161, "INV_Staff_29", "Trindlehaven Staff"},
    {890, "INV_Staff_04", "Twisted Chanter's Staff"},
    {19101, "INV_Staff_30", "Whiteout Staff"},
    {20556, "INV_Staff_Goldfeathered_01", "Wildstaff"},
    {6689, "INV_Staff_01", "Wind Spirit Staff"},
    {7757, "INV_Wand_07", "Windweaver Staff"},
    {9482, "INV_Staff_31", "Witch Doctor's Cane"},
    {1484, "INV_Wand_04", "Witching Stave"},
    {20258, "INV_Staff_34", "Zulian Ceremonial Staff"},
    {18082, "INV_Staff_10", "Zum'rah's Vexing Cane"},
    {3185, "INV_Staff_10", "Acrobatic Staff"},
    {9514, "INV_Staff_10", "Arcane Staff"},
    {6215, "INV_Staff_08", "Balanced Fighting Stick"},
    {12251, "INV_Staff_21", "Big Stick"},
    {1998, "INV_Staff_18", "Bloodscalp Channeling Staff"},
    {5340, "INV_Staff_08", "Cauldron Stirrer"},
    {3452, "INV_Staff_07", "Ceranium Rod"},
    {4437, "INV_Staff_14", "Channeler's Staff"},
    {16894, "INV_Wand_07", "Clear Crystal Rod"},
    {20724, "INV_Staff_07", "Corrupted Blackwood Staff"},
    {2013, "INV_Staff_26", "Cryptbone Staff"},
    {3446, "INV_Staff_16", "Darkwood Staff"},
    {1928, "INV_Staff_18", "Defias Mage Staff"},
    {15274, "INV_Staff_26", "Diviner Long Staff"},
    {2072, "INV_Staff_04", "Dwarven Magestaff"},
    {10698, "INV_Staff_13", "Enchanted Azsharite Felbane Staff"},
    {1405, "INV_Staff_06", "Foamspittle Staff"},
    {1539, "INV_Staff_17", "Gnarled Hermit's Staff"},
    {9603, "INV_Staff_22", "Gritroot Staff"},
    {1317, "INV_Staff_16", "Hardened Root Staff"},
    {2950, "INV_Staff_15", "Icicle Rod"},
    {2280, "INV_Staff_06", "Kam's Walking Stick"},
    {1300, "INV_Wand_07", "Lesser Staff of the Spire"},
    {9513, "INV_Staff_21", "Ley Staff"},
    {2077, "INV_Wand_06", "Magician Staff"},
    {15276, "INV_Staff_14", "Magus Long Staff"},
    {4575, "INV_Staff_31", "Medicine Staff"},
    {866, "INV_Staff_08", "Monk's Staff"},
    {3227, "INV_Staff_12", "Nightbane Staff"},
    {4134, "INV_Staff_13", "Nimboya's Mystical Staff"},
    {15397, "INV_Staff_08", "Oakthrush Staff"},
    {2226, "INV_Wand_06", "Ogremage Staff"},
    {16889, "INV_Staff_20", "Polished Walking Staff"},
    {1391, "INV_Wand_11", "Riverpaw Mystic Staff"},
    {1473, "INV_Staff_08", "Riverside Staff"},
    {11857, "INV_Staff_11", "Sanctimonial Rod"},
    {17004, "INV_Staff_10", "Sarah's Guide"},
    {15278, "INV_Staff_03", "Solstice Staff"},
    {1664, "INV_Staff_28", "Spellforce Rod"},
    {9527, "INV_Wand_11", "Spellshifter Rod"},
    {1613, "INV_Staff_03", "Spiritchaser Staff"},
    {1933, "INV_Staff_13", "Staff of Conjuring"},
    {15106, "INV_Staff_12", "Staff of Dar'Orahil"},
    {880, "INV_Staff_25", "Staff of Horrors"},
    {10826, "INV_Staff_27", "Staff of Lore"},
    {3902, "INV_Wand_04", "Staff of Nobles"},
    {15105, "INV_Staff_14", "Staff of Noh'Orahil"},
    {15444, "INV_Staff_Goldfeathered_01", "Staff of Orgrimmar"},
    {12252, "INV_Staff_07", "Staff of Protection"},
    {15109, "INV_Staff_09", "Staff of Soran'ruk"},
    {5613, "INV_Staff_23", "Staff of the Purifier"},
    {18353, "INV_Staff_08", "Stoneflower Staff"},
    {9683, "INV_Staff_25", "Strength of the Treant"},
    {4566, "INV_Staff_08", "Sturdy Quarterstaff"},
    {15275, "INV_Staff_03", "Thaumaturgist Staff"},
    {5306, "INV_Staff_Goldfeathered_01", "Wind Rider Staff"},
    {2527, "INV_Wand_07", "Battle Staff"},
    {35, "INV_Staff_08", "Bent Staff"},
    {4938, "INV_Staff_21", "Blemished Wooden Staff"},
    {1388, "INV_Staff_22", "Crooked Staff"},
    {4961, "INV_Staff_22", "Dreamwatcher Staff"},
    {7094, "INV_Staff_09", "Driftwood Branch"},
    {5776, "INV_Staff_17", "Elder's Cane"},
    {3277, "INV_Staff_13", "Executor Staff"},
    {3335, "INV_Staff_08", "Farmer's Broom"},
    {2067, "INV_Staff_15", "Frostbit Staff"},
    {2257, "INV_Staff_11", "Frostmane Staff"},
    {1010, "INV_Staff_17", "Gnarled Short Staff"},
    {2030, "INV_Staff_10", "Gnarled Staff"},
    {3661, "INV_Staff_21", "Handcrafted Staff"},
    {767, "INV_Staff_08", "Long Bo Staff"},
    {928, "INV_Staff_20", "Long Staff"},
    {1159, "INV_Staff_08", "Militia Quarterstaff"},
    {5778, "INV_Staff_02", "Primitive Walking Stick"},
    {854, "INV_Staff_17", "Quarter Staff"},
    {2132, "INV_Staff_02", "Short Staff"},
    {5581, "INV_Staff_11", "Smooth Walking Staff"},
    {5393, "INV_Staff_09", "Thistlewood Staff"},
    {3327, "INV_Staff_21", "Vile Fin Oracle Staff"},
    {2495, "INV_Staff_08", "Walking Stick"},
    {2535, "INV_Staff_14", "War Staff"},
    {1822, "INV_Staff_08", "Cedar Walking Stick"},
    {1813, "INV_Staff_08", "Chipped Quarterstaff"},
    {4024, "INV_Staff_18", "Heavy War Staff"},
    {3784, "INV_Staff_10", "Metal Stave"},
    {1831, "INV_Staff_08", "Oaken War Staff"},
    {1515, "INV_Staff_09", "Rough Wooden Staff"},
    {13823, "INV_Staff_18", "Stout War Staff"},
    {1411, "INV_Staff_02", "Withered Staff"}
  };
  
  /**
   * Returns all IDs, that are used by Staves.
   * @return  An Array of Integers, that represents all IDs, that are used by Staves.
   * @since 1.0
   */
  public static int[] getIDs() {
    int[] res = new int[staves.length];
    for (int i = 0; i < staves.length; i++) {
      res[i] = (int)staves[i][0];
    }
    return res;
  }
  
  /**
   * Returns all Icons, that are used by Staves.
   * @return  An Array of Strings, that represents all Icons, that are used by Staves by 
   *     stating their Name.
   * @since 1.0
   */
  public static String[] getIcons() {
    String[] res = new String[staves.length];
    for (int i = 0; i < staves.length; i++) {
      res[i] = (String)staves[i][1];
    }
    return res;
  }
  
  /**
   * Returns all Names of Staves in the Game.
   * @return  The Name of all Staves in the Game as an Array of Strings.
   * @since 1.0
   */
  public static String[] getNames() {
    String[] res = new String[staves.length];
    for (int i = 0; i < staves.length; i++) {
      res[i] = (String)staves[i][2];
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
