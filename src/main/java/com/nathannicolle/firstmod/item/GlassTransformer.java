package com.nathannicolle.firstmod.item;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;

public class GlassTransformer extends Item {
	public GlassTransformer(Properties properties) {
		super(properties);
	}
	
	@Override
	public InteractionResult onItemUseFirst(ItemStack stack, UseOnContext context) {
		stack.setDamageValue(stack.getDamageValue() + 1);
		return super.onItemUseFirst(stack, context);
	}
}
