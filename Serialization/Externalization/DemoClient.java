package com.tcs.Serialization.Externalization;

import java.io.*;

public class DemoClient {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ExtDemo extDemo = new ExtDemo("rituraj", 10, 20);
    FileOutputStream fileOutputStream = new FileOutputStream("ext.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(extDemo);

    FileInputStream fileInputStream = new FileInputStream("ext.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    ExtDemo extDemo1 = (ExtDemo) objectInputStream.readObject();
    System.out.println(extDemo1.i + "  " + extDemo1.s);
  }
}
