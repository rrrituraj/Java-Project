package com.tcs.Java8.lambda;

public class FunctionalInterfaceMain {
  public static void main(String[] args) {
    FunctionalInterfaceMain interfaceMain = new FunctionalInterfaceMain();
    interfaceMain.printForm(
        () -> System.out.println("Printable interface print method pass kiya hai abhi!!!"));
  }

  private void printForm(Printable printable) {
    printable.print();
    System.out.println("FunctionalInterfaceMain printForm method");
  }
}
