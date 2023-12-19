package Person;

public class personmain {
    public static void main(String[] args){
        Person Ansar = new Person();
        Person Olzhas = new Person("Umarov Olzhas", 17);
        Ansar.talk();
        Olzhas.talk();
        Olzhas.move();
    }
}
