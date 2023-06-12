package com.operators;

public class Eg6 {

	public static void main(String[] args) {
		
		//Logical operators 
		
		//(&& both conditions must satisfy)
		System.out.println(true && true);//true
		System.out.println(false && true);//false
		System.out.println(true && false);//false
		System.out.println(false && false);//false
		
		System.out.println("----------");
		
		//(|| any one condition must satisfy)
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		

	}

}
