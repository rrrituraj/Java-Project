package com.tcs.threading;

public class ThreadDemo16 {

	public static void main(String[] args) {
		MyThread13 t = new MyThread13();
		t.setDaemon(true);
		t.start();
		System.out.println("Main Thread");	
	}

}
