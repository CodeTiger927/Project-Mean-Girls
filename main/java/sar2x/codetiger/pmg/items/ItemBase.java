package sar2x.codetiger.pmg.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sar2x.codetiger.pmg.Main;
import sar2x.codetiger.pmg.init.ModItems;
import sar2x.codetiger.pmg.util.interfaces.IHasModel;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
