package com.tcs.GenericsAndCollections;

public class GenericsDemo<T> {
	T ob;
	public GenericsDemo(T ob) {
		this.ob = ob;
	}
	public void show(){
		System.out.println("The type of object is "+ob.getClass().getName());
	}
	public T getob(){
		return ob;
	}

}
