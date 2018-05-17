package com.tcs.GenericsAndCollections;

import java.util.ArrayList;

public class Gen_Area {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Rituraj");
		l.add("Kamal");
		Non_Gen_Area.m1(l);
		System.out.println(l);		

	}

}
