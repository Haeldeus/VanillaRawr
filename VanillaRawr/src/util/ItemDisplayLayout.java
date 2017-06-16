package util;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.HashMap;

public class ItemDisplayLayout implements LayoutManager {

  public static final String ICON = "Icon";
  
  public static final String NAME = "Name";
  
  public static final String ATTRIBUTES = "Attributes";
  
  public static final String UPPER_BORDER = "Upper_Border";
  
  public static final String RIGHT_BORDER = "Right_Border";
  
  public static final String LEFT_BORDER = "Left_Border";
  
  public static final String LOWER_BORDER = "Lower_Border";
  
  private HashMap<String, Component> components;
  
  public ItemDisplayLayout() {
    components = new HashMap<String, Component>();
  }
  
  private boolean isComponent(String key) {
    if (key.equals(ICON) || key.equals(NAME) || key.equals(ATTRIBUTES) || key.equals(UPPER_BORDER) 
        || key.equals(RIGHT_BORDER) || key.equals(LEFT_BORDER) || key.equals(LOWER_BORDER)) {
      return true;
    } else {
      return false;
    }
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
  
  public HashMap<String, Component> getComponents() {
    return components;
  }
}
