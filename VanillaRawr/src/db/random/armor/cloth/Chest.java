package db.random.armor.cloth;

import java.util.ArrayList;
import util.MultiBonus;

/**
 * A Class, that stores all Cloth Chests with MultiBonus. They can be accessed by calling {@link 
 * #getList()}.
 * @author Haeldeus
 * @version 1.0
 */
public class Chest {

  private String warningString; //Used to create a Warning in Eclipse to see, which Classes are still missing, delete this after Completion!

  /**
   * A List, that saves every Cloth Chest, that has a MultiBonus. These Items are saved as an 
   * {@link ArrayList} of {@link MultiBonus}.
   */
  private static ArrayList<MultiBonus> list;
  
  /**
   * The ID's of all Cloth Chests with MultiBonus.
   */
  private static int[] ids = {
    /*Done*/9943, 9946, 14120, 14121, 14288, 14297, 14091, 14094, 14267, 14265, 14303, 14306, 
    14172, 14175, 14317, 14308, 9852, 9844, 10102, 10104, 14237, 14244, 6512, 6266, 9826,
    9819, 10065, 10057, 7353, 7369, 10215, 10218, 14234, 14230, 14328, 14336, 14275, 14277, 
    14216, 14225, 7518, 7517, 9773, 9774, 10143, 10135, 9798, 
    /*ToDo*/
    9791, 14254, 14249, 10254, 
    10246, 10181, 10178, 14109, 14096, 14284, 14287, 14158, 14163, 14192, 14190, 7332, 
    7468, 14326, 14318, 14127, 14133, 9905, 9913, 6609, 6610, 6567, 6569, 9749, 9748, 9874, 
    9884, 14202, 14204, 7429, 7430, 14213, 14215, 14180, 14184, 6538, 6536
  };
  
  /**
   * Returns a List of all Cloth-Chests with Random Boni in the Game.
   * @return  An {@link ArrayList} of {@link MultiBonus}, that represents all Cloth-Chests with
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
   * @return The ID's of all Cloth Chests with a MultiBonus as an Array of Integers.
   * @since 1.0
   */
  public static int[] getIDs() {
    return ids;
  }
  
  /**
   * Fills the {@link #list} with all Cloth Chests, that have a MultiBonus.
   * @since 1.0
   */
  private static void fill() {
    System.err.println("Not all ID's built in yet, use with caution!");
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
    fillBuccaneersVest();
    fillCelestialSilkRobes();
    fillCelestialTunic();
    fillConjurersRobe();
    fillConjurersVest();
    fillCouncillorsRobes();
    fillCouncillorsTunic();
    fillDarkmistArmor();
    fillDarkmistWraps();
    fillDisciplesRobe();
    fillDisciplesVest();
    fillDurableRobe();
    fillDurableTunic();
    fillDuskwovenRobe();
    fillDuskwovenTunic();
    fillEldersPaddedArmor();
    fillEldersRobe();
    fillElegantRobes();
    fillElegantTunic();
    fillEmbersilkRobes();
    fillEmbersilkTunic();
    fillEternalChestguard();
    fillEternalWraps();
    fillGaeasRaiment();
    fillGaeasTunic();
    fillGeomancersJerkin();
    fillGeomancersWraps();
    fillGossamerRobe();
    fillGossamerTunic();
    fillGreenweaveRobe();
    fillGreenweaveVest();
    fillHighCouncillorsRobe();
    fillHighCouncillorsTunic();
    fillIvyclothRobe();
    fillIvyclothTunic();
    
    System.out.println(list.get(list.size() - 1).getAllItems()); 
    System.out.println(list.get(list.size() - 1));  //Still need this when adding Items
    System.out.println("Cloth Chests: " + list.size() + "/" + ids.length + " - " 
        + ((double)(list.size()) / (double)(ids.length) * 100 + "%"));
  }
  
  private static void fillIvyclothTunic() {
    int id = 9791;
    MultiBonus ivyclothTunic = new MultiBonus("Ivycloth Tunic", id);
    //TODO
    list.add(ivyclothTunic);
  }

  /**
   * Adds the <a href="http://db.vanillagaming.org/?item=9798">Ivycloth Robe</a> to the List.
   * @since 1.0
   */
  private static void fillIvyclothRobe() {
    int id = 9798;
    MultiBonus ivyclothRobe = new MultiBonus("Ivycloth Robe", id);
    ivyclothRobe.createArcaneWrathTree(14, 16, 4.4);
    ivyclothRobe.createFrozenWrathTree(14, 16, 4.7);
    ivyclothRobe.createIntellectTree(10, 11, 9.3);
    ivyclothRobe.createShadowWrathTree(14, 16, 4.4);
    ivyclothRobe.createSpiritTree(10, 11, 8.7);
    ivyclothRobe.createStaminaTree(10, 11, 7.5);
    
    ivyclothRobe.createEagleTree(6, 7, 17.3);
    ivyclothRobe.createOwlTree(6, 7, 27.0);
    ivyclothRobe.createWhaleTree(6, 7, 16.8);
    list.add(ivyclothRobe);
  }

  private static void fillHighCouncillorsTunic() {
    int id = 10135;
    MultiBonus highCouncillorsTunic = new MultiBonus("High Councillor's Tunic", id);
    highCouncillorsTunic.createArcaneResistanceTree(29, 29, 0.2);
    highCouncillorsTunic.createArcaneWrathTree(40, 41, 7.6);
    highCouncillorsTunic.createFireResistanceTree(29, 29, 0.2);
    highCouncillorsTunic.createFrostResistanceTree(29, 29, 0.1);
    highCouncillorsTunic.createFrozenWrathTree(40, 41, 8.4);
    highCouncillorsTunic.createIntellectTree(28, 29, 7.6);
    highCouncillorsTunic.createShadowResistanceTree(28, 28, 0.1);
    highCouncillorsTunic.createShadowWrathTree(40, 41, 8.5);
    highCouncillorsTunic.createSpiritTree(28, 29, 5.8);
    highCouncillorsTunic.createStaminaTree(28, 29, 5.2);
    
    highCouncillorsTunic.createEagleTree(18, 19, 17.9);
    highCouncillorsTunic.createOwlTree(18, 19, 24.1);
    highCouncillorsTunic.createWhaleTree(18, 19, 14.3);
    list.add(highCouncillorsTunic);
  }
  
  private static void fillHighCouncillorsRobe() {
    int id = 10143;
    MultiBonus highCouncillorsRobe = new MultiBonus("High Councillor's Robe", id);
    highCouncillorsRobe.createArcaneResistanceTree(29, 29, 0.2);
    highCouncillorsRobe.createArcaneWrathTree(40, 41, 8.1);
    highCouncillorsRobe.createFireResistanceTree(29, 29, 0.1);
    highCouncillorsRobe.createFrostResistanceTree(29, 29, 0.2);
    highCouncillorsRobe.createFrozenWrathTree(40, 41, 8.5);
    highCouncillorsRobe.createIntellectTree(28, 29, 7.7);
    highCouncillorsRobe.createNatureResistanceTree(29, 29, 0.1);
    highCouncillorsRobe.createShadowResistanceTree(29, 29, 0.1);
    highCouncillorsRobe.createShadowWrathTree(40, 41, 7.8);
    highCouncillorsRobe.createSpiritTree(28, 29, 5.3);
    highCouncillorsRobe.createStaminaTree(28, 29, 5.7);
    
    highCouncillorsRobe.createEagleTree(18, 19, 17.6);
    highCouncillorsRobe.createOwlTree(18, 19, 25.1);
    highCouncillorsRobe.createWhaleTree(18, 19, 13.6);
    list.add(highCouncillorsRobe);
  }

  private static void fillGreenweaveVest() {
    int id = 9774;
    MultiBonus greenweaveVest = new MultiBonus("Greenweave Vest", id);
    greenweaveVest.createArcaneWrathTree(13, 14, 3.9);
    greenweaveVest.createFrozenWrathTree(13, 14, 3.7);
    greenweaveVest.createIntellectTree(9, 10, 13.2);
    greenweaveVest.createShadowWrathTree(13, 14, 2.3);
    greenweaveVest.createSpiritTree(9, 10, 6.8);
    greenweaveVest.createStaminaTree(9, 10, 4.6);
    
    greenweaveVest.createEagleTree(5, 6, 15.5);
    greenweaveVest.createOwlTree(5, 6, 37.7);
    greenweaveVest.createWhaleTree(5, 6, 12.2);
    list.add(greenweaveVest);
  }

  private static void fillGreenweaveRobe() {
    int id = 9773;
    MultiBonus greenweaveRobe = new MultiBonus("Greenweave Robe", id);
    greenweaveRobe.createArcaneWrathTree(13, 14, 4.8);
    greenweaveRobe.createFrozenWrathTree(13, 14, 4.3);
    greenweaveRobe.createIntellectTree(9, 10, 11.7);
    greenweaveRobe.createShadowWrathTree(13, 14, 2.6);
    greenweaveRobe.createSpiritTree(9, 10, 8.0);
    greenweaveRobe.createStaminaTree(9, 10, 4.7);
    
    greenweaveRobe.createEagleTree(5, 6, 14.1);
    greenweaveRobe.createOwlTree(5, 6, 36.0);
    greenweaveRobe.createWhaleTree(5, 6, 13.9);
    list.add(greenweaveRobe);
  }

  private static void fillGossamerTunic() {
    int id = 7517;
    MultiBonus gossamerTunic = new MultiBonus("Gossamer Tunic", id);
    gossamerTunic.createArcaneWrathTree(30, 31, 5.8);
    gossamerTunic.createFrozenWrathTree(30, 31, 4.8);
    gossamerTunic.createIntellectTree(21, 22, 7.5);
    gossamerTunic.createShadowWrathTree(30, 31, 3.5);
    gossamerTunic.createSpiritTree(21, 22, 8.5);
    gossamerTunic.createStaminaTree(21, 22, 6.1);
    gossamerTunic.createEagleTree(13, 14, 20.1);
    gossamerTunic.createOwlTree(13, 14, 25.8);
    gossamerTunic.createWhaleTree(13, 14, 18.0);
    list.add(gossamerTunic);
  }

  private static void fillGossamerRobe() {
    int id = 7518;
    MultiBonus gossamerRobe = new MultiBonus("Gossamer Robe", id);
    gossamerRobe.createArcaneWrathTree(30, 31, 7.2);
    gossamerRobe.createFrozenWrathTree(30, 31, 5.4);
    gossamerRobe.createIntellectTree(21, 22, 7.5);
    gossamerRobe.createShadowWrathTree(30, 31, 3.5);
    gossamerRobe.createSpiritTree(21, 22, 9.6);
    gossamerRobe.createStaminaTree(21, 22, 6.5);
    
    gossamerRobe.createEagleTree(13, 14, 15.8);
    gossamerRobe.createOwlTree(13, 14, 25.1);
    gossamerRobe.createWhaleTree(13, 14, 19.3);
    list.add(gossamerRobe);
  }

  private static void fillGeomancersWraps() {
    int id = 14225;
    MultiBonus geomancersWraps = new MultiBonus("Geomancer's Wraps", id);
    geomancersWraps.createArcaneWrathTree(23, 24, 5.1);
    geomancersWraps.createFrozenWrathTree(23, 24, 4.1);
    geomancersWraps.createIntellectTree(16, 17, 11.0);
    geomancersWraps.createShadowWrathTree(23, 24, 3.1);
    geomancersWraps.createSpiritTree(16, 17, 6.8);
    geomancersWraps.createStaminaTree(16, 17, 5.4);
    
    geomancersWraps.createEagleTree(10, 11, 24.9);
    geomancersWraps.createOwlTree(10, 11, 24.9);
    geomancersWraps.createWhaleTree(10, 11, 14.9);
    list.add(geomancersWraps);
  }

  private static void fillGeomancersJerkin() {
    int id = 14216;
    MultiBonus geomancersJerkin = new MultiBonus("Geomancer's Jerkin", id);
    geomancersJerkin.createArcaneWrathTree(23, 24, 3.9);
    geomancersJerkin.createFrozenWrathTree(23, 24, 3.5);
    geomancersJerkin.createIntellectTree(16, 17, 10.5);
    geomancersJerkin.createShadowWrathTree(23, 24, 2.7);
    geomancersJerkin.createSpiritTree(16, 17, 6.7);
    geomancersJerkin.createStaminaTree(16, 17, 5.1);
    
    geomancersJerkin.createEagleTree(10, 11, 27.0);
    geomancersJerkin.createOwlTree(10, 11, 26.3);
    geomancersJerkin.createWhaleTree(10, 11, 14.1);
    list.add(geomancersJerkin);
  }

  private static void fillGaeasTunic() {
    int id = 14277;
    MultiBonus gaeasTunic = new MultiBonus("Gaea's Tunic", id);
    gaeasTunic.createArcaneResistanceTree(22, 23, 0.3);
    gaeasTunic.createArcaneWrathTree(31, 33, 9.8);
    gaeasTunic.createFireResistanceTree(22, 23, 0.4);
    gaeasTunic.createFrostResistanceTree(23, 23, 0.1);
    gaeasTunic.createFrozenWrathTree(31, 33, 7.1);
    gaeasTunic.createIntellectTree(22, 23, 6.5);
    gaeasTunic.createNatureResistanceTree(22, 23, 0.4);
    gaeasTunic.createShadowResistanceTree(22, 23, 0.3);
    gaeasTunic.createShadowWrathTree(31, 33, 4.6);
    gaeasTunic.createSpiritTree(22, 23, 8.6);
    gaeasTunic.createStaminaTree(22, 23, 6.3);
    
    gaeasTunic.createEagleTree(14, 15, 15.4);
    gaeasTunic.createOwlTree(14, 15, 23.9);
    gaeasTunic.createWhaleTree(14, 15, 16.2);
    list.add(gaeasTunic);
  }

  private static void fillGaeasRaiment() {
    int id = 14275;
    MultiBonus gaeasRaiment = new MultiBonus("Gaea's Raiment", id);
    gaeasRaiment.createArcaneResistanceTree(22, 23, 0.3);
    gaeasRaiment.createArcaneWrathTree(31, 33, 11.0);
    gaeasRaiment.createFireResistanceTree(22, 23, 0.5);
    gaeasRaiment.createFrostResistanceTree(22, 23, 0.5);
    gaeasRaiment.createFrozenWrathTree(31, 33, 8.2);
    gaeasRaiment.createIntellectTree(22, 23, 7.0);
    gaeasRaiment.createNatureResistanceTree(22, 23, 0.3);
    gaeasRaiment.createShadowResistanceTree(22, 23, 0.4);
    gaeasRaiment.createShadowWrathTree(31, 33, 5.3);
    gaeasRaiment.createSpiritTree(22, 23, 9.0);
    gaeasRaiment.createStaminaTree(22, 23, 5.3);
    
    gaeasRaiment.createEagleTree(14, 15, 10.7);
    gaeasRaiment.createOwlTree(14, 15, 23.5);
    gaeasRaiment.createWhaleTree(14, 15, 18.1);
    list.add(gaeasRaiment);
  }

  private static void fillEternalWraps() {
    int id = 14336;
    MultiBonus eternalWraps = new MultiBonus("Eternal Wraps", id);
    eternalWraps.createEagleTree(19, 19, 35.6);
    eternalWraps.createOwlTree(19, 19, 45.5);
    eternalWraps.createWhaleTree(19, 19, 18.8);
    list.add(eternalWraps);
  }

  private static void fillEternalChestguard() {
    int id = 14328;
    MultiBonus eternalChestguard = new MultiBonus("Eternal Chestguard", id);
    eternalChestguard.createFrozenWrathTree(40, 40, 15.9);
    eternalChestguard.createIntellectTree(29, 29, 15.2);
    
    eternalChestguard.createEagleTree(19, 19, 20.3);
    eternalChestguard.createOwlTree(19, 19, 26.1);
    eternalChestguard.createWhaleTree(19, 19, 22.5);
    list.add(eternalChestguard);
  }

  private static void fillEmbersilkTunic() {
    int id = 14230;
    MultiBonus embersilkTunic = new MultiBonus("Embersilk Tunic", id);
    embersilkTunic.createArcaneWrathTree(23, 24, 3.7);
    embersilkTunic.createFrozenWrathTree(23, 24, 4.2);
    embersilkTunic.createIntellectTree(16, 17, 9.7);
    embersilkTunic.createShadowWrathTree(23, 24, 2.7);
    embersilkTunic.createSpiritTree(16, 17, 6.5);
    embersilkTunic.createStaminaTree(16, 17, 4.7);
    
    embersilkTunic.createEagleTree(10, 11, 28.6);
    embersilkTunic.createOwlTree(10, 11, 26.0);
    embersilkTunic.createWhaleTree(10, 11, 13.9);
    list.add(embersilkTunic);
  }

  private static void fillEmbersilkRobes() {
    int id = 14234;
    MultiBonus embersilkRobes = new MultiBonus("Embersilk Robes", id);
    embersilkRobes.createArcaneWrathTree(23, 24, 4.6);
    embersilkRobes.createFrozenWrathTree(23, 24, 4.4);
    embersilkRobes.createIntellectTree(16, 17, 10.1);
    embersilkRobes.createShadowWrathTree(23, 24, 3.1);
    embersilkRobes.createSpiritTree(16, 17, 7.4);
    embersilkRobes.createStaminaTree(16, 17, 5.5);
    
    embersilkRobes.createEagleTree(10, 11, 22.9);
    embersilkRobes.createOwlTree(10, 11, 26.7);
    embersilkRobes.createWhaleTree(10, 11, 15.3);
    list.add(embersilkRobes);
  }

  private static void fillElegantTunic() {
    int id = 10218;
    MultiBonus elegantTunic = new MultiBonus("Elegant Tunic", id);
    elegantTunic.createArcaneWrathTree(39, 40, 7.5);
    elegantTunic.createFireResistanceTree(27, 27, 0.4);
    elegantTunic.createFrostResistanceTree(27, 27, 0.6);
    elegantTunic.createFrozenWrathTree(39, 40, 9.1);
    elegantTunic.createIntellectTree(27, 28, 7.2);
    elegantTunic.createNatureResistanceTree(28, 28, 0.4);
    elegantTunic.createShadowWrathTree(39, 40, 9.1);
    elegantTunic.createSpiritTree(27, 28, 6.0);
    elegantTunic.createStaminaTree(27, 28, 5.6);
    
    elegantTunic.createEagleTree(17, 18, 15.6);
    elegantTunic.createOwlTree(17, 18, 24.7);
    elegantTunic.createWhaleTree(17, 18, 14.1);
    list.add(elegantTunic);
  }

  private static void fillElegantRobes() {
    int id = 10215;
    MultiBonus elegantRobes = new MultiBonus("Elegant Robes", id);
    elegantRobes.createArcaneWrathTree(39, 40, 7.8);
    elegantRobes.createFireResistanceTree(27, 27, 0.4);
    elegantRobes.createFrozenWrathTree(39, 40, 8.6);
    elegantRobes.createIntellectTree(27, 28, 7.8);
    elegantRobes.createNatureResistanceTree(27, 27, 0.2);
    elegantRobes.createShadowWrathTree(39, 40, 7.8);
    elegantRobes.createSpiritTree(27, 28, 6.7);
    elegantRobes.createStaminaTree(27, 28, 6.3);
    
    elegantRobes.createEagleTree(17, 18, 15.1);
    elegantRobes.createOwlTree(17, 18, 24.4);
    elegantRobes.createWhaleTree(17, 18, 15.0);
    list.add(elegantRobes);
  }

  private static void fillEldersRobe() {
    int id = 7369;
    MultiBonus eldersRobe = new MultiBonus("Elder's Robe", id);
    eldersRobe.createArcaneWrathTree(19, 20, 4.8);
    eldersRobe.createFrozenWrathTree(19, 20, 4.1);
    eldersRobe.createIntellectTree(13, 14, 11.5);
    eldersRobe.createShadowWrathTree(19, 20, 2.5);
    eldersRobe.createSpiritTree(13, 14, 7.4);
    eldersRobe.createStaminaTree(13, 14, 4.9);
    
    eldersRobe.createEagleTree(8, 9, 18.4);
    eldersRobe.createOwlTree(8, 9, 32.4);
    eldersRobe.createWhaleTree(8, 9, 14.0);
    list.add(eldersRobe);
  }

  private static void fillEldersPaddedArmor() {
    int id = 7353;
    MultiBonus eldersPaddedArmor = new MultiBonus("Elder's Padded Armor", id);
    eldersPaddedArmor.createArcaneWrathTree(19, 20, 4.0);
    eldersPaddedArmor.createFrozenWrathTree(19, 20, 3.5);
    eldersPaddedArmor.createIntellectTree(13, 14, 12.7);
    eldersPaddedArmor.createShadowWrathTree(19, 20, 2.2);
    eldersPaddedArmor.createSpiritTree(13, 14, 6.6);
    eldersPaddedArmor.createStaminaTree(13, 14, 4.5);
    
    eldersPaddedArmor.createEagleTree(8, 9, 20.1);
    eldersPaddedArmor.createOwlTree(8, 9, 33.4);
    eldersPaddedArmor.createWhaleTree(8, 9, 13.2);
    list.add(eldersPaddedArmor);
  }

  private static void fillDuskwovenTunic() {
    int id = 10057;
    MultiBonus duskwovenTunic = new MultiBonus("Duskwoven Tunic", id);
    duskwovenTunic.createArcaneResistanceTree(24, 25, 0.3);
    duskwovenTunic.createArcaneWrathTree(34, 36, 8.9);
    duskwovenTunic.createFireResistanceTree(24, 25, 0.4);
    duskwovenTunic.createFrostResistanceTree(24, 25, 0.3);
    duskwovenTunic.createFrozenWrathTree(34, 36, 8.0);
    duskwovenTunic.createIntellectTree(24, 25, 6.3);
    duskwovenTunic.createNatureResistanceTree(24, 25, 0.3);
    duskwovenTunic.createShadowResistanceTree(24, 25, 0.4);
    duskwovenTunic.createShadowWrathTree(34, 36, 5.9);
    duskwovenTunic.createSpiritTree(24, 25, 8.7);
    duskwovenTunic.createStaminaTree(24, 25, 6.0);
    
    duskwovenTunic.createEagleTree(15, 16, 12.9);
    duskwovenTunic.createOwlTree(15, 16, 24.2);
    duskwovenTunic.createWhaleTree(15, 16, 17.3);
    list.add(duskwovenTunic);
  }

  private static void fillDuskwovenRobe() {
    int id = 10065;
    MultiBonus duskwovenRobe = new MultiBonus("Duskwoven Robe", id);
    duskwovenRobe.createArcaneResistanceTree(14, 15, 0.5);
    duskwovenRobe.createArcaneWrathTree(34, 36, 10.0);
    duskwovenRobe.createFireResistanceTree(24, 25, 0.7);
    duskwovenRobe.createFrostResistanceTree(24, 25, 0.3);
    duskwovenRobe.createFrozenWrathTree(34, 36, 8.4);
    duskwovenRobe.createIntellectTree(24, 25, 6.5);
    duskwovenRobe.createNatureResistanceTree(24, 25, 0.4);
    duskwovenRobe.createShadowResistanceTree(24, 25, 0.4);
    duskwovenRobe.createShadowWrathTree(34, 36, 6.2);
    duskwovenRobe.createSpiritTree(24, 25, 8.8);
    duskwovenRobe.createStaminaTree(24, 25, 6.0);
    
    duskwovenRobe.createEagleTree(15, 16, 11.2);
    duskwovenRobe.createOwlTree(15, 16, 22.4);
    duskwovenRobe.createWhaleTree(15, 16, 18.4);
    list.add(duskwovenRobe);
  }

  private static void fillDurableTunic() {
    int id = 9819;
    MultiBonus durableTunic = new MultiBonus("Durable Tunic", id);
    durableTunic.createArcaneWrathTree(19, 20, 3.8);
    durableTunic.createFrozenWrathTree(19, 20, 3.3);
    durableTunic.createIntellectTree(13, 14, 13.2);
    durableTunic.createShadowWrathTree(19, 20, 2.0);
    durableTunic.createSpiritTree(13, 14, 6.5);
    durableTunic.createStaminaTree(13, 14, 4.6);
    
    durableTunic.createEagleTree(8, 9, 19.0);
    durableTunic.createOwlTree(8, 9, 34.9);
    durableTunic.createWhaleTree(8, 9, 12.7);
    list.add(durableTunic);
  }

  private static void fillDurableRobe() {
    int id = 9826;
    MultiBonus durableRobe = new MultiBonus("Durable Robe", id);
    durableRobe.createArcaneWrathTree(19, 20, 4.1);
    durableRobe.createFrozenWrathTree(19, 20, 3.7);
    durableRobe.createIntellectTree(13, 14, 12.5);
    durableRobe.createShadowWrathTree(19, 20, 2.1);
    durableRobe.createSpiritTree(13, 14, 6.5);
    durableRobe.createStaminaTree(13, 14, 4.8);
    
    durableRobe.createEagleTree(8, 9, 17.8);
    durableRobe.createOwlTree(8, 9, 35.0);
    durableRobe.createWhaleTree(8, 9, 13.4);
    list.add(durableRobe);
  }

  private static void fillDisciplesVest() {
    int id = 6266;
    MultiBonus disciplesVest = new MultiBonus("Disciple's Vest", id);
    disciplesVest.createArcaneWrathTree(4, 6, 5.1);
    disciplesVest.createFrozenWrathTree(4, 6, 4.9);
    disciplesVest.createIntellectTree(3, 4, 9.9);
    disciplesVest.createShadowWrathTree(4, 6, 3.6);
    disciplesVest.createSpiritTree(3, 4, 7.0);
    disciplesVest.createStaminaTree(3, 4, 5.6);
    
    disciplesVest.createEagleTree(1, 2, 18.9);
    disciplesVest.createOwlTree(1, 2, 30.9);
    disciplesVest.createWhaleTree(1, 2, 13.9);
    list.add(disciplesVest);
  }

  private static void fillDisciplesRobe() {
    int id = 6512;
    MultiBonus disciplesRobe = new MultiBonus("Disciple's Robe", id);
    disciplesRobe.createArcaneWrathTree(4, 6, 5.7);
    disciplesRobe.createFrozenWrathTree(4, 6, 5.8);
    disciplesRobe.createIntellectTree(3, 4, 8.8);
    disciplesRobe.createShadowWrathTree(4, 6, 4.2);
    disciplesRobe.createSpiritTree(3, 4, 8.1);
    disciplesRobe.createStaminaTree(3, 4, 5.7);
    
    disciplesRobe.createEagleTree(1, 2, 18.3);
    disciplesRobe.createOwlTree(1, 2, 28.3);
    disciplesRobe.createWhaleTree(1, 2, 14.9);
    list.add(disciplesRobe);
  }

  private static void fillDarkmistWraps() {
    int id = 14244;
    MultiBonus darkmistWraps = new MultiBonus("Darkmist Wraps", id);
    darkmistWraps.createArcaneWrathTree(27, 29, 6.0);
    darkmistWraps.createFrozenWrathTree(27, 29, 5.4);
    darkmistWraps.createIntellectTree(19, 20, 7.8);
    darkmistWraps.createShadowWrathTree(27, 29, 3.3);
    darkmistWraps.createSpiritTree(19, 20, 9.2);
    darkmistWraps.createStaminaTree(19, 20, 6.6);
    
    darkmistWraps.createEagleTree(12, 13, 18.4);
    darkmistWraps.createOwlTree(12, 13, 25.0);
    darkmistWraps.createWhaleTree(12, 13, 18.4);
    list.add(darkmistWraps);
  }

  private static void fillDarkmistArmor() {
    int id = 14237;
    MultiBonus darkmistArmor = new MultiBonus("Darkmist Armor", id);
    darkmistArmor.createArcaneWrathTree(27, 29, 5.4);
    darkmistArmor.createFrozenWrathTree(27, 29, 5.2);
    darkmistArmor.createIntellectTree(19, 20, 7.9);
    darkmistArmor.createShadowWrathTree(27, 29, 3.4);
    darkmistArmor.createSpiritTree(19, 20, 8.1);
    darkmistArmor.createStaminaTree(19, 20, 6.3);
    
    darkmistArmor.createEagleTree(12, 13, 20.4);
    darkmistArmor.createOwlTree(12, 13, 25.8);
    darkmistArmor.createWhaleTree(12, 13, 17.5);
    list.add(darkmistArmor);
  }

  private static void fillCouncillorsTunic() {
    int id = 10104;
    MultiBonus councillorsTunic = new MultiBonus("Councillor's Tunic", id);
    councillorsTunic.createArcaneResistanceTree(25, 26, 0.2);
    councillorsTunic.createArcaneWrathTree(36, 37, 8.2);
    councillorsTunic.createFireResistanceTree(25, 26, 0.6);
    councillorsTunic.createFrostResistanceTree(25, 26, 0.3);
    councillorsTunic.createFrozenWrathTree(36, 37, 8.5);
    councillorsTunic.createIntellectTree(25, 26, 7.4);
    councillorsTunic.createNatureResistanceTree(25, 26, 0.3);
    councillorsTunic.createShadowResistanceTree(25, 26, 0.2);
    councillorsTunic.createShadowWrathTree(36, 37, 7.4);
    councillorsTunic.createSpiritTree(25, 26, 6.6);
    councillorsTunic.createStaminaTree(25, 26, 6.1);
    
    councillorsTunic.createEagleTree(16, 17, 14.7);
    councillorsTunic.createOwlTree(16, 17, 24.2);
    councillorsTunic.createWhaleTree(16, 17, 15.3);
    list.add(councillorsTunic);
  }

  private static void fillCouncillorsRobes() {
    int id = 10102;
    MultiBonus councillorsRobe = new MultiBonus("Councillor's Robes", id);
    councillorsRobe.createArcaneResistanceTree(26, 26, 0.2);
    councillorsRobe.createArcaneWrathTree(36, 37, 8.7);
    councillorsRobe.createFireResistanceTree(25, 26, 0.5);
    councillorsRobe.createFrostResistanceTree(26, 26, 0.3);
    councillorsRobe.createFrozenWrathTree(36, 37, 9.0);
    councillorsRobe.createIntellectTree(25, 26, 6.9);
    councillorsRobe.createNatureResistanceTree(25, 26, 0.4);
    councillorsRobe.createShadowResistanceTree(25, 26, 0.5);
    councillorsRobe.createShadowWrathTree(36, 37, 7.7);
    councillorsRobe.createSpiritTree(25, 26, 8.3);
    councillorsRobe.createStaminaTree(25, 26, 5.6);
    
    councillorsRobe.createEagleTree(16, 17, 12.4);
    councillorsRobe.createOwlTree(16, 17, 23.7);
    councillorsRobe.createWhaleTree(16, 17, 15.9);
    list.add(councillorsRobe);
  }

  private static void fillConjurersVest() {
    int id = 9844;
    MultiBonus conjurersVest = new MultiBonus("Conjurer's Vest", id);
    conjurersVest.createArcaneWrathTree(21, 23, 4.0);
    conjurersVest.createFrozenWrathTree(21, 23, 3.6);
    conjurersVest.createIntellectTree(15, 16, 11.5);
    conjurersVest.createShadowWrathTree(21, 23, 2.5);
    conjurersVest.createSpiritTree(15, 16, 7.0);
    conjurersVest.createStaminaTree(15, 16, 5.3);
    
    conjurersVest.createEagleTree(9, 10, 23.9);
    conjurersVest.createOwlTree(9, 10, 27.7);
    conjurersVest.createWhaleTree(9, 10, 14.6);
    list.add(conjurersVest);
  }

  private static void fillConjurersRobe() {
    int id = 9852;
    MultiBonus conjurersRobe = new MultiBonus("Conjurer's Robe", id);
    conjurersRobe.createArcaneWrathTree(21, 23, 4.6);
    conjurersRobe.createFrozenWrathTree(21, 23, 3.9);
    conjurersRobe.createIntellectTree(15, 16, 11.1);
    conjurersRobe.createShadowWrathTree(21, 23, 2.8);
    conjurersRobe.createSpiritTree(15, 16, 7.7);
    conjurersRobe.createStaminaTree(15, 16, 5.7);
    
    conjurersRobe.createEagleTree(9, 10, 20.9);
    conjurersRobe.createOwlTree(9, 10, 27.6);
    conjurersRobe.createWhaleTree(9, 10, 15.8);
    list.add(conjurersRobe);
  }

  private static void fillCelestialTunic() {
    int id = 14308;
    MultiBonus celestialTunic = new MultiBonus("Celestial Tunic", id);
    celestialTunic.createArcaneWrathTree(39, 40, 8.1);
    celestialTunic.createFrozenWrathTree(39, 40, 8.1);
    celestialTunic.createIntellectTree(27, 28, 7.0);
    celestialTunic.createShadowWrathTree(39, 40, 7.5);
    celestialTunic.createSpiritTree(27, 28, 5.9);
    celestialTunic.createStaminaTree(27, 28, 5.9);
    
    celestialTunic.createEagleTree(17, 18, 14.4);
    celestialTunic.createOwlTree(17, 18, 24.9);
    celestialTunic.createWhaleTree(17, 18, 18.1);
    list.add(celestialTunic);
  }

  private static void fillCelestialSilkRobes() {
    int id = 14317;
    MultiBonus celestialSilkRobes = new MultiBonus("Celestial Silk Robes", id);
    celestialSilkRobes.createArcaneWrathTree(39, 40, 7.7);
    celestialSilkRobes.createFrozenWrathTree(39, 40, 8.9);
    celestialSilkRobes.createIntellectTree(27, 28, 6.7);
    celestialSilkRobes.createShadowWrathTree(39, 40, 8.8);
    celestialSilkRobes.createSpiritTree(27, 28, 7.2);
    celestialSilkRobes.createStaminaTree(27, 28, 6.1);
    
    celestialSilkRobes.createEagleTree(17, 18, 13.6);
    celestialSilkRobes.createOwlTree(17, 18, 26.6);
    celestialSilkRobes.createWhaleTree(17, 18, 14.4);
    list.add(celestialSilkRobes);
  }

  private static void fillBuccaneersVest() {
    int id = 14175;
    MultiBonus buccaneersVest = new MultiBonus("Buccaneer's Vest", id);
    buccaneersVest.createArcaneWrathTree(10, 11, 4.6);
    buccaneersVest.createFrozenWrathTree(10, 11, 4.6);
    buccaneersVest.createIntellectTree(7, 8, 11.9);
    buccaneersVest.createShadowWrathTree(10, 11, 3.3);
    buccaneersVest.createSpiritTree(7, 8, 7.6);
    buccaneersVest.createStaminaTree(7, 8, 5.3);
    
    buccaneersVest.createEagleTree(4, 5, 15.2);
    buccaneersVest.createOwlTree(4, 5, 33.5);
    buccaneersVest.createWhaleTree(4, 5, 14.0);
    list.add(buccaneersVest);
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
