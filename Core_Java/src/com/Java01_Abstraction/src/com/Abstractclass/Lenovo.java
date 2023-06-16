package com.Abstractclass;

public class Lenovo extends SampleAc{
	
	@Override
	public void paste() {
		System.out.println("Lenovo paste");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Lenovo keyboard");
		
	}

	public static void main(String[] args) {
		
		Lenovo lenovo = new Lenovo();
		lenovo.cut();
		lenovo.copy();
		lenovo.paste();
		lenovo.keyboard();

	}



}
