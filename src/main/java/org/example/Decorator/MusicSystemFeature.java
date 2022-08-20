package org.example.Decorator;

public class MusicSystemFeature extends CarDecorator{

    Car car;

    MusicSystemFeature(Car car){
         this.car = car;
    }
    @Override
    String getCarName() {
       return car.getCarName() + "with Music System";
    }
    @Override
    int getCarPrice() {
        return car.getCarPrice() + 30;
    }

}
