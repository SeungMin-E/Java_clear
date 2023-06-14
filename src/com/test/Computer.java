package com.test;

public class Computer extends Calculator {
	
	@Override
	public double param(int a) {
		return Constants.PAI_2 * a * a;
	}
}
