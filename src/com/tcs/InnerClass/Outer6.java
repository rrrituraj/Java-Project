package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 20-04-2017.
 */
public class Outer6 {
    int x=10;
    static int y=20;
    public void m1(){
        class Inner{
            public void m2(){
                //System.out.println("sum is "+(x+y));
                System.out.println(x); //if static : Error:(13, 36) java: non-static variable x cannot be referenced from a static context
                /*
                if we declare the m1() as static, the here we will get compile time error saying:
                *non-static variable x cannot be referenced from a static context
                 */
                System.out.println(y);

            }
        }
        Inner i= new Inner();
        i.m2();
    }
    public static void main(String[] args) {
        Outer6 ot=new Outer6();
        ot.m1();
    }
}
