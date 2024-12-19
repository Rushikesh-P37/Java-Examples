package com.test;

import java.util.*;  

public class HashMap {

	public static void main(String[] args) {
		
		//Map<Integer, String> map=new java.util.HashMap<Integer, String>();
		Map<String, String> map=new java.util.HashMap<String, String>();
		map.put("Rakul", "Rushi");
		map.put("Nakul", "Ram");
		map.put("Shiv", "Sita");
		
	//	System.out.println(map);
		
//		for(String i: map.values()) {
//			System.out.println(i);
//		}
		
		for(String i: map.keySet()) {
			System.out.println(i);
		}
		
//Map.Entry-Map interface to get the key and get the values
//entrySet-Map interface to get the current instance class	
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
//		for(String i : map.keySet()) {
//			System.out.println(i +" "+ map.get(i));
//		}
		
		

	}

}
