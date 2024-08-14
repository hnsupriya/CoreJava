package com.course1;

public class MultiThreadExcecutorService extends Thread {
	
	public void run() {
		System.out.println("I am in Run Method"); 
		try {
			sleep(1110);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am in run method after sleep");
	}
	public static void main(String[] args) {
		MultiThreadExcecutorService obj1 = new MultiThreadExcecutorService();
		//obj.run();//not recommended
		obj1.start();
	}
	

}
