package com.company.factoryObject;

/**
 * Referring to encapsulation and generalization principle, we will create an abstract class Car.
 * All different type of car will extend the abstract class and have their own implementation
 */
public abstract class Car {

    public abstract void getMileagePerGallon();

    public abstract void isSunRoofIncluded();

    public abstract void getEngineDetails();
}
