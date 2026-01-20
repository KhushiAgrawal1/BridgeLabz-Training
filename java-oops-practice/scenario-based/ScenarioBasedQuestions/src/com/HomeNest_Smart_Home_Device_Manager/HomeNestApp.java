package HomeNest_Smart_Home_Device_Manager;
import java.util.Scanner;

public class HomeNestApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Device:");
        System.out.println("1. Light");
        System.out.println("2. Camera");
        System.out.println("3. Thermostat");
        System.out.println("4. Lock");
        int choice = sc.nextInt();

        System.out.print("Enter Device ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Energy Usage per hour: ");
        double energy = sc.nextDouble();

        Device device;

        switch (choice) {
            case 1 -> device = new Light(id, energy);
            case 2 -> device = new Camera(id, energy);
            case 3 -> device = new Thermostat(id, energy);
            default -> device = new Lock(id, energy);
        }

        device.turnOn();

        System.out.print("Enter usage hours: ");
        int hours = sc.nextInt();

        System.out.println("Energy Consumed = " + device.calculateEnergy(hours));

        device.reset();
        device.turnOff();

        device.showFirmwareLog();

        sc.close();
    }
}
