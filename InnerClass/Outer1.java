package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 11-04-2017.
 */
public class Outer1 {
    public class Inner1{
        public void m1(){
            System.out.println("from inner class m1 method");
        }
    }
    public void m2(){
        System.out.println("from outer class m2 method");
    }

}
