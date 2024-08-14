package com.course1;

public class ExceptionHandling {

		public void updateCustomerDetails(int[] nos) {

			try {

				System.out.println(nos[2]);
				System.out.println(nos[4]);

			} catch (ArrayIndexOutOfBoundsException exp) { // dead end --> last Exception class in the order

				System.out.println("in updateCustomerDetails catch block " + exp.getMessage());
				System.out.println(exp.fillInStackTrace());
				throw new ArrayIndexOutOfBoundsException(exp.getMessage());

			}
		}

		public void printArrayData(int[] nos) throws ArrayIndexOutOfBoundsException { // method level

			System.out.println(nos[2]);
			System.out.println(nos[4]);

		}

		public static void main(String[] args) {

			// 1. compile time exception // checked Exception --> .java file converts into
			// .class (byte code --> bin folder ) --> internal task of the jvm
			// why java supports platform independent --> bytecode /(.class) can run on any
			// Operation system
			// 2. runtime exception// unchecked exception
			int[] nos = { 1, 2, 3, 4 };
			try {

				System.out.println(nos[2]);
				System.out.println(nos[4]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4
											// out of bounds for length 4

			} catch (ArrayIndexOutOfBoundsException exp) { // dead end --> last Exception class in the order

				System.out.println("in ArrayIndexOutOfBoundsException catch block " + exp.getMessage());
				System.out.println(exp.fillInStackTrace());
				// System.exit(0);

			} catch (RuntimeException exp) { // parent1

				System.out.println("in RuntimeException catch block " + exp.getMessage());
				System.out.println(exp.fillInStackTrace());

			} catch (Exception exp) { // parent to RuntimeException
				// log.error("in Exception catch block "+exp.getMessage())
				System.out.println("in Exception catch block " + exp.getMessage());
				System.out.println(exp.fillInStackTrace());

			}

			ExceptionHandling obj1 = new ExceptionHandling();
			try {

				obj1.updateCustomerDetails(nos); // caller / invoke the updateCustomerDetails
				// obj1.printArrayData(nos); --> same exception

			} catch (ArrayIndexOutOfBoundsException exp) {
				System.out.println("i am from the caller`s catch block " + exp.getMessage());
				System.out.println(exp.fillInStackTrace());
			}

			// duplicate method level exception ...just for our understanding

			try {

				obj1.printArrayData(nos); // caller / invoke the updateCustomerDetails

			} catch (ArrayIndexOutOfBoundsException exp) {
				System.out.println("i am from the caller`s catch block " + exp.getMessage());
				System.out.println(exp.fillInStackTrace());
			}

			// handling exceptions
			// 1. try{.....some code which throws exception ...}catch(ExcetionClassName
			// objectname){ ...... Sys()...}

		}

	}