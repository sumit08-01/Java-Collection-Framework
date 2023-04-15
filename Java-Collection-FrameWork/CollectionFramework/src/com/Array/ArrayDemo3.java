package com.Array;

public class ArrayDemo3 {

	public static void main(String[] args) {
		 
		int[] x; // here we only declare the array
		
//		x= {1,3,5}; // You can not do this 
		
		int[] y = {1,3,4,5}; // here we declare,initilaze and creating the array
		
		int[] z = new int[3]; // here we declare and creating the array, By default it's initilize with ZERO
		System.out.println(z[0]); //0
		System.out.println(z[1]); //0
		System.out.println(z[2]); //0
		
		//we OverWrite this initial values
		z[0]= 10;
		z[1]= 13;
		z[2]= 14;
		for(int ele : z) {
			System.out.println(ele);
		}
		System.out.println(z); // it will print the reference variable 
				// "[I@515f550a" toString Method called and give the NameOf The class "[I", and followed by "@" and hash Code in "HexadecimaleCode"

		
//		======================================
		int[][] a;
		
		int[][] b = new int[2][];
		System.out.println(b[0]); //OutPut-->>null
//		System.out.println(b[0][0]); // IT give "runTimeException" Know as "NullPointerException" 
//										why we get here exception Because-> we are "Operating Over a Null Value" that's why we gat Null Pointer Exception
		
		b[0] = new int[2];
		b[1] = new int[3];
		System.out.println(b[0][0]); //OutPut=>0
		b[0][0] = 55;
		System.out.println(b[0][0]); // here we are overawrite The initial value
		
//		-----------------------------------------------
		int[][] c = {{1,2,3},{4,5,6}};
		for(int[] array : c) {
			for(int ele : array) {
				System.out.println(ele);
			}
		}
		
// Only in 1D array the box in element but in the 2D, and 3D array it save the next refernce valur in it box.
		
	}

}
