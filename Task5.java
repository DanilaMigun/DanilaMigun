package HMW;

public class Task5 {
    public static boolean
    isLowerTriangularMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int rows = 3, columns = 3;


        if (rows == columns) {

            int Matrix[][]
                    = { { 1, 0, 0 }, { 2, 3, 0 }, { 5, 6, 7 } };
            System.out.println("Matrix is : ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(Matrix[i][j] + "\t");
                }
                System.out.println();
            }

            
            boolean result
                    = isLowerTriangularMatrix(Matrix);

            // returns true if matrix is lower triangular
            // matrix else false
            if (result == true) {
                System.out.println(
                        "Matrix is lower triangular matrix");
            }
            else {
                System.out.println(
                        "Matrix is not lower triangular matrix");
            }
        }
        else {
            System.out.println(
                    "Number of rows and number of columns should be equal");
        }
    }
}
}
