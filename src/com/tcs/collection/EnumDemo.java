package com.tcs.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Vector v=new Vector();
		for(int i=1; i<=10;i++){
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement()+" ho gya");
		}
		System.out.println(e.getClass().getName());

	}

}
