package com.tcs.overloading;

public class Test6 {
	
	public void m1(Animal a){
		System.out.println("Animal version");
	}
	
	public void m1(Monkey m){
		System.out.println("Monkey Version");
	}
	
	public static void main(String[] args) {
		Test6 t = new Test6();
		
		//
		Animal a = new Animal();
		t.m1(a);
		
		//
		Monkey m = new Monkey();
		t.m1(m);
		
		//
		Animal a1 = new Animal();
		t.m1(a1); //"Animal Method" because method resolution are takes care by compiler base on reference type
		

	}

}
