package com.dl.one;

import java.util.*;

public class Factorial {
	
	public void print(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		Factorial factorial = new Factorial();
		factorial.print(num);
		}

}
