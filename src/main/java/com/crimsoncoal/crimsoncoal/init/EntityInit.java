package com.crimsoncoal.crimsoncoal.init;

import com.crimsoncoal.crimsoncoal.Main;
import com.crimsoncoal.crimsoncoal.util.Reference;
import com.crimsoncoal.entity.EntityCentaur;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
	public static void reguisterEntities()
	{
		registerEntity("Centaur", EntityCentaur.class, Reference.ENTITY_CENTAUR, 50, 11437146, 000000); // mathisful.com/hexideimal-decimal-colors.html
	}

	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
