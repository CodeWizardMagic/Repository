package Students;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class mainStudents {
    static ArrayList<Float> marks = new ArrayList<>(2);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student Olzhas = new Student("Olzhas", "Umarov", "SE-2333");
        Aspirant Someone = new Aspirant("Someone", "Someone", "ADM-2312", "Research");


        System.out.println("Are you Aspirant or Student: ");
        String a = scanner.nextLine();
        System.out.println("Write down your name: ");
        String b = scanner.nextLine();
        System.out.println("Write down your last name: ");
        String c = scanner.nextLine();
        System.out.println("Write down your group: ");
        String d = scanner.nextLine();
        Aspirant aspirant = null;
        if (Objects.equals(a, "Aspirant")) {
            System.out.println("Your scientific works? ");
            String e = scanner.nextLine();
            aspirant = new Aspirant(b, c, d, e);
        }
        Student student = null;
        if (Objects.equals(a, "Student")) {
            student = new Student(b, c, d);
        }

        System.out.println("Write down your grades: ");
        System.out.println("Calculus: ");
        marks.add(scanner.nextFloat());
        System.out.println("Liner algebra: ");
        marks.add(scanner.nextFloat());
        System.out.println("OOP: ");
        marks.add(scanner.nextFloat());
        System.out.println("Python: ");
        marks.add(scanner.nextFloat());
        try{
        System.out.println("Your scholarship: " + aspirant.getScholarship(aspirant.getAverageMark(marks)));
        }
        catch(NullPointerException e){
        System.out.println("Your scholarship: " + student.getScholarship(student.getAverageMark(marks)));
        }
    }
}

