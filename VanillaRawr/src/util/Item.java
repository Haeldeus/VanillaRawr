package util;

import java.util.HashMap;

import db.stats.Stat;

public abstract class Item {
	
	private String name;
	private int id;
	private String icon;
	private boolean bop;
	private boolean setItem;
	private HashMap<Stat, Integer> stats;
	
	public Item(String name, int id, String icon, boolean bop, boolean setItem, 
			HashMap<Stat, Integer> stats) {
		this.name = name;
		this.id = id;
		this.icon = icon;
		this.bop = bop;
		this.setItem = setItem;
		this.stats = stats;
	}
	
	public String getName() {return name;}
	public int getID() {return id;}
	public String getIcon() {return icon;}
	public boolean getBop() {return bop;}
	public boolean getSetItem() {return setItem;}
	public HashMap<Stat, Integer> getStats() {return stats;}
}
