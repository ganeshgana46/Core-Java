package com.dl.one;

import java.util.*;

public class RemoveSC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
	    String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
	    System.out.println(str1);
	}

}
