package com.InterfaceEpInterface;


interface IBase<T> {
	
}

public interface IData<T> extends IBase {
	public T getData();
	public void setData(T data);
}
