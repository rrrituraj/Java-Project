package com.tcs.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		h.add("shakti");
		h.add("raju");
		h.add("gupta");
		h.add("kamal");
		h.add("garg");
		h.add("khujju"); // allready present so will not add it
		h.add(null);
		System.out.println(h);

	}

}
