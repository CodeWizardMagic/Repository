package Recursive;

import java.util.Scanner;

public class Recursion {
        public int a,b;
        public void recursion(int a, int b) {
            if (a <= b) {
                System.out.println(a);
                if (a != b) {
                    recursion(a + 1, b);
                }
            } else {
                System.out.println(a);
                recursion(a - 1, b);
            }
        }
}
