package com.ch15.first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExLanguge {
	public static void main(String[] args) {
		
		ArrayList<Language> arrayList = new ArrayList<Language>();
		
		for(Language language : arrayList) {
			System.out.println("language.name : "+ language.name);
			System.out.println("language.version : " + language.version);
			System.out.println("===============");
		}
		
//		arrayList.add("JAVA");		Language 객체를 넣어 주어야 해서 오류
//		arrayList.add(11);			Language 객체를 넣어 주어야 해서 오류
		
		Language language = new Language("JAVA", 11);
		
		arrayList.add(language);
		arrayList.add(new Language("Python",8));
		arrayList.add(new Language("C#",6));
		
		for(Language a : arrayList) {
			System.out.println("language.name : "+ a.name);
			System.out.println("language.version : " + a.version);
			System.out.println("===============");
		}
		
		
//		List<String> list = new ArrayList<String>(); // genelic
		List<String> list = new LinkedList<String>(); // genelic
		
		list.add("JAVA");
		list.add("Python");
		list.add("Node");
		list.add(2, "C#");
		
//	 	외워두자...
		int i = 0;
		for(String a : list) {
//			String a = list[i];
			System.out.println(i + " : " + a);
			i++;
		}
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		list.remove(2);
		list.remove("Python");
		
		
		int j = 0;
		for(String a : list) {
//			String a = list[i];
			System.out.println(j + " : " + a);
			j++;
		}
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println("list.get("+ i +")"+list.get(i));
//		}
		
		
		
		
		
		
		
		
//		ArrayList<String> arrayList = new ArrayList<String>();
//		
//		arrayList.add("JAVA");
//		arrayList.add("Python");
//		arrayList.add("Node");
//		arrayList.add(2, "C#");
//		
//		for(int i = 0; i < arrayList.size(); i++) {
//			System.out.println("arrayList.get("+ i +")"+arrayList.get(i));
//		}
//		
//		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
//		
////	 	외워두자...
//		for(String a : arrayList) {
////			String a = list[i];
//			System.out.println("a : " + a);
//		}
//		
//		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
	}
}
