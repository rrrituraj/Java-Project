package com.tcs.GenericsAndCollections;

import java.util.ArrayList;

/**
 * Created by RITURAJ on 15-07-2017.
 */
public class GenericsWildCard {
    public void m1(ArrayList<? extends Number> list){
       // list.add(12);
        /**
         * can not add anything in this method
         * except null
         *because we don't know the type exactly
         */
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Number> alint=new ArrayList<>();
        alint.add(1);
        alint.add(1.5);
        alint.add(0.5f);
        alint.add(1000L);
        GenericsWildCard gd=new GenericsWildCard();
        gd.m1(alint);
    }
}
