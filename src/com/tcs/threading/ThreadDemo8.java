package com.tcs.threading;

class MyThread8 extends Thread{
	public void run(){
		for (int i = 0; i < 3; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

public class ThreadDemo8 {

	public static void main(String[] args) {
		MyThread8 k = new MyThread8();
		//k.setPriority(10);
		k.start(); // difference between k.start() and k.run()
		for (int p = 0; p < 3; p++) {
			System.out.println("Main Thread");
		}

	}

}
