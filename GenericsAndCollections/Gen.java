package com.tcs.GenericsAndCollections;

public class Gen {

	public static void main(String...args) {
		GenericsDemo<String> gd = new GenericsDemo<String>("Rituraj");
		gd.show();
		System.out.println(gd.getob());
		GenericsDemo<Integer> gd1 = new GenericsDemo<Integer>(10);
		gd1.show();
		System.out.println(gd1.getob());
		GenericsDemo<Double> gd2= new GenericsDemo<Double>(10.5);
		gd2.show();
		System.out.println(gd2.getob());

	}

}
