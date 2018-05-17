package com.tcs.threading;

public class NC_B {
	public synchronized void d2(NC_A a){
		System.out.println("thread starts execution of d2 method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Trying to call the a last method");
		a.last();
	}
	public synchronized void last(){
		System.out.println("inside NC_A class, last method");
	}

}
