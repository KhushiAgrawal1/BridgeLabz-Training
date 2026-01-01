import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;
        char stopChoice = 'n';

        while (stopChoice != 'y' && stopChoice != 'Y') {
            System.out.print("Enter distance of next stop (in km): ");
            int distance = sc.nextInt();
            totalDistance += distance;

            System.out.print("Do you want to get off at this stop? (y/n): ");
            stopChoice = sc.next().charAt(0);
        }

        System.out.println("Total distance travelled: " + totalDistance + " km");
        sc.close();
    }
}
