package CabbyGo_Ride_Hailing_App;

public class RideService implements IRideService {

    private double fare;
    private static final double BASE_FARE = 50;
    private static final double RATE_PER_KM = 12;

    public void bookRide(double distance) {
        fare = BASE_FARE + distance * RATE_PER_KM;
        System.out.println("Ride booked. Estimated Fare: ₹" + fare);
    }

    public void endRide() {
        System.out.println("Ride ended. Total Fare: ₹" + fare);
    }
}

