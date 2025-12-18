// Program to check whether given date falls in Spring Season
public class SpringSeason {

    public static void main(String[] args) {

        // Read month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check Spring Season condition
        boolean isSpring = (month == 3 && day >= 20) || month == 4 || month == 5 || (month == 6 && day <= 20);

        // Print result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
