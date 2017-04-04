package com.tcs.declaration_and_modifiers;

public class FinalMethod_child extends FinalMethod_Parent {
	/**
	 * it implements the method defined by its parent class
	 * it is trying to ovveride the method.
	 * overloading is possible
	 * @param args
	 */
	void marry(int i){  //overoloading is possible
		System.out.println("Beta:  I am going to merry of my own choice \n"+i+" number Papa");
	}
	public static void main(String[] args) {
		FinalMethod_child ch = new FinalMethod_child();
		ch.marry(1);

	}

}
