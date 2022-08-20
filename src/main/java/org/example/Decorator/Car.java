package org.example.Decorator;

public abstract class Car {
    String carName;
    String carColour;
     String getCarName(){
         return carName;
    }

     String getCarColour(){
         return  carColour;
    }

    // to be implemented later on so made abstract
     abstract int getCarPrice();



}
