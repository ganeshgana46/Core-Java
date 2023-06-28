package com.dl.one;
import java.util.*;
public class PN {

	public void print(int num) {
		for(int i = 1;i<=num;i++) {
			int count =0;
			for(int j=1;j<=num;j++) {
				if( i % j == 0) {
				count ++;
			}
			
			}
			if(count ==2) {
				System.out.println(" values are : " +i);
		}
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		
		int num = sc.nextInt();
		
		PN pn = new PN();
		pn.print(num);
		
		
		
		
	}

}
