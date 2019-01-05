package com.crimsoncoal.crimsoncoal.util.handlers;

import com.crimsoncoal.entity.EntityCentaur;
import com.crimsoncoal.entity.EntityCrimsonCrawler;
import com.crimsoncoal.entity.render.RenderCentaur;
import com.crimsoncoal.entity.render.RenderCrimsonCrawler;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{

	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class, new IRenderFactory<EntityCentaur>()
		{
			public Render<? super EntityCentaur> createRenderFor(RenderManager manager)
			{
				return new RenderCentaur(manager);
			}
		});

		RenderingRegistry.registerEntityRenderingHandler(EntityCrimsonCrawler.class, new IRenderFactory<EntityCrimsonCrawler>()
		{
			public Render<? super EntityCrimsonCrawler> createRenderFor(RenderManager manager)
			{
				return new RenderCrimsonCrawler(manager);
			}
		});
	}

}
