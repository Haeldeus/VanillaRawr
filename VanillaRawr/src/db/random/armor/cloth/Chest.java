package db.random.armor.cloth;

import java.util.ArrayList;

import util.MultiBonus;

public class Chest {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  private static ArrayList<MultiBonus> list;
  
  private static int[] ids = {
    /*Done*/9943, 9946, 14120, 14121, 14288, 14297, 14091, 14094, 14267, 14265, 14303, 14306, 
    14172, 
    /*ToDo*/
    14175, 14317, 14308, 9852, 9844, 10102, 10104, 14237, 14244, 6512, 6266, 9826, 
    9819, 10065, 10057, 7353, 7369, 10215, 10218, 14234, 14230, 14328, 14336, 14275, 14277, 
    14216, 14225, 7518, 7517, 9773, 9774, 10143, 10135, 9798, 9791, 14254, 14249, 10254, 
    10246, 10181, 10178, 14109, 14096, 14284, 14287, 14158, 14163, 14192, 14190, 7332, 
    7468, 14326, 14318, 14127, 14133, 9905, 9913, 6609, 6610, 6567, 6569, 9749, 9748, 9874, 
    9884, 14202, 14204, 7429, 7430, 14213, 14215, 14180, 14184, 6538, 6536
  };
  
  /**
   * Returns a List of all Cloth-Chests with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all Cloth-Chests with
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
    fillAbjurersRobe();
    fillAbjurersTunic();
    fillAboriginalRobe();
    fillAboriginalVest();
    fillArachnidianArmor();
    fillArachnidianRobes();
    fillBeadedRobe();
    fillBeadedWraps();
    fillBloodwovenJerkin();
    fillBloodwovenWraps();
    fillBonecastersShroud();
    fillBonecastersVest();
    fillBuccaneersRobes();
    System.out.println(list.get(list.size() - 1));
  }
  
  private static void fillBuccaneersRobes() {
    int id = 14172;
    MultiBonus buccaneersRobes = new MultiBonus("Buccaneer's Robes", id);
    buccaneersRobes.createArcaneWrathTree(10, 11, 4.9);
    buccaneersRobes.createFrozenWrathTree(10, 11, 5.3);
    buccaneersRobes.createIntellectTree(7, 8, 11.1);
    buccaneersRobes.createShadowWrathTree(10, 11, 3.3);
    buccaneersRobes.createSpiritTree(7, 8, 8.6);
    buccaneersRobes.createStaminaTree(7, 8, 5.8);
    
    buccaneersRobes.createEagleTree(4, 5, 14.4);
    buccaneersRobes.createOwlTree(4, 5, 32.1);
    buccaneersRobes.createWhaleTree(4, 5, 14.6);
    list.add(buccaneersRobes);
  }

  private static void fillBonecastersVest() {
    int id = 14306;
    MultiBonus bonecastersVest = new MultiBonus("Bonecaster's Vest", id);
    bonecastersVest.createArcaneWrathTree(36, 37, 7.9);
    bonecastersVest.createFrozenWrathTree(36, 37, 10.6);
    bonecastersVest.createIntellectTree(25, 26, 5.9);
    bonecastersVest.createShadowWrathTree(36, 37, 6.3);
    bonecastersVest.createSpiritTree(25, 26, 6.5);
    bonecastersVest.createStaminaTree(25, 26, 6.1);
    
    bonecastersVest.createEagleTree(16, 17, 15.0);
    bonecastersVest.createOwlTree(16, 17, 25.4);
    bonecastersVest.createWhaleTree(16, 17, 16.2);
    list.add(bonecastersVest);
  }

  private static void fillBonecastersShroud() {
    int id = 14303;
    MultiBonus bonecastersShroud = new MultiBonus("Bonecaster's Shroud", id);
    bonecastersShroud.createArcaneWrathTree(36, 37, 7.3);
    bonecastersShroud.createFireResistanceTree(25, 25, 0.5);
    bonecastersShroud.createFrozenWrathTree(36, 37, 9.3);
    bonecastersShroud.createIntellectTree(25, 26, 6.9);
    bonecastersShroud.createShadowWrathTree(36, 37, 8.0);
    bonecastersShroud.createSpiritTree(25, 26, 7.5);
    bonecastersShroud.createStaminaTree(25, 26, 7.1);
    
    bonecastersShroud.createEagleTree(16, 17, 13.0);
    bonecastersShroud.createOwlTree(16, 17, 22.8);
    bonecastersShroud.createWhaleTree(16, 17, 17.5);
    list.add(bonecastersShroud);
  }

  private static void fillBloodwovenWraps() {
    int id = 14265;
    MultiBonus bloodwovenWraps = new MultiBonus("Bloodwoven Wraps", id);
    bloodwovenWraps.createArcaneWrathTree(30, 31, 6.8);
    bloodwovenWraps.createFrozenWrathTree(30, 31, 5.5);
    bloodwovenWraps.createIntellectTree(21, 22, 6.4);
    bloodwovenWraps.createShadowWrathTree(30, 31, 3.6);
    bloodwovenWraps.createSpiritTree(21, 22, 10.6);
    bloodwovenWraps.createStaminaTree(21, 22, 6.3);
    
    bloodwovenWraps.createEagleTree(13, 14, 15.5);
    bloodwovenWraps.createOwlTree(13, 14, 27.1);
    bloodwovenWraps.createWhaleTree(13, 14, 18.2);
    list.add(bloodwovenWraps);
  }

  private static void fillBloodwovenJerkin() {
    int id = 14267;
    MultiBonus bloodwovenJerkin = new MultiBonus("Bloodwoven Jerkin", id);
    bloodwovenJerkin.createArcaneWrathTree(30, 31, 5.1);
    bloodwovenJerkin.createFrozenWrathTree(30, 31, 4.8);
    bloodwovenJerkin.createIntellectTree(21, 22, 7.5);
    bloodwovenJerkin.createShadowWrathTree(30, 31, 3.1);
    bloodwovenJerkin.createSpiritTree(21, 22, 8.4);
    bloodwovenJerkin.createStaminaTree(21, 22, 6.6);
    
    bloodwovenJerkin.createEagleTree(13, 14, 20.3);
    bloodwovenJerkin.createOwlTree(13, 14, 26.0);
    bloodwovenJerkin.createWhaleTree(13, 14, 18.2);
    list.add(bloodwovenJerkin);
  }

  private static void fillBeadedWraps() {
    int id = 14094;
    MultiBonus beadedWraps = new MultiBonus("Beaded Wraps", id);
    beadedWraps.createArcaneWrathTree(1, 3, 4.6);
    beadedWraps.createFrozenWrathTree(1, 3, 4.5);
    beadedWraps.createIntellectTree(1, 2, 10.6);
    beadedWraps.createShadowWrathTree(1, 3, 3.6);
    beadedWraps.createSpiritTree(1, 2, 6.3);
    beadedWraps.createStaminaTree(1, 2, 5.0);
    
    beadedWraps.createEagleTree(1, 1, 20.7);
    beadedWraps.createOwlTree(1, 1, 32.0);
    beadedWraps.createWhaleTree(1, 1, 12.7);
    list.add(beadedWraps);
  }

  private static void fillBeadedRobe() {
    int id = 14091;
    MultiBonus beadedRobe = new MultiBonus("Beaded Robe", id);
    beadedRobe.createArcaneWrathTree(1, 3, 5.1);
    beadedRobe.createFrozenWrathTree(1, 3, 5.5);
    beadedRobe.createIntellectTree(1, 2, 9.5);
    beadedRobe.createShadowWrathTree(1, 3, 4.3);
    beadedRobe.createSpiritTree(1, 2, 7.1);
    beadedRobe.createStaminaTree(1, 2, 6.1);
    
    beadedRobe.createEagleTree(1, 1, 18.8);
    beadedRobe.createOwlTree(1, 1, 29.0);
    beadedRobe.createWhaleTree(1, 1, 14.4);
    list.add(beadedRobe);
  }

  private static void fillArachnidianRobes() {
    int id = 14297;
    MultiBonus arachnidianRobes = new MultiBonus("Arachnidian Robes", id);
    arachnidianRobes.createArcaneResistanceTree(24, 24, 0.2);
    arachnidianRobes.createArcaneWrathTree(34, 36, 8.9);
    arachnidianRobes.createFireResistanceTree(24, 24, 0.2);
    arachnidianRobes.createFrostResistanceTree(24, 24, 0.2);
    arachnidianRobes.createFrozenWrathTree(34, 36, 9.1);
    arachnidianRobes.createIntellectTree(24, 25, 6.9);
    arachnidianRobes.createNatureResistanceTree(24, 24, 0.2);
    arachnidianRobes.createShadowResistanceTree(24, 24, 0.3);
    arachnidianRobes.createShadowWrathTree(34, 36, 6.6);
    arachnidianRobes.createSpiritTree(24, 25, 8.0);
    arachnidianRobes.createStaminaTree(24, 25, 5.8);
    
    arachnidianRobes.createEagleTree(15, 16, 11.9);
    arachnidianRobes.createOwlTree(15, 16, 25.5);
    arachnidianRobes.createWhaleTree(15, 16, 16.2);
    list.add(arachnidianRobes);
  }

  private static void fillArachnidianArmor() {
    int id = 14288;
    MultiBonus arachnidianArmor = new MultiBonus("Arachnidian Armor", id);
    arachnidianArmor.createArcaneResistanceTree(24, 24, 0.2);
    arachnidianArmor.createArcaneWrathTree(34, 36, 8.5);
    arachnidianArmor.createFireResistanceTree(24, 24, 0.3);
    arachnidianArmor.createFrostResistanceTree(34, 36, 0.5);
    arachnidianArmor.createFrozenWrathTree(34, 36, 7.7);
    arachnidianArmor.createIntellectTree(24, 25, 6.3);
    arachnidianArmor.createNatureResistanceTree(24, 25, 0.4);
    arachnidianArmor.createShadowResistanceTree(24, 25, 0.4);
    arachnidianArmor.createShadowWrathTree(34, 36, 7.1);
    arachnidianArmor.createSpiritTree(24, 25, 7.6);
    arachnidianArmor.createStaminaTree(24, 25, 5.6);
    
    arachnidianArmor.createEagleTree(15, 16, 12.2);
    arachnidianArmor.createOwlTree(15, 16, 26.7);
    arachnidianArmor.createWhaleTree(15, 16, 16.6);
    list.add(arachnidianArmor);
  }

  private static void fillAboriginalVest() {
    int id = 14121;
    MultiBonus aboriginalVest = new MultiBonus("Aboriginal Vest", id);
    aboriginalVest.createArcaneWrathTree(9, 10, 4.6);
    aboriginalVest.createFrozenWrathTree(9, 10, 4.6);
    aboriginalVest.createIntellectTree(6, 7, 11.5);
    aboriginalVest.createShadowWrathTree(9, 10, 3.0);
    aboriginalVest.createSpiritTree(6, 7, 7.5);
    aboriginalVest.createStaminaTree(6, 7, 5.3);
    
    
    aboriginalVest.createEagleTree(3, 4, 16.9);
    aboriginalVest.createOwlTree(3, 4, 32.4);
    aboriginalVest.createWhaleTree(3, 4, 14.3);
    list.add(aboriginalVest);
  }

  private static void fillAboriginalRobe() {
    int id = 14120;
    MultiBonus aboriginalRobe = new MultiBonus("Aboriginal Robe", id);
    aboriginalRobe.createArcaneWrathTree(9, 10, 6.0);
    aboriginalRobe.createFrozenWrathTree(9, 10, 6.0);
    aboriginalRobe.createIntellectTree(9, 10, 9.7);
    aboriginalRobe.createShadowWrathTree(9, 10, 3.6);
    aboriginalRobe.createSpiritTree(6, 7, 8.8);
    aboriginalRobe.createStaminaTree(6, 7, 6.4);
    
    aboriginalRobe.createEagleTree(3, 4, 14.8);
    aboriginalRobe.createOwlTree(3, 4, 29.2);
    aboriginalRobe.createWhaleTree(3, 4, 15.3);
    list.add(aboriginalRobe);
  }
  
  private static void fillAbjurersTunic() {
    int id = 9946;
    MultiBonus abjurersTunic = new MultiBonus("Abjurer's Tunic", id);
    abjurersTunic.createArcaneResistanceTree(22, 23, 0.3);
    abjurersTunic.createArcaneWrathTree(31, 33, 9.5);
    abjurersTunic.createFireResistanceTree(22, 23, 0.4);
    abjurersTunic.createFrostResistanceTree(22, 23, 0.3);
    abjurersTunic.createFrozenWrathTree(31, 33, 7.2);
    abjurersTunic.createIntellectTree(22, 23, 6.6);
    abjurersTunic.createNatureResistanceTree(22, 23, 0.3);
    abjurersTunic.createShadowResistanceTree(22, 23, 0.4);
    abjurersTunic.createShadowWrathTree(31, 33, 5.4);
    abjurersTunic.createSpiritTree(22, 23, 7.7);
    abjurersTunic.createStaminaTree(22, 23, 6.1);
    
    abjurersTunic.createEagleTree(14, 15, 14.7);
    abjurersTunic.createOwlTree(14, 15, 23.5);
    abjurersTunic.createWhaleTree(14, 15, 17.4);
    list.add(abjurersTunic);
  }

  private static void fillAbjurersRobe() {
    int id = 9943;
    MultiBonus abjurersRobe = new MultiBonus("Abjurer's Robe", id);
    abjurersRobe.createArcaneResistanceTree(22, 23, 0.3);
    abjurersRobe.createArcaneWrathTree(31, 33, 10.7);
    abjurersRobe.createFireResistanceTree(22, 23, 0.3);
    abjurersRobe.createFrostResistanceTree(22, 23, 0.4);
    abjurersRobe.createFrozenWrathTree(31, 33, 8.1);
    abjurersRobe.createIntellectTree(22, 23, 6.7);
    abjurersRobe.createNatureResistanceTree(22, 23, 0.4);
    abjurersRobe.createShadowResistanceTree(22, 23, 0.3);
    abjurersRobe.createShadowWrathTree(31, 33, 5.5);
    abjurersRobe.createSpiritTree(22, 23, 9.3);
    abjurersRobe.createStaminaTree(22, 23, 6.1);
    
    abjurersRobe.createEagleTree(14, 15, 11.5);
    abjurersRobe.createOwlTree(14, 15, 23.6);
    abjurersRobe.createWhaleTree(14, 15, 16.9);
    list.add(abjurersRobe);
  }

  public static void main(String[] args) {
    fill();
  }
}
