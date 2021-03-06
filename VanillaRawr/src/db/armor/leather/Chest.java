package db.armor.leather;

/**
 * The Class, that stores every single Leather-Chest in the game with Values to search their Stats 
 * in the Database.
 * @author Haeldeus
 * @version 1.0
 */
public class Chest {

  /**
   * All Leather-Chests stored as a Matrix of Objects. The Chests will be saved in the following 
   * way:
   * <br/> [id][Icon][Name]
   * <br/> [id][Icon][Name]
   * <br/> :
   * <br/> :
   * <br/> :
   */
  private static Object[][] chests = {
    {16905, "INV_Chest_Cloth_07", "Bloodfang Chestpiece"},
    {22476, "INV_Chest_Plate02", "Bonescythe Breastplate"},
    {12757, "INV_Chest_Chain_13", "Breastplate of Bloodthirst"},
    {22009, "INV_Chest_Leather_07", "Darkmantle Tunic"},
    {21364, "INV_Chest_Leather_08", "Deathdealer's Vest"},
    {22488, "INV_Chest_Chain_15", "Dreamwalker Tunic"},
    {22113, "INV_Chest_Plate06", "Feralheart Vest"},
    {16452, "INV_Chest_Cloth_07", "Field Marshal's Dragonhide Breastplate"},
    {16453, "INV_Chest_Cloth_07", "Field Marshal's Leather Chestpiece"},
    {21357, "INV_Chest_Leather_08", "Genesis Vest"},
    {23226, "INV_Chest_Leather_02", "Ghoul Skin Tunic"},
    {19439, "INV_Chest_Leather_03", "Interlaced Shadow Jerkin"},
    {19405, "INV_Chest_Leather_08", "Malfurion's Blessed Bulwark"},
    {16820, "INV_Chest_Cloth_07", "Nightslayer Chestpiece"},
    {22661, "INV_Chest_Cloth_08", "Polar Tunic"},
    {16897, "INV_Chest_Chain_16", "Stormrage Chestguard"},
    {21467, "INV_Chest_Leather_07", "Thick Silithid Chestguard"},
    {21680, "INV_Chest_Cloth_45", "Vest of Swift Execution"},
    {16549, "INV_Chest_Chain_16", "Warlord's Dragonhide Hauberk"},
    {16563, "INV_Chest_Chain_16", "Warlord's Leather Breastplate"},
    {19838, "INV_Chest_Leather_06", "Zandalar Haruspex's Tunic"},
    {19834, "INV_Chest_Leather_10", "Zandalar Madcap's Tunic"},
    {10399, "INV_Chest_Leather_08", "Blackened Defias Armor"},
    {19688, "INV_Chest_Leather_07", "Blood Tiger Breastplate"},
    {14637, "INV_Chest_Leather_03", "Cadaverous Armor"},
    {18373, "INV_Chest_Leather_08", "Chestplate of Tranquility"},
    {13009, "INV_Chest_Leather_06", "Cow King's Hide"},
    {8349, "INV_Chest_Leather_06", "Feathered Breastplate"},
    {22272, "INV_Chest_Leather_08", "Forest's Embrace"},
    {17742, "INV_Chest_Leather_08", "Fungus Shroud Armor"},
    {1489, "INV_Chest_Leather_08", "Gloomshroud Armor"},
    {22274, "INV_Chest_Leather_08", "Grizzled Pelt"},
    {15066, "INV_Chest_Leather_06", "Ironfeather Breastplate"},
    {9473, "INV_Chest_Leather_05", "Jinxed Hoodoo Skin"},
    {23294, "INV_Chest_Leather_07", "Knight-Captain's Dragonhide Chestpiece"},
    {16421, "INV_Chest_Leather_10", "Knight-Captain's Dragonhide Tunic"},
    {16417, "INV_Chest_Leather_07", "Knight-Captain's Leather Armor"},
    {23298, "INV_Chest_Leather_05", "Knight-Captain's Leather Chestpiece"},
    {16504, "INV_Chest_Leather_07", "Legionnaire's Dragonhide Breastplate"},
    {22877, "INV_Chest_Leather_07", "Legionnaire's Dragonhide Chestpiece"},
    {22879, "INV_Chest_Leather_05", "Legionnaire's Leather Chestpiece"},
    {16505, "INV_Chest_Leather_05", "Legionnaire's Leather Hauberk"},
    {15059, "INV_Chest_Plate07", "Living Breastplate"},
    {12793, "INV_Chest_Leather_01", "Mixologist's Tunic"},
    {12603, "INV_Chest_Plate06", "Nightbrace Tunic"},
    {19685, "INV_Chest_Leather_03", "Primal Batskin Jerkin"},
    {10583, "INV_Chest_Leather_08", "Quillward Harness"},
    {16721, "INV_Chest_Leather_07", "Shadowcraft Tunic"},
    {13378, "INV_Chest_Cloth_38", "Songbird Blouse"},
    {9406, "INV_Chest_Leather_08", "Spirewind Fetter"},
    {12988, "INV_Chest_Leather_10", "Starsight Tunic"},
    {15056, "INV_Chest_Leather_08", "Stormshroud Armor"},
    {13944, "INV_Chest_Chain_17", "Tombstone Breastplate"},
    {22409, "INV_Chest_Leather_08", "Tunic of the Crescent Moon"},
    {23089, "INV_Chest_Leather_06", "Tunic of Undead Slaying"},
    {2041, "INV_Chest_Leather_07", "Tunic of Westfall"},
    {15064, "INV_Chest_Leather_04", "Warbear Harness"},
    {16706, "INV_Chest_Plate06", "Wildheart Vest"},
    {13110, "INV_Chest_Leather_04", "Wolffear Harness"},
    {10264, "INV_Chest_Leather_07", "Adventurer's Tunic"},
    {9854, "INV_Chest_Leather_08", "Archer's Jerkin"},
    {6473, "INV_Shirt_16", "Armor of the Fang"},
    {9782, "INV_Shirt_11", "Bandit Jerkin"},
    {6552, "INV_Shirt_11", "Bard's Tunic"},
    {5316, "INV_Shirt_05", "Barkshell Tunic"},
    {20575, "INV_Chest_Cloth_45", "Black Whelp Tunic"},
    {11193, "INV_Chest_Leather_02", "Blazewind Breastplate"},
    {3431, "INV_Chest_Leather_02", "Bone-studded Leather"},
    {17005, "INV_Shirt_13", "Boorguard Tunic"},
    {15471, "INV_Chest_Leather_01", "Brawnhide Armor"},
    {14570, "INV_Chest_Leather_08", "Bristlebark Blouse"},
    {3000, "INV_Chest_Leather_09", "Brood Mother Carapace"},
    {2961, "INV_Shirt_09", "Burnt Leather Vest"},
    {7527, "INV_Chest_Leather_05", "Cabalist Chestpiece"},
    {3585, "INV_Chest_Leather_08", "Camouflaged Tunic"},
    {3313, "INV_Chest_Leather_04", "Ceremonial Leather Harness"},
    {19127, "INV_Chest_Leather_03", "Charred Leather Tunic"},
    {9950, "INV_Chest_Leather_05", "Chieftain's Breastplate"},
    {15075, "INV_Chest_Leather_07", "Chimeric Vest"},
    {15130, "INV_Chest_Leather_04", "Cutthroat's Vest"},
    {2317, "INV_Chest_Leather_03", "Dark Leather Tunic"},
    {6603, "INV_Chest_Leather_01", "Dervish Tunic"},
    {14581, "INV_Chest_Leather_01", "Dokebi Chestguard"},
    {5317, "INV_Shirt_06", "Dry Moss Tunic"},
    {7374, "INV_Chest_Leather_03", "Dusky Leather Armor"},
    {6396, "INV_Chest_Leather_08", "Emblazoned Chestpiece"},
    {2300, "INV_Chest_Leather_09", "Embossed Leather Vest"},
    {15311, "INV_Chest_Leather_04", "Feral Harness"},
    {15786, "INV_Chest_Leather_06", "Fernpulse Jerkin"},
    {4243, "INV_Chest_Leather_09", "Fine Leather Tunic"},
    {6085, "INV_Chest_Leather_09", "Footman Tunic"},
    {3055, "INV_Chest_Leather_08", "Forest Leather Chestpiece"},
    {15068, "INV_Chest_Chain_10", "Frostsaber Tunic"},
    {15144, "INV_Chest_Plate01", "Ghostwalker Rags"},
    {4058, "INV_Chest_Leather_07", "Glyphed Breastplate"},
    {1211, "INV_Chest_Leather_04", "Gnoll War Harness"},
    {15195, "INV_Chest_Leather_05", "Grand Breastplate"},
    {4255, "INV_Chest_Leather_08", "Green Leather Armor"},
    {7375, "INV_Chest_Chain_09", "Green Whelp Armor"},
    {15304, "INV_Chest_Leather_01", "Grizzly Jerkin"},
    {7335, "INV_Chest_Leather_06", "Grizzly Tunic"},
    {4256, "INV_Chest_Leather_08", "Guardian Armor"},
    {9757, "INV_Shirt_06", "Gypsy Tunic"},
    {10781, "INV_Chest_Leather_02", "Hakkari Breastplate"},
    {2087, "INV_Chest_Wolf", "Hard Crawler Carapace"},
    {14592, "INV_Chest_Leather_06", "Hawkeye's Tunic"},
    {15356, "INV_Chest_Leather_08", "Headhunter's Armor"},
    {8119, "INV_Chest_Leather_02", "Heraldic Breastplate"},
    {4244, "INV_Chest_Leather_10", "Hillman's Leather Vest"},
    {2973, "INV_Chest_Wolf", "Hunting Tunic"},
    {9887, "INV_Chest_Leather_07", "Huntsman's Armor"},
    {18478, "INV_Chest_Leather_06", "Hyena Hide Jerkin"},
    {6430, "INV_Chest_Leather_07", "Imperial Leather Breastplate"},
    {15164, "INV_Chest_Leather_05", "Imposing Vest"},
    {14680, "INV_Chest_Leather_02", "Indomitable Vest"},
    {7407, "INV_Chest_Leather_03", "Infiltrator Armor"},
    {2985, "INV_Chest_Leather_09", "Inscribed Leather Breastplate"},
    {4057, "INV_Chest_Leather_06", "Insignia Chestguard"},
    {15390, "INV_Chest_Plate07", "Jadefire Chestguard"},
    {19042, "INV_Chest_Leather_08", "Jangdor's Handcrafted Tunic"},
    {14664, "INV_Chest_Leather_02", "Keeper's Armor"},
    {17922, "INV_Chest_Fur", "Lionfur Armor"},
    {6197, "INV_Chest_Wolf", "Loch Croc Hide Vest"},
    {15018, "INV_Chest_Fur", "Lupine Vest"},
    {10151, "INV_Chest_Cloth_05", "Mighty Tunic"},
    {6709, "INV_Chest_Leather_09", "Moonglow Vest"},
    {5781, "INV_Chest_Chain_12", "Murloc Scale Breastplate"},
    {8175, "INV_Chest_Leather_03", "Nightscape Tunic"},
    {10220, "INV_Chest_Leather_02", "Nightshade Tunic"},
    {15159, "INV_Chest_Leather_05", "Nocturnal Tunic"},
    {6670, "INV_Chest_Leather_01", "Panther Armor"},
    {15346, "INV_Chest_Cloth_15", "Pathfinder Vest"},
    {15433, "INV_Chest_Leather_02", "Peerless Armor"},
    {6268, "INV_Shirt_06", "Pioneer Tunic"},
    {11876, "INV_Chest_Leather_07", "Plainstalker Tunic"},
    {15170, "INV_Chest_Chain_13", "Potent Armor"},
    {15179, "INV_Chest_Chain_07", "Praetorian Padded Armor"},
    {19041, "INV_Chest_Leather_07", "Pratt's Handcrafted Tunic"},
    {14670, "INV_Chest_Leather_02", "Pridelord Armor"},
    {15010, "INV_Chest_Leather_04", "Primal Wraps"},
    {14562, "INV_Chest_Leather_09", "Prospector's Chestpiece"},
    {15381, "INV_Chest_Leather_05", "Rageclaw Chestguard"},
    {7477, "INV_Chest_Leather_08", "Ranger Tunic"},
    {4455, "INV_Chest_Leather_04", "Raptor Hide Harness"},
    {4119, "INV_Chest_Leather_07", "Raptor Hunter Tunic"},
    {3566, "INV_Chest_Leather_01", "Raptorbane Armor"},
    {3750, "INV_Chest_Leather_09", "Ribbed Breastplate"},
    {10070, "INV_Chest_Chain_10", "Righteous Armor"},
    {15118, "INV_Chest_Leather_10", "Rigid Tunic"},
    {821, "INV_Shirt_07", "Riverpaw Leather Vest"},
    {15128, "INV_Chest_Cloth_05", "Robust Tunic"},
    {15090, "INV_Chest_Leather_07", "Runic Leather Armor"},
    {9835, "INV_Chest_Leather_10", "Scaled Leather Tunic"},
    {14655, "INV_Chest_Leather_07", "Scorpashi Breastplate"},
    {6584, "INV_Chest_Leather_10", "Scouting Tunic"},
    {7439, "INV_Chest_Leather_04", "Sentinel Breastplate"},
    {8258, "INV_Chest_Leather_02", "Serpentskin Armor"},
    {4861, "INV_Chest_Fur", "Sleek Feathered Tunic"},
    {5814, "INV_Chest_Leather_10", "Snapbrook Armor"},
    {2817, "INV_Shirt_10", "Soft Leather Tunic"},
    {5341, "INV_Shirt_07", "Spore-covered Tunic"},
    {9809, "INV_Chest_Leather_10", "Superior Tunic"},
    {15442, "INV_Chest_Plate06", "Supreme Breastplate"},
    {10827, "INV_Chest_Leather_05", "Surveyor's Tunic"},
    {10182, "INV_Chest_Leather_02", "Swashbuckler's Breastplate"},
    {5782, "INV_Chest_Chain_12", "Thick Murloc Armor"},
    {9924, "INV_Chest_Leather_08", "Tracker's Tunic"},
    {15825, "INV_Chest_Plate06", "Traphook Jerkin"},
    {8296, "INV_Chest_Leather_05", "Traveler's Jerkin"},
    {3288, "INV_Chest_Cloth_16", "Tribal Vest"},
    {15359, "INV_Chest_Cloth_08", "Trickster's Vest"},
    {15053, "INV_Chest_Leather_07", "Volcanic Breastplate"},
    {10105, "INV_Chest_Leather_10", "Wanderer's Armor"},
    {14601, "INV_Chest_Leather_04", "Warden's Wraps"},
    {15085, "INV_Chest_Plate06", "Wicked Leather Armor"},
    {8211, "INV_Chest_Cloth_06", "Wild Leather Vest"},
    {15376, "INV_Chest_Leather_07", "Wolf Rider's Padded Armor"},
    {15337, "INV_Chest_Cloth_15", "Wrangler's Wraps"},
    {5739, "INV_Chest_Leather_04", "Barbaric Harness"},
    {2370, "INV_Chest_Leather_04", "Battered Leather Harness"},
    {6526, "INV_Chest_Leather_04", "Battle Harness"},
    {2069, "INV_Chest_Wolf", "Black Bear Hide Vest"},
    {4968, "INV_Chest_Leather_04", "Bound Harness"},
    {6523, "INV_Chest_Leather_01", "Buckled Harness"},
    {2127, "INV_Shirt_06", "Cracked Leather Vest"},
    {2141, "INV_Chest_Leather_09", "Cuirboulli Vest"},
    {236, "INV_Chest_Leather_10", "Cured Leather Armor"},
    {85, "INV_Shirt_07", "Dirty Leather Vest"},
    {2108, "INV_Chest_Wolf", "Frostmane Leather Vest"},
    {6525, "INV_Chest_Leather_01", "Grunt's Harness"},
    {5957, "INV_Chest_Wolf", "Handstitched Leather Vest"},
    {60, "INV_Chest_Leather_09", "Layered Tunic"},
    {4929, "INV_Chest_Leather_01", "Light Scorpid Armor"},
    {2112, "INV_Chest_Leather_10", "Lumberjack Jerkin"},
    {6059, "INV_Chest_Leather_06", "Nomadic Vest"},
    {2470, "INV_Chest_Cloth_05", "Reinforced Leather Vest"},
    {799, "INV_Chest_Wolf", "Rough Leather Vest"},
    {11851, "INV_Chest_Leather_03", "Scavenger Tunic"},
    {2463, "INV_Chest_Leather_10", "Studded Doublet"},
    {6524, "INV_Chest_Leather_01", "Studded Leather Harness"},
    {846, "INV_Chest_Wolf", "Tanned Leather Jerkin"},
    {3444, "INV_Shirt_05", "Tiller's Vest"},
    {2314, "INV_Chest_Leather_10", "Toughened Leather Armor"},
    {2311, "INV_Chest_Wolf", "White Leather Jerkin"},
    {4907, "INV_Chest_Leather_09", "Woodland Tunic"},
    {3807, "INV_Chest_Leather_09", "Hardened Leather Tunic"},
    {1794, "INV_Chest_Wolf", "Patched Leather Jerkin"},
    {1364, "INV_Shirt_05", "Ragged Leather Vest"},
    {1802, "INV_Chest_Leather_09", "Rawhide Tunic"},
    {3976, "INV_Chest_Leather_09", "Smooth Leather Armor"},
    {3968, "INV_Shirt_13", "Thick Leather Tunic"},
    {1810, "INV_Chest_Leather_10", "Tough Leather Armor"},
    {1509, "INV_Shirt_05", "Warped Leather Vest"},
    {1425, "INV_Shirt_05", "Worn Leather Vest"}
  };
  
  /**
   * Returns all IDs, that are used by Leather-Chests.
   * @return  An Array of Integers, that represents all IDs, that are used by Leather-Chests.
   * @since 1.0
   */
  public static int[] getIDs() {
    int[] res = new int[chests.length];
    for (int i = 0; i < chests.length; i++) {
      res[i] = (int)chests[i][0];
    }
    return res;
  }
  
  /**
   * Returns all Icons, that are used by Leather-Chests.
   * @return  An Array of Strings, that represents all Icons, that are used by Leather-Chests by 
   *     stating their Name.
   * @since 1.0
   */
  public static String[] getIcons() {
    String[] res = new String[chests.length];
    for (int i = 0; i < chests.length; i++) {
      res[i] = (String)chests[i][1];
    }
    return res;
  }
  
  /**
   * Returns all Names of Leather-Chests in the Game.
   * @return  The Name of all Leather-Chests in the Game as an Array of Strings.
   * @since 1.0
   */
  public static String[] getNames() {
    String[] res = new String[chests.length];
    for (int i = 0; i < chests.length; i++) {
      res[i] = (String)chests[i][2];
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
