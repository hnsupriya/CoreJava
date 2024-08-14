package com.course1;

public interface CustomerServiceInt2 {
	
	String getGreetings2(String name);// public and abstract
	
	//From JDK 1.8, Interfaces can also support Default Methods
	public default String  getGreetings(String name) {

		return "Hi welcome "+name;
	
	}
	


	
	
	}


