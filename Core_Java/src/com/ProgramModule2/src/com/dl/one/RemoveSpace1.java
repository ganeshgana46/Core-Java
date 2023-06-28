package com.dl.one;

import java.util.*;

public class RemoveSpace1 {
	
	public void print(String str) {
		String str2 = str.replaceAll("\\s", "");
		System.out.println(str2);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		RemoveSpace1 eg8 = new RemoveSpace1();
		eg8.print(str);
	}

}
