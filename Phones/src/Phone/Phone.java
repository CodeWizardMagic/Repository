package Phone;
public class Phone {
    public String number;
    public String model;
    public double weight;
    public Phone(){

    }
    public Phone(String number,String model){
        this.number = number;
        this.model = model;
    }
    public Phone(String model, String number, double weight) {
        this(number, model);
    }
    public static void receiveCall(String name){
        System.out.println(name + " is ringing");
    }
    public String getNumber(){
        return number;
    }
    public static void receiveCall(String name,String number){
        System.out.println(name + " is calling from phone number " + number);
    }
    public static void sendMessage(String... phoneNumbers) {
        System.out.println("Send message to the following phone numbers: ");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

}