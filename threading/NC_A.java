package com.tcs.threading;

public class NC_A {
	public void d1(NC_B b){
		System.out.println("thread starts execution of d1 method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Trying to call the last method");
		b.last();
	}
	public synchronized void last(){
		System.out.println("inside NC_B class, last method");
	}

}
