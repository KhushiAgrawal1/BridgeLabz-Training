// Program Name : Employee Bonus Program
// Description  : Calculates bonus, new salary, and total salary details of employees
//                based on their years of service

import java.util.Scanner; // Import Scanner class for user input

public class EmployeeBonus
{
    public static void main (String[] args)
    {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Arrays to store salary, service years, bonus, and new salary
        double[] salary = new double[10];
        double[] service = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        
        // Variables to store total values
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        // Loop to take input for 10 employees
        for (int i = 0; i < 10; i++)
        {
            // Input salary of employee
            System.out.println("Enter salary of employee: " + (i + 1));
            salary[i] = input.nextDouble();
            
            // Input years of service
            System.out.println("Enter years of service of employee: " + (i + 1));
            service[i] = input.nextDouble();
            
            // Validate input (salary must be positive and service cannot be negative)
            if (salary[i] <= 0 || service[i] < 0)
            {
                System.out.println("Invalid input, please enter again");
                i--; // Repeat input for the same employee
            }	
        }
        
        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++)
        {
            // Employees with more than 5 years get 5% bonus
            if (service[i] > 5)
            {
                bonus[i] = salary[i] * 0.05;				
            }
            // Others get 2% bonus
            else
            {
                bonus[i] = salary[i] * 0.02;		
            }
            
            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Add values to totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        
        // Display total results
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}
