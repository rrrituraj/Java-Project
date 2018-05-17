package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 24-04-2017.
 */
public class TestInterface {
    public static void main(String[] args) {
        TestOuterInterface t1=new TestOuterInterface();
        t1.m1();

        TestInnerInterface t2=new TestInnerInterface();
        t2.m2();
    }
}
