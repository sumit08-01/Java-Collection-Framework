package com.Array;

public class ArrayIntroduction {

	public static void main(String[] args) {
		int a = 12;
		int b = 13;
		int c = 14;
		
//		dataType(pemetive) [] varableName = new dataType [size of array]; -->>Syntax of Array
		
		int [] x = new int[3];
		System.out.println(x.getClass().getName()); //out put-> ([I) it means is a integer class type array, single square bracket indicate its a 1D array
		int [][] y = new int[1000][67];
		System.out.println(y.getClass().getName()); //out put ->([[I) it means is a 2D array
		
		int [] z = new int[0];
		
		int [] r = new int['a']; //it is correct, is internaly converted into ASCII value a=97, size =97, but it is not recomended.
		
//		int [] r1 = new int[-1]; // it is not giving "CompileTimeError", it is "RUNTIMEEXCEPTION"(NegativeArraySizeException: -1)
		
		
//		int [] rs = new int[345678934567845678];//giving Comiple time error because INT no. is to large
		
		int [] rs1 = new int[214748364]; // upto int this range its valid but increase one value give compile time errors
		
		//Adding elements in Array
		x[0] = 12;
		x[1] = 13;
		x[2] = 14;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		

	}

}
