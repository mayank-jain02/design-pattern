package com.company.factoryObject;

/**
 *  Since we dont want to have an instantiation in CarStore Class. We will have and separate
 *  object Car which will take care of instantiation of appropriate object.
 *  This class is referred to as CarFactory
 */
public class CarFactory {
    public Car getCar(String carMake, String carModel) {
        if (carMake.equals("Honda") && carModel.equals("Accord")) {
            return new HondaCar();
        } else if (carMake.equals("Toyota") && carModel.equals("Camry")) {
            return new ToyotaCar();
        } else {
            return null;
        }
    }
}


