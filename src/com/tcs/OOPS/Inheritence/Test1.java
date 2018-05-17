package com.tcs.OOPS.Inheritence;

public class Test1 {

	public static void main(String[] args) {
		//case 1:
		Parent1 p = new Parent1();
		p.m1();
		//p.m2();
		
		//case 2:
		Child1 c = new Child1();
		c.m1();
		c.m2();
		
		//case 3:
		Parent1 p1 = new Child1();
		p1.m1();
		//p1.m2();
		
		//case 4:
		//Child1 c1 = new Parent1();

	}

}
