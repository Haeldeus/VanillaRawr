package db.weapon.basics;

/**
 * An Enumeration of Stats, that all Weapons have. Not to be mistaken with {@link db.stats.Stat}, 
 * which lists all possible Stats, a Character can gain (Intelligence, MP5, etc.)
 * @author Haeldeus
 * @version 1.0
 */
public enum WeaponStats {
  /** The value, that represents the minimum Damage, the Weapon deals. */
  MinDmg, 
  /** The value, that represents the maximum Damage, the Weapon deals. */
  MaxDmg, 
  /** The value, that represents the Attack Speed of the Weapon. */
  AttSpeed, 
  /** The value, that represents the required Level to equip the Weapon. */
  LvlReq, 
  /** The inherit Damage per second, that is displayed in the Tooltip of the Weapon. */
  DPS
}
