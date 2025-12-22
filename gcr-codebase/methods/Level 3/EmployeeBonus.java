// Program Name : Employee Bonus Calculator
// Description  : This program generates random employee data (salary and years of service),
//                calculates bonus based on years of service, computes new salary, and
//                displays a detailed report including totals.

public class EmployeeBonus {

    // Method to generate random employee data
    // Returns a 2D array where each row contains:
    // [0] = old salary (10,000 to 99,999)
    // [1] = years of service (1 to 10)
    public static int[][] getData(int numberOfEmployees){
        int[][] data = new int[numberOfEmployees][2];

        // Generate random salary and years for each employee
        for (int i = 0; i < numberOfEmployees; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // Salary
            data[i][1] = (int)(Math.random() * 10) + 1;        // Years of service
        }
        return data;
    }

    // Method to calculate salary details including bonus and new salary
    // Returns a 2D array where each row contains:
    // [0] = old salary, [1] = bonus, [2] = new salary
    public static double[][] getSalaryDetails(int[][] empData) {
        double[][] salaryData = new double[empData.length][3];

        for (int i = 0; i < empData.length; i++) {
            int oldSalary = empData[i][0];       // Original salary
            int years = empData[i][1];           // Years of service

            // Determine bonus rate: 5% if years > 5, otherwise 2%
            double bonusRate = (years > 5) ? 0.05 : 0.02;

            // Calculate new salary (old salary + bonus amount)
            double newSalary = oldSalary + (oldSalary * bonusRate);

            // Store values in salaryData array
            salaryData[i][0] = oldSalary;
            salaryData[i][1] = oldSalary * bonusRate; // bonus amount
            salaryData[i][2] = newSalary;
        }
        return salaryData;
    }

    // Method to display a formatted report of employee salaries and bonuses
    public static void displayReport(double[][] salaryDetails){
        double totalOld = 0;   // Total of old salaries
        double totalNew = 0;   // Total of new salaries
        double totalBonus = 0; // Total bonus amount

        // Print table header
        System.out.println("\nEmp\tOldSalary\tBonus\t\tNewSalary");

        // Print each employee's details and accumulate totals
        for (int i = 0; i < salaryDetails.length; i++) {
            System.out.printf("%d\t%.0f\t\t%.2f\t\t%.2f\n",
                              i+1, salaryDetails[i][0], salaryDetails[i][1], salaryDetails[i][2]);
            totalOld += salaryDetails[i][0];
            totalBonus += salaryDetails[i][1];
            totalNew += salaryDetails[i][2];
        }

        // Print totals
        System.out.println("\nTotal old salary: " + totalOld);
        System.out.println("Total bonus: " + totalBonus);
        System.out.println("Total new salary: " + totalNew);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int numberOfEmployees = 10;                  // Number of employees
        int[][] empData = getData(numberOfEmployees); // Generate employee data
        double[][] salaryDetails = getSalaryDetails(empData); // Calculate salaries and bonuses
        displayReport(salaryDetails);                // Display the report
    }
}
