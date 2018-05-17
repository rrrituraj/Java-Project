package com.tcs.jvm;

public class HeapMemoryAllocation {

	public static void main(String[] args) {
		Runtime r =Runtime.getRuntime();
		System.out.println("Max Memory: "+r.maxMemory()/(1024*1024d));
		System.out.println("initial Memory: "+r.totalMemory()/(1024*1024d));
		System.out.println("free Memory: "+r.freeMemory()/(1024*1024d));
		System.out.println("Consumed Memory: "+(r.totalMemory()-r.freeMemory())/(1024*1024f));
	}

}
