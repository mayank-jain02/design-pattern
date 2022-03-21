package com.company.factoryObject;

/**
 * Welcome to CarStore. The CarStore has only single to display different cars ranging from Honda, Toyota, Lexus, etc.
 */
public class CarStore {

    private CarFactory carFactory;

    public CarStore(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public void getCarDetail(String carMake, String carModel) {
        Car car = carFactory.getCar(carMake, carModel);
        if (car != null) {
            car.getEngineDetails();
            car.getMileagePerGallon();
            car.isSunRoofIncluded();
        } else
            System.out.println("No Information Available");
    }
}
