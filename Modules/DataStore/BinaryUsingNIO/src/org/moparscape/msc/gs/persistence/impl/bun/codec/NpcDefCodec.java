package org.rscnation.msc.gs.persistence.impl.bun.codec;

import java.nio.ByteBuffer;

import org.rscnation.msc.gs.model.definition.entity.NPCDef;
import org.rscnation.msc.gs.persistence.impl.bun.ByteBufferUtil;
import org.rscnation.msc.gs.persistence.impl.bun.Codec;

public class NpcDefCodec implements Codec<NPCDef[]> {

	@Override
	public ByteBuffer encode(NPCDef[] t) {
		
		return null;
	}
	
	private ByteBuffer encode(NPCDef d) {
		ByteBuffer buf = ByteBuffer.allocate(d.getName().length() + 1 + d.getDescription().length() + 1 + d.getCommand().length() + 2 + 4 * 2 + 2 + 13 + 8 + 8);
		
		ByteBufferUtil.putString(buf, d.getName());
		
		
		buf.flip();
		return buf;
	}

	@Override
	public NPCDef[] decode(ByteBuffer buf) {
		// TODO Auto-generated method stub
		return null;
	}
}
