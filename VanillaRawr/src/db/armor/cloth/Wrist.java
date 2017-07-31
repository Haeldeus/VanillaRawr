package db.armor.cloth;

/**
 * The Class, that stores every single Cloth-Wrist in the game with Values to search their Stats in 
 * the Database.
 * @author Haeldeus
 * @version 1.0
 */
public class Wrist {

  /**
   * All Cloth-Wrists stored as a Matrix of Objects. The Wrists will be saved in the following way:
   * <br/> [id][Icon][Name]
   * <br/> [id][Icon][Name]
   * <br/> :
   * <br/> :
   * <br/> :
   */
  private static Object[][] wrists = {
    {16799, "INV_Belt_29", "Arcanist Bindings"},
    {22519, "INV_Bracer_13", "Bindings of Faith"},
    {16926, "INV_Bracer_09", "Bindings of Transcendence"},
    {20626, "INV_Bracer_07", "Black Bark Wristbands"},
    {19135, "INV_Bracer_07", "Blacklight Bracer"},
    {21604, "INV_Bracer_13", "Bracelets of Royal Redemption"},
    {19374, "INV_Bracer_07", "Bracers of Arcane Accuracy"},
    {22667, "INV_Bracer_12", "Bracers of Hope"},
    {21611, "INV_Bracer_13", "Burrower Bracers"},
    {19595, "INV_Bracer_13", "Dryad's Wrist Bindings"},
    {19596, "INV_Bracer_13", "Dryad's Wrist Bindings"},
    {19597, "INV_Bracer_13", "Dryad's Wrist Bindings"},
    {16804, "INV_Bracer_07", "Felheart Bracers"},
    {18263, "INV_Bracer_09", "Flarecore Wraps"},
    {22503, "INV_Bracer_13", "Frostfire Bindings"},
    {22655, "INV_Bracer_07", "Glacial Wrists"},
    {16934, "INV_Bracer_07", "Nemesis Bracers"},
    {16918, "INV_Bracer_09", "Netherwind Bindings"},
    {22511, "INV_Bracer_13", "Plagueheart Bindings"},
    {21186, "INV_Bracer_12", "Rockfury Bracers"},
    {21464, "INV_Bracer_07", "Shackles of the Unscarred"},
    {23021, "INV_Bracer_07", "The Soul Harvester's Bindings"},
    {16819, "INV_Bracer_09", "Vambraces of Prophecy"},
    {19843, "INV_Bracer_07", "Zandalar Confessor's Wraps"},
    {19848, "INV_Bracer_07", "Zandalar Demoniac's Wraps"},
    {19846, "INV_Bracer_07", "Zandalar Illusionist's Wraps"},
    {20690, "INV_Bracer_12", "Abyssal Cloth Wristbands"},
    {18709, "INV_Bracer_10", "Arena Wristguards"},
    {12546, "INV_Bracer_05", "Aristocratic Cuffs"},
    {23129, "INV_Bracer_13", "Bracers of Mending"},
    {21496, "INV_Bracer_13", "Bracers of Qiraji Command"},
    {23091, "INV_Bracer_12", "Bracers of Undead Cleansing"},
    {22071, "INV_Bracer_13", "Deathmist Bracers"},
    {16697, "INV_Belt_31", "Devout Bracers"},
    {16703, "INV_Bracer_13", "Dreadmist Bracers"},
    {16486, "INV_Bracer_07", "First Sergeant's Silk Cuffs"},
    {18437, "INV_Bracer_07", "First Sergeant's Silk Cuffs"},
    {11766, "INV_Bracer_05", "Flameweave Cuffs"},
    {9433, "INV_Bracer_12", "Forgotten Wraps"},
    {12626, "INV_Bracer_07", "Funeral Cuffs"},
    {13106, "INV_Bracer_19", "Glowing Magical Bracelets"},
    {22313, "INV_Bracer_13", "Ironweave Bracers"},
    {13107, "INV_Bracer_13", "Magiskull Cuffs"},
    {16683, "INV_Jewelry_Ring_23", "Magister's Bindings"},
    {11962, "INV_Bracer_13", "Manacle Cuffs"},
    {1974, "INV_Bracer_07", "Mindthrust Bracers"},
    {14629, "INV_Bracer_07", "Necropile Cuffs"},
    {18456, "INV_Bracer_07", "Sergeant Major's Silk Cuffs"},
    {18457, "INV_Bracer_07", "Sergeant Major's Silk Cuffs"},
    {22063, "INV_Jewelry_Ring_23", "Sorcerer's Bindings"},
    {18497, "INV_Bracer_13", "Sublime Wristguards"},
    {13409, "INV_Bracer_13", "Tearfall Bracers"},
    {22079, "INV_Belt_31", "Virtuous Bracers"},
    {13958, "INV_Bracer_04", "Wyrmthalak's Shackles"},
    {9937, "INV_Bracer_11", "Abjurer's Bands"},
    {14291, "INV_Bracer_07", "Arachnidian Bracelets"},
    {8285, "INV_Bracer_09", "Arcane Bands"},
    {4744, "INV_Bracer_18", "Arcane Runed Bracers"},
    {4043, "INV_Bracer_07", "Aurora Bracers"},
    {11469, "INV_Bracer_13", "Bloodband Bracers"},
    {14260, "INV_Bracer_09", "Bloodwoven Bracers"},
    {14301, "INV_Bracer_17", "Bonecaster's Bindings"},
    {11875, "INV_Bracer_13", "Breezecloud Bracers"},
    {3647, "INV_Bracer_02", "Bright Bracers"},
    {14166, "INV_Bracer_12", "Buccaneer's Bracers"},
    {14311, "INV_Bracer_17", "Celestial Bindings"},
    {15864, "INV_Bracer_07", "Condor Bracers"},
    {9846, "INV_Bracer_13", "Conjurer's Bracers"},
    {10096, "INV_Bracer_12", "Councillor's Cuffs"},
    {14148, "INV_Bracer_13", "Crystalline Cuffs"},
    {14240, "INV_Bracer_13", "Darkmist Bands"},
    {4133, "INV_Bracer_10", "Darkspear Cuffs"},
    {9821, "INV_Bracer_11", "Durable Bracers"},
    {10059, "INV_Bracer_07", "Duskwoven Bracers"},
    {7355, "INV_Bracer_13", "Elder's Bracers"},
    {10213, "INV_Bracer_13", "Elegant Bracers"},
    {14457, "INV_Bracer_09", "Elunarian Cuffs"},
    {14226, "INV_Bracer_09", "Embersilk Bracelets"},
    {4979, "INV_Bracer_07", "Enchanted Stonecloth Bracers"},
    {14330, "INV_Bracer_16", "Eternal Bindings"},
    {15452, "INV_Bracer_08", "Featherbead Bracers"},
    {1351, "INV_Bracer_16", "Fingerbone Bracers"},
    {10705, "INV_Bracer_12", "Firwillow Wristbands"},
    {14268, "INV_Bracer_09", "Gaea's Cuffs"},
    {2032, "INV_Bracer_10", "Gallan Cuffs"},
    {14221, "INV_Bracer_02", "Geomancer's Bracers"},
    {7525, "INV_Bracer_09", "Gossamer Bracers"},
    {9768, "INV_Bracer_12", "Greenweave Bracers"},
    {8108, "INV_Bracer_06", "Hibernal Bracers"},
    {10136, "INV_Bracer_05", "High Councillor's Bracers"},
    {14448, "INV_Bracer_13", "Highborne Bracelets"},
    {8247, "INV_Bracer_13", "Imperial Red Bracers"},
    {11768, "INV_Bracer_10", "Incendic Bracers"},
    {9793, "INV_Bracer_12", "Ivycloth Bracelets"},
    {14248, "INV_Bracer_09", "Lunar Bindings"},
    {10248, "INV_Bracer_07", "Master's Bracers"},
    {4045, "INV_Bracer_09", "Mistscape Bracers"},
    {14366, "INV_Bracer_07", "Mystic's Bracelets"},
    {10173, "INV_Bracer_10", "Mystical Bracers"},
    {6407, "INV_Bracer_07", "Nightsky Wristbands"},
    {14279, "INV_Bracer_07", "Opulent Bracers"},
    {18337, "INV_Bracer_09", "Orphic Bracers"},
    {16981, "INV_Bracer_10", "Owlbeard Bracers"},
    {14160, "INV_Bracer_11", "Pagan Bands"},
    {4545, "INV_Bracer_07", "Radiant Silver Bracers"},
    {14187, "INV_Bracer_07", "Raincaller Cuffs"},
    {7475, "INV_Bracer_09", "Regal Cuffs"},
    {14402, "INV_Bracer_01", "Resilient Bands"},
    {14320, "INV_Bracer_09", "Resplendent Bracelets"},
    {14122, "INV_Bracer_10", "Ritual Bands"},
    {9909, "INV_Bracer_09", "Royal Bands"},
    {6613, "INV_Bracer_11", "Sage's Bracers"},
    {14375, "INV_Bracer_02", "Sanguine Cuffs"},
    {3645, "INV_Bracer_07", "Seer's Cuffs"},
    {10461, "INV_Bracer_07", "Shadowy Bracers"},
    {6563, "INV_Bracer_12", "Shimmering Bracers"},
    {11917, "INV_Bracer_07", "Shizzle's Nozzle Wiper"},
    {14419, "INV_Bracer_02", "Silksand Bracers"},
    {16791, "INV_Bracer_13", "Silkstream Cuffs"},
    {4036, "INV_Bracer_07", "Silver-thread Cuffs"},
    {9879, "INV_Bracer_09", "Sorcerer Bracelets"},
    {9448, "INV_Misc_Bandage_09", "Spidertank Oilrag"},
    {14416, "INV_Bracer_07", "Stonecloth Bindings"},
    {14197, "INV_Bracer_13", "Thistlefur Bands"},
    {5315, "INV_Bracer_11", "Timberland Armguards"},
    {7437, "INV_Bracer_09", "Twilight Cuffs"},
    {14439, "INV_Bracer_06", "Venomshroud Armguards"},
    {14206, "INV_Bracer_06", "Vital Bracelets"},
    {14177, "INV_Bracer_06", "Watcher's Cuffs"},
    {6543, "INV_Bracer_12", "Willow Bracers"},
    {14429, "INV_Bracer_07", "Windchaser Cuffs"},
    {14115, "INV_Bracer_08", "Aboriginal Bands"},
    {3642, "INV_Bracer_08", "Ancestral Bracers"},
    {3644, "INV_Bracer_08", "Barbaric Cloth Bracers"},
    {14087, "INV_Bracer_12", "Beaded Cuffs"},
    {710, "INV_Bracer_11", "Bracers of the People's Militia"},
    {5590, "INV_Bracer_13", "Cord Bracers"},
    {7350, "INV_Bracer_12", "Disciple's Bracers"},
    {1183, "INV_Bracer_10", "Elastic Wristguards"},
    {3588, "INV_Bracer_13", "Embroidered Bracers"},
    {6060, "INV_Bracer_10", "Flax Bracers"},
    {3323, "INV_Bracer_07", "Ghostly Bracers"},
    {4308, "INV_Bracer_12", "Green Linen Bracers"},
    {6062, "INV_Bracer_07", "Heavy Cord Bracers"},
    {3590, "INV_Bracer_06", "Heavy Weave Bracers"},
    {2326, "INV_Bracer_12", "Ivy-weave Bracers"},
    {3641, "INV_Bracer_03", "Journeyman's Bracers"},
    {3603, "INV_Bracer_03", "Knitted Bracers"},
    {14095, "INV_Bracer_08", "Native Bands"},
    {3592, "INV_Bracer_11", "Padded Bracers"},
    {3453, "INV_Bracer_11", "Quilted Bracers"},
    {3594, "INV_Bracer_07", "Russet Bracers"},
    {3224, "INV_Bracer_08", "Silver-lined Bracers"},
    {9744, "INV_Bracer_10", "Simple Bands"},
    {3643, "INV_Bracer_06", "Spellbinder Bracers"},
    {11187, "INV_Bracer_12", "Stemleaf Bracers"},
    {3596, "INV_Bracer_07", "Tattered Cloth Bracers"},
    {3598, "INV_Bracer_11", "Thick Cloth Bracers"},
    {3600, "INV_Bracer_03", "Thin Cloth Bracers"},
    {3607, "INV_Bracer_10", "Woven Bracers"},
    {3379, "INV_Bracer_03", "Brocade Bracers"},
    {3375, "INV_Bracer_13", "Calico Bracers"},
    {3377, "INV_Bracer_13", "Canvas Bracers"},
    {3938, "INV_Bracer_05", "Crochet Bracers"},
    {3381, "INV_Bracer_13", "Cross-stitched Bracers"},
    {3365, "INV_Bracer_10", "Frayed Bracers"},
    {3794, "INV_Bracer_02", "Interlaced Bracers"},
    {3373, "INV_Bracer_07", "Patchwork Bracers"},
    {3946, "INV_Bracer_10", "Twill Bracers"}
  };
  
  /**
   * Returns all IDs, that are used by Cloth-Wrists.
   * @return  An Array of Integers, that represents all IDs, that are used by Cloth-Wrists.
   * @since 1.0
   */
  public static int[] getIDs() {
    int[] res = new int[wrists.length];
    for (int i = 0; i < wrists.length; i++) {
      res[i] = (int)wrists[i][0];
    }
    return res;
  }
  
  /**
   * Returns all Icons, that are used by Cloth-Wrists.
   * @return  An Array of Strings, that represents all Icons, that are used by Cloth-Wrists by 
   *     stating their Name.
   * @since 1.0
   */
  public static String[] getIcons() {
    String[] res = new String[wrists.length];
    for (int i = 0; i < wrists.length; i++) {
      res[i] = (String)wrists[i][1];
    }
    return res;
  }
  
  /**
   * Returns all Names of Cloth-Wrists in the Game.
   * @return  The Name of all Cloth-Wrists in the Game as an Array of Strings.
   * @since 1.0
   */
  public static String[] getNames() {
    String[] res = new String[wrists.length];
    for (int i = 0; i < wrists.length; i++) {
      res[i] = (String)wrists[i][2];
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
