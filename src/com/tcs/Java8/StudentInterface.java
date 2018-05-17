package com.tcs.Java8;

import java.util.Collections;
import java.util.List;

/**
 * Created by RITURAJ on 20-07-2017.
 */
public interface StudentInterface {

    default public List<Student> stuList(List<Student> std){
        Collections.sort(std);
        return std;
    }
    public static void greet(String name){
        System.out.println("My Name is "+name);
    }

    public abstract Integer getMax(List<Integer> intList);
}
