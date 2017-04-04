package com.tcs.GenericsAndCollections;

import java.util.TreeMap;

public class TreeMapDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeMap m = new TreeMap();
		m.put(100, "Rajesh");
		m.put(101, "Rituraj");
		m.put(102, "Shakti");
		m.put(103, 111);
		// m.put("A", "Kamal");
		// here you will get this exception
		/**
		 * Exception in thread "main" java.lang.ClassCastException:
		 * java.lang.Integer cannot be cast to java.lang.String at
		 * java.lang.String.compareTo(String.java:111) at
		 * java.util.TreeMap.put(TreeMap.java:568) at
		 * com.tcs.GenericsAndCollections.TreeMapDemo.main(TreeMapDemo.java:14)
		 * 
		 */
		System.out.println(m);
		
		
		TreeMap m1 = new TreeMap(new TreeMapCompare());
		/**
		 * customized tree map
		 */
		m1.put(100, "Rajesh");
		m1.put(101, "Rituraj");
		m1.put(102, "Shakti");
		m1.put(103, 111);
		System.out.println("\nCustomized tree map \n"+m1);

	}

}
