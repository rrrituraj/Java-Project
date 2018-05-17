package com.tcs.jvm;

public class GetClassLoaderInfo {

	public static void main(String[] args) {
		System.out.println(Runtime.class.getClassLoader());
		System.out.println(ClassInformation.class.getClassLoader());
	}
}
