package com.tcs.jvm;

import java.lang.reflect.Method;

public class ClassInformation {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		//HeapMemoryAllocation hp=new HeapMemoryAllocation();
		int count = 0;
		Class c = Class.forName("java.lang.StringBuffer");
		Method[] m=c.getDeclaredMethods();
		for(Method m1:m){
			count++;
			System.out.println(m1.getName());
		}
		System.out.println(count);
	}

}
