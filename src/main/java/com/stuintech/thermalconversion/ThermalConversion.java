package com.stuintech.thermalconversion;

import net.fabricmc.api.ModInitializer;

/*
 * Created by Stuart Irwin on 4/2/2019.
 */

public class ThermalConversion implements ModInitializer {
	public static final String MODID = "thermalconversion";

	@Override
	public void onInitialize() {
		//Load items list
		ModItems.register();
	}
}
