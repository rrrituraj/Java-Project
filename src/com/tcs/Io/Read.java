package com.tcs.Io;

import java.util.Scanner;

/**
 * Created by RITURAJ on 29-04-2017.
 */
/*
Scanner Class in Java
Scanner is a class in java.util package used for obtaining the input of the primitive types like int,
 double etc. and strings. It is the easiest way to read input in a Java program,
 though not very efficient if you want an input method for scenarios where time is a constraint like in competitive programming.
 */
//// Java program to read data of various types using Scanner class.
public class Read {
    public static void main(String[] args) {

        // Declare the object and initialize with
        // predefined standard input object

        Scanner sc = new Scanner(System.in);

        //String Input
        String name = sc.nextLine();

        //Character Input

        Character ch = sc.next().charAt(0);


        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();

        System.out.println("name " + name);
        System.out.println("gender " + ch);
        System.out.println("age " + age);
        System.out.println("mobile " + mobileNo);
        System.out.println("CGPA " + cgpa);


    }
}
