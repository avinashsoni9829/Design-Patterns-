package org.example.singleton;

import java.io.Serializable;
import java.util.Objects;

public class CompleteSingleton implements Cloneable , Serializable {
    //volatile static object
    private volatile static CompleteSingleton object;
    // private Constructor throwing IllegalStateException
    private CompleteSingleton(){
         if(Objects.nonNull(object)){
              throw new IllegalStateException("object already created!");
         }
    }
   // Synchronized Function for Getting Object
    private static CompleteSingleton getInstance(){
         if(Objects.isNull(object)){
              synchronized (CompleteSingleton.class){
                   if(Objects.isNull(object)){
                        object = new CompleteSingleton();
                   }
              }
         }
         return object;
    }
    // readResolve() method to avoid object creation during Serialization / De Serialization
    protected Object readResolve(){
        return  object;
    }

   // throwing CloneNotSupportedException so that cloning is not supported
    protected Object clone() throws CloneNotSupportedException{
        throw  new CloneNotSupportedException();
    }

}
