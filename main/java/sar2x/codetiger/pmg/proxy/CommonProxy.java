package sar2x.codetiger.pmg.proxy;

import net.minecraft.item.Item;
import sar2x.codetiger.pmg.init.ModEntities;
import sar2x.codetiger.pmg.init.ModRecipes;
import sar2x.codetiger.pmg.util.handlers.RegistryHandler;

public class CommonProxy {
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
	
	public void preInit() {
		ModEntities.registerEntities();
	}
	public void init() {
		ModRecipes.init();
		
	}
	public void postInit() {
		
	}
}
