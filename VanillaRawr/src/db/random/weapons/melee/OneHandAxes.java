package db.random.weapons.melee;

import java.util.ArrayList;

import util.MultiBonus;

public class OneHandAxes {

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    12527, 19921, 15237, 15235, 15240, 2073, 1994, 15239, 790, 863, 15234, 4568, 15232, 
    2080, 15236, 15230, 15233, 4561, 15231, 15238 
  };
  
  /**
   * Returns a List of all One-Handed Axes with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all One-Handed Axes
   *     with Random Boni, that are available in the Game.
   */
  public static ArrayList<MultiBonus> getList() {
    if (list == null) {
      fill();
    }
    return list;
  }
  
  public static int[] getIds() {
    return ids;
  }
  
  private static void fill() {
    list = new ArrayList<MultiBonus>();
    fillRibsplitter();
    fillZulianHacker();
    fillCorpseHarvester();
    fillCrescentEdge();
    fillDemonsClaw();
    fillDwarvenHatchet();
    fillEbonclawReaver();
    fillFelstoneReaver();
    fillForestersAxe();
    fillGloomReaper();
    fillGreaterScythe();
    fillGruntAxe();
    fillHackingCleaver();
    fillHillborneAxe();
    fillMoonCleaver();
    fillRidgeCleaver();
    fillSavageAxe();
    fillScalpingTomahawk();
    fillSplittingHatchet();
    fillWarlordsAxe();
    /*System.out.println(list.get(0));
    System.out.println("--------------------");
    System.out.println(list.get(1));
    System.out.println("--------------------");
    System.out.println(list.get(2));
    System.out.println("--------------------");
    System.out.println(list.get(3));
    System.out.println("--------------------");
    System.out.println(list.get(4));
    System.out.println("--------------------");
    System.out.println(list.get(5));
    System.out.println("--------------------");
    System.out.println(list.get(6));
    System.out.println("--------------------");
    System.out.println(list.get(7));
    System.out.println("--------------------");
    System.out.println(list.get(8));
    System.out.println("--------------------");
    System.out.println(list.get(9));
    System.out.println("--------------------");
    System.out.println(list.get(10));
    System.out.println("--------------------");
    System.out.println(list.get(11));
    System.out.println("--------------------");    
    System.out.println(list.get(12));
    System.out.println("--------------------");
    System.out.println(list.get(13));
    System.out.println("--------------------");
    System.out.println(list.get(14));
    System.out.println("--------------------");
    System.out.println(list.get(15));
    System.out.println("--------------------");
    System.out.println(list.get(16));
    System.out.println("--------------------");
    System.out.println(list.get(17));
    System.out.println("--------------------");
    System.out.println(list.get(18));
    System.out.println("--------------------");
    System.out.println(list.get(19)); */
  }
  
  private static void fillWarlordsAxe() {
    int id = 15238;
    MultiBonus warlordsAxe = new MultiBonus("Warlord's Axe", id);
    warlordsAxe.createAgilityTree(11, 11, 6.1);
    warlordsAxe.createPowerTree(22, 22, 2.8);
    warlordsAxe.createStaminaTree(11, 11, 5.7);
    warlordsAxe.createStrengthTree(11, 11, 5.9);
    
    warlordsAxe.createBearTree(7, 7, 11.2);
    warlordsAxe.createBoarTree(7, 7, 11.6);
    warlordsAxe.createEagleTree(7, 7, 11.3);
    warlordsAxe.createMonkeyTree(7, 7, 11.2);
    warlordsAxe.createTigerTree(7, 7, 11.0);
    warlordsAxe.createWhaleTree(7, 7, 11.7);
    warlordsAxe.createWolfTree(7, 7, 11.4);
    list.add(warlordsAxe);
  }
  
  private static void fillSplittingHatchet() {
    int id = 15231;
    MultiBonus splittingHatchet = new MultiBonus("Splitting Hatchet", id);
    splittingHatchet.createAgilityTree(5, 5, 5.4);
    splittingHatchet.createPowerTree(10, 10, 2.6);
    splittingHatchet.createStaminaTree(5, 5, 6.1);
    splittingHatchet.createStrengthTree(5, 5, 6.5);
    
    splittingHatchet.createBearTree(3, 4, 10.5);
    splittingHatchet.createBoarTree(3, 4, 13.1);
    splittingHatchet.createEagleTree(3, 4, 11.2);
    splittingHatchet.createMonkeyTree(3, 4, 9.4);
    splittingHatchet.createTigerTree(3, 4, 10.2);
    splittingHatchet.createWhaleTree(3, 4, 12.9);
    splittingHatchet.createWolfTree(3, 4, 12.1);
    list.add(splittingHatchet);
  }
  
  private static void fillScalpingTomahawk() {
    int id = 4561;
    MultiBonus scalpingTomahawk = new MultiBonus("Scalping Tomahawk", id);
    scalpingTomahawk.createAgilityTree(1, 1, 29.0);
    scalpingTomahawk.createPowerTree(2, 4, 13.9);
    scalpingTomahawk.createStaminaTree(1, 1, 28.6);
    scalpingTomahawk.createStrengthTree(1, 1, 28.5);
    list.add(scalpingTomahawk);
  }
  
  private static void fillSavageAxe() {
    int id = 15233;
    MultiBonus savageAxe = new MultiBonus("Savage Axe", id);
    savageAxe.createAgilityTree(6, 7, 5.7);
    savageAxe.createPowerTree(12, 14, 2.7);
    savageAxe.createStaminaTree(6, 7, 6.5);
    savageAxe.createStrengthTree(6, 7, 6.4);
    
    savageAxe.createBearTree(4, 4, 10.5);
    savageAxe.createBoarTree(4, 4, 12.7);
    savageAxe.createEagleTree(4, 4, 10.6);
    savageAxe.createMonkeyTree(4, 4, 10.1);
    savageAxe.createTigerTree(4, 4, 10.3);
    savageAxe.createWhaleTree(4, 4, 12.4);
    savageAxe.createWolfTree(4, 4, 12.1);
    list.add(savageAxe);
  }
  
  private static void fillRidgeCleaver() {
    int id = 15230;
    MultiBonus ridgeCleaver = new MultiBonus("Ridge Cleaver", id);
    ridgeCleaver.createAgilityTree(4, 4, 5.2);
    ridgeCleaver.createPowerTree(8, 8, 2.6);
    ridgeCleaver.createStaminaTree(4, 4, 5.9);
    ridgeCleaver.createStrengthTree(4, 4, 6.2);
    
    ridgeCleaver.createBearTree(2, 3, 10.2);
    ridgeCleaver.createBoarTree(2, 3, 13.5);
    ridgeCleaver.createEagleTree(2, 3, 11.3);
    ridgeCleaver.createMonkeyTree(2, 3, 9.6);
    ridgeCleaver.createTigerTree(2, 3, 10.1);
    ridgeCleaver.createWhaleTree(2, 3, 13.4);
    ridgeCleaver.createWolfTree(2, 3, 11.9);
    list.add(ridgeCleaver);    
  }
  
  private static void fillMoonCleaver() {
    int id = 15236;
    MultiBonus moonCleaver = new MultiBonus("Moon Cleaver", id);
    moonCleaver.createAgilityTree(9, 10, 5.4);
    moonCleaver.createPowerTree(18, 20, 2.7);
    moonCleaver.createStaminaTree(9, 10, 6.6);
    moonCleaver.createStrengthTree(9, 10, 6.3);
    
    moonCleaver.createBearTree(6, 6, 10.6);
    moonCleaver.createBoarTree(6, 6, 12.6);
    moonCleaver.createEagleTree(6, 6, 11.1);
    moonCleaver.createMonkeyTree(6, 6, 10.2);
    moonCleaver.createTigerTree(6, 6, 10.1);
    moonCleaver.createWhaleTree(6, 6, 12.7);
    moonCleaver.createWolfTree(6, 6, 11.8);
    list.add(moonCleaver);    
  }
  
  private static void fillHillborneAxe() {
    int id = 2080;
    MultiBonus hillborneAxe = new MultiBonus("Hillborne Axe", id);
    hillborneAxe.createAgilityTree(5, 6, 5.3);
    hillborneAxe.createPowerTree(10, 12, 2.5);
    hillborneAxe.createStaminaTree(5, 6, 6.0);
    hillborneAxe.createStrengthTree(5, 6, 6.5);
    
    hillborneAxe.createBearTree(3, 4, 10.4);
    hillborneAxe.createBoarTree(3, 4, 13.2);
    hillborneAxe.createEagleTree(3, 4, 11.0);
    hillborneAxe.createMonkeyTree(3, 4, 9.6);
    hillborneAxe.createTigerTree(3, 4, 10.4);
    hillborneAxe.createWhaleTree(3, 4, 12.9);
    hillborneAxe.createWolfTree(3, 4, 12.4);
    list.add(hillborneAxe);
  }
  
  private static void fillHackingCleaver() {
    int id = 15232;
    MultiBonus hackingCleaver = new MultiBonus("Hacking Cleaver", id);
    hackingCleaver.createAgilityTree(5, 5, 5.4);
    hackingCleaver.createPowerTree(10, 10, 2.6);
    hackingCleaver.createStaminaTree(5, 5, 6.2);
    hackingCleaver.createStrengthTree(5, 5, 6.4);
    
    hackingCleaver.createBearTree(3, 4, 10.5);
    hackingCleaver.createBoarTree(3, 4, 12.9);
    hackingCleaver.createEagleTree(3, 4, 11.1);
    hackingCleaver.createMonkeyTree(3, 4, 9.7);
    hackingCleaver.createTigerTree(3, 4, 10.3);
    hackingCleaver.createWhaleTree(3, 4, 12.9);
    hackingCleaver.createWolfTree(3, 4, 12.1);
    list.add(hackingCleaver);    
  }
  
  private static void fillGruntAxe() {
    int id = 4568;
    MultiBonus gruntAxe = new MultiBonus("Grunt Axe", id);
    gruntAxe.createAgilityTree(2, 3, 28.0);
    gruntAxe.createPowerTree(4, 8, 14.1);
    gruntAxe.createStaminaTree(2, 3, 28.8);
    gruntAxe.createStrengthTree(2, 3, 29.2);
    list.add(gruntAxe);
  }
  
  private static void fillGreaterScythe() {
    int id = 15234;
    MultiBonus greaterScythe = new MultiBonus("Greater Scythe", id);
    greaterScythe.createAgilityTree(7, 7, 5.4);
    greaterScythe.createPowerTree(14, 14, 2.6);
    greaterScythe.createStaminaTree(7, 7, 6.3);
    greaterScythe.createStrengthTree(7, 7, 6.2);
    
    greaterScythe.createBearTree(4, 5, 10.2);
    greaterScythe.createBoarTree(4, 5, 12.9);
    greaterScythe.createEagleTree(4, 5, 10.8);
    greaterScythe.createMonkeyTree(4, 5, 9.8);
    greaterScythe.createTigerTree(4, 5, 10.1);
    greaterScythe.createWhaleTree(4, 5, 13.3);
    greaterScythe.createWolfTree(4, 5, 12.2);
    list.add(greaterScythe);      
  }
  
  private static void fillGloomReaper() {
    int id = 863;
    MultiBonus gloomReaper = new MultiBonus("Gloom Reaper", id);
    gloomReaper.createAgilityTree(6, 7, 5.3);
    gloomReaper.createPowerTree(12, 14, 2.7);
    gloomReaper.createStaminaTree(6, 7, 6.3);
    gloomReaper.createStrengthTree(6, 7, 6.6);
    
    gloomReaper.createBearTree(4, 4, 10.3);
    gloomReaper.createBoarTree(4, 4, 12.9);
    gloomReaper.createEagleTree(4, 4, 11.1);
    gloomReaper.createMonkeyTree(4, 4, 9.5);
    gloomReaper.createTigerTree(4, 4, 10.1);
    gloomReaper.createWhaleTree(4, 4, 12.9);
    gloomReaper.createWolfTree(4, 4, 12.2);
    list.add(gloomReaper);  
  }
  
  private static void fillForestersAxe() {
    int id = 790;
    MultiBonus forestersAxe = new MultiBonus("Forester's Axe", id);
    forestersAxe.createAgilityTree(3, 3, 6.0);
    forestersAxe.createPowerTree(6, 6, 2.7);
    forestersAxe.createStaminaTree(3, 3, 5.9);
    forestersAxe.createStrengthTree(3, 3, 6.2);
    
    forestersAxe.createBearTree(1, 2, 10.7);
    forestersAxe.createBoarTree(1, 2, 12.0);
    forestersAxe.createEagleTree(1, 2, 11.0);
    forestersAxe.createMonkeyTree(1, 2, 10.9);
    forestersAxe.createTigerTree(1, 2, 10.9);
    forestersAxe.createWhaleTree(1, 2, 12.1);
    forestersAxe.createWolfTree(1, 2, 11.6);
    list.add(forestersAxe);      
  }
  
  private static void fillFelstoneReaver() {
    int id = 15239;
    MultiBonus felstoneReaver = new MultiBonus("Felstone Reaver", id);
    felstoneReaver.createAgilityTree(11, 12, 6.1);
    felstoneReaver.createPowerTree(22, 24, 2.8);
    felstoneReaver.createStaminaTree(11, 12, 5.9);
    felstoneReaver.createStrengthTree(11, 12, 5.9);
    
    felstoneReaver.createBearTree(7, 8, 11.3);
    felstoneReaver.createBoarTree(7, 8, 11.4);
    felstoneReaver.createEagleTree(7, 8, 11.7);
    felstoneReaver.createMonkeyTree(7, 8, 11.3);
    felstoneReaver.createTigerTree(7, 8, 11.6);
    felstoneReaver.createWhaleTree(7, 8, 10.8);
    felstoneReaver.createWolfTree(7, 8, 11.1);
    list.add(felstoneReaver);    
  }
  
  private static void fillEbonclawReaver() {
    int id = 1994;
    MultiBonus ebonclawReaver = new MultiBonus("Ebonclaw Reaver", id);
    ebonclawReaver.createAgilityTree(8, 8, 5.6);
    ebonclawReaver.createPowerTree(16, 16, 2.6);
    ebonclawReaver.createStaminaTree(8, 8, 6.3);
    ebonclawReaver.createStrengthTree(8, 8, 6.4);
    
    ebonclawReaver.createBearTree(5, 6, 10.8);
    ebonclawReaver.createBoarTree(5, 6, 12.1);
    ebonclawReaver.createEagleTree(5, 6, 11.3);
    ebonclawReaver.createMonkeyTree(5, 6, 10.2);
    ebonclawReaver.createTigerTree(5, 6, 10.3);
    ebonclawReaver.createWhaleTree(5, 6, 12.3);
    ebonclawReaver.createWolfTree(5, 6, 11.9);
    list.add(ebonclawReaver);
  }
  
  private static void fillDwarvenHatchet() {
    int id = 2073;
    MultiBonus dwarvenHatchet = new MultiBonus("Dwarven Hatchet", id);
    dwarvenHatchet.createAgilityTree(1, 1, 28.7);
    dwarvenHatchet.createPowerTree(2, 4, 13.8);
    dwarvenHatchet.createStaminaTree(1, 1, 28.8);
    dwarvenHatchet.createStrengthTree(1, 1, 28.6);
    list.add(dwarvenHatchet);
  }
  
  private static void fillDemonsClaw() {
    int id = 15240;
    MultiBonus demonsClaw = new MultiBonus("Demon's Claw", id);
    demonsClaw.createAgilityTree(12, 12, 5.9);
    demonsClaw.createPowerTree(24, 24, 2.9);
    demonsClaw.createStaminaTree(12, 12, 5.5);
    demonsClaw.createStrengthTree(12, 12, 5.9);
    
    demonsClaw.createBearTree(7, 8, 11.8);
    demonsClaw.createBoarTree(7, 8, 10.6);
    demonsClaw.createEagleTree(7, 8, 11.8);
    demonsClaw.createMonkeyTree(7, 8, 13.0);
    demonsClaw.createTigerTree(7, 8, 11.0);
    demonsClaw.createWhaleTree(7, 8, 10.3);
    demonsClaw.createWolfTree(7, 8, 11.2);
    list.add(demonsClaw);
  }
  
  private static void fillCrescentEdge() {
    int id = 15235;
    MultiBonus crescentEdge = new MultiBonus("Crescent Edge", id);
    crescentEdge.createAgilityTree(8, 8, 5.9);
    crescentEdge.createPowerTree(16, 16, 2.9);
    crescentEdge.createStaminaTree(8, 8, 6.1);
    crescentEdge.createStrengthTree(8, 8, 6.1);
    
    crescentEdge.createBearTree(5, 6, 11.0);
    crescentEdge.createBoarTree(5, 6, 12.1);
    crescentEdge.createEagleTree(5, 6, 11.0);
    crescentEdge.createMonkeyTree(5, 6, 10.4);
    crescentEdge.createTigerTree(5, 6, 10.6);
    crescentEdge.createWhaleTree(5, 6, 12.1);
    crescentEdge.createWolfTree(5, 6, 11.8);
    list.add(crescentEdge);
  }
  
  private static void fillCorpseHarvester() {
    int id = 15237;
    MultiBonus corpseHarvester = new MultiBonus("Corpse Harvester", id);
    corpseHarvester.createAgilityTree(10, 10, 5.7);
    corpseHarvester.createPowerTree(20, 20, 2.5);
    corpseHarvester.createStaminaTree(10, 10, 6.2);
    corpseHarvester.createStrengthTree(10, 10, 6.1);
    
    corpseHarvester.createBearTree(6, 7, 10.7);
    corpseHarvester.createBoarTree(6, 7, 12.7);
    corpseHarvester.createEagleTree(6, 7, 11.4);
    corpseHarvester.createMonkeyTree(6, 7, 10.1);
    corpseHarvester.createTigerTree(6, 7, 10.3);
    corpseHarvester.createWhaleTree(6, 7, 12.5);
    corpseHarvester.createWolfTree(6, 7, 11.8);
    list.add(corpseHarvester);
  }
  
  private static void fillZulianHacker() {  //Adds +2 Axes per default!
    int id = 19921;
    MultiBonus zulianHacker = new MultiBonus("Zulian Hacker", id);
    zulianHacker.addDefaultBonus(db.stats.Stat.AxeBonus, 2);
    zulianHacker.createAgilityTree(12, 12, 8.4);
    zulianHacker.createStaminaTree(12, 12, 6.9);
    zulianHacker.createStrengthTree(12, 12, 5.0);
    
    zulianHacker.createBearTree(7, 8, 12.0);
    zulianHacker.createBoarTree(7, 8, 18.0);
    zulianHacker.createEagleTree(8, 8, 8.0);
    zulianHacker.createMonkeyTree(8, 8, 11.6);
    zulianHacker.createTigerTreeDiff(7, 8, 8, 8, 15.8);
    zulianHacker.createWhaleTree(8, 8, 9.3);
    zulianHacker.createWolfTree(8, 8, 5.1);
    list.add(zulianHacker);
  }
  
  private static void fillRibsplitter() {    //Adds 10 AP per default!
    int id = 12527;
    MultiBonus ribsplitter = new MultiBonus("Ribsplitter", id);
    ribsplitter.addDefaultBonus(db.stats.Stat.AttackPower, 10);
    ribsplitter.createAgilityTree(11, 11, 5.7);
    ribsplitter.createPowerTree(22, 22, 2.7);
    ribsplitter.createStaminaTree(11, 11, 5.5);
    ribsplitter.createStrengthTree(11, 11, 7.5);
    
    ribsplitter.createBearTree(7, 7, 10.1);
    ribsplitter.createBoarTree(7, 7, 12.9);
    ribsplitter.createEagleTree(7, 7, 11.4);
    ribsplitter.createMonkeyTree(7, 7, 10.7);
    ribsplitter.createTigerTree(7, 7, 10.1);
    ribsplitter.createWhaleTree(7, 7, 12.6);
    ribsplitter.createWolfTree(7, 7, 10.8);
    list.add(ribsplitter);
  }
}
