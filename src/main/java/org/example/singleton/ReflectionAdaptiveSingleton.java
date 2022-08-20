package org.example.singleton;

import java.util.Objects;

public class ReflectionAdaptiveSingleton {
    private volatile  static ReflectionAdaptiveSingleton object;
    private ReflectionAdaptiveSingleton(){
         if(Objects.nonNull(object)){
              throw new IllegalStateException("class object is already created!");
         }

    }

    private static ReflectionAdaptiveSingleton getInstance(){
        if(Objects.isNull(object)){
            synchronized (SearlizableAdaptiveSingleton.class){
                if(Objects.isNull(object)){
                    object = new ReflectionAdaptiveSingleton();
                }
            }
        }
        return object;
    }
}
