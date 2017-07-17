package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 24-04-2017.
 */
public class Test2 {
    int x=10;
    static int y=20;
    static class Nested{
        public void m1(){
            //System.out.println(x); //CE:- Error:(11, 32) java: non-static variable x cannot be referenced from a static context
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        Nested n=new Nested();
        n.m1();
    }
}
