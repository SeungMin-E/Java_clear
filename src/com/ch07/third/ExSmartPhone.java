package com.ch07.third;

public class ExSmartPhone {
	public static void main(String[] args) {
		
//		Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("smartPhone");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.open();
		
	}
}
