// Program Name : Collinear Points Checker
// Description  : This program checks whether three given points are collinear
//                using two different methods: the slope formula and the
//                triangle area formula.

import java.util.Scanner;

public class CollinearPoints
{
    // Method to check collinearity using the slope formula
    // If slopes between (x1,y1)-(x2,y2) and (x2,y2)-(x3,y3) are equal,
    // then the points are collinear
	public static boolean areCollinearUsingSlopeFormula(int x1, int y1, int x2, int y2, int x3, int y3)
	{
        // Cross-multiplication of slope formula to avoid division
	    return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }
	
    // Method to check collinearity using the triangle area formula
    // If the area of the triangle formed by the three points is zero,
    // then the points are collinear
	public static boolean areCollinearUsingTriangleFormula(int x1, int y1, int x2, int y2, int x3, int y3)
	{
        // Area of triangle using coordinate geometry formula
	    double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    
        // If area is zero, points lie on the same straight line
	    return area == 0;
	}

    // Main method
	public static void main(String[] args)
	{
        // Create Scanner object for user input
	    Scanner input = new Scanner(System.in);
		
        // Input first point coordinates
		System.out.println("Enter x1, y1:");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		
        // Input second point coordinates
		System.out.println("Enter x2, y2:");
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		
        // Input third point coordinates
		System.out.println("Enter x3, y3:");
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		
        // Check collinearity using slope formula
		boolean collinear1 = areCollinearUsingSlopeFormula(x1, y1, x2, y2, x3, y3);
		System.out.println("Collinear using Slope Formula : " + collinear1);
		
        // Check collinearity using triangle area formula
	    boolean collinear2 = areCollinearUsingTriangleFormula(x1, y1, x2, y2, x3, y3);
		System.out.println("Collinear using Triangle Formula : " + collinear2);
	}
}
