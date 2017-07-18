package db.armor.other.misc;

public class Shirt {

  private static Object[][] shirts = {
    {6097, "INV_Shirt_01", "Acolyte's Shirt"},
    {6096, "INV_Shirt_01", "Apprentice's Shirt"},
    {4336, "INV_Shirt_Black_01", "Black Swashbuckler's Shirt"},
    {2577, "INV_Shirt_Blue_01", "Blue Linen Shirt"},
    {3426, "INV_Shirt_Yellow_01", "Bold Yellow Shirt"},
    {6125, "INV_Chest_Leather_04", "Brawler's Harness"},
    {4332, "INV_Shirt_Yellow_01", "Bright Yellow Shirt"},
    {4344, "INV_Shirt_02", "Brown Linen Shirt"},
    {3342, "INV_Shirt_14", "Captain Sander's Shirt"},
    {16059, "INV_Shirt_Orange_01", "Common Brown Shirt"},
    {3428, "INV_Shirt_Grey_01", "Common Gray Shirt"},
    {16060, "INV_Shirt_White_01", "Common White Shirt"},
    {4333, "INV_Shirt_Black_01", "Dark Silk Shirt"},
    {5107, "INV_Shirt_12", "Deckhand's Shirt"},
    {859, "INV_Shirt_02", "Fine Cloth Shirt"},
    {49, "INV_Shirt_05", "Footpad's Shirt"},
    {4334, "INV_Shirt_08", "Formal White Shirt"},
    {2587, "INV_Shirt_Grey_01", "Gray Woolen Shirt"},
    {17723, "INV_Shirt_Green_01", "Green Holiday Shirt"},
    {2579, "INV_Shirt_Green_01", "Green Linen Shirt"},
    {10054, "INV_Shirt_Purple_01", "Lavender Mageweave Shirt"},
    {11840, "INV_Shirt_Black_01", "Master Builder's Shirt"},
    {53, "INV_Shirt_01", "Neophyte's Shirt"},
    {10056, "INV_Shirt_Orange_01", "Orange Mageweave Shirt"},
    {10052, "INV_Shirt_Orange_01", "Orange Martial Shirt"},
    {10055, "INV_Shirt_Red_01", "Pink Mageweave Shirt"},
    {154, "INV_Misc_Cape_14", "Primitive Mantle"},
    {6134, "INV_Misc_Cape_13", "Primitive Mantle"},
    {38, "INV_Shirt_05", "Recruit's Shirt"},
    {6120, "INV_Shirt_05", "Recruit's Shirt"},
    {2575, "INV_Shirt_Red_01", "Red Linen Shirt"},
    {6796, "INV_Shirt_Red_01", "Red Swashbuckler's Shirt"},
    {4335, "INV_Shirt_16", "Rich Purple Silk Shirt"},
    {148, "INV_Shirt_01", "Rugged Trapper's Shirt"},
    {14617, "INV_Shirt_Red_01", "Sawbones Shirt"},
    {45, "INV_Shirt_01", "Squire's Shirt"},
    {6117, "INV_Shirt_01", "Squire's Shirt"},
    {3427, "INV_Shirt_Black_01", "Stylish Black Shirt"},
    {6384, "INV_Shirt_Blue_01", "Stylish Blue Shirt"},
    {6385, "INV_Shirt_Green_01", "Stylish Green Shirt"},
    {4330, "INV_Shirt_Red_01", "Stylish Red Shirt"},
    {2105, "INV_Shirt_14", "Thug Shirt"},
    {6136, "INV_Shirt_14", "Thug Shirt"},
    {127, "INV_Shirt_07", "Trapper's Shirt"},
    {10034, "INV_Shirt_08", "Tuxedo Shirt"},
    {2576, "INV_Shirt_White_01", "White Linen Shirt"},
    {6795, "INV_Shirt_White_01", "White Swashbuckler's Shirt"},
    {6833, "INV_Shirt_08", "White Tuxedo Shirt"},
    {3148, "INV_Shirt_08", "Work Shirt"}
  };
  
  public static int[] getIDs() {
    int[] res = new int[shirts.length];
    for (int i = 0; i < shirts.length; i++)
      res[i] = (int)shirts[i][0];
    return res;
  }
  
  public static String[] getIcons() {
    String[] res = new String[shirts.length];
    for (int i = 0; i < shirts.length; i++)
      res[i] = (String)shirts[i][1];
    return res;
  }
  
  public static String[] getNames() {
    String[] res = new String[shirts.length];
    for (int i = 0; i < shirts.length; i++)
      res[i] = (String)shirts[i][2];
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
