package db;

public class Test {

	public static void main(String[] args) {
		db.randomBoni.weapons.melee.Daggers.getList();
		db.randomBoni.weapons.melee.OneHandAxes.getList();
		db.randomBoni.weapons.melee.OneHandMaces.getList();
		db.randomBoni.weapons.melee.OneHandSwords.getList();
		db.randomBoni.weapons.melee.Staffs.getList();
		db.randomBoni.weapons.melee.TwoHandAxes.getList();
		db.randomBoni.weapons.melee.TwoHandMaces.getList();
		db.randomBoni.weapons.melee.TwoHandSwords.getList();
		db.randomBoni.weapons.ranged.Bows.getList();
		db.randomBoni.weapons.ranged.Guns.getList();
		db.randomBoni.weapons.ranged.Wands.getList();
		
//		db.randomBoni.armor.cloth.Chests.getList();
		
		System.out.println("Test ended! If there are no other Messages, the Database is complete and correct.");
		System.out.println(util.DatabaseConnecter.getAllIDs().length);
	}
}
