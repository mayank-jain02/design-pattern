package com.company.factoryObject;

/**
 * Implementation Class for Honda Car
 */
public class HondaCar extends Car{
    @Override
    public void getMileagePerGallon() {
        System.out.println("Up to 30 city / 38 highway");
    }

    @Override
    public void isSunRoofIncluded() {
        System.out.println("Yes");;
    }

    @Override
    public void getEngineDetails() {
        System.out.println("1.5 L 4-cylinder, 2.0 L 4-cylinder");
    }
}
