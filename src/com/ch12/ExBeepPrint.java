package com.ch12;

import java.awt.Toolkit;

public class ExBeepPrint {
	 public static void main(String[] args) {
		 
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 
		 for(int i = 1; i <= 5; i++) {
			 try {
				 toolkit.beep();
				 System.out.println("12");
				 Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}

			for(int i=0; i<5; i++) {
				System.out.println("12");
				try { Thread.sleep(500); } catch(Exception e) {}
			}
	 }
}
