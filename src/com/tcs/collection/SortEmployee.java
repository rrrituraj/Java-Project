package com.tcs.collection;

import java.util.ArrayList;
import java.util.List;

public class SortEmployee {
  public static void main(String[] args) {
    List<Employee> list = new ArrayList<>();
    list.add(new Employee(1, "one1"));
    list.add(new Employee(2, "two"));
    list.add(new Employee(3, "three"));
    list.add(new Employee(4, "four"));
    System.out.println(list.toString());
    int processors = Runtime.getRuntime().availableProcessors();
    System.out.println(processors);
    //    Collections.sort(list);
  }
}
