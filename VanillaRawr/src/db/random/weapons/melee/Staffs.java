package db.random.weapons.melee;

import java.util.ArrayList;

import util.MultiBonus;

public class Staffs {
  
  private static ArrayList<MultiBonus> list;

  private static int[] ids = {
    3185, 15274, 2072, 2077, 15276, 4575, 866, 15278, 1613, 4566, 15275
  };
  
  /**
   * Returns a List of all Staffs with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all Staffs with 
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
    fillAcrobaticStaff();
    fillDivinerLongStaff();
    fillDwarvenMagestaff();
    fillMagicianStaff();
    fillMagusLongStaff();
    fillMedicineStaff();
    fillMonksStaff();
    fillSolsticeStaff();
    fillSpiritchaserStaff();
    fillSturdyQuarterstaff();
    fillThaumaturgistStaff();
  }
  
  private static void fillThaumaturgistStaff() {
    int id = 15275;
    MultiBonus thaumaturgistStaff = new MultiBonus("Thaumaturgist Staff", id);
    thaumaturgistStaff.createArcaneWrathTree(19, 33, 5.7);
    thaumaturgistStaff.createFieryWrathTree(19, 33, 3.3);
    thaumaturgistStaff.createFrozenWrathTree(31, 33, 2.1);
    thaumaturgistStaff.createHealingTree(26, 27, 5.3);
    thaumaturgistStaff.createIntellectTree(22, 23, 3.4);
    thaumaturgistStaff.createNaturesWrathTree(31, 33, 5.1);
    thaumaturgistStaff.createPowerTree(26, 46, 2.1);
    thaumaturgistStaff.createShadowWrathTree(31, 33, 1.5);
    thaumaturgistStaff.createSpiritTree(22, 23, 5.6);
    thaumaturgistStaff.createStaminaTree(22, 23, 4.4);
    
    thaumaturgistStaff.createBearTree(14, 15, 9.0);
    thaumaturgistStaff.createBoarTree(14, 15, 11.3);
    thaumaturgistStaff.createEagleTree(14, 15, 5.0);
    thaumaturgistStaff.createMonkeyTree(14, 15, 8.2);
    thaumaturgistStaff.createOwlTree(14, 15, 7.8);
    thaumaturgistStaff.createWhaleTree(14, 15, 9.4);
    thaumaturgistStaff.createWolfTree(14, 15, 11.0);
    list.add(thaumaturgistStaff);
  }
  
  private static void fillSturdyQuarterstaff() {
    int id = 4566;
    MultiBonus sturdyQuarterstaff = new MultiBonus("Sturdy Quarterstaff", id);
    sturdyQuarterstaff.createArcaneWrathTree(4, 6, 5.1);
    sturdyQuarterstaff.createFieryWrathTree(4, 6, 3.1);
    sturdyQuarterstaff.createFrozenWrathTree(4, 6, 2.4);
    sturdyQuarterstaff.createHealingTree(4, 5, 5.7);
    sturdyQuarterstaff.createIntellectTree(3, 4, 3.3);
    sturdyQuarterstaff.createNaturesWrathTree(4, 6, 5.2);
    sturdyQuarterstaff.createPowerTree(6, 8, 2.4);
    sturdyQuarterstaff.createShadowWrathTree(4, 6, 2.2);
    sturdyQuarterstaff.createSpiritTree(3, 4, 4.9);
    sturdyQuarterstaff.createStaminaTree(3, 4, 4.2);
    
    sturdyQuarterstaff.createBearTree(1, 2, 9.5);
    sturdyQuarterstaff.createBoarTree(1, 2, 10.5);
    sturdyQuarterstaff.createEagleTree(1, 2, 6.2);
    sturdyQuarterstaff.createMonkeyTree(1, 2, 9.9);
    sturdyQuarterstaff.createOwlTree(1, 2, 6.8);
    sturdyQuarterstaff.createWhaleTree(1, 2, 8.4);
    sturdyQuarterstaff.createWolfTree(1, 2, 10.4);
    list.add(sturdyQuarterstaff);
  }
  
  private static void fillSpiritchaserStaff() {
    int id = 1613;
    MultiBonus spiritchaserStaff = new MultiBonus("Spiritchaser Staff", id);
    spiritchaserStaff.createArcaneWrathTree(14, 27, 5.7);
    spiritchaserStaff.createFieryWrathTree(14, 27, 3.2);
    spiritchaserStaff.createFrozenWrathTree(26, 27, 2.3);
    spiritchaserStaff.createHealingTree(12, 22, 4.7);
    spiritchaserStaff.createIntellectTree(18, 19, 3.4);
    spiritchaserStaff.createNaturesWrathTree(14, 27, 5.4);
    spiritchaserStaff.createPowerTree(36, 38, 2.3);
    spiritchaserStaff.createShadowWrathTree(26, 27, 1.5);
    spiritchaserStaff.createSpiritTree(18, 19, 5.7);
    spiritchaserStaff.createStaminaTree(18, 19, 4.6);
    
    spiritchaserStaff.createBearTree(11, 12, 9.5);
    spiritchaserStaff.createBoarTree(11, 12, 12.0);
    spiritchaserStaff.createEagleTree(11, 12, 4.9);
    spiritchaserStaff.createMonkeyTree(11, 12, 8.0);
    spiritchaserStaff.createOwlTree(11, 12, 6.6);
    spiritchaserStaff.createWhaleTree(11, 12, 9.1);
    spiritchaserStaff.createWolfTree(11, 12, 11.1);
    list.add(spiritchaserStaff);
  }
  
  private static void fillSolsticeStaff() {
    int id = 15278;
    MultiBonus solsticeStaff = new MultiBonus("Solstice Staff", id);
    solsticeStaff.createArcaneWrathTree(36, 37, 4.5);
    solsticeStaff.createFieryWrathTree(36, 37, 3.8);
    solsticeStaff.createFrozenWrathTree(36, 37, 2.1);
    solsticeStaff.createHealingTree(29, 30, 5.9);
    solsticeStaff.createIntellectTree(25, 26, 4.5);
    solsticeStaff.createNaturesWrathTree(36, 37, 4.4);
    solsticeStaff.createPowerTree(50, 52, 2.1);
    solsticeStaff.createShadowWrathTree(36, 37, 2.0);
    solsticeStaff.createSpiritTree(25, 26, 4.6);
    solsticeStaff.createStaminaTree(25, 26, 4.7);
    
    solsticeStaff.createBearTree(16, 17, 9.1);
    solsticeStaff.createBoarTree(16, 17, 9.1);
    solsticeStaff.createEagleTree(16, 17, 7.6);
    solsticeStaff.createMonkeyTree(16, 17, 8.6);
    solsticeStaff.createOwlTree(16, 17, 8.8);
    solsticeStaff.createWhaleTree(16, 17, 9.2);
    solsticeStaff.createWolfTree(16, 17, 8.9);
    list.add(solsticeStaff);
  }
  
  private static void fillMonksStaff() {
    int id = 866;
    MultiBonus monksStaff = new MultiBonus("Monk's Staff", id);
    monksStaff.createArcaneWrathTree(23, 24, 5.6);
    monksStaff.createFieryWrathTree(23, 24, 3.2);
    monksStaff.createFrozenWrathTree(23, 24, 2.2);
    monksStaff.createHealingTree(19, 20, 5.0);
    monksStaff.createIntellectTree(16, 17, 3.6);
    monksStaff.createNaturesWrathTree(23, 24, 5.4);
    monksStaff.createPowerTree(32, 34, 2.1);
    monksStaff.createShadowWrathTree(23, 24, 1.5);
    monksStaff.createSpiritTree(16, 17, 5.6);
    monksStaff.createStaminaTree(16, 17, 4.5);
    
    monksStaff.createBearTree(10, 11, 9.3);
    monksStaff.createBoarTree(10, 11, 11.6);
    monksStaff.createEagleTree(10, 11, 5.0);
    monksStaff.createMonkeyTree(10, 11, 8.1);
    monksStaff.createOwlTree(10, 11, 6.9);
    monksStaff.createWhaleTree(10, 11, 9.3);
    monksStaff.createWolfTree(10, 11, 11.0);
    list.add(monksStaff);
  }
  
  private static void fillMedicineStaff() {
    int id = 4575;
    MultiBonus medicineStaff = new MultiBonus("Medicine Staff", id);
    medicineStaff.createArcaneWrathTree(4, 10, 5.4);
    medicineStaff.createFieryWrathTree(9, 10, 2.9);
    medicineStaff.createFrozenWrathTree(9, 10, 2.3);
    medicineStaff.createHealingTree(4, 8, 4.7);
    medicineStaff.createIntellectTree(6, 7, 2.8);
    medicineStaff.createNaturesWrathTree(4, 10, 5.7);
    medicineStaff.createPowerTree(12, 14, 2.5);
    medicineStaff.createShadowWrathTree(9, 10, 1.6);
    medicineStaff.createSpiritTree(6, 7, 5.8);
    medicineStaff.createStaminaTree(6, 7, 4.0);
    
    medicineStaff.createBearTree(3, 4, 9.3);
    medicineStaff.createBoarTree(3, 4, 12.7);
    medicineStaff.createEagleTree(3, 4, 4.5);
    medicineStaff.createMonkeyTree(3, 4, 9.6);
    medicineStaff.createOwlTree(3, 4, 5.8);
    medicineStaff.createWhaleTree(3, 4, 8.5);
    medicineStaff.createWolfTree(3, 4, 12.3);
    list.add(medicineStaff);
  }
  
  private static void fillMagusLongStaff() {
    int id = 15276;
    MultiBonus magusLongStaff = new MultiBonus("Magus Long Staff", id);
    magusLongStaff.createArcaneWrathTree(36, 37, 5.4);
    magusLongStaff.createFieryWrathTree(36, 37, 3.7);
    magusLongStaff.createFrozenWrathTree(36, 37, 2.3);
    magusLongStaff.createHealingTree(16, 30, 6.1);
    magusLongStaff.createIntellectTree(25, 26, 3.9);
    magusLongStaff.createNaturesWrathTree(36, 37, 5.2);
    magusLongStaff.createPowerTree(50, 52, 2.1);
    magusLongStaff.createShadowWrathTree(36, 37, 1.8);
    magusLongStaff.createSpiritTree(25, 26, 5.2);
    magusLongStaff.createStaminaTree(25, 26, 4.4);
    
    magusLongStaff.createBearTree(16, 17, 9.4);
    magusLongStaff.createBoarTree(16, 17, 9.9);
    magusLongStaff.createEagleTree(16, 17, 6.1);
    magusLongStaff.createMonkeyTree(16, 17, 8.5);
    magusLongStaff.createOwlTree(16, 17, 7.5);
    magusLongStaff.createWhaleTree(16, 17, 8.9);
    magusLongStaff.createWolfTree(16, 17, 9.7);
    list.add(magusLongStaff);
  }
  
  private static void fillMagicianStaff() {
    int id = 2077;
    MultiBonus magicianStaff = new MultiBonus("Magician Staff", id);
    magicianStaff.createArcaneWrathTree(9, 16, 5.8);
    magicianStaff.createFieryWrathTree(9, 16, 2.7);
    magicianStaff.createFrozenWrathTree(14, 16, 2.2);
    magicianStaff.createHealingTree(7, 13, 4.6);
    magicianStaff.createIntellectTree(10, 11, 3.4);
    magicianStaff.createNaturesWrathTree(9, 16, 6.0);
    magicianStaff.createPowerTree(12, 22, 2.0);
    magicianStaff.createShadowWrathTree(14, 16, 1.6);
    magicianStaff.createSpiritTree(10, 11, 6.0);
    magicianStaff.createStaminaTree(10, 11, 4.0);
    
    magicianStaff.createBearTree(6, 7, 9.2);
    magicianStaff.createBoarTree(6, 7, 12.1);
    magicianStaff.createEagleTree(6, 7, 4.9);
    magicianStaff.createMonkeyTree(6, 7, 8.0);
    magicianStaff.createOwlTree(6, 7, 7.1);
    magicianStaff.createWhaleTree(6, 7, 9.4);
    magicianStaff.createWolfTree(6, 7, 11.4);
    list.add(magicianStaff);
  }
  
  private static void fillDwarvenMagestaff() {
    int id = 2072;
    MultiBonus dwarvenMagestaff = new MultiBonus("Dwarven Magestaff", id);
    dwarvenMagestaff.createArcaneWrathTree(7, 14, 5.3);
    dwarvenMagestaff.createFieryWrathTree(7, 14, 2.9);
    dwarvenMagestaff.createFrozenWrathTree(13, 14, 2.0);
    dwarvenMagestaff.createHealingTree(6, 12, 4.4);
    dwarvenMagestaff.createIntellectTree(9, 10, 3.3);
    dwarvenMagestaff.createNaturesWrathTree(7, 14, 5.6);
    dwarvenMagestaff.createPowerTree(10, 20, 2.2);
    dwarvenMagestaff.createShadowWrathTree(13, 14, 1.5);
    dwarvenMagestaff.createSpiritTree(9, 10, 6.0);
    dwarvenMagestaff.createStaminaTree(9, 10, 4.4);
    
    dwarvenMagestaff.createBearTree(5, 6, 9.4);
    dwarvenMagestaff.createBoarTree(5, 6, 12.0);
    dwarvenMagestaff.createEagleTree(5, 6, 5.3);
    dwarvenMagestaff.createMonkeyTree(5, 6, 8.4);
    dwarvenMagestaff.createOwlTree(5, 6, 7.0);
    dwarvenMagestaff.createWhaleTree(5, 6, 9.3);
    dwarvenMagestaff.createWolfTree(5, 6, 11.2);
    list.add(dwarvenMagestaff);
  }
  
  private static void fillDivinerLongStaff() {
    int id = 15274;
    MultiBonus divinerLongStaff = new MultiBonus("Diviner Long Staff", id);
    divinerLongStaff.createArcaneWrathTree(31, 33, 5.4);
    divinerLongStaff.createFieryWrathTree(31, 33, 3.3);
    divinerLongStaff.createFrozenWrathTree(31, 33, 2.2);
    divinerLongStaff.createHealingTree(26, 27, 5.0);
    divinerLongStaff.createIntellectTree(22, 23, 3.3);
    divinerLongStaff.createNaturesWrathTree(19, 33, 5.4);
    divinerLongStaff.createPowerTree(24, 46, 2.0);
    divinerLongStaff.createShadowWrathTree(31, 33, 1.4);
    divinerLongStaff.createSpiritTree(22, 23, 5.7);
    divinerLongStaff.createStaminaTree(22, 23, 4.4);
    
    divinerLongStaff.createBearTree(14, 15, 9.1);
    divinerLongStaff.createBoarTree(14, 15, 11.7);
    divinerLongStaff.createEagleTree(14, 15, 4.8);
    divinerLongStaff.createMonkeyTree(14, 15, 7.8);
    divinerLongStaff.createOwlTree(14, 15, 7.2);
    divinerLongStaff.createWhaleTree(14, 15, 9.9);
    divinerLongStaff.createWolfTree(14, 15, 11.1);
    list.add(divinerLongStaff);
  }
  
  private static void fillAcrobaticStaff() {
    int id = 3185;
    MultiBonus acrobaticStaff = new MultiBonus("Acrobatic Staff", id);
    acrobaticStaff.createArcaneWrathTree(19, 20, 5.7);
    acrobaticStaff.createFieryWrathTree(19, 20, 2.9);
    acrobaticStaff.createFrozenWrathTree(19, 20, 2.0);
    acrobaticStaff.createHealingTree(8, 16, 4.7);
    acrobaticStaff.createIntellectTree(13, 14, 3.1);
    acrobaticStaff.createNaturesWrathTree(11, 20, 5.9);
    acrobaticStaff.createPowerTree(16, 28, 2.1);
    acrobaticStaff.createShadowWrathTree(19, 20, 1.5);
    acrobaticStaff.createSpiritTree(13, 14, 6.2);
    acrobaticStaff.createStaminaTree(13, 14, 3.9);
    
    acrobaticStaff.createBearTree(8, 9, 8.7);
    acrobaticStaff.createBoarTree(8, 9, 13.0);
    acrobaticStaff.createEagleTree(8, 9, 4.2);
    acrobaticStaff.createMonkeyTree(8, 9, 7.5);
    acrobaticStaff.createOwlTree(8, 9, 6.8);
    acrobaticStaff.createWhaleTree(8, 9, 9.5);
    acrobaticStaff.createWolfTree(8, 9, 12.1);
    list.add(acrobaticStaff);
  }
}
