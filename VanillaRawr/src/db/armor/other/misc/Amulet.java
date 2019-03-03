package db.armor.other.misc;

public class Amulet {

  private static Object[][] amulets = {
    {17782, "INV_Jewelry_Amulet_04", "Talisman of Binding Shard"},
    {21702, "INV_Jewelry_Necklace_12", "Amulet of Foul Warding"},
    {21529, "INV_Jewelry_Necklace_17", "Amulet of Shadow Shielding"},
    {19491, "INV_Jewelry_Necklace_14", "Amulet of the Darkmoon"},
    {22657, "INV_Jewelry_Amulet_04", "Amulet of the Dawn"},
    {21712, "INV_Jewelry_Necklace_AhnQiraj_02", "Amulet of the Fallen God"},
    {21507, "INV_Jewelry_Necklace_AhnQiraj_03", "Amulet of the Shifting Sands"},
    {21608, "INV_Jewelry_Necklace_AhnQiraj_01", "Amulet of Vek'nilash"},
    {21690, "INV_Jewelry_Necklace_20", "Angelista's Charm"},
    {21664, "INV_Jewelry_Necklace_AhnQiraj_02", "Barbed Choker"},
    {17111, "INV_Jewelry_Talisman_01", "Blazefury Medallion"},
    {21504, "INV_Jewelry_Necklace_AhnQiraj_03", "Charm of the Shifting Sands"},
    {17109, "INV_Jewelry_Necklace_10", "Choker of Enlightenment"},
    {18814, "INV_Jewelry_Amulet_05", "Choker of the Fire Lord"},
    {21505, "INV_Jewelry_Necklace_AhnQiraj_03", "Choker of the Shifting Sands"},
    {20622, "INV_Jewelry_Necklace_18", "Dragonheart Necklace"},
    {21531, "INV_Jewelry_Necklace_22", "Drake Tooth Necklace"},
    {18205, "INV_Belt_12", "Eskhandar's Collar"},
    {23057, "INV_Jewelry_Necklace_29Naxxramas", "Gem of Trapped Innocents"},
    {22981, "INV_Jewelry_Necklace_27Naxxramas", "Gluth's Missing Collar"},
    {19588, "INV_Jewelry_Necklace_26", "Hero's Brand"},
    {19601, "INV_Jewelry_Necklace_26", "Jewel of Kajaro"},
    {1443, "INV_Jewelry_Amulet_01", "Jeweled Amulet of Cainwyn"},
    {19885, "INV_Jewelry_Ring_45", "Jin'do's Evil Eye"},
    {19605, "INV_Jewelry_Necklace_26", "Kezan's Unstoppable Taint"},
    {14558, "INV_Jewelry_Necklace_08", "Lady Maye's Pendant"},
    {1315, "INV_Misc_Flower_01", "Lei of Lilies"},
    {19621, "INV_Jewelry_Necklace_26", "Maelstrom's Wrath"},
    {22943, "INV_Jewelry_Necklace_29Naxxramas", "Malice Stone Pendant"},
    {22732, "INV_Jewelry_Necklace_AhnQiraj_04", "Mark of C'Thun"},
    {19383, "INV_Jewelry_Necklace_18", "Master Dragonslayer's Medallion"},
    {17065, "INV_Jewelry_Amulet_03", "Medallion of Steadfast Might"},
    {22659, "INV_Jewelry_Amulet_04", "Medallion of the Dawn"},
    {23036, "INV_Jewelry_Necklace_30Naxxramas", "Necklace of Necropsy"},
    {21678, "INV_Jewelry_Necklace_AhnQiraj_04", "Necklace of Purity"},
    {18404, "INV_Jewelry_Necklace_09", "Onyxia Tooth Pendant"},
    {19426, "INV_Jewelry_Necklace_16", "Orb of the Darkmoon"},
    {22947, "INV_Jewelry_Necklace_28Naxxramas", "Pendant of Forgotten Names"},
    {19371, "INV_Jewelry_Necklace_12", "Pendant of the Fallen Dragon"},
    {21700, "INV_Jewelry_Necklace_AhnQiraj_01", "Pendant of the Qiraji Guardian"},
    {21506, "INV_Jewelry_Necklace_AhnQiraj_03", "Pendant of the Shifting Sands"},
    {19377, "INV_Jewelry_Necklace_17", "Prestor's Talisman of Connivery"},
    {19613, "INV_Jewelry_Necklace_26", "Pristine Enchanted South Seas Kelp"},
    {19577, "INV_Jewelry_Necklace_26", "Rage of Mugamba"},
    {23023, "INV_Jewelry_Necklace_29Naxxramas", "Sadist's Collar"},
    {19876, "INV_Jewelry_Necklace_19", "Soul Corrupter's Necklace"},
    {23053, "INV_Jewelry_Necklace_28Naxxramas", "Stormrage's Talisman of Seething"},
    {19594, "INV_Jewelry_Necklace_26", "The All-Seeing Eye of Zuldazar"},
    {19856, "INV_Jewelry_Necklace_22", "The Eye of Hakkar"},
    {22935, "INV_Jewelry_Amulet_04", "Touch of Frost"},
    {19609, "INV_Jewelry_Necklace_26", "Unmarred Vision of Voodress"},
    {20685, "INV_Jewelry_Necklace_21", "Wavefront Necklace"},
    {19617, "INV_Jewelry_Necklace_26", "Zandalarian Shadow Mastery Talisman"},
    {20695, "INV_Jewelry_Necklace_04", "Abyssal War Beads"},
    {10824, "INV_Jewelry_Necklace_07", "Amberglow Talisman"},
    {22327, "INV_Jewelry_Necklace_08", "Amulet of the Redeemed"},
    {18728, "INV_Jewelry_Necklace_11", "Anastari Heirloom"},
    {18723, "INV_Jewelry_Necklace_01", "Animated Chain Necklace"},
    {20037, "INV_Misc_Gem_Topaz_01", "Arcane Crystal Pendant"},
    {15856, "INV_Jewelry_Necklace_11", "Archlight Talisman"},
    {18289, "INV_Jewelry_Necklace_09", "Barbed Thorn Necklace"},
    {22150, "INV_Jewelry_Amulet_05", "Beads of Ogre Might"},
    {22149, "INV_Jewelry_Amulet_05", "Beads of Ogre Mojo"},
    {23125, "INV_Belt_18", "Chains of the Lich"},
    {12059, "INV_Jewelry_Amulet_03", "Conqueror's Medallion"},
    {18691, "INV_Jewelry_Necklace_06", "Dark Advisor's Pendant"},
    {19303, "INV_Jewelry_Necklace_11", "Darkmoon Necklace"},
    {22403, "INV_Jewelry_Necklace_10", "Diana's Pearl Necklace"},
    {10711, "INV_Jewelry_Necklace_02", "Dragon's Blood Necklace"},
    {10829, "INV_Jewelry_Amulet_04", "Dragon's Eye"},
    {16309, "INV_Jewelry_Talisman_11", "Drakefire Amulet"},
    {18340, "INV_Jewelry_Talisman_14", "Eidolon Talisman"},
    {18397, "INV_Jewelry_Necklace_07", "Elder Magus Pendant"},
    {12929, "INV_Jewelry_Necklace_05", "Emberfury Talisman"},
    {19611, "INV_Jewelry_Necklace_24", "Enchanted South Seas Kelp"},
    {19612, "INV_Jewelry_Necklace_25", "Enchanted South Seas Kelp"},
    {18381, "INV_Misc_Eye_01", "Evil Eye Pendant"},
    {19096, "INV_Jewelry_Necklace_07", "Frostwolf Advisor's Pendant"},
    {19095, "INV_Jewelry_Necklace_16", "Frostwolf Legionnaire's Pendant"},
    {21809, "INV_Jewelry_Necklace_14", "Fury of the Forgotten Swarm"},
    {13088, "INV_Jewelry_Amulet_01", "Gazlowe's Charm"},
    {17707, "INV_Stone_01", "Gemshard Heart"},
    {7731, "INV_Jewelry_Necklace_06", "Ghostshard Talisman"},
    {10769, "INV_Misc_Orb_03", "Glowing Eye of Mordresh"},
    {13212, "INV_Belt_14", "Halycon's Spiked Collar"},
    {13960, "INV_Misc_Orb_03", "Heart of the Fiend"},
    {19585, "INV_Jewelry_Necklace_24", "Heathen's Brand"},
    {19586, "INV_Jewelry_Necklace_25", "Heathen's Brand"},
    {13085, "INV_Jewelry_Necklace_11", "Horizon Choker"},
    {11933, "INV_Misc_Gem_Sapphire_01", "Imperial Jewel"},
    {7888, "INV_Jewelry_Necklace_02", "Jarkal's Enhancing Necklace"},
    {19923, "INV_Jewelry_Necklace_03", "Jeklik's Opaline Talisman"},
    {13084, "INV_Jewelry_Amulet_07", "Kaleidoscope Chain"},
    {19603, "INV_Jewelry_Necklace_24", "Kezan's Taint"},
    {19604, "INV_Jewelry_Necklace_25", "Kezan's Taint"},
    {13002, "INV_Jewelry_Amulet_03", "Lady Alizabeth's Pendant"},
    {9641, "INV_Jewelry_Necklace_02", "Lifeblood Amulet"},
    {19619, "INV_Jewelry_Necklace_24", "Maelstrom's Tendril"},
    {19620, "INV_Jewelry_Necklace_25", "Maelstrom's Tendril"},
    {15411, "INV_Jewelry_Talisman_07", "Mark of Fordring"},
    {18442, "INV_Misc_MonsterScales_09", "Master Sergeant's Insignia"},
    {18443, "INV_Misc_MonsterScales_09", "Master Sergeant's Insignia"},
    {18444, "INV_Misc_MonsterScales_09", "Master Sergeant's Insignia"},
    {13091, "INV_Jewelry_Talisman_08", "Medallion of Grand Marshal Morris"},
    {1714, "INV_Jewelry_Necklace_10", "Necklace of Calisea"},
    {19599, "INV_Jewelry_Necklace_24", "Pebble of Kajaro"},
    {19600, "INV_Jewelry_Necklace_25", "Pebble of Kajaro"},
    {22340, "INV_Jewelry_Necklace_04", "Pendant of Celerity"},
    {13087, "INV_Jewelry_Necklace_09", "River Pride Choker"},
    {23169, "INV_Jewelry_Necklace_03", "Scorn's Icy Choker"},
    {19534, "INV_Jewelry_Necklace_14", "Scout's Medallion"},
    {19535, "INV_Jewelry_Necklace_14", "Scout's Medallion"},
    {19536, "INV_Jewelry_Necklace_14", "Scout's Medallion"},
    {19537, "INV_Jewelry_Necklace_14", "Scout's Medallion"},
    {20442, "INV_Jewelry_Necklace_14", "Scout's Medallion"},
    {15200, "INV_Misc_MonsterScales_15", "Senior Sergeant's Insignia"},
    {16335, "INV_Misc_MonsterScales_15", "Senior Sergeant's Insignia"},
    {18428, "INV_Misc_MonsterScales_15", "Senior Sergeant's Insignia"},
    {19538, "INV_Jewelry_Necklace_13", "Sentinel's Medallion"},
    {19539, "INV_Jewelry_Necklace_13", "Sentinel's Medallion"},
    {19540, "INV_Jewelry_Necklace_13", "Sentinel's Medallion"},
    {19541, "INV_Jewelry_Necklace_13", "Sentinel's Medallion"},
    {20444, "INV_Jewelry_Necklace_13", "Sentinel's Medallion"},
    {13089, "INV_Jewelry_Amulet_07", "Skibi's Pendant"},
    {12103, "INV_Jewelry_Talisman_08", "Star of Mystaria"},
    {19098, "INV_Jewelry_Necklace_08", "Stormpike Sage's Pendant"},
    {19097, "INV_Jewelry_Necklace_15", "Stormpike Soldier's Pendant"},
    {19575, "INV_Jewelry_Necklace_24", "Strength of Mugamba"},
    {19576, "INV_Jewelry_Necklace_25", "Strength of Mugamba"},
    {6695, "INV_Jewelry_Necklace_04", "Stygian Bone Amulet"},
    {13177, "INV_Jewelry_Amulet_04", "Talisman of Evasion"},
    {19871, "INV_Jewelry_Necklace_21", "Talisman of Protection"},
    {7673, "INV_Jewelry_Necklace_02", "Talvash's Enhancing Necklace"},
    {18317, "INV_Jewelry_Necklace_03", "Tempest Talisman"},
    {18678, "INV_Jewelry_Necklace_03", "Tempestria's Frozen Necklace"},
    {19592, "INV_Jewelry_Necklace_24", "The Eye of Zuldazar"},
    {19593, "INV_Jewelry_Necklace_25", "The Eye of Zuldazar"},
    {13141, "INV_Jewelry_Necklace_09", "Tooth of Gnarr"},
    {7722, "INV_Jewelry_Amulet_01", "Triune Amulet"},
    {11755, "INV_Misc_Bandage_14", "Verek's Collar"},
    {19607, "INV_Jewelry_Necklace_24", "Vision of Voodress"},
    {19608, "INV_Jewelry_Necklace_25", "Vision of Voodress"},
    {17044, "INV_Jewelry_Talisman_07", "Will of the Martyr"},
    {19159, "INV_Misc_Herb_15", "Woven Ivy Necklace"},
    {19615, "INV_Jewelry_Necklace_24", "Zandalarian Shadow Talisman"},
    {19616, "INV_Jewelry_Necklace_25", "Zandalarian Shadow Talisman"},
    {12044, "INV_Jewelry_Necklace_07", "Arctic Pendant"},
    {12028, "INV_Jewelry_Necklace_08", "Basalt Necklace"},
    {12019, "INV_Jewelry_Necklace_01", "Cerulean Talisman"},
    {4112, "INV_Jewelry_Necklace_04", "Choker of the High Shaman"},
    {5003, "INV_Jewelry_Necklace_02", "Crystal Starfire Medallion"},
    {12043, "INV_Jewelry_Necklace_08", "Desert Choker"},
    {5005, "INV_Jewelry_Necklace_05", "Emberspark Pendant"},
    {19610, "INV_Jewelry_Necklace_23", "Enchanted South Seas Kelp"},
    {7551, "INV_Jewelry_Necklace_07", "Entwined Opaline Talisman"},
    {4430, "INV_Jewelry_Necklace_03", "Ethereal Talisman"},
    {7746, "INV_Jewelry_Talisman_01", "Explorers' League Commendation"},
    {7549, "INV_Belt_31", "Fairy's Embrace"},
    {13473, "INV_Jewelry_Talisman_11", "Felstone Good Luck Charm"},
    {11946, "INV_Jewelry_Necklace_02", "Fire Opal Necklace"},
    {12040, "INV_Jewelry_Necklace_01", "Forest Pendant"},
    {5002, "INV_Jewelry_Necklace_01", "Glowing Green Talisman"},
    {10299, "INV_Jewelry_Necklace_03", "Gnomeregan Amulet"},
    {12036, "INV_Jewelry_Necklace_09", "Granite Necklace"},
    {12029, "INV_Jewelry_Necklace_01", "Greenstone Talisman"},
    {19579, "INV_Jewelry_Necklace_23", "Heathen's Brand"},
    {15799, "INV_Jewelry_Amulet_03", "Heroic Commendation Medal"},
    {15704, "INV_Jewelry_Amulet_03", "Hunter's Insignia Medal"},
    {12022, "INV_Jewelry_Necklace_05", "Iridium Chain"},
    {12030, "INV_Jewelry_Necklace_06", "Jet Chain"},
    {12046, "INV_Jewelry_Necklace_01", "Jungle Necklace"},
    {19602, "INV_Jewelry_Necklace_23", "Kezan's Taint"},
    {15690, "INV_Jewelry_Necklace_09", "Kodobone Necklace"},
    {12031, "INV_Jewelry_Necklace_07", "Lodestone Necklace"},
    {19618, "INV_Jewelry_Necklace_23", "Maelstrom's Tendril"},
    {12034, "INV_Jewelry_Necklace_07", "Marble Necklace"},
    {12042, "INV_Jewelry_Necklace_04", "Marsh Chain"},
    {6723, "INV_Jewelry_Amulet_03", "Medal of Courage"},
    {11196, "INV_Jewelry_Necklace_07", "Mindburst Medallion"},
    {20645, "INV_Jewelry_Necklace_01", "Nature's Whisper"},
    {5180, "INV_Jewelry_Amulet_04", "Necklace of Harmony"},
    {10778, "INV_Jewelry_Amulet_05", "Necklace of Sanctuary"},
    {12035, "INV_Jewelry_Necklace_06", "Obsidian Pendant"},
    {12032, "INV_Jewelry_Necklace_06", "Onyx Choker"},
    {16623, "INV_Jewelry_Necklace_08", "Opaline Medallion"},
    {19598, "INV_Jewelry_Necklace_23", "Pebble of Kajaro"},
    {4614, "INV_Jewelry_Necklace_07", "Pendant of Myzrael"},
    {12048, "INV_Jewelry_Necklace_11", "Prismatic Pendant"},
    {17773, "INV_Jewelry_Necklace_06", "Prodigious Shadowshard Pendant"},
    {4743, "INV_Misc_Gem_Sapphire_02", "Pulsating Crystalline Shard"},
    {12026, "INV_Jewelry_Necklace_11", "Quicksilver Pendant"},
    {12025, "INV_Jewelry_Necklace_04", "Selenium Chain"},
    {9243, "INV_Misc_Organ_01", "Shriveled Heart"},
    {12047, "INV_Jewelry_Necklace_04", "Spectral Necklace"},
    {19574, "INV_Jewelry_Necklace_23", "Strength of Mugamba"},
    {20649, "INV_Jewelry_Necklace_15", "Sunprism Pendant"},
    {12045, "INV_Jewelry_Necklace_06", "Swamp Pendant"},
    {5029, "INV_Jewelry_Necklace_09", "Talisman of the Naga Lord"},
    {12023, "INV_Jewelry_Necklace_03", "Tellurium Necklace"},
    {12020, "INV_Jewelry_Necklace_09", "Thallium Choker"},
    {19591, "INV_Jewelry_Necklace_23", "The Eye of Zuldazar"},
    {12039, "INV_Jewelry_Necklace_11", "Tundra Necklace"},
    {12024, "INV_Jewelry_Necklace_07", "Vanadium Talisman"},
    {12027, "INV_Jewelry_Necklace_10", "Vermilion Necklace"},
    {19606, "INV_Jewelry_Necklace_23", "Vision of Voodress"},
    {16009, "INV_Jewelry_Amulet_07", "Voice Amplification Modulator"},
    {5754, "INV_Jewelry_Amulet_03", "Wolfpack Medallion"},
    {19614, "INV_Jewelry_Necklace_23", "Zandalarian Shadow Talisman"},
    {17772, "INV_Jewelry_Necklace_06", "Zealous Shadowshard Pendant"},
    {9333, "INV_Belt_18", "Tarnished Silver Necklace"}
  };
  
  public static int[] getIDs() {
    int[] res = new int[amulets.length];
    for (int i = 0; i < amulets.length; i++) {
      res[i] = (int)amulets[i][0];
    }
    return res;
  }
  
  public static String[] getIcons() {
    String[] res = new String[amulets.length];
    for (int i = 0; i < amulets.length; i++) {
      res[i] = (String)amulets[i][1];
    }
    return res;
  }
  
  public static String[] getNames() {
    String[] res = new String[amulets.length];
    for (int i = 0; i < amulets.length; i++) {
      res[i] = (String)amulets[i][2];
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
