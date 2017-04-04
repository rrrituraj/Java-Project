package com.tcs.GenericsAndCollections;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("K");
		t.add("Z");
		t.add("A");
		t.add("A");
		System.out.println(t);

	}

}
