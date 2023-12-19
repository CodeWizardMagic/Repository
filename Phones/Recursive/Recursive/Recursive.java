package Recursive;

import java.util.Scanner;

public class Recursive{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Recursion recursion = new Recursion();

        recursion.recursion(a, b);

    }
}

