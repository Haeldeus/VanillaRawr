package db.random.weapons.ranged;

import java.util.ArrayList;

import util.MultiBonus;

public class Bows {
  
  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    15289, 15288, 15287, 15291, 15296, 15295, 15294, 4087
  };
  
  /**
   * Returns a List of all Bows with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all Bows with 
   *     Random Boni, that are available in the Game.
   */
  public static ArrayList<MultiBonus> getList() {
    if (list == null) {
      fill();
    }
    return list;
  }
  
  public static int[] getIDs() {
    return ids;
  }
  
  private static void fill() {
    list = new ArrayList<MultiBonus>();
    fillArchstrikeBow();
    fillBlasthornBow();
    fillCrusaderBow();
    fillHarpyNeedler();
    fillHawkeyeBow();
    fillQuillfireBow();
    fillSiegeBow();
    fillTrueshotBow();
    System.out.println("Bows: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
  
  private static void fillTrueshotBow() {
    int id = 4087;
    MultiBonus trueshotBow = new MultiBonus("Trueshot Bow", id);
    trueshotBow.createAgilityTree(5, 5, 4.9);
    trueshotBow.createMarksmanshipTree(12, 12, 2.8);
    trueshotBow.createSpiritTree(5, 5, 7.3);
    trueshotBow.createStaminaTree(5, 5, 6.0);
    
    trueshotBow.createEagleTree(3, 4, 13.0);
    trueshotBow.createFalconTree(3, 4, 10.7);
    trueshotBow.createMonkeyTree(3, 4, 8.6);
    trueshotBow.createOwlTree(3, 4, 13.9);
    trueshotBow.createTigerTree(3, 4, 9.3);
    trueshotBow.createWhaleTree(3, 4, 12.8);
    trueshotBow.createWolfTree(3, 4, 10.7);
    list.add(trueshotBow);
  }

  private static void fillSiegeBow() {
    int id = 15294;
    MultiBonus siegeBow = new MultiBonus("Siege Bow", id);
    siegeBow.createAgilityTree(7, 7, 5.4);
    siegeBow.createMarksmanshipTree(17, 17, 2.5);
    siegeBow.createSpiritTree(7, 7, 6.6);
    siegeBow.createStaminaTree(7, 7, 6.5);
    
    siegeBow.createEagleTree(4, 5, 12.7);
    siegeBow.createFalconTree(4, 5, 11.1);
    siegeBow.createMonkeyTree(4, 5, 9.3);
    siegeBow.createOwlTree(4, 5, 12.8);
    siegeBow.createTigerTree(4, 5, 10.0);
    siegeBow.createWhaleTree(4, 5, 12.2);
    siegeBow.createWolfTree(4, 5, 11.0);
    list.add(siegeBow);
  }

  private static void fillQuillfireBow() {
    int id = 15295;
    MultiBonus quillfireBow = new MultiBonus("Quillfire Bow", id);
    quillfireBow.createAgilityTree(7, 8, 5.5);
    quillfireBow.createMarksmanshipTree(17, 31, 2.7);
    quillfireBow.createSpiritTree(7, 8, 6.5);
    quillfireBow.createStaminaTree(7, 8, 6.1);
    
    quillfireBow.createEagleTree(4, 5, 12.7);
    quillfireBow.createFalconTree(4, 5, 11.0);
    quillfireBow.createMonkeyTree(4, 5, 9.5);
    quillfireBow.createOwlTree(4, 5, 12.9);
    quillfireBow.createTigerTree(4, 5, 10.0);
    quillfireBow.createWhaleTree(4, 5, 12.0);
    quillfireBow.createWolfTree(4, 5, 11.2);
    list.add(quillfireBow);
  }

  private static void fillHawkeyeBow() {
    int id = 15296;
    MultiBonus hawkeyeBow = new MultiBonus("Hawkeye Bow", id);
    hawkeyeBow.createAgilityTree(8, 9, 6.7);
    hawkeyeBow.createMarksmanshipTree(19, 22, 3.3);
    hawkeyeBow.createSpiritTree(8, 9, 5.5);
    hawkeyeBow.createStaminaTree(8, 9, 6.0);
    
    hawkeyeBow.createEagleTree(5, 6, 11.0);
    hawkeyeBow.createFalconTree(5, 6, 11.1);
    hawkeyeBow.createMonkeyTree(5, 6, 12.3);
    hawkeyeBow.createOwlTree(5, 6, 10.0);
    hawkeyeBow.createTigerTree(5, 6, 12.5);
    hawkeyeBow.createWhaleTree(5, 6, 10.9);
    hawkeyeBow.createWolfTree(5, 6, 10.7);
    list.add(hawkeyeBow);
  }

  private static void fillHarpyNeedler() {
    int id = 15291;
    MultiBonus harpyNeedler = new MultiBonus("Harpy Needler", id);
    harpyNeedler.createAgilityTree(6, 7, 5.4);
    harpyNeedler.createMarksmanshipTree(14, 17, 2.8);
    harpyNeedler.createSpiritTree(6, 7, 6.7);
    harpyNeedler.createStaminaTree(6, 7, 6.2);
    
    harpyNeedler.createEagleTree(4, 5, 12.6);
    harpyNeedler.createFalconTree(4, 5, 10.9);
    harpyNeedler.createMonkeyTree(4, 5, 9.4);
    harpyNeedler.createOwlTree(4, 5, 12.5);
    harpyNeedler.createTigerTree(4, 5, 10.5);
    harpyNeedler.createWhaleTree(4, 5, 12.1);
    harpyNeedler.createWolfTree(4, 5, 10.9);
    list.add(harpyNeedler);
  }

  private static void fillCrusaderBow() {
    int id = 15287;
    MultiBonus crusaderBow = new MultiBonus("Crusader Bow", id);
    crusaderBow.createAgilityTree(6, 6, 4.8);
    crusaderBow.createMarksmanshipTree(14, 14, 2.5);
    crusaderBow.createSpiritTree(6, 6, 7.5);
    crusaderBow.createStaminaTree(6, 6, 6.1);
    
    crusaderBow.createEagleTree(3, 4, 12.8);
    crusaderBow.createFalconTree(3, 4, 10.7);
    crusaderBow.createMonkeyTree(3, 4, 8.8);
    crusaderBow.createOwlTree(3, 4, 13.8);
    crusaderBow.createTigerTree(3, 4, 9.5);
    crusaderBow.createWhaleTree(3, 4, 12.8);
    crusaderBow.createWolfTree(3, 4, 10.8);
    list.add(crusaderBow);
  }

  private static void fillBlasthornBow() {
    int id = 15288;
    MultiBonus blasthornBow = new MultiBonus("Blasthorn Bow", id);
    blasthornBow.createMarksmanshipTree(19, 36, 100.0);
    list.add(blasthornBow);
  }

  private static void fillArchstrikeBow() {
    int id = 15289;
    MultiBonus archstrikeBow = new MultiBonus("Archstrike Bow", id);
    archstrikeBow.createAgilityTree(9, 9, 6.4);
    archstrikeBow.createMarksmanshipTree(22, 22, 3.1);
    archstrikeBow.createSpiritTree(9, 9, 5.1);
    archstrikeBow.createStaminaTree(9, 9, 5.6);
    
    archstrikeBow.createEagleTree(5, 6, 12.0);
    archstrikeBow.createFalconTree(5, 6, 11.5);
    archstrikeBow.createMonkeyTree(5, 6, 11.8);
    archstrikeBow.createOwlTree(5, 6, 10.8);
    archstrikeBow.createTigerTree(5, 6, 12.4);
    archstrikeBow.createWhaleTree(5, 6, 10.5);
    archstrikeBow.createWolfTree(5, 6, 10.8);
    list.add(archstrikeBow);
  }
}
