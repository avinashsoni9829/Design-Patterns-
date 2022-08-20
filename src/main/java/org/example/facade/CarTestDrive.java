package org.example.facade;

public class CarTestDrive {
    public static void main(String[] args) {
        CarFacade carMenu = new CarFacade();

        carMenu.runBmw();
        carMenu.runAudi();
        carMenu.runTata();

    }
}
