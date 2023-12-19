package Animal;

import Animal.Animal;

public class Cat extends Animal {
    public String color;
    public Cat(String name,String color, String food, String location) {
        super(name, food, location);
        this.color = color;
    }
    public void color(){
        System.out.println(name + " is " + color);
    }
    @Override
    public void makeNoise(){
        System.out.println(name + " make noises: Meow-Meow");
    }
    @Override
    public void eat(){
        System.out.println(name + " eats " + food);
    }
    @Override
    public void sleep(){
        System.out.println(name + " is sleeping right now");
    }

}
