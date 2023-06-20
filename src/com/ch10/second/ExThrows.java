package com.ch10.second;

public class ExThrows {
	public static void main(String[] args) throws Exception {
		
		findClass();
	}
	
	public static void findClass() throws Exception {
		Class clazz = Class.forName("java.lang.String2");
	}
}
