package net.fmg793.cypressblockitemapi.mixin.forge;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import net.fmg793.cypressblockitemapi.impl.forge.IBlockItemIDProvider;
import net.minecraft.item.BlockItem;

@Mixin(BlockItem.class)
public class BlockItemMixin implements IBlockItemIDProvider {
	
	@Shadow
	private int block;

	@Override
	public int getBlockID() {
		return this.block;
	}
}
