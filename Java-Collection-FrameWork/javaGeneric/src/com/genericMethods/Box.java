package com.genericMethods;

import java.util.List;

public class Box{
		
	private List a;

	//C
	public<T> Box(List<T> a) {  //generic Type Constructor
		this.a = a;
	}
	
	//g
	public List getA() {
		return a;
	}
	//s
	public void setA(List a) {
		this.a = a;
	}

	
	
}
