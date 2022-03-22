package com.company.factoryMethodPattern;

/**
 *  Since we dont want to have an instantiation in CarStore Class. We will have and separate
 *  object Car which will take care of instantiation of appropriate object.
 *  This class is referred to as CarFactory
 *  Now suppose the CarFactory is famous and we want to extend this car factory to different region
 *  such as NewYorkCarFactory, ChicagoCarFactory
 *  In order to deal with that we will make this class as an abstract class which means class factory provides the class definition
 *  Implementation is delegated to subclass.
 */
public abstract class CarFactory {
    protected abstract Car getCar(String carMake, String carModel) ;
}


