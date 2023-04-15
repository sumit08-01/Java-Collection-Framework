package com.concurrent;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModiD extends Thread{

private static ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		ConcurrentModiD tchild = new ConcurrentModiD();
		
		list.add("John");
		list.add("Rohn");
		list.add("Tom");
		list.add("Shiva");
		
		Iterator<String> itr = list.iterator();
		tchild.start();
		
		while(itr.hasNext()) {
			String name = (String) itr.next();
			System.out.println("Main thread iterating ->"+name);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	public void run() {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		list.add("Ganesh");
	}

}



//Main thread iterating ->John
//Main thread iterating ->Rohn
//Exception in thread "main" java.util.ConcurrentModificationException
//	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
//	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
//	at com.concurrent.ConcurrentModiD.main(ConcurrentModiD.java:23)


//-->>JAVA OLD COLLECTION HAVE THESE TYPE OF PROBLEMS
