package com.tcs.overloading;

public class Test5 {
	//case 5
	public void m1(int i){
		System.out.println("General Method");
	}
	public void m1(int... i){
		System.out.println("Var-arg method");
	}
	public static void main(String[] args) {
		Test5 t = new Test5();
		t.m1();
		t.m1(10, 20);
		t.m1(10); //general method because came in 1.0 version

	}

}
