package com.ch08.second;

public class ExImplementaionC {
	public static void main(String[] args) {
		
		InterfaceA interfaceA = new ImplementaionC();
		InterfaceB interfaceB = new ImplementaionC();
		InterfaceC interfaceC = new ImplementaionC();
		
		interfaceA.methodA();
		interfaceB.methodB();
		interfaceC.methodC();
	}
}
