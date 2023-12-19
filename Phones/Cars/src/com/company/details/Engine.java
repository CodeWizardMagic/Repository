package com.company.details;

public class Engine {
    public double power;
    public String manufacturer;
    public Engine(double power,String manufacturer){
        this.power = power;
        this.manufacturer = manufacturer;
    }
    public void getinfo(){
        System.out.println("Engine power: " + power + "hp Manufacturer: " + manufacturer);
    }
}
