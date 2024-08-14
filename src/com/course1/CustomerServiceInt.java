package com.course1;

public interface CustomerServiceInt {
	public String createCustomer(int id, String name);

	public String updateCustomer(int id, String name);

	public int deletecustomer(int id);

	public String getCustomer(int id);
	//In interface by default Access modifier is Public we can'nt add private ,protected,default.


	

}
