package util;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.HashMap;

/**
 * The Layout for the Buttons on the left Side of the Character Sheet.
 * @author Haeldeus
 * @version 1.0
 */
public class LeftButtonsLayout implements LayoutManager {

  /**
   * The String, that defines the Label for the Head-Icon.
   */
  public static final String head = "Head";
  
  /**
   * The String, that defines the Label for the Head-Enchantment.
   */
  public static final String headEnch = "HeadEnch";
  
  /**
   * The String, that defines the Label for the Border of the Head-Icon.
   */
  public static final String headBorder = "HeadBorder";
  
  /**
   * The String, that defines the Label for the Neck-Icon.
   */
  public static final String neck = "Neck";
  
  /**
   * The String, that defines the Label for the Border of the Neck-Icon.
   */
  public static final String neckBorder = "NeckBorder";
  
  /**
   * The String, that defines the Label for the Shoulder-Icon.
   */
  public static final String shoulder = "Shoulder";
  
  /**
   * The String, that defines the Label for the Shoulder-Enchantment.
   */
  public static final String shoulderEnch = "ShoulderEnch";
  
  /**
   * The String, that defines the Label for the Border of the Shoulder-Icon.
   */
  public static final String shoulderBorder = "ShoulderBorder";
  
  /**
   * The String, that defines the Label for the Cloak-Icon.
   */
  public static final String cloak = "Cloak";
  
  /**
   * The String, that defines the Label for the Cloak-Enchantment.
   */
  public static final String cloakEnch = "CloakEnch";
  
  /**
   * The String, that defines the Label for the Border of the Cloak-Icon.
   */
  public static final String cloakBorder = "CloakBorder";
  
  /**
   * The String, that defines the Label for the Chest-Icon.
   */
  public static final String chest = "Chest";
  
  /**
   * The String, that defines the Label for the Chest-Enchantment.
   */
  public static final String chestEnch = "ChestEnch";
  
  /**
   * The String, that defines the Label for the Border of the Chest-Icon.
   */
  public static final String chestBorder = "ChestBorder";
  
  /**
   * The String, that defines the Label for the Shirt-Icon.
   */
  public static final String shirt = "Shirt";
  
  /**
   * The String, that defines the Label for the Border of the Shirt-Icon.
   */
  public static final String shirtBorder = "ShirtBorder";
  
  /**
   * The String, that defines the Label for the Tabard-Icon.
   */
  public static final String tabard = "Tabard";
  
  /**
   * The String, that defines the Label for the Border of the Tabard-Icon.
   */
  public static final String tabardBorder = "TabardBorder";
  
  /**
   * The String, that defines the Label for the Bracer-Icon.
   */
  public static final String bracer = "Bracer";
  
  /**
   * The String, that defines the Label for the Bracer-Enchantment.
   */
  public static final String bracerEnch = "BracerEnch";
  
  /**
   * The String, that defines the Label for the Border of the Bracer-Icon.
   */
  public static final String bracerBorder = "BracerBorder";
  
  /**
   * The {@link HashMap}, that saves all {@link Component}s, that were added to this Layout, with 
   * their defining String as Key.
   */
  private HashMap<String, Component> components;
  
  /**
   * The Constructor for this Layout. Creates a new {@link HashMap} for {@link #components}.
   * @since 1.0
   */
  public LeftButtonsLayout() {
    components = new HashMap<String, Component>();
  }
  
  /**
   * Checks, if the given String is a String, that defines a Component of this Layout.
   * @param key The String to be checked.
   * @return {@code true}, if the given String defines a Component, {@code false} else.
   * @since 1.0
   */
  private boolean isComponent(String key) {
    if (key.equals(head) || key.equals(headEnch) || key.equals(headBorder) || key.equals(neck) 
        || key.equals(neckBorder) || key.equals(shoulder) || key.equals(shoulderEnch) 
        || key.equals(shoulderBorder) || key.equals(cloak) || key.equals(cloakEnch) 
        || key.equals(cloakBorder) || key.equals(chest) || key.equals(chestEnch) 
        || key.equals(chestBorder) || key.equals(shirt) || key.equals(shirtBorder) 
        || key.equals(tabard) || key.equals(tabardBorder) || key.equals(bracer) 
        || key.equals(bracerEnch) || key.equals(bracerBorder)) {
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
    if (components.get(head) != null) {
      components.get(head).setBounds(10, 10, 64, 64);
    }
    if (components.get(headEnch) != null) {
      components.get(headEnch).setBounds(8, 76, 68, 15);
    }
    if (components.get(headBorder) != null) {
      components.get(headBorder).setBounds(8, 8, 68, 68);
    }
    
    if (components.get(neck) != null) {
      components.get(neck).setBounds(10, 97, 64, 64);
    }
    if (components.get(neckBorder) != null) {
      components.get(neckBorder).setBounds(8, 95, 68, 68);
    }
    
    if (components.get(shoulder) != null) {
      components.get(shoulder).setBounds(10, 169, 64, 64);
    }
    if (components.get(shoulderEnch) != null) {
      components.get(shoulderEnch).setBounds(8, 235, 68, 15);
    }
    if (components.get(shoulderBorder) != null) {
      components.get(shoulderBorder).setBounds(8, 167, 68, 68);
    }
    
    if (components.get(cloak) != null) {
      components.get(cloak).setBounds(10, 256, 64, 64);
    }
    if (components.get(cloakEnch) != null) {
      components.get(cloakEnch).setBounds(8, 322, 68, 15);
    }
    if (components.get(cloakBorder) != null) {
      components.get(cloakBorder).setBounds(8, 254, 68, 68);
    }
    
    if (components.get(chest) != null) {
      components.get(chest).setBounds(10, 343, 64, 64);
    }
    if (components.get(chestEnch) != null) {
      components.get(chestEnch).setBounds(8, 409, 68, 15);
    }
    if (components.get(chestBorder) != null) {
      components.get(chestBorder).setBounds(8, 341, 68, 68);
    }
    
    if (components.get(shirt) != null) {
      components.get(shirt).setBounds(10, 430, 64, 64);
    }
    if (components.get(shirtBorder) != null) {
      components.get(shirtBorder).setBounds(8, 428, 68, 68);
    }
    
    if (components.get(tabard) != null) {
      components.get(tabard).setBounds(10, 502, 64, 64);
    }
    if (components.get(tabardBorder) != null) {
      components.get(tabardBorder).setBounds(8, 500, 68, 68);
    }
    
    if (components.get(bracer) != null) {
      components.get(bracer).setBounds(10, 574, 64, 64);
    }
    if (components.get(bracerEnch) != null) {
      components.get(bracerEnch).setBounds(8, 640, 68, 15);
    }
    if (components.get(bracerBorder) != null) {
      components.get(bracerBorder).setBounds(8, 572, 68, 68);
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
