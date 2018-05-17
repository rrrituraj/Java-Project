package com.tcs.InnerClass;

public class Outer {
    public static void main(String[] args) {
        System.out.println("Outer class main method");
    }
    class Inner {
    }
}
/*public class Outer {

    class Inner {
    public static void main(String[] args) {
        System.out.println("Outer class main method");
    }

    //we can't declare the static modifier in inner class, because inner class always talks about the instance behaviour

    }
}*/

