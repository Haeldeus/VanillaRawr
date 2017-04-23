package db.armor.relics;

public class Idol {

	private static Object[][] idols = {
		{22399, "INV_Relics_IdolofHealth", "Idol of Health"},
		{23004, "INV_Relics_IdolofHealth", "Idol of Longevity"},
		{23198, "INV_Relics_IdolofFerocity", "Idol of Brutality"},
		{22397, "INV_Relics_IdolofFerocity", "Idol of Ferocity"},
		{22398, "INV_Relics_IdolofRejuvenation", "Idol of Rejuvenation"},
		{23197, "INV_Relics_IdolofRejuvenation", "Idol of the Moon"}
	};
	
	public static int[] getIDs() {
		int[] res = new int[idols.length];
		for (int i = 0; i < idols.length; i++)
			res[i] = (int)idols[i][0];
		return res;
	}
	
	public static String[] getIcons() {
		String[] res = new String[idols.length];
		for (int i = 0; i < idols.length; i++)
			res[i] = (String)idols[i][1];
		return res;
	}
	
	public static String[] getNames() {
		String[] res = new String[idols.length];
		for (int i = 0; i < idols.length; i++)
			res[i] = (String)idols[i][2];
		return res;
	}
	
	public static void main(String[] args) {
		int[] t1 = getIDs();
		String[] t2 = getIcons();
		String[] t3 = getNames();
		for (int i = 0; i < t1.length; i++)
			System.out.println(t1[i] + ", " + t2[i] + ", " + t3[i]);
	}
}
