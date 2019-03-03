package db.random.weapons.melee;

import java.util.ArrayList;

import util.MultiBonus;

/**
 * A Class, that stores all Daggers with MultiBonus. They can be accessed by calling {@link 
 * #getList()}.
 * @author Haeldeus
 * @version 1.0
 */
public class Daggers {

  /**
   * A List, that saves every Dagger, that has a MultiBonus. These Items are saved as an {@link 
   * ArrayList} of {@link MultiBonus}.
   */
  private static ArrayList<MultiBonus> list;
  
  /**
   * The ID's of all Daggers with MultiBonus.
   */
  private static int[] ids = {
    10828, 15241, 15247, 2140, 2819, 2632, 15243, 15246, 4088, 15242, 3184, 15244, 3187, 
    15245, 4571
  }; 
  
  /**
   * Returns a List of all Daggers with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all Daggers with 
   *     Random Boni, that are available in the Game.
   * @since 1.0
   */
  public static ArrayList<MultiBonus> getList() {
    if (list == null) {
      fill();
    }
    return list;
  }
  
  /**
   * Returns all ID's.
   * @return The ID's of all Daggers as an Array of Integers.
   * @since 1.0
   */
  public static int[] getIDs() {
    return ids;
  }
  
  /**
   * Fills the {@link #list} with all Daggers, that have a MultiBonus.
   * @since 1.0
   */
  private static void fill() {
    list = new ArrayList<MultiBonus>();
    fillDireNail();
    fillBattleKnife();
    fillBloodstrikeDagger();
    fillCarvingKnife();
    fillCrossDagger();
    fillCurvedDagger();
    fillDeadlyKris();
    fillDemonBlade();
    fillDreadBlade();
    fillHonedStiletto();
    fillHookDagger();
    fillRazorBlade();
    fillSacrificialKris();
    fillVorpalDagger();
    fillWarKnife();
    System.out.println("Daggers: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=4571">War Knife</a> to the List.
   * @since 1.0
   */
  private static void fillWarKnife() {
    int id = 4571;
    MultiBonus warKnife = new MultiBonus("War Knife", id);
    warKnife.createAgilityTree(2, 2, 10.2);
    warKnife.createArcaneWrathTree(3, 3, 7.4);
    warKnife.createFieryWrathTree(3, 3, 4.8);
    warKnife.createFrozenWrathTree(3, 3, 3.8);
    warKnife.createHealingTree(2, 2, 9.2);
    warKnife.createNaturesWrathTree(3, 3, 6.6);
    warKnife.createPowerTree(4, 6, 31.5);
    warKnife.createShadowWrathTree(3, 4, 2.5);
    warKnife.createStaminaTree(2, 2, 10.6);
    warKnife.createStrengthTree(2, 2, 13.5);
    list.add(warKnife);
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=15245">Vorpal Dagger</a> to the List.
   * @since 1.0
   */
  private static void fillVorpalDagger() {
    int id = 15245;
    MultiBonus vorpalDagger = new MultiBonus("Vorpal Dagger", id);
    vorpalDagger.createAgilityTree(9, 9, 3.5);
    vorpalDagger.createArcaneWrathTree(13, 13, 4.0);
    vorpalDagger.createFieryWrathTree(13, 17, 2.9);
    vorpalDagger.createFrozenWrathTree(13, 13, 2.1);
    vorpalDagger.createHealingTree(11, 11, 4.4);
    vorpalDagger.createNaturesWrathTree(13, 13, 3.1);
    vorpalDagger.createPowerTree(18, 24, 19.6);
    vorpalDagger.createShadowWrathTree(13, 13, 1.6);
    vorpalDagger.createStaminaTree(9, 9, 3.9);
    vorpalDagger.createStrengthTree(9, 9, 4.5);
    
    vorpalDagger.createBearTree(5, 6, 18.6);
    vorpalDagger.createMonkeyTree(5, 6, 15.5);
    vorpalDagger.createTigerTree(5, 6, 16.1);
    list.add(vorpalDagger);
  }

  /**
   * Adds the <a href="db.vanillagaming.org/?item=3187">Sacrificial Kris</a> to the List.
   * @since 1.0
   */
  private static void fillSacrificialKris() {
    int id = 3187;
    MultiBonus sacrificialKris = new MultiBonus("Sacrificial Kris", id);
    sacrificialKris.createAgilityTree(7, 8, 3.5);
    sacrificialKris.createArcaneWrathTree(10, 11, 4.2);
    sacrificialKris.createFieryWrathTree(10, 11, 2.9);
    sacrificialKris.createFrozenWrathTree(10, 11, 2.1);
    sacrificialKris.createHealingTree(8, 12, 4.5);
    sacrificialKris.createNaturesWrathTree(10, 11, 3.2);
    sacrificialKris.createPowerTree(14, 20, 19.7);
    sacrificialKris.createShadowWrathTree(10, 11, 1.2);
    sacrificialKris.createStaminaTree(7, 8, 3.8);
    sacrificialKris.createStrengthTree(7, 8, 5.0);
    
    sacrificialKris.createBearTree(4, 5, 18.8);
    sacrificialKris.createMonkeyTree(4, 5, 15.0);
    sacrificialKris.createTigerTree(4, 5, 16.1);
    list.add(sacrificialKris);
    
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=15244">Razor Blade</a> to the List.
   * @since 1.0
   */
  private static void fillRazorBlade() {
    int id = 15244;
    MultiBonus razorBlade = new MultiBonus("Razor Blade", id);
    razorBlade.createAgilityTree(7, 7, 3.7);
    razorBlade.createArcaneWrathTree(10, 10, 4.2);
    razorBlade.createFieryWrathTree(10, 10, 2.8);
    razorBlade.createFrozenWrathTree(10, 10, 2.1);
    razorBlade.createHealingTree(8, 8, 4.5);
    razorBlade.createNaturesWrathTree(10, 13, 3.3);
    razorBlade.createPowerTree(14, 18, 19.6);
    razorBlade.createShadowWrathTree(10, 10, 1.3);
    razorBlade.createStaminaTree(7, 7, 3.8);
    razorBlade.createStrengthTree(7, 7, 4.5);
    
    razorBlade.createBearTree(4, 5, 18.5);
    razorBlade.createMonkeyTree(4, 5, 15.5);
    razorBlade.createTigerTree(4, 5, 16.2);
    list.add(razorBlade);
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=3184">Hook Dagger</a> to the List.
   * @since 1.0
   */
  private static void fillHookDagger() {
    int id = 3184;
    MultiBonus hookDagger = new MultiBonus("Hook Dagger", id);
    hookDagger.createAgilityTree(2, 3, 8.8);
    hookDagger.createArcaneWrathTree(3, 4, 9.7);
    hookDagger.createFieryWrathTree(3, 4, 4.5);
    hookDagger.createFrozenWrathTree(3, 4, 5.5);
    hookDagger.createHealingTree(2, 4, 8.7);
    hookDagger.createNaturesWrathTree(3, 4, 7.1);
    hookDagger.createPowerTree(4, 8, 30.9);
    hookDagger.createStaminaTree(2, 3, 10.7);
    hookDagger.createStrengthTree(2, 3, 14.2);
    list.add(hookDagger);
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=15242">Honed Stiletto</a> to the List.
   * @since 1.0
   */
  private static void fillHonedStiletto() {
    int id = 15242;
    MultiBonus honedStiletto = new MultiBonus("Honed Stiletto", id);
    honedStiletto.createAgilityTree(4, 5, 3.1);
    honedStiletto.createArcaneWrathTree(6, 7, 4.9);
    honedStiletto.createFieryWrathTree(6, 9, 3.1);
    honedStiletto.createFrozenWrathTree(6, 7, 2.2);
    honedStiletto.createHealingTree(5, 6, 5.6);
    honedStiletto.createNaturesWrathTree(6, 7, 4.0);
    honedStiletto.createPowerTree(8, 12, 19.6);
    honedStiletto.createShadowWrathTree(6, 7, 1.6);
    honedStiletto.createStaminaTree(4, 5, 3.9);
    honedStiletto.createStrengthTree(4, 5, 4.9);
    
    honedStiletto.createBearTree(2, 3, 18.6);
    honedStiletto.createMonkeyTree(2, 3, 13.7);
    honedStiletto.createTigerTree(2, 3, 14.9);
    list.add(honedStiletto);
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=4088">Dread Blade</a> to the List.
   * @since 1.0
   */
  private static void fillDreadBlade() {
    int id = 4088;
    MultiBonus dreadblade = new MultiBonus("Dreadblade", id);
    dreadblade.createAgilityTree(8, 8, 3.5);
    dreadblade.createArcaneWrathTree(11, 11, 4.0);
    dreadblade.createFieryWrathTree(11, 11, 3.0);
    dreadblade.createFrozenWrathTree(11, 11, 2.2);
    dreadblade.createHealingTree(9, 9, 4.5);
    dreadblade.createNaturesWrathTree(11, 11, 2.9);
    dreadblade.createPowerTree(16, 22, 19.5);
    dreadblade.createShadowWrathTree(11, 11, 1.6);
    dreadblade.createStaminaTree(8, 8, 3.9);
    dreadblade.createStrengthTree(8, 8, 4.5);
    
    dreadblade.createBearTree(5, 6, 18.7);
    dreadblade.createMonkeyTree(5, 6, 15.5);
    dreadblade.createTigerTree(5, 6, 16.1);
    list.add(dreadblade);
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=15246">Demon Blade</a> to the List.
   * @since 1.0
   */
  private static void fillDemonBlade() {
    int id = 15246;
    MultiBonus demonBlade = new MultiBonus("Demon Blade", id);
    demonBlade.createAgilityTree(11, 12, 4.1);
    demonBlade.createArcaneWrathTree(16, 17, 3.1);
    demonBlade.createFieryWrathTree(16, 17, 2.4);
    demonBlade.createFrozenWrathTree(16, 17, 1.5);
    demonBlade.createHealingTree(13, 14, 4.1);
    demonBlade.createNaturesWrathTree(16, 17, 2.7);
    demonBlade.createPowerTree(22, 24, 20.7);
    demonBlade.createShadowWrathTree(16, 17, 1.6);
    demonBlade.createStaminaTree(11, 12, 3.7);
    demonBlade.createStrengthTree(11, 12, 3.6);
    
    demonBlade.createBearTree(7, 8, 17.4);
    demonBlade.createMonkeyTree(7, 8, 17.5);
    demonBlade.createTigerTree(7, 8, 17.6);
    list.add(demonBlade);
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=15243">Deadly Kris</a> to the List.
   * @since 1.0
   */
  private static void fillDeadlyKris() {
    int id = 15243;
    MultiBonus deadlyKris = new MultiBonus("Deadly Kris", id);
    deadlyKris.createAgilityTree(5, 6, 3.5);
    deadlyKris.createArcaneWrathTree(7, 11, 4.1);
    deadlyKris.createFieryWrathTree(7, 9, 2.5);
    deadlyKris.createFrozenWrathTree(7, 9, 2.0);
    deadlyKris.createHealingTree(6, 9, 4.0);
    deadlyKris.createNaturesWrathTree(7, 9, 3.5);
    deadlyKris.createPowerTree(10, 16, 20.4);
    deadlyKris.createShadowWrathTree(7, 9, 1.2);
    deadlyKris.createStaminaTree(5, 6, 3.7);
    deadlyKris.createStrengthTree(5, 6, 5.3);
    
    deadlyKris.createBearTree(3, 4, 19.5);
    deadlyKris.createMonkeyTree(3, 4, 14.5);
    deadlyKris.createTigerTree(3, 4, 16.0);
    list.add(deadlyKris);
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=2632">Curved Dagger</a> to the List.
   * @since 1.0
   */
  private static void fillCurvedDagger() {
    int id = 2632;
    MultiBonus curvedDagger = new MultiBonus("Curved Dagger", id);
    curvedDagger.createAgilityTree(1, 1, 10.7);
    curvedDagger.createArcaneWrathTree(1, 1, 6.6);
    curvedDagger.createFieryWrathTree(1, 1, 3.5);
    curvedDagger.createFrozenWrathTree(1, 1, 3.9);
    curvedDagger.createHealingTree(1, 2, 7.5);
    curvedDagger.createNaturesWrathTree(1, 1, 5.8);
    curvedDagger.createPowerTree(2, 4, 31.8);
    curvedDagger.createShadowWrathTree(1, 1, 3.1);
    curvedDagger.createStaminaTree(1, 1, 10.5);
    curvedDagger.createStrengthTree(1, 1, 12.2);
    list.add(curvedDagger);
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=15241">Battle Knife</a> to the List.
   * @since 1.0
   */
  private static void fillBattleKnife() {
    int id = 15241;
    MultiBonus battleKnife = new MultiBonus("Battle Knife", id);
    battleKnife.createAgilityTree(4, 4, 3.3);
    battleKnife.createArcaneWrathTree(6, 6, 4.5);
    battleKnife.createFieryWrathTree(6, 6, 2.8);
    battleKnife.createFrozenWrathTree(6, 6, 2.1);
    battleKnife.createHealingTree(5, 5, 4.8);
    battleKnife.createNaturesWrathTree(6, 6, 3.8);
    battleKnife.createPowerTree(8, 10, 19.6);
    battleKnife.createShadowWrathTree(6, 6, 1.5);
    battleKnife.createStaminaTree(4, 4, 3.7);
    battleKnife.createStrengthTree(4, 4, 4.9);
    
    battleKnife.createBearTree(2, 3, 19.0);
    battleKnife.createMonkeyTree(2, 3, 14.5);
    battleKnife.createTigerTree(2, 3, 15.6);
    list.add(battleKnife);
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=2140">Carving Knife</a> to the List.
   * @since 1.0
   */
  private static void fillCarvingKnife() {
    int id = 2140;
    MultiBonus carvingKnife = new MultiBonus("Carving Knife", id);
    carvingKnife.createAgilityTree(1, 1, 11.3);
    carvingKnife.createArcaneWrathTree(1, 3, 6.2);
    carvingKnife.createFieryWrathTree(1, 1, 3.3);
    carvingKnife.createFrozenWrathTree(1, 3, 3.7);
    carvingKnife.createHealingTree(1, 1, 6.9);
    carvingKnife.createHolyWrathTree(1, 1, 3.9);
    carvingKnife.createNaturesWrathTree(1, 1, 5.5);
    carvingKnife.createPowerTree(2, 4, 33.1);
    carvingKnife.createShadowWrathTree(1, 1, 2.9);
    carvingKnife.createStaminaTree(1, 1, 10.8);
    carvingKnife.createStrengthTree(1, 1, 12.4);
    list.add(carvingKnife);
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=2819">Cross Dagger</a> to the List.
   * @since 1.0
   */
  private static void fillCrossDagger() {
    int id = 2819;
    MultiBonus crossDagger = new MultiBonus("Cross Dagger", id);
    crossDagger.createAgilityTree(4, 5, 3.3);
    crossDagger.createArcaneWrathTree(6, 7, 4.5);
    crossDagger.createFieryWrathTree(6, 7, 2.9);
    crossDagger.createFrozenWrathTree(6, 7, 2.2);
    crossDagger.createHealingTree(5, 7, 5.0);
    crossDagger.createNaturesWrathTree(6, 7, 3.9);
    crossDagger.createPowerTree(8, 12, 19.9);
    crossDagger.createShadowWrathTree(6, 7, 1.5);
    crossDagger.createStaminaTree(4, 5, 3.7);
    crossDagger.createStrengthTree(4, 5, 4.8);
    
    crossDagger.createBearTree(2, 3, 18.9);
    crossDagger.createMonkeyTree(2, 3, 14.0);
    crossDagger.createTigerTree(2, 3, 15.3);
    list.add(crossDagger);
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=15247">Bloodstrike Dagger</a> to the List.
   * @since 1.0
   */
  private static void fillBloodstrikeDagger() {
    int id = 15247;
    MultiBonus bloodstrikeDagger = new MultiBonus("Bloodstrike Dagger", id);
    bloodstrikeDagger.createAgilityTree(12, 12, 4.3);
    bloodstrikeDagger.createArcaneWrathTree(17, 17, 2.7);
    bloodstrikeDagger.createFieryWrathTree(17, 17, 2.4);
    bloodstrikeDagger.createFrozenWrathTree(17, 17, 1.4);
    bloodstrikeDagger.createHealingTree(14, 14, 4.2);
    bloodstrikeDagger.createNaturesWrathTree(17, 17, 2.1);
    bloodstrikeDagger.createPowerTree(24, 24, 19.8);
    bloodstrikeDagger.createShadowWrathTree(17, 17, 1.5);
    bloodstrikeDagger.createStaminaTree(12, 12, 3.9);
    bloodstrikeDagger.createStrengthTree(12, 12, 3.7);
    
    bloodstrikeDagger.createBearTree(7, 8, 17.1);
    bloodstrikeDagger.createMonkeyTree(7, 8, 19.1);
    bloodstrikeDagger.createTigerTree(7, 8, 17.9);
    list.add(bloodstrikeDagger);
  }
  
  /**
   * Adds the <a href="db.vanillagaming.org/?item=10828">Dire Nail</a> to the List.
   * @since 1.0
   */
  private static void fillDireNail() { //+5 Shadow Resistance on default!
    int id = 10828;
    MultiBonus direNail = new MultiBonus("Dire Nail", id);
    direNail.addDefaultBonus(db.stats.Stat.ShadowResist, 5);
    direNail.createAgilityTree(11, 12, 4.8);
    direNail.createArcaneWrathTree(16, 17, 3.4);
    direNail.createFieryWrathTree(16, 17, 2.1);
    direNail.createFrozenWrathTree(16, 16, 0.6);
    direNail.createHealingTree(13, 14, 3.7);
    direNail.createNaturesWrathTree(16, 17, 2.6);
    direNail.createPowerTree(22, 24, 20.3);
    direNail.createShadowWrathTree(16, 16, 0.6);
    direNail.createStaminaTree(11, 12, 3.7);
    direNail.createStrengthTree(11, 12, 4.0);
    
    direNail.createBearTree(7, 8, 17.9);
    direNail.createMonkeyTree(7, 8, 18.8);
    direNail.createTigerTree(7, 8, 17.5);
    list.add(direNail);
  }
}
