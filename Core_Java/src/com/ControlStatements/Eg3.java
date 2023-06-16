package com.ControlStatements;
import java.util.*;
public class Eg3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		
		if(age<=10) {
			System.out.println("Exhibition entry fee : 300 Rs only");
		}else if(age <= 18) {
			System.out.println("Exhibition entry fee : 500 Rs only");
		}else if(age <=40) {
			System.out.println("Exhibition entry fee : 700 Rs only");
		}else {
			System.out.println("Not Allowed");
		}

	}

}
