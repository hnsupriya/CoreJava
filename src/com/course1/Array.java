package com.course1;

public class Array {

		public static void main(String[] args) {
			// array -= similar data will be stored in on place 
			
			// datatype[] variablename={element1,elemt2.........};|
			                          // element1 index=0
			
			
			
			int[] numbers= {1,3,4,6,7,8,9,10,223};
			char[] letters= {'r','t'};
			
			System.out.println("numbers  = " + numbers.length);
			
			System.out.println("numbers  = " + numbers[8]);
			
			int[] nos = new int[5];
			nos[0]=6;
			nos[1]=6;
			nos[2]=6;
			nos[3]=6;
			nos[4]=6;
			System.out.println("nos  = " + nos.length);
			//nos[5]=6;//"main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
			//System.out.println("nos  = " + nos.length);
			
			// if(){}
			
			if(nos.length>4) {
				System.out.println("i am in the if " );
			}else {
				System.out.println("i am in the else " );
			}
			
			

		}

	}


