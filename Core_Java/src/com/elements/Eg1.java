package com.elements;

public class Eg1 {
	
	//Instance Method
	
	public void print() {
		System.out.println("Printing...");
	}
	
	//Static Method
	
	public static void read() {
		System.out.println("reading....");
	}
	
	//return type is int
	
	public int m1() {
		return 0;
	}
	
	//return type is string
	
	public String sendRequest() {
		return "send";
	}

	public static void main(String[] args) {
		
		//Calling Instance Method
		
		Eg1 obj = new Eg1();
		obj.print();
		
		new Eg1().print();
		
		//Calling Static Method
		
		read();
		Eg1.read();
		
		//calling return types
		
		System.out.println(obj.m1());
		System.out.println(obj.sendRequest());
		
	}

}
