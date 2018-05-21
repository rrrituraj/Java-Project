package com.tcs.ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyCopyOnArrayList3 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        Iterator itr = list.iterator();
        list.add("D");
        while (itr.hasNext()) {
            String s = (String) itr.next();
            System.out.println(s);
        }

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        Iterator itr1 = list1.iterator();
        list1.add("D");
        while (itr1.hasNext()) {
            String s = (String) itr1.next();
            System.out.println(s);
        }
    }
}
