package com.company.professions;

import com.company.Person;

public class Driver extends Person {
    public String fullName;
    public int DrivingExperience;

    public Driver(String fullName, int drivingExperience){
        this.fullName = fullName;
        this.DrivingExperience = drivingExperience;
    }
    public void getinfo(){
        System.out.println("Driver: " + fullName + " driving experience " + DrivingExperience  + " age");
    }

}
