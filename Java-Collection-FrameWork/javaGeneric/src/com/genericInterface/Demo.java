package com.genericInterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Data d1 = new Data("This is d1");
		Data<String> d1 = new Data<>("This is d1");
		
		System.out.println(d1.toString()); // output-->>Data is : This is d1
			
//		Now I want to store Integer 
//		In data class I replace String Type to Object Type
		
		Data<Integer> d2 = new Data<>(10);
		
//		int data = (int) (d1.getData()); //This will give the error java.lang.ClassCastException
//		 Then what should we do
//		we will create class Generic Type mean type safe
		System.out.println(d2);
		
		IData<String> d3 = new Data<String>("we have implementes a generic Interface" );
		
		System.out.println(d3.getData());
		
	}

}
