package sar2x.codetiger.pmg.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import sar2x.codetiger.pmg.entities.render.RenderHandler;
import sar2x.codetiger.pmg.init.ModBlocks;
import sar2x.codetiger.pmg.init.ModEntities;
import sar2x.codetiger.pmg.init.ModItems;
import sar2x.codetiger.pmg.util.interfaces.IHasModel;
import sar2x.codetiger.pmg.world.gen.WorldGenCustomStructures;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Item item : ModItems.ITEMS) {
			if (item instanceof IHasModel) {
				((IHasModel) item).registerModels();
			}
		}
		for (Block block : ModBlocks.BLOCKS) {
			if (block instanceof IHasModel) {
				((IHasModel) block).registerModels();
			}
		}
	}
	
	
	public static void preInitRegistries() {
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(),0);
		
		ModEntities.registerEntities();
		RenderHandler.registerEntityRenders();
		
	}
}
