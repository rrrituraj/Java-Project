package com.tcs.InstanceControlFlow;

public class Parent {
    int i = 0;
    {
        m1();
        System.out.println("parent instance block");
    }

    public Parent() {
        System.out.println("parent constructor");
    }

    public static void main(String[] args) {
        Parent p=new Parent();
        System.out.println("Parent main");
    }
    public void m1(){
        System.out.println(j);
    }
    int j = 0;
}
