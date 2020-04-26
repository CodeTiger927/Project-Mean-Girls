package sar2x.codetiger.pmg.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import sar2x.codetiger.pmg.init.ModEntities;
import sar2x.codetiger.pmg.init.ModRecipes;
import sar2x.codetiger.pmg.util.handlers.RegistryHandler;
import sar2x.codetiger.pmg.world.gen.WorldGenCustomStructures;

public class CommonProxy {
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
	
	public void preInit() {
		ModEntities.registerEntities();
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(),0);
	}
	public void init() {
		ModRecipes.init();
		
	}
	public void postInit() {
		
	}
}
