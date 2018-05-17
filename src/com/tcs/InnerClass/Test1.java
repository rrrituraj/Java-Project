package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 24-04-2017.
 */
public class Test1 {
    static class Nested{
        public static void main(String[] args) {
            System.out.println("Static Nested Class Main Method");
        }
    }

    public static void main(String[] args) {
        System.out.println("Outer Class Main Method");
    }
}
