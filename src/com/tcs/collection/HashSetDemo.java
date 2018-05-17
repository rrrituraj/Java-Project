package com.tcs.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("shakti");
		h.add("raju");
		h.add("gupta");
		h.add("kamal");
		h.add("garg");
		h.add("shakti"); // allready present so will not add it
		h.add(null);
		System.out.println(h);

	}

}
