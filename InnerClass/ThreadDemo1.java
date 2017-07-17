package com.tcs.InnerClass;

/**
 * Created by RITURAJ on 22-04-2017.
 */
public class ThreadDemo1 {
    public static void main(String[] args){
        new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("child Thread");
                }
            }
        }).start();
        for(int i=0; i<10;i++){System.out.println("Main Thread");}

    }
}
