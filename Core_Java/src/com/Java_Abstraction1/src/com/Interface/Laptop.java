package com.Interface;

public interface Laptop {
	
	public void cut();
	
	public void copy();
	
	public void paste();
	
	public void keyword();
	
	//must be declared as default
	default void security() {
		//we can call static in non-static...but can't call non-static in static
		//commonCode();
		audio();
		System.out.println("please implements");
	}
	
	static void audio() {
		//commonCode();
		System.out.println("Add audio");
	}
	
//	@SuppressWarnings("unused")
//	//make static this
//	private static void commonCode() {
//		System.out.println("Commom Code");
//	}
}
