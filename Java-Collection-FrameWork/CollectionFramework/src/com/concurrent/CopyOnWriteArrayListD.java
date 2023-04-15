package com.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListD {

//	static ArrayList<String> list = new ArrayList<String>();
		static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		
		public static void main(String[] args) {
			
			list.add("John");
			list.add("Rohn");
			list.add("Harry");
			
			Iterator<String> itr = list.iterator();
			while(itr.hasNext()) {
				String name = (String) itr.next();	
				if(name.equals("Harry")) {
					itr.remove(); //Exception in thread "main" java.lang.UnsupportedOperationException -- "CopyOnWriteArrayList" we can't use remove method
				}
				}
			System.out.println(list);  //-->>[John, Rohn]--->>Output for ArrayList
			

		}

}
