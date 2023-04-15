package com.Lambda;

public class LambdaEx1 {

	public static void main(String[] args) {
		
//		without lambda 
		FunInterfaceExample i1 = new ImpleFunInterfaceEx();
		i1.funMethod();
		
		
//		with lambda
		FunInterfaceExample i = () -> System.out.println("Function without any argument and return type!,Implemented using lambda");
		i.funMethod();
	}

}

interface FunInterfaceExample{
	public void funMethod();
//	public void m(); // The function will be only functional interface
}

class ImpleFunInterfaceEx implements FunInterfaceExample{
	
	public void funMethod() {
		System.out.println("Function without any argument and return type!,Not Implemented using lambda");
	}
}