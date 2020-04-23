package sar2x.codetiger.pmg.init;

import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModRecipes {
	public static void init(){
		GameRegistry.addSmelting(Items.ENCHANTED_BOOK, new ItemStack(ModItems.BURN_BOOK, 1), 1.5f);
	}
}
