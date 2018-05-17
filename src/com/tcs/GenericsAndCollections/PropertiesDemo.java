package com.tcs.GenericsAndCollections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:/Users/RITURAJ/Desktop/pass.txt");
		p.load(fis);
		System.out.println(p);
		p.setProperty("1000602", "guptaRAJ56%^");
		FileOutputStream fos = new FileOutputStream("C:/Users/RITURAJ/Desktop/pass.txt");
		p.store(fos, "Set by rituraj");
		System.out.println(p);
	}

}
