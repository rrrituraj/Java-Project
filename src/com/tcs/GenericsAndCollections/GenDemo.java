package com.tcs.GenericsAndCollections;

public class GenDemo {
	public <T> void m1(T ob){
		System.out.println(ob.getClass().getName());
	}
	public void m2(int x){
		System.out.println("calling m2");
		System.out.println(x);
		
	}
}
