package db.random.weapons.ranged;

import java.util.ArrayList;

import util.MultiBonus;

public class Guns {
  
  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    15324, 15323, 4089, 15325, 3430
  };
  
  /**
   * Returns a List of all Guns with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all Guns with 
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
    fillBurnsideRifle();
    fillPercussionShotgun();
    fillRicochetBlunderbuss();
    fillSharpshooterHarquebus();
    fillSniperRifle(); /*
    System.out.println(list.get(0));
    System.out.println("-------------");
    System.out.println(list.get(1));
    System.out.println("-------------");
    System.out.println(list.get(2));
    System.out.println("-------------");
    System.out.println(list.get(3));
    System.out.println("-------------");
    System.out.println(list.get(4));
    System.out.println("-------------"); */
  }

  private static void fillSniperRifle() {
    int id = 3430;
    MultiBonus sniperRifle = new MultiBonus("Sniper Rifle", id);
    sniperRifle.createAgilityTree(6, 6, 5.1);
    sniperRifle.createMarksmanshipTree(14, 14, 2.8);
    sniperRifle.createSpiritTree(6, 6, 6.8);
    sniperRifle.createStaminaTree(6, 6, 5.3);
    
    sniperRifle.createEagleTree(3, 4, 13.2);
    sniperRifle.createFalconTree(3, 4, 12.0);
    sniperRifle.createMonkeyTree(3, 4, 8.8);
    sniperRifle.createOwlTree(3, 4, 13.4);
    sniperRifle.createTigerTree(3, 4, 9.1);
    sniperRifle.createWhaleTree(3, 4, 12.0);
    sniperRifle.createWolfTree(3, 4, 11.6);
    list.add(sniperRifle);
  }

  private static void fillSharpshooterHarquebus() {
    int id = 15325;
    MultiBonus sharpshooterHarquebus = new MultiBonus("Sharpshooter Harquebus", id);
    sharpshooterHarquebus.createAgilityTree(8, 8, 6.4);
    sharpshooterHarquebus.createMarksmanshipTree(19, 19, 3.1);
    sharpshooterHarquebus.createSpiritTree(8, 8, 5.4);
    sharpshooterHarquebus.createStaminaTree(8, 8, 6.1);
    
    sharpshooterHarquebus.createEagleTree(5, 5, 11.7);
    sharpshooterHarquebus.createFalconTree(5, 5, 11.8);
    sharpshooterHarquebus.createMonkeyTree(5, 5, 11.6);
    sharpshooterHarquebus.createOwlTree(5, 5, 11.0);
    sharpshooterHarquebus.createTigerTree(5, 5, 11.6);
    sharpshooterHarquebus.createWhaleTree(5, 5, 10.4);
    sharpshooterHarquebus.createWolfTree(5, 5, 10.8);
    list.add(sharpshooterHarquebus);
  }

  private static void fillRicochetBlunderbuss() {
    int id = 4089;
    MultiBonus ricochetBlunderbuss = new MultiBonus("Ricochet Blunderbuss", id);
    ricochetBlunderbuss.createAgilityTree(6, 6, 6.0);
    ricochetBlunderbuss.createMarksmanshipTree(14, 14, 3.1);
    ricochetBlunderbuss.createSpiritTree(6, 6, 5.8);
    ricochetBlunderbuss.createStaminaTree(6, 6, 6.0);
    
    ricochetBlunderbuss.createEagleTree(4, 4, 12.1);
    ricochetBlunderbuss.createFalconTree(4, 4, 11.7);
    ricochetBlunderbuss.createMonkeyTree(4, 4, 10.2);
    ricochetBlunderbuss.createOwlTree(4, 4, 11.9);
    ricochetBlunderbuss.createTigerTree(4, 4, 10.4);
    ricochetBlunderbuss.createWhaleTree(4, 4, 11.4);
    ricochetBlunderbuss.createWolfTree(4, 4, 11.4);
    list.add(ricochetBlunderbuss);
  }

  private static void fillPercussionShotgun() {
    int id = 15323;
    MultiBonus percussionShotgun = new MultiBonus("Percussion Shotgun", id);
    percussionShotgun.createAgilityTree(6, 7, 5.8);
    percussionShotgun.createMarksmanshipTree(14, 17, 2.9);
    percussionShotgun.createSpiritTree(6, 7, 6.3);
    percussionShotgun.createStaminaTree(6, 7, 5.7);
    
    percussionShotgun.createEagleTree(4, 5, 12.6);
    percussionShotgun.createFalconTree(4, 5, 11.6);
    percussionShotgun.createMonkeyTree(4, 5, 9.7);
    percussionShotgun.createOwlTree(4, 5, 12.4);
    percussionShotgun.createTigerTree(4, 5, 10.0);
    percussionShotgun.createWhaleTree(4, 5, 11.7);
    percussionShotgun.createWolfTree(4, 5, 11.5);
    list.add(percussionShotgun);
  }

  private static void fillBurnsideRifle() {
    int id = 15324;
    MultiBonus burnsideRifle = new MultiBonus("Burnside Rifle", id);
    burnsideRifle.createAgilityTree(7, 8, 6.4);
    burnsideRifle.createMarksmanshipTree(17, 19, 3.1);
    burnsideRifle.createSpiritTree(7, 8, 5.5);
    burnsideRifle.createStaminaTree(7, 8, 6.0);
    
    burnsideRifle.createEagleTree(4, 5, 11.9);
    burnsideRifle.createFalconTree(4, 5, 11.5);
    burnsideRifle.createMonkeyTree(4, 5, 11.3);
    burnsideRifle.createOwlTree(4, 5, 11.0);
    burnsideRifle.createTigerTree(4, 5, 11.2);
    burnsideRifle.createWhaleTree(4, 5, 10.8);
    burnsideRifle.createWolfTree(4, 5, 11.2);
    list.add(burnsideRifle);
  }
}
