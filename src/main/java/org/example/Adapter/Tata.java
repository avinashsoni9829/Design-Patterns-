package org.example.Adapter;

public class Tata implements Car{
    @Override
    public void acclearate() {
        System.out.println("Acclearating the car!");
    }

    @Override
    public void applyBrake() {
        System.out.println("Applying Brakes in 1 second !");
    }
}
