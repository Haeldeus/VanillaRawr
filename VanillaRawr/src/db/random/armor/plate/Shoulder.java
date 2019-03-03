package db.random.armor.plate;

import java.util.ArrayList;

import db.stats.Stat;
import util.MultiBonus;

public class Shoulder {
  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    /*Done*/20683, 14955, 14909, 10383, 9971, 
    /*ToDo*/10281, 14981, 9292, 14971, 10092, 10245, 14937, 14963, 
    10390, 14921, 14929, 10209, 10134, 14901, 10170, 14946
  };
  
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
    fillAbyssalPlateEpaulets();
    fillBloodforgedShoulderPads();
    fillBrutishShoulders();
    fillCommandersPauldrons();
    fillEmbossedPlatePauldrons();
    //System.out.println(list.get(list.size() - 1)); //Still need this, when adding new Items
    System.out.println("Plate Shoulders: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
    
  private static void fillEmbossedPlatePauldrons() {
    int id = 9971;
    MultiBonus embossedPlatePauldrons = new MultiBonus("Embossed Plate Pauldrons", id);
    embossedPlatePauldrons.createDefenseTree(13, 14, 5.9);
    embossedPlatePauldrons.createStaminaTree(13, 14, 7.0);
    
    embossedPlatePauldrons.createBearTree(8, 9, 57.5);
    embossedPlatePauldrons.createBoarTree(8, 9, 9.2);
    embossedPlatePauldrons.createEagleTree(8, 9, 2.7);
    embossedPlatePauldrons.createGorillaTree(8, 9, 5.1);
    embossedPlatePauldrons.createMonkeyTree(8, 9, 2.7);
    embossedPlatePauldrons.createTigerTree(8, 9, 3.9);
    embossedPlatePauldrons.createWhaleTree(8, 9, 5.9);
    list.add(embossedPlatePauldrons);
  }

  private static void fillCommandersPauldrons() {
    int id = 10383;
    MultiBonus commandersPauldrons = new MultiBonus("Commander's Pauldrons", id);
    commandersPauldrons.createDefenseTree(20, 21, 17.1);
    commandersPauldrons.createFireResistanceTree(20, 20, 0.1);
    commandersPauldrons.createFrostResistanceTree(20, 21, 0.3);
    commandersPauldrons.createNatureResistanceTree(20, 20, 0.2);
    commandersPauldrons.createShadowResistanceTree(20, 21, 0.3);
    commandersPauldrons.createStaminaTree(20, 21, 8.4);
    
    commandersPauldrons.createBearTree(13, 14, 36.8);
    commandersPauldrons.createBoarTree(13, 14, 10.7);
    commandersPauldrons.createEagleTree(13, 14, 4.1);
    commandersPauldrons.createGorillaTree(13, 14, 7.0);
    commandersPauldrons.createMonkeyTree(13, 14, 3.4);
    commandersPauldrons.createTigerTree(13, 14, 5.4);
    commandersPauldrons.createWhaleTree(13, 14, 5.9);
    list.add(commandersPauldrons);
  }

  private static void fillBrutishShoulders() {
    int id = 14909;
    MultiBonus brutishShoulders = new MultiBonus("Brutish Shoulders", id);
    brutishShoulders.createDefenseTree(13, 14, 5.6);
    brutishShoulders.createStaminaTree(13, 14, 6.2);
    
    brutishShoulders.createBearTree(8, 9, 59.3);
    brutishShoulders.createBoarTree(8, 9, 9.2);
    brutishShoulders.createEagleTree(8, 9, 3.0);
    brutishShoulders.createGorillaTree(8, 9, 5.3);
    brutishShoulders.createMonkeyTree(8, 9, 2.5);
    brutishShoulders.createTigerTree(8, 9, 3.5);
    brutishShoulders.createWhaleTree(8, 9, 5.4);
    list.add(brutishShoulders);
  }

  private static void fillBloodforgedShoulderPads() {
    int id = 14955;
    MultiBonus bloodforgedShoulderPads = new MultiBonus("Bloodforged Shoulder Pads", id);
    bloodforgedShoulderPads.createDefenseTree(14, 15, 8.1);
    bloodforgedShoulderPads.createStaminaTree(14, 15, 9.1);
    
    bloodforgedShoulderPads.createBearTree(9, 10, 41.3);
    bloodforgedShoulderPads.createBoarTree(9, 10, 13.6);
    bloodforgedShoulderPads.createEagleTree(9, 10, 3.6);
    bloodforgedShoulderPads.createGorillaTree(9, 10, 7.5);
    bloodforgedShoulderPads.createMonkeyTree(9, 10, 3.5);
    bloodforgedShoulderPads.createTigerTree(9, 10, 5.4);
    bloodforgedShoulderPads.createWhaleTree(9, 10, 7.8);
    list.add(bloodforgedShoulderPads);
  }

  private static void fillAbyssalPlateEpaulets() { //Adds 1% Hit per Default
    int id = 20683;
    MultiBonus abyssalPlateEpaulets = new MultiBonus("Abyssal Plate Epaulets", id);
    abyssalPlateEpaulets.addDefaultBonus(Stat.HitChance, 1);
    abyssalPlateEpaulets.createRestorationTree(13, 15, 5, 19.1);
    abyssalPlateEpaulets.createStrikingTree(13, 13, 13, 80.9);
    list.add(abyssalPlateEpaulets);
  }

  public static void main(String[] args) {
    fill();
  }
}
