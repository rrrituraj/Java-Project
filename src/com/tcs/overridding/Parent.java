package com.tcs.overridding;

public class Parent {
	public Object m1() {
		System.out.println("Parent m1 method");
		return null;
	}

	public static final Object m2() {
		System.out.println("final m2 method of parent class");
		return null;
	}
}
