package com.stuintech.thermalconversion;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

/*
 * Created by Stuart Irwin on 4/2/2019.
 */

public class ModItems {
    //Basic items
    public static final Item cell0;
    public static final Item cell1;
    public static final Item cell2;
    public static final Item cell8;
    public static final Item cell64;

    //Initialize full list
    static {
        cell0 = new Item(new Item.Settings().itemGroup(ItemGroup.MISC));
        cell1 = new Item(new Item.Settings().itemGroup(ItemGroup.MISC));
        cell2 = new Item(new Item.Settings().itemGroup(ItemGroup.MISC));
        cell8 = new Item(new Item.Settings().itemGroup(ItemGroup.MISC));
        cell64 = new Item(new Item.Settings().itemGroup(ItemGroup.MISC));
    }

    //Register items rendering
    public static void register() {
        registerItem("cell0", cell0);
        registerItem("cell1", cell1);
        registerItem("cell2", cell2);
        registerItem("cell8", cell8);
        registerItem("cell64", cell64);
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registry.ITEM, ThermalConversion.MODID + ":" + name, item);
    }
}
