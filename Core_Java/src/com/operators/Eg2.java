package com.operators;

public class Eg2 {

	public static void main(String[] args) {
		
		//Assignment operator
		
		int a = 2;
		int b = 5;
		
		System.out.println(a+=2);//4
		System.out.println(a+=b);//9
		System.out.println(a);//9
		
		System.out.println(a-=2);//7
		System.out.println(a-=b);//2
		System.out.println(a);//2
		
		System.out.println(a*=2);//4
		System.out.println(a*=b);//8
		System.out.println(a);//8

	}

}
