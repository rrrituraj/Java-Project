package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 22-04-2017.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t=new Thread(){
            public void run(){
                for (int i=0;i<10;i++){
                    System.out.println("Child Thread");
                }
            }
        };
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
