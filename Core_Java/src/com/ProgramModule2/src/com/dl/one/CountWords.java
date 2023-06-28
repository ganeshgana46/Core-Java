package com.dl.one;

import java.util.*;

public class CountWords {
	
	public void print(String s) {
        int count = 1;
		
		for(int i=0;i<s.length()-1;i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		
		CountWords eg2 = new CountWords();
		eg2.print(s);
		
//		String s1 = "How are you?";
//		System.out.println("Number of Words : " + s.split("\\s+").length);
		
//		String s1 = "How are you?";
//		String s2 = s1.trim();
//		int count = s2.split(" ").length;
//		System.out.println("Number of Words : " + count);
	}
	
}
	
