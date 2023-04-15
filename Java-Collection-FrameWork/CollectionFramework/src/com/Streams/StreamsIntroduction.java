package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntroduction {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(new Integer(30));
		list.add(new Integer(40));
		list.add(new Integer(50));
		System.out.println(list);
		
//		Without Streams
		ArrayList<Integer> newList = new ArrayList<>();
		for (Integer i : list) {
			if(i>=30) {
				newList.add(i);
			}
		}
		System.out.println(newList); //-->>[30, 40, 50] This is a old process
		
		//Streams
		//filter
		List<Integer> l1 = list.stream().filter(i -> i>=30).collect(Collectors.toList());
		System.out.println(l1); //-->>[30, 40, 50]
		
		//map
		
		List<Integer> l2= list.stream().map( i -> i*2).collect(Collectors.toList());
		System.out.println(l2); //-->>[20, 40, 60, 80, 100]
		

	}
}