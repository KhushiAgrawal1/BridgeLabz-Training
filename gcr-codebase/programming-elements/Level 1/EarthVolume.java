// Program to calculate volume of the Earth
public class EarthVolume
{
    public static void main(String args[])
    {
        // Radius of earth in kilometers
        double radiusKm = 6378;

        // Value of pi
        double pi = 3.14;

        // Calculate volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        // Convert volume to cubic miles
        double volumeMiles = volumeKm / (1.6 * 1.6 * 1.6);

        // Display result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +" and cubic miles is " + volumeMiles);
    }
}
