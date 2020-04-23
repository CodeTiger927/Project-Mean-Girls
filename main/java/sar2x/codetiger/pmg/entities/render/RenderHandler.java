package sar2x.codetiger.pmg.entities.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import sar2x.codetiger.pmg.entities.EntityCentaur;
import sar2x.codetiger.pmg.entities.EntityRegina;

public class RenderHandler {
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class,new IRenderFactory<EntityCentaur>() {
			@Override
			public Render<? super EntityCentaur> createRenderFor(RenderManager manager) {
				return new RenderCentaur(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityRegina.class,new IRenderFactory<EntityRegina>() {
			@Override
			public Render<? super EntityRegina> createRenderFor(RenderManager manager) {
				return new RenderRegina(manager);
			}
		});
	}
}
