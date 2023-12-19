package Animal;

import Animal.Animal;

public class Horse extends Animal {
    boolean isHaveHealthProblem;
    public Horse(String name,boolean isHaveHealthProblem, String food, String location) {
        super(name, food, location);
        this.isHaveHealthProblem = isHaveHealthProblem;
    }
    public void setHaveHealthProblem(){
        if(isHaveHealthProblem) System.out.println(name + " have health problem");
        else System.out.println(name + " is healthy");
    }
    @Override
    public void makeNoise(){
        System.out.println(name + " make noises: Clip-Clop");
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
