package com.tcs.GenericsAndCollections;

import java.util.TreeSet;

public class CustomTreeSetDemo1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator1());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("C"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("D"));
		t.add(new StringBuffer("F"));
		t.add(new StringBuffer("E"));
		t.add(new StringBuffer("H"));
		t.add(new StringBuffer("I"));
		t.add(new StringBuffer("G"));
		System.out.println(t);
	}

}
