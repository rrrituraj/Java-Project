package com.tcs.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Dog dog = new Dog();

    FileOutputStream fileOutputStream = new FileOutputStream("dog.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(dog);

    FileInputStream fileInputStream = new FileInputStream("dog.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Dog d2 = (Dog) objectInputStream.readObject();
    //    System.out.println(d2.i + " .. " + d2.j);
    System.out.println(dog.cat.rat.j);
  }
}
