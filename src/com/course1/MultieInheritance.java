package com.course1;

public class MultieInheritance implements CustomerServiceInt, CustomerServiceInt2 {
	public static void main(String[] args) {
		MultieInheritance obj1 = new MultieInheritance();
		String result = obj1.getGreetings("Hari");
		System.out.println(result);
	}

	@Override
	public String getGreetings2(String name) {
		// TODO Auto-generated method stub
		return "Core java interview preparation with programs";
	}

	@Override
	public String createCustomer(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCustomer(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deletecustomer(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
