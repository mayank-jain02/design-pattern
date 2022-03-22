package com.company.factoryMethodPattern;

public class NewYorkCarFactory extends CarFactory{
    @Override
    protected Car getCar(String carMake, String carModel) {
        if (carMake.equals("Honda") && carModel.equals("Accord")) {
            return new HondaCar();
        } else if (carMake.equals("Toyota") && carModel.equals("Camry")) {
            return new ToyotaCar();
        } else {
            return null;
        }
    }
}
