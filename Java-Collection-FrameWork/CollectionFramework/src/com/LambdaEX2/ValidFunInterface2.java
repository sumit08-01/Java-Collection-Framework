package com.LambdaEX2;

@FunctionalInterface //This compile okay it's a valid functionalInterface
public interface ValidFunInterface2 {
	
	public void method1();
	
//	public void method4(); // this line show it's not a valid functionalInterface because it's having more than two abstract method because of we use @FucntionalInterface
	
	// Default Method
		default void method2() { // It's valid because in java 8 we can write default and static method in fucntional interface

		}

	// Static Method
		static void method3() {
	
		}
		
		

}

