package com.tcs.threading;

public class ThreadGroupDemo1 {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Thread group");
		Thread t1 = new Thread(tg, "Thread1");
		Thread t2 = new Thread(tg, "Thread2");
		tg.setMaxPriority(2);
		Thread t3 = new Thread(tg, "Thread3");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}

}
