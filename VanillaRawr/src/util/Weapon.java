package util;

import db.stats.Stat;
import db.weapon.basics.WeaponStats;
import java.util.HashMap;

/**
 * 
 * @author Haeldeus
 * @version 1.0
 */
public abstract class Weapon extends Item {

  /**
   * @param name
   * @param id
   * @param icon
   * @param bop
   * @param setItem
   * @param stats
   * @param weaponStats
   * @since 1.0
   */
  public Weapon(String name, int id, String icon, boolean bop, boolean setItem,
      HashMap<Stat, Integer> stats, HashMap<WeaponStats, Integer> weaponStats) {
    
    super(name, id, icon, bop, setItem, stats);
  }
}
