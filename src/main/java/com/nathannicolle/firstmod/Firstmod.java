package com.nathannicolle.firstmod;

import com.nathannicolle.firstmod.init.BlockInit;
import com.nathannicolle.firstmod.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("firstmod")
public class Firstmod {
	public static final String MOD_ID = "firstmod";
	
	public static final CreativeModeTab FIRSTMOD_TAB = new CreativeModeTab(MOD_ID) {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.GLASS_TRANSFORMER.get());
		}
	};

	public Firstmod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		MinecraftForge.EVENT_BUS.register(this);
	}
}
