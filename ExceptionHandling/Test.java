package com.tcs.ExceptionHandling;

public class Test {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000); //will make thread to sleep for 10 seconds
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally done");
		}
//		Thread.sleep(10000); //will make thread to sleep for 10 seconds
	}

}
