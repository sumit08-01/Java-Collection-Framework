package com.wildCardDemo;

public class DataNode<E> {
	
	private E data;
//	private DataNode<E> next;
//	private DataNode<?> next;
//	private DataNode<? extends Number & Runnable> next; we can not do this
	private DataNode<? extends Number> next;
	
	
//	public DataNode(E data, DataNode<E> next) {
//		public DataNode(E data, DataNode<?> next) {
		public DataNode(E data, DataNode<? extends Number> next) {
		super();
		this.data = data;
		this.next = next;
	}


	public E getData() {
		return data;
	}


	public void setData(E data) {
		this.data = data;
	}


//	public DataNode<E> getNext() {
		public DataNode<?> getNext() {
		return next;
	}


//	public void setNext(DataNode<E> next) {
//		public void setNext(DataNode<?> next) {
			public void setNext(DataNode<? extends Number> next) {
		this.next = next;
	}


	@Override
	public String toString() {
		return "DataNode [data=" + data + ", next=" + next + "]";
	}
	

}
