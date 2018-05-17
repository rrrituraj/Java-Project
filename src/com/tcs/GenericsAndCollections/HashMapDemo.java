package com.tcs.GenericsAndCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashMap m=new HashMap();
		/*Temp t = new Temp();
		m.put(t, "Raju");*/
		m.put(100, "Rituraj");
		m.put(101, "Shakti");
		m.put(102, "Kamal");
		m.put(103, "khujju");
		System.out.println(m);
		Set s1 = m.entrySet();
		//System.out.println(s1);
        Iterator itr=s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1=(Map.Entry)itr.next();
			//System.out.println(m1);
			System.out.println(m1.getKey()+"  "+m1.getValue());
			
			//System.gc();
			/* * object would not be destroyed beacause it is associated with the hashmap,
			 * if it would be associated with the weakhashmap then would be destroyed*/
			//System.out.println(m1.getKey()+"  "+m1.getValue());
			
		}

	}

}
