package com.company.vehicle;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Sportcar extends Car{
    public double TopSpeed;
    public Sportcar(String carBrand, String carClass, double weight,double topSpeed, Driver driver, Engine engine) {
        super(carBrand, carClass, weight, driver, engine);
        this.TopSpeed = topSpeed;
    }
}
