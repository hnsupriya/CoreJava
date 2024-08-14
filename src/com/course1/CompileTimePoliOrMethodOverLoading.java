package com.course1;

// parent and child relationship ==extends keyword

public class CompileTimePoliOrMethodOverLoading extends ParentMethodOverloading {

	// method overriding == compile time polimorphism
	
	public int addTwoIntegerFinal(int a, int b) {

		return a + b;
	}

	public static void main(String[] args) {
		
		CompileTimePoliOrMethodOverLoading childObj = new CompileTimePoliOrMethodOverLoading();
		
		int result = childObj.addTwoInteger(10, 10); // child class method
		
		System.out.println(result);

		CompileTimePoliOrMethodOverLoading parentObj = new CompileTimePoliOrMethodOverLoading();
		
		int result1 = parentObj.addTwoInteger(10, 10); // Parent class method
		
		System.out.println(result1);

	}

}
