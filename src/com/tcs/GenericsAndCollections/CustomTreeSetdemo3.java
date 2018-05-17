package com.tcs.GenericsAndCollections;

import java.util.TreeSet;

public class CustomTreeSetdemo3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator2());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add(new StringBuffer("XX"));
		t.add("ABCD");
		t.add("A");   //does not add duplicate
		System.out.println(t);

	}

}
