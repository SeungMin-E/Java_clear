package com.ch07.first;

public class DmbCellphone extends CellPhone {
	
	// 필드
	int channel;
	
	//메소드
		void turnOnDmb() {
			powerOn();
			System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
		}	
		void changeChannelDmb(int channel) {
			this.channel = channel;
			System.out.println("채널을 " + channel + "번으로 바꿉니다.");
		}
		void turnOffDmb() {
			System.out.println("DMB 방송 수신을 멈춥니다.");
		}
		
		void turnoffDmb(int a) {
			
		}
		
		@Override
		void powerOff() {
			System.out.println("dmb.powerOff()");  {
			}
		}
		@Override
		void powerOn() {
			System.out.println("dmb.powerOn()");
		}
		
		@Override
		void powerOn(int a) {
			System.out.println("dmb 실행을 시작합니다.");
		}
		
	
}
