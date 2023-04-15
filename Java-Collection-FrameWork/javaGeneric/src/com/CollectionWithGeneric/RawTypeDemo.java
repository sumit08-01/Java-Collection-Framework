package com.CollectionWithGeneric;

import java.util.List;

public class RawTypeDemo {

	public static void main(String[] args) {
		
		Box<Integer> genBox= new Box<>(List.of(1,2,3));
		
		for(Integer integer : genBox.getA()) {
			System.out.println(integer);
		}
		
		Box rowBox = new Box(List.of(1,2,"BasicStrong")); // here we can add anyType of element can't get error
		System.out.println(rowBox);
	}

}
