package com.tcs.overloading;

public class Test4 {
	//case 4
	public void m1(int i, float f){
		System.out.println("int-float args");
	}
	public void m1(float f, int i){
		System.out.println("float-int args");
	}
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.m1(10, 10.5f);
		t.m1(10.5f, 10);
		//t.m1(10, 10);
		//t.m1(1.5f, 10.5f);

	}

}
