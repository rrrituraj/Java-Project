package com.tcs.InstanceControlFlow;

public class Test {

	int i = 10;

	{
		m1();
		System.out.println("first instance block");
	}

	Test() {
		System.out.println("Constructor");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("Main Method");
	}

	public void m1() {
		System.out.println(j);
	}

	{
		System.out.println("Second instance block");
	}

	int j = 20;

}
