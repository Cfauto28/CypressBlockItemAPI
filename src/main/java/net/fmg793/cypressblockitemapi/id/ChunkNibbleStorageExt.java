package net.fmg793.cypressblockitemapi.id;

import net.fmg793.cypressblockitemapi.impl.id.IChunkNibbleStorageProvider;
import net.minecraft.world.chunk.ChunkNibbleStorage;

public class ChunkNibbleStorageExt extends ChunkNibbleStorage implements IChunkNibbleStorageProvider {
	public short[] newdata;
	
	public ChunkNibbleStorageExt(int size) {
		super(size);
		this.newdata = new short[size >> 1];
	}
	
	public ChunkNibbleStorageExt(short[] data) {
		this(data.length);
		this.newdata = data;
	}
    
	public short[] getData() {
		return this.newdata;
	}
}