package com.tcs.threading;

public class ThreadDemo14 {
	public static void main(String[] args){
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		MyThread12 t1 = new MyThread12(d1, "Rituraj");
		MyThread12 t2 = new MyThread12(d2, "Kamal");
		t1.start();
		t2.start();

	}
}
