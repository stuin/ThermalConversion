package com.stuintech.thermalconversion.mixin;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import com.stuintech.thermalconversion.ModItems;

import java.util.Map;

@Mixin(AbstractFurnaceBlockEntity.class)
public class MixinAbstractFurnaceBlockEntity {

    //List items with fuel values
    @Inject(method = "createFuelTimeMap", at = @At("RETURN"), cancellable = true)
    private static void createBurnTimeMap(CallbackInfoReturnable<Map<Item, Integer>> cir) {
        cir.getReturnValue().put(ModItems.cell1, 200);
        cir.getReturnValue().put(ModItems.cell2, 400);
        cir.getReturnValue().put(ModItems.cell8, 1600);
        cir.getReturnValue().put(ModItems.cell64, 12800);

        //System.out.println("Thermal Conversion: Fuels Added");
    }

}
