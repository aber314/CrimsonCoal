package com.crimsoncoal.crimsoncoal.init;

import com.crimsoncoal.crimsoncoal.Main;
import com.crimsoncoal.crimsoncoal.util.Reference;
import com.crimsoncoal.entity.EntityCentaur;
import com.crimsoncoal.entity.EntityCrimsonCrawler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
	public static void registerEntities()
	{
		registerEntity("Centaur", EntityCentaur.class, Reference.ENTITY_CENTAUR, 50, 11437146, 000000); // mathisful.com/hexideimal-decimal-colors.html
		registerEntity("Crimson Crawler", EntityCrimsonCrawler.class, Reference.ENTITY_CRIMSON_CRAWLER, 50, 15022344, 2161518);
	}

	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
		EntityRegistry.addSpawn(EntityCrimsonCrawler.class, 100, 1, 3, EnumCreatureType.MONSTER, Biomes.HELL);

		// TODO Here I tried to get the Crimson Crawlers to spawn in the overworld only. For some reason it crashes the game at run time.
		// For now, I'm just going to send the Crimson Crawlers straight to Hell.

		// // Get overworld biomes only
		// Map<String, Biome> biomeMap = new HashMap<>();
		// for (Biome biome : ForgeRegistries.BIOMES.getValuesCollection().toArray(new Biome[0]))
		// {
		// biomeMap.put(biome.getBiomeName(), biome);
		// }
		//
		// biomeMap.remove("VOID");
		// biomeMap.remove("HELL");
		// biomeMap.remove("SKY");
		//
		// // Add spawning conditions for Crimson Crawler
		// EntityRegistry.addSpawn(EntityCrimsonCrawler.class, 10, 1, 3, EnumCreatureType.MONSTER, (Biome[]) biomeMap.entrySet().toArray());

	}
}
