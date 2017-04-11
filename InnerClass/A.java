package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 11-04-2017.
 */
public class A {
    public class B {
        public class C{
            public void m1(){
                System.out.println("Inside inner class method");

            }
        }

    }

    public static void main(String[] args) {
        A a=new A();
        A.B b=a.new B();
        A.B.C c=b.new C();
        c.m1();
    }
}
