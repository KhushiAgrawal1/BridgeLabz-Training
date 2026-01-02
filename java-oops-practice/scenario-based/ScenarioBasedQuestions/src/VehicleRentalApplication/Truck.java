package VehicleRentalApplication;

public class Truck extends Vehicle implements Rentable {

    public Truck(String number) {
        super(number, 800);
    }

    public double calculateRent(int days) {
        return (baseRate * days) + 3000;
    }
}

