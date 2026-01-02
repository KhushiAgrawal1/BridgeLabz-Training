package VehicleRentalApplication;

public class Car extends Vehicle implements Rentable {

    public Car(String number) {
        super(number, 500);
    }

    public double calculateRent(int days) {
        return (baseRate * days) + 1000;
    }
}
