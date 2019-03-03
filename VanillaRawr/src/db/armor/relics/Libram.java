package db.armor.relics;

public class Libram {

  private static Object[][] librams = {
    {22402, "INV_Relics_LibramofGrace", "Libram of Grace"},
    {23006, "INV_Relics_LibramofGrace", "Libram of Light"},
    {23201, "INV_Relics_LibramofHope", "Libram of Divinity"},
    {23203, "INV_Relics_LibramofTruth", "Libram of Fervor"},
    {22401, "INV_Relics_LibramofHope", "Libram of Hope"},
    {22400, "INV_Relics_LibramofTruth", "Libram of Truth"}
  };
  
  public static int[] getIDs() {
    int[] res = new int[librams.length];
    for (int i = 0; i < librams.length; i++) {
      res[i] = (int)librams[i][0];
    }
    return res;
  }
  
  public static String[] getIcons() {
    String[] res = new String[librams.length];
    for (int i = 0; i < librams.length; i++) {
      res[i] = (String)librams[i][1];
    }
    return res;
  }
  
  public static String[] getNames() {
    String[] res = new String[librams.length];
    for (int i = 0; i < librams.length; i++) {
      res[i] = (String)librams[i][2];
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
