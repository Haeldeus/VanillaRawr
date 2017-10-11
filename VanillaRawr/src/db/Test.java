package db;

import java.util.ArrayList;

import util.MultiBonus;

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
    int impl = 0;
    int all = 0;
    ArrayList<MultiBonus> tmp;
    tmp = db.random.weapons.melee.Daggers.getList();
    impl += tmp.size(); 
    all += db.random.weapons.melee.Daggers.getIDs().length;
    
    tmp = db.random.weapons.melee.OneHandAxes.getList();
    impl += tmp.size(); 
    all += db.random.weapons.melee.OneHandAxes.getIds().length;
    
    tmp = db.random.weapons.melee.OneHandMaces.getList();
    impl += tmp.size(); 
    all += db.random.weapons.melee.OneHandMaces.getIds().length;
    
    tmp = db.random.weapons.melee.OneHandSwords.getList();
    impl += tmp.size(); 
    all += db.random.weapons.melee.OneHandSwords.getIDs().length;
    
    tmp = db.random.weapons.melee.Staffs.getList();
    impl += tmp.size(); 
    all += db.random.weapons.melee.Staffs.getIDs().length;
    
    tmp = db.random.weapons.melee.TwoHandAxes.getList();
    impl += tmp.size(); 
    all += db.random.weapons.melee.TwoHandAxes.getIDs().length;
    
    tmp = db.random.weapons.melee.TwoHandMaces.getList();
    impl += tmp.size(); 
    all += db.random.weapons.melee.TwoHandMaces.getIDs().length;
    
    tmp = db.random.weapons.melee.TwoHandSwords.getList();
    impl += tmp.size(); 
    all += db.random.weapons.melee.TwoHandSwords.getIDs().length;
    
    tmp = db.random.weapons.ranged.Bows.getList();
    impl += tmp.size(); 
    all += db.random.weapons.ranged.Bows.getIDs().length;
    
    tmp = db.random.weapons.ranged.Guns.getList();
    impl += tmp.size(); 
    all += db.random.weapons.ranged.Guns.getIDs().length;
    
    tmp = db.random.weapons.ranged.Wands.getList();
    impl += tmp.size();
    all += db.random.weapons.ranged.Wands.getIDs().length;
    
    tmp = db.random.armor.cloth.Chest.getList();
    impl += tmp.size();
    all += db.random.armor.cloth.Chest.getIDs().length;
    
    tmp = db.random.armor.cloth.Feet.getList();
    impl += tmp.size();
    all += db.random.armor.cloth.Feet.getIDs().length;
    
    tmp = db.random.armor.cloth.Hands.getList();
    impl += tmp.size();
    all += db.random.armor.cloth.Hands.getIDs().length;
    
    tmp = db.random.armor.cloth.Head.getList();
    impl += tmp.size();
    all += db.random.armor.cloth.Head.getIDs().length;
    
    tmp = db.random.armor.cloth.Legs.getList();
    impl += tmp.size();
    all += db.random.armor.cloth.Legs.getIDs().length;
    
    tmp = db.random.armor.cloth.Shoulder.getList();
    impl += tmp.size();
    all += db.random.armor.cloth.Shoulder.getIDs().length;
    
    tmp = db.random.armor.cloth.Waist.getList();
    impl += tmp.size();
    all += db.random.armor.cloth.Waist.getIDs().length;
    
    tmp = db.random.armor.cloth.Wrist.getList();
    impl += tmp.size();
    all += db.random.armor.cloth.Wrist.getIDs().length;
    
    tmp = db.random.armor.leather.Chest.getList();
    impl += tmp.size();
    all += db.random.armor.leather.Chest.getIDs().length;
    
    tmp = db.random.armor.leather.Feet.getList();
    impl += tmp.size();
    all += db.random.armor.leather.Feet.getIDs().length;
    
    tmp = db.random.armor.leather.Hands.getList();
    impl += tmp.size();
    all += db.random.armor.leather.Hands.getIDs().length;
    
    tmp = db.random.armor.leather.Head.getList();
    impl += tmp.size();
    all += db.random.armor.leather.Head.getIDs().length;
    
    tmp = db.random.armor.leather.Legs.getList();
    impl += tmp.size();
    all += db.random.armor.leather.Legs.getIDs().length;
    
    tmp = db.random.armor.leather.Shoulder.getList();
    impl += tmp.size();
    all += db.random.armor.leather.Shoulder.getIDs().length;
    
    tmp = db.random.armor.leather.Waist.getList();
    impl += tmp.size();
    all += db.random.armor.leather.Waist.getIDs().length;
    
    tmp = db.random.armor.leather.Wrist.getList();
    impl += tmp.size();
    all += db.random.armor.leather.Wrist.getIDs().length;
    
    tmp = db.random.armor.mail.Chest.getList();
    impl += tmp.size();
    all += db.random.armor.mail.Chest.getIDs().length;
    
    tmp = db.random.armor.mail.Feet.getList();
    impl += tmp.size();
    all += db.random.armor.mail.Feet.getIDs().length;
    
    tmp = db.random.armor.mail.Hands.getList();
    impl += tmp.size();
    all += db.random.armor.mail.Hands.getIDs().length;
    
    tmp = db.random.armor.mail.Head.getList();
    impl += tmp.size();
    all += db.random.armor.mail.Head.getIDs().length;
    
    tmp = db.random.armor.mail.Legs.getList();
    impl += tmp.size();
    all += db.random.armor.mail.Legs.getIDs().length;
    
    tmp = db.random.armor.mail.Shoulder.getList();
    impl += tmp.size();
    all += db.random.armor.mail.Shoulder.getIDs().length;
    
    tmp = db.random.armor.mail.Waist.getList();
    impl += tmp.size();
    all += db.random.armor.mail.Waist.getIDs().length;
    
    tmp = db.random.armor.mail.Wrist.getList();
    impl += tmp.size();
    all += db.random.armor.mail.Wrist.getIDs().length;
    
    tmp = db.random.armor.other.misc.Amulet.getList();
    impl += tmp.size();
    all += db.random.armor.other.misc.Amulet.getIDs().length;
    
    tmp = db.random.armor.other.misc.Offhand.getList();
    impl += tmp.size();
    all += db.random.armor.other.misc.Offhand.getIDs().length;
    
    tmp = db.random.armor.other.misc.Ring.getList();
    impl += tmp.size();
    all += db.random.armor.other.misc.Ring.getIDs().length;
    
    tmp = db.random.armor.other.Cloak.getList();
    impl += tmp.size();
    all += db.random.armor.other.Cloak.getIDs().length;
    
    tmp = db.random.armor.other.Shield.getList();
    impl += tmp.size();
    all += db.random.armor.other.Shield.getIDs().length;
    
    tmp = db.random.armor.plate.Chest.getList();
    impl += tmp.size();
    all += db.random.armor.plate.Chest.getIDs().length;
    
    tmp = db.random.armor.plate.Feet.getList();
    impl += tmp.size();
    all += db.random.armor.plate.Feet.getIDs().length;
    
    tmp = db.random.armor.plate.Hands.getList();
    impl += tmp.size();
    all += db.random.armor.plate.Hands.getIDs().length;
    
    tmp = db.random.armor.plate.Head.getList();
    impl += tmp.size();
    all += db.random.armor.plate.Head.getIDs().length;
    
    tmp = db.random.armor.plate.Legs.getList();
    impl += tmp.size();
    all += db.random.armor.plate.Legs.getIDs().length;
    
    tmp = db.random.armor.plate.Shoulder.getList();
    impl += tmp.size();
    all += db.random.armor.plate.Shoulder.getIDs().length;
    
    tmp = db.random.armor.plate.Waist.getList();
    impl += tmp.size();
    all += db.random.armor.plate.Waist.getIDs().length;
    
    tmp = db.random.armor.plate.Wrist.getList();
    impl += tmp.size();
    all += db.random.armor.plate.Wrist.getIDs().length;
    
    System.out.println("Test ended! If there are no other Messages, the Database is complete and "
        + "correct.");
    System.out.println(impl + "/" + all + " - " + ((double)(impl) / (double)(all) * 100 + "% done"));
  //  System.out.println(util.DatabaseConnecter.getAllIDs().length);
//    tmp = db.random.weapons.melee.Daggers.getList();
//    for (MultiBonus mb : tmp) {
//      mb.getAllItems();
//    }
  }
}
