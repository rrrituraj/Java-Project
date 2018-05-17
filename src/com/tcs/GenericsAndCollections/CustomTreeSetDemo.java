package com.tcs.GenericsAndCollections;

import java.util.TreeSet;

public class CustomTreeSetDemo {
	/**
	 * Customized treeset demo
	 * @param args
	 */
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		TreeSet T = new TreeSet(new MyComparator());
		T.add(10);
		T.add(0);
		T.add(20);
		T.add(15);
		T.add(5);
		System.out.println(T);
	}

}
