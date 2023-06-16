package com.AbstractClass;

public class Lenovo extends SampleAC{
	
	
	public void paste() {
		System.out.println("paste");
	}
	
	
	public void keyword() {
		System.out.println("keyword");
	}

	public static void main(String[] args) {
		
		Lenovo lenovo = new Lenovo();
		lenovo.cut();
		lenovo.copy();
		lenovo.paste();
		lenovo.keyword();

	}

}
