package com.elements;

public class Eg3 {
	
	//Instance Method
	
	public void customerDetails(String customerName,String customerEmail,long phoneNo,String customerAddress) {
		System.out.println("Customer Name : " + customerName);
		System.out.println("Customer Email : " + customerEmail);
		System.out.println("Customer Phone Number : " + phoneNo);
		System.out.println("Customer Address : " + customerAddress);
	}
	
	//Static Method
	
	public static void bankDetails(String bankName,String bankAddress) {
		System.out.println("Bank Name : " + bankName);
		System.out.println("Bank Address : " + bankAddress);
	}

	public static void main(String[] args) {
		
		Eg3 customer1 = new Eg3();
		customer1.customerDetails("Mr.Innocent", "innocent@gmail.com", 8296096782l, "Hyd");
		Eg3.bankDetails("Boi","Hyd");
		
		System.out.println("----------");
		
		Eg3 customer2 = new Eg3();
		customer2.customerDetails("Mr.Jooyboy", "joyboy@gmail.com", 8296096782l, "Hyd");
		Eg3.bankDetails("Boi","Hyd");
		
		System.out.println("----------");
		
		Eg3 customer3 = new Eg3();
		customer3.customerDetails("Mr.cruel", "cruel@gmail.com", 8296096782l, "Hyd");
		Eg3.bankDetails("Boi","Hyd");

	}

}
