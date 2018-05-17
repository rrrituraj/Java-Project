package com.tcs.String;

public class TestMutability {

    public static void main(String[] args) {
        String s1=new String("Raju");
        String s2=new String("Raju");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
