package com.ch13.third;

public class Util {

//	public Box boxing(String a) {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		return box;
		
	}
}
