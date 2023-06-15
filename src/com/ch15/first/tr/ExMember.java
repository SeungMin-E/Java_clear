package com.ch15.first.tr;

import java.util.LinkedList;

public class ExMember {
	public static void main(String[] args) {
		
		LinkedList<Member> memberList = new LinkedList<Member>();
		
		
		Member member = new Member("김아무개","kim01","***********", "011-234-5678","kim01@loremipsum");
		Member member2 = new Member("이아무개","Lee02","***********", "010-2345-6789","Lee02@loremipsum");
		Member member3 = new Member("박아무개","park0123","***********", "010-3421-7812","park0123@loremipsum");
		
		memberList.add(member);
		memberList.add(member2);
		memberList.add(member3);
		
		for(Member a : memberList) {
			System.out.println("이름 : " + a.name);
			System.out.println("아이디 : " + a.id);
			System.out.println("이메일 : " + a.email);
			System.out.println("비밀번호 : " + a.pw);
			System.out.println("전화번호 : " + a.tel);
			System.out.println("이메일 : " + a.email);
			System.out.println("--------------------------");
		}
	}
}
