package Vehicle_Rental_Application;

public class Bike extends Vehicle implements Rentable {

    public Bike(String number) {
        super(number, 300);
    }

    public double calculateRent(int days) {
        return baseRate * days;
    }
}
