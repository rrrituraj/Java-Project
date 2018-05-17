package com.tcs.garbagecollections;

/**
 * Created by RITURAJ on 18-07-2017.
 */
public class FinalizeTest {

    public void finalize(){
        System.out.println("finalize method called");
    }
    public static void main(String[] args) {
        FinalizeTest test=new FinalizeTest();
        test.finalize();
        test.finalize();
        test=null;
        System.gc();
        System.out.println("end of main");
    }
}
