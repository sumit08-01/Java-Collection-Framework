package com.InterfaceEpInterface;


interface Iinterface<T> {
	
}

interface Iinterface2{
	
}
//public class Class1 implements Iinterface<T>{
//
//}
class Class3 implements Iinterface<Iinterface>{
	
}
class class2<T> implements Iinterface<T>{
	
}
class Class4<T> extends class2 implements Iinterface{
	
}
//class Class4<T> extends class2<T> implements Iinterface<Integer>{
////IT will give error	
//}


