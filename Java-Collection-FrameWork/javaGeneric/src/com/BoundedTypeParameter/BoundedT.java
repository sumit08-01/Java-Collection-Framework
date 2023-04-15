package com.BoundedTypeParameter;

import java.util.Arrays;
import java.util.List;

public class BoundedT {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(new Integer[] {15,2,4,0,3});
		List<Double> list1 = Arrays.asList(new Double[] {15.5,2.6,4.2});
		List<String> slist = Arrays.asList(new String[] {"Hello","there"});
		
		DataSorter<Integer> sorter1 = new DataSorter<>(list);
//		DataSorter<String> sorter2 = new DataSorter<>(slist);
		sorter1.getSortedData();
//		sorter2.getSortedData();
//		getsortedData(list);
		
//		IBound b = new CBound();
//		getSortedData(b);
		
//		CBound b1 = new CBound();
//		getSortedData(b1);
	}
	
	
	public static<T extends IBound & IBound2> void getSortedData(T list) {
//		list.sort(null);
//		for(T t : list) {
//			System.out.println(t);
//		}
	}
	
class CBound implements IBound,IBound2{
	
}
	

}
