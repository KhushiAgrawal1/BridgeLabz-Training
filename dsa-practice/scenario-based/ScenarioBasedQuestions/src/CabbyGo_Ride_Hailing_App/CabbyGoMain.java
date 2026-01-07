package CabbyGo_Ride_Hailing_App;

public class CabbyGoMain {
    public static void main(String[] args) {

        Vehicle v = new Sedan("MP09XY1234");   // Polymorphism
        Driver d = new Driver("Amit", "DL12345", 4.8);

        IRideService ride = new RideService();

        v.displayVehicle();
        System.out.println("Driver: " + d.getName());

        ride.bookRide(10);
        ride.endRide();
    }
}

