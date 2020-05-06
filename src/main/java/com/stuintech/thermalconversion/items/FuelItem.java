package com.stuintech.thermalconversion.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FuelItem extends Item {
    private final int burnTime;
    
    public FuelItem(int burnTime) {
        super(new Item.Properties().group(ItemGroup.MISC));
        this.burnTime = burnTime;
    }
    
    @Override
    public int getBurnTime(ItemStack itemStack) {
        return burnTime;
    }
}
