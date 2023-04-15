package com.BoundedTypeParameter;

import java.util.List;

//public class DataSorter<T> { // for this sorting is done for both integer as well as String but i want to only sort integer
	public class DataSorter<T extends Number> {
	
		 private List<T> list;

		 
		 //con
		public DataSorter(List<T> list) {
			this.list = list;
		}
		 
	public void getSortedData() {
		list.sort(null);
		for(T t : list) {
			System.out.println(t);
		}
	}
		 
}
