package com.tcs.Serialization;

import java.io.*;

public class InheritSerializationDemo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
      Kutta kutta=new Kutta();
      kutta.i=888;
      kutta.j=999;
      FileOutputStream outputStream = new FileOutputStream("acc.ser");
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
      objectOutputStream.writeObject(kutta);

    System.out.println("Deserialization Started");

      FileInputStream fileInputStream = new FileInputStream("acc.ser");
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      Kutta kutta1 = (Kutta) objectInputStream.readObject();
    System.out.println(kutta1.i+"...."+kutta1.j);
  }
}
