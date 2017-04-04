package com.tcs.GenericsAndCollections;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class TreeMapCompare implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		return I2.compareTo(I1);
	}
}
