package com.tcs.java_lang;

public class TestEquals {

    public static void main(String[] args) {
        Student s1=new Student("Raju",46);
        Student s2=new Student("Raju",46);
        Student s3=new Student("bittu",10);
        Student s5=new Student("kaju",20);
        Student s4=s3;
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));

        System.out.print("hashcode comparision  ");
        System.out.println(s1.hashCode()==s2.hashCode());
    }
}
