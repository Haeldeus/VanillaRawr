package db.random.weapons.melee;

import java.util.ArrayList;

import util.MultiBonus;

public class TwoHandAxes {

  private static ArrayList<MultiBonus> list;

  private static int[] ids = {
    3201, 3195, 3199, 3210, 15271, 15273, 15270, 1639, 15269, 1640, 15272, 4562, 15268
  };
  
  /**
   * Returns a List of all Two-Handed Axes with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all Two-Handed Axes with 
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
    fillBarbarianWarAxe();
    fillBarbaricBattleAxe();
    fillBattleSlayer();
    fillBrutalWarAxe();
    fillColossalGreatAxe();
    fillDeathStriker();
    fillGiganticWarAxe();
    fillGrinningAxe();
    fillMassiveBattleAxe();
    fillMonstrousWarAxe();
    fillRazorAxe();
    fillSeveringAxe();
    fillTwinbladedAxe(); /*
    System.out.println(list.get(0));
    System.out.println("--------------");
    System.out.println(list.get(1));
    System.out.println("--------------");
    System.out.println(list.get(2));
    System.out.println("--------------");
    System.out.println(list.get(3));
    System.out.println("--------------");
    System.out.println(list.get(4));
    System.out.println("--------------");
    System.out.println(list.get(5));
    System.out.println("--------------");
    System.out.println(list.get(6));
    System.out.println("--------------");
    System.out.println(list.get(7));
    System.out.println("--------------");
    System.out.println(list.get(8));
    System.out.println("--------------");
    System.out.println(list.get(9));
    System.out.println("--------------");
    System.out.println(list.get(10));
    System.out.println("--------------");
    System.out.println(list.get(11));
    System.out.println("--------------");
    System.out.println(list.get(12));
    System.out.println("--------------"); */
  }
  
  private static void fillTwinbladedAxe() {
    int id = 15268;
    MultiBonus twinbladedAxe = new MultiBonus("Twin-bladed Axe", id);
    twinbladedAxe.createAgilityTree(4, 5, 5.9);
    twinbladedAxe.createPowerTree(8, 10, 2.6);
    twinbladedAxe.createStaminaTree(4, 5, 6.1);
    twinbladedAxe.createStrengthTree(4, 5, 5.8);
    
    twinbladedAxe.createBearTree(2, 3, 9.6);
    twinbladedAxe.createBoarTree(2, 3, 12.5);
    twinbladedAxe.createEagleTree(2, 3, 12.5);
    twinbladedAxe.createMonkeyTree(2, 3, 9.8);
    twinbladedAxe.createTigerTree(2, 3, 10.0);
    twinbladedAxe.createWhaleTree(2, 3, 13.0);
    twinbladedAxe.createWolfTree(2, 3, 12.3);
    list.add(twinbladedAxe);
  }
  
  private static void fillSeveringAxe() {
    int id = 4562;
    MultiBonus severingAxe = new MultiBonus("Severing Axe", id);
    severingAxe.createAgilityTree(3, 4, 6.1);
    severingAxe.createPowerTree(4, 8, 2.6);
    severingAxe.createStaminaTree(3, 4, 5.8);
    severingAxe.createStrengthTree(3, 4, 5.7);
    
    severingAxe.createBearTree(1, 2, 10.4);
    severingAxe.createBoarTree(1, 2, 12.0);
    severingAxe.createEagleTree(1, 2, 12.0);
    severingAxe.createMonkeyTree(1, 2, 10.7);
    severingAxe.createTigerTree(1, 2, 10.7);
    severingAxe.createWhaleTree(1, 2, 11.9);
    severingAxe.createWolfTree(1, 2, 12.2);
    list.add(severingAxe);
  }
  
  private static void fillRazorAxe() {
    int id = 15272;
    MultiBonus razorAxe = new MultiBonus("Razor Axe", id);
    razorAxe.createAgilityTree(25, 26, 5.6);
    razorAxe.createPowerTree(50, 52, 2.7);
    razorAxe.createStaminaTree(25, 26, 6.4);
    razorAxe.createStrengthTree(25, 26, 6.6);
    
    razorAxe.createBearTree(16, 17, 12.3);
    razorAxe.createBoarTree(16, 17, 11.0);
    razorAxe.createEagleTree(16, 17, 10.8);
    razorAxe.createMonkeyTree(16, 17, 10.9);
    razorAxe.createTigerTree(16, 17, 11.9);
    razorAxe.createWhaleTree(16, 17, 10.7);
    razorAxe.createWolfTree(16, 17, 10.8);
    list.add(razorAxe);
  }
  
  private static void fillMonstrousWarAxe() {
    int id = 1640;
    MultiBonus monstrousWarAxe = new MultiBonus("Monstrous War Axe", id);
    monstrousWarAxe.createAgilityTree(16, 17, 4.6);
    monstrousWarAxe.createPowerTree(32, 34, 2.4);
    monstrousWarAxe.createStaminaTree(16, 17, 6.4);
    monstrousWarAxe.createStrengthTree(16, 17, 6.9);
    
    monstrousWarAxe.createBearTree(10, 11, 11.6);
    monstrousWarAxe.createBoarTree(10, 11, 13.1);
    monstrousWarAxe.createEagleTree(10, 11, 11.5);
    monstrousWarAxe.createMonkeyTree(10, 11, 8.8);
    monstrousWarAxe.createTigerTree(10, 11, 10.5);
    monstrousWarAxe.createWhaleTree(10, 11, 12.7);
    monstrousWarAxe.createWolfTree(10, 11, 11.4);
    list.add(monstrousWarAxe);
  }
  
  private static void fillMassiveBattleAxe() {
    int id = 15269;
    MultiBonus massiveBattleAxe = new MultiBonus("Massive Battle Axe", id);
    massiveBattleAxe.createAgilityTree(7, 8, 5.7);
    massiveBattleAxe.createPowerTree(10, 16, 2.6);
    massiveBattleAxe.createStaminaTree(7, 8, 6.2);
    massiveBattleAxe.createStrengthTree(7, 8, 6.5);
    
    massiveBattleAxe.createBearTree(4, 5, 10.9);
    massiveBattleAxe.createBoarTree(4, 5, 12.1);
    massiveBattleAxe.createEagleTree(4, 5, 11.6);
    massiveBattleAxe.createMonkeyTree(4, 5, 9.5);
    massiveBattleAxe.createTigerTree(4, 5, 10.8);
    massiveBattleAxe.createWhaleTree(4, 5, 12.0);
    massiveBattleAxe.createWolfTree(4, 5, 12.0);
    list.add(massiveBattleAxe);
  }
  
  private static void fillGrinningAxe() {
    int id = 1639;
    MultiBonus grinningAxe = new MultiBonus("Grinning Axe", id);
    grinningAxe.createAgilityTree(21, 22, 4.3);
    grinningAxe.createPowerTree(42, 44, 2.4);
    grinningAxe.createStaminaTree(21, 22, 6.7);
    grinningAxe.createStrengthTree(21, 22, 6.9);
    
    grinningAxe.createBearTree(13, 14, 12.2);
    grinningAxe.createBoarTree(13, 14, 12.4);
    grinningAxe.createEagleTree(13, 14, 11.8);
    grinningAxe.createMonkeyTree(13, 14, 9.3);
    grinningAxe.createTigerTree(13, 14, 11.2);
    grinningAxe.createWhaleTree(13, 14, 11.8);
    grinningAxe.createWolfTree(13, 14, 11.3);
    list.add(grinningAxe);
  }
  
  private static void fillGiganticWarAxe() {
    int id = 15270;
    MultiBonus giganticWarAxe = new MultiBonus("Gigantic War Axe", id);
    giganticWarAxe.createAgilityTree(19, 20, 4.8);
    giganticWarAxe.createPowerTree(32, 38, 2.6);
    giganticWarAxe.createStaminaTree(19, 20, 6.7);
    giganticWarAxe.createStrengthTree(19, 20, 7.1);
    
    giganticWarAxe.createBearTree(12, 13, 12.3);
    giganticWarAxe.createBoarTree(12, 13, 12.1);
    giganticWarAxe.createEagleTree(12, 13, 11.4);
    giganticWarAxe.createMonkeyTree(12, 13, 9.1);
    giganticWarAxe.createTigerTree(12, 13, 11.2);
    giganticWarAxe.createWhaleTree(12, 13, 11.7);
    giganticWarAxe.createWolfTree(12, 13, 10.8);
    list.add(giganticWarAxe);
  }
  
  private static void fillDeathStriker() {
    int id = 15273;
    MultiBonus deathStriker = new MultiBonus("Death Striker", id);
    deathStriker.createAgilityTree(27, 28, 6.3);
    deathStriker.createPowerTree(54, 56, 2.7);
    deathStriker.createStaminaTree(27, 28, 6.2);
    deathStriker.createStrengthTree(27, 28, 6.1);
    
    deathStriker.createBearTree(17, 18, 13.0);
    deathStriker.createBoarTree(17, 18, 10.1);
    deathStriker.createEagleTree(17, 18, 10.9);
    deathStriker.createMonkeyTree(17, 18, 12.5);
    deathStriker.createTigerTree(17, 18, 12.1);
    deathStriker.createWhaleTree(17, 18, 10.3);
    deathStriker.createWolfTree(17, 18, 9.6);
    list.add(deathStriker);
  }
  
  private static void fillColossalGreatAxe() {
    int id = 15271;
    MultiBonus colossalGreatAxe = new MultiBonus("Colossal War Axe", id);
    colossalGreatAxe.createAgilityTree(24, 25, 5.7);
    colossalGreatAxe.createPowerTree(48, 50, 2.8);
    colossalGreatAxe.createStaminaTree(24, 25, 6.3);
    colossalGreatAxe.createStrengthTree(24, 25, 6.3);
    
    colossalGreatAxe.createBearTree(15, 16, 11.8);
    colossalGreatAxe.createBoarTree(15, 16, 11.5);
    colossalGreatAxe.createEagleTree(15, 16, 11.3);
    colossalGreatAxe.createMonkeyTree(15, 16, 10.4);
    colossalGreatAxe.createTigerTree(15, 16, 11.9);
    colossalGreatAxe.createWhaleTree(15, 16, 10.8);
    colossalGreatAxe.createWolfTree(15, 16, 11.3);
    list.add(colossalGreatAxe);
  }
  
  private static void fillBrutalWarAxe() {
    int id = 3210;
    MultiBonus brutalWarAxe = new MultiBonus("Brutal War Axe", id);
    brutalWarAxe.createAgilityTree(10, 11, 5.3);
    brutalWarAxe.createPowerTree(12, 22, 2.4);
    brutalWarAxe.createStaminaTree(10, 11, 6.3);
    brutalWarAxe.createStrengthTree(10, 11, 6.1);
    
    brutalWarAxe.createBearTree(6, 7, 9.9);
    brutalWarAxe.createBoarTree(6, 7, 13.0);
    brutalWarAxe.createEagleTree(6, 7, 11.6);
    brutalWarAxe.createMonkeyTree(6, 7, 9.4);
    brutalWarAxe.createTigerTree(6, 7, 10.0);
    brutalWarAxe.createWhaleTree(6, 7, 13.2);
    brutalWarAxe.createWolfTree(6, 7, 12.8);
    list.add(brutalWarAxe);
  }
  
  private static void fillBattleSlayer() {
    int id = 3199;
    MultiBonus battleSlayer = new MultiBonus("Battle Slayer", id);
    battleSlayer.createAgilityTree(7, 8, 5.5);
    battleSlayer.createPowerTree(14, 16, 2.7);
    battleSlayer.createStaminaTree(7, 8, 6.4);
    battleSlayer.createStrengthTree(7, 8, 6.2);
    
    battleSlayer.createBearTree(4, 5, 10.5);
    battleSlayer.createBoarTree(4, 5, 12.2);
    battleSlayer.createEagleTree(4, 5, 11.9);
    battleSlayer.createMonkeyTree(4, 5, 9.5);
    battleSlayer.createTigerTree(4, 5, 10.7);
    battleSlayer.createWhaleTree(4, 5, 12.4);
    battleSlayer.createWolfTree(4, 5, 12.0);
    list.add(battleSlayer);
  }
  
  private static void fillBarbaricBattleAxe() {
    int id = 3195;
    MultiBonus barbaricBattleAxe = new MultiBonus("Barbaric Battle Axe", id);
    barbaricBattleAxe.createAgilityTree(4, 5, 6.1);
    barbaricBattleAxe.createPowerTree(8, 10, 2.6);
    barbaricBattleAxe.createStaminaTree(4, 5, 6.3);
    barbaricBattleAxe.createStrengthTree(4, 5, 5.9);
    
    barbaricBattleAxe.createBearTree(2, 3, 9.7);
    barbaricBattleAxe.createBoarTree(2, 3, 12.3);
    barbaricBattleAxe.createEagleTree(2, 3, 11.9);
    barbaricBattleAxe.createMonkeyTree(2, 3, 10.2);
    barbaricBattleAxe.createTigerTree(2, 3, 10.2);
    barbaricBattleAxe.createWhaleTree(2, 3, 12.5);
    barbaricBattleAxe.createWolfTree(2, 3, 12.3);
    list.add(barbaricBattleAxe);
  }
  
  private static void fillBarbarianWarAxe() {
    int id = 3201;
    MultiBonus barbarianWarAxe = new MultiBonus("Barbarian War Axe", id);
    barbarianWarAxe.createAgilityTree(10, 11, 5.3);
    barbarianWarAxe.createPowerTree(12, 22, 2.5);
    barbarianWarAxe.createStaminaTree(10, 11, 6.4);
    barbarianWarAxe.createStrengthTree(10, 11, 6.3);
    
    barbarianWarAxe.createBearTree(6, 7, 10.2);
    barbarianWarAxe.createBoarTree(6, 7, 13.2);
    barbarianWarAxe.createEagleTree(6, 7, 11.3);
    barbarianWarAxe.createMonkeyTree(6, 7, 9.2);
    barbarianWarAxe.createTigerTree(6, 7, 10.3);
    barbarianWarAxe.createWhaleTree(6, 7, 13.1);
    barbarianWarAxe.createWolfTree(6, 7, 12.3);
    list.add(barbarianWarAxe);
  }
}
