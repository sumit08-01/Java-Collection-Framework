package com.Array;

public class AnonymousArray {
//Array without Name is know as AnonymousArray
	public static void main(String[] args) {
					
//		sum(new int[] {1,2,3,4});		//can not provide size in anonymous array
		
		int[] arr = {1,2,3,4,5}; // creating a regular array
		sum(arr);
	}
	

	private static void sum(int[] array) {
		int total = 0;
		for(int e: array) {
			total = total+ e;
		}
		System.out.println(total);
		
	}
	
	//for instant use, we use anonymous arrays.
}


