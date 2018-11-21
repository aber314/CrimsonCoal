package com.crimsoncoal.crimsoncoal.init;

import java.util.ArrayList;
import java.util.List;

import com.crimsoncoal.crimsoncoal.blocks.CrimsonCoalBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block CRIMSON_COAL_BLOCK = new CrimsonCoalBlock("crimson_coal_block", Material.ROCK);

}
