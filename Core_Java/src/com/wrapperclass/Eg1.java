package com.wrapperclass;

public class Eg1 {

	public static void main(String[] args) {
		
		//primitive to object type
		
		//There are three conversions:[parameterized,valueOf,auto boxing]
		
		int a = 10;
		System.out.println("Primitive Type : " + a);
		
		//parameterized constructor
		Integer b = new Integer(a);
		System.out.println("Object Type : " + b);
		
		//valueOf
		Integer c = Integer.valueOf(a);
		System.out.println("Object Type : " + c);
		
		//auto boxing
		Integer d = a;
		System.out.println("Object Type : " + d);
	}

}
