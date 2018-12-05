package com.crimsoncoal.crimsoncoal.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CrimsonCoalBlock extends BlockBase
{

	public CrimsonCoalBlock(String name, Material material)
	{
		super(name, material, false);

		ItemBlock crimsonCoalBlock = new ItemBlock(this)
		{
			@Override
			public int getItemBurnTime(ItemStack itemStack)
			{
				return 24000;
			}
		};

		this.register(crimsonCoalBlock);

		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.0F);
		// setLightOpacity(0);
		// setBlockUnbreakable();
	}
}
