package com.LambdaWithCollections;

import java.util.function.Function;

public class FunctionalEx {

	public static void main(String[] args) {
		String s = "BasicsStrong";
		Function<String,Integer> fun = str -> str.length();
		int len = fun.apply(s);
		System.out.println(len + " with lambda");
		
		
		//without Lambda
		int len1 = callLength(s);
		System.out.println(len1 + " Without LAmbda");
	}

	private static int callLength(String s) {
		
		return s.length();
	}

}
