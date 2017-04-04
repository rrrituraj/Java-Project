package com.tcs.overloading;

public class Test3 {
	/**
	 * String vs StringBuffer in Overloading
	 * @param s
	 */
	//Case 3
	public void m1(String s){
		System.out.println("String Version");
	}
	public void m1(StringBuffer s){
		System.out.println("String Buffer Version");
	}
	
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.m1("Raju");
		t.m1(new StringBuffer("Raju"));
		//t.m1(null); // will through ambiguity
		

	}

}
