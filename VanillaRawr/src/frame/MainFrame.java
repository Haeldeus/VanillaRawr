package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import util.ItemDisplayLayout;
import util.LeftButtonsLayout;
import util.MiddleLayout;
import util.RightButtonsLayout;

/**
 * The Class, which Objects will display the MainFrame of the Application. This Class also 
 * provides the Methods, to fill the Frame.
 * @author Haeldeus
 * @version 0.5
 */
public class MainFrame {
  
  /**
   * The {@link JFrame}, that will display the Application's Frame.
   * @since 0.5
   */
  private JFrame frame;
  
  /**
   * The {@link HashMap}, that stores the Buttons, that will display the Items of the 
   * Character.
   * @since 0.5
   */
  private HashMap<String, JLabel> buttons;
  
  /**
   * The Constructor for all Objects. Will create a new {@link #frame} to display the content 
   * and sets the Basic Options for the Frame.
   * @param c  The Class of the Character, this Session will be about.
   * @see util.Class
   * @since 0.5
   */
  public MainFrame(util.Class c) {
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Rawr v.0.0 - " + c.toString());
    buttons = new HashMap<String, JLabel>();
  }
  
  /**
   * Sets the Frame visible.
   */
  public void show() {
    frame.setSize(1000, 740);
    frame.setMinimumSize(new Dimension(1000, 740));
    
    Container content = frame.getContentPane();
    createContent(content);
    frame.setVisible(true);
  }
  
  private void createContent(Container content) {
    content.setLayout(new BorderLayout());
    content.add(createMenu(), BorderLayout.NORTH);
    createMainContent(content);
    content.add(createBottom(), BorderLayout.SOUTH);
  }
  
  private void createMainContent(Container content) {
    Container mainContent = new Container();
    mainContent.setLayout(new BorderLayout(10,10));
    createLeftContent(mainContent);
    createRightContent(mainContent);
    content.add(mainContent, BorderLayout.CENTER);
  }
  
  private void createLeftContent(Container mainContent) {
    Container leftContent = new Container();
    leftContent.setLayout(new BorderLayout(10,10));
    Container left = new Container();
    Container middle = new Container();
    middle.setLayout(new MiddleLayout(needsAmmo(), hasRangedEnch()));
    Container right = new Container();
    right.setLayout(new GridLayout(1,1));
    
    createLeftButtons(left);
    middle.add(createTabPane(), MiddleLayout.tabPane);
    middle.setMaximumSize(new Dimension(315,712));
    createMiddleButtons(middle);
    createRightButtons(right);
    
    
    leftContent.add(left, BorderLayout.WEST);
    leftContent.add(middle, BorderLayout.CENTER);
    leftContent.add(right, BorderLayout.EAST);
    
    //JScrollPane pane = new JScrollPane(leftContent);
    
    mainContent.add(leftContent, BorderLayout.WEST);
  }
  
  private boolean needsAmmo() {
    return true;
  }
  
  private boolean hasRangedEnch() {
    return false;
  }
  
  private void createLeftButtons(Container content) {
    content.setLayout(new LeftButtonsLayout());
    addHeadButton(content);
    addNeckButton(content);
    addShouldersButton(content);
    addCloakButton(content);
    addChestButton(content);
    addShirtButton(content);
    addTabardButton(content);
    addBracerButton(content);
  }
  
  private void addHeadButton(Container content) {
    JLabel btnHead = new JLabel();
    JLabel lblHeadBorder = new JLabel();
    btnHead.setOpaque(true);
    lblHeadBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));
    btnHead.addMouseListener(new MouseListener() {
        public void mouseClicked(MouseEvent arg0) {
          loadHeads(0); 
          btnHead.setIcon(new ImageIcon(MainFrame.class.getResource(
              "/resources/inv_helmet_125.jpg")));
        }
        
        public void mouseEntered(MouseEvent arg0) {
          btnHead.setBackground(Color.LIGHT_GRAY);
          lblHeadBorder.setBorder(BorderFactory.createMatteBorder(
              2, 2, 0, 2, Color.blue.brighter()));
        }
        
        public void mouseExited(MouseEvent arg0) {
          btnHead.setBackground(frame.getBackground());
          lblHeadBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));
        }
        
        public void mousePressed(MouseEvent arg0) {}
        
        public void mouseReleased(MouseEvent arg0) {}
    });
    JLabel btnHeadEnch = new JLabel("No Enchant");
    btnHeadEnch.setOpaque(true);
    btnHeadEnch.setHorizontalAlignment(JLabel.CENTER);
    btnHeadEnch.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnHeadEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
    btnHeadEnch.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {
        loadEnchants(0);
      }
      
      public void mouseEntered(MouseEvent arg0) {
        btnHeadEnch.setBackground(Color.LIGHT_GRAY);
        btnHeadEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue.brighter()));
      }
      
      public void mouseExited(MouseEvent arg0) {
        btnHeadEnch.setBackground(frame.getBackground());
        btnHeadEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
      }
      
      public void mousePressed(MouseEvent arg0) {}
      
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnHead, LeftButtonsLayout.head);
    content.add(btnHeadEnch, LeftButtonsLayout.headEnch);
    content.add(lblHeadBorder, LeftButtonsLayout.headBorder);
    buttons.put("Head", btnHead);
    buttons.put("HeadEnch", btnHeadEnch);
  }
  
  private void addNeckButton(Container content) {
    JLabel btnNeck = new JLabel();
    JLabel lblNeckBorder = new JLabel();
    btnNeck.setOpaque(true);
    lblNeckBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    btnNeck.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {
        loadHeads(1); 
        btnNeck.setIcon(new ImageIcon(MainFrame.class.getResource(
            "/resources/inv_jewelry_necklace_27naxxramas.jpg")));
      }
      
      public void mouseEntered(MouseEvent arg0) {
        btnNeck.setBackground(Color.LIGHT_GRAY);
        lblNeckBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue.brighter()));
      }
      
      public void mouseExited(MouseEvent arg0) {
        btnNeck.setBackground(frame.getBackground());
        lblNeckBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
      }
      
      public void mousePressed(MouseEvent arg0) {}
      
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnNeck, LeftButtonsLayout.neck);
    content.add(lblNeckBorder, LeftButtonsLayout.neckBorder);
    buttons.put("Neck", btnNeck);
  }
  
  private void addShouldersButton(Container content) {
    JLabel btnShoulder = new JLabel();
    JLabel lblShoulderBorder = new JLabel();
    btnShoulder.setOpaque(true);
    lblShoulderBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));
    btnShoulder.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(2); btnShoulder.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_shoulder_23.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnShoulder.setBackground(Color.LIGHT_GRAY);lblShoulderBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnShoulder.setBackground(frame.getBackground());lblShoulderBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    JLabel btnShoulderEnch = new JLabel("No Enchant");
    btnShoulderEnch.setOpaque(true);
    btnShoulderEnch.setHorizontalAlignment(JLabel.CENTER);
    btnShoulderEnch.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnShoulderEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
    btnShoulderEnch.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadEnchants(2);}
      public void mouseEntered(MouseEvent arg0) {btnShoulderEnch.setBackground(Color.LIGHT_GRAY);btnShoulderEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnShoulderEnch.setBackground(frame.getBackground());btnShoulderEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnShoulder, LeftButtonsLayout.shoulder);
    content.add(btnShoulderEnch, LeftButtonsLayout.shoulderEnch);
    content.add(lblShoulderBorder, LeftButtonsLayout.shoulderBorder);
    buttons.put("Shoulder", btnShoulder);
    buttons.put("ShoulderEnch", btnShoulderEnch);
  }
  
  private void addCloakButton(Container content) {
    JLabel btnCloak = new JLabel();
    JLabel lblCloakBorder = new JLabel();
    btnCloak.setOpaque(true);
    lblCloakBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));
    btnCloak.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(3); btnCloak.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_misc_cape_16.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnCloak.setBackground(Color.LIGHT_GRAY);lblCloakBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnCloak.setBackground(frame.getBackground());lblCloakBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    JLabel btnCloakEnch = new JLabel("No Enchant");
    btnCloakEnch.setOpaque(true);
    btnCloakEnch.setHorizontalAlignment(JLabel.CENTER);
    btnCloakEnch.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnCloakEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
    btnCloakEnch.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadEnchants(3);}
      public void mouseEntered(MouseEvent arg0) {btnCloakEnch.setBackground(Color.LIGHT_GRAY);btnCloakEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnCloakEnch.setBackground(frame.getBackground());btnCloakEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnCloak, LeftButtonsLayout.cloak);
    content.add(btnCloakEnch, LeftButtonsLayout.cloakEnch);
    content.add(lblCloakBorder, LeftButtonsLayout.cloakBorder);
    buttons.put("Cloak", btnCloak);
    buttons.put("CloakEnch", btnCloakEnch);
  }
  
  private void addChestButton(Container content) {
    JLabel btnChest = new JLabel();
    JLabel lblChestBorder = new JLabel();
    btnChest.setOpaque(true);
    lblChestBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));
    btnChest.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(4); btnChest.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_chest_cloth_43.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnChest.setBackground(Color.LIGHT_GRAY);lblChestBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnChest.setBackground(frame.getBackground());lblChestBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    JLabel btnChestEnch = new JLabel("No Enchant");
    btnChestEnch.setOpaque(true);
    btnChestEnch.setHorizontalAlignment(JLabel.CENTER);
    btnChestEnch.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnChestEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
    btnChestEnch.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadEnchants(4);}
      public void mouseEntered(MouseEvent arg0) {btnChestEnch.setBackground(Color.LIGHT_GRAY);btnChestEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnChestEnch.setBackground(frame.getBackground());btnChestEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnChest, LeftButtonsLayout.chest);
    content.add(btnChestEnch, LeftButtonsLayout.chestEnch);
    content.add(lblChestBorder, LeftButtonsLayout.chestBorder);
    buttons.put("Chest", btnChest);
    buttons.put("ChestEnch", btnChestEnch);
  }
  
  private void addShirtButton(Container content) {
    JLabel btnShirt = new JLabel();
    JLabel lblShirtBorder = new JLabel();
    btnShirt.setOpaque(true);
    lblShirtBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    btnShirt.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(5); btnShirt.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_shirt_blue_01.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnShirt.setBackground(Color.LIGHT_GRAY);lblShirtBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnShirt.setBackground(frame.getBackground());lblShirtBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnShirt, LeftButtonsLayout.shirt);
    content.add(lblShirtBorder, LeftButtonsLayout.shirtBorder);
    buttons.put("Shirt", btnShirt);
  }

  private void addTabardButton(Container content) {
    JLabel btnTabard = new JLabel();
    JLabel lblTabardBorder = new JLabel();
    btnTabard.setOpaque(true);
    lblTabardBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    btnTabard.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(6); btnTabard.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_shirt_guildtabard_01.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnTabard.setBackground(Color.LIGHT_GRAY);lblTabardBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnTabard.setBackground(frame.getBackground());lblTabardBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnTabard, LeftButtonsLayout.tabard);
    content.add(lblTabardBorder, LeftButtonsLayout.tabardBorder);
    buttons.put("Tabard", btnTabard);
  }
  
  private void addBracerButton(Container content) {
    JLabel btnBracer = new JLabel();
    JLabel lblBracerBorder = new JLabel();
    btnBracer.setOpaque(true);
    lblBracerBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));
    btnBracer.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(7); btnBracer.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_bracer_33.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnBracer.setBackground(Color.LIGHT_GRAY);lblBracerBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnBracer.setBackground(frame.getBackground());lblBracerBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    JLabel btnBracerEnch = new JLabel("No Enchant");
    btnBracerEnch.setOpaque(true);
    btnBracerEnch.setHorizontalAlignment(JLabel.CENTER);
    btnBracerEnch.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnBracerEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
    btnBracerEnch.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadEnchants(7);}
      public void mouseEntered(MouseEvent arg0) {btnBracerEnch.setBackground(Color.LIGHT_GRAY);btnBracerEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnBracerEnch.setBackground(frame.getBackground());btnBracerEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnBracer, LeftButtonsLayout.bracer);
    content.add(btnBracerEnch, LeftButtonsLayout.bracerEnch);
    content.add(lblBracerBorder, LeftButtonsLayout.bracerBorder);
    buttons.put("Bracer", btnBracer);
    buttons.put("BracerEnch", btnBracerEnch);
  }
  
  private void createMiddleButtons(Container content) {
    addMainHandButton(content);
    addOffHandButton(content);
    addRangedButton(content);
    if (needsAmmo())
      addAmmoButton(content);
  }
  
  private void addMainHandButton(Container content) {
    JLabel btnMainHand = new JLabel();
    JLabel lblMainHandBorder = new JLabel();
    btnMainHand.setOpaque(true);
    lblMainHandBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));
    btnMainHand.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(16); btnMainHand.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_mace_21.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnMainHand.setBackground(Color.LIGHT_GRAY);lblMainHandBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnMainHand.setBackground(frame.getBackground());lblMainHandBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    JLabel btnMainHandEnch = new JLabel("No Enchant");
    btnMainHandEnch.setOpaque(true);
    btnMainHandEnch.setHorizontalAlignment(JLabel.CENTER);
    btnMainHandEnch.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnMainHandEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
    btnMainHandEnch.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadEnchants(16);}
      public void mouseEntered(MouseEvent arg0) {btnMainHandEnch.setBackground(Color.LIGHT_GRAY);btnMainHandEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnMainHandEnch.setBackground(frame.getBackground());btnMainHandEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnMainHand, MiddleLayout.mainHand);
    content.add(btnMainHandEnch, MiddleLayout.mainHandEnch);
    content.add(lblMainHandBorder, MiddleLayout.mainHandBorder);
    buttons.put("MainHand", btnMainHand);
    buttons.put("MainHandEnch", btnMainHandEnch);
  }
  
  private void addOffHandButton(Container content) {
    JLabel btnOffHand = new JLabel();
    JLabel lblOffHandBorder = new JLabel();
    btnOffHand.setOpaque(true);
    lblOffHandBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));
    btnOffHand.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(17); btnOffHand.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_offhand_naxxramas_02.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnOffHand.setBackground(Color.LIGHT_GRAY);lblOffHandBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnOffHand.setBackground(frame.getBackground());lblOffHandBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    JLabel btnOffHandEnch = new JLabel("No Enchant");
    btnOffHandEnch.setOpaque(true);
    btnOffHandEnch.setHorizontalAlignment(JLabel.CENTER);
    btnOffHandEnch.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnOffHandEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
    btnOffHandEnch.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadEnchants(17);}
      public void mouseEntered(MouseEvent arg0) {btnOffHandEnch.setBackground(Color.LIGHT_GRAY);btnOffHandEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnOffHandEnch.setBackground(frame.getBackground());btnOffHandEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnOffHand, MiddleLayout.offHand);
    content.add(btnOffHandEnch, MiddleLayout.offHandEnch);
    content.add(lblOffHandBorder, MiddleLayout.offHandBorder);
    buttons.put("OffHand", btnOffHand);
    buttons.put("OffHandEnch", btnOffHandEnch);
  }
  
  private void addRangedButton(Container content) {
    JLabel btnRanged = new JLabel();
    JLabel lblRangedBorder = new JLabel();
    btnRanged.setOpaque(true);
    lblRangedBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));
    btnRanged.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(18); btnRanged.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_wand_11.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnRanged.setBackground(Color.LIGHT_GRAY);if(hasRangedEnch()) lblRangedBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.blue.brighter())); else lblRangedBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnRanged.setBackground(frame.getBackground());if(hasRangedEnch()) lblRangedBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK)); else lblRangedBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    JLabel btnRangedEnch = new JLabel("No Enchant");
    btnRangedEnch.setOpaque(true);
    btnRangedEnch.setHorizontalAlignment(JLabel.CENTER);
    btnRangedEnch.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnRangedEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
    btnRangedEnch.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadEnchants(18);}
      public void mouseEntered(MouseEvent arg0) {btnRangedEnch.setBackground(Color.LIGHT_GRAY);btnRangedEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnRangedEnch.setBackground(frame.getBackground());btnRangedEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    
    if(!hasRangedEnch())
      lblRangedBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    
    content.add(btnRanged, MiddleLayout.ranged);
    content.add(btnRangedEnch, MiddleLayout.rangedEnch);
    content.add(lblRangedBorder, MiddleLayout.rangedBorder);
    buttons.put("Ranged", btnRanged);
    buttons.put("RangedEnch", btnRangedEnch);
  }
  
  private void addAmmoButton(Container content) {
    JLabel btnAmmo = new JLabel();
    JLabel lblAmmoBorder = new JLabel();
    btnAmmo.setOpaque(true);
    lblAmmoBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    btnAmmo.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(19); btnAmmo.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_ammo_arrow_01.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnAmmo.setBackground(Color.LIGHT_GRAY);lblAmmoBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnAmmo.setBackground(frame.getBackground());lblAmmoBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnAmmo, MiddleLayout.ammo);
    content.add(lblAmmoBorder, MiddleLayout.ammoBorder);
    buttons.put("Ammo", btnAmmo);
  }
  
  private void createRightButtons(Container content) {
    content.setLayout(new RightButtonsLayout());
    
    addGlovesButton(content);
    addBeltButton(content);
    addPantsButton(content);
    addFeetButton(content);
    addUpperRingButton(content);
    addLowerRingButton(content);
    addUpperTrinketButton(content);
    addLowerTrinketButton(content);
  }
  
  private void addGlovesButton(Container content) {
    JLabel btnGloves = new JLabel();
    JLabel btnGlovesBorder = new JLabel();
    btnGloves.setOpaque(true);
    btnGlovesBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));
    btnGloves.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(8); btnGloves.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_gauntlets_21.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnGloves.setBackground(Color.LIGHT_GRAY);btnGlovesBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnGloves.setBackground(frame.getBackground());btnGlovesBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    JLabel btnGlovesEnch = new JLabel("No Enchant");
    btnGlovesEnch.setOpaque(true);
    btnGlovesEnch.setHorizontalAlignment(JLabel.CENTER);
    btnGlovesEnch.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnGlovesEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
    btnGlovesEnch.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadEnchants(8);}
      public void mouseEntered(MouseEvent arg0) {btnGlovesEnch.setBackground(Color.LIGHT_GRAY);btnGlovesEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnGlovesEnch.setBackground(frame.getBackground());btnGlovesEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnGloves, RightButtonsLayout.gloves);
    content.add(btnGlovesEnch, RightButtonsLayout.glovesEnch);
    content.add(btnGlovesBorder, RightButtonsLayout.glovesBorder);
    buttons.put("Gloves", btnGloves);
    buttons.put("GlovesEnch", btnGlovesEnch);
  }
  
  private void addBeltButton(Container content) {
    JLabel btnBelt = new JLabel();
    JLabel lblBeltBorder = new JLabel();
    btnBelt.setOpaque(true);
    lblBeltBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    btnBelt.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(9); btnBelt.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_belt_08.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnBelt.setBackground(Color.LIGHT_GRAY);lblBeltBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnBelt.setBackground(frame.getBackground());lblBeltBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnBelt, RightButtonsLayout.belt);
    content.add(lblBeltBorder, RightButtonsLayout.beltBorder);
    buttons.put("Belt", btnBelt);
  }

  private void addPantsButton(Container content) {
    JLabel btnPants = new JLabel();
    JLabel btnPantsBorder = new JLabel();
    btnPants.setOpaque(true);
    btnPantsBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));
    btnPants.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(10); btnPants.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_pants_cloth_01.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnPants.setBackground(Color.LIGHT_GRAY);btnPantsBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnPants.setBackground(frame.getBackground());btnPantsBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    JLabel btnPantsEnch = new JLabel("No Enchant");
    btnPantsEnch.setOpaque(true);
    btnPantsEnch.setHorizontalAlignment(JLabel.CENTER);
    btnPantsEnch.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnPantsEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
    btnPantsEnch.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadEnchants(10);}
      public void mouseEntered(MouseEvent arg0) {btnPantsEnch.setBackground(Color.LIGHT_GRAY);btnPantsEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnPantsEnch.setBackground(frame.getBackground());btnPantsEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnPants, RightButtonsLayout.pants);
    content.add(btnPantsEnch, RightButtonsLayout.pantsEnch);
    content.add(btnPantsBorder, RightButtonsLayout.pantsBorder);
    buttons.put("Pants", btnPants);
    buttons.put("PantsEnch", btnPantsEnch);
  }
  
  private void addFeetButton(Container content) {
    JLabel btnFeet = new JLabel();
    JLabel btnFeetBorder = new JLabel();
    btnFeet.setOpaque(true);
    btnFeetBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));
    btnFeet.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(11); btnFeet.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_boots_cloth_11.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnFeet.setBackground(Color.LIGHT_GRAY);btnFeetBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnFeet.setBackground(frame.getBackground());btnFeetBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    JLabel btnFeetEnch = new JLabel("No Enchant");
    btnFeetEnch.setOpaque(true);
    btnFeetEnch.setHorizontalAlignment(JLabel.CENTER);
    btnFeetEnch.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnFeetEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
    btnFeetEnch.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadEnchants(11);}
      public void mouseEntered(MouseEvent arg0) {btnFeetEnch.setBackground(Color.LIGHT_GRAY);btnFeetEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnFeetEnch.setBackground(frame.getBackground());btnFeetEnch.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnFeet, RightButtonsLayout.feet);
    content.add(btnFeetEnch, RightButtonsLayout.feetEnch);
    content.add(btnFeetBorder, RightButtonsLayout.feetBorder);
    buttons.put("Feet", btnFeet);
    buttons.put("FeetEnch", btnFeetEnch);
  }
  
  private void addUpperRingButton(Container content) {
    JLabel btnRing = new JLabel();
    JLabel lblRingBorder = new JLabel();
    btnRing.setOpaque(true);
    lblRingBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    btnRing.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(12); btnRing.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_jewelry_ring_ahnqiraj_02.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnRing.setBackground(Color.LIGHT_GRAY);lblRingBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnRing.setBackground(frame.getBackground());lblRingBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnRing, RightButtonsLayout.ring1);
    content.add(lblRingBorder, RightButtonsLayout.ring1Border);
    buttons.put("Ring1", btnRing);
  }

  private void addLowerRingButton(Container content) {
    JLabel btnRing = new JLabel();
    JLabel lblRingBorder = new JLabel();
    btnRing.setOpaque(true);
    lblRingBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    btnRing.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(13); btnRing.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_jewelry_ring_ahnqiraj_02.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnRing.setBackground(Color.LIGHT_GRAY);lblRingBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnRing.setBackground(frame.getBackground());lblRingBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnRing, RightButtonsLayout.ring2);
    content.add(lblRingBorder, RightButtonsLayout.ring2Border);
    buttons.put("Ring2", btnRing);
  }

  private void addUpperTrinketButton(Container content) {
    JLabel btnTrinket = new JLabel();
    JLabel lblTrinketBorder = new JLabel();
    btnTrinket.setOpaque(true);
    lblTrinketBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    btnTrinket.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(14); btnTrinket.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_jewelry_talisman_08.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnTrinket.setBackground(Color.LIGHT_GRAY);lblTrinketBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnTrinket.setBackground(frame.getBackground());lblTrinketBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnTrinket, RightButtonsLayout.trinket1);
    content.add(lblTrinketBorder, RightButtonsLayout.trinket1Border);
    buttons.put("Trinket1", btnTrinket);
  }
  
  private void addLowerTrinketButton(Container content) {
    JLabel btnTrinket = new JLabel();
    JLabel lblTrinketBorder = new JLabel();
    btnTrinket.setOpaque(true);
    lblTrinketBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    btnTrinket.addMouseListener(new MouseListener() {
      public void mouseClicked(MouseEvent arg0) {loadHeads(15); btnTrinket.setIcon(new ImageIcon(MainFrame.class.getResource("/resources/inv_belt_02.jpg")));}
      public void mouseEntered(MouseEvent arg0) {btnTrinket.setBackground(Color.LIGHT_GRAY);lblTrinketBorder.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue.brighter()));}
      public void mouseExited(MouseEvent arg0) {btnTrinket.setBackground(frame.getBackground());lblTrinketBorder.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));}
      public void mousePressed(MouseEvent arg0) {}
      public void mouseReleased(MouseEvent arg0) {}
    });
    content.add(btnTrinket, RightButtonsLayout.trinket2);
    content.add(lblTrinketBorder, RightButtonsLayout.trinket2Border);
    buttons.put("Trinket2", btnTrinket);
  }
  
  private void loadHeads(int i) {
    System.out.println("Heads: " + i);
    JLabel button = null;
    switch (i) {
    case 0: button = buttons.get("Head"); break;
    case 1: button = buttons.get("Neck"); break;
    default: button = buttons.get("Head"); break;
    }
    
    JFrame newFrame = new JFrame();
  //  newFrame.setTitle(title);
    newFrame.setSize(350,500);
    newFrame.setUndecorated(true);
    System.out.println("adding focus listener");
      newFrame.addFocusListener(new FocusListener() {
          private boolean gained = true;
          @Override
          public void focusGained(FocusEvent e) {
            gained = true;
            System.out.println("focus gained");
          }

          @Override
          public void focusLost(FocusEvent e) {
            System.out.println("focus lost");
            if (gained) {
              System.out.println("focus lost");
              newFrame.setVisible(false);
              newFrame.dispatchEvent(new WindowEvent(newFrame, WindowEvent.WINDOW_CLOSING));
            }
          }
        } );
      Container content = newFrame.getContentPane();
      content.setLayout(new GridLayout(1,1));
      Container pane = new Container();
      pane.setLayout(new GridLayout(100,1));
      for (int j = 1; j <= 100; j++) {
      //  JLabel tmp = new JLabel("" + j);
      /*New Stuff from here*/
        Container tmp = new Container();
        tmp.setLayout(new ItemDisplayLayout());
        
        JTextArea up = new JTextArea();
        up.setBackground(Color.BLACK);
        up.setEditable(false);
        tmp.add(ItemDisplayLayout.UPPER_BORDER, up);
        
        JTextArea left = new JTextArea();
        left.setBackground(Color.BLACK);
        left.setEditable(false);
        tmp.add(ItemDisplayLayout.LEFT_BORDER, left);
        
        JTextArea right = new JTextArea();
        right.setBackground(Color.BLACK);
        right.setEditable(false);
        tmp.add(ItemDisplayLayout.RIGHT_BORDER, right);
        
        JTextArea down = new JTextArea();
        down.setBackground(Color.BLACK);
        down.setEditable(false);
        tmp.add(ItemDisplayLayout.LOWER_BORDER, down);
        
        JTextArea icon = new JTextArea();
        icon.setBackground(Color.green);
        icon.setEditable(false);
        tmp.add(ItemDisplayLayout.ICON, icon);
        
        JLabel name = new JLabel("Name goes here " + j);
        tmp.add(ItemDisplayLayout.NAME, name);
        
        JTextArea attr = new JTextArea();
        attr.setBackground(Color.blue);
        attr.setEditable(false);
        tmp.add(ItemDisplayLayout.ATTRIBUTES, attr);
        
     /*   tmp.addMouseListener(new MouseListener() {

        @Override
        public void mouseClicked(MouseEvent arg0) {
          // TODO Auto-generated method stub
          
        }

        @Override
        public void mouseEntered(MouseEvent arg0) {
          ((ItemDisplayLayout)(tmp.getLayout())).getComponents().get(ItemDisplayLayout.LEFT_BORDER).setBackground(Color.cyan);
          ((ItemDisplayLayout)(tmp.getLayout())).getComponents().get(ItemDisplayLayout.RIGHT_BORDER).setBackground(Color.cyan);
          ((ItemDisplayLayout)(tmp.getLayout())).getComponents().get(ItemDisplayLayout.UPPER_BORDER).setBackground(Color.cyan);
          ((ItemDisplayLayout)(tmp.getLayout())).getComponents().get(ItemDisplayLayout.LOWER_BORDER).setBackground(Color.cyan);
  //        (tmp.getComponentAt(new Point(0,2))).setBackground(Color.cyan);
  //        (tmp.getComponentAt(new Point(2,0))).setBackground(Color.cyan);
  //        (tmp.getComponentAt(new Point(tmp.getHeight()-1, tmp.getWidth()/2))).setBackground(Color.cyan);
  //        (tmp.getComponentAt(new Point(tmp.getHeight()/2, tmp.getWidth()-1))).setBackground(Color.cyan);
        }

        @Override
        public void mouseExited(MouseEvent arg0) {
          ((ItemDisplayLayout)(tmp.getLayout())).getComponents().get(ItemDisplayLayout.LEFT_BORDER).setBackground(Color.black);
          ((ItemDisplayLayout)(tmp.getLayout())).getComponents().get(ItemDisplayLayout.RIGHT_BORDER).setBackground(Color.black);
          ((ItemDisplayLayout)(tmp.getLayout())).getComponents().get(ItemDisplayLayout.UPPER_BORDER).setBackground(Color.black);
          ((ItemDisplayLayout)(tmp.getLayout())).getComponents().get(ItemDisplayLayout.LOWER_BORDER).setBackground(Color.black);
  //        (tmp.getComponentAt(new Point(0,2))).setBackground(Color.black);
  //        (tmp.getComponentAt(new Point(2,0))).setBackground(Color.black);
  //        (tmp.getComponentAt(new Point(tmp.getHeight()-1, tmp.getWidth()/2))).setBackground(Color.black);
  //        (tmp.getComponentAt(new Point(tmp.getHeight()/2, tmp.getWidth()-1))).setBackground(Color.black);
        }

        @Override
        public void mousePressed(MouseEvent arg0) {
          // TODO Auto-generated method stub
          
        }

        @Override
        public void mouseReleased(MouseEvent arg0) {
          // TODO Auto-generated method stub
          
        }
          
      }); */ 
      /*New Stuff till here*/  
        pane.add(tmp);
      }
      pane.addMouseListener(new MouseListener() {
        Point p;

      @Override
      public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
      }

      @Override
      public void mouseEntered(MouseEvent arg0) {
        p = arg0.getPoint();
        ((ItemDisplayLayout)(((Container)(pane.getComponentAt(p)))
            .getLayout())).getComponents().get(ItemDisplayLayout.LEFT_BORDER)
            .setBackground(Color.cyan);
        ((ItemDisplayLayout)(((Container)(pane.getComponentAt(p)))
            .getLayout())).getComponents().get(ItemDisplayLayout.RIGHT_BORDER)
            .setBackground(Color.cyan);
        ((ItemDisplayLayout)(((Container)(pane.getComponentAt(p)))
            .getLayout())).getComponents().get(ItemDisplayLayout.LOWER_BORDER)
            .setBackground(Color.cyan);
        ((ItemDisplayLayout)(((Container)(pane.getComponentAt(p)))
            .getLayout())).getComponents().get(ItemDisplayLayout.UPPER_BORDER)
            .setBackground(Color.cyan);
      }

      @Override
      public void mouseExited(MouseEvent arg0) {
        ((ItemDisplayLayout)(((Container)(pane.getComponentAt(p)))
            .getLayout()))
            .getComponents()
            .get(ItemDisplayLayout.LEFT_BORDER)
            .setBackground(Color.black);
        ((ItemDisplayLayout)(((Container)(pane.getComponentAt(p)))
            .getLayout())).getComponents().get(ItemDisplayLayout.RIGHT_BORDER)
            .setBackground(Color.black);
        ((ItemDisplayLayout)(((Container)(pane.getComponentAt(p)))
            .getLayout())).getComponents().get(ItemDisplayLayout.LOWER_BORDER)
            .setBackground(Color.black);
        ((ItemDisplayLayout)(((Container)(pane.getComponentAt(p)))
            .getLayout())).getComponents().get(ItemDisplayLayout.UPPER_BORDER)
            .setBackground(Color.black);
      }

      @Override
      public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
      }

      @Override
      public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
      }
        
      });
      content.add(new JScrollPane(pane));
      newFrame.setContentPane(content);
    newFrame.setLocation(button.getLocationOnScreen().x + button.getWidth(), button.getLocationOnScreen().y);
    newFrame.setVisible(true);
  }
  
  private void loadEnchants(int i) {
    System.out.println("Enchants: " + i);
  }
  
  
  private void createRightContent(Container mainContent) {
    Container rightContent = new Container();
    rightContent.setLayout(new BorderLayout());
    
    JComboBox<String> cb = new JComboBox<String>();
    cb.addItem("Head");
    cb.addItem("Neck");
    cb.addActionListener((ActionEvent ae) -> {System.out.println(cb.getSelectedItem());});
    
    rightContent.add(cb, BorderLayout.NORTH);
    rightContent.add(new JLabel(), BorderLayout.CENTER);
    
    mainContent.add(rightContent, BorderLayout.CENTER);
  }
  
  private Component createTabPane() {
    JTabbedPane tabPane = new JTabbedPane();
    
    Container leftContent = new Container();
    leftContent.setLayout(new BorderLayout());
    
    Container left = new Container();
    left.setLayout(new GridLayout(100,1));
    
    
    for (int i = 1; i <= 100; i++) {
      JLabel tmp = new JLabel("" + i);
      left.add(tmp);
    }
    
    Container right = new Container();
    right.setLayout(new GridLayout(100,1));
    
    for (int i = 1; i <= 100; i++) {
      JCheckBox tmp = new JCheckBox();
      right.add(tmp);
    }
    
    
    leftContent.add(left, BorderLayout.CENTER);
    leftContent.add(right, BorderLayout.EAST);
    JScrollPane pane = new JScrollPane(leftContent);
    tabPane.addTab("Buffs", pane);
    
  //  tabPane.addTab("Null", new JLabel(new ImageIcon(MainFrame.class.getResource("/resources/mage_1.jpg"))));
    
    return tabPane;
  }

  private Component createMenu() {
    JMenuBar menu = new JMenuBar();
    menu.setBackground(Color.LIGHT_GRAY);
    JMenu menuFile = new JMenu("File");
    menu.add(menuFile);
    return menu;
  }
  
  private Component createBottom() {
    JLabel res = new JLabel("DPS:");
    res.setSize(frame.getContentPane().getWidth(), 10);
  //  res.setOpaque(true);
  //  res.setBackground(Color.LIGHT_GRAY);
    return res;
  }
  
  public static void main(String[] args) {
    new MainFrame(util.Class.Mage).show();
  }
}
