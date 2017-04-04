package com.tcs.GenericsAndCollections;

/**
 * A Java program to demonstrate working of SortedSet
 */
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args) {
		// Create a TreeSet and inserting elements
        SortedSet<String> sites = new TreeSet<>();
        sites.add("raju");
        sites.add("kaju");
        sites.add("bittu");
        sites.add("khujju");
 
        System.out.println("Sorted Set: " + sites);
        System.out.println("First: " + sites.first());
        System.out.println("Last: " + sites.last());
 
        // Getting elements before quiz (Excluding) in a sortedSet
        SortedSet<String> beforeQuiz = sites.headSet("bittu");
        System.out.println(beforeQuiz);
 
        // Getting elements between code (Including) and 
        // practice (Excluding)
        SortedSet<String> betweenCodeAndQuiz =
                                  sites.subSet("khujju","raju");
        System.out.println(betweenCodeAndQuiz);
 
        // Getting elements after code (Including)
        SortedSet<String> afterCode = sites.tailSet("khujju");
        System.out.println(afterCode);
		
	}

}
