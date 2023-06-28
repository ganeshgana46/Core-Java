package com.dl.one;

import java.util.*;

public class CountChars {
	
	public void print(String s1) {
		int count = s1.length();
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String s1 = sc.next();
		
		CountChars eg1 = new CountChars();
		eg1.print(s1);
	}

}
