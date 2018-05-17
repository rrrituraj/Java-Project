package com.tcs.Serialization;

import java.io.*;

public class CustSerializableDemo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Account account = new Account();
    System.out.println(account.userName + " -------> " + account.pwd + " with ---->" + account.pin);

    FileOutputStream outputStream = new FileOutputStream("acc.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
    objectOutputStream.writeObject(account);

    FileInputStream fileInputStream = new FileInputStream("acc.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Account account1 = (Account) objectInputStream.readObject();
    System.out.println(
        account1.userName + " -------> " + account1.pwd + " with ---->" + account1.pin);
  }
}
