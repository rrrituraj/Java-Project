package com.tcs.GenericsAndCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {

		Employee e1=new Employee("Rituraj", 1);
		Employee e2=new Employee("Rituraj", 2);
		Employee e3=new Employee("Rituraj", 3);
		Employee e4=new Employee("Rituraj", 4);
		Employee e5=new Employee("Rituraj", 5);
		Employee e6=new Employee("Rituraj", 6);
		
		Map<Employee, Integer> map=new HashMap<>();
		map.put(e1, 1);
		map.put(e2, 2);
		map.put(e3, 3);
		map.put(e4, 4);
		map.put(e5, 5);
		map.put(e6, 6);
		
//		map.forEach((k,v)->System.out.println(k+" "+v));
		
		System.out.println(map.get(e5));
	}

}
