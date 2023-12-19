package Animal;

public class Veterinary{
    public String VetName;
    public String specalization;

    public Veterinary(String name, String specalization) {
        this.VetName = name;
        this.specalization = specalization;
    }
    public void treatAnimal(Animal a){
        System.out.println( a.name+ " eats " + a.food + " and love " + a.location + " location");
    }
}
