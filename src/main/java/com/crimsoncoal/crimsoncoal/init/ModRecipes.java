package com.crimsoncoal.crimsoncoal.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{

	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.CRIMSON_COAL_ORE, new ItemStack(ModItems.CRIMSON_COAL, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.CHAOTIC_COAL_ORE, new ItemStack(ModItems.CRIMSON_COAL, 2), 1.5F);
	}
}
