package util;

import java.util.HashMap;

import db.stats.Stat;
import db.weapon.basics.WeaponStats;

public abstract class Weapon extends Item {

	public Weapon(String name, int id, String icon, boolean bop, boolean setItem,
			HashMap<Stat, Integer> stats, HashMap<WeaponStats, Integer> weaponStats) {
		super(name, id, icon, bop, setItem, stats);
	}
}
