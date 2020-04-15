package sar2x.codetiger.pmg.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import sar2x.codetiger.pmg.init.ModItems;
import sar2x.codetiger.pmg.items.burn_book;

public class burn_book_shelf extends BlockBase {

	public burn_book_shelf(String name, Material material) {
		super(name, material);

		setSoundType(SoundType.WOOD);
		setHardness(1.5F);
		setResistance(10.0F);
		setHarvestLevel("axe", 0);
		setLightLevel(1.0F);
		// setLightOpacity()
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return ModItems.BURN_BOOK;
	}
	@Override
	public int quantityDropped(Random rand) {
		return 3;
	}
}
