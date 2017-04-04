package com.tcs.threading;

/*overriding start method
and so start method will be called*/

class MyThread3 extends Thread{
	public void start(){
		System.out.println("start method");
	}
	public void run(){
		System.out.println("run method");
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		MyThread3 t = new MyThread3();
		t.start();

	}

}
