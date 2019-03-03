package util;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.HashMap;

/**
 * The Layout for the Buttons on the right Side of the Character Sheet.
 * @author Haeldeus
 * @version 1.0
 */
public class RightButtonsLayout implements LayoutManager {

  /**
   * The String, that defines the Label for the Gloves-Icon.
   */
  public static final String gloves = "Gloves";

  /**
   * The String, that defines the Label for the Gloves-Enchantment.
   */
  public static final String glovesEnch = "GlovesEnch";
  
  /**
   * The String, that defines the Label for the Border of the Gloves-Icon.
   */
  public static final String glovesBorder = "GlovesBorder";
  
  /**
   * The String, that defines the Label for the Belt-Icon.
   */
  public static final String belt = "Belt";
  
  /**
   * The String, that defines the Label for the Border of the Belt-Icon.
   */
  public static final String beltBorder = "BeltBorder";
  
  /**
   * The String, that defines the Label for the Pants-Icon.
   */
  public static final String pants = "Pants";
  
  /**
   * The String, that defines the Label for the Pants-Enchantment.
   */
  public static final String pantsEnch = "PantsEnch";
  
  /**
   * The String, that defines the Label for the Border of the Pants-Icon.
   */
  public static final String pantsBorder = "PantsBorder";
  
  /**
   * The String, that defines the Label for the Feet-Icon.
   */
  public static final String feet = "Feet";
  
  /**
   * The String, that defines the Label for the Feet-Enchantment.
   */
  public static final String feetEnch = "FeetEnch";
  
  /**
   * The String, that defines the Label for the Border of the Feet-Icon.
   */
  public static final String feetBorder = "FeetBorder";
  
  /**
   * The String, that defines the Label for the Icon of the upper Ring.
   */
  public static final String ring1 = "Ring1";
  
  /**
   * The String, that defines the Label for the Border of the Icon of the upper Ring.
   */
  public static final String ring1Border = "Ring1Border";
  
  /**
   * The String, that defines the Label for the Icon of the lower Ring.
   */
  public static final String ring2 = "Ring2";
  
  /**
   * The String, that defines the Label for the Border of the Icon of the lower Ring.
   */
  public static final String ring2Border = "Ring2Border";
  
  /**
   * The String, that defines the Label for the Icon of the upper Trinket.
   */
  public static final String trinket1 = "Trinket1";
  
  /**
   * The String, that defines the Label for the Border of the Icon of the upper Trinket.
   */
  public static final String trinket1Border = "Trinket1Border";
  
  /**
   * The String, that defines the Label for the Icon of the lower Trinket.
   */
  public static final String trinket2 = "Trinket2";
  
  /**
   * The String, that defines the Label for the Border of the Icon of the lower Trinket.
   */
  public static final String trinket2Border = "Trinket2Border";
  
  /**
   * The {@link HashMap}, that saves all {@link Component}s, that were added to this Layout, with 
   * their defining String as Key.
   */
  private HashMap<String, Component> components;
  
  /**
   * The Constructor for this Layout. Creates a new {@link HashMap} for {@link #components}.
   * @since 1.0
   */
  public RightButtonsLayout() {
    components = new HashMap<String, Component>();
  }
  
  /**
   * Checks, if the given String is a String, that defines a Component of this Layout.
   * @param key The String to be checked.
   * @return {@code true}, if the given String defines a Component, {@code false} else.
   * @since 1.0
   */
  private boolean isComponent(String key) {
    if (key.equals(gloves) || key.equals(glovesEnch) || key.equals(glovesBorder) 
        || key.equals(belt) || key.equals(beltBorder) || key.equals(pants) 
        || key.equals(pantsEnch) || key.equals(pantsBorder) || key.equals(feet) 
        || key.equals(feetEnch) || key.equals(feetBorder) || key.equals(ring1) 
        || key.equals(ring1Border) || key.equals(ring2) || key.equals(ring2Border) 
        || key.equals(trinket1) || key.equals(trinket1Border) || key.equals(trinket2) 
        || key.equals(trinket2Border)) {
      return true;
    }
    return false;
  }
  
  @Override
  public void addLayoutComponent(String key, Component comp) {
    if (isComponent(key)) {
      components.put(key, comp);
    }
  }

  @Override
  public void layoutContainer(Container arg0) {
    arg0.setBounds(411, 0, 76, 678);
    if (components.get(gloves) != null) {
      components.get(gloves).setBounds(2, 10, 64, 64); 
    }
    if (components.get(glovesEnch) != null) {
      components.get(glovesEnch).setBounds(0, 76, 68, 15);
    }
    if (components.get(glovesBorder) != null) {
      components.get(glovesBorder).setBounds(0, 8, 68, 68);
    }
    
    if (components.get(belt) != null) {
      components.get(belt).setBounds(2, 97, 64, 64);
    }
    if (components.get(beltBorder) != null) {
      components.get(beltBorder).setBounds(0, 95, 68, 68);
    }
    
    if (components.get(pants) != null) {
      components.get(pants).setBounds(2, 169, 64, 64);
    }
    if (components.get(pantsEnch) != null) {
      components.get(pantsEnch).setBounds(0, 235, 68, 15);
    }
    if (components.get(pantsBorder) != null) {
      components.get(pantsBorder).setBounds(0, 167, 68, 68);
    }
    
    if (components.get(feet) != null) {
      components.get(feet).setBounds(2, 256, 64, 64);
    }
    if (components.get(feetEnch) != null) {
      components.get(feetEnch).setBounds(0, 322, 68, 15);
    }
    if (components.get(feetBorder) != null) {
      components.get(feetBorder).setBounds(0, 254, 68, 68);
    }
    
    if (components.get(ring1) != null) {
      components.get(ring1).setBounds(2, 343, 64, 64);
    }
    if (components.get(ring1Border) != null) {
      components.get(ring1Border).setBounds(0, 341, 68, 68);
    }
    
    if (components.get(ring2) != null) {
      components.get(ring2).setBounds(2, 430, 64, 64);
    }
    if (components.get(ring2Border) != null) {
      components.get(ring2Border).setBounds(0, 428, 68, 68);
    }
    
    if (components.get(trinket1) != null) {
      components.get(trinket1).setBounds(2, 502, 64, 64);
    }
    if (components.get(trinket1Border) != null) {
      components.get(trinket1Border).setBounds(0, 500, 68, 68);
    }
    
    if (components.get(trinket2) != null) {
      components.get(trinket2).setBounds(2, 574, 64, 64);
    }
    if (components.get(trinket2Border) != null) {
      components.get(trinket2Border).setBounds(0, 572, 68, 68);
    }
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
    if (components.containsValue(arg0)) {
      components.remove(arg0);
    }
  }

}
