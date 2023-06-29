package com.test2.infra.controller;

import com.test2.infra.interfaces.RemoteControl;

public class Television implements RemoteControl {
	
	@Override
	public void turnon() {
		
		System.out.println("티비를 켭니다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("티비를 끕니다.");
	}

	@Override
	public int setvolume(int volum) {
		if(volum >= max_volum) {
			volum = max_volum;
		}else if(volum <= min_volum){
			volum = min_volum;
		}
	
		System.out.println("현재 TV 볼륨: " + volum );
		return volum;
	}

	@Override
	public void setmute(boolean mute) {
		int volum;
		
		if(mute == true) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}
	
	@Override
	public void changeBattery(){
		System.out.println("건전지를 교체를 교환합니다");
	}

}

