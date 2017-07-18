package db.armor.plate;

public class Chest {

  private static Object[][] chests = {
    {21389, "INV_Chest_Plate03", "Avenger's Breastplate"},
    {21814, "INV_Chest_Plate02", "Breastplate of Annihilation"},
    {21997, "INV_Chest_Plate03", "Breastplate of Heroism"},
    {16865, "INV_Chest_Plate16", "Breastplate of Might"},
    {12895, "INV_Chest_Plate09", "Breastplate of the Chromatic Flight"},
    {16966, "INV_Chest_Plate16", "Breastplate of Wrath"},
    {21331, "INV_Chest_Plate12", "Conqueror's Breastplate"},
    {22416, "INV_Chest_Plate02", "Dreadnaught Breastplate"},
    {16473, "INV_Chest_Plate03", "Field Marshal's Lamellar Chestplate"},
    {16477, "INV_Chest_Plate03", "Field Marshal's Plate Armor"},
    {22669, "INV_Chest_Chain_11", "Icebane Breastplate"},
    {16958, "INV_Chest_Plate03", "Judgement Breastplate"},
    {16853, "INV_Chest_Plate03", "Lawbringer Chestguard"},
    {23000, "INV_Chest_Chain_15", "Plated Abomination Ribcage"},
    {22425, "INV_Chest_Chain_15", "Redemption Tunic"},
    {21652, "INV_Chest_Plate09", "Silithid Carapace Chestguard"},
    {22089, "INV_Chest_Plate03", "Soulforge Breastplate"},
    {22196, "INV_Chest_Chain_17", "Thick Obsidian Breastplate"},
    {16541, "INV_Chest_Plate16", "Warlord's Plate Armor"},
    {19825, "INV_Chest_Plate07", "Zandalar Freethinker's Breastplate"},
    {19822, "INV_Chest_Plate07", "Zandalar Vindicator's Breastplate"},
    {23087, "INV_Chest_Plate10", "Breastplate of Undead Slaying"},
    {16730, "INV_Chest_Plate03", "Breastplate of Valor"},
    {11678, "INV_Chest_Plate08", "Carapace of Anub'shiah"},
    {10775, "INV_Chest_Plate08", "Carapace of Tuten'kash"},
    {11604, "INV_Chest_Plate08", "Dark Iron Plate"},
    {20550, "INV_Chest_Plate06", "Darkrune Breastplate"},
    {19693, "INV_Chest_Plate08", "Darksoul Breastplate"},
    {14624, "INV_Chest_Chain_15", "Deathbone Chestplate"},
    {12628, "INV_Chest_Plate06", "Demon Forged Breastplate"},
    {12618, "INV_Chest_Plate10", "Enchanted Thorium Breastplate"},
    {18312, "INV_Chest_Plate11", "Energized Chestplate"},
    {13067, "INV_Chest_Plate06", "Hydralick Armor"},
    {22762, "INV_Chest_Plate07", "Ironvine Breastplate"},
    {16433, "INV_Chest_Plate03", "Knight-Captain's Lamellar Breastplate"},
    {23272, "INV_Chest_Plate03", "Knight-Captain's Lamellar Breastplate"},
    {16430, "INV_Chest_Plate16", "Knight-Captain's Plate Chestguard"},
    {23300, "INV_Chest_Plate16", "Knight-Captain's Plate Hauberk"},
    {18503, "INV_Chest_Chain_14", "Kromcrush's Chestplate"},
    {16513, "INV_Chest_Plate16", "Legionnaire's Plate Armor"},
    {22872, "INV_Chest_Plate16", "Legionnaire's Plate Hauberk"},
    {16726, "INV_Chest_Plate03", "Lightforge Breastplate"},
    {15413, "INV_Chest_Plate09", "Ornate Adamantium Breastplate"},
    {13168, "INV_Chest_Plate13", "Plate of the Shaman King"},
    {13394, "INV_Chest_Chain_15", "Skul's Cold Embrace"},
    {11633, "INV_Chest_Plate02", "Spiderfang Carapace"},
    {7939, "INV_Chest_Plate04", "Truesilver Breastplate"},
    {10845, "INV_Chest_Plate08", "Warrior's Embrace"},
    {8312, "INV_Chest_Chain_05", "Alabaster Breastplate"},
    {14948, "INV_Chest_Chain_07", "Bloodforged Chestpiece"},
    {14904, "INV_Chest_Chain_04", "Brutish Breastplate"},
    {8138, "INV_Chest_Plate14", "Chromite Chestplate"},
    {10378, "INV_Chest_Plate06", "Commander's Armor"},
    {9966, "INV_Chest_Leather_07", "Embossed Plate Armor"},
    {10275, "INV_Chest_Cloth_06", "Emerald Breastplate"},
    {14975, "INV_Chest_Plate10", "Exalted Harness"},
    {9286, "INV_Chest_Plate14", "Field Plate Armor"},
    {14966, "INV_Chest_Plate03", "Glorious Breastplate"},
    {10086, "INV_Chest_Leather_07", "Gothic Plate Armor"},
    {10240, "INV_Chest_Leather_08", "Heavy Lamellar Chestpiece"},
    {7930, "INV_Chest_Plate10", "Heavy Mithril Breastplate"},
    {14931, "INV_Chest_Chain_10", "Heroic Armor"},
    {14958, "INV_Chest_Chain_14", "High Chief's Armor"},
    {10384, "INV_Chest_Plate16", "Hyperion Armor"},
    {10368, "INV_Chest_Plate09", "Imbued Plate Armor"},
    {12422, "INV_Chest_Plate10", "Imperial Plate Chest"},
    {14915, "INV_Chest_Plate07", "Jade Breastplate"},
    {8157, "INV_Chest_Plate11", "Jouster's Chestplate"},
    {14924, "INV_Chest_Wolf", "Lofty Breastplate"},
    {7935, "INV_Chest_Plate10", "Ornate Mithril Breastplate"},
    {10203, "INV_Chest_Plate04", "Overlord's Chestplate"},
    {10128, "INV_Chest_Plate11", "Revenant Chestplate"},
    {12613, "INV_Chest_Plate11", "Runic Breastplate"},
    {14895, "INV_Chest_Plate08", "Saltstone Surcoat"},
    {14844, "INV_Chest_Plate16", "Sunscale Chestguard"},
    {14821, "INV_Chest_Plate11", "Symbolic Breastplate"},
    {10164, "INV_Chest_Plate16", "Templar Chestplate"},
    {12405, "INV_Chest_Plate08", "Thorium Armor"},
    {14835, "INV_Chest_Plate08", "Tyrant's Chestpiece"},
    {21322, "INV_Chest_Plate16", "Ursa's Embrace"},
    {8274, "INV_Chest_Cloth_05", "Valorous Chestguard"},
    {14854, "INV_Chest_Plate09", "Vanguard Breastplate"},
    {14939, "INV_Chest_Leather_10", "Warbringer's Chestguard"},
    {11195, "INV_Chest_Chain_16", "Warforged Chestplate"},
    {14862, "INV_Chest_Plate09", "Warleader's Breastplate"},
    {8094, "INV_Chest_Plate04", "Platemail Armor"},
    {8080, "INV_Chest_Plate04", "Light Plate Chestpiece"}
  };
  
  public static int[] getIDs() {
    int[] res = new int[chests.length];
    for (int i = 0; i < chests.length; i++)
      res[i] = (int)chests[i][0];
    return res;
  }
  
  public static String[] getIcons() {
    String[] res = new String[chests.length];
    for (int i = 0; i < chests.length; i++)
      res[i] = (String)chests[i][1];
    return res;
  }
  
  public static String[] getNames() {
    String[] res = new String[chests.length];
    for (int i = 0; i < chests.length; i++)
      res[i] = (String)chests[i][2];
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
