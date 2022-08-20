package org.example.factory;

public class CarFactory {
    public CarFeatures buyCarService(String company){
         switch (company){
             case "TATA" : return  new TATA();
             case "BMW"  : return new BMW();
             case "AUDI" : return new AUDI();
             default: return null;
         }
    }
}
