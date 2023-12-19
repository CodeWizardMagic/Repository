package Animal;

import Animal.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        Dog Charlie = new Dog("Charlie","Meat","park","Woof-woof",true);
        Cat Jessie = new Cat("Jessie","Black","Whiskas","home");
        Horse Muhtar = new Horse("Muhtar",false,"Apple","hippodrom");
        Animal[] animals = {Charlie,Jessie,Muhtar};
        animals[0].makeNoise();
        Charlie.Certificate();
        Muhtar.setHaveHealthProblem();
        animals[1].eat();

        Veterinary[] veterinary = new Veterinary[3];
        veterinary[0] = new Veterinary("John","Diagnostic");
        veterinary[1] = new Veterinary("Slaem","Diagnostic");
        veterinary[2] = new Veterinary("Noews","Diagnostic");
        for(int i = 0;i < 3;i++){
            veterinary[i].treatAnimal(animals[i]);
        }

    }
}