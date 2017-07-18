package db.weapon.ranged;

public class Crossbow {

  private static Object[][] crossbows = {
    {19361, "INV_Weapon_Crossbow_09", "Ashjre'thul, Crossbow of Smiting"},
    {21459, "INV_Weapon_Crossbow_06", "Crossbow of Imminent Doom"},
    {18836, "INV_Weapon_Crossbow_04", "Grand Marshal's Repeater"},
    {18837, "INV_Weapon_Crossbow_10", "High Warlord's Crossbow"},
    {22812, "INV_Weapon_Crossbow_12", "Nerubian Slavemaker"},
    {20599, "INV_Weapon_Crossbow_11", "Polished Ironwood Crossbow"},
    {12651, "INV_Weapon_Crossbow_04", "Blackcrow"},
    {19107, "INV_Weapon_Crossbow_07", "Bloodseeker"},
    {18738, "INV_Weapon_Crossbow_04", "Carapace Spine Crossbow"},
    {13037, "INV_Weapon_Crossbow_04", "Crystalpine Stinger"},
    {22347, "INV_Weapon_Crossbow_04", "Fahrad's Reloading Repeater"},
    {13040, "INV_Weapon_Crossbow_04", "Heartseeking Crossbow"},
    {13039, "INV_Weapon_Crossbow_04", "Skull Splitting Crossbow"},
    {18388, "INV_Weapon_Crossbow_08", "Stoneshatter"},
    {13038, "INV_Weapon_Crossbow_04", "Swiftwind"},
    {6315, "INV_Weapon_Crossbow_01", "Steelarrow Crossbow"},
    {15808, "INV_Weapon_Crossbow_02", "Fine Light Crossbow"},
    {15809, "INV_Weapon_Crossbow_03", "Heavy Crossbow"},
    {15807, "INV_Weapon_Crossbow_02", "Light Crossbow"}
  };
  
  /**
   * Returns all IDs, that are used by Crossbows.
   * @return  An Array of Integers, that represents all IDs, that are used by Crossbows.
   * @since 1.0
   */
  public static int[] getIDs() {
    int[] res = new int[crossbows.length];
    for (int i = 0; i < crossbows.length; i++) {
      res[i] = (int)crossbows[i][0];
    }
    return res;
  }
  
  /**
   * Returns all Icons, that are used by Crossbows.
   * @return  An Array of Strings, that represents all Icons, that are used by Crossbows by stating 
   *     their Name.
   * @since 1.0
   */
  public static String[] getIcons() {
    String[] res = new String[crossbows.length];
    for (int i = 0; i < crossbows.length; i++) {
      res[i] = (String)crossbows[i][1];
    }
    return res;
  }
  
  /**
   * Returns all Names of Crossbows in the Game.
   * @return  The Name of all Crossbows in the Game as an Array of Strings.
   * @since 1.0
   */
  public static String[] getNames() {
    String[] res = new String[crossbows.length];
    for (int i = 0; i < crossbows.length; i++) {
      res[i] = (String)crossbows[i][2];
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
