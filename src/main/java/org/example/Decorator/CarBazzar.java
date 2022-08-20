package org.example.Decorator;

public class CarBazzar {
    public static void main(String[] args) {
        Car car = new BMW();
        System.out.println("Car name = " + car.getCarName());
        System.out.println("Car price = " + car.getCarPrice());

        // now let's add the car with Music System Feature

        System.out.println("Adding Music System With Car ");

        car = new MusicSystemFeature(car);

        System.out.println("Car name = " + car.getCarName());
        System.out.println("Car price = " + car.getCarPrice());


        // let's add air bag to our class as well
        System.out.println("Adding Air Bag  With Car ");
        car = new AirBagFeature(car);

        System.out.println("Car name = " + car.getCarName());
        System.out.println("Car price = " + car.getCarPrice());
    }
}
