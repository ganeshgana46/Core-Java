package com.ControlStatements;
import java.util.*;
public class Eg6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day : ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("oophh!...its a working day");
			break;
		case 6:
		case 7:
			System.out.println("hohoo!...its a weekend");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}

	}

}
