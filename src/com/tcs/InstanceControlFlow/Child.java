package com.tcs.InstanceControlFlow;

public class Child extends Parent {
    int x = 100;
    {
        m2();
        System.out.println("child first instance block");
    }
    public Child(){
        System.out.println("child constructor");
    }

    public static void main(String[] args) {
        Child c=new Child();
        System.out.println("child main");
    }
    public void m2(){
        System.out.println(y);
    }
    {
        System.out.println("child second instance block");
    }
    int y = 200;
}
