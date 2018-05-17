package com.tcs.Serialization.Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExtDemo implements Externalizable {
  String s;
  int i;
  int j;

  public ExtDemo() {
    System.out.println("in no-arg constructor");
  }

  public ExtDemo(String s, int i, int j) {
    this.s = s;
    this.i = i;
    this.j = j;
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(s);
    out.writeInt(i);
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    s = (String) in.readObject();
    i = in.readInt();
  }
}
