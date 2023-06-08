package com.ch06.second;

public class ExCar {
	public static void main(String[] args) {
		
		Car car = new Car();
		Car car2 = new Car("red");
		Car car3 = new Car(8 ,"Viper ACR-X", "green", "DotgeViper");	
		
		System.out.println("car.name : " + car.name);
		System.out.println("car.color : " + car.color);
		System.out.println("-----------------------------");
		System.out.println("car2.name : " + car2.name);
		System.out.println("car2.color : " + car2.color);
		System.out.println("-----------------------------");
		System.out.println("car3.name : " + car3.name);
		System.out.println("car3.color : " + car3.color);
	}
}
