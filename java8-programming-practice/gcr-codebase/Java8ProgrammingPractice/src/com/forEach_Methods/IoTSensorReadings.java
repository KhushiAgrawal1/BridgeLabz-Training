package com.forEach_Methods;

import java.util.Arrays;
import java.util.List;

public class IoTSensorReadings {
	public static void main(String[] args) {
		List<Double> sensorReadings = Arrays.asList(22.5,30.2,18.9,35.6,28.4);
        double threshold = 25.0;
        sensorReadings.stream().filter(r -> r > threshold).forEach(r -> System.out.println(r));
	}

}
