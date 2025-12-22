import java.util.Scanner;

public class MatrixOperations {

    // Function to generate random matrix
    static int[][] createRandomMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // 0 to 9
            }
        }
        return matrix;
    }

    // Function to add matrices
    static int[][] addMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Function to subtract matrices
    static int[][] subtractMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Function to multiply matrices
    static int[][] multiplyMatrices(int[][] A, int[][] B) {

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Function to display matrix
    static void displayMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter rows and columns for Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns for Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        // Generate matrices
        int[][] A = createRandomMatrix(r1, c1);
        int[][] B = createRandomMatrix(r2, c2);

        System.out.println("\nMatrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        // Addition & Subtraction (only if dimensions match)
        if (r1 == r2 && c1 == c2) {

            System.out.println("\nAddition (A + B):");
            displayMatrix(addMatrices(A, B));

            System.out.println("\nSubtraction (A - B):");
            displayMatrix(subtractMatrices(A, B));
        } else {
            System.out.println("\nAddition & Subtraction not possible (dimension mismatch)");
        }

        // Multiplication (only if valid)
        if (c1 == r2) {

            System.out.println("\nMultiplication (A × B):");
            displayMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("\nMultiplication not possible (columns of A ≠ rows of B)");
        }

    }
}