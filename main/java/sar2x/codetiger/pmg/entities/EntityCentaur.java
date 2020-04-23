package sar2x.codetiger.pmg.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityCentaur extends EntityCow {

	public EntityCentaur(World worldIn) {
		super(worldIn);
	}
	
	@Override
	public EntityCow createChild(EntityAgeable ageable) {
		return new EntityCentaur(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
		return super.getHurtSound(p_184601_1_);
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return super.getDeathSound();
	}
	

}
