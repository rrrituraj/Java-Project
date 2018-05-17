package com.tcs.java_lang;

public class Dog implements Cloneable {
    Cat c;
    int i;

    public Dog(Cat c, int i) {
        this.c = c;
        this.i = i;
    }

    public Dog() {
    }

    //overriding clone method for deep cloning
    /*public Object Clone() throws CloneNotSupportedException{
        Cat c1=new Cat(c.j);
        Dog d=new Dog(c1,i);
        return d;
    }*/

    //overriding clone method for shallow cloning
    public Object Clone() throws CloneNotSupportedException{

        return super.clone();
    }
}
