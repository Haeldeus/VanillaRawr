package util;

import db.stats.Stat;
import db.weapon.basics.WeaponStats;
import java.util.HashMap;

/**
 * A Class, which Objects represent a Weapon, a Subclass of {@link Item}.
 * @author Haeldeus
 * @version 1.0
 */
public abstract class Weapon extends Item {

  /**
   * The {@link WeaponStats}, this Weapon has.
   */
  private HashMap<WeaponStats, Integer> weaponStats;
  
  /**
   * Creates a new Weapon with the given Properties.
   * @param name The name of the Weapon.
   * @param id The id of the Weapon.
   * @param icon The Icon of the Weapon.
   * @param bop The boolean Value, that defines, if the Weapon is bound on Pickup or not.
   * @param setItem The boolean Value, that defines, if the Weapon is part of a Set.
   * @param stats The Stats of this Weapon as a HashMap of {@link Stat}s and Integer.
   * @param weaponStats The special {@link WeaponStats}, that this Weapon has.
   * @since 1.0
   */
  public Weapon(String name, int id, String icon, boolean bop, boolean setItem,
      HashMap<Stat, Integer> stats, HashMap<WeaponStats, Integer> weaponStats) {
    super(name, id, icon, bop, setItem, stats);
    this.weaponStats = weaponStats;
  }
  
  /**
   * Returns the WeaponStats of this Weapon.
   * @return {@link #weaponStats}, a {@link HashMap} of {@link WeaponStats} and Integers.
   * @since 1.0
   */
  public HashMap<WeaponStats, Integer> getWeaponStats() {
    return weaponStats;
  }
}
