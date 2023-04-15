package com.Collection;

import java.util.*;

public class ArrayListD {

	public static void main(String[] args) {
		
		//Creating ArrayList
				ArrayList al = new ArrayList(); //by default size 10 in no argument constructor
				
				//creating ArrayList with specifying size
				ArrayList aList =  new ArrayList(30);
				
				/*creating ArrayList with specified collection.
				ArrayList aList1 = new ArrayList(Collection c);*/
				
				//adding elements to ArrayList
				al.add("John");
				al.add(true);
				al.add(10);
				System.out.println(al);
//				al.remove(1);
//				System.out.println(al);
				
				//removing element from ArrayList
				al.remove(new Integer(10));
				System.out.println(al);
				
				//To get value from ArrayList and print
				System.out.println(al.get(1));
				
				//To get value from ArrayList (we need to perform typecasting here)
				//boolean b = al.get(1);
				
				//creating ArrayList using generics
				ArrayList<String> strList = new ArrayList<String>();	
				System.out.println(al.get(1));

		
		

	}

}
