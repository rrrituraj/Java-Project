package com.tcs.HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandle {


    static void birthdayCakeCandles(int n, int[] ar) {
        int count=0;
        Arrays.sort(ar);
        int highest=ar[ar.length-1];
        for (int i:ar
             ) {
            if(i==highest){
                count++;
            }
        }

        //return count;
        System.out.println(count);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        /*int result = birthdayCakeCandles(n, ar);
        System.out.println(result);*/
        birthdayCakeCandles(n,ar);
    }
}
