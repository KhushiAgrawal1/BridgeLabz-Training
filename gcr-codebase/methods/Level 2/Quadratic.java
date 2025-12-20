// Program Name : Quadratic Equation Solver
// Description  : This program calculates and displays the real roots of a quadratic equation ax^2 + bx + c.


import java.util.Scanner;

// Program to find the roots of a quadratic equation ax^2 + bx + c
public class Quadratic {

    // Method to find roots of quadratic equation
    // Returns an array of roots
    // If delta < 0, returns empty array
    public static double[] findRoots(double a, double b, double c) {

        // Calculate delta using formula b^2 - 4ac
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive, two real roots
        if (delta > 0) {

            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            return new double[] {root1, root2};
        }

        // If delta is zero, only one real root
        if (delta == 0) {

            double root = -b / (2 * a);
            return new double[] {root};
        }

        // If delta is negative, no real roots
        return new double[0];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input values for a, b and c
        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();

        // Call method to find roots
        double[] roots = findRoots(a, b, c);

        // Display result based on number of roots
        if (roots.length == 2) {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Only one root: " + roots[0]);
        } else {
            System.out.println("No real roots exist");
        }
    }
}
