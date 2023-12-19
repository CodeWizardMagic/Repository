package Matrix;

public class Matrix {
    public double[][] matrix;
    public static int rows;
    public static int columns;
    public Matrix(int rows,int columns){
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }
    public Matrix multiple(int a){
       Matrix res = new Matrix(rows,columns);
       for(int i = 0;i < rows;i++){
           for(int j = 0;j < columns;j++){
               res.matrix[i][j] = matrix[i][j] * a;
           }
       }
    return res;
    }
    public static void add(Matrix a, Matrix b){
        Matrix res = new Matrix(rows,columns);
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < columns;j++){
                res.matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];
                System.out.print(res.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void minus(Matrix a, Matrix b){
        Matrix res = new Matrix(rows,columns);
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < columns;j++){
                res.matrix[i][j] = a.matrix[i][j] - b.matrix[i][j];
                System.out.print(res.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void coutMatrix(Matrix a){
        for(int i = 0;i < a.rows;i++){
            for(int j = 0;j < a.columns;j++){
                System.out.print(a.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
