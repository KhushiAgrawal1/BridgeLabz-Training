// Program to calculate employee bonus based on years of service
import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Read salary
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // Read years of service
        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        // Check bonus eligibility
        if (years > 5) {
            System.out.println("Bonus amount = " + (salary * 0.05));
        } else {
            System.out.println("No bonus");
        }

        // Close Scanner
        input.close();
    }
}
