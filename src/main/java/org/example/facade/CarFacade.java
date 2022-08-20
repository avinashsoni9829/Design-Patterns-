package org.example.facade;

public class CarFacade {
    private  Car bmw;
    private  Car audi;
    private  Car tata;

    public  CarFacade(){
         bmw = new Bmw();
         audi = new Audi();
         tata = new Tata();
    }

    public void runBmw(){
         bmw.run();
    }

    public void runAudi(){
         audi.run();
    }
    public void runTata(){
         tata.run();
    }
}
