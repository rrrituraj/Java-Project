package com.tcs.String_ex;

public class String_example2 {

	public static void main(String[] args) {
		String s1=new String("durga");
		String s2=s1.concat("software");
		String s3=s2.intern();
		String s4="durgasoftware";
		String s5=new String("durgasoftware");
		//System.out.println(s1.hashCode()+" \n"+s2.hashCode()+" \n"+s3.hashCode()+" \n"+s4.hashCode());
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s2==s5);
	}

}
