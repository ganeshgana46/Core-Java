package com.dl.one;

import java.util.*;

public class Fibonacci {
	
	public void print(int num) {
		int n1 = 0;
		int n2 = 1;
		
		int sum = 0;
		//System.out.println(n1);
		
		int i =1;
		
		while(i<=num) {
			sum = n1 + n2;
			System.out.print(sum + " ");
			i++;
			n1 = n2;
			n2 = sum;
			}
	}	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.print(num);
		
	}

}
