package com.basicOfJavaGeneric;

import java.util.ArrayList;

public class DataStr {

	public static void main(String[] args) {
		
	String[] strArr = new String[20];
	Employee[] empArray = new Employee[20];
	strArr[0] = "sumit";
//	strArr[1] = new Employee(); //here ->  we can not add object to array
	
	ArrayList arr = new ArrayList();	
	
	arr.add("sumit"); // here we add value in the array
	arr.add(new Employee()); //here we add object to array
	
//	String name = arr.get(0);  //here its saying cannot convert string to object
	String name = (String) arr.get(0); //here we explicity type cast object to string
	
	
	
	
	
	
	
	
	
	}

}
