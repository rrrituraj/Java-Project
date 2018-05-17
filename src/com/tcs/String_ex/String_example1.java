package com.tcs.String_ex;

public class String_example1 {

	public static void main(String[] args) {
		String s1=new String("Raju");
		String s2=s1.intern();
		String s3="Raju";
		System.out.println(s1==s2);
		System.out.println(s2==s3);

	}

}
