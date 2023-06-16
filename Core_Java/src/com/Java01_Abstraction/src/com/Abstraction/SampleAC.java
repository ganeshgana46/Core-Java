package com.Abstraction;

public abstract class SampleAC implements Laptop{
	
	public void cut() {
		System.out.println("Laptop cut");
	}
	
	public void copy() {
		System.out.println("Laptop copy");
	}
	
	public abstract void paste();
	
	public abstract void keyboard();

}
