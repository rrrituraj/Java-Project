package com.tcs.interfaces;

public interface Allll {
	String s = "yo";
	public void method1();
}
interface BB{
	
}
interface C extends Allll, BB{
	public void method1();
	public void method1(int x);
}
