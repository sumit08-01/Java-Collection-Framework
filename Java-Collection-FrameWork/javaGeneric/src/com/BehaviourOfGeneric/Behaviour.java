package com.BehaviourOfGeneric;

import java.util.ArrayList;

public class Behaviour {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<>(); // raw type arrayList
		ArrayList l1= new ArrayList(); 
		l1.add("Basics");
		l1.add("Strong");
		l1.add(234);
		
		method(l);
		System.out.println(l);
	}
	
//	public static void method(ArrayList l) {  //argument type arrayList
		public static void method(ArrayList<String> l) { 
//		l.add(10);
		l.add("see this");
//		l.add(true);
	}

}
