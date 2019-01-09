package com.crimsoncoal.crimsoncoal.util.handlers;

import com.crimsoncoal.entity.EntityCrimsonCrawler;
import com.crimsoncoal.entity.render.RenderCrimsonCrawler;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{

	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityCrimsonCrawler.class, new IRenderFactory<EntityCrimsonCrawler>()
		{
			public Render<? super EntityCrimsonCrawler> createRenderFor(RenderManager manager)
			{
				return new RenderCrimsonCrawler(manager);
			}
		});
	}

}
