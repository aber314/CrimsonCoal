package com.crimsoncoal.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityCrimsonCrawler extends EntitySpider
{

	public EntityCrimsonCrawler(World worldIn)
	{
		super(worldIn);
	}

	@Override
	public void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
		isImmuneToFire = true;
	}

	public EntitySpider createChild(EntityAgeable ageable)
	{
		return new EntityCrimsonCrawler(world);
	}

	protected SoundEvent getAmbientSound()
	{
		return super.getAmbientSound();
	}

	protected SoundEvent getHurtSound(DamageSource source)
	{
		return super.getHurtSound(source);
	}

	protected SoundEvent getDeathSound()
	{
		return super.getDeathSound();
	}

}
