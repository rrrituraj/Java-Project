package com.tcs.threading;

public class Display {
	public synchronized void wish(String name){
		for (int i = 0; i < 3; i++) {
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println(name+"\n");
		}
	}
	public static synchronized void wish1(String name){
		for (int i = 0; i < 2; i++) {
			System.out.print("Good eve: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println(name+"\n");
		}
	}
}
