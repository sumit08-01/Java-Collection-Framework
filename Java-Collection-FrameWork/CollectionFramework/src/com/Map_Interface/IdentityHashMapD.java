package com.Map_Interface;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapD {

public static void main(String[] args) {
		
//		HashMap<Integer,String> m = new HashMap<>();
		IdentityHashMap<Integer,String> m = new IdentityHashMap<>();
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
//		m.put(10, "First");
//		m.put(10, "second");
		
		m.put(a, "First"); //refernce are difffernet that why we get  {10=First, 10=Second}
		m.put(b, "Second");
//		System.out.println(m); //{10=Second} hashMap refernce are not differnce
		System.out.println(m);
	}

}
