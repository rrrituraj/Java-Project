package com.tcs.threading;

public class Deadlock extends Thread {
	NC_A a = new NC_A();
	NC_B b = new NC_B();
	
	public void m1(){
		this.start();
		a.d1(b);
	}
	
	public void run(){
		b.d2(a);
	}
	
	public static void main(String args[]){
		Deadlock t = new Deadlock();
		t.m1();
	}
}
