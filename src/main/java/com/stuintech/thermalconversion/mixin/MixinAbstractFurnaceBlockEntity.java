package com.stuintech.thermalconversion.mixin;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import com.stuintech.thermalconversion.ModItems;

import java.util.Map;

/*
 * Mostly copied from Radient-Sora dwarf-coal-fabric
 */

@Mixin(AbstractFurnaceBlockEntity.class)
public class MixinAbstractFurnaceBlockEntity {

    //List items with fuel values
    @Inject(method = "createFuelTimeMap", at = @At("RETURN"), cancellable = true)
    private static void createBurnTimeMap(CallbackInfoReturnable<Map<Item, Integer>> cir) {
        addMapping(cir.getReturnValue(), ModItems.cell1, 200);
        addMapping(cir.getReturnValue(), ModItems.cell2, 400);
        addMapping(cir.getReturnValue(), ModItems.cell8, 1600);
        addMapping(cir.getReturnValue(), ModItems.cell64, 12800);

        //System.out.println("Thermal Conversion: Fuels Added");
    }

    private static void addMapping(Map<Item, Integer> map, ItemProvider item, int time) {
        map.put(item.getItem(), time);
    }

}
