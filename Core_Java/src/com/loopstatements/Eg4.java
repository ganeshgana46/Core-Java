package com.loopstatements;

public class Eg4 {

	public static void main(String[] args) {
		
		//Break : stop the executing
		for(int i=0;i<=10;i++){
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("-------");
		
		//continue : skip the value
		for(int j=0;j<=10;j++){
			if(j==5) {
				continue;
			}
			System.out.println(j);
		}
		

	}

}
