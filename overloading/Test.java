package com.tcs.overloading;

public class Test {
	/**
	 * Overloading cases
	 * case 1
	 * @param args
	 */
	//Type Promotion
	public void m1(int i){
		System.out.println("int-arg method");
	}
	public void m1(float f){
		System.out.println("Float-arg method");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1(10);
		t.m1('a');
		t.m1(10l);
		//t.m1(10.5);

	}

}
