package com.tcs.threading;
/**
 * Thread Group
 * @author RITURAJ
 *
 */
public class ThreadGroupDemo extends Thread {

	public static void main(String[] args) {
		//ThreadDemo19 t=new ThreadDemo19();
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup t1 = new ThreadGroup("First Group");
		System.out.println(t1.getParent().getName());
		ThreadGroup t2 = new ThreadGroup(t1,"Second Group");
		System.out.println(t2.getParent().getName());

	}

}
