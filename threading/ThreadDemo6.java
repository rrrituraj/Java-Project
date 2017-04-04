package com.tcs.threading;

class MyThread6 extends Thread{
	public void run(){
		System.out.println("run executed by "+Thread.currentThread().getName());
	}
	
}
public class ThreadDemo6 {
	public static void main(String args[]){
		System.out.println("Hi");
		System.out.println("executed by "+Thread.currentThread().getName());
		MyThread6 t = new MyThread6();
		t.start();
		System.out.println("executed by "+t.getName());
		t.setName("Rituraj Gupta");
		System.out.println("executed by "+t.getName());
		System.out.println("priority are - "+Thread.MAX_PRIORITY+"  "+Thread.MIN_PRIORITY+" "+Thread.NORM_PRIORITY);
	}
}
