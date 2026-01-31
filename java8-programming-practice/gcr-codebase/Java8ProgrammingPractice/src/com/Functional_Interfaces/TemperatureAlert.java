package com.Functional_Interfaces;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        double threshold = 38.0;

        // Predicate to check high temperature
        Predicate<Double> highTemp =
                temp -> temp > threshold;

        double currentTemp = 39.5;

        if (highTemp.test(currentTemp)) {
            System.out.println("⚠️ Alert! High Temperature: " + currentTemp);
        } else {
            System.out.println("Temperature Normal");
        }
    }
}

