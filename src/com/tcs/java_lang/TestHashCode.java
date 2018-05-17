package com.tcs.java_lang;

public class TestHashCode {
    int i;

    public TestHashCode(int i) {
        this.i = i;
    }

    public TestHashCode() {
    }

    //overriding the toString method
    public String toString(){
        return i+" ";
    }

    //overriding the hashCode() method of object class
    public int hashCode(){
        return i;
    }

    public static void main(String[] args) {
        TestHashCode t1=new TestHashCode(10);
        System.out.println(t1);
        TestHashCode t2=new TestHashCode(100);
        System.out.println(t2);
    }
}
