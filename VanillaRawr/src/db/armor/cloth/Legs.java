package db.armor.cloth;

/**
 * The Class, that stores every single Cloth-Legs in the game with Values to search their Stats in 
 * the Database.
 * @author Haeldeus
 * @version 1.0
 */
public class Legs {
  
  /**
   * All Cloth-Legs stored as a Matrix of Objects. The Legs will be saved in the following way:
   * <br/> [id][Icon][Name]
   * <br/> [id][Icon][Name]
   * <br/> :
   * <br/> :
   * <br/> :
   */
  private static Object[][] legs = {
    {16796, "INV_Pants_08", "Arcanist Leggings"},
    {21336, "INV_Pants_Cloth_02", "Doomcaller's Trousers"},
    {19385, "INV_Pants_Cloth_19", "Empowered Leggings"},
    {21346, "INV_Pants_Cloth_08", "Enigma Leggings"},
    {19133, "INV_Pants_06", "Fel Infused Leggings"},
    {16810, "INV_Pants_Cloth_14", "Felheart Pants"},
    {19165, "INV_Pants_06", "Flarecore Leggings"},
    {22497, "INV_Pants_Cloth_05", "Frostfire Leggings"},
    {17593, "INV_Pants_07", "General's Dreadweave Pants"},
    {17625, "INV_Pants_07", "General's Satin Leggings"},
    {16534, "INV_Pants_07", "General's Silk Trousers"},
    {22700, "INV_Pants_06", "Glacial Leggings"},
    {18545, "INV_Pants_08", "Leggings of Arcane Supremacy"},
    {22513, "INV_Pants_Cloth_05", "Leggings of Faith"},
    {23070, "INV_Pants_08", "Leggings of Polarity"},
    {21461, "INV_Pants_Cloth_06", "Leggings of the Black Blizzard"},
    {21676, "INV_Pants_Cloth_02", "Leggings of the Festering Swarm"},
    {16922, "INV_Pants_08", "Leggings of Transcendence"},
    {18872, "INV_Pants_08", "Manastorm Leggings"},
    {17579, "INV_Pants_Cloth_09", "Marshal's Dreadweave Leggings"},
    {17603, "INV_Pants_06", "Marshal's Satin Pants"},
    {16442, "INV_Pants_08", "Marshal's Silk Leggings"},
    {16930, "INV_Pants_07", "Nemesis Leggings"},
    {16915, "INV_Pants_08", "Netherwind Pants"},
    {22747, "INV_Pants_Cloth_05", "Outrider's Silk Leggings"},
    {16814, "INV_Pants_08", "Pants of Prophecy"},
    {22505, "INV_Pants_Cloth_05", "Plagueheart Leggings"},
    {22752, "INV_Pants_Cloth_05", "Sentinel's Silk Leggings"},
    {21352, "INV_Pants_Cloth_07", "Trousers of the Oracle"},
    {23173, "INV_Pants_06", "Abomination Skin Leggings"},
    {20674, "INV_Pants_Cloth_04", "Abyssal Cloth Pants"},
    {7709, "INV_Pants_07", "Blighted Leggings"},
    {19895, "INV_Pants_Cloth_14", "Bloodtinged Kilt"},
    {19683, "INV_Pants_Cloth_14", "Bloodvine Leggings"},
    {20705, "INV_Pants_Cloth_06", "Cenarion Reservist's Pants"},
    {20706, "INV_Pants_Cloth_06", "Cenarion Reservist's Pants"},
    {20707, "INV_Pants_Cloth_06", "Cenarion Reservist's Pants"},
    {13008, "INV_Pants_06", "Dalewind Trousers"},
    {12987, "INV_Pants_06", "Darkweave Breeches"},
    {22072, "INV_Pants_08", "Deathmist Leggings"},
    {16694, "INV_Pants_08", "Devout Skirt"},
    {16699, "INV_Pants_08", "Dreadmist Leggings"},
    {11929, "INV_Pants_11", "Haunting Specter Leggings"},
    {22303, "INV_Pants_08", "Ironweave Pants"},
    {10807, "INV_Pants_11", "Kilt of the Atal'ai Prophet"},
    {17567, "INV_Pants_06", "Knight-Captain's Dreadweave Leggings"},
    {23296, "INV_Pants_06", "Knight-Captain's Dreadweave Legguards"},
    {17599, "INV_Pants_06", "Knight-Captain's Satin Leggings"},
    {23302, "INV_Pants_11", "Knight-Captain's Satin Legguards"},
    {16414, "INV_Pants_08", "Knight-Captain's Silk Leggings"},
    {23304, "INV_Pants_11", "Knight-Captain's Silk Legguards"},
    {6910, "INV_Pants_14", "Leech Pants"},
    {22342, "INV_Pants_09", "Leggings of Torment"},
    {17571, "INV_Pants_06", "Legionnaire's Dreadweave Leggings"},
    {22881, "INV_Pants_06", "Legionnaire's Dreadweave Legguards"},
    {22882, "INV_Pants_11", "Legionnaire's Satin Legguards"},
    {17611, "INV_Pants_11", "Legionnaire's Satin Trousers"},
    {22883, "INV_Pants_11", "Legionnaire's Silk Legguards"},
    {16490, "INV_Pants_11", "Legionnaire's Silk Pants"},
    {16687, "INV_Pants_06", "Magister's Leggings"},
    {14137, "INV_Pants_13", "Mooncloth Leggings"},
    {2277, "INV_Pants_01", "Necromancer Leggings"},
    {14632, "INV_Pants_08", "Necropile Leggings"},
    {18386, "INV_Pants_06", "Padre's Trousers"},
    {11123, "INV_Pants_08", "Rainstrider Leggings"},
    {19899, "INV_Pants_Cloth_14", "Ritualistic Legguards"},
    {20538, "INV_Pants_Cloth_05", "Runed Stygian Leggings"},
    {18745, "INV_Pants_01", "Sacred Cloth Leggings"},
    {11841, "INV_Pants_09", "Senior Designer's Pantaloons"},
    {14577, "INV_Pants_08", "Skullsmoke Pants"},
    {13170, "INV_Pants_13", "Skyshroud Leggings"},
    {22067, "INV_Pants_06", "Sorcerer's Leggings"},
    {9484, "INV_Pants_08", "Spellshock Leggings"},
    {12965, "INV_Pants_06", "Spiritshroud Leggings"},
    {9407, "INV_Pants_01", "Stoneweaver Leggings"},
    {13389, "INV_Pants_06", "The Postmaster's Trousers"},
    {22085, "INV_Pants_08", "Virtuous Skirt"},
    {13206, "INV_Pants_06", "Wolfshear Leggings"},
    {9942, "INV_Pants_08", "Abjurer's Pants"},
    {14119, "INV_Pants_Wolf", "Aboriginal Loincloth"},
    {3291, "INV_Pants_Wolf", "Ancestral Woollies"},
    {14295, "INV_Pants_14", "Arachnidian Legguards"},
    {8289, "INV_Pants_13", "Arcane Leggings"},
    {5016, "INV_Pants_10", "Artisan's Trousers"},
    {4044, "INV_Pants_01", "Aurora Pants"},
    {7046, "INV_Pants_08", "Azure Silk Pants"},
    {3309, "INV_Pants_Wolf", "Barbaric Loincloth"},
    {14090, "INV_Pants_02", "Beaded Britches"},
    {9999, "INV_Pants_09", "Black Mageweave Leggings"},
    {14264, "INV_Pants_12", "Bloodwoven Pants"},
    {14305, "INV_Pants_13", "Bonecaster's Sarong"},
    {3067, "INV_Pants_02", "Bright Pants"},
    {14104, "INV_Pants_09", "Brightcloth Pants"},
    {14171, "INV_Pants_06", "Buccaneer's Pants"},
    {14315, "INV_Pants_13", "Celestial Kilt"},
    {12256, "INV_Pants_06", "Cindercloth Leggings"},
    {14045, "INV_Pants_06", "Cindercloth Pants"},
    {10048, "INV_Pants_02", "Colorful Kilt"},
    {9851, "INV_Pants_07", "Conjurer's Breeches"},
    {10101, "INV_Pants_10", "Councillor's Pants"},
    {14242, "INV_Pants_08", "Darkmist Pants"},
    {6267, "INV_Pants_06", "Disciple's Pants"},
    {10742, "INV_Pants_05", "Dragonflight Leggings"},
    {6737, "INV_Pants_06", "Dryleaf Pants"},
    {9825, "INV_Pants_09", "Durable Pants"},
    {10064, "INV_Pants_09", "Duskwoven Pants"},
    {7368, "INV_Pants_08", "Elder's Pants"},
    {10217, "INV_Pants_06", "Elegant Leggings"},
    {14462, "INV_Pants_10", "Elunarian Sarong"},
    {14233, "INV_Pants_12", "Embersilk Leggings"},
    {14334, "INV_Pants_13", "Eternal Sarong"},
    {14107, "INV_Pants_06", "Felcloth Pants"},
    {10554, "INV_Pants_07", "Foreman Pants"},
    {13871, "INV_Pants_08", "Frostweave Pants"},
    {14274, "INV_Pants_11", "Gaea's Leggings"},
    {6903, "INV_Pants_02", "Gaze Dreamer Pants"},
    {14224, "INV_Pants_09", "Geomancer's Trousers"},
    {15449, "INV_Pants_14", "Ghastly Trousers"},
    {14144, "INV_Pants_01", "Ghostweave Pants"},
    {7519, "INV_Pants_12", "Gossamer Pants"},
    {9772, "INV_Pants_10", "Greenweave Leggings"},
    {4309, "INV_Pants_07", "Handstitched Linen Britches"},
    {4316, "INV_Pants_01", "Heavy Woolen Pants"},
    {8112, "INV_Pants_14", "Hibernal Pants"},
    {10141, "INV_Pants_13", "High Councillor's Pants"},
    {15119, "INV_Pants_08", "Highborne Pants"},
    {4723, "INV_Pants_02", "Humbert's Pants"},
    {8251, "INV_Pants_06", "Imperial Red Pants"},
    {9797, "INV_Pants_14", "Ivycloth Pants"},
    {2958, "INV_Pants_10", "Journeyman's Pants"},
    {12295, "INV_Pants_06", "Leggings of the People's Militia"},
    {1832, "INV_Pants_06", "Lucky Trousers"},
    {14257, "INV_Pants_13", "Lunar Leggings"},
    {10252, "INV_Pants_09", "Master's Leggings"},
    {4046, "INV_Pants_13", "Mistscape Pants"},
    {14370, "INV_Pants_02", "Mystic's Woolies"},
    {10177, "INV_Pants_06", "Mystical Leggings"},
    {14097, "INV_Pants_02", "Native Pants"},
    {2954, "INV_Pants_08", "Night Watch Pantaloons"},
    {6405, "INV_Pants_08", "Nightsky Trousers"},
    {14283, "INV_Pants_12", "Opulent Leggings"},
    {14165, "INV_Pants_02", "Pagan Britches"},
    {12255, "INV_Pants_01", "Pale Leggings"},
    {4317, "INV_Pants_06", "Phoenix Pants"},
    {10043, "INV_Pants_11", "Pious Legwraps"},
    {14193, "INV_Pants_13", "Raincaller Pants"},
    {10549, "INV_Pants_13", "Rancher's Trousers"},
    {10009, "INV_Pants_06", "Red Mageweave Pants"},
    {7469, "INV_Pants_13", "Regal Leggings"},
    {14404, "INV_Pants_06", "Resilient Leggings"},
    {14324, "INV_Pants_12", "Resplendent Sarong"},
    {14125, "INV_Pants_09", "Ritual Leggings"},
    {9911, "INV_Pants_13", "Royal Trousers"},
    {13865, "INV_Pants_09", "Runecloth Pants"},
    {6282, "INV_Pants_01", "Sacred Burial Trousers"},
    {6616, "INV_Pants_01", "Sage's Pants"},
    {14379, "INV_Pants_02", "Sanguine Trousers"},
    {6659, "INV_Pants_06", "Scarab Trousers"},
    {4434, "INV_Pants_02", "Scarecrow Trousers"},
    {5310, "INV_Pants_02", "Sea Dog Britches"},
    {3563, "INV_Pants_02", "Seafarer's Pantaloons"},
    {2982, "INV_Pants_01", "Seer's Pants"},
    {10002, "INV_Pants_11", "Shadoweave Pants"},
    {6568, "INV_Pants_01", "Shimmering Trousers"},
    {1929, "INV_Pants_02", "Silk-threaded Trousers"},
    {14424, "INV_Pants_09", "Silksand Legwraps"},
    {4037, "INV_Pants_08", "Silver-thread Pants"},
    {9747, "INV_Pants_06", "Simple Britches"},
    {3073, "INV_Pants_06", "Smoldering Pants"},
    {9883, "INV_Pants_08", "Sorcerer Pants"},
    {2970, "INV_Pants_10", "Spellbinder Pants"},
    {3457, "INV_Pants_14", "Stamped Trousers"},
    {14415, "INV_Pants_01", "Stonecloth Britches"},
    {4505, "INV_Pants_10", "Swampland Trousers"},
    {14203, "INV_Pants_12", "Thistlefur Pants"},
    {18346, "INV_Pants_09", "Threadbare Trousers"},
    {11911, "INV_Pants_08", "Treetop Leggings"},
    {7431, "INV_Pants_08", "Twilight Pants"},
    {14444, "INV_Pants_14", "Venomshroud Leggings"},
    {14207, "INV_Pants_07", "Vital Leggings"},
    {14183, "INV_Pants_01", "Watcher's Leggings"},
    {6540, "INV_Pants_10", "Willow Pants"},
    {14433, "INV_Pants_12", "Windchaser Woolies"},
    {14132, "INV_Pants_09", "Wizardweave Leggings"},
    {4343, "INV_Pants_06", "Brown Linen Pants"},
    {7062, "INV_Pants_06", "Crimson Silk Pantaloons"},
    {79, "INV_Pants_09", "Dwarven Cloth Britches"},
    {2437, "INV_Pants_08", "Embroidered Pants"},
    {838, "INV_Pants_14", "Heavy Weave Pants"},
    {794, "INV_Pants_11", "Knitted Pants"},
    {9600, "INV_Pants_09", "Lace Pants"},
    {2159, "INV_Pants_07", "Padded Pants"},
    {6713, "INV_Pants_07", "Ripped Pants"},
    {2431, "INV_Pants_10", "Russet Pants"},
    {10655, "INV_Pants_12", "Sedgeweed Britches"},
    {10047, "INV_Pants_11", "Simple Kilt"},
    {10045, "INV_Pants_11", "Simple Linen Pants"},
    {4261, "INV_Pants_02", "Solliden's Trousers"},
    {3834, "INV_Pants_07", "Sturdy Cloth Trousers"},
    {6076, "INV_Pants_11", "Tapered Pants"},
    {194, "INV_Pants_12", "Tattered Cloth Pants"},
    {201, "INV_Pants_12", "Thick Cloth Pants"},
    {2120, "INV_Pants_02", "Thin Cloth Pants"},
    {10035, "INV_Pants_01", "Tuxedo Pants"},
    {2238, "INV_Pants_08", "Urchin's Pants"},
    {3263, "INV_Pants_02", "Webbed Pants"},
    {2366, "INV_Pants_06", "Woven Pants"},
    {1396, "INV_Pants_01", "Acolyte's Pants"},
    {1395, "INV_Pants_01", "Apprentice's Pants"},
    {139, "INV_Pants_02", "Brawler's Pants"},
    {1776, "INV_Pants_11", "Brocade Pants"},
    {1499, "INV_Pants_11", "Calico Pants"},
    {1768, "INV_Pants_09", "Canvas Pants"},
    {3941, "INV_Pants_12", "Crochet Pants"},
    {1784, "INV_Pants_02", "Cross-stitched Pants"},
    {128, "INV_Pants_02", "Deprecated Tauren Trapper's Pants"},
    {48, "INV_Pants_02", "Footpad's Pants"},
    {1378, "INV_Pants_09", "Frayed Pants"},
    {3797, "INV_Pants_06", "Interlaced Pants"},
    {52, "INV_Pants_02", "Neophyte's Pants"},
    {6124, "INV_Pants_01", "Novice's Pants"},
    {1431, "INV_Pants_11", "Patchwork Pants"},
    {39, "INV_Pants_02", "Recruit's Pants"},
    {6121, "INV_Pants_02", "Recruit's Pants"},
    {147, "INV_Pants_02", "Rugged Trapper's Pants"},
    {44, "INV_Pants_02", "Squire's Pants"},
    {6118, "INV_Pants_02", "Squire's Pants"},
    {120, "INV_Pants_02", "Thug Pants"},
    {6137, "INV_Pants_02", "Thug Pants"},
    {6126, "INV_Pants_02", "Trapper's Pants"},
    {3949, "INV_Pants_06", "Twill Pants"}
  };
  
  /**
   * Returns all IDs, that are used by Cloth-Legs.
   * @return  An Array of Integers, that represents all IDs, that are used by Cloth-Legs.
   * @since 1.0
   */
  public static int[] getIDs() {
    int[] res = new int[legs.length];
    for (int i = 0; i < legs.length; i++) {
      res[i] = (int)legs[i][0];
    }
    return res;
  }
  
  /**
   * Returns all Icons, that are used by Cloth-Legs.
   * @return  An Array of Strings, that represents all Icons, that are used by Cloth-Legs by 
   *     stating their Name.
   * @since 1.0
   */
  public static String[] getIcons() {
    String[] res = new String[legs.length];
    for (int i = 0; i < legs.length; i++) {
      res[i] = (String)legs[i][1];
    }
    return res;
  }
  
  /**
   * Returns all Names of Cloth-Legs in the Game.
   * @return  The Name of all Cloth-Legs in the Game as an Array of Strings.
   * @since 1.0
   */
  public static String[] getNames() {
    String[] res = new String[legs.length];
    for (int i = 0; i < legs.length; i++) {
      res[i] = (String)legs[i][2];
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
