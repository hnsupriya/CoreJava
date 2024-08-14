package com.course1;

import java.util.concurrent.Callable;

public class CallableInt implements Callable<CallableInt>{
	
	@Override
	public CallableInt call() throws Exception {
		System.out.println("i am in run method");
		return null;
	}
	
	
	public static void main(String[] args) throws Exception {
		
		Callable<CallableInt>  runObj = new CallableInt();
		
		runObj.call();
	}
}

