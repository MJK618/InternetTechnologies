
import java.util.Scanner;

public class java_2 {
    public static void main(String[] args) {

        System.out.print("\n\tThis program will take"
                + "two arrays as inputs and will perform "
                + "Matrix { addition, multiplication,"
                + " transposition }.\n"
                + "Please enter desired input parameters "
                + "that would make all the operations "
                + "possible (addition and multiplication "
                + "- rows and columns values). \n");
        int row_1, col_1, row_2, col_2;
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter number of rows "
                + "for the first matrix: ");
        row_1 = s.nextInt();
        System.out.print("Enter number of columns "
                + "for the first matrix: ");
        col_1 = s.nextInt();
        System.out.print("\nEnter number of rows "
                + "for the second matrix: ");
        row_2 = s.nextInt();
        System.out.print("Enter number of columns "
                + "for the second matrix: ");
        col_2 = s.nextInt();
        if (row_1 == row_2 && col_1 == col_2) {
            int[][] first_array = new int[row_1][col_1];
            int[][] second_array = new int[row_2][col_2];
            int[][] sum = new int[row_2][col_2];
            int[][] prod = new int[row_2][col_2];
            int[][] trans1 = new int[row_1][col_1];
            int[][] trans2 = new int[row_2][col_2];

            System.out.println("\nEnter all the elements "
                    + "of first matrix row-wise: ");
            for (int i = 0; i < row_1; i++) {
                for (int j = 0; j < col_1; j++) {
                    first_array[i][j] = s.nextInt();
                }
            }
            System.out.println("\nEnter all the elements "
                    + "of second matrix row-wise: ");
            for (int i = 0; i < row_2; i++) {
                for (int j = 0; j < col_2; j++) {
                    second_array[i][j] = s.nextInt();
                }
            }
            System.out.print("\nFirst Matrix: \n");
            printMatrix(row_1, col_1, first_array);
            System.out.println("\nSecond Matrix: ");
            printMatrix(row_2, col_2, second_array);
            System.out.println("\nMatrix after addition: ");
            for (int i = 0; i < row_1; i++) {
                for (int j = 0; j < col_2; j++) {
                    for (int k = 0; k < col_1; k++) {
                        sum[i][j] = first_array[i][j]
                                  + second_array[i][j];
                    }
                }
            }
            printMatrix(row_2, col_2, sum);
            System.out.println("\nMatrix after" +
                    " Multiplication: ");
            // Check if multiplication is Possible
            if (row_2 != col_1) {
                System.out.println("\nMultiplication" +
                        " Not Possible");
            }
            // Multiply the two matrices
            for (int i = 0; i < row_1; i++) {
                for (int j = 0; j < col_2; j++) {
                    for (int k = 0; k < row_2; k++) {
                        prod[i][j] += first_array[i][k]
                                    * second_array[k][j];
                    }
                }
            }
            printMatrix(row_2, col_2, prod);
            System.out.println("\nFirst Matrix After" +
                    " Transpose: ");
            for (int i = 0; i < row_2; i++) {
                for (int j = 0; j < col_2; j++) {
                    trans1[i][j] = first_array[j][i];
                }
            }
            printMatrix(row_1, col_1, trans1);
            System.out.println("\nSecond Matrix" +
                    " After Transpose: ");
            for (int i = 0; i < row_2; i++) {
                for (int j = 0; j < col_2; j++) {
                    trans2[i][j] = second_array[j][i];
                }
            }
            printMatrix(row_1, col_1, trans2);
        } else {
            System.out.println("\nOperation would not "
                    + "be possible for the given input");
        }

    }
    private static void printMatrix(
            int rows,
            int cols,
            int[][] array_of_matrix) {
        StringBuilder str = new StringBuilder("[ ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                str.append(array_of_matrix[i][j]).append(" ");
            }

            System.out.println(str + "]");
            str = new StringBuilder("[ ");
        }
    }
}
