package util;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.HashMap;

public class RightButtonsLayout implements LayoutManager{

	public static final String gloves = "Gloves";
	public static final String glovesEnch = "GlovesEnch";
	public static final String glovesBorder = "GlovesBorder";
	
	public static final String belt = "Belt";
	public static final String beltBorder = "BeltBorder";
	
	public static final String pants = "Pants";
	public static final String pantsEnch = "PantsEnch";
	public static final String pantsBorder = "PantsBorder";
	
	public static final String feet = "Feet";
	public static final String feetEnch = "FeetEnch";
	public static final String feetBorder = "FeetBorder";
	
	public static final String ring1 = "Ring1";
	public static final String ring1Border = "Ring1Border";
	
	public static final String ring2 = "Ring2";
	public static final String ring2Border = "Ring2Border";
	
	public static final String trinket1 = "Trinket1";
	public static final String trinket1Border = "Trinket1Border";
	
	public static final String trinket2 = "Trinket2";
	public static final String trinket2Border = "Trinket2Border";
	
	private HashMap<String, Component> components;
	
	public RightButtonsLayout() {
		components = new HashMap<String, Component>();
	}
	
	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		components.put(arg0, arg1);
	}

	@Override
	public void layoutContainer(Container arg0) {
		arg0.setBounds(411, 0, 76, 678);
		if (components.get(gloves) != null)
			components.get(gloves).setBounds(2, 10, 64, 64);
		if (components.get(glovesEnch) != null)
			components.get(glovesEnch).setBounds(0, 76, 68, 15);
		if (components.get(glovesBorder) != null)
			components.get(glovesBorder).setBounds(0, 8, 68, 68);
		
		if (components.get(belt) != null)
			components.get(belt).setBounds(2, 97, 64, 64);
		if (components.get(beltBorder) != null)
			components.get(beltBorder).setBounds(0, 95, 68, 68);
		
		if (components.get(pants) != null)
			components.get(pants).setBounds(2, 169, 64, 64);
		if (components.get(pantsEnch) != null)
			components.get(pantsEnch).setBounds(0, 235, 68, 15);
		if (components.get(pantsBorder) != null)
			components.get(pantsBorder).setBounds(0, 167, 68, 68);
		
		if (components.get(feet) != null)
			components.get(feet).setBounds(2, 256, 64, 64);
		if (components.get(feetEnch) != null)
			components.get(feetEnch).setBounds(0, 322, 68, 15);
		if (components.get(feetBorder) != null)
			components.get(feetBorder).setBounds(0, 254, 68, 68);
		
		if (components.get(ring1) != null)
			components.get(ring1).setBounds(2, 343, 64, 64);
		if (components.get(ring1Border) != null)
			components.get(ring1Border).setBounds(0, 341, 68, 68);
		
		if (components.get(ring2) != null)
			components.get(ring2).setBounds(2, 430, 64, 64);
		if (components.get(ring2Border) != null)
			components.get(ring2Border).setBounds(0, 428, 68, 68);
		
		if (components.get(trinket1) != null)
			components.get(trinket1).setBounds(2, 502, 64, 64);
		if (components.get(trinket1Border) != null)
			components.get(trinket1Border).setBounds(0, 500, 68, 68);
		
		if (components.get(trinket2) != null)
			components.get(trinket2).setBounds(2, 574, 64, 64);
		if (components.get(trinket2Border) != null)
			components.get(trinket2Border).setBounds(0, 572, 68, 68);
	}

	@Override
	public Dimension minimumLayoutSize(Container arg0) {
		return new Dimension(76,712);
	}

	@Override
	public Dimension preferredLayoutSize(Container arg0) {
		return new Dimension(76,712);
	}

	@Override
	public void removeLayoutComponent(Component arg0) {
		// TODO Auto-generated method stub
		
	}

}
