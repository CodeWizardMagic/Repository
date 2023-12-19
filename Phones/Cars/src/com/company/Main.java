package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicle.Car;
import com.company.vehicle.Sportcar;
import com.company.vehicle.Truck;

public class Main {
    public static void main(String[] args) {
        Driver Olzhas = new Driver("Olzhas Umarov",2);

        Engine BugattiEngine = new Engine(1500,"quad-Turbocompresor W16");
        Engine ToyotaEngine = new Engine(348,"V35A-FTS");

        Sportcar Chiron = new Sportcar("Bugatti","Sportcar",1995,420,Olzhas,BugattiEngine);
        Truck Tundra = new Truck("Toyota","Truck",2345,826,Olzhas,ToyotaEngine);

        Chiron.info();
        Tundra.info();

        Chiron.start();
        Chiron.turnLeft();
        Chiron.turnRight();
        Chiron.stop();
    }
}