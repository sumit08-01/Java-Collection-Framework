package com.subTyping;

import java.util.List;

public class Box<T> {
		
	private List<T> a;

	//C
	public Box(List<T> a) {
		this.a = a;
	}
	
	//g
	public List<T> getA() {
		return a;
	}
	//s
	public void setA(List<T> a) {
		this.a = a;
	}

	
	
}
