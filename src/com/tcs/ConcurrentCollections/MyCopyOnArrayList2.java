package com.tcs.ConcurrentCollections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyCopyOnArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
        list1.addIfAbsent("A");
        list1.addIfAbsent("C");
        list1.addAll(list);
        System.out.println(list1);//[A,C,A,B]
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("E");
        list1.addAllAbsent(list2);
        System.out.println(list1);//[A,C,A,B,E]
    }
}
