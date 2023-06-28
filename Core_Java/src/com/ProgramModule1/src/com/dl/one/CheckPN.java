package com.dl.one;

import java.util.*;

public class CheckPN {
	public void print(int num) {
		
        int count = 0;
		
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the NUmber  : ");
		int num = sc.nextInt();
		
		CheckPN checkPN = new CheckPN();
		checkPN.print(num);

	}

}
