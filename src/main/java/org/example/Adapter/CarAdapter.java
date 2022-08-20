package org.example.Adapter;

public class CarAdapter  implements MotorCycle{
    Car car;

    public CarAdapter(Car car){
        this.car = car;

    }


    @Override
    public void applyBrakes() {
       car.applyBrake();
    }
}
