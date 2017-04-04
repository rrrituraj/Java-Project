package com.tcs.GenericsAndCollections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//Temp1 t = new Temp1(10);
		Hashtable h = new Hashtable();
		h.put((new Temp1(10)),"rituraj");
		h.put((new Temp1(19)),"kamal");
		h.put((new Temp1(11)),"shakti");
		h.put((new Temp1(15)),"vishal");
		System.out.println(h);
		Set s1 = h.entrySet();
		Set s2 = h.keySet();
		Collection cl=h.values();
		System.out.println("entry set----"+s1);
		System.out.println("key set----"+s2);
		System.out.println("values are----"+cl);
		Iterator itr=s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1=(Map.Entry)itr.next();
			//System.out.println(m1);
			System.out.println(m1.getKey()+"  "+m1.getValue());
			
			/*System.gc();
			 * object would not be destroyed beacause it is associated with the hashmap,
			 * if it would be associated with the weakhashmap then would be destroyed
			System.out.println(m1.getKey()+"  "+m1.getValue());*/
			
		}
		

	}

}
