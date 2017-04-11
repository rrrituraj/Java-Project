package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 11-04-2017.
 */
public class TestClass {
    public static void main(String[] args) {
        Outer1 o=new Outer1();
        Outer1.Inner1 i=o.new Inner1();
        i.m1();
        o.m2();
    }
}
