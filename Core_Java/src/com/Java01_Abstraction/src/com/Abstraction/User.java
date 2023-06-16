package com.Abstraction;

public class User {

	public static void main(String[] args) {
		
		Laptop lenovo = new Lenovo();
		lenovo.cut();
		lenovo.copy();
		lenovo.paste();
		lenovo.keyboard();
		
		System.out.println("-------");
		
		Laptop apple = new Apple();
		apple.cut();
		apple.copy();
		apple.paste();
		apple.keyboard();

	}

}
