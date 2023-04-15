package com.Lambda;

interface MyFunInterface{
	public void funMethodAdd(int a, int b);
}


//class callFunInterface implements MyFunInterface{
//	
//	@Override
//	public void funMethodAdd(int a, int b) {
//		System.out.println("sum of a and b is : " + (a+b));
//	}
//}

public class LambdaEx2 {

	public static void main(String[] args) {
		MyFunInterface funInter = (a,b) -> System.out.println("The sum of a and b is: "+(a+b));
		funInter.funMethodAdd(10,20);
		
		
//		Creating a object of callFunInterface
//		MyFunInterface fun = new callFunInterface();
//		fun.funMethodAdd(3, 2); 
	}

}