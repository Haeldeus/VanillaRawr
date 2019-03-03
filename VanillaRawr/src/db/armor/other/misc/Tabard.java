package db.armor.other.misc;

public class Tabard {

  private static Object[][] tabards = {
    {20132, "INV_Shirt_GuildTabard_01", "Arathor Battle Tabard"},
    {20131, "INV_Shirt_GuildTabard_01", "Battle Tabard of the Defilers"},
    {19160, "INV_Shirt_GuildTabard_01", "Contest Winner's Tabard"},
    {19031, "INV_Shirt_GuildTabard_01", "Frostwolf Battle Tabard"},
    {5976, "INV_Shirt_GuildTabard_01", "Guild Tabard"},
    {15198, "INV_Misc_TabardPVP_03", "Knight's Colors"},
    {15196, "INV_Misc_TabardPVP_01", "Private's Tabard"},
    {15197, "INV_Misc_TabardPVP_02", "Scout's Tabard"},
    {19506, "INV_Shirt_GuildTabard_01", "Silverwing Battle Tabard"},
    {15199, "INV_Misc_TabardPVP_04", "Stone Guard's Herald"},
    {19032, "INV_Shirt_GuildTabard_01", "Stormpike Battle Tabard"},
    {11364, "INV_Shirt_GuildTabard_01", "Tabard of Stormwind"},
    {22999, "INV_Shirt_GuildTabard_01", "Tabard of the Argent Dawn"},
    {23192, "INV_Misc_Cape_18", "Tabard of the Scarlet Crusade"},
    {19505, "INV_Shirt_GuildTabard_01", "Warsong Battle Tabard"}
  };
  
  public static int[] getIDs() {
    int[] res = new int[tabards.length];
    for (int i = 0; i < tabards.length; i++) {
      res[i] = (int)tabards[i][0];
    }
    return res;
  }
  
  public static String[] getIcons() {
    String[] res = new String[tabards.length];
    for (int i = 0; i < tabards.length; i++) {
      res[i] = (String)tabards[i][1];
    }
    return res;
  }
  
  public static String[] getNames() {
    String[] res = new String[tabards.length];
    for (int i = 0; i < tabards.length; i++) {
      res[i] = (String)tabards[i][2];
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
