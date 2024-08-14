package com.course1;

public class AbstractImpl extends AbstractDemo {

	

		public static void main(String[] args) {
		
			
			AbstractImpl obj1 = new AbstractImpl();
			System.out.println(obj1.getCustomerName(0));
			
			obj1.updateCustomerDetails("testfirstname");

		}

		@Override
		public void updateCustomerDetails(String firstName) {
			System.out.println("I am from AbstractDemoImpl  = ");
		}

	}


