package com.stuintech.thermalconversion;

import com.stuintech.thermalconversion.items.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/*
 * Created by Stuart Irwin on 4/2/2019.
 */

@Mod(ThermalConversion.MODID)
public class ThermalConversion {
	public static final String MODID = "thermalconversion";
	
	public ThermalConversion() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModItems.ITEMS.register(modEventBus);
	}
}
