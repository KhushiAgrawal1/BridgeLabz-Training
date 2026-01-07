package Vehicle_Rental_Application;

public class Car extends Vehicle implements Rentable {

    public Car(String number) {
        super(number, 800);
    }

    public double calculateRent(int days) {
        return (baseRate * days) + 500;
    }
}
