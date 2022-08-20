package org.example.singleton;

import java.io.Serializable;
import java.util.Objects;

public class SearlizableAdaptiveSingleton  implements Serializable {
    private volatile  static SearlizableAdaptiveSingleton object;

    private  SearlizableAdaptiveSingleton(){};

    private static SearlizableAdaptiveSingleton getInstance(){
         if(Objects.isNull(object)){
              synchronized (SearlizableAdaptiveSingleton.class){
                   if(Objects.isNull(object)){
                        object = new SearlizableAdaptiveSingleton();
                   }
              }
         }

         return object;
    }


    protected Object readResolve(){
         return  object;
    }

}
