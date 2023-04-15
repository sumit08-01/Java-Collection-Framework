package com.comparable_Comparator;

import java.util.TreeSet;

public class ComparableD {

public static void main(String[] args) {
		
		//TreeSet<Integer> data = new TreeSet<Integer>();
		
//		TreeSet<Integer> data = new TreeSet<Integer>();// it give natural sorting order([10, 132, 152, 185, 254])
		TreeSet<Integer> data = new TreeSet<Integer>(new MySorting());
		data.add(152);
		data.add(185);
		data.add(254);
		data.add(10);
		data.add(132);
		data.add(10);
		
//		System.out.println(data); //[10, 132, 152, 185, 254] --natural sorting order
		System.out.println(data); //[254, 185, 152, 132, 10]--own sorting

	}

}

//----------------------------------------------------------
//			Using Comparable interface

//data.add(152);                	   152
//data.add(185);					/  		\
//data.add(254); 10<152 addedleft  10		185(185>152 that's why added right)1added
//data.add(10);						\		/ \
//data.add(132);	152>132>10		132	  154  254 (254>152&185 that's why added right)2added
//data.add(154);
//data.add(10);(it will to consider)

//	By default JVM will use compareTo method for default sorting order
//------------------------------------------------------------

//			using Comparator interface

//TreeSet data = new TreeSet(new MySorting());

//data.add(152);                	   152
//data.add(185);					/  		\
//data.add(254); 				  185		10
//data.add(10);					   / \		/ 
//data.add(132);				 254 154   132
//data.add(154);
//data.add(10);(it will to consider)

//when we provide object of Comparator with TreeSet Constructor, then JVM will go for Comapre Method
//output-->>[254, 185, 152, 132, 10]