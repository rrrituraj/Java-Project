package com.tcs.threading;

public class ThreadDemo12 {

	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread11 t1 = new MyThread11(d1, "Rituraj");
		MyThread11 t2 = new MyThread11(d2, "Kamal");
		t1.start();
		t2.start();
	}

}
