import java.util.*;

class Line {
    private double x1, y1, x2, y2;

    // Constructor
    Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate length
    double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of Line 1:");
        Line l1 = new Line(sc.nextDouble(), sc.nextDouble(),
                           sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter coordinates of Line 2:");
        Line l2 = new Line(sc.nextDouble(), sc.nextDouble(),
                           sc.nextDouble(), sc.nextDouble());

        double len1 = l1.calculateLength();
        double len2 = l2.calculateLength();

        if (len1 == len2)
            System.out.println("Both lines are equal in length.");
        else if (len1 > len2)
            System.out.println("Line 1 is longer.");
        else
            System.out.println("Line 2 is longer.");
    }
}

