// Program to calculate employee bonus based on years of service
import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        // Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        // Check bonus condition
        if (years > 5) {
            System.out.println("Bonus amount = " + (salary * 0.05));
        } else {
            System.out.println("No bonus applicable");
        }

        // Close Scanner
        input.close();
    }
}
