package org.example.Builder;

public class Car {
    private final int wheels;
    private final int seatBelts;
    private final int lights;
    private final Boolean musicSystem;
    private final int airBags;



    public static class CarBuilder{
        // Final is not used here as using final will ensure
        // that a constructor needs to be created for the attribute

        private  int wheels;
        private  int seatBelts;
        private  int lights;
        private  Boolean musicSystem;
        private  int airBags;


        public CarBuilder wheels(int size){
            this.wheels = size;
            return this;
        }

        public CarBuilder seatBelts(int size){
            this.seatBelts = size;
            return this;
        }

        public CarBuilder lights(int size){
            this.lights = size;
            return this;
        }

        public CarBuilder musicSystem(Boolean isEnabled){
            this.musicSystem = isEnabled;
            return this;
        }

        public CarBuilder airBags(int size){
             this.airBags = size;
             return  this;
        }


        public Car build(){
             return  new Car(this);
        }

    }



    private Car(CarBuilder carBuilder){
         this.wheels = carBuilder.wheels;
         this.seatBelts = carBuilder.seatBelts;
         this.lights = carBuilder.lights;
         this.musicSystem = carBuilder.musicSystem;
         this.airBags = carBuilder.airBags;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", seatBelts=" + seatBelts +
                ", lights=" + lights +
                ", musicSystem=" + musicSystem +
                ", airBags=" + airBags +
                '}';
    }
}
