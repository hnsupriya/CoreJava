package com.course1;

public class StringStringBufferStringBuilder {

	public static void main(String[] args) {

		String cust = "ram"; // String literal ==stores into the string pool

		// String class --> which is final class -->non modifiable / immutable

		System.out.println(cust);

		System.out.println(cust.hashCode()); // memory address == abandoned

		cust = "sai"; // String literal == store into the string pool

		System.out.println(cust);

		System.out.println(cust.hashCode());// memory address == abandoned
		// heap memory == new keyword

		String custNewKey = new String("ram111");
		System.out.println(custNewKey);
		System.out.println(custNewKey.hashCode());
		// StringBuffer

		StringBuffer cusBuf = new StringBuffer();
		cusBuf.append("test");
		System.out.println(cusBuf);
		System.out.println(cusBuf.hashCode());

		cusBuf.append("test111");
		System.out.println("after change " + cusBuf);
		System.out.println(cusBuf.hashCode()); // same memory location // methods are synchronized(waiting for the response)
		 
		
		//String Builder == methods are Asynchronized //jdk 1.5
		StringBuilder cusBuilder = new StringBuilder();
		cusBuf.append("test");
		System.out.println(cusBuilder);
		System.out.println(cusBuilder.hashCode());

		cusBuf.append("test3333");
		System.out.println("after change " + cusBuilder);
		System.out.println(cusBuilder.hashCode());
	}

}
