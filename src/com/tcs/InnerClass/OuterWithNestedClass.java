package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 24-04-2017.
 */
public class OuterWithNestedClass {
    static class Nested{
        public void m1(){
            System.out.println("Static Nested Class Method");
        }
    }

    public static void main(String[] args) {
        Nested n=new Nested();
        n.m1();
    }
}
