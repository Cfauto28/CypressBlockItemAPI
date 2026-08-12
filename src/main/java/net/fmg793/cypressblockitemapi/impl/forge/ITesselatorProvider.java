package net.fmg793.cypressblockitemapi.impl.forge;

public interface ITesselatorProvider {
	public default int textureID(int i) {
		throw new AbstractMethodError();
	}
	
	public default boolean renderingWorldRenderer(boolean b) {
		throw new AbstractMethodError();
	}
}
