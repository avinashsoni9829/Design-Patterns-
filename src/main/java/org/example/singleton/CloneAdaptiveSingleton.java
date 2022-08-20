package org.example.singleton;

import java.util.Objects;

public class CloneAdaptiveSingleton  implements Cloneable{
  private volatile  static CloneAdaptiveSingleton object;

  private CloneAdaptiveSingleton(){};

  private static CloneAdaptiveSingleton getInstance(){
    if(Objects.isNull(object)){
      synchronized (SearlizableAdaptiveSingleton.class){
        if(Objects.isNull(object)){
          object = new CloneAdaptiveSingleton();
        }
      }
    }
    return object;
  }

  protected Object clone() throws CloneNotSupportedException{
     throw  new CloneNotSupportedException();
  }
}
