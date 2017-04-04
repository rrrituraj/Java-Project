package com.tcs.GenericsAndCollections;

import java.util.TreeSet;

public class EmployeeCompare {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Employee e1=new Employee("Rituraj", 01);
		Employee e2=new Employee("Shakti", 20);
		Employee e3=new Employee("Kamal", 56);
		Employee e4=new Employee("Prasoon", 36);
		Employee e5=new Employee("Vishal", 02);
		Employee e6=new Employee("Anurag", 6);
		
		TreeSet t = new TreeSet();
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println("\nWith Default Natural Sorting Order of id's \n"+t);
		
		TreeSet t1 = new TreeSet(new MyComparator4());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		System.out.println("\nWith customized Sorting Order of Employee Name's \n"+t1);
	}

}
