package com.wildCardDemo;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {

	
	//For wild card replace T with ?
//	public static<T> void displayData(List<T> l) {
		public static void displayData(List<?> l) { // because we don't know the type of varable
//			public static void displayData(List<? super Integer> l) {
		for(Object t : l) {
			System.out.println(t);
		}
//		l.add(234); we can't added
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(); //Here we telll that we have this type of value
		List<Number> list1 = new ArrayList<>(); 
		
		list.add(34);
		list.add(57);
		
		displayData(list);
		displayData(list1);

	}

}
