package com.tcs.threading;

public class ThreadDemo15 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		MyThread13 t = new MyThread13();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());

	}

}
