package com.course1;

public class RunnableInt implements Runnable {
	
	public void run() {
		System.out.println("I am in Run Method");
		
	}

	public static void main(String[] args) {
		
		Runnable  runObj = new RunnableInt();
		
		Thread tObj = new Thread(runObj);
		
		tObj.start();


	

	}
}

