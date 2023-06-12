package com.operators;

public class Eg4 {

	public static void main(String[] args) {
		
		//Unary operator
		
		int a = 10;
		//post increment (increase later)
		System.out.println(a++);//10
		System.out.println(a);//11
		System.out.println(a--);//11
		System.out.println(a);//10
		
		//prefix
		int b = 5;
		System.out.println(++b);//7
		System.out.println(b);//6
		System.out.println(--b);//5
		System.out.println(b);//5
		
		System.out.println(~b);//6

	}

}
