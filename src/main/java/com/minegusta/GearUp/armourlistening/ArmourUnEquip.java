package com.minegusta.gearup.armourlistening;

public class ArmourUnEquip {
  
    private Player p;
    private ItemStack i;
    private String armourName;
    private ClickType clickType;

    public ArmourUnEquip(PlayerInteractEvent e)
    {
        this.p = e.getPlayer();
        this.i = e.getItem();
    }

    public ArmourUnEquip(InventoryClickEvent e)
    {
        this.p = (Player) e.getWhoClicked();
        this.i = e.getCurrentItem();
        this.clickType = e.getClick();
    }
}
