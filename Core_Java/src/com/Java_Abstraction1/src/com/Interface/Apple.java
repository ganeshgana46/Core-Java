package com.Interface;

public class Apple implements Laptop{

	@Override
	public void cut() {
		System.out.println("apple cut");
		
	}

	@Override
	public void copy() {
		System.out.println("apple copy");
		
	}

	@Override
	public void paste() {
		System.out.println("apple paste");
		
	}

	@Override
	public void keyword() {
		System.out.println("apple keyword");
		
	}
	
	//We can add extra method while implementing classes
	
	public void capture() {
		System.out.println("capture photo");
	}
	//here comes override
	@Override
	public void security() {
		System.out.println("please imlements");
	}
	
//	static void audio() {
//		System.out.println("Add audio");
//	}

}
