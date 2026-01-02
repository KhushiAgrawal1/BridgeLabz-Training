package VehicleRentalApplication;

public class Bike extends Vehicle implements Rentable {

    public Bike(String number) {
        super(number, 200);
    }

    public double calculateRent(int days) {
        return baseRate * days;
    }
}
