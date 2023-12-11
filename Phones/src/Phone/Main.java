package Phone;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            Phone Iphone = new Phone("XS", "123-345",177.2);
            Phone Samsung = new Phone("S23","234-765",168.3);
            Phone Xiaomi = new Phone("14","230-432", 177.1);

            System.out.println("Number: " + Iphone.number + " Model: " + Iphone.model + " Weight: " + Iphone.weight);
            System.out.println("Number: " + Samsung.number + " Model: " + Samsung.model + " Weight: " + Samsung.weight);
            System.out.println("Number: " + Xiaomi.number + " Model: " + Xiaomi.model + " Weight: " + Xiaomi.weight);

            Phone.receiveCall("John");

            Phone.receiveCall("John", "123-435");

            System.out.println(Iphone.getNumber());

            Phone.sendMessage("123-232","12323-32");


    }
}