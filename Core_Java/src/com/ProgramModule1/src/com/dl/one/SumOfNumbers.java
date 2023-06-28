package com.dl.one;

import java.util.*;

public class SumOfNumbers {
	
	public void print(int num) {
		int sum = 0;
		for(int i=0;i<=num;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
		sumOfNumbers.print(num);
	}

}
