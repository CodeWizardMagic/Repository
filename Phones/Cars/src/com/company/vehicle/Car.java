package com.company.vehicle;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    public String CarBrand;
    public String CarClass;
    public double Weight;
    Driver driver;
    Engine engine;

    public Car(String carBrand,String carClass,double weight,Driver driver,Engine engine){
        this.CarBrand = carBrand;
        this.CarClass = carClass;
        this.Weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    public void start(){
        System.out.println("Let's go");
    }
    public void stop(){
        System.out.println("Let's stop");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }
    public void turnLeft(){
        System.out.println("Turn left");
    }
    public void info(){
        System.out.println("Brand: "+ CarBrand + " class: "+ CarClass + " Weight: " + Weight + "kg");
        driver.getinfo();
        engine.getinfo();
        System.out.println();
    }
}
