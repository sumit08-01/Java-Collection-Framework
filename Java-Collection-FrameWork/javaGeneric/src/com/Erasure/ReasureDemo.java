package com.Erasure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReasureDemo {

	public static void main(String[] args) {
		
//		System.out.println(method1(10));
		
		ArrayList l1 = new ArrayList<String>(); //Meaning less such declaration 
		//ArrayList l1 = new ArrayList; the above line is equivalent to this 
		l1.add(12);
		l1.add(true);
		l1.add("Hello");
		System.out.println(l1);

	}
	
//	public static void method1(Integer x) {
	public static String method1(Integer x) {
		List<String> a = new LinkedList<String>();
		
		//List a = new LinkedList;
		List b = a ;
		//above both a and b are pointing the same object
		
		b.add(x);
		return a.iterator().next(); // it wiil give run time exception (ava.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap'))
		//return (String)a.iterator().next(); the above line become this
	}
	
	
	public static void method2( ArrayList<String> l) {
		//if i will overload this method then it will give error
	}
//	public static void method2( ArrayList<String> l) {
//		
//	}
//	public static void method2( ArrayList<Integer> l) {
//		//also we can not overload with differnt arguments
//		
//	}
	
	
}
