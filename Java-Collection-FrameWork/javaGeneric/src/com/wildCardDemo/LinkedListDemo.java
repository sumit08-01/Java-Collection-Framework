package com.wildCardDemo;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		DataNode<Integer> node2 = new DataNode<Integer>(20, null);
		DataNode<Integer> node1 = new DataNode<Integer>(35, node2);
		
		DataNode<Double> node22 = new DataNode<>(20.5, null);
		DataNode<Double> node12 = new DataNode<>(35.4, node22);
		
		DataNode<Number> node111 = new DataNode<>(Double.valueOf(35.4), null);
		node111.setNext(node2);
		//DataNode(Integer,DataNode(Integer))
		//Map<Integer,String> Map<Number, String>
		System.out.println(node1.toString());

	}

}
