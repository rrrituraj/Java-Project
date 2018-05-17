package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 22-04-2017.
 */
public class Outer7 {
    /*int i=10;
    static int j=20;*/
    public void m1() {
        int k = 10;
        class Inner {
            public void m2() {
                /*System.out.println(i);
                System.out.println(j);*/
                System.out.println(k);
            }
        }
        Inner i = new Inner();
        i.m2();
    }

    public static void main(String[] args) {
        Outer7 ot = new Outer7();
        ot.m1();
    }
}
