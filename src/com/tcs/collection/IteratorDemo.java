package com.tcs.collection;

import java.util.*;

class IteratorDemo{
	public static void main(String[] arg){
			ArrayList<Integer> l = new ArrayList<Integer>();
			for(int i=0; i<=10; i++){
				l.add(i);
			}
			System.out.println(l);
			Iterator<Integer> itr=l.iterator();
			while(itr.hasNext()){
				Integer I=(Integer)itr.next();
				if (I%2==0) {
					System.out.println(I);
				}
				else{
					itr.remove();
				}
				
			}
			System.out.println(l);
	}
}
