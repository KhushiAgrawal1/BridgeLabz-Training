import java.util.Scanner;

public class LineAndDistance {

    // Calculate Euclidean distance
    static double findDistance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
        );
    }

    // Calculate slope and y-intercept
    static double[] findLineEquation(double x1, double y1, double x2, double y2) {

        double m = (y2 - y1) / (x2 - x1); // slope
        double b = y1 - (m * x1);        // y-intercept

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        // Input the values
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        // Line Equation
        double[] line = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);

    }
}