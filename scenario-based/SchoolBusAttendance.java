import java.util.Scanner;

public class SchoolBusAttendance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student names
        String[] students = {
            "Aman", "Riya", "Karan", "Neha", "Rahul",
            "Pooja", "Vikas", "Anjali", "Rohit", "Sneha"
        };

        int presentCount = 0;
        int absentCount = 0;

        // for-each loop
        for (String name : students) {
            System.out.print(name + " (Present/Absent): ");
            String status = sc.next();

            if (status.equalsIgnoreCase("Present")) {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        // Result
        System.out.println("\nTotal Present: " + presentCount);
        System.out.println("Total Absent: " + absentCount);

        sc.close();
    }
}
