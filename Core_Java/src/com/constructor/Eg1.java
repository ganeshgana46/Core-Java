package com.constructor;

public class Eg1 {
	
	//Constructor : It is a special method initialize the object
	
	//Default constructor
	//parameterized
	
	String str;
	
	
	
	public Eg1(String s) {
		str = s;
	}

	public void print() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		Eg1 obj = new Eg1("gana");
		obj.print();

	}

}
