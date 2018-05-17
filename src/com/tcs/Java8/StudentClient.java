package com.tcs.Java8;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(120);
        list.add(130);
        list.add(140);


        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("rituraj",24));
        studentList.add(new Student("yashraj",22));
        studentList.add(new Student("hansaraj",19));
        studentList.add(new Student("omprakash",50));
        studentList.add(new Student("radhika",46));

        StudentInterface std=new MyStudentClass();
        System.out.println(std.getMax(list));
        System.out.println(std.stuList(studentList));
    }
}
