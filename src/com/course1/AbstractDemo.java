package com.course1;

abstract public class AbstractDemo {
	// AbstractDemoImpl cann't extend more than one class

	// it should have at least
	// one abstract method and any number of concrete methods
	String getCustomerName(int id) {

		return "test";
	};// just signature

	abstract public void updateCustomerDetails(String firstName);

}
