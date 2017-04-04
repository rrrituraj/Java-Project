package com.tcs.GenericsAndCollections;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class MyComparator1 implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		//String s1 =(String)obj1;
		//String s2 =(String)obj2;
		return s1.compareTo(s2);	
	}
}
