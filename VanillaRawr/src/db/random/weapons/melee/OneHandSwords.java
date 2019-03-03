package db.random.weapons.melee;

import java.util.ArrayList;
import util.MultiBonus;

public class OneHandSwords {

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    15220, 15218, 3740, 15219, 8196, 15212, 15215, 15221, 864, 15213, 15211, 15214, 2078, 
    727, 15210, 15216, 3186, 15217
  };
  
  /**
   * Returns the List of MultiBoni for all Items of this type..
   * @return The List of MultiBoni as an {@link ArrayList} of {@link MultiBonus}.
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
    fillBattlefellSabre();
    fillCrystalSword();
    fillDecapitatingSword();
    fillDimensionalSword();
    fillEbonScimitar();
    fillFighterBroadsword();
    fillFuriousFalchion();
    fillHolyWarSword();
    fillKnightlyLongsword();
    fillMercenaryBlade();
    fillMilitantShortsword();
    fillNoblesBrand();
    fillNorthernShortsword();
    fillNotchedShortsword();
    fillRaiderShortsword();
    fillRuneSword();
    fillVikingSword();
    fillWidowBlade();
    System.out.println("One-handed Swords: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
  
  private static void fillWidowBlade() {
    int id = 15217;
    MultiBonus widowBlade = new MultiBonus("Widow Blade", id);
    widowBlade.createPowerTree(18, 20, 5.8);
    widowBlade.createStaminaTree(9, 10, 6.1);
    widowBlade.createStrengthTree(9, 10, 7.0);
    
    widowBlade.createBearTree(6, 6, 29.2);
    widowBlade.createMonkeyTree(6, 6, 25.0);
    widowBlade.createTigerTree(6, 6, 26.9);
    list.add(widowBlade);
  }
  
  private static void fillVikingSword() {
    int id = 3186;
    MultiBonus vikingSword = new MultiBonus("Viking Sword", id);
    vikingSword.createPowerTree(8, 12, 6.0);
    vikingSword.createStaminaTree(4, 5, 5.7);
    vikingSword.createStrengthTree(4, 5, 6.7);
    
    vikingSword.createBearTree(2, 3, 27.9);
    vikingSword.createMonkeyTree(2, 3, 26.3);
    vikingSword.createTigerTree(2, 3, 27.4);
    list.add(vikingSword);
  }
  
  private static void fillRuneSword() {
    int id = 15216;
    MultiBonus runeSword = new MultiBonus("Rune Sword", id);
    runeSword.createPowerTree(18, 18, 5.9);
    runeSword.createStaminaTree(9, 9, 5.8);
    runeSword.createStrengthTree(9, 9, 7.2);
    
    runeSword.createBearTree(5, 6, 29.9);
    runeSword.createMonkeyTree(5, 6, 24.6);
    runeSword.createTigerTree(5, 6, 26.7);
    list.add(runeSword);
  }
  
  private static void fillRaiderShortsword() {
    int id = 15210;
    MultiBonus raiderShortsword = new MultiBonus("Raider Shortsword", id);
    raiderShortsword.createPowerTree(4, 6, 19.4);
    raiderShortsword.createStaminaTree(2, 2, 38.1);
    raiderShortsword.createStrengthTree(2, 2, 42.5);
    list.add(raiderShortsword);
  }
  
  private static void fillNotchedShortsword() {
    int id = 727;
    MultiBonus notchedShortsword = new MultiBonus("Notched Shortsword", id);
    notchedShortsword.createPowerTree(1, 2, 19.9);
    notchedShortsword.createStaminaTree(1, 1, 38.8);
    notchedShortsword.createStrengthTree(1, 1, 41.3);
    list.add(notchedShortsword);
  }
  
  private static void fillNorthernShortsword() {
    int id = 2078;
    MultiBonus northernShortsword = new MultiBonus("Northern Shortsword", id);
    northernShortsword.createPowerTree(4, 6, 19.6);
    northernShortsword.createStaminaTree(2, 2, 37.8);
    northernShortsword.createStrengthTree(2, 2, 42.6);
    list.add(northernShortsword);
  }
  
  private static void fillNoblesBrand() {
    int id = 15214;
    MultiBonus noblesBrand = new MultiBonus("Nobles Brand", id);
    noblesBrand.createPowerTree(14, 18, 6.0);
    noblesBrand.createStaminaTree(7, 7, 5.7);
    noblesBrand.createStrengthTree(7, 7, 7.4);
    
    noblesBrand.createBearTree(4, 5, 29.5);
    noblesBrand.createMonkeyTree(4, 5, 24.3);
    noblesBrand.createTigerTree(4, 5, 27.2);
    list.add(noblesBrand);
  }
  
  private static void fillMilitantShortsword() {
    int id = 15211;
    MultiBonus militantShortsword = new MultiBonus("Militant Shortsword", id);
    militantShortsword.createPowerTree(6, 6, 6.0);
    militantShortsword.createStaminaTree(3, 3, 5.8);
    militantShortsword.createStrengthTree(3, 3, 6.6);
    
    militantShortsword.createBearTree(1, 2, 28.4);
    militantShortsword.createMonkeyTree(1, 2, 26.3);
    militantShortsword.createTigerTree(1, 2, 27.0);
    list.add(militantShortsword);
  }
  
  private static void fillMercenaryBlade() {
    int id = 15213;
    MultiBonus mercenaryBlade = new MultiBonus("Mercenary Blade", id);
    mercenaryBlade.createPowerTree(10, 12, 5.9);
    mercenaryBlade.createStaminaTree(5, 6, 5.8);
    mercenaryBlade.createStrengthTree(5, 6, 7.4);
    
    mercenaryBlade.createBearTree(3, 4, 29.1);
    mercenaryBlade.createMonkeyTree(3, 4, 24.9);
    mercenaryBlade.createTigerTree(3, 4, 27.0);
    list.add(mercenaryBlade);
  }
  
  private static void fillKnightlyLongsword() {
    int id = 864;
    MultiBonus knightlyLongsword = new MultiBonus("Knightly Longsword", id);
    knightlyLongsword.createPowerTree(12, 14, 6.1);
    knightlyLongsword.createStaminaTree(6, 7, 5.8);
    knightlyLongsword.createStrengthTree(6, 7, 7.6);
    
    knightlyLongsword.createBearTree(4, 4, 29.2);
    knightlyLongsword.createMonkeyTree(4, 4, 24.1);
    knightlyLongsword.createTigerTree(4, 4, 27.2);
    list.add(knightlyLongsword);
  }
  
  private static void fillHolyWarSword() {
    int id = 15221;
    MultiBonus holyWarSword = new MultiBonus("Holy War Sword", id);
    holyWarSword.createPowerTree(24, 24, 5.7);
    holyWarSword.createStaminaTree(12, 12, 5.9);
    holyWarSword.createStrengthTree(12, 12, 5.8);
    
    holyWarSword.createBearTree(7, 8, 26.6);
    holyWarSword.createMonkeyTree(7, 8, 29.1);
    holyWarSword.createTigerTree(7, 8, 26.7);
    list.add(holyWarSword);
  }
  
  private static void fillFuriousFalchion() {
    int id = 15215;
    MultiBonus furiousFalchion = new MultiBonus("Furious Falchion", id);
    furiousFalchion.createPowerTree(14, 16, 5.8);
    furiousFalchion.createStaminaTree(7, 8, 5.7);
    furiousFalchion.createStrengthTree(7, 8, 7.0);
    
    furiousFalchion.createBearTree(4, 5, 28.5);
    furiousFalchion.createMonkeyTree(4, 5, 25.5);
    furiousFalchion.createTigerTree(4, 5, 27.8);
    list.add(furiousFalchion);
  }
  
  private static void fillFighterBroadsword() {
    int id = 15212;
    MultiBonus fighterBroadsword = new MultiBonus("Fighter Broadsword", id);
    fighterBroadsword.createPowerTree(8, 8, 5.9);
    fighterBroadsword.createStaminaTree(4, 4, 5.6);
    fighterBroadsword.createStrengthTree(4, 4, 6.4);
    
    fighterBroadsword.createBearTree(2, 3, 27.8);
    fighterBroadsword.createMonkeyTree(2, 3, 26.9);
    fighterBroadsword.createTigerTree(2, 3, 27.5);
    list.add(fighterBroadsword);
  }
  
  private static void fillEbonScimitar() {
    int id = 8196;
    MultiBonus ebonScimitar = new MultiBonus("Ebon Scimitar", id);
    ebonScimitar.createPowerTree(14, 16, 5.8);
    ebonScimitar.createStaminaTree(7, 8, 5.9);
    ebonScimitar.createStrengthTree(7, 8, 7.5);
    
    ebonScimitar.createBearTree(4, 5, 29.1);
    ebonScimitar.createMonkeyTree(4, 5, 24.7);
    ebonScimitar.createTigerTree(4, 5, 26.9);
    list.add(ebonScimitar);
  }
  
  private static void fillDimensionalSword() {
    int id = 15219;
    MultiBonus dimensionalSword = new MultiBonus("Dimensional Sword", id);
    dimensionalSword.createPowerTree(22, 22, 6.2);
    dimensionalSword.createStaminaTree(11, 11, 5.5);
    dimensionalSword.createStrengthTree(11, 11, 6.4);
    
    dimensionalSword.createBearTree(7, 7, 28.4);
    dimensionalSword.createMonkeyTree(7, 7, 26.1);
    dimensionalSword.createTigerTree(7, 7, 27.4);
    list.add(dimensionalSword);
  }
  
  private static void fillDecapitatingSword() {
    int id = 3740;
    MultiBonus decapitatingSword = new MultiBonus("Decapitating Sword", id);
    decapitatingSword.createPowerTree(6, 6, 5.9);
    decapitatingSword.createStaminaTree(3, 3, 5.7);
    decapitatingSword.createStrengthTree(3, 3, 6.3);
    
    decapitatingSword.createBearTree(1, 2, 26.5);
    decapitatingSword.createMonkeyTree(1, 2, 27.9);
    decapitatingSword.createTigerTree(1, 2, 27.8);
    list.add(decapitatingSword);
  }
  
  private static void fillCrystalSword() {
    int id = 15218;
    MultiBonus crystalSword = new MultiBonus("Crystal Sword", id);
    crystalSword.createPowerTree(20, 20, 5.7);
    crystalSword.createStaminaTree(10, 10, 5.8);
    crystalSword.createStrengthTree(10, 10, 6.7);
    
    crystalSword.createBearTree(6, 7, 28.3);
    crystalSword.createMonkeyTree(6, 7, 26.4);
    crystalSword.createTigerTree(6, 7, 27.0);
    list.add(crystalSword);
  }
  
  private static void fillBattlefellSabre() {
    int id = 15220;
    MultiBonus battlefellSabre = new MultiBonus("Battlefell Sabre", id);
    battlefellSabre.createPowerTree(22, 24, 5.7);
    battlefellSabre.createStaminaTree(11, 12, 5.5);
    battlefellSabre.createStrengthTree(11, 12, 5.7);
    
    battlefellSabre.createBearTree(7, 8, 27.6);
    battlefellSabre.createMonkeyTree(7, 8, 26.9);
    battlefellSabre.createTigerTree(7, 8, 28.7);
    list.add(battlefellSabre);
  }
}
