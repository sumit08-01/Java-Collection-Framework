package com.concurrent;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConHashMapD extends Thread {

static ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<Integer,String>();
//static HashMap<Integer,String> map = new HashMap<Integer,String>(); // it give exception -->>Exception in thread "main" java.util.ConcurrentModificationException
	
	public static void main(String[] args) {
		ConHashMapD tChild = new ConHashMapD();
		map.put(1,"John");
		map.put(2,"Rohn");
		map.put(3,"Tom");
		map.put(4,"Shiva");
		tChild.start();
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
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
		map.put(5,"Ganesha");
		
	}

}
