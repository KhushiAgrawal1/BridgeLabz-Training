package lambda_expressions.Notification_Filtering;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("Heart rate abnormal", "EMERGENCY"),
            new Alert("Take medicine at 8 PM", "MEDICINE"),
            new Alert("Health tips for today", "GENERAL")
        );

        // User preference: show only EMERGENCY alerts
        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equals("EMERGENCY");

        System.out.println("Filtered Alerts:");
        alerts.stream()
              .filter(emergencyOnly)
              .forEach(System.out::println);
    }
}

