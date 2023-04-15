package com.CollectionWithGeneric;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionDemo {

	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList(); // it will give java.lang.ClassCastException:
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("jonh");
//		list.add(1); // it will not add int
		
		for (Object object : list) {
			String str = (String)object;
		}
		for (String object : list) {
			String str = object;     //Not used for and external casttype
			System.out.println(str);
		}
			
		
		//Multiple Type parameters 
		HashMap<Integer, String> h = new HashMap<>();
		
		Bin<String, Integer> bin = new Bin<>();
		
		bin.setDryTrash("ghjk");
		bin.setWetTrash(345678);
		System.out.println("Dry Trash : "+bin.getDryTrash()+",wet Trash : "+ bin.getWetTrash());
	}

}
