package com.tcs.Serialization;

import java.io.Serializable;

class Dog implements Serializable {
  // transient int j=20;
  //  transient static int j = 20;
 /* transient final int j = 20;
  int i = 10;*/

  Cat cat=new Cat();
}
