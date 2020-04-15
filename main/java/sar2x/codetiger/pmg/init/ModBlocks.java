package sar2x.codetiger.pmg.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import sar2x.codetiger.pmg.blocks.BlockBase;
import sar2x.codetiger.pmg.blocks.burn_book_shelf;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block BURN_BOOK_SHELF = new burn_book_shelf("burn_book_shelf",Material.WOOD);
}
