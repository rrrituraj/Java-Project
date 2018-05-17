package com.tcs.threading;
class MyThread7 extends Thread{
	
}
public class ThreadDemo7 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
		MyThread7 t = new MyThread7();
		System.out.println(t.getPriority());

	}

}
