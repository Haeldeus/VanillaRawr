package db;

/**
 * A Class to Test the Database for consistency.
 * @author Haeldeus
 * @version 1.0
 */
public class Test {

  /**
   * Used for Testing-Issues.
   * @param args  Unused.
   */
  public static void main(String[] args) {
    db.random.weapons.melee.Daggers.getList();
    db.random.weapons.melee.OneHandAxes.getList();
    db.random.weapons.melee.OneHandMaces.getList();
    db.random.weapons.melee.OneHandSwords.getList();
    db.random.weapons.melee.Staffs.getList();
    db.random.weapons.melee.TwoHandAxes.getList();
    db.random.weapons.melee.TwoHandMaces.getList();
    db.random.weapons.melee.TwoHandSwords.getList();
    db.random.weapons.ranged.Bows.getList();
    db.random.weapons.ranged.Guns.getList();
    db.random.weapons.ranged.Wands.getList();
    db.random.armor.cloth.Chest.getList();
    db.random.armor.cloth.Feet.getList();
    System.out.println("Test ended! If there are no other Messages, the Database is complete and "
        + "correct.");
  //  System.out.println(util.DatabaseConnecter.getAllIDs().length);
  }
}
