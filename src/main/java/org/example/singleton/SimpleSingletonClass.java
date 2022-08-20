package org.example.singleton;

import java.util.Objects;

// Lazy Initialization
public class SimpleSingletonClass
{
   // static -> as memory is assigned only once for this object
   private  static  SimpleSingletonClass object;
   // creating private constructor -> so doesn't allow any other instantiation by any other class
   private SimpleSingletonClass(){};

   public static SimpleSingletonClass getInstance(){
      // if the object is null then initialize the object
      if(Objects.isNull(object)){
          object = new SimpleSingletonClass();
       }
       return  object;
   }

}
