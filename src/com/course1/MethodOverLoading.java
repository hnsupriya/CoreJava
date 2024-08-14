package com.course1;

import java.util.Arrays;
import com.practice1.Address;
import com.practice1.Customer;

public class MethodOverLoading {

	// Method to find a customer by first name and last name
	public Customer findCustomer(String firstName, String lastName) {
		Customer cust = new Customer();
		cust.setFirstName(firstName);
		cust.setLasttName(lastName);

		Address add1 = new Address();
		add1.setHouseNumber("1233");
		cust.setAddressList(Arrays.asList(add1));

		// DB --> results

		return cust;
	}

	// Method to find a customer by ID
	public Customer findCustomer(int id) {
		Customer cust = new Customer();
		cust.setFirstName("test");
		cust.setLasttName("testlastName");

		Address add1 = new Address();
		add1.setHouseNumber("1233");
		cust.setAddressList(Arrays.asList(add1));

		// DB --> results

		return cust;
	}
	// Method to find a Customer by Address

	public Customer findCustomer(Address add) {
		Customer cust = new Customer();
		cust.setFirstName("test");
		cust.setLasttName("testlastName");

		cust.setAddressList(Arrays.asList(add));

		// DB --> results

		return cust;
	}

	public Customer findCustomer(String lastName, int id) {
		Customer cust = new Customer();
		cust.setFirstName("test");
		cust.setId(id);
		cust.setLasttName(lastName);

		Address add1 = new Address();
		add1.setHouseNumber("1233");
		cust.setAddressList(Arrays.asList(add1));

		// DB --> results

		return cust;
	}

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		Customer cust = obj.findCustomer(200);
		System.out.println(cust.getLastName());
		
	}
}
