package net.fmg793.cypressblockitemapi.impl.forge;

public interface IBlockItemIDProvider {
	public default int getBlockID() {
		throw new AbstractMethodError();
	}
}
