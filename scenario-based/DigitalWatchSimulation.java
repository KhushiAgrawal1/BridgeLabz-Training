public class DigitalWatchSimulation {

    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {          // Hours loop
            for (int minute = 0; minute < 60; minute++) { // Minutes loop

                System.out.printf("%02d:%02d\n", hour, minute);

                // Simulate power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("⚠️ Power Cut! Watch stopped.");
                    break;
                }
            }

            // Break outer loop also when power cut happens
            if (hour == 13) {
                break;
            }
        }
    }
}
