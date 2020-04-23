/*package sar2x.codetiger.pmg.init;

import java.util.Random;
import sar2x.codetiger.pmg.Main;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityVillager.ITradeList;
import net.minecraft.entity.passive.EntityVillager.PriceInfo;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerCareer;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder Main.MOD_ID;

public class ModProfessions {

		public final static VillageProfession drug_dealer = null;
		
	    
	    // declare VillagerCareers
	    public static VillagerCareer creeper_dealer;

	    @Mod.EventBusSubscriber(modid = MainMod.MODID)
	    public static class RegistrationHandler
	    {
	        
	        public static void onEvent(final RegistryEvent.Register<VillagerProfession> event)
	        {
	            final IForgeRegistry<VillagerProfession> registry = event.getRegistry();

	            // DEBUG
	            System.out.println("Registering villager professions");
	            
	            registry.register(new VillagerProfession(
	                    MainMod.MOD_ID+":mysterious_stranger", 
	                    MainMod.MOD_ID+":textures/entities/mysterious_stranger.png", 
	                    MainMod.MOD_ID+":textures/entities/mysterious_stranger.png"
	                    )
	             );
	        }
	    }*/
	    
	    /**
	     * Associate careers and trades.
	     */
	   /*ublic static void associateCareersAndTrades()
	    {
	        // DEBUG
	        System.out.println("Associating careers and trades to villager professions");
	        
	        creeper_dealer = (new VillagerCareer(drug_dealer, "creeper_dealer"))
	                .addTrade(1, new TradeEmeraldForCreeperCrack());
	    }
	    
	    public static class TradeEmeraldsForCreeperCrack implements ITradeList
	    {
	        /** The  item stack to buy */
	        /*public ItemStack stack;
	        /** The price info determining the amount of emeralds to trade in for the enchanted item */
	        /*public EntityVillager.PriceInfo priceInfo;*/

	        /**
	         * Instantiates a new trade emeralds for enchanted boots.
	         */
	        /*public TradeEmeraldsForEnchantedBoots()
	        {
	            stack = new ItemStack(Items.GOLDEN_BOOTS);
	            stack.addEnchantment(ModEnchantments.safe_falling, 2);
	            priceInfo = new PriceInfo(17, 64);
	        }*/

	        /* (non-Javadoc)
	         * @see net.minecraft.entity.passive.EntityVillager.ITradeList#addMerchantRecipe(net.minecraft.entity.IMerchant, net.minecraft.village.MerchantRecipeList, java.util.Random)
	         */
	        /*@Override
	        public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
	        {
	            int actualPrice = 1;

	            if (priceInfo != null)
	            {
	                actualPrice = priceInfo.getPrice(random);
	            }

	            ItemStack stackToPay = new ItemStack(Items.EMERALD, actualPrice, 0);
	            recipeList.add(new MerchantRecipe(stackToPay, stack));
	            
	            // DEBUG
	            System.out.println("Merchant recipe list = "+recipeList.getRecipiesAsTags());
	        }
	    }    
}*/