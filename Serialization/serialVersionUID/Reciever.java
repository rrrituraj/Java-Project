package com.tcs.Serialization.serialVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reciever {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    FileInputStream fileInputStream = new FileInputStream("serial.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Anonn anonn = (Anonn) objectInputStream.readObject();
    System.out.println("ye mila");
    System.out.println(anonn.i + "...." + anonn.j);
  }
}
