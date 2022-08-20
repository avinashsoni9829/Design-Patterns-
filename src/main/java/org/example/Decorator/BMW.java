package org.example.Decorator;

public class BMW  extends Car{

    public BMW(){
        carName = "BMW";
        carColour = "RED";

    }

    @Override
     int getCarPrice() {
        return 100;
    }
}
