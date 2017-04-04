package com.tcs.threading;

public class MyThread12 extends Thread {
	Display1 d;
	String name;

	public MyThread12(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
		
	}

}
