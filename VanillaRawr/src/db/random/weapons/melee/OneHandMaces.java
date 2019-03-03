package db.random.weapons.melee;

import java.util.ArrayList;
import util.MultiBonus;

public class OneHandMaces {

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    15222, 15224, 15229, 15227, 15226, 8194, 15223, 865, 1207, 2075, 15225, 2079, 1608, 15228, 
    4569, 789
  };
  
  /**
   * Returns a List of all One-Handed Maces with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all One-Handed Maces
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
    fillBarbedClub();
    fillBattlesmasher();
    fillBlesswindHammer();
    fillDiamondtipBludgeon();
    fillGiantClub();
    fillGoblinNutcracker();
    fillJaggedStar();
    fillLeadenMace();
    fillMurphstar();
    fillPriestsMace();
    fillSequoiaHammer();
    fillSergeantsWarhammer();
    fillSkullcrusherMace();
    fillSmashingStar();
    fillStaunchHammer();
    fillStoutBattleHammer();
    System.out.println("One-handed Maces: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
  
  private static void fillStoutBattleHammer() {
    int id = 789;
    MultiBonus stoutBattlehammer = new MultiBonus("Stout Battlehammer", id);
    stoutBattlehammer.createArcaneWrathTree(4, 6, 4.2);
    stoutBattlehammer.createHealingTree(4, 4, 1.8);
    stoutBattlehammer.createNaturesWrathTree(4, 4, 3.4);
    stoutBattlehammer.createPowerTree(6, 8, 13.7);
    stoutBattlehammer.createShadowWrathTree(4, 4, 3.3);
    stoutBattlehammer.createStaminaTree(3, 3, 4.3);
    stoutBattlehammer.createStrengthTree(3, 3, 5.1);
    
    stoutBattlehammer.createBearTree(1, 2, 20.2);
    stoutBattlehammer.createMonkeyTree(1, 2, 21.9);
    stoutBattlehammer.createTigerTree(1, 2, 22.0);
    list.add(stoutBattlehammer);
  }
  
  private static void fillStaunchHammer() {
    int id = 4569;
    MultiBonus staunchHammer = new MultiBonus("Staunch Hammer", id);
    staunchHammer.createArcaneWrathTree(1, 3, 10.0);
    staunchHammer.createHealingTree(1, 2, 5.5);
    staunchHammer.createNaturesWrathTree(1, 3, 8.2);
    staunchHammer.createPowerTree(2, 4, 29.5);
    staunchHammer.createShadowWrathTree(1, 1, 7.7);
    staunchHammer.createStaminaTree(1, 1, 18.0);
    staunchHammer.createStrengthTree(1, 1, 20.9);
    list.add(staunchHammer);
  }
  
  private static void fillSmashingStar() {
    int id = 15228;
    MultiBonus smashingStar = new MultiBonus("Smashing Star", id);
    smashingStar.createArcaneWrathTree(13, 14, 9.7);
    smashingStar.createHealingTree(11, 12, 6.3);
    smashingStar.createNaturesWrathTree(13, 14, 7.6);
    smashingStar.createShadowWrathTree(13, 14, 9.1);
    smashingStar.createStaminaTree(9, 10, 4.5);
    smashingStar.createStrengthTree(9, 10, 4.3);
    
    smashingStar.createBearTree(6, 6, 19.2);
    smashingStar.createMonkeyTree(6, 6, 20.2);
    smashingStar.createTigerTree(6, 6, 19.0);
    list.add(smashingStar);
  }
  
  private static void fillSkullcrusherMace() {
    int id = 1608;
    MultiBonus skullcrusherMace = new MultiBonus("Skullcrusher Mace", id);
    skullcrusherMace.createArcaneWrathTree(11, 16, 4.4);
    skullcrusherMace.createHealingTree(9, 9, 3.2);
    skullcrusherMace.createNaturesWrathTree(11, 11, 3.7);
    skullcrusherMace.createPowerTree(16, 22, 13.5);
    skullcrusherMace.createShadowWrathTree(11, 11, 3.9);
    skullcrusherMace.createStaminaTree(8, 8, 4.5);
    skullcrusherMace.createStrengthTree(8, 8, 4.5);
    
    skullcrusherMace.createBearTree(5, 6, 20.5);
    skullcrusherMace.createMonkeyTree(5, 6, 21.2);
    skullcrusherMace.createTigerTree(5, 6, 20.6);
    list.add(skullcrusherMace);
  }
  
  private static void fillSergeantsWarhammer() {
    int id = 2079;
    MultiBonus sergeantsWarhammer = new MultiBonus("Sergeant's Warhammer", id);
    sergeantsWarhammer.createArcaneWrathTree(3, 4, 10.1);
    sergeantsWarhammer.createHealingTree(2, 2, 5.2);
    sergeantsWarhammer.createNaturesWrathTree(3, 4, 8.3);
    sergeantsWarhammer.createPowerTree(4, 6, 29.8);
    sergeantsWarhammer.createShadowWrathTree(3, 4, 7.4);
    sergeantsWarhammer.createStaminaTree(2, 2, 18.1);
    sergeantsWarhammer.createStrengthTree(2, 2, 21.1);
    list.add(sergeantsWarhammer);
  }
  
  private static void fillSequoiaHammer() {
    int id = 15225;
    MultiBonus sequoiaHammer = new MultiBonus("Sequoia Hammer", id);
    sequoiaHammer.createArcaneWrathTree(7, 10, 4.3);
    sequoiaHammer.createHealingTree(6, 6, 1.9);
    sequoiaHammer.createNaturesWrathTree(7, 7, 3.8);
    sequoiaHammer.createPowerTree(10, 14, 13.7);
    sequoiaHammer.createShadowWrathTree(7, 7, 3.4);
    sequoiaHammer.createStaminaTree(5, 5, 4.3);
    sequoiaHammer.createStrengthTree(5, 5, 5.2);
    
    sequoiaHammer.createBearTree(3, 4, 20.2);
    sequoiaHammer.createMonkeyTree(3, 4, 21.4);
    sequoiaHammer.createTigerTree(3, 4, 21.6);
    list.add(sequoiaHammer);
  }
  
  private static void fillPriestsMace() {
    int id = 2075;
    MultiBonus priestsMace = new MultiBonus("Priest's Mace", id);
    priestsMace.createArcaneWrathTree(1, 1, 9.5);
    priestsMace.createHealingTree(1, 1, 6.2);
    priestsMace.createNaturesWrathTree(1, 1, 8.2);
    priestsMace.createPowerTree(2, 4, 29.5);
    priestsMace.createShadowWrathTree(1, 3, 8.0);
    priestsMace.createStaminaTree(1, 1, 18.0);
    priestsMace.createStrengthTree(1, 1, 20.6);
    list.add(priestsMace);
  }
  
  private static void fillMurphstar() {
    int id = 1207;
    MultiBonus murphstar = new MultiBonus("Murphstar", id);
    murphstar.createArcaneWrathTree(9, 10, 4.7);
    murphstar.createHealingTree(7, 8, 2.3);
    murphstar.createNaturesWrathTree(9, 10, 3.9);
    murphstar.createPowerTree(12, 14, 13.8);
    murphstar.createShadowWrathTree(9, 11, 3.5);
    murphstar.createStaminaTree(6, 7, 4.6);
    murphstar.createStrengthTree(6, 7, 5.2);
    
    murphstar.createBearTree(4, 4, 20.4);
    murphstar.createMonkeyTree(4, 4, 20.7);
    murphstar.createTigerTree(4, 4, 20.7);
    list.add(murphstar);
  }
  
  private static void fillLeadenMace() {
    int id = 865;
    MultiBonus leadenMace = new MultiBonus("Leaden Mace", id);
    leadenMace.createArcaneWrathTree(7, 7, 4.9);
    leadenMace.createHealingTree(6, 6, 2.4);
    leadenMace.createNaturesWrathTree(7, 7, 4.1);
    leadenMace.createPowerTree(10, 14, 13.7);
    leadenMace.createShadowWrathTree(7, 7, 3.9);
    leadenMace.createStaminaTree(5, 5, 4.4);
    leadenMace.createStrengthTree(5, 5, 5.0);
    
    leadenMace.createBearTree(3, 4, 20.6);
    leadenMace.createMonkeyTree(3, 4, 20.3);
    leadenMace.createTigerTree(3, 4, 20.8);
    list.add(leadenMace);
  }
  
  private static void fillJaggedStar() {
    int id = 15223;
    MultiBonus jaggedStar = new MultiBonus("Jagged Star", id);
    jaggedStar.createArcaneWrathTree(4, 6, 4.2);
    jaggedStar.createHealingTree(4, 4, 1.9);
    jaggedStar.createNaturesWrathTree(4, 4, 3.5);
    jaggedStar.createPowerTree(6, 10, 13.5);
    jaggedStar.createShadowWrathTree(4, 4, 3.3);
    jaggedStar.createStaminaTree(3, 3, 4.4);
    jaggedStar.createStrengthTree(3, 3, 5.0);
    
    jaggedStar.createBearTree(1, 2, 20.0);
    jaggedStar.createMonkeyTree(1, 2, 22.1);
    jaggedStar.createTigerTree(1, 2, 22.1);
    list.add(jaggedStar);
  }
  
  private static void fillGoblinNutcracker() {
    int id = 8194;
    MultiBonus goblinNutcracker = new MultiBonus("Goblin Nutcracker", id);
    goblinNutcracker.createArcaneWrathTree(10, 10, 5.1);
    goblinNutcracker.createHealingTree(8, 11, 3.0);
    goblinNutcracker.createNaturesWrathTree(10, 10, 4.2);
    goblinNutcracker.createPowerTree(14, 20, 13.5);
    goblinNutcracker.createShadowWrathTree(10, 13, 4.2);
    goblinNutcracker.createStaminaTree(7, 7, 4.6);
    goblinNutcracker.createStrengthTree(7, 7, 4.9);
    
    goblinNutcracker.createBearTree(4, 5, 20.0);
    goblinNutcracker.createMonkeyTree(4, 5, 20.6);
    goblinNutcracker.createTigerTree(4, 5, 20.0);
    list.add(goblinNutcracker);
  }
  
  private static void fillGiantClub() {
    int id = 15226;
    MultiBonus giantClub = new MultiBonus("Giant Club", id);
    giantClub.createArcaneWrathTree(9, 13,4.0);
    giantClub.createHealingTree(7, 8, 1.9);
    giantClub.createNaturesWrathTree(9, 11, 3.3);
    giantClub.createPowerTree(12, 18, 14.7);
    giantClub.createShadowWrathTree(9, 11, 2.8);
    giantClub.createStaminaTree(6, 7, 4.5);
    giantClub.createStrengthTree(6, 7, 5.3);
    
    giantClub.createBearTree(4, 4, 20.6);
    giantClub.createMonkeyTree(4, 4, 21.4);
    giantClub.createTigerTree(4, 4, 21.5);
    list.add(giantClub);
  }
  
  private static void fillDiamondtipBludgeon() {
    int id = 15227;
    MultiBonus diamondtipBludgeon = new MultiBonus("Diamond-Tip Bludgeon", id);
    diamondtipBludgeon.createArcaneWrathTree(13, 13, 4.3);
    diamondtipBludgeon.createHealingTree(11, 11, 2.9);
    diamondtipBludgeon.createNaturesWrathTree(13, 13, 3.8);
    diamondtipBludgeon.createPowerTree(18, 24, 13.4);
    diamondtipBludgeon.createShadowWrathTree(13, 13, 3.7);
    diamondtipBludgeon.createStaminaTree(9, 9, 4.6);
    diamondtipBludgeon.createStrengthTree(9, 9, 4.4);
    
    diamondtipBludgeon.createBearTree(5, 6, 20.9);
    diamondtipBludgeon.createMonkeyTree(5, 6, 21.4);
    diamondtipBludgeon.createTigerTree(5, 6, 20.5);
    list.add(diamondtipBludgeon);
  }
  
  private static void fillBlesswindHammer() {
    int id = 15229;
    MultiBonus blesswindHammer = new MultiBonus("Blesswind Hammer", id);
    blesswindHammer.createArcaneWrathTree(14, 14, 4.9);
    blesswindHammer.createHealingTree(12, 12, 3.0);
    blesswindHammer.createNaturesWrathTree(14, 14, 3.9);
    blesswindHammer.createPowerTree(20, 28, 13.2);
    blesswindHammer.createShadowWrathTree(14, 14, 4.5);
    blesswindHammer.createStaminaTree(10, 10, 4.6);
    blesswindHammer.createStrengthTree(10, 10, 4.6);
    
    blesswindHammer.createBearTree(6, 7, 20.6);
    blesswindHammer.createMonkeyTree(6, 7, 20.4);
    blesswindHammer.createTigerTree(6, 7, 20.1);
    list.add(blesswindHammer);
  }
  
  private static void fillBattlesmasher() {
    int id = 15224;
    MultiBonus battlesmasher = new MultiBonus("Battlesmasher", id);
    battlesmasher.createArcaneWrathTree(6, 7, 5.0);
    battlesmasher.createHealingTree(5, 6, 2.2);
    battlesmasher.createNaturesWrathTree(6, 7, 4.1);
    battlesmasher.createPowerTree(8, 10, 13.7);
    battlesmasher.createShadowWrathTree(6, 6, 3.7);
    battlesmasher.createStaminaTree(4, 4, 4.3);
    battlesmasher.createStrengthTree(4, 4, 4.9);
    
    battlesmasher.createBearTree(2, 3, 19.5);
    battlesmasher.createMonkeyTree(2, 3, 21.4);
    battlesmasher.createTigerTree(2, 3, 21.3);
    list.add(battlesmasher);
  }
  
  private static void fillBarbedClub() {
    int id = 15222;
    MultiBonus barbedClub = new MultiBonus("Barbed Club", id);
    barbedClub.createArcaneWrathTree(3, 4, 10.2);
    barbedClub.createHealingTree(2, 4, 4.7);
    barbedClub.createNaturesWrathTree(3, 4, 8.0);
    barbedClub.createPowerTree(4, 8, 30.0);
    barbedClub.createShadowWrathTree(3, 4, 7.4);
    barbedClub.createStaminaTree(2, 3, 18.2);
    barbedClub.createStrengthTree(2, 3, 21.4);
    list.add(barbedClub);
  }
}
