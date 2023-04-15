package com.Array;

public class MuliDimensionArray {

	public static void main(String[] args) {
		
		int [][] x = new int[3][]; //it is a array of array
		
		//Adding Element in 2D Array
		x[0] = new int[3];
		x[1] = new int[1];
		x[1] = new int[2 ];
//		x[2] = 14; if i add element in array, give compile time error , it only acce[t in 1D array]
		
		//3D Array
		int [][][] z = new int[2][][]; // At the time of creation we have to give size of array in "One BOX" Other are optional
		
		z[0]= new int[3][];
		z[1]= new int[2][];
		
		z[0][0] = new int[3];
		z[0][1] = new int[1];
		z[0][2] = new int[2];
		
		
		z[1][0] = new int[3];
		z[2][1] = new int[1];
		z[3][2] = new int[2];
		
		z[0][0][0]=1;

	}

}
