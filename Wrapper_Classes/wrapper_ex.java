package com.tcs.Wrapper_Classes;

public class wrapper_ex {

	public static void main(String[] args) {
		Integer i=Integer.valueOf(10);
		Integer i1=Integer.valueOf("15");
		System.out.println(i+"  "+i1);
		System.out.println(i.getClass().getName());
		System.out.println(i1.getClass().getName());
		
		Boolean b=Boolean.valueOf("raju");
		System.out.println(b);
	}

}
