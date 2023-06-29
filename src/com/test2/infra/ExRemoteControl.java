package com.test2.infra;

import com.test2.infra.controller.Television;

public class ExRemoteControl {
	public static void main(String[] args) {
		
		Television tv = new Television();
		
//		변수 100 사용
		System.out.println("변수 100 사용");
		tv.turnon();
		tv.setmute(true);
		tv.setmute(false);
		tv.setvolume(100);
		tv.changeBattery();
		tv.turnoff();

		System.out.println();
		System.out.println("================================================");
		System.out.println();
		
//		변수 -10 사용
		System.out.println("변수 -10 사용");
		tv.turnon();
		tv.setmute(true);
		tv.setmute(false);
		tv.setvolume(-10);
		tv.changeBattery();
		tv.turnoff();
		
		
		System.out.println();
		System.out.println("================================================");
		System.out.println();
	}
}
