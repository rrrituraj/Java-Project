package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 11-04-2017.
 */
//Accessing the innerclass code from instance area of outer class
public class Outer2 {
    public  class Inner2{
        public void m1(){
            System.out.println("from inner2 class m1 method");
        }
    }
    public void m2(){
        Inner2 i=new Inner2();
        i.m1();
    }

    public static void main(String[] args) {
        Outer2 o=new Outer2();
        o.m2();
    }
}
