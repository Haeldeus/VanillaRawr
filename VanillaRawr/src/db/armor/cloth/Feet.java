package db.armor.cloth;

/**
 * The Class, that stores every single Cloth-Feet in the game with Values to search their Stats in 
 * the Database.
 * @author Haeldeus
 * @version 1.0
 */
public class Feet {

  /**
   * All Cloth-Feet stored as a Matrix of Objects. The Items will be saved in the following way:
   * <br/> [id][Icon][Name]
   * <br/> [id][Icon][Name]
   * <br/> :
   * <br/> :
   * <br/> :
   */
  private static Object[][] feet = {
    {16800, "INV_Boots_07", "Arcanist Boots"},
    {19897, "INV_Boots_Cloth_09", "Betrayer's Boots"},
    {21600, "INV_Boots_Cloth_05", "Boots of Epiphany"},
    {16811, "INV_Boots_07", "Boots of Prophecy"},
    {19437, "INV_Boots_Cloth_03", "Boots of Pure Thought"},
    {16919, "INV_Boots_07", "Boots of Transcendence"},
    {22076, "INV_Boots_05", "Deathmist Sandals"},
    {21338, "INV_Boots_Cloth_02", "Doomcaller's Footwraps"},
    {21344, "INV_Boots_Cloth_03", "Enigma Boots"},
    {16803, "INV_Boots_Cloth_05", "Felheart Slippers"},
    {21349, "INV_Boots_Cloth_07", "Footwraps of the Oracle"},
    {22500, "INV_Boots_Fabric_01", "Frostfire Sandals"},
    {17586, "INV_Boots_05", "General's Dreadweave Boots"},
    {17618, "INV_Boots_05", "General's Satin Boots"},
    {16539, "INV_Boots_05", "General's Silk Boots"},
    {17583, "INV_Boots_07", "Marshal's Dreadweave Boots"},
    {17607, "INV_Boots_07", "Marshal's Satin Sandals"},
    {16437, "INV_Boots_Cloth_03", "Marshal's Silk Footwraps"},
    {20631, "INV_Boots_Cloth_05", "Mendicant's Slippers"},
    {16927, "INV_Boots_05", "Nemesis Boots"},
    {16912, "INV_Boots_07", "Netherwind Boots"},
    {22508, "INV_Boots_Fabric_01", "Plagueheart Sandals"},
    {21648, "INV_Boots_Cloth_07", "Recomposed Boots"},
    {19438, "INV_Boots_Cloth_16", "Ringo's Blizzard Boots"},
    {22516, "INV_Boots_Fabric_01", "Sandals of Faith"},
    {19391, "INV_Boots_Cloth_01", "Shimmering Geta"},
    {19131, "INV_Boots_Cloth_14", "Snowblind Shoes"},
    {22064, "INV_Boots_02", "Sorcerer's Boots"},
    {22084, "INV_Boots_05", "Virtuous Sandals"},
    {9454, "INV_Boots_05", "Acidic Walkers"},
    {19056, "INV_Boots_Cloth_03", "Argent Boots"},
    {17576, "INV_Boots_05", "Blood Guard's Dreadweave Boots"},
    {22855, "INV_Boots_05", "Blood Guard's Dreadweave Walkers"},
    {17616, "INV_Boots_05", "Blood Guard's Satin Boots"},
    {22859, "INV_Boots_05", "Blood Guard's Satin Walkers"},
    {16485, "INV_Boots_05", "Blood Guard's Silk Footwraps"},
    {22860, "INV_Boots_05", "Blood Guard's Silk Walkers"},
    {19684, "INV_Boots_Cloth_02", "Bloodvine Boots"},
    {18507, "INV_Boots_05", "Boots of the Full Moon"},
    {18697, "INV_Boots_Fabric_01", "Coldstone Slippers"},
    {20159, "INV_Boots_Cloth_07", "Defiler's Cloth Boots"},
    {20160, "INV_Boots_Cloth_07", "Defiler's Cloth Boots"},
    {20161, "INV_Boots_Cloth_07", "Defiler's Cloth Boots"},
    {20162, "INV_Boots_Cloth_07", "Defiler's Cloth Boots"},
    {16691, "INV_Boots_05", "Devout Sandals"},
    {18102, "INV_Boots_05", "Dragonrider Boots"},
    {16704, "INV_Boots_05", "Dreadmist Sandals"},
    {22247, "INV_Boots_Cloth_03", "Faith Healer's Boots"},
    {13369, "INV_Boots_05", "Fire Striders"},
    {13100, "INV_Boots_03", "Furen's Boots"},
    {12556, "INV_Boots_Wolf", "High Priestess Boots"},
    {20054, "INV_Boots_Cloth_07", "Highlander's Cloth Boots"},
    {20094, "INV_Boots_Cloth_07", "Highlander's Cloth Boots"},
    {20095, "INV_Boots_Cloth_07", "Highlander's Cloth Boots"},
    {20096, "INV_Boots_Cloth_07", "Highlander's Cloth Boots"},
    {22311, "INV_Boots_Cloth_05", "Ironweave Boots"},
    {22231, "INV_Boots_Cloth_02", "Kayser's Boots of Precision"},
    {17562, "INV_Boots_02", "Knight-Lieutenant's Dreadweave Boots"},
    {23283, "INV_Boots_05", "Knight-Lieutenant's Dreadweave Walkers"},
    {17594, "INV_Boots_07", "Knight-Lieutenant's Satin Boots"},
    {23289, "INV_Boots_05", "Knight-Lieutenant's Satin Walkers"},
    {16369, "INV_Boots_05", "Knight-Lieutenant's Silk Boots"},
    {23291, "INV_Boots_05", "Knight-Lieutenant's Silk Walkers"},
    {16682, "INV_Boots_02", "Magister's Boots"},
    {18735, "INV_Boots_03", "Maleki's Footwraps"},
    {10629, "INV_Boots_05", "Mistwalker Boots"},
    {13099, "INV_Boots_05", "Moccasins of the White Hare"},
    {15802, "INV_Boots_05", "Mooncloth Boots"},
    {14631, "INV_Boots_05", "Necropile Boots"},
    {13282, "INV_Boots_05", "Ogreseer Tower Boots"},
    {11822, "INV_Boots_05", "Omnicast Boots"},
    {18295, "INV_Boots_06", "Phasing Boots"},
    {21489, "INV_Boots_Cloth_05", "Quicksand Waders"},
    {20537, "INV_Boots_05", "Runed Stygian Boots"},
    {22245, "INV_Boots_Cloth_05", "Soot Encrusted Footwear"},
    {4320, "INV_Boots_05", "Spidersilk Boots"},
    {13391, "INV_Boots_02", "The Postmaster's Treads"},
    {10578, "INV_Boots_01", "Thoughtcast Boots"},
    {21810, "INV_Boots_Cloth_05", "Treads of the Wandering Nomad"},
    {17748, "INV_Boots_05", "Vinerot Sandals"},
    {13101, "INV_Boots_05", "Wolfrunner Shoes"},
    {9936, "INV_Boots_09", "Abjurer's Boots"},
    {14114, "INV_Boots_Wolf", "Aboriginal Footwraps"},
    {20652, "INV_Boots_Cloth_10", "Abyssal Cloth Slippers"},
    {14290, "INV_Boots_05", "Arachnidian Footpads"},
    {8284, "INV_Boots_05", "Arcane Boots"},
    {11908, "INV_Boots_05", "Archaeologist's Quarry Boots"},
    {6416, "INV_Boots_05", "Aurora Boots"},
    {3307, "INV_Boots_05", "Barbaric Cloth Boots"},
    {10026, "INV_Boots_05", "Black Mageweave Boots"},
    {14259, "INV_Boots_08", "Bloodwoven Boots"},
    {1560, "INV_Boots_Fabric_01", "Bluegill Sandals"},
    {14299, "INV_Boots_07", "Bonecaster's Boots"},
    {7027, "INV_Boots_05", "Boots of Darkness"},
    {4325, "INV_Boots_05", "Boots of the Enchanter"},
    {9658, "INV_Boots_02", "Boots of the Maharishi"},
    {3065, "INV_Boots_07", "Bright Boots"},
    {14174, "INV_Boots_05", "Buccaneer's Boots"},
    {14310, "INV_Boots_05", "Celestial Slippers"},
    {10044, "INV_Boots_05", "Cindercloth Boots"},
    {9845, "INV_Boots_05", "Conjurer's Shoes"},
    {10095, "INV_Boots_09", "Councillor's Boots"},
    {2232, "INV_Boots_05", "Dark Runner Boots"},
    {14238, "INV_Boots_07", "Darkmist Boots"},
    {4137, "INV_Boots_05", "Darkspear Shoes"},
    {9820, "INV_Boots_03", "Durable Boots"},
    {9519, "INV_Boots_06", "Durtfeet Stompers"},
    {10058, "INV_Boots_09", "Duskwoven Sandals"},
    {7354, "INV_Boots_05", "Elder's Boots"},
    {10211, "INV_Boots_02", "Elegant Boots"},
    {14458, "INV_Boots_08", "Elunarian Boots"},
    {14236, "INV_Boots_08", "Embersilk Boots"},
    {10700, "INV_Boots_02", "Encarmine Boots"},
    {14329, "INV_Boots_07", "Eternal Boots"},
    {10359, "INV_Boots_07", "Everlast Boots"},
    {13530, "INV_Boots_05", "Fangdrip Runners"},
    {14108, "INV_Boots_05", "Felcloth Boots"},
    {6482, "INV_Boots_05", "Firewalker Boots"},
    {2168, "INV_Boots_03", "Foreman's Boots"},
    {14269, "INV_Boots_07", "Gaea's Slippers"},
    {14218, "INV_Boots_07", "Geomancer's Boots"},
    {9645, "INV_Boots_01", "Gnomish Inventor Boots"},
    {10724, "INV_Boots_02", "Gnomish Rocket Boots"},
    {7189, "INV_Gizmo_RocketBoot_01", "Goblin Rocket Boots"},
    {7522, "INV_Boots_09", "Gossamer Boots"},
    {9767, "INV_Boots_03", "Greenweave Sandals"},
    {12050, "INV_Boots_05", "Hazecover Boots"},
    {6791, "INV_Boots_02", "Hellion Boots"},
    {8107, "INV_Boots_09", "Hibernal Boots"},
    {10137, "INV_Boots_08", "High Councillor's Boots"},
    {14447, "INV_Boots_07", "Highborne Footpads"},
    {8246, "INV_Boots_02", "Imperial Red Boots"},
    {9792, "INV_Boots_05", "Ivycloth Boots"},
    {4139, "INV_Boots_Fabric_01", "Junglewalker Sandals"},
    {6191, "INV_Boots_05", "Kimbra Boots"},
    {15697, "INV_Boots_09", "Kodo Rustler Boots"},
    {15461, "INV_Boots_08", "Lightheel Boots"},
    {14250, "INV_Boots_07", "Lunar Slippers"},
    {3764, "INV_Boots_05", "Mantis Boots"},
    {10247, "INV_Boots_05", "Master's Boots"},
    {4047, "INV_Boots_09", "Mistscape Boots"},
    {14364, "INV_Boots_05", "Mystic's Slippers"},
    {10179, "INV_Boots_09", "Mystical Boots"},
    {19969, "INV_Boots_09", "Nat Pagle's Extreme Anglin' Boots"},
    {6406, "INV_Boots_05", "Nightsky Boots"},
    {6998, "INV_Boots_05", "Nimbus Boots"},
    {14285, "INV_Boots_07", "Opulent Boots"},
    {14159, "INV_Boots_05", "Pagan Shoes"},
    {14195, "INV_Boots_05", "Raincaller Boots"},
    {11865, "INV_Boots_02", "Rancor Boots"},
    {4313, "INV_Boots_09", "Red Woolen Boots"},
    {7472, "INV_Boots_05", "Regal Boots"},
    {14399, "INV_Boots_05", "Resilient Boots"},
    {14319, "INV_Boots_08", "Resplendent Boots"},
    {18307, "INV_Boots_05", "Riptide Shoes"},
    {14129, "INV_Boots_03", "Ritual Sandals"},
    {9907, "INV_Boots_05", "Royal Boots"},
    {13864, "INV_Boots_05", "Runecloth Boots"},
    {6612, "INV_Boots_05", "Sage's Boots"},
    {14374, "INV_Boots_06", "Sanguine Sandals"},
    {2983, "INV_Boots_05", "Seer's Boots"},
    {10031, "INV_Boots_05", "Shadoweave Boots"},
    {6562, "INV_Boots_05", "Shimmering Boots"},
    {14418, "INV_Boots_08", "Silksand Boots"},
    {6394, "INV_Boots_05", "Silver-thread Boots"},
    {3076, "INV_Boots_09", "Smoldering Boots"},
    {4312, "INV_Boots_09", "Soft-soled Linen Boots"},
    {9876, "INV_Boots_05", "Sorcerer Slippers"},
    {20641, "INV_Boots_05", "Southsea Mojo Boots"},
    {4321, "INV_Boots_03", "Spider Silk Slippers"},
    {14408, "INV_Boots_05", "Stonecloth Boots"},
    {14196, "INV_Boots_04", "Thistlefur Sandals"},
    {7434, "INV_Boots_05", "Twilight Boots"},
    {14438, "INV_Boots_09", "Venomshroud Boots"},
    {14214, "INV_Boots_05", "Vital Boots"},
    {4660, "INV_Boots_06", "Walking Boots"},
    {6095, "INV_Boots_05", "Wandering Boots"},
    {14176, "INV_Boots_05", "Watcher's Boots"},
    {6537, "INV_Boots_03", "Willow Boots"},
    {14428, "INV_Boots_08", "Windchaser Footpads"},
    {16985, "INV_Boots_05", "Windseeker Boots"},
    {15104, "INV_Boots_07", "Wingborne Boots"},
    {2583, "INV_Boots_09", "Woolen Boots"},
    {3289, "INV_Boots_05", "Ancestral Boots"},
    {14086, "INV_Boots_09", "Beaded Sandals"},
    {7095, "INV_Boots_05", "Bog Boots"},
    {860, "INV_Boots_05", "Cavalier's Boots"},
    {4936, "INV_Boots_08", "Dirt-trodden Boots"},
    {7351, "INV_Boots_09", "Disciple's Boots"},
    {6836, "INV_Boots_05", "Dress Shoes"},
    {2438, "INV_Boots_05", "Embroidered Boots"},
    {11191, "INV_Boots_03", "Farmer's Boots"},
    {3274, "INV_Boots_04", "Flax Boots"},
    {11508, "INV_Boots_Fabric_01", "Gamemaster's Slippers"},
    {840, "INV_Boots_05", "Heavy Weave Shoes"},
    {2959, "INV_Boots_09", "Journeyman's Boots"},
    {792, "INV_Boots_Fabric_01", "Knitted Sandals"},
    {2569, "INV_Boots_09", "Linen Boots"},
    {14110, "INV_Boots_09", "Native Sandals"},
    {2156, "INV_Boots_09", "Padded Boots"},
    {3454, "INV_Boots_05", "Reconnaissance Boots"},
    {2432, "INV_Boots_05", "Russet Boots"},
    {15398, "INV_Boots_03", "Sandcomber Boots"},
    {10046, "INV_Boots_05", "Simple Linen Boots"},
    {9743, "INV_Boots_09", "Simple Shoes"},
    {6173, "INV_Boots_05", "Snow Boots"},
    {80, "INV_Boots_09", "Soft Fur-lined Shoes"},
    {4915, "INV_Boots_05", "Soft Wool Boots"},
    {2971, "INV_Boots_09", "Spellbinder Boots"},
    {195, "INV_Boots_05", "Tattered Cloth Boots"},
    {202, "INV_Boots_05", "Thick Cloth Shoes"},
    {2117, "INV_Boots_09", "Thin Cloth Shoes"},
    {2571, "INV_Boots_09", "Viny Wrappings"},
    {6148, "INV_Boots_05", "Web-covered Boots"},
    {2367, "INV_Boots_09", "Woven Boots"},
    {1772, "INV_Boots_05", "Brocade Shoes"},
    {1495, "INV_Boots_05", "Calico Shoes"},
    {1764, "INV_Boots_09", "Canvas Shoes"},
    {3937, "INV_Boots_07", "Crochet Boots"},
    {1780, "INV_Boots_Fabric_01", "Cross-stitched Sandals"},
    {1374, "INV_Boots_09", "Frayed Shoes"},
    {3793, "INV_Boots_09", "Interlaced Boots"},
    {1427, "INV_Boots_09", "Patchwork Shoes"},
    {3945, "INV_Boots_09", "Twill Boots"}
  };
  
  /**
   * Returns all IDs, that are used by Cloth-Feet.
   * @return  An Array of Integers, that represents all IDs, that are used by Cloth-Feet.
   * @since 1.0
   */
  public static int[] getIDs() {
    int[] res = new int[feet.length];
    for (int i = 0; i < feet.length; i++) {
      res[i] = (int)feet[i][0];
    }
    return res;
  }
  
  /**
   * Returns all Icons, that are used by Cloth-Feet.
   * @return  An Array of Strings, that represents all Icons, that are used by Cloth-Feet by 
   *     stating their Name.
   * @since 1.0
   */
  public static String[] getIcons() {
    String[] res = new String[feet.length];
    for (int i = 0; i < feet.length; i++) {
      res[i] = (String)feet[i][1];
    }
    return res;
  }
  
  /**
   * Returns all Names of Cloth-Feet in the Game.
   * @return  The Name of all Cloth-Feet in the Game as an Array of Strings.
   * @since 1.0
   */
  public static String[] getNames() {
    String[] res = new String[feet.length];
    for (int i = 0; i < feet.length; i++) {
      res[i] = (String)feet[i][2];
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
