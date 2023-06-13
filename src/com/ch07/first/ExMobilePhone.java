package com.ch07.first;

public class ExMobilePhone {
	public static void main(String[] args) {
		
		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		cellPhone.powerOn(1);
		
		System.out.println("----------------------------------------------------------");
		
		DmbCellphone dmb = new DmbCellphone();
		
		dmb.powerOn();
		dmb.powerOn(1);
		dmb.changeChannelDmb(3);
		dmb.turnOffDmb();
		
		System.out.println("============================================================");
		
		mobilePhone mobil = new mobilePhone();
		
		mobil.changeChannelDmb(5);
		mobil.receiveVoice(null);
		
	}
}
