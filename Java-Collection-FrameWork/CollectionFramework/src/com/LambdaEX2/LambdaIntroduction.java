package com.LambdaEX2;

interface MyFunctionalInterface{
	public void funMethod();
}

class CallFunInterface implements MyFunctionalInterface{
	 

	@Override
	public void funMethod() {

		System.out.println("Overridden FunctionalMethod from callFunInterface");
	}
} 

public class LambdaIntroduction {

	public static void main(String[] args) {
		CallFunInterface funInter = new CallFunInterface();
		funInter.funMethod();
		
		MyFunctionalInterface funInterLambda = () -> System.out.println("caliing MyFunctionalInterface method of FunMethod");
		funInterLambda.funMethod();
		
	}

}






 

