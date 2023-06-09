package com.ch06.trfirst;

public class Member {
	String name;	// 이름
	String id;		// 아이디(계정)
	String pw;		// 비밀번호
	String email;	// 이메일
	
	// 객체
	void join() {
		System.out.println("회원가입");
	}
	
	void clear() {
		System.out.println("로그인 성공");
	}
	
	void fail() {
		System.out.println("로그인 실패");
	}
	
	void find() {
		System.out.println("아이디/비밀번호 찾기");
	}
	
	void empty() {
		System.out.println("아이디랑 비밀번호를 입력하세요.");
	}
	
	void secession() {
		System.out.println("회원탈퇴");
	}
	
	// 생성자
	Member(){
	
	}
	
	Member(String name, String id, String pw, String email){
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
}
