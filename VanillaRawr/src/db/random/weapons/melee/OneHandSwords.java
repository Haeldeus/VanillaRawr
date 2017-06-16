package db.random.weapons.melee;

import db.stats.Stat;
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
    fillWidowBlade(); /*
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
    System.out.println("--------------");
    System.out.println(list.get(13));
    System.out.println("--------------");
    System.out.println(list.get(14));
    System.out.println("--------------");
    System.out.println(list.get(15));
    System.out.println("--------------");
    System.out.println(list.get(16));
    System.out.println("--------------");
    System.out.println(list.get(17));
    System.out.println("--------------"); */
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
    notchedShortsword.addToList(notchedShortsword.createTree(" of Power", notchedShortsword.createSubTree(Stat.AttackPower, 1, 2), null, 19.9));
    notchedShortsword.addToList(notchedShortsword.createTree(" of Stamina", notchedShortsword.createSubTree(Stat.Stamina, 1, 1), null, 38.8));
    notchedShortsword.addToList(notchedShortsword.createTree(" of Strength", notchedShortsword.createSubTree(Stat.Strength, 1, 1), null, 41.3));
    list.add(notchedShortsword);
  }
  
  private static void fillNorthernShortsword() {
    int id = 2078;
    MultiBonus northernShortsword = new MultiBonus("Northern Shortsword", id);
    northernShortsword.addToList(northernShortsword.createTree(" of Power", northernShortsword.createSubTree(Stat.AttackPower, 4, 6), null, 19.6));
    northernShortsword.addToList(northernShortsword.createTree(" of Stamina", northernShortsword.createSubTree(Stat.Stamina, 2, 2), null, 37.8));
    northernShortsword.addToList(northernShortsword.createTree(" of Strength", northernShortsword.createSubTree(Stat.Strength, 2, 2), null, 42.6));
    list.add(northernShortsword);
  }
  
  private static void fillNoblesBrand() {
    int id = 15214;
    MultiBonus noblesBrand = new MultiBonus("Nobles Brand", id);
    noblesBrand.addToList(noblesBrand.createTree(" of Power", noblesBrand.createSubTree(Stat.AttackPower, 14, 18), null, 6.0));
    noblesBrand.addToList(noblesBrand.createTree(" of Stamina", noblesBrand.createSubTree(Stat.Stamina, 7, 7), null, 5.7));
    noblesBrand.addToList(noblesBrand.createTree(" of Strength", noblesBrand.createSubTree(Stat.Strength, 7, 7), null, 7.4));
    
    noblesBrand.addToList(noblesBrand.createTree(" of the Bear", noblesBrand.createSubTree(Stat.Stamina, 4, 5), noblesBrand.createSubTree(Stat.Strength, 4, 5), 29.5));
    noblesBrand.addToList(noblesBrand.createTree(" of the Monkey", noblesBrand.createSubTree(Stat.Agility, 4, 5), noblesBrand.createSubTree(Stat.Stamina, 4, 5), 24.3));
    noblesBrand.addToList(noblesBrand.createTree(" of the Tiger", noblesBrand.createSubTree(Stat.Agility, 4, 5), noblesBrand.createSubTree(Stat.Strength, 4, 5), 27.2));
    list.add(noblesBrand);
  }
  
  private static void fillMilitantShortsword() {
    int id = 15211;
    MultiBonus militantShortsword = new MultiBonus("Militant Shortsword", id);
    militantShortsword.addToList(militantShortsword.createTree(" of Power", militantShortsword.createSubTree(Stat.AttackPower, 6, 6), null, 6.0));
    militantShortsword.addToList(militantShortsword.createTree(" of Stamina", militantShortsword.createSubTree(Stat.Stamina, 3, 3), null, 5.8));
    militantShortsword.addToList(militantShortsword.createTree(" of Strength", militantShortsword.createSubTree(Stat.Strength, 3, 3), null, 6.6));
    
    militantShortsword.addToList(militantShortsword.createTree(" of the Bear", militantShortsword.createSubTree(Stat.Stamina, 1, 2), militantShortsword.createSubTree(Stat.Strength, 1, 2), 28.4));
    militantShortsword.addToList(militantShortsword.createTree(" of the Monkey", militantShortsword.createSubTree(Stat.Agility, 1, 2), militantShortsword.createSubTree(Stat.Stamina, 1, 2), 26.3));
    militantShortsword.addToList(militantShortsword.createTree(" of the Tiger", militantShortsword.createSubTree(Stat.Agility, 1, 2), militantShortsword.createSubTree(Stat.Strength, 1, 2), 27.0));
    list.add(militantShortsword);
  }
  
  private static void fillMercenaryBlade() {
    int id = 15213;
    MultiBonus mercenaryBlade = new MultiBonus("Mercenary Blade", id);
    mercenaryBlade.addToList(mercenaryBlade.createTree(" of Power", mercenaryBlade.createSubTree(Stat.AttackPower, 10, 12), null, 5.9));
    mercenaryBlade.addToList(mercenaryBlade.createTree(" of Stamina", mercenaryBlade.createSubTree(Stat.Stamina, 5, 6), null, 5.8));
    mercenaryBlade.addToList(mercenaryBlade.createTree(" of Strength", mercenaryBlade.createSubTree(Stat.Strength, 5, 6), null, 7.4));
    
    mercenaryBlade.addToList(mercenaryBlade.createTree(" of the Bear", mercenaryBlade.createSubTree(Stat.Stamina, 3, 4), mercenaryBlade.createSubTree(Stat.Strength, 3, 4), 29.1));
    mercenaryBlade.addToList(mercenaryBlade.createTree(" of the Monkey", mercenaryBlade.createSubTree(Stat.Agility, 3, 4), mercenaryBlade.createSubTree(Stat.Stamina, 3, 4), 24.9));
    mercenaryBlade.addToList(mercenaryBlade.createTree(" of the Tiger", mercenaryBlade.createSubTree(Stat.Agility, 3, 4), mercenaryBlade.createSubTree(Stat.Strength, 3, 4), 27.0));
    list.add(mercenaryBlade);
  }
  
  private static void fillKnightlyLongsword() {
    int id = 864;
    MultiBonus knightlyLongsword = new MultiBonus("Knightly Longsword", id);
    knightlyLongsword.addToList(knightlyLongsword.createTree(" of Power", knightlyLongsword.createSubTree(Stat.AttackPower, 12, 14), null, 6.1));
    knightlyLongsword.addToList(knightlyLongsword.createTree(" of Stamina", knightlyLongsword.createSubTree(Stat.Stamina, 6, 7), null, 5.8));
    knightlyLongsword.addToList(knightlyLongsword.createTree(" of Strength", knightlyLongsword.createSubTree(Stat.Strength, 6, 7), null, 7.6));
    
    knightlyLongsword.addToList(knightlyLongsword.createTree(" of the Bear", knightlyLongsword.createSubTree(Stat.Stamina, 4, 4), knightlyLongsword.createSubTree(Stat.Strength, 4, 4), 29.2));
    knightlyLongsword.addToList(knightlyLongsword.createTree(" of the Monkey", knightlyLongsword.createSubTree(Stat.Agility, 4, 4), knightlyLongsword.createSubTree(Stat.Stamina, 4, 4), 24.1));
    knightlyLongsword.addToList(knightlyLongsword.createTree(" of the Tiger", knightlyLongsword.createSubTree(Stat.Agility, 4, 4), knightlyLongsword.createSubTree(Stat.Strength, 4, 4), 27.2));
    list.add(knightlyLongsword);
  }
  
  private static void fillHolyWarSword() {
    int id = 15221;
    MultiBonus holyWarSword = new MultiBonus("Holy War Sword", id);
    holyWarSword.addToList(holyWarSword.createTree(" of Power", holyWarSword.createSubTree(Stat.AttackPower, 24, 24), null, 5.7));
    holyWarSword.addToList(holyWarSword.createTree(" of Stamina", holyWarSword.createSubTree(Stat.Stamina, 12, 12), null, 5.9));
    holyWarSword.addToList(holyWarSword.createTree(" of Strength", holyWarSword.createSubTree(Stat.Strength, 12, 12), null, 5.8));
    
    holyWarSword.addToList(holyWarSword.createTree(" of the Bear", holyWarSword.createSubTree(Stat.Stamina, 7, 8), holyWarSword.createSubTree(Stat.Strength, 7, 8), 26.6));
    holyWarSword.addToList(holyWarSword.createTree(" of the Monkey", holyWarSword.createSubTree(Stat.Agility, 7, 8), holyWarSword.createSubTree(Stat.Stamina, 7, 8), 29.1));
    holyWarSword.addToList(holyWarSword.createTree(" of the Tiger", holyWarSword.createSubTree(Stat.Agility, 7, 8), holyWarSword.createSubTree(Stat.Strength, 7, 8), 26.7));
    list.add(holyWarSword);
  }
  
  private static void fillFuriousFalchion() {
    int id = 15215;
    MultiBonus furiousFalchion = new MultiBonus("Furious Falchion", id);
    furiousFalchion.addToList(furiousFalchion.createTree(" of Power", furiousFalchion.createSubTree(Stat.AttackPower, 14, 16), null, 5.8));
    furiousFalchion.addToList(furiousFalchion.createTree(" of Stamina", furiousFalchion.createSubTree(Stat.Stamina, 7, 8), null, 5.7));
    furiousFalchion.addToList(furiousFalchion.createTree(" of Strength", furiousFalchion.createSubTree(Stat.Strength, 7, 8), null, 7.0));
    
    furiousFalchion.addToList(furiousFalchion.createTree(" of the Bear", furiousFalchion.createSubTree(Stat.Stamina, 4, 5), furiousFalchion.createSubTree(Stat.Strength, 4, 5), 28.5));
    furiousFalchion.addToList(furiousFalchion.createTree(" of the Monkey", furiousFalchion.createSubTree(Stat.Agility, 4, 5), furiousFalchion.createSubTree(Stat.Stamina, 4, 5), 25.5));
    furiousFalchion.addToList(furiousFalchion.createTree(" of the Tiger", furiousFalchion.createSubTree(Stat.Agility, 4, 5), furiousFalchion.createSubTree(Stat.Strength, 4, 5), 27.8));
    list.add(furiousFalchion);
  }
  
  private static void fillFighterBroadsword() {
    int id = 15212;
    MultiBonus fighterBroadsword = new MultiBonus("Fighter Broadsword", id);
    fighterBroadsword.addToList(fighterBroadsword.createTree(" of Power", fighterBroadsword.createSubTree(Stat.AttackPower, 8, 8), null, 5.9));
    fighterBroadsword.addToList(fighterBroadsword.createTree(" of Stamina", fighterBroadsword.createSubTree(Stat.Stamina, 4, 4), null, 5.6));
    fighterBroadsword.addToList(fighterBroadsword.createTree(" of Strength", fighterBroadsword.createSubTree(Stat.Strength, 4, 4), null, 6.4));
    
    fighterBroadsword.addToList(fighterBroadsword.createTree(" of the Bear", fighterBroadsword.createSubTree(Stat.Stamina, 2, 3), fighterBroadsword.createSubTree(Stat.Strength, 2, 3), 27.8));
    fighterBroadsword.addToList(fighterBroadsword.createTree(" of the Monkey", fighterBroadsword.createSubTree(Stat.Agility, 2, 3), fighterBroadsword.createSubTree(Stat.Stamina, 2, 3), 26.9));
    fighterBroadsword.addToList(fighterBroadsword.createTree(" of the Tiger", fighterBroadsword.createSubTree(Stat.Agility, 2, 3), fighterBroadsword.createSubTree(Stat.Strength, 2, 3), 27.5));
    list.add(fighterBroadsword);
  }
  
  private static void fillEbonScimitar() {
    int id = 8196;
    MultiBonus ebonScimitar = new MultiBonus("Ebon Scimitar", id);
    ebonScimitar.addToList(ebonScimitar.createTree(" of Power", ebonScimitar.createSubTree(Stat.AttackPower, 14, 16), null, 5.8));
    ebonScimitar.addToList(ebonScimitar.createTree(" of Stamina", ebonScimitar.createSubTree(Stat.Stamina, 7, 8), null, 5.9));
    ebonScimitar.addToList(ebonScimitar.createTree(" of Strength", ebonScimitar.createSubTree(Stat.Strength, 7, 8), null, 7.5));
    
    ebonScimitar.addToList(ebonScimitar.createTree(" of the Bear", ebonScimitar.createSubTree(Stat.Stamina, 4, 5), ebonScimitar.createSubTree(Stat.Strength, 4, 5), 29.1));
    ebonScimitar.addToList(ebonScimitar.createTree(" of the Monkey", ebonScimitar.createSubTree(Stat.Agility, 4, 5), ebonScimitar.createSubTree(Stat.Stamina, 4, 5), 24.7));
    ebonScimitar.addToList(ebonScimitar.createTree(" of the Tiger", ebonScimitar.createSubTree(Stat.Agility, 4, 5), ebonScimitar.createSubTree(Stat.Strength, 4, 5), 26.9));
    list.add(ebonScimitar);
  }
  
  private static void fillDimensionalSword() {
    int id = 15219;
    MultiBonus dimensionalSword = new MultiBonus("Dimensional Sword", id);
    dimensionalSword.addToList(dimensionalSword.createTree(" of Power", dimensionalSword.createSubTree(Stat.AttackPower, 22, 22), null, 6.2));
    dimensionalSword.addToList(dimensionalSword.createTree(" of Stamina", dimensionalSword.createSubTree(Stat.Stamina, 11, 11), null, 5.5));
    dimensionalSword.addToList(dimensionalSword.createTree(" of Strength", dimensionalSword.createSubTree(Stat.Strength, 11, 11), null, 6.4));
    
    dimensionalSword.addToList(dimensionalSword.createTree(" of the Bear", dimensionalSword.createSubTree(Stat.Stamina, 7, 7), dimensionalSword.createSubTree(Stat.Strength, 7, 7), 28.4));
    dimensionalSword.addToList(dimensionalSword.createTree(" of the Monkey", dimensionalSword.createSubTree(Stat.Agility, 7, 7), dimensionalSword.createSubTree(Stat.Stamina, 7, 7), 26.1));
    dimensionalSword.addToList(dimensionalSword.createTree(" of the Tiger", dimensionalSword.createSubTree(Stat.Agility, 7, 7), dimensionalSword.createSubTree(Stat.Strength, 7, 7), 27.4));
    list.add(dimensionalSword);
  }
  
  private static void fillDecapitatingSword() {
    int id = 3740;
    MultiBonus decapitatingSword = new MultiBonus("Decapitating Sword", id);
    decapitatingSword.addToList(decapitatingSword.createTree(" of Power", decapitatingSword.createSubTree(Stat.AttackPower, 6, 6), null, 5.9));
    decapitatingSword.addToList(decapitatingSword.createTree(" of Stamina", decapitatingSword.createSubTree(Stat.Stamina, 3, 3), null, 5.7));
    decapitatingSword.addToList(decapitatingSword.createTree(" of Strength", decapitatingSword.createSubTree(Stat.Strength, 3, 3), null, 6.3));
    
    decapitatingSword.addToList(decapitatingSword.createTree(" of the Bear", decapitatingSword.createSubTree(Stat.Stamina, 1, 2), decapitatingSword.createSubTree(Stat.Strength, 1, 2), 26.5));
    decapitatingSword.addToList(decapitatingSword.createTree(" of the Monkey", decapitatingSword.createSubTree(Stat.Agility, 1, 2), decapitatingSword.createSubTree(Stat.Stamina, 1, 2), 27.9));
    decapitatingSword.addToList(decapitatingSword.createTree(" of the Tiger", decapitatingSword.createSubTree(Stat.Agility, 1, 2), decapitatingSword.createSubTree(Stat.Strength, 1, 2), 27.8));
    list.add(decapitatingSword);
  }
  
  private static void fillCrystalSword() {
    int id = 15218;
    MultiBonus crystalSword = new MultiBonus("Crystal Sword", id);
    crystalSword.addToList(crystalSword.createTree(" of Power", crystalSword.createSubTree(Stat.AttackPower, 20, 20), null, 5.7));
    crystalSword.addToList(crystalSword.createTree(" of Stamina", crystalSword.createSubTree(Stat.Stamina, 10, 10), null, 5.8));
    crystalSword.addToList(crystalSword.createTree(" of Strength", crystalSword.createSubTree(Stat.Strength, 10, 10), null, 6.7));
    
    crystalSword.addToList(crystalSword.createTree(" of the Bear", crystalSword.createSubTree(Stat.Stamina, 6, 7), crystalSword.createSubTree(Stat.Strength, 6, 7), 28.3));
    crystalSword.addToList(crystalSword.createTree(" of the Monkey", crystalSword.createSubTree(Stat.Agility, 6, 7), crystalSword.createSubTree(Stat.Stamina, 6, 7), 26.4));
    crystalSword.addToList(crystalSword.createTree(" of the Tiger", crystalSword.createSubTree(Stat.Agility, 6, 7), crystalSword.createSubTree(Stat.Strength, 6, 7), 27.0));
    list.add(crystalSword);
  }
  
  private static void fillBattlefellSabre() {
    int id = 15220;
    MultiBonus battlefellSabre = new MultiBonus("Battlefell Sabre", id);
    battlefellSabre.addToList(battlefellSabre.createTree(" of Power", battlefellSabre.createSubTree(Stat.AttackPower, 22, 24), null, 5.7));
    battlefellSabre.addToList(battlefellSabre.createTree(" of Stamina", battlefellSabre.createSubTree(Stat.Stamina, 11, 12), null, 5.5));
    battlefellSabre.addToList(battlefellSabre.createTree(" of Strength", battlefellSabre.createSubTree(Stat.Strength, 11, 12), null, 5.7));
    
    battlefellSabre.addToList(battlefellSabre.createTree(" of the Bear", battlefellSabre.createSubTree(Stat.Stamina, 7, 8), battlefellSabre.createSubTree(Stat.Strength, 7, 8), 27.6));
    battlefellSabre.addToList(battlefellSabre.createTree(" of the Monkey", battlefellSabre.createSubTree(Stat.Agility, 7, 8), battlefellSabre.createSubTree(Stat.Stamina, 7, 8), 26.9));
    battlefellSabre.addToList(battlefellSabre.createTree(" of the Tiger", battlefellSabre.createSubTree(Stat.Agility, 7, 8), battlefellSabre.createSubTree(Stat.Strength, 7, 8), 28.7));
    list.add(battlefellSabre);
  }
}
