package com.genericInterface;

//public class Data {
	public class Data<T> implements IData<T>{
	
		private T data;
//	private Object data;
	
	
	public Data(T data) {
		super();
		this.data = data;
	}


	public T getData() {
		return data;
	}

	@Override
	public void setData(T data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Data is : " + data;
	}

}
