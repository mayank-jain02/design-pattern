package com.company.factoryObject;

/**
 * Implementation Car for toyota car.
 */
public class ToyotaCar extends Car{
    @Override
    public void getMileagePerGallon() {
        System.out.println("Up to 28 city / 39 highway");
    }

    @Override
    public void isSunRoofIncluded() {
        System.out.println("Yes");
    }

    @Override
    public void getEngineDetails() {
        System.out.println("2.5 L 4-cylinder, 3.5 L V6");
    }
}
