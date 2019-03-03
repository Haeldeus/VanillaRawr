package db.random.weapons.melee;

import java.util.ArrayList;

import util.MultiBonus;

public class TwoHandMaces {

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    15264, 1990, 3198, 4570, 15267, 3208, 15266, 15262, 15259, 3193, 15265, 15263, 15261, 
    4564, 15260
  };

  /**
   * Returns a List of all Two-Handed Maces with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all Two-Handed Maces 
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
    fillBackbreaker();
    fillBallastMaul();
    fillBatteringHammer();
    fillBirchwoodMaul();
    fillBrutehammer();
    fillConkHammer();
    fillFierceMauler();
    fillGreaterMaul();
    fillHeftyBattlehammer();
    fillOakMallet();
    fillPainbringer();
    fillRoyalMallet();
    fillSequoiaBranch();
    fillSpikedClub();
    fillStoneHammer();
    System.out.println("Two-handed Maces: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
  
  private static void fillStoneHammer() {
    int id = 15260;
    MultiBonus stoneHammer = new MultiBonus("Stone Hammer", id);
    stoneHammer.createPowerTree(30, 32, 2.8);
    stoneHammer.createSpiritTree(15, 16, 7.2);
    stoneHammer.createStaminaTree(15, 16, 6.5);
    stoneHammer.createStrengthTree(15, 16, 6.5);
    
    stoneHammer.createBearTree(9, 10, 9.5);
    stoneHammer.createBoarTree(9, 10, 13.4);
    stoneHammer.createEagleTree(9, 10, 10.6);
    stoneHammer.createGorillaTree(9, 10, 11.9);
    stoneHammer.createMonkeyTree(9, 10, 9.5);
    stoneHammer.createTigerTree(9, 10, 8.8);
    stoneHammer.createWhaleTree(9, 10, 13.1);
    list.add(stoneHammer);
  }
  
  private static void fillSpikedClub() {
    int id = 4564;
    MultiBonus spikedClub = new MultiBonus("Spiked Club", id);
    spikedClub.createPowerTree(6, 8, 2.7);
    spikedClub.createSpiritTree(3, 4, 6.7);
    spikedClub.createStaminaTree(3, 4, 6.0);
    spikedClub.createStrengthTree(3, 4, 5.7);
    
    spikedClub.createBearTree(1, 2, 9.7);
    spikedClub.createBoarTree(1, 2, 12.1);
    spikedClub.createEagleTree(1, 2, 11.5);
    spikedClub.createGorillaTree(1, 2, 11.4);
    spikedClub.createMonkeyTree(1, 2, 11.4);
    spikedClub.createTigerTree(1, 2, 10.7);
    spikedClub.createWhaleTree(1, 2, 12.2);
    list.add(spikedClub);
  }
  
  private static void fillSequoiaBranch() {
    int id = 15261;
    MultiBonus sequoiaBranch = new MultiBonus("Sequoia Branch", id);
    sequoiaBranch.createPowerTree(18, 34, 2.8);
    sequoiaBranch.createSpiritTree(16, 17, 7.5);
    sequoiaBranch.createStaminaTree(16, 17, 6.5);
    sequoiaBranch.createStrengthTree(16, 17, 6.2);
    
    sequoiaBranch.createBearTree(10, 11, 9.3);
    sequoiaBranch.createBoarTree(10, 11, 13.2);
    sequoiaBranch.createEagleTree(10, 11, 11.0);
    sequoiaBranch.createGorillaTree(10, 11, 12.1);
    sequoiaBranch.createMonkeyTree(10, 11, 9.3);
    sequoiaBranch.createTigerTree(10, 11, 8.7);
    sequoiaBranch.createWhaleTree(10, 11, 13.4);
    list.add(sequoiaBranch);
  }
  
  private static void fillRoyalMallet() {
    int id = 15263;
    MultiBonus royalMallet = new MultiBonus("Royal Mallet", id);
    royalMallet.createPowerTree(42, 44, 2.9);
    royalMallet.createSpiritTree(21, 22, 6.2);
    royalMallet.createStaminaTree(21, 22, 6.3);
    royalMallet.createStrengthTree(21, 22, 6.4);
    
    royalMallet.createBearTree(13, 14, 10.7);
    royalMallet.createBoarTree(13, 14, 12.2);
    royalMallet.createEagleTree(13, 14, 11.2);
    royalMallet.createGorillaTree(13, 14, 12.2);
    royalMallet.createMonkeyTree(13, 14, 10.3);
    royalMallet.createTigerTree(13, 14, 9.1);
    royalMallet.createWhaleTree(13, 14, 12.6);
    list.add(royalMallet);
  }
  
  private static void fillPainbringer() {
    int id = 15265;
    MultiBonus painbringer = new MultiBonus("Painbringer", id);
    painbringer.createPowerTree(50, 52, 3.2);
    painbringer.createSpiritTree(25, 26, 5.8);
    painbringer.createStaminaTree(25, 26, 6.3);
    painbringer.createStrengthTree(25, 26, 6.5);
    
    painbringer.createBearTree(16, 17, 11.2);
    painbringer.createBoarTree(16, 17, 11.5);
    painbringer.createEagleTree(16, 17, 11.5);
    painbringer.createGorillaTree(16, 17, 11.6);
    painbringer.createMonkeyTree(16, 17, 10.9);
    painbringer.createTigerTree(16, 17, 10.3);
    painbringer.createWhaleTree(16, 17, 11.1);
    list.add(painbringer);
  }
  
  private static void fillOakMallet() {
    int id = 3193;
    MultiBonus oakMallet = new MultiBonus("Oak Mallet", id);
    oakMallet.createPowerTree(12, 14, 2.8);
    oakMallet.createSpiritTree(6, 7, 6.8);
    oakMallet.createStaminaTree(6, 7, 6.3);
    oakMallet.createStrengthTree(6, 7, 5.8);
    
    oakMallet.createBearTree(3, 4, 9.4);
    oakMallet.createBoarTree(3, 4, 12.2);
    oakMallet.createEagleTree(3, 4, 11.2);
    oakMallet.createGorillaTree(3, 4, 11.1);
    oakMallet.createMonkeyTree(3, 4, 11.4);
    oakMallet.createTigerTree(3, 4, 10.4);
    oakMallet.createWhaleTree(3, 4, 12.6);
    list.add(oakMallet);
  }
  
  private static void fillHeftyBattlehammer() {
    int id = 15259;
    MultiBonus heftyBattlehammer = new MultiBonus("Hefty Battlehammer", id);
    heftyBattlehammer.createPowerTree(18, 20, 2.6);
    heftyBattlehammer.createSpiritTree(9, 10, 7.7);
    heftyBattlehammer.createStaminaTree(9, 10, 6.5);
    heftyBattlehammer.createStrengthTree(9, 10, 6.0);
    
    heftyBattlehammer.createBearTree(5, 6, 9.1);
    heftyBattlehammer.createBoarTree(5, 6, 13.5);
    heftyBattlehammer.createEagleTree(5, 6, 11.0);
    heftyBattlehammer.createGorillaTree(5, 6, 11.3);
    heftyBattlehammer.createMonkeyTree(5, 6, 9.8);
    heftyBattlehammer.createTigerTree(5, 6, 8.8);
    heftyBattlehammer.createWhaleTree(5, 6, 13.6);
    list.add(heftyBattlehammer);
  }
  
  private static void fillGreaterMaul() {
    int id = 15262;
    MultiBonus greaterMaul = new MultiBonus("Greater Maul", id);
    greaterMaul.createPowerTree(32, 38, 2.9);
    greaterMaul.createSpiritTree(19, 20, 6.2);
    greaterMaul.createStaminaTree(19, 20, 6.6);
    greaterMaul.createStrengthTree(19, 20, 6.5);
    
    greaterMaul.createBearTree(12, 13, 10.5);
    greaterMaul.createBoarTree(12, 13, 12.2);
    greaterMaul.createEagleTree(12, 13, 11.6);
    greaterMaul.createGorillaTree(12, 13, 11.9);
    greaterMaul.createMonkeyTree(12, 13, 10.4);
    greaterMaul.createTigerTree(12, 13, 9.5);
    greaterMaul.createWhaleTree(12, 13, 11.9);
    list.add(greaterMaul);
  }
  
  private static void fillFierceMauler() {
    int id = 15266;
    MultiBonus fierceMauler = new MultiBonus("Fierce Mauler", id);
    fierceMauler.createPowerTree(54, 56, 3.2);
    fierceMauler.createSpiritTree(27, 28, 5.6);
    fierceMauler.createStaminaTree(27, 28, 6.0);
    fierceMauler.createStrengthTree(27, 28, 6.4);
    
    fierceMauler.createBearTree(17, 18, 11.5);
    fierceMauler.createBoarTree(17, 18, 10.9);
    fierceMauler.createEagleTree(17, 18, 11.9);
    fierceMauler.createGorillaTree(17, 18, 11.2);
    fierceMauler.createMonkeyTree(17, 18, 11.7);
    fierceMauler.createTigerTree(17, 18, 11.0);
    fierceMauler.createWhaleTree(17, 18, 10.7);
    list.add(fierceMauler);
  }
  
  private static void fillConkHammer() {
    int id = 3208;
    MultiBonus conkHammer = new MultiBonus("Conk Hammer", id);
    conkHammer.createPowerTree(32, 38, 3.0);
    conkHammer.createSpiritTree(19, 20, 6.0);
    conkHammer.createStaminaTree(19, 20, 6.6);
    conkHammer.createStrengthTree(19, 20, 6.1);
    
    conkHammer.createBearTree(12, 13, 10.7);
    conkHammer.createBoarTree(12, 13, 12.1);
    conkHammer.createEagleTree(12, 13, 11.2);
    conkHammer.createGorillaTree(12, 13, 11.8);
    conkHammer.createMonkeyTree(12, 13, 10.7);
    conkHammer.createTigerTree(12, 13, 9.7);
    conkHammer.createWhaleTree(12, 13, 12.0);
    list.add(conkHammer);
  }
  
  private static void fillBrutehammer() {
    int id = 15267;
    MultiBonus brutehammer = new MultiBonus("Brutehammer", id);
    brutehammer.createPowerTree(54, 56, 3.2);
    brutehammer.createSpiritTree(27, 28, 4.7);
    brutehammer.createStaminaTree(27, 28, 6.2);
    brutehammer.createStrengthTree(27, 28, 5.5);
    
    brutehammer.createBearTree(17, 18, 12.6);
    brutehammer.createBoarTree(17, 18, 10.6);
    brutehammer.createEagleTree(17, 18, 11.5);
    brutehammer.createGorillaTree(17, 18, 11.1);
    brutehammer.createMonkeyTree(17, 18, 11.6);
    brutehammer.createTigerTree(17, 18, 12.9);
    brutehammer.createWhaleTree(17, 18, 10.1);
    list.add(brutehammer);
  }
  
  private static void fillBirchwoodMaul() {
    int id = 4570;
    MultiBonus birchwoodMaul = new MultiBonus("Birchwood Maul", id);
    birchwoodMaul.createPowerTree(2, 8, 2.5);
    birchwoodMaul.createSpiritTree(3, 4, 7.4);
    birchwoodMaul.createStaminaTree(3, 4, 5.9);
    birchwoodMaul.createStrengthTree(3, 4, 5.4);
    
    birchwoodMaul.createBearTree(1, 2, 9.1);
    birchwoodMaul.createBoarTree(1, 2, 12.4);
    birchwoodMaul.createEagleTree(1, 2, 11.6);
    birchwoodMaul.createGorillaTree(1, 2, 11.5);
    birchwoodMaul.createMonkeyTree(1, 2, 11.1);
    birchwoodMaul.createTigerTree(1, 2, 10.3);
    birchwoodMaul.createWhaleTree(1, 2, 12.8);
    list.add(birchwoodMaul);
  }
  
  private static void fillBatteringHammer() {
    int id = 3198;
    MultiBonus batteringHammer = new MultiBonus("Battering Hammer", id);
    batteringHammer.createPowerTree(16, 16, 3.1);
    batteringHammer.createSpiritTree(8, 8, 6.2);
    batteringHammer.createStaminaTree(8, 8, 6.7);
    batteringHammer.createStrengthTree(8, 8, 6.1);
    
    batteringHammer.createBearTree(5, 5, 10.6);
    batteringHammer.createBoarTree(5, 5, 9.7);
    batteringHammer.createEagleTree(5, 5, 11.9);
    batteringHammer.createGorillaTree(5, 5, 10.1);
    batteringHammer.createMonkeyTree(5, 5, 13.8);
    batteringHammer.createTigerTree(5, 5, 11.1);
    batteringHammer.createWhaleTree(5, 5, 10.6);
    list.add(batteringHammer);
  }
  
  private static void fillBallastMaul() {
    int id = 1990;
    MultiBonus ballastMaul = new MultiBonus("Ballast Maul", id);
    ballastMaul.createPowerTree(26, 28, 2.9);
    ballastMaul.createSpiritTree(13, 14, 6.8);
    ballastMaul.createStaminaTree(13, 14, 6.5);
    ballastMaul.createStrengthTree(13, 14, 6.3);
    
    ballastMaul.createBearTree(8, 9, 9.8);
    ballastMaul.createBoarTree(8, 9, 12.7);
    ballastMaul.createEagleTree(8, 9, 11.3);
    ballastMaul.createGorillaTree(8, 9, 11.9);
    ballastMaul.createMonkeyTree(8, 9, 10.0);
    ballastMaul.createTigerTree(8, 9, 9.1);
    ballastMaul.createWhaleTree(8, 9, 12.6);
    list.add(ballastMaul);
  }
  
  private static void fillBackbreaker() {
    int id = 15264;
    MultiBonus backbreaker = new MultiBonus("Backbreaker", id);
    backbreaker.createPowerTree(48, 50, 2.9);
    backbreaker.createSpiritTree(24, 25, 5.6);
    backbreaker.createStaminaTree(24, 25, 6.3);
    backbreaker.createStrengthTree(24, 25, 6.4);
    
    backbreaker.createBearTree(15, 16, 11.4);
    backbreaker.createBoarTree(15, 16, 10.9);
    backbreaker.createEagleTree(15, 16, 11.7);
    backbreaker.createGorillaTree(15, 16, 12.0);
    backbreaker.createMonkeyTree(15, 16, 11.4);
    backbreaker.createTigerTree(15, 16, 10.0);
    backbreaker.createWhaleTree(15, 16, 11.3);
    list.add(backbreaker);
  }
}
