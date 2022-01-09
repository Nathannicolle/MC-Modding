package com.nathannicolle.firstmod.init;

import com.google.common.base.Supplier;
import com.nathannicolle.firstmod.Firstmod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Firstmod.MOD_ID);
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", () -> new Item(new Item.Properties().tab(Firstmod.FIRSTMOD_TAB)));
	public static final RegistryObject<Item> GLASS_TRANSFORMER = register("glass_transformer", () -> new Item(new Item.Properties().tab(Firstmod.FIRSTMOD_TAB).durability(200)));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}
