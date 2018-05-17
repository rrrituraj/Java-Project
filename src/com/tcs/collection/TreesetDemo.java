package com.tcs.collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreesetDemo {
	public static void main(String[] args) {
		TreeSet h = new TreeSet();
		h.add("shakti");
		h.add("raju");
		h.add("gupta");
		h.add("kamal");
		h.add("garg");
		h.add("khujju"); // allready present so will not add it
		//h.add(null);
		System.out.println(h);
	}

}
