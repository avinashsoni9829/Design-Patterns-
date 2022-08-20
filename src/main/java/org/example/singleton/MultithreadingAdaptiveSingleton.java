package org.example.singleton;

import java.util.Objects;

public class MultithreadingAdaptiveSingleton {
    // volatile keyword -> as we want to update the value for all the threads
    private volatile static MultithreadingAdaptiveSingleton object;
    // private constructor
    private MultithreadingAdaptiveSingleton(){};

    public static MultithreadingAdaptiveSingleton getInstance(){
        // we will synchronize the function only when it is null so that even for resource
        // intensive application it works
        if(Objects.isNull(object)){
              synchronized (MultithreadingAdaptiveSingleton.class){
                   if(Objects.isNull(object)){
                        object = new MultithreadingAdaptiveSingleton();
                   }
              }
         }

         return object;
    }
}
