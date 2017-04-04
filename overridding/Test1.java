package com.tcs.overridding;

public class Test1 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.m1();
		
		Child1 ch = new Child1();
		ch.m1();
		
		Parent1 p1 = new Child1();
		p1.m1();
	}

}
