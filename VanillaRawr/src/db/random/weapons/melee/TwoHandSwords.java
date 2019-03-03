package db.random.weapons.melee;

import java.util.ArrayList;

import util.MultiBonus;

public class TwoHandSwords {

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    8199, 15253, 3206, 15254, 15258, 3196, 1625, 15255, 15248, 15250, 15251, 15256, 4567, 
    15249, 15257, 3192, 3197, 8178, 15252
  };
  
  /**
   * Returns a List of all Two-Handed Swords with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all Two-Handed Swords 
   *     with Random Boni, that are available in the Game.
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
    fillBattlefieldDestroyer();
    fillBeheadingBlade();
    fillCavalierTwoHander();
    fillDarkEspadon();
    fillDivineWarblade();
    fillEdgedBastardSword();
    fillExquisiteFlamberge();
    fillGallantFlamberge();
    fillGleamingClaymore();
    fillGlimmeringFlamberge();
    fillHeadstrikerSword();
    fillMassacreSword();
    fillMercSword();
    fillPolishedZweihander();
    fillShinBlade();
    fillShortBastardSword();
    fillStoneclutterClaymore();
    fillTrainingSword();
    fillTuskerSword();
    System.out.println("Two-handed Swords: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
  
  private static void fillTuskerSword() {
    int id = 15252;
    MultiBonus tuskerSword = new MultiBonus("Tusker Sword", id);
    tuskerSword.createAgilityTree(21, 22, 4.6);
    tuskerSword.createPowerTree(24, 44, 2.5);
    tuskerSword.createStaminaTree(21, 22, 6.4);
    tuskerSword.createStrengthTree(21, 22, 6.7);
    
    tuskerSword.createBearTree(13, 14, 11.6);
    tuskerSword.createBoarTree(13, 14, 12.3);
    tuskerSword.createEagleTree(13, 14, 11.7);
    tuskerSword.createMonkeyTree(13, 14, 9.4);
    tuskerSword.createTigerTree(13, 14, 11.3);
    tuskerSword.createWhaleTree(13, 14, 11.9);
    tuskerSword.createWolfTree(13, 14, 11.6);
    list.add(tuskerSword);
  }

  private static void fillTrainingSword() {
    int id = 8178;
    MultiBonus trainingSword = new MultiBonus("Training Sword", id);
    trainingSword.createAgilityTree(3, 4, 6.2);
    trainingSword.createPowerTree(6, 8, 2.5);
    trainingSword.createStaminaTree(3, 4, 5.9);
    trainingSword.createStrengthTree(3, 4, 5.5);
    
    trainingSword.createBearTree(1, 2, 10.1);
    trainingSword.createBoarTree(1, 2, 11.6);
    trainingSword.createEagleTree(1, 2, 12.1);
    trainingSword.createMonkeyTree(1, 2, 11.0);
    trainingSword.createTigerTree(1, 2, 10.8);
    trainingSword.createWhaleTree(1, 2, 12.1);
    trainingSword.createWolfTree(1, 2, 12.1);
    list.add(trainingSword);
  }

  private static void fillStoneclutterClaymore() {
    int id = 3197;
    MultiBonus stoneclutterClaymore = new MultiBonus("Stoneclutter Claymore", id);
    stoneclutterClaymore.createAgilityTree(13, 14, 4.9);
    stoneclutterClaymore.createPowerTree(16, 28, 2.5);
    stoneclutterClaymore.createStaminaTree(13, 14, 6.6);
    stoneclutterClaymore.createStrengthTree(13, 14, 6.4);
    
    stoneclutterClaymore.createBearTree(8, 9, 10.6);
    stoneclutterClaymore.createBoarTree(8, 9, 12.9);
    stoneclutterClaymore.createEagleTree(8, 9, 11.6);
    stoneclutterClaymore.createMonkeyTree(8, 9, 9.0);
    stoneclutterClaymore.createTigerTree(8, 9, 10.6);
    stoneclutterClaymore.createWhaleTree(8, 9, 12.9);
    stoneclutterClaymore.createWolfTree(8, 9, 12.0);
    list.add(stoneclutterClaymore);
  }

  private static void fillShortBastardSword() {
    int id = 3192;
    MultiBonus shortBastardSword = new MultiBonus("Short Bastard Sword", id);
    shortBastardSword.createAgilityTree(3, 4, 6.0);
    shortBastardSword.createPowerTree(6, 8, 2.5);
    shortBastardSword.createStaminaTree(3, 4, 5.7);
    shortBastardSword.createStrengthTree(3, 4, 5.4);
    
    shortBastardSword.createBearTree(1, 2, 9.4);
    shortBastardSword.createBoarTree(1, 2, 12.2);
    shortBastardSword.createEagleTree(1, 2, 12.1);
    shortBastardSword.createMonkeyTree(1, 2, 10.6);
    shortBastardSword.createTigerTree(1, 2, 10.3);
    shortBastardSword.createWhaleTree(1, 2, 13.1);
    shortBastardSword.createWolfTree(1, 2, 12.7);
    list.add(shortBastardSword);
  }

  private static void fillShinBlade() {
    int id = 15257;
    MultiBonus shinBlade = new MultiBonus("Shin Blade", id);
    shinBlade.createAgilityTree(27, 28, 5.9);
    shinBlade.createPowerTree(54, 56, 2.8);
    shinBlade.createStaminaTree(27, 28, 6.1);
    shinBlade.createStrengthTree(27, 28, 6.7);
    
    shinBlade.createBearTree(17, 18, 12.6);
    shinBlade.createBoarTree(17, 18, 10.0);
    shinBlade.createEagleTree(17, 18, 11.4);
    shinBlade.createMonkeyTree(17, 18, 12.7);
    shinBlade.createTigerTree(17, 18, 11.7);
    shinBlade.createWhaleTree(17, 18, 9.6);
    shinBlade.createWolfTree(17, 18, 10.4);
    list.add(shinBlade);
  }

  private static void fillPolishedZweihander() {
    int id = 15249;
    MultiBonus polishedZweihander = new MultiBonus("Polished Zweihander", id);
    polishedZweihander.createAgilityTree(9, 10, 5.5);
    polishedZweihander.createPowerTree(10, 20, 2.6);
    polishedZweihander.createStaminaTree(9, 10, 6.2);
    polishedZweihander.createStrengthTree(9, 10, 6.3);
    
    polishedZweihander.createBearTree(5, 6, 10.5);
    polishedZweihander.createBoarTree(5, 6, 12.2);
    polishedZweihander.createEagleTree(5, 6, 11.8);
    polishedZweihander.createMonkeyTree(5, 6, 9.9);
    polishedZweihander.createTigerTree(5, 6, 10.7);
    polishedZweihander.createWhaleTree(5, 6, 12.2);
    polishedZweihander.createWolfTree(5, 6, 12.1);
    list.add(polishedZweihander);
  }

  private static void fillMercSword() {
    int id = 4567;
    MultiBonus mercSword = new MultiBonus("Merc Sword", id);
    mercSword.createAgilityTree(4, 5, 6.4);
    mercSword.createPowerTree(8, 10, 2.4);
    mercSword.createStaminaTree(4, 5, 5.8);
    mercSword.createStrengthTree(4, 5, 5.4);
    
    mercSword.createBearTree(2, 3, 9.0);
    mercSword.createBoarTree(2, 3, 12.5);
    mercSword.createEagleTree(2, 3, 11.8);
    mercSword.createMonkeyTree(2, 3, 10.2);
    mercSword.createTigerTree(2, 3, 9.8);
    mercSword.createWhaleTree(2, 3, 13.3);
    mercSword.createWolfTree(2, 3, 13.1);
    list.add(mercSword);
  }

  private static void fillMassacreSword() {
    int id = 15256;
    MultiBonus massacreSword = new MultiBonus("Massacre Sword", id);
    massacreSword.createAgilityTree(25, 26, 5.4);
    massacreSword.createPowerTree(50, 52, 2.8);
    massacreSword.createStaminaTree(25, 26, 6.4);
    massacreSword.createStrengthTree(25, 26, 6.4);
    
    massacreSword.createBearTree(16, 17, 11.6);
    massacreSword.createBoarTree(16, 17, 11.6);
    massacreSword.createEagleTree(16, 17, 11.7);
    massacreSword.createMonkeyTree(16, 17, 10.5);
    massacreSword.createTigerTree(16, 17, 11.7);
    massacreSword.createWhaleTree(16, 17, 10.8);
    massacreSword.createWolfTree(16, 17, 11.3);
    list.add(massacreSword);
  }

  private static void fillHeadstrikerSword() {
    int id = 15251;
    MultiBonus headstrikerSword = new MultiBonus("Headstriker Sword", id);
    headstrikerSword.createAgilityTree(18, 19, 4.4);
    headstrikerSword.createPowerTree(36, 38, 2.4);
    headstrikerSword.createStaminaTree(18, 19, 6.8);
    headstrikerSword.createStrengthTree(18, 19, 7.3);
    
    headstrikerSword.createBearTree(11, 12, 12.1);
    headstrikerSword.createBoarTree(11, 12, 12.7);
    headstrikerSword.createEagleTree(11, 12, 11.7);
    headstrikerSword.createMonkeyTree(11, 12, 8.3);
    headstrikerSword.createTigerTree(11, 12, 10.7);
    headstrikerSword.createWhaleTree(11, 12, 12.5);
    headstrikerSword.createWolfTree(11, 12, 11.2);
    list.add(headstrikerSword);
  }

  private static void fillGlimmeringFlamberge() {
    int id = 15250;
    MultiBonus glimmeringFlamberge = new MultiBonus("Glimmering Flamberge", id);
    glimmeringFlamberge.createAgilityTree(12, 13, 5.1);
    glimmeringFlamberge.createPowerTree(24, 26, 2.4);
    glimmeringFlamberge.createStaminaTree(12, 13, 6.3);
    glimmeringFlamberge.createStrengthTree(12, 13, 6.2);
    
    glimmeringFlamberge.createBearTree(7, 8, 10.1);
    glimmeringFlamberge.createBoarTree(7, 8, 12.8);
    glimmeringFlamberge.createEagleTree(7, 8, 11.7);
    glimmeringFlamberge.createMonkeyTree(7, 8, 9.3);
    glimmeringFlamberge.createTigerTree(7, 8, 10.7);
    glimmeringFlamberge.createWhaleTree(7, 8, 13.0);
    glimmeringFlamberge.createWolfTree(7, 8, 12.7);
    list.add(glimmeringFlamberge);
  }

  private static void fillGleamingClaymore() {
    int id = 15248;
    MultiBonus gleamingClaymore = new MultiBonus("gleamingClaymore", id);
    gleamingClaymore.createAgilityTree(6, 7, 5.8);
    gleamingClaymore.createPowerTree(12, 14, 2.5);
    gleamingClaymore.createStaminaTree(6, 7, 6.2);
    gleamingClaymore.createStrengthTree(6, 7, 5.8);
    
    gleamingClaymore.createBearTree(3, 4, 9.0);
    gleamingClaymore.createBoarTree(3, 4, 12.9);
    gleamingClaymore.createEagleTree(3, 4, 11.6);
    gleamingClaymore.createMonkeyTree(3, 4, 9.7);
    gleamingClaymore.createTigerTree(3, 4, 9.6);
    gleamingClaymore.createWhaleTree(3, 4, 13.8);
    gleamingClaymore.createWolfTree(3, 4, 13.2);
    list.add(gleamingClaymore);
  }
  
  private static void fillGallantFlamberge() {
    int id = 15255;
    MultiBonus gallantFlamberge = new MultiBonus("Gallant Flamberge", id);
    gallantFlamberge.createAgilityTree(24, 25, 5.4);
    gallantFlamberge.createPowerTree(48, 50, 2.7);
    gallantFlamberge.createStaminaTree(24, 25, 6.3);
    gallantFlamberge.createStrengthTree(24, 25, 6.6);
    
    gallantFlamberge.createBearTree(15, 16, 12.1);
    gallantFlamberge.createBoarTree(15, 16, 11.1);
    gallantFlamberge.createEagleTree(15, 16, 11.0);
    gallantFlamberge.createMonkeyTree(15, 16, 11.2);
    gallantFlamberge.createTigerTree(15, 16, 11.9);
    gallantFlamberge.createWhaleTree(15, 16, 10.9);
    gallantFlamberge.createWolfTree(15, 16, 10.7);
    list.add(gallantFlamberge);
  }
  
  private static void fillExquisiteFlamberge() {
    int id = 1625;
    MultiBonus exquisiteFlamberge = new MultiBonus("Exquisite Flamberge", id);
    exquisiteFlamberge.createAgilityTree(16, 17, 4.8);
    exquisiteFlamberge.createPowerTree(32, 34, 2.5);
    exquisiteFlamberge.createStaminaTree(16, 17, 6.9);
    exquisiteFlamberge.createStrengthTree(16, 17, 6.9);
    
    exquisiteFlamberge.createBearTree(10, 11, 11.4);
    exquisiteFlamberge.createBoarTree(10, 11, 12.9);
    exquisiteFlamberge.createEagleTree(10, 11, 11.6);
    exquisiteFlamberge.createMonkeyTree(10, 11, 8.9);
    exquisiteFlamberge.createTigerTree(10, 11, 10.8);
    exquisiteFlamberge.createWhaleTree(10, 11, 12.2);
    exquisiteFlamberge.createWolfTree(10, 11, 11.4);
    list.add(exquisiteFlamberge);
  }
  
  private static void fillEdgedBastardSword() {
    int id = 3196;
    MultiBonus edgedBastardSword = new MultiBonus("Edged Bastard Sword", id);
    edgedBastardSword.createAgilityTree(4, 5, 6.2);
    edgedBastardSword.createPowerTree(8, 10, 2.6);
    edgedBastardSword.createStaminaTree(4, 5, 6.2);
    edgedBastardSword.createStrengthTree(4, 5, 5.7);
    
    edgedBastardSword.createBearTree(2, 3, 9.2);
    edgedBastardSword.createBoarTree(2, 3, 12.3);
    edgedBastardSword.createEagleTree(2, 3, 11.7);
    edgedBastardSword.createMonkeyTree(2, 3, 10.4);
    edgedBastardSword.createTigerTree(2, 3, 10.1);
    edgedBastardSword.createWhaleTree(2, 3, 12.9);
    edgedBastardSword.createWolfTree(2, 3, 12.7);
    list.add(edgedBastardSword);
  }
  
  private static void fillDivineWarblade() {
    int id = 15258;
    MultiBonus divineWarblade = new MultiBonus("Divine Warblade", id);
    divineWarblade.createAgilityTree(28, 29, 6.5);
    divineWarblade.createPowerTree(56, 58, 3.0);
    divineWarblade.createStaminaTree(28, 29, 5.7);
    divineWarblade.createStrengthTree(28, 29, 6.1);
    
    divineWarblade.createBearTree(18, 19, 12.7);
    divineWarblade.createBoarTree(18, 19, 10.3);
    divineWarblade.createEagleTree(18, 19, 11.4);
    divineWarblade.createMonkeyTree(18, 19, 12.3);
    divineWarblade.createTigerTree(18, 19, 13.1);
    divineWarblade.createWhaleTree(18, 19, 8.9);
    divineWarblade.createWolfTree(18, 19, 10.0);
    list.add(divineWarblade);
  }
  
  private static void fillDarkEspadon() {
    int id = 15254;
    MultiBonus darkEspadon = new MultiBonus("Dark Espadon", id);
    darkEspadon.createAgilityTree(22, 23, 4.5);
    darkEspadon.createPowerTree(44, 46, 2.4);
    darkEspadon.createStaminaTree(22, 23, 6.4);
    darkEspadon.createStrengthTree(22, 23, 6.9);
    
    darkEspadon.createBearTree(14, 15, 11.6);
    darkEspadon.createBoarTree(14, 15, 12.3);
    darkEspadon.createEagleTree(14, 15, 11.5);
    darkEspadon.createMonkeyTree(14, 15, 9.5);
    darkEspadon.createTigerTree(14, 15, 11.4);
    darkEspadon.createWhaleTree(14, 15, 12.0);
    darkEspadon.createWolfTree(14, 15, 11.5);
    list.add(darkEspadon);
  }
  
  private static void fillCavalierTwoHander() {
    int id = 3206;
    MultiBonus cavalierTwoHander = new MultiBonus("Cavalier Two-Hander", id);
    cavalierTwoHander.createAgilityTree(10, 11, 5.0);
    cavalierTwoHander.createPowerTree(20, 22, 2.5);
    cavalierTwoHander.createStaminaTree(10, 11, 6.3);
    cavalierTwoHander.createStrengthTree(10, 11, 6.5);
    
    cavalierTwoHander.createBearTree(6, 7, 10.6);
    cavalierTwoHander.createBoarTree(6, 7, 13.2);
    cavalierTwoHander.createEagleTree(6, 7, 11.3);
    cavalierTwoHander.createMonkeyTree(6, 7, 8.9);
    cavalierTwoHander.createTigerTree(6, 7, 10.6);
    cavalierTwoHander.createWhaleTree(6, 7, 12.9);
    cavalierTwoHander.createWolfTree(6, 7, 12.1);
    list.add(cavalierTwoHander);
  }
  
  private static void fillBeheadingBlade() {
    int id = 15253;
    MultiBonus beheadingBlade = new MultiBonus("Beheading Blade", id);
    beheadingBlade.createAgilityTree(22, 23, 4.5);
    beheadingBlade.createPowerTree(44, 46, 2.3);
    beheadingBlade.createStaminaTree(22, 23, 6.4);
    beheadingBlade.createStrengthTree(22, 23, 7.0);
    
    beheadingBlade.createBearTree(14, 15, 11.7);
    beheadingBlade.createBoarTree(14, 15, 12.5);
    beheadingBlade.createEagleTree(14, 15, 11.8);
    beheadingBlade.createMonkeyTree(14, 15, 9.1);
    beheadingBlade.createTigerTree(14, 15, 11.3);
    beheadingBlade.createWhaleTree(14, 15, 12.2);
    beheadingBlade.createWolfTree(14, 15, 11.3);
    list.add(beheadingBlade);
  }
  
  private static void fillBattlefieldDestroyer() {
    int id = 8199;
    MultiBonus battlefieldDestroyer = new MultiBonus("Battlefield Destroyer", id);
    battlefieldDestroyer.createAgilityTree(19, 20, 4.9);
    battlefieldDestroyer.createPowerTree(32, 38, 2.6);
    battlefieldDestroyer.createStaminaTree(19, 20, 6.5);
    battlefieldDestroyer.createStrengthTree(19, 20, 6.9);
    
    battlefieldDestroyer.createBearTree(12, 13, 12.3);
    battlefieldDestroyer.createBoarTree(12, 13, 12.2);
    battlefieldDestroyer.createEagleTree(12, 13, 11.4);
    battlefieldDestroyer.createMonkeyTree(12, 13, 9.6);
    battlefieldDestroyer.createTigerTree(12, 13, 11.3);
    battlefieldDestroyer.createWhaleTree(12, 13, 11.5);
    battlefieldDestroyer.createWolfTree(12, 13, 11.0);
    list.add(battlefieldDestroyer);
  }
}
