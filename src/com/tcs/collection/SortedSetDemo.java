package com.tcs.collection;

import java.util.*;

public class SortedSetDemo implements SortedSet {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SortedSetDemo st = new SortedSetDemo();
		for(int i=1; i<=10;i++){
			st.add(st);		
		}
		System.out.println(st.isEmpty());
		System.out.println(st);
		System.out.println(st.first());

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comparator comparator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet subSet(Object fromElement, Object toElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet headSet(Object toElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet tailSet(Object fromElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object last() {
		// TODO Auto-generated method stub
		return null;
	}	
}
