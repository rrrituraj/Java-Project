package com.tcs.ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyCopyOnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer) itr.next();
            if (i % 2 == 0) {
                System.out.println("removing integer");
                itr.remove();
            }
        }
        System.out.println(list);

        CopyOnWriteArrayList<Integer> list1 = new CopyOnWriteArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        Iterator<Integer> itr1 = list1.iterator();
        while (itr1.hasNext()) {
            Integer i = (Integer) itr1.next();
            if (i % 2 == 0) {
                System.out.println("removing integer fatega");
                itr1.remove();
            }
        }
        System.out.println(list1);
    }
}
