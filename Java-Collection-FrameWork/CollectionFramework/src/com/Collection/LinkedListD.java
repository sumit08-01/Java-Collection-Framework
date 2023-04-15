package com.Collection;

import java.util.LinkedList;

public class LinkedListD {

public static void main(String[] args) {
		
		//creating linkedList 
		LinkedList l = new LinkedList(); //no argument constructor
		
		//creating linkedList with specified collection
		//LinkedList ll = new LinkedList(Collection c); //argument constructor
		
		//adding elements in linkedList
		l.add("John");
		l.add(10); 
		l.add(null);
		System.out.println(l);
		
		//to replace element with given element at specified index(set element to spefic index)
		l.set(1, 13);
		System.out.println(l);
		
		//to add element at specified index without replacing (shifts existing values to the right)
		l.add(2, true);
		System.out.println(l);
		
		//to remove last element
		l.removeLast();
		System.out.println(l);
		
		//to add element at first position
		l.addFirst(1);
		System.out.println(l);
		
		
	}

}
