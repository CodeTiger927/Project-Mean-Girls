package sar2x.codetiger.pmg.gen;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;
import sar2x.codetiger.pmg.GUI.IStructure;
import sar2x.codetiger.pmg.util.Reference;

public class WorldGenStructure extends WorldGenerator implements IStructure{
	public static String structureName;
	
	public WorldGenStructure(String name){
		this.structureName = name;
	}
	public static void generateStructure(World world, BlockPos pos) {
		MinecraftServer mcServer = world.getMinecraftServer();
		TemplateManager manager = worldServer.getStructureTemplateManager();
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, structureName);
		Template template = manager.get(mcServer,  location);
		
		if(template != null) {
			IBlockState state = world.getBlockState(pos);
		}
		
	}
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {

		return false;
	}
}
