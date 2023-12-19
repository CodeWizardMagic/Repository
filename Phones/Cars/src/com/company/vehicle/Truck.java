package com.company.vehicle;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Truck extends Car{
    public double CapacityOfTheBody;
    public Truck(String carBrand, String carClass, double weight,double capacityOfTheBody, Driver driver, Engine engine) {
        super(carBrand, carClass, weight, driver, engine);
        this.CapacityOfTheBody = capacityOfTheBody;
    }
}
