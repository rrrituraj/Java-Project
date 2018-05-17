package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 22-04-2017.
 */
public class Test {
    public void m1(){
        int x=10;
        class Inner{
            public void m2(){
                System.out.println(x);
            }
        }
        Inner i=new Inner();
        i.m2();
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.m1();
    }
}
