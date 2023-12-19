package Matrix;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class MatrixMain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Matrix:
        System.out.println("Write down: your first matrix: ");
        try {
            Matrix matrix = new Matrix(3, 3);
            for (int i = 0; i < matrix.rows; i++) {
                for (int j = 0; j < matrix.columns; j++) {
                    matrix.matrix[i][j] = scan.nextDouble();
                }
            }
            System.out.println("Write down your second matrix: ");
            Matrix matrix2 = new Matrix(3, 3);
            for (int i = 0; i < matrix2.rows; i++) {
                for (int j = 0; j < matrix2.columns; j++) {
                    matrix2.matrix[i][j] = scan.nextDouble();
                }
            }
            System.out.println("Write operation: +  or - ");
            char a = scan.next().charAt(0);

            if(Objects.equals(a,'+'))Matrix.add(matrix,matrix2);
            else if(Objects.equals(a,'-'))Matrix.minus(matrix,matrix2);
        }catch (InputMismatchException e){
            System.out.println("Write integers!");
        }


    }
}
