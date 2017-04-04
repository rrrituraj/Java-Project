package com.tcs.GenericsAndCollections;

import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeCompareMap {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		TreeMap t = new TreeMap(new MyNameComparator());
		t.put(new Empl("Rituraj", 01), "Rituraj");
		t.put(new Empl("Kamal", 02), "Kamal");
		t.put(new Empl("Motu", 03), "Motu");
		System.out.println(t);
		
		
		TreeMap t1 = new TreeMap(new MySalComparator());
		t1.put(new Empl("Rituraj", 01), "Rituraj");
		t1.put(new Empl("Kamal", 02), "Kamal");
		t1.put(new Empl("Motu", 03), "Motu");
		System.out.println(t1);
		
		
		TreeSet t2=new TreeSet(new MySalComparator());
		t2.add(new Empl("Rituraj", 01));
		t2.add(new Empl("Kamal", 02));
		t2.add(new Empl("Motu", 03));
		System.out.println(t2);
		
		
		Hashtable ht=new Hashtable(t);
		System.out.println(ht);
	}
}
