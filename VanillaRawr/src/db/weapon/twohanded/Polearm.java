package db.weapon.twohanded;

public class Polearm {

  private static Object[][] polearms = {
    {21635, "INV_Weapon_Halberd_AhnQiraj", "Barb of the Sand Reaver"},
    {19167, "INV_Spear_08", "Blackfury"},
    {18869, "INV_Spear_08", "Grand Marshal's Glaive"},
    {19874, "INV_Weapon_Halberd_12", "Halberd of Smiting"},
    {18871, "INV_Spear_01", "High Warlord's Pig Sticker"},
    {17074, "INV_Spear_08", "Shadowstrike"},
    {23039, "INV_Weapon_Halberd_04", "The Eye of Nerub"},
    {17223, "INV_Spear_08", "Thunderstrike"},
    {12583, "INV_Weapon_Halberd_04", "Blackhand Doomsaw"},
    {7959, "INV_Spear_07", "Blight"},
    {13057, "INV_Spear_02", "Bloodpike"},
    {13055, "INV_Spear_06", "Bonechewer"},
    {13148, "INV_Spear_05", "Chillpike"},
    {9475, "INV_Spear_01", "Diabolic Skiver"},
    {9480, "INV_Spear_05", "Eyegouger"},
    {11809, "INV_Spear_01", "Flame Wrath"},
    {13056, "INV_Spear_07", "Frenzied Striker"},
    {12989, "INV_Spear_05", "Gargoyle's Bite"},
    {13054, "INV_Spear_02", "Grim Reaper"},
    {9416, "INV_Spear_08", "Grimlok's Charge"},
    {10799, "INV_Spear_06", "Headspike"},
    {20083, "INV_Spear_02", "Hunting Spear"},
    {22314, "INV_Spear_06", "Huntsman's Harpoon"},
    {19106, "INV_Spear_04", "Ice Barbed Spear"},
    {13058, "INV_Spear_02", "Khoo's Point"},
    {18502, "INV_Weapon_Halberd_09", "Monstrous Glaive"},
    {18725, "INV_Spear_07", "Peacemaker"},
    {19963, "INV_Spear_03", "Pitchfork of Madness"},
    {1726, "INV_Spear_02", "Poison-tipped Bone Spear"},
    {7758, "INV_Spear_08", "Ruthless Shiv"},
    {12243, "INV_Weapon_Halberd_04", "Smoldering Claw"},
    {20660, "INV_Spear_06", "Stonecutting Glaive"},
    {13059, "INV_Spear_07", "Stoneraven"},
    {13060, "INV_Spear_08", "The Needler"},
    {19946, "INV_Spear_04", "Tigule's Harpoon"},
    {6679, "INV_Spear_05", "Armor Piercer"},
    {1522, "INV_Spear_05", "Headhunting Spear"},
    {5200, "INV_Spear_07", "Impaling Harpoon"},
    {1406, "INV_Spear_06", "Pearl-encrusted Spear"},
    {11864, "INV_Spear_05", "White Bone Spear"},
    {15811, "INV_Spear_06", "Heavy Spear"},
    {15810, "INV_Spear_05", "Short Spear"},
    {1485, "INV_Spear_04", "Pitchfork"}
  };
  
  public static int[] getIDs() {
    int[] res = new int[polearms.length];
    for (int i = 0; i < polearms.length; i++) {
      res[i] = (int)polearms[i][0];
    }
    return res;
  }
  
  public static String[] getIcons() {
    String[] res = new String[polearms.length];
    for (int i = 0; i < polearms.length; i++) {
      res[i] = (String)polearms[i][1];
    }
    return res;
  }
  
  public static String[] getNames() {
    String[] res = new String[polearms.length];
    for (int i = 0; i < polearms.length; i++) {
      res[i] = (String)polearms[i][2];
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
