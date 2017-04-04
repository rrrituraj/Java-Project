package com.tcs.GenericsAndCollections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class QueueEx {

	public static void main(String[] args) {
		
		System.out.println("\n---------Queue Operations---------");
		PriorityQueue<Integer> q=new PriorityQueue<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		q.offer(60);
		System.out.println(q);
		Iterator<Integer> itr=q.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("peek element of queue is---"+q.peek());
		
		
		System.out.println("\n\n\n---------Stack Operations---------");
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st);
		Iterator<Integer> itr1=st.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		System.out.println("peek element of Stack is---"+st.peek());
		
	}
}
