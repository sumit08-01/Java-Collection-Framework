package com.genericMethods;

public class GenericMethod {

//	public static<T> String concat(String data) { 
		public static<T> String concat(T data) { 
		return "Data is : " + data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(concat("BasciString"));
		System.out.println(concat(43));
			
		
	}

}
