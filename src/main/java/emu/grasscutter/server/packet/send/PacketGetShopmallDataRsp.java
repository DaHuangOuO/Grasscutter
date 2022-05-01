package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp;

public class PacketGetShopmallDataRsp extends BasePacket {
	
	public PacketGetShopmallDataRsp() {
		super(PacketOpcodes.GetShopmallDataRsp);

		GetShopmallDataRsp.Builder proto = GetShopmallDataRsp.newBuilder();
		proto.addShopTypeList(1001);
		this.setData(proto.build());
	}
}
