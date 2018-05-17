package com.tcs.overridding;

public class Test_Static {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		//Parent_Static.m1();  //Parent_Static m1 method
		//Child_Static.m1();  //Child_Static m1 method
		
		
		Parent_Static P= new Parent_Static(); 
		P.m1();
		Child_Static C= new Child_Static();  
		C.m1();
		Parent_Static PC=new Child_Static();
		PC.m1();
	}
}
