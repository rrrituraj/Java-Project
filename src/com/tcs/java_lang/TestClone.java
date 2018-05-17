package com.tcs.java_lang;

public class TestClone implements Cloneable {
    int i , j;

    public TestClone(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public TestClone() {
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        TestClone t1=new TestClone();
        TestClone t2=(TestClone)t1.clone();
        t1.i=888;
        t2.j=999;
        System.out.println(t1.i+"  "+t2.j);
    }
}
