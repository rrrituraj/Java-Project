package com.tcs.Java8.predicate;


import java.util.function.Predicate;

public class PredicateTest {
  public static void main(String[] args) {
//    Predicate<String> pstr = s -> s.length() > 5;
    Predicate<Integer> gt=n->n>5;
    Predicate<Integer> even= s -> s % 2 == 0;
    Predicate<Integer> evandgt=n->n>5 || n%2==0;
//    Predicate<Integer> pint = s -> s % 2 == 0;
    //    System.out.println(pstr.test("raju"));
    //    System.out.println(pstr.test("rituraj"));
    int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    m1(even.or(gt), arr);
    m1(evandgt, arr);
  }

  public static void m1(Predicate<Integer> p, int[] arr) {
    for (int e : arr) {
      if (p.test(e)) {
        System.out.println("Even: "+e);
      }
    }
  }
}
