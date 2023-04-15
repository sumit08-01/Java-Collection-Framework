package com.Lambda;


interface MyFunInterface3 {
	public int doSomeCalculation (int a);
}

//class ImplMyFunInterface3 implements MyFunInterface3{
//
//	@Override
//	public int doSomeCalculation(int a) {
//		int x = a+10;
//		x=x/2;
//		return x;
//	}
//	
//}
public class LambdaEx4 {

	public static void main(String[] args) {
		
		
		MyFunInterface3 i = a-> {
			int x = a +10;          //lambda expression
			x=x/2;
			return x;
		};
		
//		MyFunInterface3 i = new ImplMyFunInterface3();
		int op = i.doSomeCalculation(100);
		System.out.println(op);

	}

}
