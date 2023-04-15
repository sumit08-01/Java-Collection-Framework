package com.LambdaWithCollections;

import java.util.function.Predicate;

public class PredicateExampleD {

		public static void main(String[] args) {
			int salary = 3000;
			Predicate<Integer> p = i -> i>=4000;
			boolean result = p.test(salary);
			System.out.println(result);
			
			
			
//		  	Without Predicates Function
//			int salary =3000; 
//			boolean result = salaryCheck(salary);
//			System.out.println(result);
//		}
//			private static boolean salaryCheck(int salary) {
//			// TODO Auto-generated method stub
//			if(salary >=4000) {
//				return true;
//			}
//			else
//				return false;
//		}

		}
	
}
	


