package com.tcs.ExceptionHandling;

/**
 * StackOverFlowError Example
 *
 * @author RITURAJ
 */
public class StackOverFlowError_Example {
    public static void main(String[] args) {
        new StackOverFlowError_Example().m1();

    }

    void m1() {
        m2();
    }

    void m2() {
        m1();
    }

}
