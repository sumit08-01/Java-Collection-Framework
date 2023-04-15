package com.subTyping;

import java.util.ArrayList;
import java.util.List;

public class Subtyping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Object();
		Integer i = Integer.valueOf(11);
		o=i;
		 
		List<Number> list = new ArrayList<>();
		list.add(Integer.valueOf(10));
		list.add(Double.valueOf(10.4));
//		list.add("Hello");//it will give error because it is not child or subtype of number
	
		
		
		List<Box<Integer>> blist = new ArrayList<>();
		blist.add(new Box(List.of(1,2,3)));
		blist.add(new SquareBox<>(List.of(4,6,3,7)));
		
		//List<Number> ArrayList<Integer>
//		List<Number> l1 = new ArrayList<Integer>(); it will give error because Integer is not subType of Number
		
//		ArrayList<Number> l1 = new ArrayList<Integer>(); you also can not do this; it's necessary that your both type argument are same 
		
		
	}

}
