package com.wrapperclass;

public class Eg2 {

	public static void main(String[] args) {
		// Object to primitive type
		
		//There are two conversions : [intValue,auto unboxing]
		
		//parameterized constructor
		
		Integer a = new Integer(10);
		System.out.println("Object Type : " + a);
		
		//auto unbooxing
		int b = a.intValue();
		System.out.println("Primitive Type : " + b);
		
		int c = a;
		System.out.println("Primitive Type : " + c);


	}

}
