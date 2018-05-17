package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 11-04-2017.
 */
public class Outer3 {
    int x=10;
    static int y=20;
    public class Inner3{
        public void m1(){
            System.out.println("outer class instance variable accessing "+x);
            System.out.println("outer class static variable accessing "+y);
        }
    }

    public static void main(String[] args) {
        new Outer3().new Inner3().m1();
    }
}
