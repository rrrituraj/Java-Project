package com.tcs.threading;

public class ThreadDemo11 {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread11 t1 = new MyThread11(d, "Rituraj");
		MyThread11 t2 = new MyThread11(d, "Kamal");
		//MyThread11 t3 = new MyThread11(d, "Shakti");
		t1.start();
		t2.start();
		//t3.start();
	}

}
