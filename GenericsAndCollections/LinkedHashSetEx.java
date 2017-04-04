package com.tcs.GenericsAndCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("rituraj");
		lhs.add("gupta");
		lhs.add("raju");
		System.out.println(lhs);
		ArrayList<String> arr=new ArrayList<>();
		arr.add("yashraj");
		arr.add("hansraj");
		lhs.addAll(arr);
		System.out.println(lhs);
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}
