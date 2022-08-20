package org.example.Adapter;

public class VehicleStore {
    public static void main(String[] args) {
          Tata nexa = new Tata();
          MotorCycle karizma = new Suzuki();

          System.out.println("NEXA CAR !");
          nexa.applyBrake();
          nexa.acclearate();


          System.out.println("KARIZMA MOTORCYCLE  [2 second]!");
          karizma.applyBrakes();

          // Passing the functionality of nexa to splendor through CarAdapter
          MotorCycle splendor = new CarAdapter(nexa);

          System.out.println("Splendor MOTORCYCLE  [1 second]!");
          splendor.applyBrakes();

    }

}
