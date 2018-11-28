package com.crimsoncoal.crimsoncoal.util.handlers;

import com.crimsoncoal.crimsoncoal.init.ModBlocks;
import com.crimsoncoal.crimsoncoal.init.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == ModItems.CRIMSON_COAL)
			return 2400;
		
		if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.CRIMSON_COAL_BLOCK))
			return 24000;
		return 0;
	}
	
}
