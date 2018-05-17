package com.tcs.GenericsAndCollections;

import java.util.Comparator;

public class MyNameComparator implements Comparator<Empl>{

	@Override
	public int compare(Empl o1, Empl o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
