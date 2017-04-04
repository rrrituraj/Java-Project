package com.tcs.GenericsAndCollections;

import java.util.TreeSet;

public class TreeSetDemo1 {
	/**
	 * will throw run time exception 
	 * because string buffer is not comparable and classcastexception you will get
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		System.out.println(t);

	}

}
