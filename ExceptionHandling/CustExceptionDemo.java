package com.tcs.ExceptionHandling;

public class CustExceptionDemo {

	public static void main(String[] args) {
		int age=Integer.parseInt(args[0]);
		if(age<18){
			throw new TooYoungException("Person is too young to marry");
		}
		else if(age>50){
			throw new TooOldException("I doubt you will get the match in this age too");
		}
		else{
			System.out.println("you will get the matching details soon by email...!");
		}

	}

}
