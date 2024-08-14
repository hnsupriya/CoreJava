package com.course1;

public class ChildAirthmeticOperation extends ParentArithmeticOperations, ParentArithmeticOperation2 {
	/*
	 * Development Time
	 * Testing time
	 * Confidence
	 * Inheritance--> parent child -->extends keyword
	 * child 
	 */
	public static void main(String[] args) {
		ChildAirthmeticOperation childobj1 = new ChildAirthmeticOperation();
		int result = childobj1.addTwoIntegerFinal(10, 20);
		System.out.println(result);
	}

}
