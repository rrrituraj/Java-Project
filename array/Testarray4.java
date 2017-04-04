package com.tcs.array;

public class Testarray4 {
	
	public static void main(String[] args) {
		int arr[] = {4,4,5};
		@SuppressWarnings("rawtypes")
		Class c = arr.getClass();
		String name = c.getName();
		System.out.println(name);
	}
}
