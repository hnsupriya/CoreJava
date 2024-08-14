package com.course1;

public class ParentMethodOverloading {
	
private String getCustomerFirstName(int id) { 
		
		return "sai";  
	}

	public String createCustomer(String firsttName, String lastName, String houseNumber, int ssn) {

		return "sai";
	}

	protected int addTwoInteger(int a, int b) {

		return a + b;
	}

	
	public  int addTwoIntegerFinal(int a, int b) {
		

		return a + b;
	}
	
	public static double addTwoDecimal(double a, int b) {

		return a + b;
	}
	


}
