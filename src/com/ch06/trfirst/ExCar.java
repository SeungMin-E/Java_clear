package com.ch06.trfirst;

public class ExCar {
	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println("car.engin : " + car.engin);
		System.out.println("car.name : " + car.name);
		System.out.println("car.color : " + car.color);
		System.out.println("car.company : " + car.company);
		
		car.go();
		car.stop();
		car.back();
		
	}
}
