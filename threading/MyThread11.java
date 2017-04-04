package com.tcs.threading;

public class MyThread11 extends Thread {
	
	Display d;
	String name;

	public MyThread11(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
		Display.wish1(name);
	}

}
