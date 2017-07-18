package db.armor.plate;

public class Head {

  private static Object[][] heads = {
    {21387, "INV_Helmet_72", "Avenger's Crown"},
    {21329, "INV_Helmet_72", "Conqueror's Crown"},
    {19148, "INV_Helmet_22", "Dark Iron Helm"},
    {22418, "INV_Helmet_58", "Dreadnaught Helmet"},
    {16474, "INV_Helmet_05", "Field Marshal's Lamellar Faceguard"},
    {16478, "INV_Helmet_05", "Field Marshal's Plate Helm"},
    {21460, "INV_Helmet_09", "Helm of Domination"},
    {19372, "INV_Helmet_10", "Helm of Endless Rage"},
    {21999, "INV_Helmet_02", "Helm of Heroism"},
    {16866, "INV_Helmet_09", "Helm of Might"},
    {16963, "INV_Helmet_71", "Helm of Wrath"},
    {23019, "INV_Helmet_06", "Icebane Helmet"},
    {16955, "INV_Helmet_74", "Judgement Crown"},
    {16854, "INV_Helmet_05", "Lawbringer Helm"},
    {12640, "INV_Helmet_36", "Lionheart Helm"},
    {22428, "INV_Helmet_15", "Redemption Headpiece"},
    {22091, "INV_Helmet_08", "Soulforge Helm"},
    {16542, "INV_Helmet_09", "Warlord's Plate Headpiece"},
    {10749, "INV_Helmet_22", "Avenguard Helm"},
    {16514, "INV_Helmet_09", "Champion's Plate Headguard"},
    {23244, "INV_Helmet_09", "Champion's Plate Helm"},
    {20551, "INV_Helmet_10", "Darkrune Helm"},
    {12620, "INV_Helmet_02", "Enchanted Thorium Helm"},
    {22223, "INV_Helmet_20", "Foreman's Head Protector"},
    {20521, "INV_Helmet_01", "Fury Visor"},
    {11746, "INV_Helmet_23", "Golem Skull Helm"},
    {18718, "INV_Helmet_10", "Grand Crusader's Helm"},
    {20263, "INV_Helmet_25", "Gurubashi Helm"},
    {12952, "INV_Helmet_23", "Gyth's Skull"},
    {18313, "INV_Helmet_19", "Helm of Awareness"},
    {22411, "INV_Helmet_01", "Helm of the Executioner"},
    {21803, "INV_Helmet_03", "Helm of the Holy Avenger"},
    {17734, "INV_Helmet_20", "Helm of the Mountain"},
    {16731, "INV_Helmet_02", "Helm of Valor"},
    {9394, "INV_Helmet_25", "Horned Viking Helmet"},
    {10763, "INV_Helmet_13", "Icemetal Barbute"},
    {16434, "INV_Helmet_05", "Lieutenant Commander's Lamellar Headguard"},
    {23276, "INV_Helmet_05", "Lieutenant Commander's Lamellar Headguard"},
    {16429, "INV_Helmet_05", "Lieutenant Commander's Plate Helm"},
    {23314, "INV_Helmet_09", "Lieutenant Commander's Plate Helm"},
    {16727, "INV_Helmet_08", "Lightforge Helm"},
    {13073, "INV_Helmet_25", "Mugthol's Helm"},
    {12633, "INV_Helmet_13", "Whitesoul Helm"},
    {8317, "INV_Helmet_16", "Alabaster Plate Helmet"},
    {14952, "INV_Helmet_12", "Bloodforged Helmet"},
    {14907, "INV_Helmet_25", "Brutish Helmet"},
    {8142, "INV_Helmet_22", "Chromite Barbute"},
    {10379, "INV_Helmet_01", "Commander's Helm"},
    {9969, "INV_Helmet_25", "Embossed Plate Helmet"},
    {10279, "INV_Helmet_10", "Emerald Helm"},
    {14979, "INV_Helmet_10", "Exalted Helmet"},
    {9290, "INV_Helmet_22", "Field Plate Helmet"},
    {14969, "INV_Helmet_05", "Glorious Headdress"},
    {10090, "INV_Helmet_10", "Gothic Plate Helmet"},
    {10241, "INV_Helmet_21", "Heavy Lamellar Helm"},
    {7934, "INV_Helmet_10", "Heavy Mithril Helm"},
    {14935, "INV_Helmet_20", "Heroic Skullcap"},
    {14961, "INV_Helmet_23", "High Chief's Crown"},
    {10388, "INV_Helmet_12", "Hyperion Helm"},
    {10372, "INV_Helmet_06", "Imbued Plate Helmet"},
    {12427, "INV_Helmet_22", "Imperial Plate Helm"},
    {14919, "INV_Belt_25", "Jade Circlet"},
    {8161, "INV_Helmet_57", "Jouster's Visor"},
    {14925, "INV_Helmet_10", "Lofty Helm"},
    {7937, "INV_Helmet_10", "Ornate Mithril Helm"},
    {10207, "INV_Crown_01", "Overlord's Crown"},
    {10132, "INV_Helmet_03", "Revenant Helmet"},
    {12612, "INV_Helmet_03", "Runic Plate Helm"},
    {14899, "INV_Helmet_20", "Saltstone Helm"},
    {18480, "INV_Helmet_23", "Scarab Plate Helm"},
    {9664, "INV_Helmet_19", "Sentinel's Guard"},
    {20640, "INV_Helmet_20", "Southsea Head Bucket"},
    {14849, "INV_Helmet_22", "Sunscale Helmet"},
    {14831, "INV_Crown_02", "Symbolic Crown"},
    {10168, "INV_Crown_01", "Templar Crown"},
    {12410, "INV_Helmet_23", "Thorium Helm"},
    {14843, "INV_Helmet_12", "Tyrant's Helm"},
    {8279, "INV_Helmet_22", "Valorous Helm"},
    {14858, "INV_Helmet_19", "Vanguard Headdress"},
    {14944, "INV_Belt_28", "Warbringer's Crown"},
    {14866, "INV_Helmet_19", "Warleader's Crown"},
    {8092, "INV_Helmet_03", "Platemail Helm"},
    {7922, "INV_Helmet_03", "Steel Plate Helm"},
    {8755, "INV_Helmet_03", "Light Plate Helmet"}
  };
  
  public static int[] getIDs() {
    int[] res = new int[heads.length];
    for (int i = 0; i < heads.length; i++)
      res[i] = (int)heads[i][0];
    return res;
  }
  
  public static String[] getIcons() {
    String[] res = new String[heads.length];
    for (int i = 0; i < heads.length; i++)
      res[i] = (String)heads[i][1];
    return res;
  }
  
  public static String[] getNames() {
    String[] res = new String[heads.length];
    for (int i = 0; i < heads.length; i++)
      res[i] = (String)heads[i][2];
    return res;
  }
  
  public static void main(String[] args) {
    int[] t1 = getIDs();
    String[] t2 = getIcons();
    String[] t3 = getNames();
    for (int i = 0; i < t1.length; i++)
      System.out.println(t1[i] + ", " + t2[i] + ", " + t3[i]);
  }
}
