package com.course1;

public class DataType { // logical entity

		static double  STATETAX = 7.8; // class level variable or global - heap memory - constants 
		
		 final double FEDTEAX = 7.8; //  constant final static datatype variablename = value == upper case
		
		
		// input parameters --> int id 
		private String getCustomerFirstName(int id) { // method/fun
			
			System.out.println("stateTax1  = " + STATETAX);
			
			//FEDTEAX =4,5;
			

			return "sai";  // output param  which is type of String 
		}

		public String createCustomer(String firsttName, String lastName, String houseNumber, int ssn) {

			return "sai";
		}

		protected int addTwoInteger(int a, int b) {
			

			return a + b;
		}

		
		// override / overload 
		public final int addTwoIntegerFinal(int a, int b) {
			

			return a + b;
		}
		
		public static double addTwoDecimal(double a, int b) {

			return a + b;
		}

		public static void main(String[] args) { // jvm starts its execution 

			int milesToDrive = 10; // 32 --> variable starts with noun every other word starts with uppercase

			System.out.println(milesToDrive);
			
			//fedTax1 =6.7; /// cannot access non static with in the static method 
			
			//<Syntax>
			// className  objectname<noun> = new<keyword> ClassName()
			
			
			DataType student1 = new DataType();
			
			// objectname.methodname/fun(real data) --> invoke a method
			
			
			String sName =student1.getCustomerFirstName(1023);
			
			System.out.println("student name = "+sName);
			
			
			DataType student2 = new DataType();

			String custDetails = student2.createCustomer("ram", "laxman", "test", 2233333);

			System.out.println("custDetails  = " + custDetails);
			
		    // what is static and when it is implemented 	
			
			// syntax: classname.methodname(input params )
			// static method is loaded as part of class loader time and no need of object to invoke 
			// static vs heap  Static method  ===heap 
		
			double result = DataType.addTwoDecimal(10.3,5);
			System.out.println("result  = " + result);
			
			// static double  stateTax = 7.8  -->  we can not declare static with in the static method main 
			
			
			
		}

	}
	/*
	 * 1. what is class logical entity : example school -->
	 * 
	 * defining the functionalities(fun) / method
	 * 
	 * public/private/protected class classname(noun)
	 * 
	 * public class CustomerService{
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 2. what is object jvm / heap memory --> physical entity which implements the
	 * functions / methods defined by class
	 * 
	 * 
	 * public/private/protected <return type/ void> <startswithverbandLowercase/
	 * camel case>(<dattype> <variableName>,<dattype> <variableName>,<dattype>
	 * <variableName>){ body of the method/fun
	 * 
	 * 
	 * return <data>; }
	 * 
	 * public class CustomerService{
	 * 
	 * public String getCustomerFirstName(int id){
	 * 
	 * return "sai"; }
	 * 
	 * 
	 * public String createCustomer(String firsttName, String lastName,String
	 * houseNumber,int ssn){
	 * 
	 * return "sai"; }
	 * 
	 * public int addTwoInteger(int a,int b){
	 * 
	 * return a+b; }
	 * 
	 * public double addTwoDecimal(double a,int b){
	 * 
	 * return a+b; }
	 * 
	 * 
	 * syntax : variable name : <datatype> <variable name / starts with lowercase
	 * followed by camelcase words >
	 * 
	 * 
	 * 3. what is package 4. access modifiers 5. final and static
	 * 
	 * 6. method signature 7. arrays
	 * 
	 * 
	 * ====>july 8th ===
	 * 
	 * loops , conditions , data structure 
	 * java keywords 
	 * 
	 * 
	 * 
	 */


