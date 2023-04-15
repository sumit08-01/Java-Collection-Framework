package com.Lambda;

interface MyFunInterface2{
	public int findLength(String s);
}

//class ImplMyFunInterface2 implements MyFunInterface2{
//
//	@Override
//	public int findLength(String s) {
//		// TODO Auto-generated method stub
//		return s.length();
//		
//	}
//}


public class LambdaEx3{
	public static void main(String[] args) {
		
		MyFunInterface2 i = s -> s.length(); //-->>lambda class function
		
//		MyFunInterface2 i = new ImplMyFunInterface2();
		int len = i.findLength("lambda");
		System.out.println("Length of the given String is : " + len);
	}
}

