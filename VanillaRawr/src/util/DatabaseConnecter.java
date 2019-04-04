package util;

import java.util.ArrayList;

/**
 * A Class to get all Data from the Database. You can get all IDs, Names and Icons from their 
 * respective Methods.
 * @author Haeldeus
 * @version 1.0
 */
public class DatabaseConnecter {
  
  /**
   * Returns all IDs, that are used by Items.
   * @return  All IDs, that are used by Items as an Array of Integers.
   * @since 1.0
   */
  public static int[] getAllIDs() {
    /*Storing the IDs in an ArrayList is dynamic, so it's easier to be coded this way. 
     * It has to be passed to the Object as an Array because of spaghetti Code in the 
     * other Classes*/
    ArrayList<int[]> list = new ArrayList<int[]>();
    int[] clothChest = db.armor.cloth.Chest.getIDs(); 
    list.add(clothChest);
    int[] clothFeet = db.armor.cloth.Feet.getIDs(); 
    list.add(clothFeet);
    int[] clothHands = db.armor.cloth.Hands.getIDs(); 
    list.add(clothHands);
    int[] clothHead = db.armor.cloth.Head.getIDs(); 
    list.add(clothHead);
    int[] clothLegs = db.armor.cloth.Legs.getIDs();
    list.add(clothLegs);
    int[] clothShoulder = db.armor.cloth.Shoulder.getIDs(); 
    list.add(clothShoulder);
    int[] clothWaist = db.armor.cloth.Waist.getIDs(); 
    list.add(clothWaist);
    int[] clothWrist = db.armor.cloth.Wrist.getIDs(); 
    list.add(clothWrist);
    
    int[] leatherChest = db.armor.leather.Chest.getIDs(); 
    list.add(leatherChest);
    int[] leatherFeet = db.armor.leather.Feet.getIDs(); 
    list.add(leatherFeet);
    int[] leatherHands = db.armor.leather.Hands.getIDs(); 
    list.add(leatherHands);
    int[] leatherHead = db.armor.leather.Head.getIDs(); 
    list.add(leatherHead);
    int[] leatherLegs = db.armor.leather.Legs.getIDs(); 
    list.add(leatherLegs);
    int[] leatherShoulder = db.armor.leather.Shoulder.getIDs(); 
    list.add(leatherShoulder);
    int[] leatherWaist = db.armor.leather.Waist.getIDs(); 
    list.add(leatherWaist);
    int[] leatherWrist = db.armor.leather.Wrist.getIDs(); 
    list.add(leatherWrist);
    
    int[] mailChest = db.armor.mail.Chest.getIDs(); 
    list.add(mailChest);
    int[] mailFeet = db.armor.mail.Feet.getIDs(); 
    list.add(mailFeet);
    int[] mailHands = db.armor.mail.Hands.getIDs(); 
    list.add(mailHands);
    int[] mailHead = db.armor.mail.Head.getIDs(); 
    list.add(mailHead);
    int[] mailLegs = db.armor.mail.Legs.getIDs(); 
    list.add(mailLegs);
    int[] mailShoulder = db.armor.mail.Shoulder.getIDs(); 
    list.add(mailShoulder);
    int[] mailWaist = db.armor.mail.Waist.getIDs(); 
    list.add(mailWaist);
    int[] mailWrist = db.armor.mail.Wrist.getIDs(); 
    list.add(mailWrist);
    
    int[] plateChest = db.armor.plate.Chest.getIDs(); 
    list.add(plateChest);
    int[] plateFeet = db.armor.plate.Feet.getIDs(); 
    list.add(plateFeet);
    int[] plateHands = db.armor.plate.Hands.getIDs(); 
    list.add(plateHands);
    int[] plateHead = db.armor.plate.Head.getIDs(); 
    list.add(plateHead);
    int[] plateLegs = db.armor.plate.Legs.getIDs(); 
    list.add(plateLegs);
    int[] plateShoulder = db.armor.plate.Shoulder.getIDs(); 
    list.add(plateShoulder);
    int[] plateWaist = db.armor.plate.Waist.getIDs(); 
    list.add(plateWaist);
    int[] plateWrist = db.armor.plate.Wrist.getIDs(); 
    list.add(plateWrist);
    
    int[] amulet = db.armor.other.misc.Amulet.getIDs(); 
    list.add(amulet);
    int[] offhand = db.armor.other.misc.Offhand.getIDs();
    list.add(offhand);
    int[] ring = db.armor.other.misc.Ring.getIDs();
    list.add(ring);
    int[] shirt = db.armor.other.misc.Shirt.getIDs();
    list.add(shirt);
    int[] tabard = db.armor.other.misc.Tabard.getIDs();
    list.add(tabard);
    int[] trinket = db.armor.other.misc.Trinket.getIDs();
    list.add(trinket);
    int[] cloak = db.armor.other.Cloak.getIDs();
    list.add(cloak);
    int[] shield = db.armor.other.Shield.getIDs();
    list.add(shield);
    
    int[] idol = db.armor.relics.Idol.getIDs();
    list.add(idol);
    int[] libram = db.armor.relics.Libram.getIDs();
    list.add(libram);
    int[] totem = db.armor.relics.Totem.getIDs();
    list.add(totem);
    
    int[] ohAxe = db.weapon.onehanded.Axe.getIDs();
    list.add(ohAxe);
    int[] ohDagger = db.weapon.onehanded.Dagger.getIDs();
    list.add(ohDagger);
    int[] ohFist = db.weapon.onehanded.Fist.getIDs();
    list.add(ohFist);
    int[] ohMace = db.weapon.onehanded.Mace.getIDs();
    list.add(ohMace);
    int[] ohSword = db.weapon.onehanded.Sword.getIDs();
    list.add(ohSword);
    
    int[] bow = db.weapon.ranged.Bow.getIDs();
    list.add(bow);
    int[] crossbow = db.weapon.ranged.Crossbow.getIDs();
    list.add(crossbow);
    int[] gun = db.weapon.ranged.Gun.getIDs();
    list.add(gun);
    int[] thrown = {}/*db.weapon.ranged.Thrown.getIDs()*/;
    list.add(thrown);    //TODO: ADD THROWNS!
    int[] wand = db.weapon.ranged.Wand.getIDs();
    list.add(wand);
    
    int[] thAxe = db.weapon.twohanded.Axe.getIDs();
    list.add(thAxe);
    int[] thMace = db.weapon.twohanded.Mace.getIDs();
    list.add(thMace);
    int[] thPolearm = db.weapon.twohanded.Polearm.getIDs();
    list.add(thPolearm);
    int[] thStaff = db.weapon.twohanded.Staff.getIDs();
    list.add(thStaff);
    int[] thSword = db.weapon.twohanded.Sword.getIDs();
    list.add(thSword);
    
    int[] result;   //The Array, that will be returned later
    int size;       //The Size of the Array to be returned. Will be computed in the next step.
    
    size = 0;
    for (int[] i : list) {
      //The Array needs to have the length of all other Array's lengths combined.
      size += i.length;   
    }

    result = new int[size];   //Size is now definite, so the Array can be created
    
    //Still not sure, if this is really needed, as the next Method doesn't use this Parameter
    Integer index = 0;        
    
    addListToArray(result, list, index);  //Adds the List to the Array to be returned.
    
    //Sorts the Array alphabetically to make it easier to use.
    quickSort(result, 0, result.length - 1);  
    /*
    for (int i = 0; i < result.length; i++) {
      if ((i+1)%10 != 0)
        System.out.print(result[i] + " ");
      else {
        int line = (int)(i/10);
        System.out.print(result[i] + "          l:" + line);
        System.out.println();
      }
    } */
    
    //A Check, if every Item from the List was added to the Array. 
    //If so, the Array is complete and can be used.
    if (check(result, list)) {
      return result;
    } else {  //Throws an Error to ensure, the User can see that something went wrong. 
      //TODO sysclose?
      Exception e = new Exception("An Error happened. Not all IDs were assigned "
          + "correctly. Please check the code!");
      System.err.println(e);
      return null;
    }
  }

  /**
   * Returns all Itemnames.
   * @return  The Names of all Items, that are used in the Database as an Array of Strings.
   * @since 1.0
   */
  public static String[] getAllNames() {
    /*Storing the IDs in an ArrayList is dynamic, so it's easier to be coded this way. 
     * It has to be passed to the Object as an Array because of spaghetti Code in the 
     * other Classes*/
    //TODO Commentary
    ArrayList<String[]> list = new ArrayList<String[]>();
    String[] clothChest = db.armor.cloth.Chest.getNames();
    list.add(clothChest);
    String[] clothFeet = db.armor.cloth.Feet.getNames();
    list.add(clothFeet);
    String[] clothHands = db.armor.cloth.Hands.getNames();
    list.add(clothHands);
    String[] clothHead = db.armor.cloth.Head.getNames();
    list.add(clothHead);
    String[] clothLegs = db.armor.cloth.Legs.getNames();
    list.add(clothLegs);
    String[] clothShoulder = db.armor.cloth.Shoulder.getNames();
    list.add(clothShoulder);
    String[] clothWaist = db.armor.cloth.Waist.getNames();
    list.add(clothWaist);
    String[] clothWrist = db.armor.cloth.Wrist.getNames();
    list.add(clothWrist);
    
    String[] leatherChest = db.armor.leather.Chest.getNames();
    list.add(leatherChest);
    String[] leatherFeet = db.armor.leather.Feet.getNames();
    list.add(leatherFeet);
    String[] leatherHands = db.armor.leather.Hands.getNames();
    list.add(leatherHands);
    String[] leatherHead = db.armor.leather.Head.getNames();
    list.add(leatherHead);
    String[] leatherLegs = db.armor.leather.Legs.getNames();
    list.add(leatherLegs);
    String[] leatherShoulder = db.armor.leather.Shoulder.getNames();
    list.add(leatherShoulder);
    String[] leatherWaist = db.armor.leather.Waist.getNames();
    list.add(leatherWaist);
    String[] leatherWrist = db.armor.leather.Wrist.getNames();
    list.add(leatherWrist);
    
    String[] mailChest = db.armor.mail.Chest.getNames();
    list.add(mailChest);
    String[] mailFeet = db.armor.mail.Feet.getNames();
    list.add(mailFeet);
    String[] mailHands = db.armor.mail.Hands.getNames();
    list.add(mailHands);
    String[] mailHead = db.armor.mail.Head.getNames();
    list.add(mailHead);
    String[] mailLegs = db.armor.mail.Legs.getNames();
    list.add(mailLegs);
    String[] mailShoulder = db.armor.mail.Shoulder.getNames();
    list.add(mailShoulder);
    String[] mailWaist = db.armor.mail.Waist.getNames();
    list.add(mailWaist);
    String[] mailWrist = db.armor.mail.Wrist.getNames();
    list.add(mailWrist);
    
    String[] plateChest = db.armor.plate.Chest.getNames();
    list.add(plateChest);
    String[] plateFeet = db.armor.plate.Feet.getNames();
    list.add(plateFeet);
    String[] plateHands = db.armor.plate.Hands.getNames();
    list.add(plateHands);
    String[] plateHead = db.armor.plate.Head.getNames();
    list.add(plateHead);
    String[] plateLegs = db.armor.plate.Legs.getNames();
    list.add(plateLegs);
    String[] plateShoulder = db.armor.plate.Shoulder.getNames();
    list.add(plateShoulder);
    String[] plateWaist = db.armor.plate.Waist.getNames();
    list.add(plateWaist);
    String[] plateWrist = db.armor.plate.Wrist.getNames();
    list.add(plateWrist);
    
    String[] amulet = db.armor.other.misc.Amulet.getNames();
    list.add(amulet);
    String[] offhand = db.armor.other.misc.Offhand.getNames();
    list.add(offhand);
    String[] ring = db.armor.other.misc.Ring.getNames();
    list.add(ring);
    String[] shirt = db.armor.other.misc.Shirt.getNames();
    list.add(shirt);
    String[] tabard = db.armor.other.misc.Tabard.getNames();
    list.add(tabard);
    String[] trinket = db.armor.other.misc.Trinket.getNames();
    list.add(trinket);
    String[] cloak = db.armor.other.Cloak.getNames();
    list.add(cloak);
    String[] shield = db.armor.other.Shield.getNames();
    list.add(shield);
    
    String[] idol = db.armor.relics.Idol.getNames();
    list.add(idol);
    String[] libram = db.armor.relics.Libram.getNames();
    list.add(libram);
    String[] totem = db.armor.relics.Totem.getNames();
    list.add(totem);
    
    String[] ohAxe = db.weapon.onehanded.Axe.getNames();
    list.add(ohAxe);
    String[] ohDagger = db.weapon.onehanded.Dagger.getNames();
    list.add(ohDagger);
    String[] ohFist = db.weapon.onehanded.Fist.getNames();
    list.add(ohFist);
    String[] ohMace = db.weapon.onehanded.Mace.getNames();
    list.add(ohMace);
    String[] ohSword = db.weapon.onehanded.Sword.getNames();
    list.add(ohSword);
    
    String[] bow = db.weapon.ranged.Bow.getNames();
    list.add(bow);
    String[] crossbow = db.weapon.ranged.Crossbow.getNames();
    list.add(crossbow);
    String[] gun = db.weapon.ranged.Gun.getNames();
    list.add(gun);
    String[] thrown = {}/*db.weapon.ranged.Thrown.getNames()*/;
    list.add(thrown);    //TODO: ADD THROWNS!
    String[] wand = db.weapon.ranged.Wand.getNames();
    list.add(wand);
    
    String[] thAxe = db.weapon.twohanded.Axe.getNames();
    list.add(thAxe);
    String[] thMace = db.weapon.twohanded.Mace.getNames();
    list.add(thMace);
    String[] thPolearm = db.weapon.twohanded.Polearm.getNames();
    list.add(thPolearm);
    String[] thStaff = db.weapon.twohanded.Staff.getNames();
    list.add(thStaff);
    String[] thSword = db.weapon.twohanded.Sword.getNames();
    list.add(thSword);
    
    String[] result;
    int size;
    size = 0;
    for (String[] i : list) {
      size += i.length;
    }

    result = new String[size];
    Integer index = 0;
    
    addListToArray(result, list, index);
    
    if (check(result, list)) {
      return result;
    } else {
      Exception e = new Exception("An Error happened. Not all IDs were assigned "
          + "correctly. Please check the code!");
      System.err.println(e);
      return null;
    }
  }

  /**
   * Returns all Icons, that are used by Items.
   * @return All Icons, that are used by the Items in the Database as an Array of Strings.
   * @since 1.0
   */
  public static String[] getAllIcons() {
    /*Storing the IDs in an ArrayList is dynamic, so it's easier to be coded this way. 
     * It has to be passed to the Object as an Array because of spaghetti Code in the 
     * other Classes*/
    ArrayList<String[]> list = new ArrayList<String[]>();
    String[] clothChest = db.armor.cloth.Chest.getIcons();
    list.add(clothChest);
    String[] clothFeet = db.armor.cloth.Feet.getIcons();
    list.add(clothFeet);
    String[] clothHands = db.armor.cloth.Hands.getIcons();
    list.add(clothHands);
    String[] clothHead = db.armor.cloth.Head.getIcons();
    list.add(clothHead);
    String[] clothLegs = db.armor.cloth.Legs.getIcons();
    list.add(clothLegs);
    String[] clothShoulder = db.armor.cloth.Shoulder.getIcons();
    list.add(clothShoulder);
    String[] clothWaist = db.armor.cloth.Waist.getIcons();
    list.add(clothWaist);
    String[] clothWrist = db.armor.cloth.Wrist.getIcons();
    list.add(clothWrist);
    
    String[] leatherChest = db.armor.leather.Chest.getIcons();
    list.add(leatherChest);
    String[] leatherFeet = db.armor.leather.Feet.getIcons();
    list.add(leatherFeet);
    String[] leatherHands = db.armor.leather.Hands.getIcons();
    list.add(leatherHands);
    String[] leatherHead = db.armor.leather.Head.getIcons();
    list.add(leatherHead);
    String[] leatherLegs = db.armor.leather.Legs.getIcons();
    list.add(leatherLegs);
    String[] leatherShoulder = db.armor.leather.Shoulder.getIcons();
    list.add(leatherShoulder);
    String[] leatherWaist = db.armor.leather.Waist.getIcons();
    list.add(leatherWaist);
    String[] leatherWrist = db.armor.leather.Wrist.getIcons();
    list.add(leatherWrist);
    
    String[] mailChest = db.armor.mail.Chest.getIcons();
    list.add(mailChest);
    String[] mailFeet = db.armor.mail.Feet.getIcons();
    list.add(mailFeet);
    String[] mailHands = db.armor.mail.Hands.getIcons();
    list.add(mailHands);
    String[] mailHead = db.armor.mail.Head.getIcons();
    list.add(mailHead);
    String[] mailLegs = db.armor.mail.Legs.getIcons();
    list.add(mailLegs);
    String[] mailShoulder = db.armor.mail.Shoulder.getIcons();
    list.add(mailShoulder);
    String[] mailWaist = db.armor.mail.Waist.getIcons();
    list.add(mailWaist);
    String[] mailWrist = db.armor.mail.Wrist.getIcons();
    list.add(mailWrist);
    
    String[] plateChest = db.armor.plate.Chest.getIcons();
    list.add(plateChest);
    String[] plateFeet = db.armor.plate.Feet.getIcons();
    list.add(plateFeet);
    String[] plateHands = db.armor.plate.Hands.getIcons();
    list.add(plateHands);
    String[] plateHead = db.armor.plate.Head.getIcons();
    list.add(plateHead);
    String[] plateLegs = db.armor.plate.Legs.getIcons();
    list.add(plateLegs);
    String[] plateShoulder = db.armor.plate.Shoulder.getIcons();
    list.add(plateShoulder);
    String[] plateWaist = db.armor.plate.Waist.getIcons();
    list.add(plateWaist);
    String[] plateWrist = db.armor.plate.Wrist.getIcons();
    list.add(plateWrist);
    
    String[] amulet = db.armor.other.misc.Amulet.getIcons();
    list.add(amulet);
    String[] offhand = db.armor.other.misc.Offhand.getIcons();
    list.add(offhand);
    String[] ring = db.armor.other.misc.Ring.getIcons();
    list.add(ring);
    String[] shirt = db.armor.other.misc.Shirt.getIcons();
    list.add(shirt);
    String[] tabard = db.armor.other.misc.Tabard.getIcons();
    list.add(tabard);
    String[] trinket = db.armor.other.misc.Trinket.getIcons();
    list.add(trinket);
    String[] cloak = db.armor.other.Cloak.getIcons();
    list.add(cloak);
    String[] shield = db.armor.other.Shield.getIcons();
    list.add(shield);
    
    String[] idol = db.armor.relics.Idol.getIcons();
    list.add(idol);
    String[] libram = db.armor.relics.Libram.getIcons();
    list.add(libram);
    String[] totem = db.armor.relics.Totem.getIcons();
    list.add(totem);
    
    String[] ohAxe = db.weapon.onehanded.Axe.getIcons();
    list.add(ohAxe);
    String[] ohDagger = db.weapon.onehanded.Dagger.getIcons();
    list.add(ohDagger);
    String[] ohFist = db.weapon.onehanded.Fist.getIcons();
    list.add(ohFist);
    String[] ohMace = db.weapon.onehanded.Mace.getIcons();
    list.add(ohMace);
    String[] ohSword = db.weapon.onehanded.Sword.getIcons();
    list.add(ohSword);
    
    String[] bow = db.weapon.ranged.Bow.getIcons();
    list.add(bow);
    String[] crossbow = db.weapon.ranged.Crossbow.getIcons();
    list.add(crossbow);
    String[] gun = db.weapon.ranged.Gun.getIcons();
    list.add(gun);
    String[] thrown = {}/*db.weapon.ranged.Thrown.getIcons()*/;
    list.add(thrown);//TODO: ADD THROWNS!
    String[] wand = db.weapon.ranged.Wand.getIcons();
    list.add(wand);
    
    String[] thAxe = db.weapon.twohanded.Axe.getIcons();
    list.add(thAxe);
    String[] thMace = db.weapon.twohanded.Mace.getIcons();
    list.add(thMace);
    String[] thPolearm = db.weapon.twohanded.Polearm.getIcons();
    list.add(thPolearm);
    String[] thStaff = db.weapon.twohanded.Staff.getIcons();
    list.add(thStaff);
    String[] thSword = db.weapon.twohanded.Sword.getIcons();
    list.add(thSword);
    
    String[] result;
    int size;
    size = 0;
    for (String[] i : list) {
      size += i.length;
    }

    result = new String[size];
    Integer index = 0;
    
    addListToArray(result, list, index);
    /*
    for (int i = 0; i < result.length; i++) {
      if ((i+1)%3 != 0)
        System.out.print(result[i] + " ");
      else {
        int line = (int)((i+1)/3);
        System.out.print(result[i] + "          l:" + line);
        System.out.println();
      }
    } */
    
    if (check(result, list)) {
      return result;
    } else {
      Exception e = new Exception("An Error happened. Not all IDs were assigned "
          + "correctly. Please check the code!");
      System.err.println(e);
      return null;
    }
  }
  
  /**
   * Adds a given Integer-Array {@code arrayB} to the given Integer-Array {@code arrayA}. The first 
   * Element of {@code arrayB} will be at position {@code startIndex} in arrayA.
   * @param arrayA The Array, where the other Array will be added to.
   * @param arrayB The Array, that is added to {@code arrayA}.
   * @param startIndex The index, where the first Element of {@code arrayB} will be added at.
   * @return The Array {@code arrayA}, where {@code arrayB} was added to.
   * @throws ArrayIndexOutOfBoundsException If arrayB was longer than the remaining space in arrayA.
   * @since 1.0
   */
  private static int[] addArrayToArray(int[] arrayA, int[] arrayB, int startIndex) 
      throws ArrayIndexOutOfBoundsException {
    for (int i : arrayB) {
      try {
        arrayA[startIndex] = i;
        startIndex++;
      } catch (ArrayIndexOutOfBoundsException e) {
        throw(e);
      }
    }
    return arrayA;
  }
  
  /**
   * Adds a given String-Array {@code arrayB} to the given String-Array {@code arrayA}. The first 
   * Element of {@code arrayB} will be at position {@code startIndex} in ArrayA.
   * @param arrayA The Array, where the other Array will be added to.
   * @param arrayB The Array, that is added to {@code arrayA}.
   * @param startIndex The index, where the first Element of {@code arrayB} will be added at.
   * @return The Array {@code arrayA}, where {@code arrayB} was added to.
   * @throws ArrayIndexOutOfBoundsException If arrayB was longer than the remaining space in arrayA.
   * @since 1.0
   */
  private static String[] addArrayToArray(String[] arrayA, String[] arrayB, int startIndex) 
      throws ArrayIndexOutOfBoundsException {
    for (String s : arrayB) {
      try {
        arrayA[startIndex] = s;
        startIndex++;
      } catch (ArrayIndexOutOfBoundsException e) {
        throw(e);
      }
    }
    return arrayA;
  }
  
  /**
   * Adds the List of Integer-Arrays to the given Array.
   * @param array The Integer-Array, where all Arrays will be added to.
   * @param list The {@link ArrayList} of Integer-Arrays, that will be added to the given Array.
   * @param arraySize Unused at this Time. Will be checked later.
   * @return The given Array, where all other Arrays were added to.
   * @since 1.0
   */
  private static int[] addListToArray(int[] array, ArrayList<int[]> list, int arraySize) {
    //TODO: Is arraySize needed in any way?
    int index = 0; 
    for (int[] i : list) {
      try {
        addArrayToArray(array, i, index);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.err.println(e.getStackTrace());
        System.err.println("Array was to long to be added! Forcing exit....");
        System.exit(0);
      }
      index += i.length;
    }
    return array;
  }
  
  /**
   * Adds the List of String-Arrays to the given Array.
   * @param array The String-Array, where all Arrays will be added to.
   * @param list The {@link ArrayList} of String-Arrays, that will be added to the given Array.
   * @param arraySize Unused at this Time. Will be checked later.
   * @return The given Array, where all other Arrays were added to.
   * @since 1.0
   */
  private static String[] addListToArray(String[] array, ArrayList<String[]> list, int arraySize) {
    int index = 0; 
    for (String[] s : list) {
      try {
        addArrayToArray(array, s, index);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.err.println(e.getStackTrace());
        System.err.println("Array was to long to be added! Forcing exit....");
        System.exit(0);
      }
      index += s.length;
    }
    return array;
  }
  
  /**
   * Checks, if all Items of the given List were added to the given array.
   * @param arrayA The Array, that will be checked, if it's Elements are all the same as the Items 
   *     in the given List.
   * @param list The {@link ArrayList}, where all Items are stored in and that is used as Checksum.
   * @return {@code true}, if all Items were added to the List, {@code false} else.
   * @since 1.0
   */
  private static boolean check(int[] arrayA, ArrayList<int[]> list) {
    boolean triggered = false;
    for (int[] i : list) {
      for (int j : i) {
        for (int k = 0; k < arrayA.length; k++) {
          if (j == arrayA[k]) {
            break;
          } else {
            if (k == arrayA.length - 1) {
              Exception e = new Exception(j + " was not assigned.");
              System.err.println(e);
              triggered = true;
            }
          }
        }
      }
    }
    return !triggered;
  }

  /**
   * Checks, if all Items of the given List were added to the given array.
   * @param arrayA The Array, that will be checked, if it's Elements are all the same as the Items 
   *     in the given List.
   * @param list The {@link ArrayList}, where all Items are stored in and that is used as Checksum.
   * @return {@code true}, if all Items were added to the List, {@code false} else.
   * @since 1.0
   */
  private static boolean check(String[] arrayA, ArrayList<String[]> list) {
    boolean triggered = false;
    for (String[] s : list) {
      for (String t : s) {
        for (int k = 0; k < arrayA.length; k++) {
          if (t == arrayA[k]) {
            break;
          } else {
            if (k == arrayA.length - 1) {
              Exception e = new Exception(t + " was not assigned.");
              System.err.println(e);
              triggered = true;
            }
          }
        }
      }
    }
    return !triggered;
  }
  
  /**
   * Sorts the given Array x from start to end in a rising manner.
   * @param x  The Array of Integer.
   * @param start  The Start-Index, where the Algorithm starts sorting.
   * @param end The End-Index, where the Algorithm stops sorting.
   * @since 1.0
   */
  private static void quickSort(int[] x, int start, int end) {
    if (start < end) {
      int i = partition(x,start,end);
      quickSort(x, start, i - 1);
      quickSort(x, i + 1, end);
    }
  }
        
  /**
   * Used for the Quicksort-Algorithm. Sorts the given Array of Integers from {@code start} to 
   * {@code end}. Other possible entries will be ignored.
   * @param x The Array, that will be sorted.
   * @param start The index, where the Sorting will begin.
   * @param end The index, to where the Sorting will be done.
   * @return The index, to where the Array is sorted.
   * @see #quickSort(int[], int, int)
   * @since 1.0
   */
  private static int partition(int[] x, int start, int end) {
    int help;
    int pivot = x[end];
    int i = start;
    int j = end - 1;
    while (i <= j) {
      if (x[i] > pivot) {
        help = x[i]; 
        x[i] = x[j]; 
        x[j] = help;                             
        j--;
      } else { 
        i++;
      }
    }
    help = x[i];
    x[i] = x[end];
    x[end] = help;
    return i;
  }
  
  /**
   * The Main-Method, used to test all 3 Methods to fetch the Database.
   * @param args Unused.
   * @since 1.0
   */
  public static void main(String[] args) {
    getAllIDs();
    getAllNames();
    getAllIcons();
  }
}
