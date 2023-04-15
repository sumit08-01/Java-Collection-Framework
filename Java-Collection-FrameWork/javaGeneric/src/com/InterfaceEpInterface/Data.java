package com.InterfaceEpInterface;



class BaseData<T>
{
	
}



//public class Data {
	public class Data<T> extends BaseData<T> implements IData<T>{
	
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
