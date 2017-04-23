package util;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.HashMap;

public class LeftButtonsLayout implements LayoutManager{

	public static final String head = "Head";
	public static final String headEnch = "HeadEnch";
	public static final String headBorder = "HeadBorder";
	
	public static final String neck = "Neck";
	public static final String neckBorder = "NeckBorder";
	
	public static final String shoulder = "Shoulder";
	public static final String shoulderEnch = "ShoulderEnch";
	public static final String shoulderBorder = "ShoulderBorder";
	
	public static final String cloak = "Cloak";
	public static final String cloakEnch = "CloakEnch";
	public static final String cloakBorder = "CloakBorder";
	
	public static final String chest = "Chest";
	public static final String chestEnch = "ChestEnch";
	public static final String chestBorder = "ChestBorder";
	
	public static final String shirt = "Shirt";
	public static final String shirtBorder = "ShirtBorder";
	
	public static final String tabard = "Tabard";
	public static final String tabardBorder = "TabardBorder";
	
	public static final String bracer = "Bracer";
	public static final String bracerEnch = "BracerEnch";
	public static final String bracerBorder = "BracerBorder";
	
	private HashMap<String, Component> components;
	
	public LeftButtonsLayout() {
		components = new HashMap<String, Component>();
	}
	
	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		components.put(arg0, arg1);
	}

	@Override
	public void layoutContainer(Container arg0) {
		if (components.get(head) != null)
			components.get(head).setBounds(10, 10, 64, 64);
		if (components.get(headEnch) != null)
			components.get(headEnch).setBounds(8, 76, 68, 15);
		if (components.get(headBorder) != null)
			components.get(headBorder).setBounds(8, 8, 68, 68);
		
		if (components.get(neck) != null)
			components.get(neck).setBounds(10, 97, 64, 64);
		if (components.get(neckBorder) != null)
			components.get(neckBorder).setBounds(8, 95, 68, 68);
		
		if (components.get(shoulder) != null)
			components.get(shoulder).setBounds(10, 169, 64, 64);
		if (components.get(shoulderEnch) != null)
			components.get(shoulderEnch).setBounds(8, 235, 68, 15);
		if (components.get(shoulderBorder) != null)
			components.get(shoulderBorder).setBounds(8, 167, 68, 68);
		
		if (components.get(cloak) != null)
			components.get(cloak).setBounds(10, 256, 64, 64);
		if (components.get(cloakEnch) != null)
			components.get(cloakEnch).setBounds(8, 322, 68, 15);
		if (components.get(cloakBorder) != null)
			components.get(cloakBorder).setBounds(8, 254, 68, 68);
		
		if (components.get(chest) != null)
			components.get(chest).setBounds(10, 343, 64, 64);
		if (components.get(chestEnch) != null)
			components.get(chestEnch).setBounds(8, 409, 68, 15);
		if (components.get(chestBorder) != null)
			components.get(chestBorder).setBounds(8, 341, 68, 68);
		
		if (components.get(shirt) != null)
			components.get(shirt).setBounds(10, 430, 64, 64);
		if (components.get(shirtBorder) != null)
			components.get(shirtBorder).setBounds(8, 428, 68, 68);
		
		if (components.get(tabard) != null)
			components.get(tabard).setBounds(10, 502, 64, 64);
		if (components.get(tabardBorder) != null)
			components.get(tabardBorder).setBounds(8, 500, 68, 68);
		
		if (components.get(bracer) != null)
			components.get(bracer).setBounds(10, 574, 64, 64);
		if (components.get(bracerEnch) != null)
			components.get(bracerEnch).setBounds(8, 640, 68, 15);
		if (components.get(bracerBorder) != null)
			components.get(bracerBorder).setBounds(8, 572, 68, 68);
	}

	@Override
	public Dimension minimumLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return new Dimension(76,712);
	}

	@Override
	public Dimension preferredLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return new Dimension(76,712);
	}

	@Override
	public void removeLayoutComponent(Component arg0) {
		// TODO Auto-generated method stub
		
	}

}
