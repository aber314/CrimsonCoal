package com.crimsoncoal.entity.render;

import com.crimsoncoal.crimsoncoal.util.Reference;
import com.crimsoncoal.entity.EntityCrimsonCrawler;
import com.crimsoncoal.entity.model.ModelCrimsonCrawler;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCrimsonCrawler extends RenderLiving<EntityCrimsonCrawler>
{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/crimson_crawler.png");

	public RenderCrimsonCrawler(RenderManager manager)
	{
		super(manager, new ModelCrimsonCrawler(), 0.5F);
	}

	protected ResourceLocation getEntityTexture(EntityCrimsonCrawler entity)
	{
		return TEXTURES;
	}

	protected void applyRortations(EntityCrimsonCrawler entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
