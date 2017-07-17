package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 22-04-2017.
 */
public class PopCornTest {
    public static void main(String[] args) {

        PopCorn p=new PopCorn(){
          public void taste(){
              System.out.println("Spicy");
          }
        };
        p.taste(); //Spicy


        PopCorn p1=new PopCorn();
        p1.taste(); //Salty


        PopCorn p2=new PopCorn(){
          public void taste(){
              System.out.println("Sweet");
          }
        };
        p2.taste(); //Sweet


        System.out.println(p.getClass().getName()); //PopCornTest$1
        System.out.println(p1.getClass().getName()); //PopCorn
        System.out.println(p2.getClass().getName()); //PopCornTest$2

        /**
         * Output will be:
         Spicy
         Salty
         Sweet
         com.tcs.InnerClass.PopCornTest$1
         com.tcs.InnerClass.PopCorn
         com.tcs.InnerClass.PopCornTest$2
         */

    }
}
