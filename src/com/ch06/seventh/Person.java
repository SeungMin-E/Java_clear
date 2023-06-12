package com.ch06.seventh;

public class Person {
	
	public final String nation = "KOREA";
	final String ssn;
	public String name;
	
	public Person(String nation, String ssn, String name) {
//		this.nation = nation;	// 이미 초기화 되어 있으므로 객체 생성시 초기값 대입 불가능
		this.ssn = ssn;			// 초기화가 되어 있지 않으므로 객체 생성시 초기값 대입으로 가능
		this.name = name;
	}
	
}
