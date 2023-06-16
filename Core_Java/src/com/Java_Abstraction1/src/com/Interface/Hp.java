package com.Interface;

public class Hp implements Laptop{

	@Override
	public void cut() {
		System.out.println("Hp cut");
		
	}

	@Override
	public void copy() {
		System.out.println("Hp copy");
		
	}

	@Override
	public void paste() {
		System.out.println("Hp paste");
		
	}

	@Override
	public void keyword() {
		System.out.println("Hp keyword");
		
	}

}
