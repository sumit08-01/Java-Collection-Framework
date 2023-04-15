package com.concurrent;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetD {

	public static void main(String[] args) {
		//first constructor
		CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Basics");
		list.add("Basics");
		list.add("Strong");
		list.add("Strong");
		
		//second constructor
//		CopyOnWriteArraySet<String> set1 = new CopyOnWriteArraySet<>(Collection c);
		CopyOnWriteArraySet<String> set1 = new CopyOnWriteArraySet<>(list);
		System.out.println(set1); // -->> [Basics, Strong] as we know only unique elements are in .
		
		
	}

}

// there is not method on there use collection interface and set interface methods