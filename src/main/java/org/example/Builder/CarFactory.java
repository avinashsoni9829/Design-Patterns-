package org.example.Builder;

public class CarFactory {
    public static void main(String[] args) {
        // in Car 1 we want to have 2 Seatbelts  ,  4 lights , 4 wheels , musicSystem , 0  airbags
        Car car1 = new Car.CarBuilder().seatBelts(2).lights(4).wheels(4).musicSystem(true).build();
        System.out.println("Car1 Details" + car1);

        Car car2 = new Car.CarBuilder().lights(10).airBags(5).build();

        System.out.println("Car2 Details" + car2);

    }
}
