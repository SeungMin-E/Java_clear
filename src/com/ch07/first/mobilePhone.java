package com.ch07.first;

public class mobilePhone extends DmbCellphone {
	
	void are(){
		System.out.println("abcd");
		powerOn();
		changeChannelDmb(1);
	}
	
	@Override
	void changeChannelDmb(int channel) {
		System.out.println("mobliePhone.chageChannelDmb");
	}
	
	@Override
	void turnOffDmb() {
		System.out.println("mobliePhone.powerOff()");
	}
	
	@Override
	void powerOn(int a) {
		
	}
}
