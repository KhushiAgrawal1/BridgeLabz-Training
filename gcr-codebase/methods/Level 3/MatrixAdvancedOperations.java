import java.util.Scanner;

public class MatrixAdvancedOperations {

    // Function to create random matrix
    static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int)(Math.random() * 9) + 1; // 1 to 9

        return matrix;
    }

    // Function to transpose matrix
    static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                transpose[j][i] = matrix[i][j];

        return transpose;
    }

    // Function to determinant
    static int determinant2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Function to determinant
    static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Function to inverse using determinant
    static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        double[][] inv = new double[2][2];

        inv[0][0] =  m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] =  m[0][0] / (double)det;

        return inv;
    }

    // Function to inverse using adjoint and determinant
    static double[][] inverse3x3(int[][] m) {

        int det = determinant3x3(m);
        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double)det;
        inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / (double)det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double)det;

        inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / (double)det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double)det;
        inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / (double)det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double)det;
        inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / (double)det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double)det;

        return inv;
    }


    // Function to display matrix
    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row)
                System.out.print(value + "\t");
            System.out.println();
        }
    }

    // Overloaded display for double matrix
    static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row)
                System.out.printf("%.2f\t", value);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	// Enter the matrix size value
        System.out.print("Enter matrix size (2 or 3): ");
        int size = sc.nextInt();

        int[][] matrix = createRandomMatrix(size, size);

	// Display the results
        System.out.println("\nMatrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix));

        if (size == 2) {
            System.out.println("\nDeterminant: " + determinant2x2(matrix));
            System.out.println("\nInverse:");
            displayMatrix(inverse2x2(matrix));
        }

        if (size == 3) {
            System.out.println("\nDeterminant: " + determinant3x3(matrix));
            System.out.println("\nInverse:");
            displayMatrix(inverse3x3(matrix));
        }

    }
}