package db.random.weapons.ranged;

import java.util.ArrayList;

import util.MultiBonus;

public class Wands {
  
  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    15282, 5215, 15281, 15279, 15283, 5216, 15280
  };
  
  /**
   * Returns a List of all Wands with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all Wands with 
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
    fillDragonFinger();
    fillEmberWand();
    fillGlowstarRod();
    fillIvoryWand();
    fillLunarWand();
    fillUmbralWand();
    fillWizardsHand(); /*
    System.out.println(list.get(0));
    System.out.println("-------------");
    System.out.println(list.get(1));
    System.out.println("-------------");
    System.out.println(list.get(2));
    System.out.println("-------------");
    System.out.println(list.get(3));
    System.out.println("-------------");
    System.out.println(list.get(4));
    System.out.println("-------------");
    System.out.println(list.get(5));
    System.out.println("-------------");
    System.out.println(list.get(6));
    System.out.println("-------------"); */
  }
  
  private static void fillWizardsHand() {
    int id = 15280;
    MultiBonus wizardsHand = new MultiBonus("Wizard's Hand", id);
    wizardsHand.createArcaneWrathTree(10, 10, 3.6);
    wizardsHand.createFieryWrathTree(10, 10, 3.9);
    wizardsHand.createFrozenWrathTree(10, 10, 3.1);
    wizardsHand.createHealingTree(8, 15, 4.3);
    wizardsHand.createIntellectTree(7, 7, 3.9);
    wizardsHand.createShadowWrathTree(10, 10, 1.4);
    wizardsHand.createSpiritTree(7, 7, 5.6);
    wizardsHand.createStaminaTree(7, 7, 4.5);
    
    wizardsHand.createBoarTree(4, 5, 12.4);
    wizardsHand.createEagleTree(4, 5, 6.3);
    wizardsHand.createFalconTree(4, 5, 10.6);
    wizardsHand.createGorillaTree(4, 5, 10.8);
    wizardsHand.createOwlTree(4, 5, 7.9);
    wizardsHand.createWhaleTree(4, 5, 9.2);
    wizardsHand.createWolfTree(4, 5, 12.5);
    list.add(wizardsHand);
  }

  private static void fillUmbralWand() {
    int id = 5216;
    MultiBonus umbralWand = new MultiBonus("Umbral Wand", id);
    umbralWand.createArcaneWrathTree(9, 9, 4.1);
    umbralWand.createFieryWrathTree(9, 9, 4.3);
    umbralWand.createFrozenWrathTree(9, 14, 3.4);
    umbralWand.createHealingTree(7, 7, 3.9);
    umbralWand.createIntellectTree(6, 6, 3.6);
    umbralWand.createShadowWrathTree(9, 9, 1.3);
    umbralWand.createSpiritTree(6, 6, 5.3);
    umbralWand.createStaminaTree(6, 6, 4.4);
    
    umbralWand.createBoarTree(3, 4, 13.5);
    umbralWand.createEagleTree(3, 4, 6.0);
    umbralWand.createFalconTree(3, 4, 10.3);
    umbralWand.createGorillaTree(3, 4, 10.6);
    umbralWand.createOwlTree(3, 4, 7.4);
    umbralWand.createWhaleTree(3, 4, 9.0);
    umbralWand.createWolfTree(3, 4, 13.0);
    list.add(umbralWand);
  }

  private static void fillLunarWand() {
    int id = 15283;
    MultiBonus lunarWand = new MultiBonus("Lunar Wand", id);
    lunarWand.createArcaneWrathTree(13, 13, 3.0);
    lunarWand.createFieryWrathTree(13, 13, 4.4);
    lunarWand.createFrozenWrathTree(13, 13, 3.3);
    lunarWand.createHealingTree(11, 11, 5.2);
    lunarWand.createIntellectTree(9, 9, 5.3);
    lunarWand.createShadowWrathTree(13, 13, 3.2);
    lunarWand.createSpiritTree(9, 9, 4.5);
    lunarWand.createStaminaTree(9, 9, 6.1);
    
    lunarWand.createBoarTree(5, 6, 9.1);
    lunarWand.createEagleTree(5, 6, 10.8);
    lunarWand.createFalconTree(5, 6, 9.0);
    lunarWand.createGorillaTree(5, 6, 8.9);
    lunarWand.createOwlTree(5, 6, 9.0);
    lunarWand.createWhaleTree(5, 6, 9.3);
    lunarWand.createWolfTree(5, 6, 9.0);
    list.add(lunarWand);
  }

  private static void fillIvoryWand() {
    int id = 15279;
    MultiBonus ivoryWand = new MultiBonus("Ivory Wand", id);
    ivoryWand.createArcaneWrathTree(9, 10, 3.6);
    ivoryWand.createFieryWrathTree(9, 10, 4.2);
    ivoryWand.createFrozenWrathTree(9, 10, 2.9);
    ivoryWand.createHealingTree(7, 14, 4.3);
    ivoryWand.createIntellectTree(6, 7, 4.0);
    ivoryWand.createShadowWrathTree(9, 10, 1.5);
    ivoryWand.createSpiritTree(6, 7, 5.3);
    ivoryWand.createStaminaTree(6, 7, 4.6);
    
    ivoryWand.createBoarTree(4, 5, 12.3);
    ivoryWand.createEagleTree(4, 5, 6.3);
    ivoryWand.createFalconTree(4, 5, 10.5);
    ivoryWand.createGorillaTree(4, 5, 11.2);
    ivoryWand.createOwlTree(4, 5, 7.8);
    ivoryWand.createWhaleTree(4, 5, 9.4);
    ivoryWand.createWolfTree(4, 5, 12.1);
    list.add(ivoryWand);
  }

  private static void fillGlowstarRod() {
    int id = 15281;
    MultiBonus glowstarRod = new MultiBonus("Glowstar Rod", id);
    glowstarRod.createArcaneWrathTree(10, 11, 3.2);
    glowstarRod.createFieryWrathTree(10, 20, 4.3);
    glowstarRod.createFrozenWrathTree(10, 11, 2.9);
    glowstarRod.createHealingTree(8, 16, 5.2);
    glowstarRod.createIntellectTree(7, 8, 5.2);
    glowstarRod.createShadowWrathTree(10, 11, 2.2);
    glowstarRod.createSpiritTree(7, 8, 5.0);
    glowstarRod.createStaminaTree(7, 8, 5.0);
    
    glowstarRod.createBoarTree(4, 5, 10.3);
    glowstarRod.createEagleTree(4, 5, 8.3);
    glowstarRod.createFalconTree(4, 5, 9.9);
    glowstarRod.createGorillaTree(4, 5, 10.3);
    glowstarRod.createOwlTree(4, 5, 9.0);
    glowstarRod.createWhaleTree(4, 5, 9.4);
    glowstarRod.createWolfTree(4, 5, 10.1);
    list.add(glowstarRod);
  }

  private static void fillEmberWand() {
    int id = 5215;
    MultiBonus emberWand = new MultiBonus("Ember Wand", id);
    emberWand.createArcaneWrathTree(7, 7, 3.9);
    emberWand.createFieryWrathTree(7, 7, 4.1);
    emberWand.createFrozenWrathTree(7, 7, 3.3);
    emberWand.createHealingTree(6, 6, 4.2);
    emberWand.createIntellectTree(5, 5, 3.8);
    emberWand.createShadowWrathTree(7, 7, 1.3);
    emberWand.createSpiritTree(5, 5, 5.7);
    emberWand.createStaminaTree(5, 5, 4.4);
    
    emberWand.createBoarTree(3, 4, 13.0);
    emberWand.createEagleTree(3, 4, 6.2);
    emberWand.createFalconTree(3, 4, 10.1);
    emberWand.createGorillaTree(3, 4, 10.7);
    emberWand.createOwlTree(3, 4, 7.3);
    emberWand.createWhaleTree(3, 4, 8.8);
    emberWand.createWolfTree(3, 4, 13.1);
    list.add(emberWand);
  }

  private static void fillDragonFinger() {
    int id = 15282;
    MultiBonus dragonFinger = new MultiBonus("Dragon Finger", id);
    dragonFinger.createArcaneWrathTree(11, 11, 3.0);
    dragonFinger.createFieryWrathTree(11, 21, 4.0);
    dragonFinger.createFrozenWrathTree(11, 11, 3.2);
    dragonFinger.createHealingTree(9, 9, 5.4);
    dragonFinger.createIntellectTree(8, 8, 5.0);
    dragonFinger.createShadowWrathTree(11, 11, 2.1);
    dragonFinger.createSpiritTree(8, 8, 5.2);
    dragonFinger.createStaminaTree(8, 8, 5.1);
    
    dragonFinger.createBoarTree(5, 5, 9.4);
    dragonFinger.createEagleTree(5, 5, 9.4);
    dragonFinger.createFalconTree(5, 5, 9.7);
    dragonFinger.createGorillaTree(5, 5, 9.5);
    dragonFinger.createOwlTree(5, 5, 9.5);
    dragonFinger.createWhaleTree(5, 5, 9.8);
    dragonFinger.createWolfTree(5, 5, 9.5);
    list.add(dragonFinger);
  }
}
