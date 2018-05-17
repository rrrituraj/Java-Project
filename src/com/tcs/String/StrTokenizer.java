package com.tcs.String;

import java.util.StringTokenizer;

public class StrTokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my,name,is,Rituraj",",");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}

}
