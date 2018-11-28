package com.crimsoncoal.crimsoncoal.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{

	public static void init()
	{
		// GameRegistry.addSmelting(ModItems.CRIMSON_COAL, new ItemStack(ModBlocks.CRIMSON_COAL_BLOCK, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.CRIMSON_COAL_BLOCK, new ItemStack(Items.DIAMOND), 3.0F);
		GameRegistry.addSmelting(ModBlocks.POLISHED_CRIMSON_COAL_BLOCK, new ItemStack(Items.DIAMOND), 3.0F);
	}
}
