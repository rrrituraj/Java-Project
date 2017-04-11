package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 11-04-2017.
 */
public class Outer4 {
    int x=10;
    public class Inner4{
        int x=100;
        public void m1(){
            int x=1000;
            System.out.println("inner class method variable calling   "+x); //1000
            System.out.println("inner class instance variable calling   "+this.x); //100
            System.out.println("Another way of inner class instance variable calling   "+Inner4.this.x); //100
            System.out.println("Outer class instance variable calling   "+Outer4.this.x); //10
        }
    }

    public static void main(String[] args) {
        new Outer4().new Inner4().m1();
    }
}
