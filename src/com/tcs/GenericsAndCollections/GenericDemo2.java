package com.tcs.GenericsAndCollections;

import java.util.ArrayList;

/**
 * Created by RITURAJ on 15-07-2017.
 */
public class GenericDemo2 {
    public void m1(ArrayList<String> l){
        System.out.println(l.get(0)+"    "+l.get(1)+"    "+l.get(2));
    }

   /* public void m1(ArrayList<Integer> l){
        System.out.println(l.get(0));
    }*/

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Rituraj");
        list.add("Yashraj");
        list.add("Hansraj");
        GenericDemo2 gd=new GenericDemo2();
        gd.m1(list);
    }

}
