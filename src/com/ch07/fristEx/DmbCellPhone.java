package com.ch07.fristEx;

public class DmbCellPhone extends CellPhone{
	
	int channel;
	
	void turnOn() {
		PowerOn();
		System.out.println("채널 " + channel + "번을 수신합니다.");
	}
}
