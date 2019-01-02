package com.crimsoncoal.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityCentaur extends EntityCow
{

	public EntityCentaur(World worldIn)
	{
		super(worldIn);

	}

	public EntityCow createChild(EntityAgeable ageable)
	{
		return new EntityCentaur(world);
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
