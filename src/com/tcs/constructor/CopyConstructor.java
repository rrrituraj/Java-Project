package com.tcs.constructor;

public class CopyConstructor {

	String name;
	int i;

	public CopyConstructor(String name, int i) {
		this.name = name;
		this.i = i;
		System.out.println(name + "  " + i);
	}

	public CopyConstructor(CopyConstructor c) {
		System.out.println(c.getClass().getName());
	}

	public static void main(String[] args) {

		CopyConstructor c1 = new CopyConstructor("Raju", 10);
		System.out.println(c1);
		CopyConstructor c2 = new CopyConstructor(c1);
		System.out.println(c2);

	}

}
