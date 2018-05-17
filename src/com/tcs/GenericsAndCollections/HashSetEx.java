package com.tcs.GenericsAndCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	
	public void hashSetTest(){
		HashSet<String> hs=new HashSet<>();
		hs.add("rituraj");
		hs.add("gupta");
		System.out.println(hs);
		ArrayList<String> arr=new ArrayList<>();
		arr.add("yashraj");
		arr.add("hansraj");
		hs.addAll(arr);
		System.out.println(hs);
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		
	}

}