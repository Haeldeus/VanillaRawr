package db.armor.relics;

public class Totem {

  private static Object[][] totems = {
    {23005, "INV_Relics_TotemofLife", "Totem of Flowing Water"},
    {22396, "INV_Relics_TotemofLife", "Totem of Life"},
    {22395, "INV_Relics_TotemofRage", "Totem of Rage"},
    {22345, "INV_Relics_TotemofRebirth", "Totem of Rebirth"},
    {23200, "INV_Relics_TotemofLife", "Totem of Sustaining"},
    {23199, "INV_Relics_TotemofRage", "Totem of the Storm"}
  };
  
  public static int[] getIDs() {
    int[] res = new int[totems.length];
    for (int i = 0; i < totems.length; i++) {
      res[i] = (int)totems[i][0];
    }
    return res;
  }
  
  public static String[] getIcons() {
    String[] res = new String[totems.length];
    for (int i = 0; i < totems.length; i++) {
      res[i] = (String)totems[i][1];
    }
    return res;
  }
  
  public static String[] getNames() {
    String[] res = new String[totems.length];
    for (int i = 0; i < totems.length; i++) {
      res[i] = (String)totems[i][2];
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
