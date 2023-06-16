package com.Interface;

public interface Laptop {
	
	public void cut();
	
	public void copy();
	
	public void paste();
	
	public void keyboard();
	
	//must be declared as default
	default void security() {
		//we can call static in non-static...but can't call non-static in static
		audio();
		//commoncode
		System.out.println("please implement");
	}
	
	static void audio() {
		//commoncode
		System.out.println("add aduio feature");
	}
	
//	private void commoncode() {
//		System.out.println();
//	}
}
