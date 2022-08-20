package org.example.Decorator;

public class AUDI extends Car{
    AUDI(){
         carName = "AUDI";
         carColour= "BLACK";
    }

    @Override
     int getCarPrice() {
        return 200;
    }
}
