package com.crimsoncoal.crimsoncoal.items;

import net.minecraft.item.ItemStack;

public class CrimsonCoal extends ItemBase
{
	public CrimsonCoal(String name)
	{
		super(name);
	}

	@Override
	public int getItemBurnTime(ItemStack itemStack)
	{
		return 2400;
	}
}
