package com.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;
//it is work with only LinkedList and ArrayList
public class ListItr {

public static void main(String[] args) {
		
		ArrayList<String> data = new ArrayList<>();
		
		data.add("Raj");
		data.add("Ramesh");
		data.add("Amrish");
		data.add("jai");
		data.add("Khushal");
		
		System.out.println(data);
		
		//creating listIterator object for arrayList data
		ListIterator li = data.listIterator(); //it is move in bi-directional
		
		//to check whether listIterator is having next element or not
		while(li.hasNext())
		{
			//next(): returns next element
			String item = (String)li.next();		
			
			if(item.equals("jai"))
			{
				li.add("veeru");
			}
			if(item.equals("Raj"))
			{
				li.remove();
			}
			if(item.equals("Amrish"))
			{
				li.set("Amresh");
			}
		}
		
		System.out.println(data);
	}

}
