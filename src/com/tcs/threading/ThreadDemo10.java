package com.tcs.threading;

class MyThread10 extends Thread{
	static Thread mt;
	public void run(){
		try {
			mt.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread");
	}
	
}
public class ThreadDemo10 {

	public static void main(String[] args) throws InterruptedException {
		MyThread10.mt = Thread.currentThread();
		MyThread10 t = new MyThread10();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
		
	}

}
