package util;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.HashMap;

/**
 * A {@link LayoutManager} for the Window, that will open when selecting an Item for the Character 
 * Sheet. 
 * @author Haeldeus
 * @version 1.0
 */
public class ItemDisplayLayout implements LayoutManager {

  /**
   * The final String to define the Label for the Icon.
   */
  public static final String ICON = "Icon";
  
  /**
   * The final String to define a Label for the Name.
   */
  public static final String NAME = "Name";
  
  /**
   * The final String to define the Label for the Attributes.
   */
  public static final String ATTRIBUTES = "Attributes";
  
  /**
   * The final String to define a Label as the upper Border of an Icon.
   */
  public static final String UPPER_BORDER = "Upper_Border";
  
  /**
   * The final String to define a Label as the right Border of an Icon.
   */
  public static final String RIGHT_BORDER = "Right_Border";
  
  /**
   * The final String to define a Label as the left Border of an Icon.
   */
  public static final String LEFT_BORDER = "Left_Border";
  
  /**
   * The final String to define a Label as the lower Border of an Icon.
   */
  public static final String LOWER_BORDER = "Lower_Border";
  
  /**
   * All {@link Component}s, that were added to this Layout, saved in a {@link HashMap} of Strings 
   * and {@link Component}s.
   */
  private HashMap<String, Component> components;
  
  /**
   * The Constructor to initialize this Layout. Will create a new HashMap {@link #components}.
   */
  public ItemDisplayLayout() {
    components = new HashMap<String, Component>();
  }
  
  /**
   * Checks, if the given String defines a Component. If yes, it returns {@code true}, 
   * {@code false else}.
   * @param key The String, that will be checked.
   * @return {@code true}, if the given String defines a Component, {@code false} if not.
   * @since 1.0
   */
  private boolean isComponent(String key) {
    if (key.equals(ICON) || key.equals(NAME) || key.equals(ATTRIBUTES) || key.equals(UPPER_BORDER) 
        || key.equals(RIGHT_BORDER) || key.equals(LEFT_BORDER) || key.equals(LOWER_BORDER)) {
      return true;
    }
    return false;
  }
  
  @Override
  public void addLayoutComponent(String key, Component component) {
    if (isComponent(key)) {
      components.put(key, component);
    }
  }

  @Override
  public void layoutContainer(Container parent) {
    int height = parent.getHeight();
    int width = parent.getWidth();
    
    components.get(UPPER_BORDER).setBounds(0, 0, width, 1);
    
    components.get(RIGHT_BORDER).setBounds(width - 1, 0, 1, height);
    
    components.get(LEFT_BORDER).setBounds(0, 0, 1, height);
    
    components.get(LOWER_BORDER).setBounds(0, height - 1, width, 1);
    
    components.get(ICON).setBounds(3, 3, 64, 64);
    
    components.get(NAME).setBounds(70, 5, width - 75, 15);
    
    components.get(ATTRIBUTES).setBounds(70, 20, width - 75, height - 23);
  }

  @Override
  public Dimension minimumLayoutSize(Container parent) {
    return new Dimension(200, 70);
  }

  @Override
  public Dimension preferredLayoutSize(Container parent) {
    // TODO Auto-generated method stub
    return new Dimension(200, 75);
  }

  @Override
  public void removeLayoutComponent(Component component) {
    if (components.get(ICON) != null) {
      if (components.get(ICON).equals(component)) {
        components.put(ICON, null);
        return;
      }
    }
    
    if (components.get(NAME) != null) {
      if (components.get(NAME).equals(component)) {
        components.put(NAME, null);
        return;
      }
    }
    
    if (components.get(ATTRIBUTES) != null) {
      if (components.get(ATTRIBUTES).equals(component)) {
        components.put(ATTRIBUTES, null);
        return;
      }  
    }
    
    if (components.get(UPPER_BORDER) != null) {
      if (components.get(UPPER_BORDER).equals(component)) {
        components.put(UPPER_BORDER, null);
        return;
      }  
    }
    
    if (components.get(RIGHT_BORDER) != null) {
      if (components.get(RIGHT_BORDER).equals(component)) {
        components.put(RIGHT_BORDER, null);
        return;
      }
    }
    
    if (components.get(LEFT_BORDER) != null) {
      if (components.get(LEFT_BORDER).equals(component)) {
        components.put(LEFT_BORDER, null);
        return;
      }
    }
    
    if (components.get(LOWER_BORDER) != null) {
      if (components.get(LOWER_BORDER).equals(component)) {
        components.put(LOWER_BORDER, null);
        return;
      }  
    }
  }
  
  /**
   * Returns all components, that were added to this Layout.
   * @return {@link #components}, a {@link HashMap} of Strings and {@link Component}s, that were 
   *     added to this Layout.
   * @since 1.0
   */
  public HashMap<String, Component> getComponents() {
    return components;
  }
}
