package org.example.Decorator;

public class AirBagFeature  extends CarDecorator{
    Car car;
    AirBagFeature(Car car){
         this.car = car;
    }

    @Override
    String getCarName() {
       return car.getCarName() + "with Air Bags";
    }

    @Override
    int getCarPrice() {
        return  car.getCarPrice() + 40;
    }
}
