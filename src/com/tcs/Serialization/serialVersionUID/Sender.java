package com.tcs.Serialization.serialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {
  public static void main(String[] args) throws IOException {
    Anonn anonn = new Anonn();
    FileOutputStream fileOutputStream = new FileOutputStream("serial.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(anonn);
    System.out.println("bheja gya");
  }
}
