package com.dl.one;

import java.util.*;

public class ReverseString {
	
	//approach-1
	public void print(String org_str) {
		String rev_str ="";
		for(int i=org_str.length()-1;i>=0;i--) {
			rev_str = rev_str + org_str.charAt(i);
		}
		System.out.println("Reverse String : " + rev_str);
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String org_str = sc.next();
		
		ReverseString eg3 = new ReverseString();
		eg3.print(org_str);
		
		//approach-1
		char[] charr = org_str.toCharArray();
		for(int i=charr.length-1;i>=0;i--) {
			System.out.print(charr[i]);
		}
		
		
		//approach-2
		for(int i=org_str.length()-1;i>=0;i--) {
			System.out.println(org_str.charAt(i));
		}
		
		
		//approach-3
		StringBuffer str = new StringBuffer(org_str);
		System.out.println(str.reverse());
		
		
		//approach-4
		StringBuilder str1 = new StringBuilder(org_str);
		System.out.println(str1.reverse());
	}

}

