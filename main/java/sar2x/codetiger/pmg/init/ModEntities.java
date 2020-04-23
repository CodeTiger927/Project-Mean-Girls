package sar2x.codetiger.pmg.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import sar2x.codetiger.pmg.Main;
import sar2x.codetiger.pmg.entities.EntityCentaur;
import sar2x.codetiger.pmg.util.Reference;

public class ModEntities {
	public static void registerEntities() {
		registerEntity("centaur",EntityCentaur.class,Reference.ENTITY_CENTAUR,50,11437146,000000);
	}
	
	private static void registerEntity(String name,Class<? extends Entity> entity,int id,int range,int color1,int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name),entity,name,id,Main.instance,range,1,true,color1,color2);
	}
}