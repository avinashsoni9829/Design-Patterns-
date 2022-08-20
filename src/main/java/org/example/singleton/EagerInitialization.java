package org.example.singleton;

public class EagerInitialization {
    // Eager Initialization :
    private  static EagerInitialization object = new EagerInitialization();

    private  EagerInitialization(){};

    public static EagerInitialization getInstance(){
         return  object;
    }
}
