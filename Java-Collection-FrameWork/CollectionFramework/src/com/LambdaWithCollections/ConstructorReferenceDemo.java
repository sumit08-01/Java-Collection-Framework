package com.LambdaWithCollections;

interface Details{
	public Student getStudent(String name);
}

class Student{
	Student(String name){
		System.out.println(name +" is successfully enrolled!");
	}
}

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		Details d = Student :: new; //method reference
		Student s = d.getStudent("Meenal");
	}
}



