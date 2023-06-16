package com.ControlStatements;
import java.util.*;
public class Eg4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number1 : ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the number2 : ");
		int number2 = sc.nextInt();
		
		System.out.println("Select the operation : ");
		System.out.println("1 - Add");
		System.out.println("2 - Sub");
		System.out.println("3 - Multiply");
		System.out.println("4 - Division");
		
		System.out.println("Select the Operation : ");
		int choice = sc.nextInt();
		
		System.out.println("Your inputs are : ");
		System.out.println("Number1 : " + number1);
		System.out.println("Number2 : " + number2);
		
		if(choice==1) {
			System.out.println("Result : " + (number1 + number2));
		}else if(choice==2) {
			System.out.println("Result : " + (number1 - number2));
		}else if(choice==3){
			System.out.println("Result : " + (number1 * number2));
		}else if(choice==4) {
			System.out.println("Result : " + (number1 / number2));
		}else {
			System.out.println("Invalid Operation");
		}
	}

}
