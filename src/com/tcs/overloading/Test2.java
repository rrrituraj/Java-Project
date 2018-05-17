package com.tcs.overloading;

public class Test2 {
	/**
	 * Object is parent class of String Class
	 * @param s
	 */
	//Case 2 String vs Object Overloading
	public void m1(String s) {
		System.out.println("String Version");
	}
	public void m1(Object o) {
		System.out.println("Object Version");
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m1(new Object());
		t.m1("Raju");
		t.m1(null); // string is child of Object class thus null belonging to String will get Called
		
	}

}
