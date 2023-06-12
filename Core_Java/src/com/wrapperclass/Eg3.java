package com.wrapperclass;

public class Eg3 {

	public static void main(String[] args) {
		
		//String to Object type
		
		String s1 = "Gana";
		System.out.println(s1);
		
		String s2 = new String(s1);
		System.out.println(s2);
		
		String s3 = String.valueOf(s1);
		System.out.println(s3);
		
		String s4 = s1.valueOf(s1);
		System.out.println(s4);
		
		Object s5 = s1;
		System.out.println(s5);
		
		
	}

}
