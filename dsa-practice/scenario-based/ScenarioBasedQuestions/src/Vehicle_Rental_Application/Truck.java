package Vehicle_Rental_Application;

public class Truck extends Vehicle implements Rentable {

    public Truck(String number) {
        super(number, 1200);
    }

    public double calculateRent(int days) {
        return (baseRate * days) + 1000;
    }
}
