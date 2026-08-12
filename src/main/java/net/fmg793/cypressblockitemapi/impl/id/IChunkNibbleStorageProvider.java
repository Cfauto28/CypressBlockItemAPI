package net.fmg793.cypressblockitemapi.impl.id;

public interface IChunkNibbleStorageProvider {
	public default short[] getData() {
		throw new AbstractMethodError();
	}
}
