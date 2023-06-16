package com.Interface;

public class Apple implements Laptop{
	
	public void cut() {
		System.out.println("Apple cut");
	}
	
	public void copy() {
		System.out.println("Apple copy");
	}
	
	public void paste() {
		System.out.println("Apple paste");
	}
	
	public void keyboard() {
		System.out.println("Apple keyboard");
	}
	//Here comes override
	@Override
	public void security() {
		System.out.println("please implement");
	}
	//We can add extra method while implementing classes
	public void capture() {
		System.out.println("capture photo");
	}
}
