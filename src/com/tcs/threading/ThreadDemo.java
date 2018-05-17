package com.tcs.threading;

class MyThread extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread k = new MyThread();
		//k.setPriority(10);
		k.start(); // difference between k.start() and k.run()
		for (int p = 0; p < 10; p++) {
			System.out.println("Main Thread");
		}

	}

}
