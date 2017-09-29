package db.armor.leather;

/**
 * The Class, that stores every single Leather-Hands in the game with Values to search their Stats 
 * in the Database.
 * @author Haeldeus
 * @version 1.0
 */
public class Hands {

  /**
   * All Leather-Hands stored as a Matrix of Objects. The Chests will be saved in the following way:
   * <br/> [id][Icon][Name]
   * <br/> [id][Icon][Name]
   * <br/> :
   * <br/> :
   * <br/> :
   */
  private static Object[][] hands = {
    {18823, "INV_Gauntlets_23", "Aged Core Leather Gloves"},
    {21682, "INV_Gauntlets_21", "Bile-Covered Gauntlets"},
    {16907, "INV_Gauntlets_21", "Bloodfang Gloves"},
    {22481, "INV_Gauntlets_28", "Bonescythe Gauntlets"},
    {16831, "INV_Gauntlets_07", "Cenarion Gloves"},
    {22006, "INV_Gauntlets_24", "Darkmantle Gloves"},
    {18544, "INV_Gauntlets_22", "Doomhide Gauntlets"},
    {22493, "INV_Gauntlets_25", "Dreamwalker Handguards"},
    {22110, "INV_Gauntlets_17", "Feralheart Gloves"},
    {21458, "INV_Gauntlets_24", "Gauntlets of New Life"},
    {16555, "INV_Gauntlets_25", "General's Dragonhide Gloves"},
    {16560, "INV_Gauntlets_25", "General's Leather Mitts"},
    {21689, "INV_Gauntlets_23", "Gloves of Ebru"},
    {21672, "INV_Gauntlets_17", "Gloves of Enforcement"},
    {867, "INV_Gauntlets_06", "Gloves of Holy Might"},
    {21605, "INV_Gauntlets_19", "Gloves of the Hidden Temple"},
    {16448, "INV_Gauntlets_21", "Marshal's Dragonhide Gauntlets"},
    {16454, "INV_Gauntlets_21", "Marshal's Leather Handgrips"},
    {16826, "INV_Gauntlets_21", "Nightslayer Gloves"},
    {22662, "INV_Gauntlets_06", "Polar Gloves"},
    {16899, "INV_Gauntlets_25", "Stormrage Handguards"},
    {19390, "INV_Gauntlets_19", "Taut Dragonhide Gloves"},
    {21617, "INV_Gauntlets_17", "Wasphide Gauntlets"},
    {10777, "INV_Gauntlets_32", "Arachnid Gloves"},
    {16496, "INV_Gauntlets_25", "Blood Guard's Dragonhide Gauntlets"},
    {22863, "INV_Gauntlets_25", "Blood Guard's Dragonhide Grips"},
    {22864, "INV_Gauntlets_15", "Blood Guard's Leather Grips"},
    {16499, "INV_Gauntlets_15", "Blood Guard's Leather Vices"},
    {19869, "INV_Gauntlets_26", "Blooddrenched Grips"},
    {12464, "INV_Gauntlets_19", "Bloodfire Talons"},
    {720, "INV_Gauntlets_05", "Brawler Gloves"},
    {14640, "INV_Gauntlets_15", "Cadaverous Gloves"},
    {15063, "INV_Gauntlets_26", "Devilsaur Gauntlets"},
    {7690, "INV_Gauntlets_32", "Ebon Vise"},
    {2564, "INV_Gauntlets_07", "Elven Spirit Claws"},
    {13184, "INV_Gauntlets_13", "Fallbrush Handgrips"},
    {13957, "INV_Gauntlets_09", "Gargoyle Slashers"},
    {21469, "INV_Gauntlets_05", "Gauntlets of Southwind"},
    {8346, "INV_Gauntlets_30", "Gauntlets of the Sea"},
    {21178, "INV_Gauntlets_18", "Gloves of Earthen Power"},
    {18309, "INV_Gauntlets_20", "Gloves of Restoration"},
    {18368, "INV_Gauntlets_01", "Gordok's Gloves"},
    {23081, "INV_Gauntlets_06", "Handwraps of Undead Slaying"},
    {16397, "INV_Gauntlets_26", "Knight-Lieutenant's Dragonhide Gloves"},
    {23280, "INV_Gauntlets_25", "Knight-Lieutenant's Dragonhide Grips"},
    {16396, "INV_Gauntlets_15", "Knight-Lieutenant's Leather Gauntlets"},
    {23284, "INV_Gauntlets_15", "Knight-Lieutenant's Leather Grips"},
    {12547, "INV_Gauntlets_23", "Mar Alom's Grip"},
    {888, "INV_Gauntlets_13", "Naga Battle Gloves"},
    {11665, "INV_Gauntlets_15", "Ogreseer Fists"},
    {18744, "INV_Gauntlets_18", "Plaguebat Fur Gloves"},
    {19686, "INV_Gauntlets_31", "Primal Batskin Gloves"},
    {18377, "INV_Gauntlets_21", "Quickdraw Gloves"},
    {20259, "INV_Gauntlets_25", "Shadow Panther Hide Gloves"},
    {16712, "INV_Gauntlets_24", "Shadowcraft Gloves"},
    {18238, "INV_Gauntlets_32", "Shadowskin Gloves"},
    {13395, "INV_Gauntlets_27", "Skul's Fingerbone Claws"},
    {13258, "INV_Gauntlets_22", "Slaghide Gauntlets"},
    {18344, "INV_Gauntlets_23", "Stonebark Gauntlets"},
    {21278, "INV_Gauntlets_05", "Stormshroud Gloves"},
    {19049, "INV_Gauntlets_26", "Timbermaw Brawlers"},
    {4253, "INV_Gauntlets_24", "Toughened Leather Gloves"},
    {21501, "INV_Gauntlets_24", "Toughened Silithid Hide Gloves"},
    {16717, "INV_Gauntlets_17", "Wildheart Gloves"},
    {1978, "INV_Gauntlets_04", "Wolfclaw Gloves"},
    {20661, "INV_Gauntlets_05", "Abyssal Leather Gloves"},
    {10260, "INV_Gauntlets_25", "Adventurer's Gloves"},
    {9861, "INV_Gauntlets_22", "Archer's Gloves"},
    {9780, "INV_Gauntlets_15", "Bandit Gloves"},
    {4254, "INV_Gauntlets_05", "Barbaric Gloves"},
    {6554, "INV_Gauntlets_15", "Bard's Gloves"},
    {12522, "INV_Gauntlets_05", "Bingles' Flying Gloves"},
    {1302, "INV_Gauntlets_17", "Black Whelp Gloves"},
    {10401, "INV_Gauntlets_18", "Blackened Defias Gloves"},
    {15708, "INV_Gauntlets_25", "Blight Leather Gloves"},
    {10765, "INV_Gauntlets_09", "Bonefingers"},
    {6784, "INV_Gauntlets_04", "Braced Handguards"},
    {16873, "INV_Gauntlets_25", "Braidfur Gloves"},
    {14572, "INV_Gauntlets_21", "Bristlebark Gloves"},
    {7530, "INV_Gauntlets_22", "Cabalist Gloves"},
    {3314, "INV_Gauntlets_18", "Ceremonial Leather Gloves"},
    {9952, "INV_Gauntlets_22", "Chieftain's Gloves"},
    {15074, "INV_Gauntlets_23", "Chimeric Gloves"},
    {15137, "INV_Gauntlets_22", "Cutthroat's Mitts"},
    {4248, "INV_Gauntlets_05", "Dark Leather Gloves"},
    {6605, "INV_Gauntlets_24", "Dervish Gloves"},
    {6467, "INV_Gauntlets_05", "Deviate Scale Gloves"},
    {7756, "INV_Gauntlets_07", "Dog Training Gloves"},
    {14583, "INV_Gauntlets_24", "Dokebi Gloves"},
    {16994, "INV_Gauntlets_02", "Duskwing Gloves"},
    {2036, "INV_Gauntlets_05", "Dusty Mining Gloves"},
    {6397, "INV_Gauntlets_24", "Emblazoned Gloves"},
    {15310, "INV_Gauntlets_05", "Feral Gloves"},
    {2312, "INV_Gauntlets_05", "Fine Leather Gloves"},
    {7348, "INV_Gauntlets_05", "Fletcher's Gloves"},
    {2167, "INV_Gauntlets_21", "Foreman's Gloves"},
    {3058, "INV_Gauntlets_21", "Forest Leather Gloves"},
    {15070, "INV_Gauntlets_16", "Frostsaber Gloves"},
    {15149, "INV_Gauntlets_05", "Ghostwalker Gloves"},
    {1314, "INV_Gauntlets_13", "Ghoul Fingers"},
    {9698, "INV_Gauntlets_21", "Gloves of Insight"},
    {10413, "INV_Gauntlets_18", "Gloves of the Fang"},
    {17721, "INV_Gauntlets_21", "Gloves of the Greatfather"},
    {5299, "INV_Gauntlets_18", "Gloves of the Moon"},
    {21319, "INV_Gauntlets_21", "Gloves of the Pathfinder"},
    {6419, "INV_Gauntlets_14", "Glyphed Mitts"},
    {6732, "INV_Gauntlets_15", "Gnomish Mechanic's Gloves"},
    {15192, "INV_Gauntlets_31", "Grand Gauntlets"},
    {5629, "INV_Gauntlets_05", "Hammerfist Gloves"},
    {14594, "INV_Gauntlets_21", "Hawkeye's Gloves"},
    {15355, "INV_Gauntlets_22", "Headhunter's Mitts"},
    {7359, "INV_Gauntlets_23", "Heavy Earthen Gloves"},
    {8121, "INV_Gauntlets_15", "Heraldic Gloves"},
    {7349, "INV_Gauntlets_18", "Herbalist's Gloves"},
    {4247, "INV_Gauntlets_05", "Hillman's Leather Gloves"},
    {2976, "INV_Gauntlets_05", "Hunting Gloves"},
    {9892, "INV_Gauntlets_15", "Huntsman's Gloves"},
    {4063, "INV_Gauntlets_25", "Imperial Leather Gloves"},
    {15166, "INV_Gauntlets_22", "Imposing Gloves"},
    {14685, "INV_Gauntlets_15", "Indomitable Gauntlets"},
    {7412, "INV_Gauntlets_22", "Infiltrator Gloves"},
    {2988, "INV_Gauntlets_18", "Inscribed Leather Gloves"},
    {6408, "INV_Gauntlets_21", "Insignia Gloves"},
    {15393, "INV_Gauntlets_11", "Jadefire Gloves"},
    {9632, "INV_Gauntlets_23", "Jangdor's Handcrafted Gloves"},
    {14666, "INV_Gauntlets_15", "Keeper's Gloves"},
    {15016, "INV_Gauntlets_15", "Lupine Handwraps"},
    {1944, "INV_Gauntlets_04", "Metalworking Gloves"},
    {10149, "INV_Gauntlets_23", "Mighty Gauntlets"},
    {9518, "INV_Gauntlets_25", "Mud's Crushers"},
    {12114, "INV_Gauntlets_17", "Nightfall Gloves"},
    {10225, "INV_Gauntlets_15", "Nightshade Gloves"},
    {7285, "INV_Gauntlets_05", "Nimble Leather Gloves"},
    {15155, "INV_Gauntlets_25", "Nocturnal Gloves"},
    {16741, "INV_Gauntlets_12", "Oilrag Handwraps"},
    {19119, "INV_Gauntlets_08", "Owlbeast Hide Gloves"},
    {15343, "INV_Gauntlets_24", "Pathfinder Gloves"},
    {15429, "INV_Gauntlets_15", "Peerless Gloves"},
    {7358, "INV_Gauntlets_05", "Pilferer's Gloves"},
    {15174, "INV_Gauntlets_12", "Potent Gloves"},
    {15184, "INV_Gauntlets_29", "Praetorian Gloves"},
    {9631, "INV_Gauntlets_23", "Pratt's Handcrafted Gloves"},
    {14675, "INV_Gauntlets_15", "Pridelord Gloves"},
    {4980, "INV_Gauntlets_04", "Prospector Gloves"},
    {14564, "INV_Gauntlets_18", "Prospector's Mitts"},
    {15383, "INV_Gauntlets_22", "Rageclaw Gloves"},
    {7480, "INV_Gauntlets_25", "Ranger Gloves"},
    {6727, "INV_Gauntlets_24", "Razzeric's Racing Grips"},
    {7284, "INV_Gauntlets_05", "Red Whelp Gloves"},
    {10072, "INV_Gauntlets_12", "Righteous Gloves"},
    {15115, "INV_Gauntlets_24", "Rigid Gloves"},
    {15125, "INV_Gauntlets_24", "Robust Gloves"},
    {15091, "INV_Gauntlets_31", "Runic Leather Gauntlets"},
    {9704, "INV_Gauntlets_23", "Rustler Gloves"},
    {9832, "INV_Gauntlets_24", "Scaled Leather Gloves"},
    {14657, "INV_Gauntlets_25", "Scorpashi Gloves"},
    {6586, "INV_Gauntlets_27", "Scouting Gloves"},
    {4509, "INV_Gauntlets_23", "Seawolf Gloves"},
    {7443, "INV_Gauntlets_05", "Sentinel Gloves"},
    {8260, "INV_Gauntlets_15", "Serpentskin Gloves"},
    {3754, "INV_Gauntlets_21", "Shepherd's Gloves"},
    {15405, "INV_Gauntlets_05", "Shucking Gloves"},
    {6794, "INV_Gauntlets_26", "Stormfire Gauntlets"},
    {9806, "INV_Gauntlets_05", "Superior Gloves"},
    {15438, "INV_Gauntlets_26", "Supreme Gloves"},
    {10186, "INV_Gauntlets_03", "Swashbuckler's Gloves"},
    {10760, "INV_Gauntlets_23", "Swine Fists"},
    {4107, "INV_Gauntlets_04", "Tiger Hunter Gloves"},
    {9920, "INV_Gauntlets_25", "Tracker's Gloves"},
    {8298, "INV_Gauntlets_15", "Traveler's Gloves"},
    {15365, "INV_Gauntlets_15", "Trickster's Handwraps"},
    {10110, "INV_Gauntlets_24", "Wanderer's Gloves"},
    {14606, "INV_Gauntlets_05", "Warden's Gloves"},
    {15083, "INV_Gauntlets_31", "Wicked Leather Gauntlets"},
    {5630, "INV_Gauntlets_05", "Windfelt Gloves"},
    {15372, "INV_Gauntlets_25", "Wolf Rider's Gloves"},
    {1945, "INV_Gauntlets_21", "Woodworking Gloves"},
    {15334, "INV_Gauntlets_27", "Wrangler's Gloves"},
    {5394, "INV_Gauntlets_05", "Archery Training Gloves"},
    {2375, "INV_Gauntlets_18", "Battered Leather Gloves"},
    {4914, "INV_Gauntlets_05", "Battleworn Leather Gloves"},
    {2964, "INV_Gauntlets_18", "Burnt Leather Gloves"},
    {2125, "INV_Gauntlets_18", "Cracked Leather Gloves"},
    {2145, "INV_Gauntlets_21", "Cuirboulli Gloves"},
    {239, "INV_Gauntlets_21", "Cured Leather Gloves"},
    {714, "INV_Gauntlets_18", "Dirty Leather Gloves"},
    {4962, "INV_Gauntlets_05", "Double-layered Gloves"},
    {3152, "INV_Gauntlets_18", "Driving Gloves"},
    {4239, "INV_Gauntlets_05", "Embossed Leather Gloves"},
    {15300, "INV_Gauntlets_05", "Grizzly Gloves"},
    {5966, "INV_Gauntlets_05", "Guardian Gloves"},
    {9755, "INV_Gauntlets_05", "Gypsy Gloves"},
    {1359, "INV_Gauntlets_05", "Lion-stamped Gloves"},
    {10636, "INV_Gauntlets_05", "Nomadic Gloves"},
    {6521, "INV_Gauntlets_05", "Pioneer Gloves"},
    {15008, "INV_Gauntlets_05", "Primal Mitts"},
    {2475, "INV_Gauntlets_05", "Reinforced Leather Gloves"},
    {797, "INV_Gauntlets_18", "Rough Leather Gloves"},
    {5939, "INV_Gauntlets_05", "Sewing Gloves"},
    {2469, "INV_Gauntlets_25", "Studded Gloves"},
    {844, "INV_Gauntlets_05", "Tanned Leather Gloves"},
    {3286, "INV_Gauntlets_19", "Tribal Gloves"},
    {4940, "INV_Gauntlets_05", "Veiled Grips"},
    {1965, "INV_Gauntlets_05", "White Wolf Gloves"},
    {6171, "INV_Gauntlets_05", "Wolf Handler Gloves"},
    {3804, "INV_Gauntlets_18", "Hardened Leather Gloves"},
    {1791, "INV_Gauntlets_05", "Patched Leather Gloves"},
    {1368, "INV_Gauntlets_18", "Ragged Leather Gloves"},
    {1799, "INV_Gauntlets_18", "Rawhide Gloves"},
    {3973, "INV_Gauntlets_18", "Smooth Leather Gloves"},
    {3965, "INV_Gauntlets_24", "Thick Leather Gloves"},
    {1807, "INV_Gauntlets_18", "Tough Leather Gloves"},
    {1506, "INV_Gauntlets_18", "Warped Leather Gloves"},
    {1422, "INV_Gauntlets_18", "Worn Leather Gloves"}
  };
  
  /**
   * Returns all IDs, that are used by Leather-Hands.
   * @return  An Array of Integers, that represents all IDs, that are used by Leather-Hands.
   * @since 1.0
   */
  public static int[] getIDs() {
    int[] res = new int[hands.length];
    for (int i = 0; i < hands.length; i++) {
      res[i] = (int)hands[i][0];
    }
    return res;
  }
  
  /**
   * Returns all Icons, that are used by Leather-Hands.
   * @return  An Array of Strings, that represents all Icons, that are used by Leather-Hands by 
   *     stating their Name.
   * @since 1.0
   */
  public static String[] getIcons() {
    String[] res = new String[hands.length];
    for (int i = 0; i < hands.length; i++) {
      res[i] = (String)hands[i][1];
    }
    return res;
  }
  
  /**
   * Returns all Names of Leather-Hands in the Game.
   * @return  The Name of all Leather-Hands in the Game as an Array of Strings.
   * @since 1.0
   */
  public static String[] getNames() {
    String[] res = new String[hands.length];
    for (int i = 0; i < hands.length; i++) {
      res[i] = (String)hands[i][2];
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
