package sar2x.codetiger.pmg.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import sar2x.codetiger.pmg.entities.render.RenderHandler;
import sar2x.codetiger.pmg.init.ModEntities;
import sar2x.codetiger.pmg.util.handlers.RegistryHandler;

public class ClientProxy extends CommonProxy {
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	@Override
	public void preInit() {
		super.preInit();
		RenderHandler.registerEntityRenders();
	}
}
