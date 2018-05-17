package com.tcs.Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
    String userName="rituraj";
    transient String pwd="katrina";
    transient int pin=1234;

    private void writeObject(ObjectOutputStream os) throws Exception {
        os.defaultWriteObject();

        String epwd="123"+pwd;
        os.writeObject(epwd);

        int epin=4321+pin;
        os.writeInt(epin);
    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
        is.defaultReadObject();
        String epwd= (String) is.readObject();
        pwd=epwd.substring(3);

        int epin=is.readInt();
        pin=epin-4321;
    }
}
