package com.ch12;

import java.awt.Toolkit;

public class ExBeep {
	public static void main(String[] args) throws InterruptedException {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			Thread.sleep(500); // 0.5밀리초를 멈춰라.
		}
	}
}
