package com.tcs.ConcurrentCollections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyCopyOnArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("A");
        list1.add("C");
        list1.addAll(list);
        System.out.println(list1);//[A,C,A,B]
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("D");
        list1.addAllAbsent(list2);
        System.out.println(list1);//[A,C,A,B,D]
    }
}
