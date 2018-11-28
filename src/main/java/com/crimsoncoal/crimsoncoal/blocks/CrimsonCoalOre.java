package com.crimsoncoal.crimsoncoal.blocks;

import java.util.Random;

import com.crimsoncoal.crimsoncoal.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CrimsonCoalOre extends BlockBase
{

	public CrimsonCoalOre(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 0);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.CRIMSON_COAL;
	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
	{
		Random rand = new Random();
		int max = 3;
		int min = 0;

		return rand.nextInt(max) + min;
	}

	@Override
	public int quantityDropped(Random rand)
	{
		return 1;
	}
}
