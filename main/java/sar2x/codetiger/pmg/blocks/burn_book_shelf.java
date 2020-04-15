package sar2x.codetiger.pmg.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class burn_book_shelf extends BlockBase{

	public burn_book_shelf(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(1.5F);
		setResistance(10.0F);
		setHarvestLevel("axe", 0);
		setLightLevel(1.0F);
		//setLightOpacity()
	}

}
