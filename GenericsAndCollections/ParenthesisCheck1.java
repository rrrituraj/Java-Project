package com.tcs.GenericsAndCollections;

import java.util.EmptyStackException;
import java.util.Stack;

public class ParenthesisCheck1 {

	public static void main(String[] args) {
		String s = new String("(211)");
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				st.push(s.charAt(i));
				System.out.println(st);
			} else if (s.charAt(i) == ')') {
				try{
					st.pop();
					System.out.println(st);
				} catch(EmptyStackException e){
					System.out.println("Parenthesis is not  maintained properly and " + st+" remains");
					System.exit(2);
				}
				
			} else {
				System.out.println(s.charAt(i));
			}
		}

	}

}
