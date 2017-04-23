package util;

import java.util.HashMap;
import java.util.Set;

import javax.swing.ImageIcon;

public class ImageChecker {

	private static HashMap<String, Boolean> images = new HashMap<String, Boolean>();
//	private static String[] imageStrings;
	
	private static void getImages() {
		String[] tmp = DatabaseConnecter.getAllIcons();
		for (String s : tmp)
			images.put(s, false);
//		imageStrings = tmp;
	}
	
	public static void main(String[] args) {
		getImages();
		Set<String> keys = images.keySet();
		int i = 0;
		for (String s : keys)
			if (images.get(s) == false) {
				String tmp = s.toLowerCase();
				try {
					new ImageIcon(ImageChecker.class.getResource("/resources/"+ tmp + ".jpg"));
					i++;
					images.put(s, true);
				} catch (Exception e) {
					System.out.println(tmp + " is missing");
					System.out.println(i + "/" + keys.size());
					return;
				}
			}
		System.out.println("All Images are available");
	}
}
