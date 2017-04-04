package com.tcs.threading;

public class Display1 {
	public void wish(String name){
		
		;;;; // lakhs of code
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Good Morning: ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

				}
				System.out.println(name);
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(name);
		}
		;;;;; // lakhs of code
	}

}
