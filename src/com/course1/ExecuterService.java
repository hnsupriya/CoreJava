package com.course1;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


public class ExecuterService {
			public static void main(String[] args) throws InterruptedException, ExecutionException {
		
			//Executes only one thread
			ExecutorService es = Executors.newSingleThreadExecutor(); 

			//Internally manages thread pool of 2 threads
			ExecutorService esFTP = Executors.newFixedThreadPool(2); 

			//Internally manages thread pool of 10 threads to run scheduled tasks
			ExecutorService esSFTP = Executors.newScheduledThreadPool(10);
			
			
			 Runnable runnableTask = () -> {
			        try {
			            TimeUnit.MILLISECONDS.sleep(100);
			            System.out.println("Current time :: " + LocalDateTime.now());
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
			    };
			    
			    
			   Future  ft = esFTP.submit(runnableTask);
			   System.out.println("ft " +ft.get());
			    
			   esFTP.execute(runnableTask);
			

		}

	}


