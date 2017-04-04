package com.tcs.threading;

public class ThreadDemo13 {

	public static void main(String[] args) {
		Display1 d = new Display1();
		MyThread12 t1 = new MyThread12(d, "Rituraj");
		MyThread12 t2 = new MyThread12(d, "Kamal");
		MyThread12 t3 = new MyThread12(d, "Shakti");
		t1.start();
		t2.start();
		t3.start();

	}

}
