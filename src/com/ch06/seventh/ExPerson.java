package com.ch06.seventh;

public class ExPerson {
	public static void main(String[] args) {
		Person person = new Person(null, "1234", "장원영");
		
//		person.nation = "미국";		final은 중간에 값 대입 불가능
//		person.ssn = "묻지마";		final은 중간에 값 대입 불가능
		person.name = "tony";
		
	}
}
