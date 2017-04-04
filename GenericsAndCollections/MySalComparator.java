package com.tcs.GenericsAndCollections;

import java.util.Comparator;

public class MySalComparator implements Comparator<Empl> {

	@Override
	public int compare(Empl o1, Empl o2) {
		if(o1.salary<o2.salary){
			return -1;
		}
		else if(o1.salary>o2.salary){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	

}
