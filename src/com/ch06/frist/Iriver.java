package com.ch06.frist;

public class Iriver {
	
	String name = "T70 Season2";
	int memorie = 32;
	String color = "coral";
	String codec_1 = "MP3";
	String codec_2 = "WAV";
	
	
	void play() {
		System.out.println("음악 실행");
	}
	void pulse() {
		System.out.println("일시정지");
	}
	void stop() {
		System.out.println("정지");
	}
	void rew() {
		System.out.println("되감기");
	}
	void ffw() {
		System.out.println("빨리감기");
	}
	void volumeUp() {
		System.out.println("음향 올리기");
	}
	void volumeDown() {
		System.out.println("음향 낮추기");
	}
}
