package db.weapon.basics;

/**
 * An Enumeration, which values are representing the Slots, a Weapon can be slotted in.
 * @author Haeldeus
 * @version 1.0
 */
public enum WeaponSlots {
  /**
   * The value, that represents an one-hand Slot.
   */
  OneHand, 
  /**
   * The value, that represents a two-hand Slot.
   */
  TwoHand, 
  /**
   * The value, that represents the Ranged Slot.
   */
  Ranged, 
  /**
   * The value, that represents the Ammo Slot.
   */
  Ammo, 
  /**
   * The value, that represents the "Held in Offhand" Slot.
   */
  HeldInOffhand, 
  /**
   * The value, that represents the Mainhand Slot.
   */
  MainHand, 
  /**
   * The value, that represents the Offhand Slot. This is mainly used by Swords or Daggers 
   * contrasting the HeldInOffhand, which is used by magic Offhands.
   */
  Offhand, 
  /**
   * The value, that represents the Shield Slot.
   */
  Shield
}
