package com.tcs.threading;

public class Class_level_lock {
	public static synchronized void m1(){
		System.out.println("I am in static synced");		
	}
	public synchronized void m2(){
		System.out.println("I am in non static synced");
	}
	public void m3(){
		System.out.println("I am not in synced");
	}
}
