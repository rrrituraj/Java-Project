package com.tcs.ConcurrentCollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread extends Thread {
    //    private static ArrayList<String> list = new ArrayList<>();
    private static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        list.add("A");
        list.add("B");
        list.add("C");
        MyThread thread = new MyThread();
        thread.start();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println("main  thread iterating list " + s);
            Thread.sleep(2000);
        }
        System.out.println(list);
    }

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("In run method");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add("D");
    }
}
