import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalFine = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);

            System.out.print("Enter Due Date (day number): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter Return Date (day number): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * 5;
                totalFine += fine;

                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine for this book: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }

        System.out.println("\n-------------------------");
        System.out.println("Total Fine for 5 books: ₹" + totalFine);

        sc.close();
    }
}
