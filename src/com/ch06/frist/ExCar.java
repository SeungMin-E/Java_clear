package com.ch06.frist;

public class ExCar {

	public static void main(String[] args) {

		int a = 1;
		System.out.println(a);
		
		Car car = new Car(); 	// 생성(기본생성자)
		
		// 이하 사용
		System.out.println("car.engine : " + car.engine);
		System.out.println("car.name : " + car.name);
		System.out.println("car.color : " + car.color);
		System.out.println("car.company : " + car.company);
		
		car.go();
		car.back();
		
		
		Iriver iriver = new Iriver();	// 생성
		
		
		// 생성된 클래스 사용.
		System.out.println("iriver.name : " + iriver.name);
		System.out.println("iriver.color : " + iriver.color);
		System.out.println("iriver.memorie : " + iriver.memorie + "GB");
		System.out.println("iriver.codec_1 : " + iriver.codec_1);
		System.out.println("iriver.codec_2 : " + iriver.codec_2);
		
		iriver.play();
		iriver.pulse();
		iriver.stop();
		iriver.rew();
		iriver.ffw();
		iriver.volumeUp();
		iriver.volumeDown();
	}
}
