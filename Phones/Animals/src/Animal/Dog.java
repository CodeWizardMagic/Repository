package Animal;

import Animal.Animal;

public class Dog extends Animal {
public String Noise;
    public boolean isHaveCertificate;
    public Dog(String name,String food, String location,String Noise,boolean isHaveCertificate) {
        super(name,food, location);
        this.Noise = Noise;
        this.isHaveCertificate = isHaveCertificate;
    }
    public void Certificate(){
        if(isHaveCertificate) System.out.println(name + " have a certificate");
        else System.out.println(name + " Doesn't have a certificate");
    }
    @Override
    public void makeNoise(){
        System.out.println(name + " make noises: " + Noise);
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
