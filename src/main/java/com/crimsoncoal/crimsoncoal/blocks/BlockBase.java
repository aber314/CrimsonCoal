package com.crimsoncoal.crimsoncoal.blocks;

import com.crimsoncoal.crimsoncoal.Main;
import com.crimsoncoal.crimsoncoal.init.ModBlocks;
import com.crimsoncoal.crimsoncoal.init.ModItems;
import com.crimsoncoal.crimsoncoal.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{

	public BlockBase(String name, Material material)
	{
		super(material);
		setName(name);
		register(new ItemBlock(this));
	}

	public BlockBase(String name, Material material, boolean register)
	{
		super(material);
		setName(name);
		if (register)
			register(new ItemBlock(this));

	}

	private void setName(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	public void register(ItemBlock itemBlock)
	{

		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(itemBlock.setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
