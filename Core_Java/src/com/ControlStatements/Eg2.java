package com.ControlStatements;
import java.util.*;
public class Eg2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age : ");
		int age = sc.nextInt();
		
		if(age <=18) {
			System.out.println("Exhibition entry fee : 300");
		}else {
			System.out.println("Exhibition entry fee : 500");
		}

	}

}
