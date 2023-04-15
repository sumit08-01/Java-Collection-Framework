package com.GenericInDepth;

//public class Data {
	public class Data<T>{
	
		private T data;
//	private Object data;
	
	
	public Data(T data) {
		super();
		this.data = data;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Data is : " + data;
	}
}
