package util;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.HashMap;

public class MiddleLayout implements LayoutManager {

  public static final String tabPane = "tabPane"; 
  
  public static final String mainHand = "mainHand";
  public static final String mainHandEnch = "mainHandEnch";
  public static final String mainHandBorder = "mainHandBorder";
  
  public static final String offHand = "offHand";
  public static final String offHandEnch = "offHandEnch";
  public static final String offHandBorder = "offHandBorder";
  
  public static final String ranged = "ranged";
  public static final String rangedEnch = "rangedEnch";
  public static final String rangedBorder = "rangedBorder";
  
  public static final String ammo = "ammo";
  public static final String ammoBorder = "ammoBorder";
  
  private HashMap<String, Component> components;
  private boolean needsAmmo;
  private boolean hasRangedEnch;
  
  /**
   * Creates a new Layout for the Area in the Middle of the Frame.
   * @param needsAmmo  Determines, if the Character needs Ammo (is a Rogue or Hunter).
   * @param hasRangedEnch  Determines, if the Character has an Enchantable Weapon (Hunter).
   * @since 1.0
   */
  public MiddleLayout(boolean needsAmmo, boolean hasRangedEnch) {
    components = new HashMap<String, Component>();
    this.needsAmmo = needsAmmo;
    this.hasRangedEnch = hasRangedEnch;
  }
  
  @Override
  public void addLayoutComponent(String arg0, Component arg1) {
    components.put(arg0, arg1);
  }

  @Override
  public void layoutContainer(Container arg0) {
    // TODO Auto-generated method stub
    arg0.setSize(315, 712);
    if (components.get(tabPane) != null) {
      components.get(tabPane).setBounds(0, 0, 315, 568);
    }
    
    if (components.get(mainHand) != null) {
      components.get(mainHand).setBounds(10, 574, 64, 64);
    }
    if (components.get(mainHandEnch) != null) {
      components.get(mainHandEnch).setBounds(8, 640, 68, 15);
    }
    if (components.get(mainHandBorder) != null) {
      components.get(mainHandBorder).setBounds(8, 572, 68, 68);
    }
      
    if (components.get(offHand) != null) {
      components.get(offHand).setBounds(89, 574, 64, 64);
    }
    if (components.get(offHandEnch) != null) {
      components.get(offHandEnch).setBounds(87, 640, 68, 15);
    }
    if (components.get(offHandBorder) != null) {
      components.get(offHandBorder).setBounds(87, 572, 68, 68);
    }
      
    if (components.get(ranged) != null) {
      components.get(ranged).setBounds(168, 574, 64, 64);
    }
    if (components.get(rangedBorder) != null) {
      components.get(rangedBorder).setBounds(166, 572, 68, 68);
    }
    
    if (hasRangedEnch) {
      if (components.get(rangedEnch) != null) {
        components.get(rangedEnch).setBounds(166, 640, 68, 15);
      }
    }
    
    if (needsAmmo) {
      if (components.get(ammo) != null) {
        components.get(ammo).setBounds(247, 574, 64, 64);
      }
      if (components.get(ammoBorder) != null) {
        components.get(ammoBorder).setBounds(245, 572, 68, 68);
      }
    }
  }

  @Override
  public Dimension minimumLayoutSize(Container arg0) {
    return new Dimension(315,712);
  }

  @Override
  public Dimension preferredLayoutSize(Container arg0) {
    return new Dimension(315,712);
  }

  @Override
  public void removeLayoutComponent(Component arg0) {
    components.remove(arg0);
  }

}
