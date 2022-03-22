package com.company.factoryMethodPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    /**
     *  Story: It's been a long time since you plan to get yourself a car.
     *  Today, you decided to visit a car store to look for different types of vehicles.
     *  In CarStore you will select a Car and Car store with provide brief description about it.
     *  Follow the below process for implementation of Factory Object.
     *
     * @param args
     */
    public static void main(String[] args) {

        CarFactory carFactory = new NewYorkCarFactory();
        CarStore carStore = new CarStore(carFactory);
        Map<String, String> carsAvailable = carsAvailable();
        System.out.println("Please select car Model(Accord, Toyota) from the below list");
        Scanner scan = new Scanner(System.in);
        carsAvailable.forEach((key, value) -> System.out.println(key + " " + value));

        while(scan.hasNext()) {
            String input = scan.nextLine();
            carStore.getCarDetail(carsAvailable.get(input), input );
            carsAvailable.forEach((key, value) -> System.out.println(key + " " + value));
        }
    }

    private static Map<String, String> carsAvailable(){
        Map<String, String> carAvailable = new HashMap<>();
        carAvailable.put("Accord", "Honda");
        carAvailable.put("Camry", "Toyota");
        return carAvailable;
    }
}