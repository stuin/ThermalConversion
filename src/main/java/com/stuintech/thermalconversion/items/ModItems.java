package com.stuintech.thermalconversion.items;

import com.stuintech.thermalconversion.ThermalConversion;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/*
 * Created by Stuart Irwin on 4/2/2019.
 */

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            new DeferredRegister<>(ForgeRegistries.ITEMS, ThermalConversion.MODID);
    
    //Basic items
    public static RegistryObject<FuelItem> cell1 = ITEMS.register("cell1", () -> new FuelItem(200));
    public static RegistryObject<FuelItem> cell2 = ITEMS.register("cell2", () -> new FuelItem(400));
    public static RegistryObject<FuelItem> cell8 = ITEMS.register("cell8", () -> new FuelItem(1600));
    public static RegistryObject<FuelItem> cell64 = ITEMS.register("cell64", () -> new FuelItem(12800));
}
