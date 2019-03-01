package db.random.armor.plate;

import db.stats.Stat;
import java.util.ArrayList;
import util.MultiBonus;

public class Wrist {

  private static int[] ids = {
    /*Done*/
    20687, 11767, 14956, 14910, 10377, 9972, 10282, 14983, 9285, 14974, 10094, 10239, 14938, 14965, 
    /*ToDo*/
    10391, 14914, 14923, 10202, 10127, 14903, 10171, 14941
  };
  
  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  /**
   * Returns a List of all Plate-Wrists with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all Plate-Wrists with
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
    fillAbyssalPlateVambraces();
    fillEmberplateArmguards();
    fillBloodforgedBindings();
    fillBrutishArmguards();
    fillCommandersVambracers();
    fillEmbossedPlateBracers();
    fillEmeraldVambraces();
    fillExaltedArmsplints();
    fillFieldPlateVambraces();
    fillGloriousBindings();
    fillGothicPlateVambraces();
    fillHeavyLamellarVambraces();
    fillHeroicBracers();
    fillHighChiefsBindings();
    fillHyperionVambraces();
    System.out.println(list.get(list.size() - 1));
    System.out.println("Plate Wrists: " + list.size() + "/" + ids.length);
  }
    
  private static void fillHyperionVambraces() {
    int id = 10391;
    MultiBonus hyperionVambraces = new MultiBonus("Hyperion Vambraces", id);
    //TODO
    list.add(hyperionVambraces);
  }

  private static void fillHighChiefsBindings() {
    int id = 14965;
    MultiBonus highChiefsBindings = new MultiBonus("High Chief's Bindings", id);
    highChiefsBindings.createHealingTree(14, 14, 0.6);
    highChiefsBindings.createPowerTree(24, 24, 8.4);
    highChiefsBindings.createStaminaTree(12, 12, 9.6);
    highChiefsBindings.createStrengthTree(12, 12, 9.6);
    
    highChiefsBindings.createBearTree(7, 8, 41.3);
    highChiefsBindings.createBoarTree(7, 8, 7.5);
    highChiefsBindings.createEagleTree(7, 8, 3.4);
    highChiefsBindings.createGorillaTree(7, 8, 4.7);
    highChiefsBindings.createMonkeyTree(7, 8, 3.8);
    highChiefsBindings.createTigerTree(7, 8, 3.5);
    highChiefsBindings.createWhaleTree(7, 8, 7.6);
    list.add(highChiefsBindings);
  }

  private static void fillHeroicBracers() {
    int id = 14938;
    MultiBonus heroicBracers = new MultiBonus("Heroic Bracers", id);
    heroicBracers.createArcaneResistanceTree(13, 14, 0.3);
    heroicBracers.createFireResistanceTree(13, 14, 0.3);
    heroicBracers.createFrostResistanceTree(14, 14, 0.3);
    heroicBracers.createHealingTree(15, 16, 0.6);
    heroicBracers.createNatureResistanceTree(14, 14, 0.2);
    heroicBracers.createPowerTree(26, 28, 11.6);
    heroicBracers.createShadowResistanceTree(13, 14, 0.3);
    heroicBracers.createStaminaTree(13, 14, 8.5);
    heroicBracers.createStrengthTree(13, 14, 8.1);
    
    heroicBracers.createBearTree(8, 9, 44.1);
    heroicBracers.createBoarTree(8, 9, 6.2);
    heroicBracers.createEagleTree(8, 9, 3.4);
    heroicBracers.createGorillaTree(8, 9, 3.4);
    heroicBracers.createMonkeyTree(8, 9, 3.7);
    heroicBracers.createTigerTree(8, 9, 3.0);
    heroicBracers.createWhaleTree(8, 9, 5.7);
    list.add(heroicBracers);
  }

  private static void fillHeavyLamellarVambraces() {
    int id = 10239;
    MultiBonus heavyLamellarVambraces = new MultiBonus("Heavy Lamellar Vambraces", id);
    heavyLamellarVambraces.createHealingTree(14, 14, 0.4);
    heavyLamellarVambraces.createPowerTree(24, 24, 8.1);
    heavyLamellarVambraces.createStaminaTree(12, 12, 9.2);
    heavyLamellarVambraces.createStrengthTree(12, 12, 10.0);
    
    heavyLamellarVambraces.createBearTree(7, 8, 42.3);
    heavyLamellarVambraces.createBoarTree(7, 8, 7.6);
    heavyLamellarVambraces.createEagleTree(7, 8, 3.6);
    heavyLamellarVambraces.createGorillaTree(7, 8, 4.3);
    heavyLamellarVambraces.createMonkeyTree(7, 8, 3.7);
    heavyLamellarVambraces.createTigerTree(7, 8, 3.5);
    heavyLamellarVambraces.createWhaleTree(7, 8, 7.2);
    list.add(heavyLamellarVambraces);
  }

  private static void fillGothicPlateVambraces() {
    int id = 10094;
    MultiBonus gothicPlateVambraces = new MultiBonus("Gothic Plate Vambraces", id);
    gothicPlateVambraces.createHealingTree(12, 12, 0.4);
    gothicPlateVambraces.createPowerTree(20, 20, 6.0);
    gothicPlateVambraces.createStaminaTree(10, 10, 6.2);
    gothicPlateVambraces.createStrengthTree(10, 10, 6.5);
    
    gothicPlateVambraces.createBearTree(6, 7, 59.9);
    gothicPlateVambraces.createBoarTree(6, 7, 5.4);
    gothicPlateVambraces.createEagleTree(6, 7, 2.9);
    gothicPlateVambraces.createGorillaTree(6, 7, 3.0);
    gothicPlateVambraces.createMonkeyTree(6, 7, 2.4);
    gothicPlateVambraces.createTigerTree(6, 7, 2.3);
    gothicPlateVambraces.createWhaleTree(6, 7, 5.2);
    list.add(gothicPlateVambraces);
  }

  private static void fillGloriousBindings() {
    int id = 14974;
    MultiBonus gloriousBindings = new MultiBonus("Glorious Bindings",id);
    gloriousBindings.createArcaneResistanceTree(13, 14, 0.3);
    gloriousBindings.createFireResistanceTree(13, 14, 0.5);
    gloriousBindings.createFrostResistanceTree(13, 14, 0.4);
    gloriousBindings.createHealingTree(15, 16, 0.5);
    gloriousBindings.createNatureResistanceTree(13, 14, 0.4);
    gloriousBindings.createPowerTree(26, 28, 12.8);
    gloriousBindings.createShadowResistanceTree(14, 14, 0.1);
    gloriousBindings.createStaminaTree(13, 14, 8.6);
    gloriousBindings.createStrengthTree(13, 14, 8.5);
    
    gloriousBindings.createBearTree(8, 9, 40.4);
    gloriousBindings.createBoarTree(8, 9, 7.0);
    gloriousBindings.createEagleTree(8, 9, 3.1);
    gloriousBindings.createGorillaTree(8, 9, 3.6);
    gloriousBindings.createMonkeyTree(8, 9, 3.5);
    gloriousBindings.createTigerTree(8, 9, 3.2);
    gloriousBindings.createWhaleTree(8, 9, 6.8);
    list.add(gloriousBindings);
  }

  private static void fillFieldPlateVambraces() {
    int id = 9285;
    MultiBonus fieldPlateVambraces = new MultiBonus("Field Plate Vambraces", id);
    fieldPlateVambraces.createHealingTree(11, 12, 0.3);
    fieldPlateVambraces.createPowerTree(18, 20, 4.8);
    fieldPlateVambraces.createStaminaTree(9, 10, 5.1);
    fieldPlateVambraces.createStrengthTree(9, 10, 5.3);
    
    fieldPlateVambraces.createBearTree(6, 6, 67.1);
    fieldPlateVambraces.createBoarTree(6, 6, 4.1);
    fieldPlateVambraces.createEagleTree(6, 6, 2.3);
    fieldPlateVambraces.createGorillaTree(6, 6, 2.7);
    fieldPlateVambraces.createMonkeyTree(6, 6, 2.1);
    fieldPlateVambraces.createTigerTree(6, 6, 2.1);
    fieldPlateVambraces.createWhaleTree(6, 6, 4.4);
    list.add(fieldPlateVambraces);
  }

  private static void fillExaltedArmsplints() {
    int id = 14983;
    MultiBonus exaltedArmsplints = new MultiBonus("Exalted Armsplints", id);
    exaltedArmsplints.createArcaneResistanceTree(15, 15, 0.2);
    exaltedArmsplints.createFireResistanceTree(14, 14, 0.8);
    exaltedArmsplints.createFrostResistanceTree(14, 14, 0.5);
    exaltedArmsplints.createHealingTree(16, 18, 0.6);
    exaltedArmsplints.createNatureResistanceTree(14, 14, 0.3);
    exaltedArmsplints.createPowerTree(28, 30, 12.7);
    exaltedArmsplints.createShadowResistanceTree(14, 14, 0.3);
    exaltedArmsplints.createStaminaTree(14, 15, 7.3);
    exaltedArmsplints.createStrengthTree(14, 15, 7.3);
    
    exaltedArmsplints.createBearTree(9, 10, 43.4);
    exaltedArmsplints.createBoarTree(9, 10, 6.3);
    exaltedArmsplints.createEagleTree(9, 10, 4.0);
    exaltedArmsplints.createGorillaTree(9, 10, 4.1);
    exaltedArmsplints.createMonkeyTree(9, 10, 3.2);
    exaltedArmsplints.createTigerTree(9, 10, 3.4);
    exaltedArmsplints.createWhaleTree(9, 10, 5.5);
    list.add(exaltedArmsplints);
  }

  private static void fillEmeraldVambraces() {
    int id = 10282;
    MultiBonus emeraldVambraces = new MultiBonus("Emerald Vambraces", id);
    emeraldVambraces.createArcaneResistanceTree(13, 14, 0.5);
    emeraldVambraces.createFireResistanceTree(13, 14, 0.4);
    emeraldVambraces.createFrostResistanceTree(13, 14, 0.3);
    emeraldVambraces.createHealingTree(15, 16, 0.6);
    emeraldVambraces.createNatureResistanceTree(13, 14, 0.4);
    emeraldVambraces.createPowerTree(26, 28, 12.0);
    emeraldVambraces.createShadowResistanceTree(13, 14, 0.4);
    emeraldVambraces.createStaminaTree(13, 14, 7.4);
    emeraldVambraces.createStrengthTree(13, 14, 8.3);
    
    emeraldVambraces.createBearTree(8, 9, 44.7);
    emeraldVambraces.createBoarTree(8, 9, 5.4);
    emeraldVambraces.createEagleTree(8, 9, 3.6);
    emeraldVambraces.createGorillaTree(8, 9, 3.9);
    emeraldVambraces.createMonkeyTree(8, 9, 3.7);
    emeraldVambraces.createTigerTree(8, 9, 3.4);
    emeraldVambraces.createWhaleTree(8, 9, 5.3);
    list.add(emeraldVambraces);
  }

  private static void fillEmbossedPlateBracers() {
    int id = 9972;
    MultiBonus embossedPlateBracers = new MultiBonus("Embossed Plate Bracers", id);
    embossedPlateBracers.createHealingTree(11, 12, 0.3);
    embossedPlateBracers.createPowerTree(18, 20, 5.0);
    embossedPlateBracers.createStaminaTree(9, 10, 5.3);
    embossedPlateBracers.createStrengthTree(9, 10, 6.0);
    
    embossedPlateBracers.createBearTree(6, 6, 65.3);
    embossedPlateBracers.createBoarTree(6, 6, 4.5);
    embossedPlateBracers.createEagleTree(6, 6, 2.3);
    embossedPlateBracers.createGorillaTree(6, 6, 2.7);
    embossedPlateBracers.createMonkeyTree(6, 6, 2.1);
    embossedPlateBracers.createTigerTree(6, 6, 2.1);
    embossedPlateBracers.createWhaleTree(6, 6, 4.4);
    list.add(embossedPlateBracers);
  }

  private static void fillCommandersVambracers() {
    int id = 10377;
    MultiBonus commandersVambraces = new MultiBonus("Commander's Vambraces", id);
    commandersVambraces.createArcaneResistanceTree(14, 15, 0.3);
    commandersVambraces.createFireResistanceTree(14, 15, 0.5);
    commandersVambraces.createFrostResistanceTree(14, 15, 0.4);
    commandersVambraces.createHealingTree(16, 18, 0.7);
    commandersVambraces.createNatureResistanceTree(14, 15, 0.4);
    commandersVambraces.createPowerTree(28, 30, 12.4);
    commandersVambraces.createShadowResistanceTree(14, 15, 0.3);
    commandersVambraces.createStaminaTree(14, 15, 7.9);
    commandersVambraces.createStrengthTree(14, 15, 8.7);
    
    commandersVambraces.createBearTree(9, 10, 41.8);
    commandersVambraces.createBoarTree(9, 10, 5.6);
    commandersVambraces.createEagleTree(9, 10, 3.8);
    commandersVambraces.createGorillaTree(9, 10, 3.9);
    commandersVambraces.createMonkeyTree(9, 10, 3.7);
    commandersVambraces.createTigerTree(9, 10, 4.0);
    commandersVambraces.createWhaleTree(9, 10, 5.7);
    list.add(commandersVambraces);
  }

  private static void fillBrutishArmguards() {
    int id = 14910;
    MultiBonus brutishArmguards = new MultiBonus("Brutish Armguards", id);
    brutishArmguards.createHealingTree(12, 12, 0.3);
    brutishArmguards.createPowerTree(20, 20, 5.7);
    brutishArmguards.createStaminaTree(10, 10, 5.9);
    brutishArmguards.createStrengthTree(10, 10, 6.3);
    
    brutishArmguards.createBearTree(6, 7, 60.9);
    brutishArmguards.createBoarTree(6, 7, 5.4);
    brutishArmguards.createEagleTree(6, 7, 2.7);
    brutishArmguards.createGorillaTree(6, 7, 3.1);
    brutishArmguards.createMonkeyTree(6, 7, 2.1);
    brutishArmguards.createTigerTree(6, 7, 2.4);
    brutishArmguards.createWhaleTree(6, 7, 5.1);
    list.add(brutishArmguards);
  }

  private static void fillBloodforgedBindings() {
    int id = 14956;
    MultiBonus bloodforgedBindings = new MultiBonus("Bloodforged Bindings", id);
    bloodforgedBindings.createHealingTree(12, 12, 0.4);
    bloodforgedBindings.createPowerTree(20, 20, 6.2);
    bloodforgedBindings.createStaminaTree(10, 10, 6.4);
    bloodforgedBindings.createStrengthTree(10, 10, 6.9);
    
    bloodforgedBindings.createBearTree(6, 7, 56.6);
    bloodforgedBindings.createBoarTree(6, 7, 5.8);
    bloodforgedBindings.createEagleTree(6, 7, 2.9);
    bloodforgedBindings.createGorillaTree(6, 7, 3.2);
    bloodforgedBindings.createMonkeyTree(6, 7, 2.8);
    bloodforgedBindings.createTigerTree(6, 7, 2.6);
    bloodforgedBindings.createWhaleTree(6, 7, 6.0);
    list.add(bloodforgedBindings);
  }

  private static void fillEmberplateArmguards() { //Adds +10 Fire Resist on Default
    int id = 11767;
    MultiBonus emberplateArmguards = new MultiBonus("Emberplate Armguards", id);
    emberplateArmguards.addDefaultBonus(Stat.FireResist, 10);
    emberplateArmguards.createArcaneResistanceTree(15, 15, 0.6);
    emberplateArmguards.createHealingTree(18, 18, 0.7);
    emberplateArmguards.createPowerTree(30, 30, 13.1);
    emberplateArmguards.createStaminaTree(15, 15, 8.3);
    emberplateArmguards.createStrengthTree(15, 15, 8.7);
    
    emberplateArmguards.createBearTree(9, 10, 40.7);
    emberplateArmguards.createBoarTree(9, 10, 6.6);
    emberplateArmguards.createEagleTree(9, 10, 3.9);
    emberplateArmguards.createGorillaTree(9, 10, 3.9);
    emberplateArmguards.createMonkeyTree(9, 10, 3.4);
    emberplateArmguards.createTigerTree(9, 10, 4.0);
    emberplateArmguards.createWhaleTree(9, 10, 6.1);
    list.add(emberplateArmguards);
  }

  private static void fillAbyssalPlateVambraces() {
    int id = 20687;
    MultiBonus abyssalPlateVambraces = new MultiBonus("Abyssal Plate Vambraces", id);
    abyssalPlateVambraces.createStrikingTree(11, 11, 12, 100.0);
    list.add(abyssalPlateVambraces);
  }

  public static void main(String[] args) {
    fill();
  }
}
